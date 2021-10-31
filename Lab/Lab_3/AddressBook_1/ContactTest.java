package CS203Course.Lab.Lab_3.AddressBook_1;

import java.util.ArrayList;

public class ContactTest {

    public static void main(String[] args) {

        Business business1 = new Business("The greatest shop");
        business1.setPhoneNumber("222,333,1111");
        business1.setNote("The greatest shop is the best");
        business1.setAddress("3251", "Seattle", "WA", 98188);

        Person person1 = new Person("Soliana", "Robeil");
        person1.setEmail("Sloinarobeil@gmail.com");
        person1.setPhoneNumber("123-456-7899");
        person1.setAddress("3251", "Seattle", "WA", 98188);
        person1.setNote("Soli is my beautiful daughter");

        Business business2 = new Business("Keleab Company");
        business2.setPhoneNumber("333,222,1111");
        business2.setNote("Keleab Company is very fast growing company this year");
        business2.setAddress("3251", "Seattle", "WA", 98188);

        Person person2 = new Person("Keleab", "Brhane");
        person2.setEmail("keleabbrhane@gmail.com");
        person2.setPhoneNumber("321-654-9879");
        person2.setAddress("1111", "San Diago", "LA", 98562);
        person2.setNote("Kalu is my smart brother");

        Business business3 = new Business("HAbu Store ever");
        business3.setPhoneNumber("111,222,3333");
        business3.setNote("Habu store is the best store ever");
        business3.setAddress("3251", "Seattle", "WA", 98188);

        Person person3 = new Person("Haben", "Berhanemeskel");
        person3.setEmail("habushikor@gmail.com");
        person3.setPhoneNumber("456-123-7899");
        person3.setAddress("1203", "SeaTac", "WA", 98188);
        person3.setNote("Habu is my handsome brother");

        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Business> businesses = new ArrayList<>();

        people.add(person1);
        businesses.add(business1);

        people.add(person2);
        businesses.add(business2);

        people.add(person3);
        businesses.add(business3);

        /*
        //Printing all the details fixme --working fine
        System.out.println(person1.toString());
        System.out.println(business1.toString());

       /* //Printing names fixme --working fine
        System.out.println(person.getFirstName());
        System.out.println(business.getName());

        //Printing name using printing method fixme --working fine
        System.out.println(person.printName());
        System.out.println(business.printName());

        //Printing Emails fixme --working fine
        System.out.println(person.getEmail());
        System.out.println(business.getEmail());

        //Printing address fixme --working fine
        System.out.println(person.printAddress());
        System.out.println(business.printAddress());

        //Printing Personal contact name fixme --working fine
        System.out.println(person.printPersonalName());
        System.out.println(business.printBusinessName());*/
/*
        //adding new personal contact
        person1.addNewPerson("Merry", "Tekle"); //fixme ???????
        //System.out.println(person.toString());
        //adding new personal contact
        person1.addNewPerson("Soliana", "Robeil"); //fixme ???????
        //System.out.println(person.toString());
        //adding new personal contact
        person1.addNewPerson("Keleab", "Aregawi"); //fixme ???????
        //System.out.println(person.toString());

        //adding new business contact
        //businesses.add("Maharishi");
        //businesses.add(business.addNewBusiness("Maharishi"));
        businesses.add(business1);
       // business.addNewBusiness(khtgfkjgh);
        System.out.println(businesses.size());
        //System.out.println(business.toString());
       // businesses.add(business.addNewBusiness("Enda Galo"));
        //System.out.println(business.toString());
      //  businesses.add(business.addNewBusiness("Gas Station"));
        //System.out.println(business.toString());

        //Editing name to different fixme --working but it overriding all the conatct
        person1.editContact(0, person1, "Negga", "Come'on");
        //System.out.println(person.toString());

        //Editing name of business fixme --working but it overriding all the conatct
        business1.editBusiness(0, business1, "Meta");
        //System.out.println(business.toString());

        //Removing personal contact fixme not working
        //person.removeContact(2);
        //System.out.println(person.toString());

        //Removing business contact fixme not working
        //business.removeBusiness(2);
        //System.out.println(business.toString());
*/
        //hopefully printing persons
        for (Person p : people) {
            System.out.println(p.toString());
        }

        //hopefully printing business
        for (Business b : businesses) {
            System.out.println(b.toString()+"\n");
        }
        System.out.println("\n");
        //printing only person names contacts
        System.out.println("Contacts Name: ");
        for (Person p : people) {
            System.out.println(p.printName());
        }
        System.out.println("\n");
        //printing only emails contacts
        System.out.println("Contacts Business Name: ");
        for (Business b : businesses) {
            System.out.println(b.getEmail());
        }
        System.out.println("\n");
        //printing only address contacts
        System.out.println("Contacts Address: ");
        for (Business b : businesses) {
            System.out.println(b.printAddress());
        }

        //printing

    }
}
