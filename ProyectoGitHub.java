/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogithub;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import java.math.*;
public class ProyectoGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    double a,b,c,d,e,f;
    System.out.println("escribe la variable a");
    Scanner LeerA =new Scanner (System.in);
    a=LeerA.nextInt();        
    
    System.out.println("escribe la variable b");
    Scanner LeerB =new Scanner (System.in);
    b=LeerB.nextInt();
    
    c=a+b;
    d=a*b;
    e=b-a;
    
    f=Math.floor(d);
    
    System.out.println("el resultado de sumar a + b es="+c);
    System.out.println("el resultado de multiplicar a + b es="+d);
    System.out.println("el resultado de restar a + b es="+e);
    System.out.println("el entero mas cercano por debajo del resultado de axb es="+f);
    
    
    
    }
    
}
