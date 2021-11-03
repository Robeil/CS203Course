package CS203Course.Lab.Lab_3_3;

public class PhoneNumber {

    private int mobile = 0;
    private int landLine = 1;
    private int number;


    public PhoneNumber() {
        this.number = 2066025164;
    }

    public PhoneNumber(int mobile, int landLine, int number) {
        this.mobile = mobile;
        this.landLine = landLine;
        this.number = number;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getLandLine() {
        return landLine;
    }

    public void setLandLine(int landLine) {
        this.landLine = landLine;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
