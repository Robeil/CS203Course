//package CS203Course.Lab.Lab_3.AddressBook_1;
//
//import java.util.ArrayList;
//
//public class AddressBook extends Contact {
//
//    protected ArrayList<Contact> personContacts = new ArrayList<>();
//    protected ArrayList<Contact> businessContacts = new ArrayList<>();
//
//    public AddressBook() {
//        /*this.person = new ArrayList<>();
//        this.business = new ArrayList<>();*/
//        businessContacts.add(new Business());
//    }
//
//    public AddressBook(ArrayList<Contact> person, ArrayList<Contact> business) {
//        personContacts.add(new Person());
//        businessContacts.add(new Business());
//    }
//
//    public ArrayList<Contact> getPerson() {
//        return personContacts;
//    }
//
//    public void setPerson(ArrayList<Contact> person) {
//        this.personContacts = person;
//    }
//
//    public ArrayList<Contact> getBusiness() {
//        return businessContacts;
//    }
//
//    public void setBusiness(ArrayList<Contact> business) {
//        this.businessContacts = business;
//    }
//
//    @Override
//    public String toString(){
//        return getPerson() + " "+ getBusiness() +" "+ super.toString();
//    }
//}
