import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Working with Person Class

        Person person = new Person("Minh Nguyen", 31, LocalDate.of(1993, 1, 23));


        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("DOB: " + person.getBirthday());

        System.out.println(LocalDate.now());

        System.out.println(person.isBirthdayToday());

        if (person.isBirthdayToday()) {
            System.out.println(person.getName() + "'s birthday is today!");
        } else {
            System.out.println("It is not your birthday today!" + person.getName());
        }


        //Working with Vehicles Class encapsulation and inheritance


        Vehicles vehicle1 = new Vehicles("Honda", 2020,"Civic");
        Vehicles vehicle2 = new Vehicles("Toyota", 2010,"Camry");

        System.out.println(vehicle2.getMake());
        System.out.println(vehicle1.getYear());
        vehicle2.setMake(vehicle2.getMake() + " Legendary " + vehicle2.getYear());
        vehicle1.setYear(vehicle1.getYear() - 1);

        System.out.println(vehicle1.getMake());
        System.out.println(vehicle2.getModel());
        System.out.println(vehicle2.getMake());
        System.out.println(vehicle1.getYear());

        //Working with child class Sedan to parent class Vehicles
        Sedan sedan = new Sedan("Nissan", 2000, "Kicks");
        sedan.turnOn();
        sedan.turnOff();

        vehicle1.turnOn();
        vehicle2.turnOff();

        //Working with polymorphism

        Vehicles myExotic = new Sedan("Ferrari");
        myExotic.turnOff();



    }
}
