/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra;
import java.util.*;
/**
 *
 * @author USER
 */
public class Comparacion {
   public String marca,modelo;
   private float precio;
   
   public Comparacion(String marca,String modelo, float precio)
   {
    this.marca = marca;
 this.modelo = modelo;
 this.precio = precio;  
   }

    public float getPrecio() {
        return precio;
    }   
   public String MostrarDatos()
   {    
 return "Marca: " + marca +"Modelo: " + modelo + "Precio $: " + precio;      
   }
   
   
    
    
    
    
}
