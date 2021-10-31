package CS203Course.Lab.Lab_3.AddressBook_1;

import java.util.ArrayList;

public class Contact {

    protected String phoneNumber;
    protected String email;
    protected String street;
    protected String city;
    protected String state;
    protected int zipCode;
    protected String note;

    public Contact() {

        super();
        phoneNumber = "000-000-0000";
        email = "abcdefg@miu.edu";
        street = "1234 123th st";
        city = "Seattle";
        state = "WA";
        zipCode = 98188;
        note = "Write something here";

    }

    public Contact(String phoneNumber, String email, String street, String city, String state, int zipCode, String note) {
        super();
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.note = note;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setAddress(String street, String city, String state, int zipCode) {

       this.street = street;
       this.city = city;
       this.state = state;
       this.zipCode = zipCode;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String  getNote() {
        return this.note;
    }

    //Printing only address
    public String printAddress() {
        return this.street + " " + city + " " + this.state + " " + this.zipCode;
    }

    @Override
    public String toString() {
        return "\nPhone-number: " + phoneNumber + "\nEmail: " + email + "\nAddress: " + printAddress() + "\n" +getNote();
    }


}
