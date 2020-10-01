import java.util.Scanner;

public class SortAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements of Array : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
        sc.close();
    }
}
