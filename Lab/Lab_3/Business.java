package CS203Course.Lab.Lab_3;

import java.util.ArrayList;

public class Business extends Contact {

    private String name;
    private Address address;
    private ArrayList<Business> listBusiness;


    public Business() {
        super();
        name = "Space-X";
        listBusiness.add(super.addBusiness(name,address));

    }
    public Business(String name,Address address) {
        super();
        this.name = name;
        listBusiness.add(super.addBusiness(name,address));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Edit an existing business
    //Remove Business contact
    public Business addBusiness(String name, Address address) {

        Business newBusiness = new Business(name,address);

        return newBusiness;
    }

    @Override
    public String toString(){
        return "\nBusiness contact " + "\n" +"Business name: "+ name + super.toString() ;
    }
}
