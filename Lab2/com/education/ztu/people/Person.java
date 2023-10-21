package Lab2.com.education.ztu.people;

import Lab2.com.education.ztu.interfaces.Human;
import Lab2.com.education.ztu.models.Gender;
import Lab2.com.education.ztu.models.Location;

public abstract class Person implements Human {
    protected int age;
    protected  String firstname;
    protected String lastname;
    private Gender gender;
    private Location location;

    {
        this.firstname = "No firstname provided";
        this.lastname = "No lastname provided";
        this.age = 0;
        this.gender = Gender.CROISSANT;
        this.location = Location.BERDYCHIV;
    }

    public Person() {
        
    }

    public Person(String firstname, String lastname, int age, Gender gender, Location location) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.location = location;
    }

    public abstract void getOccupation();
    public abstract void haveacar();

    @Override
    public void sayAge() {
        System.out.println("I am " + age + " years old.");
    }

    @Override
    public void sayLocation() {
        System.out.println("I am located in " + location);
    }

    @Override
    public void sayGender() {
        System.out.println("I am " + gender);
    }

    @Override
    public void sayFullName() {
        System.out.println("My name is " + firstname + " " + lastname);
    }

}
