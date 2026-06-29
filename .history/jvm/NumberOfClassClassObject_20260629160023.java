// This to prove that For every load/red .class file 
// JVM will only on class-class object even if it’s used many times across the program.

public class NumberOfClassClassObject {
    public static void main(String[] args) throws ClassNotFoundException {
        Employee employee1 = new Employee();
        Class<?> getTheLoadedClass = Class.forName("Employee");

        
        Employee employee2 = new Employee();
        Class<?> getTheLoadedClass2 = Class.forName("Employee");
    }
    
}
