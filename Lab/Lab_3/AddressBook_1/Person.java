package CS203Course.Lab.Lab_3.AddressBook_1;

public class Person extends Contact {

    private String firstName;
    private String lastName;

    public Person() {
        super();
        firstName = "Robeil";
        lastName = "Aregawi";

    }

    public Person(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String printName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String toString() {
        return "\nPersonal Contact " + "\nFull name: " + firstName + " " + lastName + super.toString();
    }
}
