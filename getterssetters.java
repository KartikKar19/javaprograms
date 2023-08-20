class Encapsulationexample {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // get and setter for lastname
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class getterssetters {
    public static void main(String[] args) {
        Encapsulationexample obj1 = new Encapsulationexample();
        obj1.setFirstName("Kartik");
        // setter method to assign value of first name
        System.out.println("\nFirst Name is " + obj1.getFirstName());
        obj1.setLastName("Kar");
        // setter method to assign value of last name
        System.out.println("\nLast Name is " + obj1.getLastName());
        obj1.setAge(19);
        if (obj1.getAge() > 18) {
            System.out.print("\nYou are eligible to vote.");
        } else {
            System.out.print("\nSorry, you cannot vote!");
        }
    }
}
