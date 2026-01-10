public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(4, "Roar");
        System.out.println("Animal has " + animal.getLegs() + " legs and makes sound: " + animal.getSound() );

        Cat cat = new Cat(4, "Meow", "parsian");
        System.out.println("Cat has " + cat.getLegs() + " legs and makes sound: " + cat.getSound() +", Type: " + cat.getType() );

        cat.doPrint();
        animal.doPrint();
    }
}
