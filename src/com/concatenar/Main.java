package com.concatenar;

public class Main {
    public static void main(String[] args) {
        /*creamos un bucle que lea un array de nombres y concatene los textos para imprimirlos, en este caso.
        los nombres y edades de los empleados de una compañia

         */

        String[] nombres = {"Julia", "Mario", "Charlie", "Sandra","Carlos","Marta"};
        int[] edad = {18,20,25,32,40,27};


        for (int i=0; i< nombres.length; i++){
            System.out.println(nombres[i] + " tiene " + edad[i] + " años");
        }
    }
}