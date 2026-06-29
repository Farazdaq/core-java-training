// this class is created to be used in JvmClassLoading class to demonstrate jvm .class file loading process
// done by the class loader sub-system and the creation of class-class object 

class Employee {
    private int empId; // stands for employee  identifier
    private String name;
    private int age;

    public String getName() {
     return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    
}