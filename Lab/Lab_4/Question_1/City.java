package CS203Course.Lab.Lab_4.Question_1;


class City implements  Comparable<City>{

    private String cityName;
    private int temperature;

    public City(){

        this.cityName = "New York";
        this.temperature = 23;
    }

    public City(String cityName, int temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int compareTo(City o) {
        if(!(o instanceof  City)) return -1;
        return this.temperature - o.temperature;
    }

}

