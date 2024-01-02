package SearchInsertPosition;

public class SearchInsertPosMain {
    public static void main(String[] args) {
        SearchInsertPos ob = new SearchInsertPos();
        SearchInsertPos ob2 = new SearchInsertPos();
        SearchInsertPos ob3 = new SearchInsertPos();
        System.out.println("[1,3,5,6] - 5: " + ob.searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println("[1,3,5,6] - 2: " + ob2.searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println("[1,3,5,6] - 7: " + ob2.searchInsert(new int[]{1,3,5,6}, 7));
    }
}
