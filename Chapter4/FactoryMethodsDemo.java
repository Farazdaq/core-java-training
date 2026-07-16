package Chapter4;

public class FactoryMethodsDemo {
    private String name;


    private FactoryMethodsDemo(String name){

        this.name = name;

    }


    public static FactoryMethodsDemo createPatient(String name){

        return new FactoryMethodsDemo(name);

    }

}
