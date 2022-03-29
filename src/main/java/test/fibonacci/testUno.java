
package test.fibonacci;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class testUno {
    
    
    public static void main(String[] args) {
        
        //La serie de fibonacci consiste en una sucesion numerica conformada
        //por la suma de sus 2 anteriores
        //Ejemplo
        //n=7
        //0 1 1 2 3 5 8
        
        //Cambio el modo de carga de datos
        //int rango=cargarNumero("Ingrese el rango de fibonacci");
        
        int rango=Integer.parseInt(JOptionPane.showInputDialog("Carga el rango:"));
        
        System.out.println("El ingreso del rango fue:"+rango);
        
        Fibonacci(rango);
        
    
        
        
    }


public static int  cargarNumero(String texto){

    Scanner sn= new Scanner(System.in);
    
    System.out.println(texto);
    
    
    int numero=sn.nextInt();
    
    return numero;

}


private static void Fibonacci(int rango) {

   
    int aux1=0;
    int aux2=1;
    int res;
    
    
    /*do {        
        
        System.out.println(aux1);
        
        res=aux1+aux2;
        aux1=aux2;
        aux2=res;
        contador+=1;
        
        
        System.out.println(res);
        
    } while (contador<rango);*/
    
    for (int i = 0; i < rango; i++) {

            System.out.println(aux1);
            
            res=aux1+aux2;
            aux1=aux2;
            aux2=res;
            
            
           
            
    }
    

}
    


    
}


