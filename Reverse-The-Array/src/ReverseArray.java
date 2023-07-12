 import java.util.Scanner;
 public class ReverseArray {
        public static int[] reverseArray(int[] arr, int b, int c){
            int i = b, j = c;
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            return arr;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scanner.nextInt();
            }
            arr = reverseArray(arr,0,n-1);
            for(int i=0;i<n;i++){
                System.out.println(arr[i] + " ");
            }
        }
}
