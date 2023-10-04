package Lab2.com.education.ztu.people;

import Lab2.com.education.ztu.models.Gender;
import Lab2.com.education.ztu.models.Location;
import Lab2.com.education.ztu.vehicles.Car;

public class Teacher extends Person {
    private static int counter = 0;
    private Car car;
    private String fullInfo;
    private String subject;
    private String university;

    public Teacher() {
        this.firstname = "No firstname provide";
        this.lastname = "No lasttname provide";
        this.car = new Car("No Brand provided");
        counter++;
    }

    public Teacher(String firstname, String lastname, Car car) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.car = car;
        counter++;
    }

    public Teacher(String firstname, String lastname, int age, Gender gender, Location location,
                   String subject, String university, Car car) {
        super(firstname, lastname, age, gender, location);
        this.subject = subject;
        this.university = university;
        this.car = car;
        counter++;
    }

    public static int showCounter() {
        return counter;
    }

    @Override
    public void getOccupation() {
        System.out.println("I am a teacher.");
    }

    @Override
    public void haveacar() {
        System.out.println(car.getInfo());
    }
}
