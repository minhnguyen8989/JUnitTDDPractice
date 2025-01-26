import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Minh Nguyen", 31, LocalDate.of(1993, 1, 25));


        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("DOB: " + person.getBirthday());

        System.out.println(LocalDate.now());

        System.out.println(person.isBirthdayToday());

        if (person.isBirthdayToday()) {
            System.out.println(person.getName() + "'s birthday is today!");
        } else {
            System.out.println("not your birthday");
        }
    }
}
