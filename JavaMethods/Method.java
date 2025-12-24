public class Method {
    // Static method
    static void displayMessage() {
        System.out.println("Hello from the static method!");
    }

    //public method
    public void showMessage() {
        System.out.println("Hello from the public method!");
    }

    public static void main(String[] args) {
        // Calling the static method
        displayMessage();

        Method methodObject = new Method();
        // Calling the public method
        methodObject.showMessage();
    }
}