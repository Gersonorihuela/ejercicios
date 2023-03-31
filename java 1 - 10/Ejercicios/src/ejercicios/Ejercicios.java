/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese numero de ejercicio a desarrollar");
        byte ejercicio = sc.nextByte();
        switch (ejercicio){
            case 1 : 
                ejercicio1();
                break;
            case 2 : 
                ejercicio2();
                break;
            case 3 : 
                ejercicio3();
                break;
            case 4 : 
                ejercicio4();
                break;
            case 5 : 
                ejercicio5();
                break;
            case 6 : 
                ejercicio6();
                break;
            case 7 : 
                ejercicio7();
                break;
            case 8 : 
                ejercicio8();
                break;
            case 9 : 
                ejercicio9();
                break;
            case 10: 
                ejercicio10();
                break;
            case 11: 
                ejercicio11();
                break;
            case 12: 
                ejercicio12();
                break;
            case 18: 
                ejercicio18();
                break;
            case 19: 
                ejercicio19();
                break;
            case 20: 
                ejercicio20();
                break;
            case 21: 
                ejercicio21();
                break;
            case 25: 
                ejercicio25();
                break;
        }
    }
    
    public static void ejercicio1(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese numeros a sumar");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int suma = n1 + n2;
        System.out.println("La suma de los numeros ingresados es : " + suma);
    }
    public static void ejercicio2(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese nombre");
        String nombre = sc.nextLine();
        System.out.println("El nombre ingresado es : " + nombre);
    }
     public static void ejercicio3(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese frase");
        String frase = sc.nextLine();
        System.out.println(frase.toLowerCase()+ ";" + frase.toUpperCase());
     }
     
     public static void ejercicio4(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese temperatura");
        int c = sc.nextInt();
        int f =32 + (9 * c/5);
        System.out.println("LA coversion es : " + f + "°f");
     }
     public static void ejercicio5(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese numero");
        int n = sc.nextInt();
        int d = n* 2;
        int t = n *3;
        double raizCuadrada = Math.sqrt(n);
        
        System.out.println("La raiz cuadrada del numero "+ n +"es : " + raizCuadrada);
     }
     public static void ejercicio6(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese numero");
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("El número ingresado es par");
        }else{
            System.out.println("El número es impar");
        }
     }
     public static void ejercicio7(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese frase");
        String frase = sc.nextLine();
        if (frase.equals("Eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
     }
     
     public static void ejercicio8(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese frase");
        String frase = sc.nextLine();
        if (frase.length() == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
     }
     public static void ejercicio9(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese frase");
        String frase = sc.nextLine();
        //Comparacion con substring()
        String letra = frase.substring(0,1);
        if (letra.equals("a")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        //Comparacion con charAT
        char char1 = frase.charAt(0);
        if (char1 == ('a')){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
     }
     public static void ejercicio10(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese numero máximo");
        int n = sc.nextInt();
        int num = 0;
        do{
            System.out.println("Ingrese numeros");
            num += sc.nextInt();
        }while(num <= n);
         System.out.println("La suma de los numeros ingresados superó el límite maximo de " + n + " La suma es : " + num);
     }
    public static void ejercicio11(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese numeros");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String seleccion = "N";
        while ((n1 >= 0) && (n2 >= 0 && seleccion.equalsIgnoreCase("N"))){
            System.out.println("******Menú******\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir\n.Elegir Opción:");
            System.out.println("");
            byte opciones = sc.nextByte();
            switch (opciones){
                case 1:
                    System.out.println("La suma es : " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("La Resta es : " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("La Multiplicación es : " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("La division es : " + (double)(n1 / n2));
                    break;
                case 5:
                    System.out.println("ESTA SEGURO QUE DESEA ABANDONAR SELECCIONE S/N");
                    seleccion = sc.next();
                    if (seleccion.equalsIgnoreCase("S")){
                        System.out.println("Adios");
                   break;
                    } if (seleccion.equalsIgnoreCase("N")){
                    break; 
                    }
                    break;
                default :
                    System.out.println("Seleccione un numero dentro del rango del menú");
            }
            
           }
          }
    public static void ejercicio12(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Envie Caracteres");
        String rs232 = sc.nextLine();
        String enviar = rs232.substring(0,1);
        if (enviar.equals("X") && (rs232.length() == 5) && (rs232.substring(4)).equals("O")){
            System.out.println("Correcto");  
        }else{
            System.out.println("Inorrecto");
        }
    }
     public static void ejercicio18(){
     Scanner sc = new Scanner (System.in);
     int [][] matriz = new int[4][4];
         System.out.println("Matriz original");
     for (byte i = 0 ; i < matriz.length;i++){
        for(byte j = 0; j < matriz[0].length; j++){
         matriz[i][j] = (int) (Math.random()*10);
            System.out.print(" " + matriz[i][j]);
     }
         System.out.println("");
     }
         System.out.println("");
         System.out.println("Matriz transpuesta");
     int [][] transpuesta = new int [4][4];
      for (byte i = 0 ; i < transpuesta.length;i++){
        for(byte j = 0; j < transpuesta[0].length; j++){
         transpuesta[i][j] = matriz[j][i];
            System.out.print(" " + transpuesta[i][j]);
     }
         System.out.println("");
     }
     }
     
      public static void ejercicio19(){
           int[][] matriz = {{0, 1, -2}, {-1, 0, 3}, {2, -3, 0}}; // Ejemplo de matriz anti simétrica
        int[][] transpuesta = new int[matriz.length][matriz[0].length];
        boolean esAntiSimetrica = true;

        // Crear la matriz transpuesta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Comprobar si la matriz es anti simétrica
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != -transpuesta[i][j]) {
                    esAntiSimetrica = false;
                    break;
                }
            }
        }

        // Imprimir el resultado
        if (esAntiSimetrica) {
            System.out.println("La matriz es anti simétrica.");
        } else {
            System.out.println("La matriz no es anti simétrica.");
        }
    }
        public static void ejercicio20(){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] sumas = new int[8];
        boolean esCuadradoMagico = true;

        // Leer la entrada del usuario y comprobar que los valores son correctos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce el valor de la fila " + (i + 1) + ", columna " + (j + 1) + ": ");
                int valor = sc.nextInt();
                if (valor < 1 || valor > 9) {
                    System.out.println("Valor incorrecto. Introduce un valor entre 1 y 9.");
                    j--;
                    continue;
                }
                matriz[i][j] = valor;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" "+ matriz[i][j]);
            }
            System.out.println("");
        }
        // Calcular las sumas de las filas, las columnas y las diagonales
        for (int i = 0; i < matriz.length; i++) {
            sumas[i] = matriz[i][0] + matriz[i][1] + matriz[i][2]; // Sumas de las filas
            sumas[i + 3] = matriz[0][i] + matriz[1][i] + matriz[2][i]; // Sumas de las columnas
        }
        sumas[6] = matriz[0][0] + matriz[1][1] + matriz[2][2]; // Suma de la diagonal principal
        sumas[7] = matriz[0][2] + matriz[1][1] + matriz[2][0]; // Suma de la diagonal secundaria

        // Comprobar si todas las sumas son iguales
        int sumaBase = sumas[0];
        for (int i = 1; i < sumas.length; i++) {
            if (sumas[i] != sumaBase) {
                esCuadradoMagico = false;
                break;
            }
        }

        // Imprimir el resultado
        if (esCuadradoMagico) {
            System.out.println("El cuadrado es mágico.");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
}
         public static void ejercicio21(){
             // Creamos las matrices M y P
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];

        // Pedimos los valores de las matrices por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Los valores de la matriz 10 x 10 son : ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = (int)(Math.random()*90 + 10);
                System.out.print(" " + M[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Introduce los valores de la matriz P (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                P[i][j] = sc.nextInt();
            }
        }

        // Buscamos la submatriz P en la matriz M
        boolean encontrada = false;
        int fila = 0, columna = 0;
        for (int i = 0; i <= 7 ; i++) {
            for (int j = 0; j <= 7 ; j++) {
                // Comparamos la submatriz de 3x3 de M con la matriz P
                boolean coincide = true;
                for (int k = 0; k < 3 ; k++) {
                    for (int l = 0; l < 3 ; l++) {
                        if (M[i + k][j + l] != P[k][l]) {
                            coincide = false;
                        }
                    }
                }
                if (coincide) {
                    encontrada = true;
                    fila = i;
                    columna = j;
                }
            }
        }

        // Mostramos el resultado
        if (encontrada) {
            System.out.println("La submatriz P se encuentra en la matriz M en los índices:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print((fila + i) + "," + (columna + j) + " - ");
                }
            }
        } else {
            System.out.println("La submatriz P no se encuentra en la matriz M.");
        }
         }
         public static void ejercicio25(){
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número entre 1 y 3999: ");
        int numero = sc.nextInt();
        
        if (numero < 1 || numero > 3999) {
            System.out.println("Número fuera de rango.");
        } else {
            String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String resultado = "";
            
            for (int i = 0; i < simbolos.length; i++) {
                while (numero >= valores[i]) {
                    resultado += simbolos[i];
                    numero -= valores[i];
                }
            }
            System.out.println("posicion 0 : " + valores[0]);
            System.out.println("El número " + numero + " en números romanos es " + resultado);
        }
    }

}





