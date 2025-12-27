package StudentRecordManager;

public class Student {
    private String name;
    // private String firstName;
    // private String lastName;
    private int age;
    private String gender;
    private int rollNumber;
    private char section;
    private String address;
    private String parentContact;
    private String institutionName; // Notre Dame High school


    public Student() {
    }
    

    public Student(String name, int age , String gender, int rollNumber,char section, String addresss, String parentContact, String institutionName){
        this.name = name;
        this.age = age;
        this.gender = gender.toLowerCase();
        this.rollNumber = rollNumber;
        this.section = section;
        this.address = addresss;
        this.parentContact = parentContact;
        this.institutionName = institutionName;
    }


    public Student(String name, int age , String gender, int rollNumber,char section, String addresss, String parentContact){
        this.name = name;
        this.age = age;
        this.gender = gender.toLowerCase();
        this.rollNumber = rollNumber;
        this.section = section;
        this.address = addresss;
        this.parentContact = parentContact;
        this.institutionName = "Notre Dame High school";
    }

    public String toString(){
        return "Name: " + this.name + "\n" +
        "Age: " + this.age + "\n" +
        "Gender: " + this.gender + "\n" +
        "Roll Number: " + this.rollNumber + "\n" +
        "Section: " + this.section + "\n" +
        "Address: " + this.address + "\n" +
        "Parent Contact: " + this.parentContact + "\n" +
        "Institution Name: " + this.institutionName + "\n";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

        // this.firstName = name.split(" ")[0];
        // this.lastName = name.split(" ")[1];
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender.toLowerCase();
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public char getSection() {
        return this.section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParentContact() {
        return this.parentContact;
    }

    public void setParentContact(String parentContact) {
        this.parentContact = parentContact;
    }

    public String getInstitutionName() {
        return this.institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    // /**
    //  * @return String return the firstName
    //  */
    // public String getFirstName() {
    //     return firstName;
    // }

    // /**
    //  * @param firstName the firstName to set
    //  */
    // public void setFirstName(String firstName) {
    //     this.firstName = firstName;
    // }

    // /**
    //  * @return String return the lastName
    //  */
    // public String getLastName() {
    //     return lastName;
    // }

    // /**
    //  * @param lastName the lastName to set
    //  */
    // public void setLastName(String lastName) {
    //     this.lastName = lastName;
    // }

}
