package com.curso.projectweb.controller;

import com.curso.projectweb.dto.*;
import com.curso.projectweb.exception.ResourceNotFoundException;
import com.curso.projectweb.model.userModel;
import com.curso.projectweb.repository.AuthRegisterRepository;
import com.curso.projectweb.repository.UserRepository;
import com.curso.projectweb.service.ActivateAccountService;
import com.curso.projectweb.service.JwtUtilService;
import com.curso.projectweb.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

// @Controller indica que esta clase maneja peticiones HTTP
// En APIs REST normalmente se usa @RestController
@RestController
// Ruta base del controlador
@RequestMapping("/api/v1/auth")
public class AuthController {
    // Manager que ejecuta el proceso de autenticacion
    @Autowired
    private AuthenticationManager authenticationManager;

    //Servicio que carga usuaris desde la BD
    @Autowired
    private UserDetailsService userDetailsService;

    //Servicio que genera y valida JWT
    @Autowired private JwtUtilService jwtUtilService;

    //Repositorio para consultar datos del usuario
    @Autowired
    private UserRepository userRepository;


    @Autowired
    private RegisterService registerService;

    @Autowired
    private ActivateAccountService activateAccountService;

    @Autowired
    private AuthRegisterRepository authRegisterRepository;

    // ==========================
    // LOGIN
    // ==========================
    @PostMapping("/login")
    public ResponseEntity<?> auth(@RequestBody AuthRequestDto authRequestDto){
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequestDto.getEmail(), authRequestDto.getPassword()));

            UserDetails userDetails = userDetailsService.loadUserByUsername(authRequestDto.getEmail());

            userModel userModel = userRepository.findByEmail(authRequestDto.getEmail());

            String jwt = jwtUtilService.generateToken(
                    userDetails,
                    userModel.getNombreRol()
            );

            String refreshToken = jwtUtilService.generateRefreshToken(
                    userDetails,
                    userModel.getNombreRol()
            );

            AuthResponseDto response = new AuthResponseDto();
            response.setToken(jwt);
            response.setRefreshToken(refreshToken);
            response.setSuccess(true);

            return ResponseEntity.ok(response);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Error Authentication:: " + e.getMessage());
        }
    }


    // ==========================
    // REFRESH TOKEN
    // ==========================
    @PostMapping("/refresh")
    public ResponseEntity<?> refresh(@RequestBody Map<String, String> request){
        String refreshToken = request.get("refreshToken");
        try{
            // 1) Obtener correo desde el token
            String correo= jwtUtilService.extractUsername(refreshToken);

            // 2) Buscar usuario por correo
            UserDetails userDetails = userDetailsService.loadUserByUsername(correo);

            userModel userModel = userRepository.findByEmail(correo);

            // Validar que exista
            if(userModel == null){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario no encontrado");
            }

            // Validar refresh token
            if(jwtUtilService.validateToken(refreshToken, userDetails)){
                String newJwt = jwtUtilService.generateToken(userDetails, userModel.getNombreRol());

                String newRefreshToken = jwtUtilService.generateRefreshToken(
                        userDetails, userModel.getNombreRol()
                );

                AuthResponseDto response = new AuthResponseDto();

                response.setToken(newJwt);
                response.setRefreshToken(newRefreshToken);
                response.setSuccess(true);

                return ResponseEntity.ok(response);
            }

            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Refresh Token");
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Errror refresh token::: " + e.getMessage());
        }
    }

    @GetMapping("/me")
    public ResponsesDto me(Authentication authentication){
        String correo = authentication.getName();
        userModel me = userRepository.findByEmail(correo);

        if(me == null){
            throw new ResourceNotFoundException("Usuario no encontrado");
        }

        me.setPassword(null);

        return buildResponse(true, "Usuario encontrado", me);
    }

    @PostMapping("/pre-register")
    public ResponseEntity<?> preRegister(@RequestBody PreRegisterRequestDto request){
        try{
            registerService.preRegister(request);

            ResponsesDto response = new ResponsesDto();
            response.setSuccess(true);
            response.setMensaje("Correo de Varificacion enviado");

            return ResponseEntity.ok(response);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping("/verify")
    public ResponseEntity<?> verify(@RequestParam String token){
        String idPersona = authRegisterRepository.findPersonaByValidToken(token);

        if(idPersona == null){
            return ResponseEntity.badRequest().body("Token Invalido o Expirado");
        }

        ResponsesDto response = new ResponsesDto();
        response.setSuccess(true);
        response.setMensaje("Token Valido");

        return ResponseEntity.ok(response);
    }

    @PostMapping("/activate-account")
    public ResponseEntity<?> activateAccount(@RequestBody ActivateAccountDto request){
        try{
            activateAccountService.activateAccount(request);

            ResponsesDto response = new ResponsesDto();
            response.setSuccess(true);
            response.setMensaje("Cuenta activada");

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    private ResponsesDto buildResponse(Boolean success, String mensaje, Object data){
        ResponsesDto res = new ResponsesDto();
        res.setSuccess(success);
        res.setMensaje(mensaje);
        res.setData(data);

        return res;
    }
}
