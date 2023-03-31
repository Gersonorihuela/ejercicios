/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author gerso
 */

public class extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese valores al cuadrado magico 3 x 3 ");
        int[][] valores = new int[3][3];
        
        for (int i = 0 ;i < valores.length ; i++ ){
            for (int j = 0; j < valores[i].length ; j++){
                System.out.print("posicion [" +  i + "][" + j +"] :" );
                int num = sc.nextInt();
                // comprobamos la condicion
                    if (num < 1 || num > 9){
                    System.out.println("Ingrese valores dentro del parametro");   
                    j--;
                    continue;
                    }   
                valores[i][j] = num;
            }
        }
        /// imprimimos la matriz 3 * 3
        for (int i = 0 ;i < valores.length ; i++ ){
            for (int j = 0; j < valores[i].length ; j++){
                System.out.print(" " + valores[i][j]);
            }
            System.out.println("");
            }
     /// comproabmos si es magico        
    int[] sumas = new int[8];
   
    for (int i = 0 ; i < 3 ; i++){
       //filas
        sumas[i] =  valores[i][0] + valores[i][1] + valores[i][2];
        System.out.println(sumas[i]);
       // columnas
       sumas[i+3] =  valores[0][i] + valores[1][i] +valores[2][i];
       System.out.println(sumas[i+3]);
}
    /// diagonales principal
    sumas[6] = valores[0][0] + valores[1][1] + valores[2][2];
    sumas[7] = valores[0][2] + valores[1][1] + valores[2][0];
    
    boolean resultado = true;
    
   for (int i = 1 ; i < 8 ; i++){
       if (sumas[0] != sumas[i]){
           resultado = false;
           break;
       }
   }
   
   if (resultado){
       System.out.println("La matriz es magica");
   }else{
       System.out.println("La matriz no es magica");
   }
}
}
                
    
    

