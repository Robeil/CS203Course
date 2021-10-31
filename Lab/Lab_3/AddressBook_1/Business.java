package CS203Course.Lab.Lab_3.AddressBook_1;

public class Business extends Contact {

    protected String name;

    public Business() {
        super();
        name = "Space-X";
    }

    public Business(String name) {
        super();
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Printing name
    public String printName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "\nBusiness contact " + "\n" + "Business name: " + name + super.toString();
    }

}
