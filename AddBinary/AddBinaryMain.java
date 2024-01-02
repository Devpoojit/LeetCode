package AddBinary;

public class AddBinaryMain {
    public static void main(String[] args) {
        AddBinary ob = new AddBinary();
        System.out.println("11 + 1 = " + ob.addBinary("11", "1"));
        System.out.println("1010 + 1011 = " + ob.addBinary("1010", "1011"));
    }
}
