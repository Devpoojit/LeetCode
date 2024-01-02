package PlusOne;

public class PlusOneMain {
    public static void main(String[] args) {
        PlusOne ob = new PlusOne();
        int[] test1 = ob.plusOne(new int[]{1,2,3});
        int[] test2 = ob.plusOne(new int[]{4,3,2,1});
        int[] test3 = ob.plusOne(new int[]{9});
        show(test1);
        show(test2);
        show(test3);
    }

    public static void show(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("-----------------------------------------");
    }
}
