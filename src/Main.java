import model.*;

public class Main {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        Heapsort.sort(arr);
        for (int a: arr) {
            System.out.println(a);
        }
    }
}