package Chapter4;

public class ConstructorChaining {
    String name;

    double salary;


    ConstructorChaining(String name, double salary){

        this.name = name;

        this.salary = salary;

    }


    ConstructorChaining(double salary){

        this("Unknown", salary);

    }
}
