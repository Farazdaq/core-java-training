package Chapter3.DataType.NonPrimitive;

 interface InterfaceDemo {
    void interfaceMessage();
}

class InterfaceDemo1 implements InterfaceDemo {

    @Override
    public void interfaceMessage() {
        System.out.println("Hi, i am interfaceDemo1");
    }
}

class InterfaceDemo2 implements InterfaceDemo {


    @Override
    public void interfaceMessage() {
        System.out.println("Hi, i am interfaceDemo2");
    }
}
