package com.pet;

public class Cat extends Pet implements PetBehavior {

    public Cat(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void feed(String food) {
        System.out.println("Feeding the Cat ");
    }

    @Override
    public void play(String toy) {
        System.out.println("Playing with the Cat ");
    }

    public String toString() {
        return "Cat [name=" + name + ", age=" + age + ", breed=" + breed + "]";
    }
}