package CS203Course.Lab.Lab_3_3;

import java.util.ArrayList;

public class AddressBookTester {

    public static void main(String[] args) {
        AddressBook contactBook = new AddressBook();
        ArrayList<Contact> contactBook1 = new ArrayList<>();

        //creating arrayList to store email and phone numbers
        ArrayList<EmailAddress> emailAddress = new ArrayList<>();
        ArrayList<PhoneNumber> phoneNumbers = new ArrayList<>();

        //creating email
        EmailAddress email1 = new EmailAddress();
        EmailAddress email2 = new EmailAddress();
        PhoneNumber phone1 = new PhoneNumber();
        PhoneNumber phone2 = new PhoneNumber();
        //adding the element to the arrays
        emailAddress.add(email1);
        emailAddress.add(email2);
        phoneNumbers.add(phone1);
        phoneNumbers.add(phone2);
        //setting
        email1.setEmailAddress("Silukeen1@gmail.com");
        email2.setEmailAddress("raregawi@miu.edu");
        phone1.setNumber(2066025164);
        phone2.setLandLine(123456789);

        //creating arraylist of contacts
        ArrayList<Contact> businessContact = new ArrayList<>();
        ArrayList<Contact> personalContact = new ArrayList<>();
        //creating contacts
        Contact personal1 = new Contact();
        Contact personal2 = new Contact();
        Contact business1 = new Contact();
        Contact business2 = new Contact();
        //adding contact to the arrayList
        personalContact.add(personal1);
        personalContact.add(personal2);
        businessContact.add(business1);
        businessContact.add(business2);

        //setting the contacts
        businessContact.set(0, business1);
        businessContact.set(1, business2);
        personalContact.set(0, personal1);
        personalContact.set(1, personal2);

        personal1.setFirstName("Keleab");
        personal1.setLastName("Aregawi");
        personal1.setNotes("Feels good to see it running");

        personal2.setFirstName("Haben");
        personal2.setLastName("Brhanemeskel");
        personal2.setNotes("Finally it is working");



        business1.setFirstName("Maharishi");
        personal1.setNotes("business is working");
        business2.setFirstName("Walmart");
        business1.setNotes("kkkkkkkkkkkkk business 1");
        business2.setNotes("Is it working fine?");

        //adding personal and business contact to the address Book
        contactBook.addBusinessContact(business1);
        contactBook.addBusinessContact(business2);
        contactBook.addPersonalContact(personal1);
        contactBook.addPersonalContact(personal2);

        for (Contact p : personalContact) {
            System.out.println(p.getFirstName());
        }

        for (Contact p : businessContact) {
            System.out.println(p.getNotes());
        }

    }
}
