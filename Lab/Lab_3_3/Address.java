package CS203Course.Lab.Lab_3_3;

public class Address{

    private int residential = 0;
    private int commercial = 1;
    private String city;
    private String state;
    private int zip;

    public Address() {
        this.city = "Seattle";
        this.state = "WA";
        this.zip = 98188;
    }

    public Address(int residential, int commercial, String city, String state, int zip) {
        this.residential = residential;
        this.commercial = commercial;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
