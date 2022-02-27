import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 8, 7, 9, 4, 2, 5, 0 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void bubbleSort(int [] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-1-i; j++) {
//                if (arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//    }

//    public static void bubbleSort(int []arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length-1-i; j++) {
//                if (arr[j]>arr[j+1]){
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }

//    public static void bubbleSort(int []arr){
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr.length-1-i; j++) {
//                int temp = arr[j];
//                if (temp>arr[j+1]){
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//    }

    public static void bubbleSort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                int temp = arr[j];
                if (temp>arr[j+1]){
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


}
