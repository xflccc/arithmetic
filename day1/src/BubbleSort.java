import java.util.Objects;

/**
 * @auther XuGeGe
 * @date 2022/6/4
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5,3,6,89,7,5,4,3,8,9};
        print(arr);
        bubSort(arr);
        print(arr);
        bubSortGomin(arr);
        print(arr);

    }

    /**
     * 从大到小
     * @param arr
     */
    public static void  bubSort(int[] arr){
        if (Objects.isNull(arr) || arr.length<2){
            return;
        }
        for (int i=0; i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j] < arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    /**
     * 从小到大
     * @param arr
     */
    public static void bubSortGomin(int[] arr){
        if (Objects.isNull(arr) || arr.length<2){
            return;
        }
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    /**
     * 左神的
     * @param arr
     */
    public static void sort(int[] arr){
        if (Objects.isNull(arr) || arr.length<2){
            return;
        }
        int N = arr.length;
        for (int end=N-1;end>=0;end--){
            for (int second = 1;second<=end;second++){
                if (arr[second-1] > arr[second]){
                    swap(arr,second-1,second);
                }
            }
        }
    }

    public static void swap(int[] arr,int   i,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
