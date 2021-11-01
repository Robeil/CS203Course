package CS203Course.Lab.Lab_3.AddressBook_1;

import java.util.ArrayList;

public class ContactTest {

    public static void main(String[] args) {
        Contact bookAddress = new Contact();
        ArrayList<AddressBook> addressBooks = new ArrayList<>();

        System.out.println(bookAddress.toString());

        //creating 1st business
        //editing or setting
        Business business1 = new Business("The greatest shop");
        business1.setPhoneNumber("222,333,1111");
        business1.setNote("The greatest shop is the best");
        business1.setAddress("0000", "Denver", "WA", 98188);
        //creating 1st person
        Person person1 = new Person("Soliana", "Robeil");
        person1.setEmail("Sloinarobeil@gmail.com");
        person1.setPhoneNumber("123-456-7899");
        person1.setAddress("3251", "SeaTac", "WA", 98188);
        person1.setNote("Soli is my beautiful daughter");
        //creating 2nd business
        Business business2 = new Business("Keleab Company");
        business2.setPhoneNumber("333,222,1111");
        business2.setNote("Keleab Company is very fast growing company this year");
        business2.setAddress("2222", "New York", "WA", 98188);
        //creating 2nd person
        Person person2 = new Person("Keleab", "Brhane");
        person2.setEmail("keleabbrhane@gmail.com");
        person2.setPhoneNumber("321-654-9879");
        person2.setAddress("2536", "San Diago", "LA", 98562);
        person2.setNote("Kalu is my smart brother");
        //creating 3rd business
        Business business3 = new Business("HAbu Store ever");
        business3.setPhoneNumber("111,222,3333");
        business3.setNote("Habu store is the best store ever");
        business3.setAddress("3636", "Colerado", "WA", 98188);
        //creating 3rd person
        Person person3 = new Person("Haben", "Berhanemeskel");
        person3.setEmail("habushikor@gmail.com");
        person3.setPhoneNumber("456-123-7899");
        person3.setAddress("1203", "SeaTac", "WA", 98188);
        person3.setNote("Habu is my handsome brother");
        //creating arrayList to store the contacts
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Business> businesses = new ArrayList<>();
        //Adding new contacts
        people.add(person1);
        businesses.add(business1);
        people.add(person2);
        businesses.add(business2);
        people.add(person3);
        businesses.add(business3);
        //hopefully printing persons
        for (Person p : people) {
            System.out.println(p.toString());
        }
        //hopefully printing business
        for (Business b : businesses) {
            System.out.println(b.toString()+"\n");
        }
        //printing only person names contacts
        System.out.println("\nContacts Name: ");
        for (Person p : people) {
            System.out.println(p.printName());
        }
        //printing only emails contacts
        System.out.println("\nContacts Business Name: ");
        for (Business b : businesses) {
            System.out.println(b.getName());
        }
        //printing only address contacts
        System.out.println("\nContacts Address: ");
        for (Business b : businesses) {
            System.out.println(b.printAddress());
        }
        //checking length before removing
        System.out.println("\nSize before removing:");
        System.out.println("Person size: " +people.size());
        System.out.println("Business size: " +businesses.size());
        //removing
        people.remove(0);
        businesses.remove(0);
        //checking length after removing
        System.out.println("\nSize after removing:");
        System.out.println("Person size: " +people.size());
        System.out.println("Business size: " +businesses.size());


    }
}
