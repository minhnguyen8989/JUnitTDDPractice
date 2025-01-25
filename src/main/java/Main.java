import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Minh Nguyen", 31, LocalDate.of(1993, 1, 24));

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("DOB: " + person.getBirthday());

        if (person.isBirthdayToday()) {
            System.out.println(person.getName() + "'s birthday is today!");
            person.setAge(person.getAge() + 1);
        } else {
            System.out.println("not your birthday");
        }
    }
}
