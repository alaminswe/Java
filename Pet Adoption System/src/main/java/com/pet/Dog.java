package com.pet;

public class Dog extends Pet implements PetBehavior {

    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void feed(String food) {
        System.out.println("Feeding the dog ");
    }

    @Override
    public void play(String toy) {
        System.out.println("Playing with the dog ");
    }

    public String toString() {
        return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
    }
}
