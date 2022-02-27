import java.util.Arrays;

/**
 * 归并排序
 * 归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为2-路归并。
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 8, 7,2, 9, 4, 1, 5, 0 };
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


//    public static void merge(int arr[],int left,int mid,int right){
//        int i = left;
//        int j = mid + 1;
//        int []temp = new int[right-left+1];
//        int k = 0;
//        while (i<=mid && j<=right){
//            if (arr[i]<arr[j]){
//                temp[k++] = arr[i++];
//            }else {
//                temp[k++] = arr[j++];
//            }
//        }
//
//        while (i<=mid){
//            temp[k++] = arr[i++];
//        }
//
//        while (j<=right){
//            temp[k++] = arr[j++];
//        }
//
//        for (int k2 = 0; k2 < temp.length; k2++) {
//            arr[left + k2] = temp[k2];
//        }
//    }
//
//    public static void mergeSort(int []arr,int left,int right){
//        if (left<right){
//            int mid = (left + right)/2;
//            mergeSort(arr,left,mid);
//            mergeSort(arr,mid+1,right);
//            merge(arr,left,mid,right);
//        }
//    }

//    public static void mergeSort(int []arr,int left,int right){
//        if (left<right){
//            int mid = (left+right)/2;
//            mergeSort(arr,left,mid);
//            mergeSort(arr,mid+1,right);
//            merge(arr,left,mid,right);
//        }
//    }
//
//    public static void merge(int []arr,int left,int mid,int right){
//        int []temp = new int[right-left+1];
//        int i=left;
//        int j=mid+1;
//        int k=0;
//        while (i<=mid && j<=right){
//            if (arr[i]<arr[j]){
//                temp[k++]=arr[i++];
//            }else {
//                temp[k++]=arr[j++];
//            }
//        }
//        while (i<=mid){
//            temp[k++]=arr[i++];
//        }
//        while (j<=right){
//            temp[k++]=arr[j++];
//        }
//
//        for (int k2 = 0; k2 < temp.length; k2++) {
//            arr[left+k2]=temp[k2];
//        }
//    }

    public static void mergeSort(int[] arr, int left, int right){
        if (left<right){
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while (i<=mid && j<=right){
            if (arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }
        while (i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=right){
            temp[k++] = arr[j++];
        }
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[left+k2] = temp[k2];
        }
    }

}


