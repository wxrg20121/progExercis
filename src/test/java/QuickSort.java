import java.util.Arrays;

public class QuickSort {



    public static void main(String[] args) {
        int[] arr = new int[] { 2, 8, 7,2, 9, 4, 1, 5, 0 };
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

//    public static int partition(int []arr,int left, int right){
//        int temp = arr[left];
//        while (left<right){
//            while (temp<=arr[right] && left<right){
//                right--;
//            }
//            if (left<right){
//                arr[left] = arr[right];
//                left++;
//            }
//
//            while (temp>=arr[left] && left<right){
//                left++;
//            }
//
//            if (left<right){
//                arr[right] = arr[left];
//                right--;
//            }
//        }
//        arr[left] = temp;
//        return left;
//    }
//    public static void quickSort(int []arr,int left, int right){
//        if (left>=right){
//            return;
//        }
//        int mid = partition(arr,left,right);
//        quickSort(arr,left,mid);
//        quickSort(arr,mid+1,right);
//    }

//    public static void quickSort(int []arr,int left,int right){
//        if (left<right){
//            int mid = partition(arr,left,right);
//            quickSort(arr,left,mid);
//            quickSort(arr,mid+1,right);
//        }
//    }
//
//    public static int partition(int []arr,int left,int right){
//        int temp = arr[left];
//
//        while (left<right){
//            while (arr[right]>=temp && left<right){
//                right--;
//            }
//            if (left<right){
//                arr[left]=arr[right];
//                left++;
//            }
//            while (arr[left]<=temp && left<right){
//                left++;
//            }
//            if (left<right){
//                arr[right]=arr[left];
//                right--;
//            }
//        }
//        arr[left]=temp;
//        return left;
//    }

    public static void quickSort(int[] arr, int left, int right){
        if (left<right){
            int mid = partition(arr, left, right);
            quickSort(arr,left,mid);
            quickSort(arr,mid+1,right);
        }
    }

    public static int partition(int[] arr, int left, int right){
        int temp = arr[left];
        while (left<right){
            while (arr[right]>=temp && left<right){
                right--;
            }
            if (left<right){
                arr[left] = arr[right];
                left++;
            }
            while (arr[left]<=temp && left<right){
                left++;
            }
            if (left<right){
                arr[right] = arr[left];
                right--;
            }

        }
        arr[left] = temp;
        return left;
    }

}
