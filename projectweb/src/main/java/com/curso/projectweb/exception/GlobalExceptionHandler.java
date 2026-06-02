package com.curso.projectweb.exception;

import com.curso.projectweb.dto.ResponsesDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.curso.projectweb.util.Util;

@RestControllerAdvice
public class GlobalExceptionHandler {
    //  Builder común
    private ResponsesDto buildErrorResponse(String mensaje, String error){
        ResponsesDto res = new ResponsesDto();
        res.setSuccess(false);
        res.setMensaje(mensaje);
        res.setError(error);
        res.setData(null);

        return res;
    }

    // Errores de negocio
    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponsesDto handleBusinessException(BusinessException ex){
        return buildErrorResponse(Util.ERRBUSSINESS, ex.getMessage());
    }

    // No encontrado
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponsesDto handleNotFound(ResourceNotFoundException ex){
        return buildErrorResponse(Util.NOTFOUND, ex.getMessage());
    }

    // Validaciones
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponsesDto handleValidation(MethodArgumentNotValidException ex){
        String error = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .findFirst()
                .map(e -> e.getField() + ": " + e.getDefaultMessage())
                .orElse(Util.ERRVALIDATION);

        return buildErrorResponse(Util.ERRVALIDATION, error);
    }

    // Errores Generales (catch global)
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponsesDto handleValidation(Exception ex){
        return buildErrorResponse(Util.ERRINTERNAL, ex.getMessage());
    }
}
