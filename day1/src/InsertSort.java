import java.util.Objects;

/**
 * @auther XuGeGe
 * @date 2022/6/4
 * 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        int[]  arr = {2,5,6,3,7};
        print(arr);
        insertSort(arr);
        print(arr);
    }

    public static void insertSort(int[] arr){
        if (Objects.isNull(arr) || arr.length<2){
            return;
        }
        int N = arr.length ;
        for (int end=1;end< N;end++){
            int newNum = end;
            while (newNum-1 >= 0 && arr[newNum -1] > arr[newNum]){
                swap(arr,newNum-1,newNum);
                newNum--;
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
