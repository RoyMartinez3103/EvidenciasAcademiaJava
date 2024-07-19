package com.singleton;

public class Counter {
    // La única instancia de esta clase
    private static Counter counterIns;
    private static int count;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private Counter() {
        count = 0;
    }

    // Método estático para obtener la única instancia de la clase
    public static Counter getInstance() {
        if (counterIns == null) {
            counterIns = new Counter();
        }
        return counterIns;
    }

    // Método para incrementar el contador
    public void increment() {
        System.out.println("El contador se incrementa en 1");
        count++;
    }

    // Método para obtener el valor del contador
    public int getCount() {
        return count;
    }
}
