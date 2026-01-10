public class Animal {

    private int legs;
    private String sound;

    public Animal() {
    }
    public Animal(int legs, String sound) {
        this.legs = legs;
        this.sound = sound;
    }


    public void doPrint() {
        System.out.println("Print from Animal class");
    }
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}