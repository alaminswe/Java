package com.pet;
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Pug");
        Cat cat = new Cat("Mini", 2, "Ginger");
        Owner owner = new Owner("Alice", "Dhaka");

        //adoting pets
        owner.adoptPet(dog);
        owner.adoptPet(cat);

        System.out.println();


        // Interaction with Dog
        System.out.println("Interacting with Dog:");
        dog.makeSound();
        dog.feed("feed");
        dog.play("play");

        System.out.println();


        // Interaction with Cat
        System.out.println("Interacting with Cat:");
        cat.makeSound();
        cat.feed("feed");
        cat.play("play");

        System.out.println();

        // Print owner details and total pets adopted
        System.out.println(owner.getName() + " lives at " + owner.getAddress());
        System.out.println("Total pets adopted: " + owner.getPetsAdopted());

        System.out.println();

        // Print details of the pets
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(owner);

    }
}