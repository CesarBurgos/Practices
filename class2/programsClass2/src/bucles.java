public class bucles {


        // 1. for clásico — tabla de multiplicar
        System.out.println("=== Tabla del 7 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("7 x %2d = %3d%n", i, 7 * i);
        }

        // 2. for-each — recorrer arreglo
        String[] frutas = {"Manzana", "Plátano", "Mango", "Papaya"};
        System.out.println("\n=== Frutas (for-each) ===");
        for (String fruta : frutas) {
            System.out.println("  → " + fruta);
        }

        // 3. while — cuenta regresiva
        System.out.println("\n=== Cuenta regresiva (while) ===");
        int contador = 5;
        while (contador > 0) {
            System.out.println(contador + "...");
            contador--;
        }
        System.out.println("¡Despegue!");

        // 4. do-while — menú hasta que sea válido
        System.out.println("\n=== do-while (simula validación) ===");
        int intento = 0;
        int intentosMax = 3;
        do {
            intento++;
            System.out.println("Intento #" + intento);
        } while (intento < intentosMax);

        // 5. break y continue
        System.out.println("\n=== break / continue (pares del 1-10) ===");
        for (int n = 1; n <= 10; n++) {
            if (n % 2 != 0) continue;   // salta impares
            if (n == 8) break;           // detiene en 8
            System.out.print(n + " ");
        }

        // 7. Suma con while — acumulador
        System.out.println("\n=== Suma 1..100 ===");
        int suma = 0, x = 1;
        while (x <= 100) { suma += x++; }
        System.out.println("Resultado: " + suma);

}