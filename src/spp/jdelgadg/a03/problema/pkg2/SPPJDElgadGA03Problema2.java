/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadg.a03.problema.pkg2;
import java.util.Scanner;
/**
 *
 * @author GILDARDO
 */
public class SPPJDElgadGA03Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejemplo usando Math.sin");
        // Variables
        double a;
        Scanner kb=new Scanner (System.in);
        //Asignar valores a las variables
        System.out.println("Introduce el valor de a");
        a=kb.nextDouble();
        a=Math.toRadians(a);
        System.out.println("El seno de a es"+Math.sin(a));
        
        //Resolver el problema
        
    }
    
}
