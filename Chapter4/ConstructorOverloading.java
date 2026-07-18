package Chapter4;

public class ConstructorOverloading {
    String name;
    int age;

    ConstructorOverloading() {
        name = "Unknown";
        age = 18;
    }

    ConstructorOverloading(String name) {
        this.name = name;
        age = 18;
    }

    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

