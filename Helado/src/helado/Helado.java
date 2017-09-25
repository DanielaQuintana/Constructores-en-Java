/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helado;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public abstract class Helado {

    /**
     * @param args the command line arguments
     */
        public static void main (String args[]){}
        Scanner sc = new Scanner(System.in);
        int Bolitas=1 ;
        String sabor="";
        String tamaño="";
        String tipo;
        int cantidad;
        Helado(){
            
        }
        Helado (int bolitas){
            this.Bolitas=bolitas;
        }
        Helado(String tamaño){
            this.tamaño=tamaño;
        }
        Helado(String sabor, String tamaño){
            this.sabor=sabor;
            this.tamaño=tamaño;
        }
        Helado(String tipo,int Bolitas){
            this.Bolitas=Bolitas;
            this.tipo=tipo;
        }
        Helado(int cantidad, String sabor){
            this.cantidad=cantidad;
            this.sabor=sabor;
        }
        public abstract void servir();
        public void pedido(){
            String persona;
            int cant;
            String sab;
            System.out.println("Qué sabor desea?");
            sab=sc.nextLine();
            
            
            
        }
         
            

    
}
