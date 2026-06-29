// This class simulate the loading of jvm for Employee class and return the class-class object
// which stored in the Heap area by the JVM available of programmer. 


// Imports classes from the java.lang.reflect package, which provides the Java Reflection API.
// Reflection allows a program to inspect, access, and manipulate the fields, methods,
// constructors, and other metadata of classes dynamically at runtime.
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JvmClassLoading {
    public static void main(String[] args) throws ClassNotFoundException {
       // Load the Employee class into the JVM (if it is not already loaded)
      // and obtain its corresponding Class object.
      Class<?> getTheLoadedClass = Class.forName("Employee");


       // Retrieve all methods declared in the Employee class,
      // including private, protected, package-private, and public methods.
     // Inherited methods are not included.
      Method[] loadedClassMethods = getTheLoadedClass.getDeclaredMethods();


        // Retrieve all fields (member variables) declared in the Employee class,
       // including private, protected, package-private, and public fields.
      // Inherited fields are not included.
      Field[]  loadedClassFiled = getTheLoadedClass.getDeclaredFields();

      System.out.println( "Hi, I AM JVM, My Class loader Sub-System Has Loaded as i Got in My Heap Memory Area" );

      System.out.println( "-------------Methods--------------" );

        // Iterate through all methods declared in the Employee class
       // and print their signatures (return type, method name, and parameters)
      // to the console.
      for(Method lcm :  loadedClassMethods ) {
        System.out.println(lcm);
      }
      System.out.println( "-------------Variables--------------" );

       // Loop through each method retrieved from the Employee class
      // and display its details in the console.
      for(Field lcf :loadedClassFiled ) {
        System.out.println(lcf );
      }
    }
}
