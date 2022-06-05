import java.util.Objects;

/**
 * @auther XuGeGe
 * @date 2022/6/4
 */
public class Select {

    public static void main(String[] args) {
       int[]  arrs  = {13,1,1,2,4,2,3,6,10};
        printArry(arrs);
        select(arrs);
        printArry(arrs);
    }

    /**
     * 选择排序
     */
    public static void select(int[] arrs){
        //判断边界条件
        if (Objects.isNull(arrs) || arrs.length<2){
            return;
        }
        for (int i=0;i<arrs.length;i++){
            //最小小标
            int minIndex =i;
           for (int j = i+1;j<arrs.length;j++){
               minIndex = arrs[j] < arrs[minIndex] ? j : minIndex;
           }
            swap(arrs,i,minIndex);
        }
        System.out.println();
    }

    public static void swap(int[] arrs,int i,int j){
        int temp = arrs[j];
        arrs[j] = arrs[i];
        arrs[i]=temp;
    }

    /**
     * 打印
     * @param arrs
     */
    public static void printArry(int[] arrs){
        for (int i = 0;i<arrs.length;i++){
            System.out.print(arrs[i] + " ");
        }
    }
}
