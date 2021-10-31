package CS203Course.Lab.Lab_3;

import java.util.ArrayList;

public class ContactTest {

    public static void main(String[] args) {
        //creating contact-book
        Contact contactBook = new Contact();
        //creating business array list and person array list
        Business business = new Business();
        Person person0 = new Person();
        Address address0 = new Address();

        ArrayList<Person> person = new ArrayList<>(); //fixme storing
        ArrayList<Address> addresses = new ArrayList<>();

        Address address = new Address("3699", "1000", "Fairfield", "IOWA", 956352);
        Person newPerson = new Person("Haben", "Aregawi", address);

        person0.addPerson("Silu", "Brhin",address);//adding person method is working HERE

        Business business0 = new Business();
        Business business1 = new Business("Facebook", new Address("3636", "123th st", "Log angelos", "LA", 362514));

        Contact[] myContact = {newPerson, person0, business, business0, business1};


        //Printing all the information
       /* for (Contact c : myContact) {
            System.out.print(c.toString() + "\n");
        }*/
        business.setName("Meta");
        business.setEmail("MetaNew@gmail.com");
        business.setPhoneNumber("111-222-3333");

        person0.setFirstName("Hannah");
        person0.setLastName("Brhanemeskel");
        person0.setEmail("Hannah.@mit.edu");
        person0.setPhoneNumber("333-222-1111");
        //person0.addPerson(); fixme why this shows me the option of the addPerson() method



        System.out.println("\nPhone Numbers:");
        //printing phone numbers
       /* for (Contact n : myContact) {
            System.out.print(n.+ "\n");
        }*/
     /*   //printing phone numbers
        for (Contact p : myContact) {
            System.out.print(p.getPhoneNumber() + "\n");
        }
        System.out.println("\nEmail Address:");
        //printing Email Address
        for (Contact e : myContact) {
            System.out.print(e.getEmail() + "\n");
        }
        System.out.println("\nAddress:");*/
        //printing Email Address
      /*  for (Contact a : myContact) {
            System.out.print(a.printAddress()+"\n");
        }*/
        //Printing extra note
       /* for (Contact n : myContact) {
            System.out.print(n.);
        }*/

        // storing the address

/*
        //adding person to my contact
        addresses.add(address);
        //Storing person
        person.add( newPerson);
        person.add(person0);


        //Printing every person in my contact
        for(Person p: person){
            System.out.println(p +" ");
        }*/
        Person[] newPer ={person0};
        Address addressH = new Address("samuelHAile333@gamil.com","1007 17th st","Dallas","TX",3625);
        person0.addPerson("Samuel","Haile",addressH);

        Address addressM = new Address("Hopeofmaria333@gamil.com","9999 6th st","Dekemhare","DB",65231);
        person0.addPerson("Meron","Tekle",addressM);

        for(Person p: newPer){
            System.out.println(p +" ");
        }
    }
}