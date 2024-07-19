package com.singleton;


public class Main {
    public static void main(String[] args) {
        // Obtenemos la instancia de Counter
        System.out.println("Creando la instancia...");
        Counter counter1 = Counter.getInstance();
        Counter counter2 = Counter.getInstance();

        System.out.println(counter2);
        System.out.println(counter1);

        // Incrementamos el contador desde diferentes referencias
        counter1.increment();
        counter2.increment();



        // Mostramos el valor del contador
        System.out.println("Valor del contador 1: " + counter1.getCount());

        // Verificamos que ambas referencias son iguales
        System.out.println("¿counter1 y counter2 son la misma instancia? " + (counter1==counter2));
    }

}