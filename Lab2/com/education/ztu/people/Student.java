package Lab2.com.education.ztu.people;

import Lab2.com.education.ztu.models.Gender;
import Lab2.com.education.ztu.models.Location;
import Lab2.com.education.ztu.vehicles.Car;

public class Student extends Person {
    private static int counter = 0;
    private Car car;
    private int course;
    private String fullInfo;
    private String speciality;
    private String university;

    public Student() {
        super("No firstname provide", "No lastname provide", 0, Gender.CROISSANT, Location.BERDYCHIV);
        this.course = 1;
        this.university = "Zhytomyr Harvard";
        this.speciality = "Iron Man";
        counter++;
    }

    public Student(String firstname, String lastname, int age, Gender gender, Location location,
                   int course, String university, String speciality, Car car) {
        super(firstname, lastname, age, gender, location);
        this.course = course;
        this.university = university;
        this.speciality = speciality;
        this.car = car;
        counter++;
    }

    public Student(String firstname, int age, String speciality) {
        this.firstname = firstname;
        this.age = age;
        this.speciality = speciality;
        counter++;
    }

    public static int showCounter() {
        return counter;
    }

    @Override
    public void getOccupation() {
        System.out.println("I am a student.");
    }

    @Override
    public void haveacar() {
        System.out.println(car.getInfo());
    }
}
