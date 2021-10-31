package CS203Course.Lab.Lab_3;

public class Address {

    private String email;
    private String street;
    private String city;
    private String state;
    private int zipCode;

    public Address() {
        street = "1234 123th st";
        city = "Seattle";
        state = "WA";
        zipCode = 98188;
    }

    public Address(String email, String street, String city, String state, int zipCode) {
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    //Add-Address


        @Override
        public String toString() {
            return "\nAddress: " + street + " " + city + " " + state + " " + zipCode;
        }

}
