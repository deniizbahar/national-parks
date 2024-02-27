import java.util.ArrayList;
import java.util.List;

public class MilliPark {
    private String nationalparkName;
    private String cityName;
    private int year;
    private int area;



    public MilliPark(String nationalparkName, String cityName, int year, int area) {
        this.nationalparkName = nationalparkName;
        this.cityName = cityName;
        this.year = year;
        this.area = area;

    }
    public String getNationalparkName() {
        return nationalparkName;
    }
    public String getCityName() {
        return cityName;
    }
    public int getYear() {
        return year;
    }
    public int getArea() {
        return area;
    }



}

