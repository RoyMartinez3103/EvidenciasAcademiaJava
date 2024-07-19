package com.InterfazPolimorfismoAbstract;

public abstract class Animal implements ISound{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //Método que deber ser implementado por las subclases
    public abstract void move();
}
