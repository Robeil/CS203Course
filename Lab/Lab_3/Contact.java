package CS203Course.Lab.Lab_3;

import java.util.ArrayList;

public class Contact {

    private ArrayList<Integer> phoneNumber;
    private ArrayList<String> email;
    private ArrayList<Address> address;


    public Contact(){

    }

    public Contact(ArrayList<Integer> phoneNumber, ArrayList<String> email) {

        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public ArrayList<Integer> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(ArrayList<Integer> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    public void setEmail(ArrayList<String> email) {
        this.email = email;
        //fixme use the arrayList method add() - set() - remove() - size()
    }
}
