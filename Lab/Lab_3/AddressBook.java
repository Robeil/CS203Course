package CS203Course.Lab.Lab_3;

import java.util.ArrayList;

public class AddressBook extends Contact {

    private ArrayList<Person> person;
    private ArrayList<Business> business;

    public AddressBook() {
        super();
    }

    public AddressBook(ArrayList<Person> person, ArrayList<Business> business) {
        super();
        this.person = person;
        this.business = business;
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    public ArrayList<Business> getBusiness() {
        return business;
    }

    public void setBusiness(ArrayList<Business> business) {
        this.business = business;
    }

 /*
    public void AddBusiness(String name) {

    }*/
    // Add person method here

    // Edit person list method here
    // Add business method here
    // Edit business method here

    @Override
    public String toString() {
        return super.toString() + " " + person + " " + business;
    }
}

