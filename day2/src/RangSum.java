/**
 * 频繁的求数据 L-R 的和
 */
public class RangSum {

    //求和后的数组
    private int[] preSum;

    public static void main(String[] args) {

    }

    /**
     * 创建一个从头加到尾的数组
     * @param arr
     */
    public   RangSum(int[] arr){
        int N = arr.length;
        preSum = new int[N];
        //第一个位置就取自己 第二个位置 就是原数组的一个位置加上原数组第二个位置的和 以此类推
        preSum[0] = arr[0];
        for (int i=1;i<N;i++){
            preSum[i] = preSum[i - 1] + arr[i];
        }
    }

    /**
     *1、如果是 0-r 直接取r上的值
     * 2、如果 是l-r 则计算方式为 0-r的值 - 0~l-1的值
     */
    public int rangSum2(int l,int r){
        return l == 0 ? preSum[r] : preSum[r] - preSum[l-1];
    }

}
