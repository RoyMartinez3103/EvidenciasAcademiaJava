package com.InterfazPolimorfismoAbstract;

public class Main {
    public static void main(String[] args){
        //Se crean las instancias
        Animal dog = new Dog("Rocket");
        Animal cat = new Cat("Raknar");

        //Se usa el polimorfismo con los métodos
        dog.makeSound();
        dog.move();
        System.out.println("*********************");
        cat.makeSound();
        cat.move();
    }
}
