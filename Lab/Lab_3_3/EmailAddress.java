package CS203Course.Lab.Lab_3_3;

public class EmailAddress {

    private int personal = 0;
    private int professional = 1;
    private String emailAddress;

    public EmailAddress() {
        this.emailAddress = "robeilaregawi1@gmail.com";
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public EmailAddress(int personal, int professional, String emailAddress) {
        this.personal = personal;
        this.professional = professional;
        this.emailAddress = emailAddress;
    }

}
