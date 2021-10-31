package CS203Course.Lab.Lab_3.AddressBook_1;


import java.util.ArrayList;

public class Business extends Contact {

    protected String name;

    protected ArrayList<Business> business = new ArrayList<>(); //?

    public Business() {
        super();
        name = "Space-X";
        business.add(this);
    }

    public Business(String name) {
        super();
        this.name = name;
        business.add(this);
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

    //Printing Business sorted names
    public String printBusinessName() {
        return printName();
    }

    //adding new business name
    public String addNewBusiness(String name) { // fixme ????? look for me
        //business.add(this);
        //return Business.this;
        //return Business.this;
        business.add(new Business(name));
      return name;
    }

    //Editing existed business name fixme working fine
    public void editBusiness(int index, Business business, String name) { // fixme look for me here
        this.business.set(index, business);
        business.setName(name);
    }

    //Removing existed business name
    public void removeBusiness(int index) {
        business.remove(index); //fixme for now but ad it to arrayList and you can remove it ??????
        //this.business.set(index,null);
    }

    @Override
    public String toString() {
        return "\nBusiness contact " + "\n" + "Business name: " + name + super.toString();
    }

}
