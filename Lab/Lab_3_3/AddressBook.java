package CS203Course.Lab.Lab_3_3;

import java.util.ArrayList;

public class AddressBook extends Contact {

    private ArrayList<Contact> personal;
    private ArrayList<Contact> business;

    public AddressBook() {//fixme ????
       this.personal = new ArrayList<Contact>();
        this.business = new ArrayList<Contact>();
    }

    public ArrayList<Contact> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<Contact> personal) {
        this.personal = personal;
    }

    public ArrayList<Contact> getBusiness() {
        return business;
    }

    public void setBusiness(ArrayList<Contact> business) {
        this.business = business;
    }

    //adding personal contact
    public void addPersonalContact(Contact personal) {
        this.personal.add(personal);
    }

    //adding business contact
    public void addBusinessContact(Contact business) {
        this.business.add(business);
    }

    //removing existing personal contact
    public void deletePersonalContact(Contact personal) {
        if (this.personal.equals(personal)) {
            this.personal.remove(personal);
        }
    }

    //removing existing business contact
    public void deleteBusinessContact(Contact business) {
        if (this.business.equals(business)) {
            this.business.remove(business);
        }
    }

}
