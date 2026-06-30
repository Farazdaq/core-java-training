public class CustomClassLoader extends ClassLoader {

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {

        // custom loading logic goes here

        return super.loadClass(name);
    }
}