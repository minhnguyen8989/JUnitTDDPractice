public class Sedan extends Vehicles {

    public Sedan(String make, int year, String model) {
        super(make, year, model);
    }

    public Sedan() {
        super();
    }

    public Sedan(String ferrari) {

    }

    @Override
    public void turnOn() {
        System.out.println(getMake() + " Sedan Turn On");
    }

    public void turnOff() {
        System.out.println(getMake() + "Sedan Turn Off");
    }
}
 