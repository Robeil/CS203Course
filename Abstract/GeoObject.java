package CS203Course.Abstract;

abstract class GeoObject {
    private boolean isFilled;
    private String color;

    protected GeoObject() {
    }

    protected GeoObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "GeoObject{" +
                "isFilled=" + isFilled +
                " color=" + color + '\'' +
                '}';
    }
}
