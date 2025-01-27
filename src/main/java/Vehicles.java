public class Vehicles {
    private String Make;
    private int Year;
    private String Model;


    public Vehicles(String make, int year, String model) {
        Make = make;
        Year = year;
        Model = model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }


}
