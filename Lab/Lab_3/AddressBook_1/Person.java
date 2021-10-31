package CS203Course.Lab.Lab_3.AddressBook_1;

import java.util.ArrayList;

public class Person extends Contact {

    protected String firstName;
    protected String lastName;


    //protected ArrayList<Person> person = new ArrayList<>();

    public Person() {
        super();
        //person.add(this);
        firstName = "Robeil";
        lastName = "Aregawi";

    }

    public  Person(String firstName, String lastName) {
        super();
        //person.add(this);
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String printName() {
        return this.firstName + " " + this.lastName;
    }

    //Adding new person
   /* public boolean addPerson(String firstName, String lastName) {
        //this.person = person;
        //return person.add(this);
    }*/
   //getting the added new person HERE
   /* public Person getAddedPerson(int index){
        return person.get(index);
    }*/
    //Printing Personal sorted names
   /* public String printPersonalName() {
        return printName();
    }*/
    //adding new contact name

   /* public void addNewPerson(String firstName, String lastName){
     person.add(new Person(firstName,lastName));

    }*/
    //Editing existed contact fixme try given arrayList and number index
   /* public void editContact(int index, Person person,String firstName, String lastName){
        this.person.set(index,person);
        person.setFirstName(firstName);
        person.setLastName(lastName);
    }
    //Removing existed contact name
    public void removeContact(int index){
        this.person.remove(index); //fixme for now but ad it to arrayList and you can remove it ???????
        //this.person.set(index,null);
    }
*/
    @Override
    public String toString() {
        return "\nPersonal Contact " + "\nFull name: " + firstName + " " + lastName + super.toString();
    }
}
