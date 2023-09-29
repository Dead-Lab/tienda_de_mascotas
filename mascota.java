package com.example;

import javax.swing.JOptionPane;

public class mascota {
    private String nombre, raza, especie_Animal;
    private int edad;
    private boolean adopcion;
    mascota(String nombre, String raza, String especie_Animal, int edad, boolean adopcion){
        this.nombre = nombre;
        this.raza = raza;
        this.especie_Animal = especie_Animal;
        this.edad = edad;
        this.adopcion = adopcion;
    }
    public void mostrarMascota(){
        
    }
    // Getters // para obtener valores de las variables de la clase
    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public String getEspecieAnimal(){
        return especie_Animal;
    }
    public int getEdad(){
        return edad;
    }
    public boolean getDisponibilidad(){
        return adopcion;
    }
    // setters // para ingresar valor a las variables de la clase
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public void setEspecieAnimal(String especieAnimal){
        this.especie_Animal = especieAnimal;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setDisponibilidad(boolean adopcion){
        this.adopcion = adopcion;
    }
    public String toString(){
    return "mascota: "+nombre+"\nraza: "+raza+"\nespecie animal: "+especie_Animal+"\nedad: "+edad+"\nestado de adopcion: "+adopcion;
}

}
