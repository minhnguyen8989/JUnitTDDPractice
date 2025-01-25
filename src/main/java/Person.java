import java.time.LocalDate;

public class Person {

    private String name;
    private int age;

    private LocalDate birthday;

    public Person(String name, int age, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBirthdayToday() {
        LocalDate today = LocalDate.now();
        return birthday.equals(today);
    }
}
