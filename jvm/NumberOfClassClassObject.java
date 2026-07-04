// This to prove that For every load/red .class file 
// JVM will only on class-class object even if it’s used many times across the program.

public class NumberOfClassClassObject {
    public static void main(String[] args) throws ClassNotFoundException {
        Employee employee1 = new Employee();
        Class<?> getTheLoadedClassEmployee1 = Class.forName("Employee");


        Employee employee2 = new Employee();
        Class<?> getTheLoadedClassEmployee2 = Class.forName("Employee");


      
        System.out.println(getTheLoadedClassEmployee1 == getTheLoadedClassEmployee2 );

        if (getTheLoadedClassEmployee1 == getTheLoadedClassEmployee2) {
        System.out.println("Come on i am your smart JVM(😂😂), Do think will create 2 class class object \n in my Heap Area for class Employee \n Just because or created 2 Object of Type \n be smart i mad it only first Time");
        System.out.println("i Had the same ID for Employee class object " +"ID1(FIRST TIME):" + getTheLoadedClassEmployee1.hashCode()+"\n"+"ID2(SECOND TIME):" + getTheLoadedClassEmployee2.hashCode() );

        } 
        else 
        { 
            System.out.println("Oops, i mad 2 the class Object for Employee, Twice ");

         }
    }
    
}
