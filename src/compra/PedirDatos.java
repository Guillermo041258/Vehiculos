/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PedirDatos {
    
    public static void main(String[] args) throws IOException
    {
     int vehiculos,masbarato;
     String marca="", modelo="";
     float precio=0;
     Scanner entrada = new Scanner(System.in);
     BufferedReader bc = new BufferedReader( new InputStreamReader(System.in));
     System.out.print("Cuantos Vehiculos deseas Comparar");
     vehiculos = entrada.nextInt();
     
     
     Comparacion  coches[] = new Comparacion[vehiculos];
     
     
     for(int i=0; i < vehiculos; i++)
     {
         System.out.print("Digite su marca");
         marca= bc.readLine();
         System.out.print("Digite su modelo");
         modelo = bc.readLine();      
         System.out.print("Digite su precio");
         precio= entrada.nextFloat();
         
         
         coches[i] = new Comparacion(marca,modelo,precio);
     }
      
    masbarato = MBarato(coches);
    System.out.println("El coche mas barato es: ");
    System.out.println(coches[masbarato].MostrarDatos());
    
    
          
    }
    
    
 public static int MBarato(Comparacion coches[])
   {
         float price;
         int indice =0;
        price = coches[0].getPrecio();
        for(int i =1; i < coches.length;i++)
        {
           if(coches[i].getPrecio() < price)
           {
             price = coches[i].getPrecio();
             indice =i;
               
         }
            
            
        }        
     return indice;    
         
   }
   
    
    
    
}
