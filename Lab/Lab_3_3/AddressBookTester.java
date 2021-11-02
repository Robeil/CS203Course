package CS203Course.Lab.Lab_3_3;

import java.util.ArrayList;

public class AddressBookTester {

    public static void main(String[] args) {

        ArrayList<AddressBook> contactBook = new ArrayList<>();

        AddressBook businessContact = new AddressBook();
        AddressBook personalContact = new AddressBook();
        AddressBook address = new AddressBook();

        //ArrayList<AddressBook> businessContact = new ArrayList<>();
        //ArrayList<AddressBook> personalContact = new ArrayList<>();
        //ArrayList<Contact> address = new ArrayList<>();

        Contact personal1 = new Contact();
        Contact business1 = new Contact();
        Contact address1 = new Contact();

        Address address0 = new Address(0, 1, "SeaTac", "WA", 98188);

        contactBook.add(personalContact);
        contactBook.add(businessContact);
        contactBook.add(address);

        businessContact.addBusinessContact(business1);


    }
}
