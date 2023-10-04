package Lab2.com.education.ztu.people;

import Lab2.com.education.ztu.models.Gender;
import Lab2.com.education.ztu.vehicles.Car;
import Lab2.com.education.ztu.models.Location;

public class Employee extends Person  {
    private static int counter = 0;
    private Car car;
    private String fullInfo;
    private String company;
    private String position;

    public Employee() {
        this.firstname = "No firstname provided";
        this.lastname = "No lastname provided";
        this.car = new Car("No Brand provided");
        this.car.isEngineRunning();
        counter++;
    }

    public Employee(String firstname, String lastname, Car car) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.car = car;
        counter++;
    }

    public Employee(String firstname, String lastname, int age, Gender gender, Location location,
                    String company, String position, Car car) {
        super(firstname, lastname, age, gender, location);
        this.company = company;
        this.position = position;
        this.car = car;
        counter++;
    }

    public static int showCounter() {
        return counter;
    }

    @Override
    public void getOccupation() {
        System.out.println("I am an employee.");
    }

    @Override
    public void haveacar() {
        System.out.println(car.getInfo());
    }
}
