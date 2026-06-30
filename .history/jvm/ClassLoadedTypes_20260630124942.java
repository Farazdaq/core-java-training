import java.util.ArrayList;

public class ClassLoadedTypes {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader()); // print null as not java object and loaded by  Bootstrap class loader 
        System.out.println(ArrayList.class.getClassLoader());  // null,  no Extension any more for j9 as it can be loaded by Bootstrap class loader  and has no object.
        System.out.println(Employee.class.getClassLoader());  // will print as it is loaded by Application class loader as it is in the current app folder
        
    }
}
