package com.InterfazPolimorfismoAbstract;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    //Método de la clase padre Animal
    @Override
    public void move() {
        System.out.println(getName() + " salta!");
    }

    //Método de la interfaz
    @Override
    public void makeSound() {
        System.out.println(getName() + " Miau Miau !!");
    }
}

