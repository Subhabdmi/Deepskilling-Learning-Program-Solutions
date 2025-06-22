public class TestClass {
    public static void main(String[] args) {
        Logger ob1 = Logger.getInstance();
        Logger ob2=Logger.getInstance();
        //on printing,we can see the hash codes of both the objects are same.
        //Hence they are equal
        System.out.println(ob1.hashCode());
        System.out.println(ob2.hashCode());
    }
}
