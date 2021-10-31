package CS203Course.Lab.Lab_3;

import java.util.ArrayList;

public class Person extends Contact {

    private String firstName;
    private String lastName;
    private Address address;
    private ArrayList<Person> listPerson;


    public Person() {
        super();
        firstName = "Robeil";
        lastName = "Aregawi";
        listPerson = new ArrayList<Person>();
        listPerson.add(super.addPerson(firstName, lastName, address));

    }

    public Person(String firstName, String lastName, Address address) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.listPerson = new ArrayList<Person>();
        listPerson.add(super.addPerson(firstName, lastName, address));

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


    public Person addPerson(String firstName, String lastName, Address address) {

        Person newPerson = new Person(firstName, lastName, address);

        return newPerson;
    }



    @Override
    public String toString() {
        return "\nPersonal Contact " + "\nFull name: " + firstName + " " + lastName + super.toString();
    }
}
