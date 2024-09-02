/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajopractico_5lab;

import java.util.TreeMap;

/**
 *
 * @author IK
 */
public class Directorio {
    TreeMap<Long, Contacto> ListaCont;
//constructor
    public Directorio() { ListaCont = new TreeMap< Long, Contacto>();
    }

 void agregarContacto(Long tel, Contacto cont){
     ListaCont.put(tel, cont);
 }   
 Contacto buscarContacto(Long tel){
 for(Long telef: ListaCont.keySet()){
     if (telef == tel){
         return ListaCont.get(tel);}
 } 
 return null;
 }

 
 void bucarTelefono(){
     
 }
 void buscarContactos(){
     
 }
 void borrarContacto(){
     
 }
 
 
 
 
 
 
 
 
}
