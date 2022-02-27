import java.util.Arrays;

/**
 * 堆排序（Heapsort）是指利用堆这种数据结构所设计的一种排序算法。堆积是一个近似完全二叉树的结构，并同时满足堆积的性质：即子结点的键值或索引总是小于（或者大于）它的父节点。
 *
 *
 * 该过程结合mask矩阵和backgound(背景图片矩阵)
 *
 *
 */
public class HeapSort {


    public static void main(String[] args) {
        int[] arr = new int[] { 2, 8, 7,2, 9, 4, 1, 5, 0 };
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void heapSort(int []arr){
//        for (int i = arr.length-1; i >=0; i--) {
//            buildHeap(arr,i);
//            swap(arr,0,i);
//        }
//    }
//
//    public static void buildHeap(int []arr, int end){
//        int len = end + 1;
//        for (int i = len/2 -1; i>=0; i--){
//            int left = 2 * i +1;
//            int right = left + 1;
//            int p = left;
//            if (right < len && arr[p]<arr[right]){
//                p = right;
//            }
//            if (arr[i] < arr[p]){
//                swap(arr,i,p);
//            }
//        }
//    }
//
//    public static void swap(int arr[],int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

//    public static void heapSort(int []arr){
//        for (int i = arr.length-1; i >=0; i--) {
//            buildHeap(arr,i);
//            swap(arr,0,i);
//        }
//    }
//
//
//    public static void buildHeap(int []arr,int end){
//        int len = end+1;
//        for (int i = len/2 - 1; i >=0 ; i--) {
//            int left = 2*i + 1;
//            int right = left + 1;
//            int p = left;
//            if (right<len && arr[left]<arr[right]){
//                p = right;
//            }
//            if (arr[p]>arr[i]){
//                swap(arr,p,i);
//            }
//        }
//    }
//
//    public static void swap(int []arr,int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

//    public static void heapSort(int []arr){
//        for (int i = arr.length-1; i >= 0; i--) {
//            buildHeap(arr,i);
//            swap(arr,i,0);
//        }
//    }
//
//    public static void buildHeap(int []arr,int end){
//        int len = end+1;
//        for (int i = len/2-1; i >= 0; i--) {
//            int left = 2*i+1;
//            int right = left+1;
//            int p = left;
//            if (right<len && arr[left]<arr[right]){
//                p = right;
//            }
//            if (arr[p]>arr[i]){
//                swap(arr,p,i);
//            }
//        }
//    }
//
//    public static void swap(int []arr,int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

    public static void heapSort(int[] arr){
        for (int i = arr.length-1; i >=0 ; i--) {
            buildHeap(arr,i);
            swap(arr,i,0);
        }
    }

    public static void buildHeap(int[] arr, int end){
        int len = end+1;
        for (int i = len/2-1; i >=0 ; i--) {
            int left = 2*i+1;
            int right = left+1;
            int p = left;
            if (right<len && arr[left]<arr[right]){
                p = right;
            }
            if (arr[p]>arr[i]){
                swap(arr,p,i);
            }
        }
    }

    public static void swap(int[]arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}

