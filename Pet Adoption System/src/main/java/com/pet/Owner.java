package com.pet;

public class Owner {
    String name;
    String address;
    int petsAdopted;

    public Owner(String name, String address) {
        this.name = name;
        this.address = address;
        this.petsAdopted = 0;
    }

    public void adoptPet(Pet pet) {
        petsAdopted++;
        System.out.println("You have adopted a pet: " + pet.getName());
    }

    public String toString() {
        return "Owner [name=" + name + ", address=" + address + ", petsAdopted=" + petsAdopted + "]";
    }

    public int getPetsAdopted() {
        return petsAdopted;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
