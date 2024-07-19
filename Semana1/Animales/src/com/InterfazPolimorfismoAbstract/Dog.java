package com.InterfazPolimorfismoAbstract;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    //Método de la clase padre Animal
    @Override
    public void move() {
        System.out.println(getName() + " corre!");
    }

    //Método de la interfaz
    @Override
    public void makeSound() {
        System.out.println(getName() + " Woof Woof !!");
    }
}
