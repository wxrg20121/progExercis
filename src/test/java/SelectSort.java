import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 8, 7, 9, 4, 2, 5, 0 };
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void selectSort(int []arr){
//        for (int i = 0; i < arr.length; i++) {
//            int index = i;
//            for (int j = i; j < arr.length; j++) {
//                if (arr[j] < arr[index]){
//                    index = j;
//                }
//            }
//            int temp = 0;
//            temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;
//        }
//    }
//    public static void selectSort(int []arr){
//
//        for (int i=0; i<arr.length; i++){
//            int index = i;
//            for (int j=i+1; j<arr.length; j++){
//                if (arr[j]<arr[index]){
//                    index = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;
//        }
//
//    }

//    public static void selectSort(int []arr){
//        for (int i = 0; i < arr.length; i++) {
//            int index = i;
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[j]<arr[index]){
//                    index = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;
//
//        }
//    }

    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

}
