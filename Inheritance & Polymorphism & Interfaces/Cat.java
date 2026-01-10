public class Cat extends Animal {

    // Constructor kokhno inherite kora jayna and override kora jayna
    // but super keyword use kore parent class er constructor ke call kora jay
    private String type;;

    public Cat(int legs, String sound, String type) {
        super(legs, sound);
        this.type = type;
    }
    @Override// eta na dileo kaj kortiche

    public void doPrint() {
        System.out.println("Print from Cat class");
    }

    public Cat(int legs, String sound) {
        super(legs, sound);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
