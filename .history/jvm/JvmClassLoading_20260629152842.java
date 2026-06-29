// This class simulate the loading of jvm for Employee class and return the class-class object
// which stored in the Heap area by the JVM available of programmer. 

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JvmClassLoading {
    public static void main(String[] args) throws ClassNotFoundException {
      Class<?> getTheLoadedClass = Class.forName("Employee");
      Method[] loadedClassMethods = getTheLoadedClass.getDeclaredMethods();
      Field[]  loadedClassFiled = getTheLoadedClass.getDeclaredFields();

      System.out.println( "Hi, I AM JVM, My Class loader Sub-System Has Loaded as i Got in My Heap Memory Area" );

      System.out.println( "-------------Methods--------------" );
      for(Method lcm :  loadedClassMethods ) {
        System.out.println(lcm);
      }
      System.out.println( "-------------Variables--------------" );
      for(Field lcf :loadedClassFiled ) {
        System.out.println(lcf );
      }
    }
}
