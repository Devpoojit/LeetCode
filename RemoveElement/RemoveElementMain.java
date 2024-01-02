package RemoveElement;

/**
 * RemoveElementMain
 */
public class RemoveElementMain {

    public static void main(String[] args) {
        //Tests
        RemoveElement ob = new RemoveElement();
        RemoveElement ob2 = new RemoveElement();
        int res = ob.removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println("--------------------------\n" + res);
        System.out.println("--------------------------\n");
        int res2 = ob2.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        System.out.println("--------------------------\n" + res2);


        
    }
}