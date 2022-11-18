package com.company.ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {

        for(int i = 0; i < 200; i++){
            System.out.println("Hola mundo");
        }

        String[] nombres = {"Raúl", "Jose", "Isaias"};
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }

        int suma = 0;
        int[] numeros = {5, 7, 8};
        for(int i = 0; i < nombres.length; i++){
            suma += numeros[i];
        }
    }
}
