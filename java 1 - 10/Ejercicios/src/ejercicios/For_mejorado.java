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
public class For_mejorado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        String[] romano = {"X","IX","V","IV","I"};
        int[] numero = {10,9,5,4,1};
        System.out.println("Ingrese número a convertir");
        int n = sc.nextInt();
        String resultado= "";
        for (int i = 0 ; i < numero.length; i++){
            while(n >= numero[i] ){
                resultado += romano[i];
                n -= numero[i];
            }
    }
        System.out.println("la conversion es : " + resultado);
        }
    }
    

