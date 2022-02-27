import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 8, 7, 9, 4, 1, 5, 0 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void insertionSort(int arr[]){
//        for (int i = 1; i < arr.length; i++) {
//            int preIndex = i-1;
//            int current = arr[i];
//            while (preIndex>=0 && arr[preIndex]>current){
//                arr[preIndex+1] = arr[preIndex];
//                preIndex--;
//            }
//            arr[preIndex+1] = current;
//        }
//    }

//    public static void insertionSort(int []arr){
//        for (int i=1; i<arr.length; i++){
//            int preindex = i-1;
//            int val = arr[i];
//            while (preindex>=0 && arr[preindex]>val){
//                arr[preindex+1] = arr[preindex];
//                preindex--;
//            }
//            arr[preindex+1] = val;
//        }
//    }

//    public static void insertionSort(int []arr){
//        for (int i = 1; i < arr.length; i++) {
//            int preindex = i-1;
//            int val = arr[i];
//            while (preindex>=0 && arr[preindex]>val){
//                arr[preindex+1]=arr[preindex];
//                preindex--;
//            }
//            arr[preindex+1]=val;
//        }
//    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int preindex = i-1;
            while (preindex>=0 && arr[preindex]>val){
                arr[preindex+1] = arr[preindex];
                preindex--;
            }
            arr[preindex+1] = val;
        }
    }
}
