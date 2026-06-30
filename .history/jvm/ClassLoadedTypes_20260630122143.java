public class ClassLoadedTypes {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println("");
        System.out.println(Employee.class.getClassLoader());
        
    }
}
