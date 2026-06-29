// This class simulate the loading of jvm for Employee class and return the class-class object
// which stored in the Heap area by the JVM available of programmer. 

public class JvmClassLoading {
    public static void main(String[] args) throws ClassNotFoundException {
      Class<?> c = Class.forName("Employee");
    }
}
