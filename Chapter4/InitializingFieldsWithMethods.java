package Chapter4;

public class InitializingFieldsWithMethods {
    private static int nextId = 1;

    int id = generateId();


    private int generateId(){

        return nextId++;
    }
}


