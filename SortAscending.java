public class SortAscending {
public static void main(String[] args) {

        if (args.length == 0)
           
        int[] arr = new int[];
for (int i = 0; i < 0; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
for (int i = 0; i < 0 - 1; i++) {
            for (int j = i + 1; j < 0; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
 System.out.println("Numbers in Ascending Order:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}