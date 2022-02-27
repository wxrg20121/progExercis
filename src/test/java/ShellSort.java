import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 8, 7, 9, 4, 2, 5, 0 };
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int []arr){
        for (int gap = arr.length/2; gap>0; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j-gap>=0 && arr[j]<arr[j-gap]){
                    swap(arr,j,j-gap);
                    j-=gap;
                }
            }
        }
    }

    public static void swap(int []arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
