package CS203Course.Lab.Lab_1_1.testpackage;

import CS203Course.Lab.Lab_1.Question_8.myutil.Person;

public class TestProgram {

    public static void main(String[] args) {

        //calling the constructor
        Person firstPerson = new Person();
        System.out.println(firstPerson.getName());

        firstPerson.setName("Robeil");
        //calling one of the Person Method
        String name = firstPerson.getName();
        System.out.println(name);

    }
}
