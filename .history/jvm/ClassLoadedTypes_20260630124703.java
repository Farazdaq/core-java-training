import java.util.ArrayList;

public class ClassLoadedTypes {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader()); // print null as not java object 
        System.out.println(ArrayList.class.getClassLoader()); // no Extension any more for j9 as it can be loaded by Bootstrap class loader 
        System.out.println(Employee.class.getClassLoader());
        
    }
}
