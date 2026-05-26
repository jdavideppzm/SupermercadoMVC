/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercadomvc.modelo;//esta clase pertene aun paquete//

/**
 *
 * @author DELL
 */
public class Empleado {
    
    private int id;//Indicador único del empleado//
    private String nombre;//nombre empleado//
    private String cargo;//cargo del supermercado//
    private double salario;//Almacena el salario del empleado//
    
    //Porque usamos private y no public; por encapsulamiento(Protege los datos del objeto) es fundamental en POO
    
    
    //Constructor vacío de la clase Empleado//
    public Empleado() {
   
        
}
    
    //constructor con parámetros//
    
    public Empleado(int id, String nombre, String cargo, double salario) {

        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        
        
        
        
}

    
    
    //getter and setter//
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
   
    
    
    
    
}
