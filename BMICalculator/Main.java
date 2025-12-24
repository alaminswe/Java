import java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static double weightInKg;
    public static double heightInMeters;
    static boolean isheigthMeter;
    public static void main(String[] args) {
        getUserInput();

        double bmi = calculateBMI(weightInKg,heightInMeters);
        System.out.println("Your BMI is: "+bmi);
        String Catagory = getBMICategory(bmi);
        System.out.println("BMI Category: "+Catagory);
        input.close();
    }

    public static void getUserInput(){

        System.out.println("Enter Weight in Kg");
        if(input.hasNextDouble()){
            weightInKg = input.nextDouble();
        }else{
            System.out.println("Invalid");
        }

        System.out.println("Enter height in meters");
        if(input.hasNextDouble()){
            heightInMeters = input.nextDouble();
        }else{
            System.out.println("Invalid");
        }
    }
    public static double calculateBMI(double weightInKg, double heightInMeters) {
        double weight = weightInKg;
        double height = heightInMeters;
        double bmi = weight / (height * height);
        return bmi;
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}