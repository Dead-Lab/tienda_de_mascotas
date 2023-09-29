package com.example;

public class Main {
    public static void main(String[] args) {
        mascota perro = new mascota("lili", "criolla", "perro", 7, false);
        cliente cliente1 = new cliente("dayana", "loma", 313525);
        System.out.println(perro);
        System.out.println(cliente1);
        
    }
}