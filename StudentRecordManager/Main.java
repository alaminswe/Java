package StudentRecordManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Student student1 = new Student();

        // student1.setName("Alamin Ridoy");

        // System.out.println(student1.getName());
        // System.out.println(student1.getFirstName());
        // System.out.println(student1.getLastName());

        Scanner input = new Scanner(System.in);

        Student student1 = new Student("Alamin Hridoy", 18 ,"male", 10 , 'a' ,"Dinajpur", "01708507790","HSTU High School");

        Student student2 = new Student("Abdur Rouf", 16 ,"Male", 7 , 'b' ,"Rongpur", "01708507790");
        
        Student student3 = new Student();
        student3.setName("Areyan Kafil");
        student3.setAge(20);
        student3.setGender("Male");
        student3.setRollNumber(1);
        student3.setSection('d');
        student3.setAddress("CTG");
        student3.setParentContact("01540158712");
        student3.setInstitutionName("CTG Zilla School");

        System.out.println("Info of Student 1 : ");
        System.out.println(student1.toString());
        System.out.println();
        System.out.println("Info of Student 2 : ");
        System.out.println(student2.toString());
        System.out.println();
        System.out.println("Info of Student 3 : ");
        System.out.println(student3.toString());

        
        Student student4 = new Student();

        System.out.println("Enter Student Name: ");
        student4.setName(input.nextLine());
        System.out.println("Enter Student Age: ");
        student4.setAge(input.nextInt());
        input.nextLine();
        System.out.println("Enter Student Gender: ");
        student4.setGender(input.nextLine());
        System.out.println("Enter Student Roll: ");
        student4.setRollNumber(input.nextInt());
        input.nextLine();
        System.out.println("Enter Student Section: ");
        student4.setSection(input.next().charAt(0));
        input.nextLine();
        System.out.println("Enter Student Address: ");
        student4.setAddress(input.nextLine());
        System.out.println("Enter Student Parents Contact: ");
        student4.setParentContact(input.nextLine());
        System.out.println("Enter Student Institution: ");
        student4.setInstitutionName(input.nextLine());
        
        System.out.println();
        System.out.println("Info of Student 1 : ");
        System.out.println(student4.toString());

        // System.out.println(student1.getGender());
        // System.out.println(student2.getGender());
        // System.out.println();
        // System.out.println("male".equals("male")); //true
        input.close();
    }
}
