package Lab2.com.education.ztu;

import Lab2.com.education.ztu.models.Gender;
import Lab2.com.education.ztu.people.Employee;
import Lab2.com.education.ztu.people.Student;
import Lab2.com.education.ztu.people.Teacher;
import Lab2.com.education.ztu.vehicles.Car;
import Lab2.com.education.ztu.models.Location;

public class Main {
    public static void main(String[] args) {
        Car teacherCar = new Car("Toyota");
        Car studentCar = new Car("Honda");
        Car employeeCar = new Car("Ford");

        Teacher teacher1 = new Teacher("John", "Doe", teacherCar);
        Teacher teacher2 = new Teacher("Alice", "Smith", 30, Gender.FEMALE, Location.KIEV,
                "Math", "KPI", teacherCar);

        Student student1 = new Student("Bob", "Johnson", 20, Gender.MALE, Location.VINNYTSYA, 2, "University A",
                "Computer Science", studentCar);
        Student student2 = new Student("Eve", 21, "Biology");

        Employee employee1 = new Employee("James", "Brown", 28, Gender.MALE, Location.ZHYTOMYR,
                "Company X", "Manager", employeeCar);
        Employee employee2 = new Employee("Linda", "Davis", 28, Gender.FEMALE, Location.ZHYTOMYR,
                "Company Y", "HR Manager", employeeCar);

        System.out.println("=====================================================================");
        System.out.println("Teacher counter: " + Teacher.showCounter());
        System.out.println("Student counter: " + Student.showCounter());
        System.out.println("Employee counter: " + Employee.showCounter());
        System.out.println("=====================================================================");
        teacher1.sayFullName();
        teacher1.sayAge();
        teacher1.sayLocation();
        teacher1.sayGender();
        teacher1.whoIAm();
        teacher1.getOccupation();
        teacher1.haveacar();
        System.out.println("______________________________________________________________________");
        student1.sayFullName();
        student1.sayAge();
        student1.sayLocation();
        student1.sayGender();
        student1.whoIAm();
        student1.getOccupation();
        student1.haveacar();
        System.out.println("______________________________________________________________________");
        employee1.sayFullName();
        employee1.sayAge();
        employee1.sayLocation();
        employee1.sayGender();
        employee1.whoIAm();
        employee1.getOccupation();
        employee1.haveacar();
        
        System.out.println("=====================================================================");
        // Demonstrate instanceof operator
        if (teacher1 instanceof Teacher) {
            System.out.println("teacher1 is an instance of Teacher.");
        }

        if (student1 instanceof Student) {
            System.out.println("student1 is an instance of Student.");
        }

        if (employee1 instanceof Employee) {
            System.out.println("employee1 is an instance of Employee.");
        }

        System.out.println("=====================================================================");
        // Demonstrate Operation class methods
        System.out.println("Addition: " + Operation.addition(2, 3, 4));
        System.out.println("Subtraction: " + Operation.subtraction(10, 5, 2));
        System.out.println("Multiplication: " + Operation.multiplication(2, 3, 4));
        System.out.println("Division: " + Operation.division(20, 5, 2));
        System.out.println("Average: " + Operation.average(1, 2, 3, 4, 5));
        System.out.println("Maximum: " + Operation.maximum(10, 20, 30, 5));
        System.out.println("Minimum: " + Operation.minimum(3, 8, 1, 6));

        System.out.println("=====================================================================");
        // Enum Location values
        Location[] locations = Location.values();
        System.out.println("Locations:");
        for (Location location : locations) {
            System.out.println(location);
        }
    }
}
