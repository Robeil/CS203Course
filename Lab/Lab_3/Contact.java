package CS203Course.Lab.Lab_3;

import java.util.ArrayList;

public class Contact {

    private String phoneNumber;
    private String email;
  /*  private String street;
    private String city;
    private String state;
    private int zipCode;*/
    private Person person;
    private Business business;
    private ArrayList<Person> listPerson;
    private ArrayList<Business> listBusiness;

    public Contact() {

        super();
        phoneNumber = "000-000-0000";
        email = "abcdefg@miu.edu";
      /*  street = "1234 123th st";
        city = "Seattle";
        state = "WA";
        zipCode = 98188;*/

    }

    public Contact(String phoneNumber, String email) {

        super();
        this.phoneNumber = phoneNumber;
        this.email = email;

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
        //fixme use the arrayList method add() - set() - remove() - size()
    }

   /* public String getStreet() {
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

    public String printAddress(){
        return getStreet()+ " "+ getCity()+" "+getState()+" "+getZipCode();
    }
*/
    //Method that edit existing contact

    //adding new person
    public Person addPerson(String firstName, String lastName, Address address) {
        return person;
    }
    //adding new Business
    public Business addBusiness(String name,Address address){
        return business;
    }


    /*
        //Remove Person contact
        @Override
        public String toString() {
            return "\nPhone-number: " + phoneNumber + "\nEmail: " + email + "\nAddress: " + street + " " + city + " " + state + " " + zipCode;
        }

    */
    @Override
    public String toString() {
        return "\nPhone-number: " + phoneNumber + "\nEmail: " + email;
    }

}
