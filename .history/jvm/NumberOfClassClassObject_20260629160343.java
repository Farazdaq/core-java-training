// This to prove that For every load/red .class file 
// JVM will only on class-class object even if it’s used many times across the program.

public class NumberOfClassClassObject {
    public static void main(String[] args) throws ClassNotFoundException {
        Employee employee1 = new Employee();
        Class<?> getTheLoadedClassEmployee1 = Class.forName("Employee");


        Employee employee2 = new Employee();
        Class<?> getTheLoadedClassEmployee2 = Class.forName("Employee");


        System.out.println(getTheLoadedClassEmployee1.hashCode());
        System.out.println(getTheLoadedClassEmployee2.hashCode());
        System.out.println(getTheLoadedClassEmployee1 == getTheLoadedClassEmployee2 );
        if (getTheLoadedClassEmployee1 == getTheLoadedClassEmployee2) {} else {}
    }
    
}
