/**
 * @auther XuGeGe
 * @date 2022/6/5
 */
public class Day2Test {
    public static void main(String[] args) {

//        int[] arr = {5,3,6,4,8};
//        RangSum rangSum = new RangSum(arr);
//        int sum2 = rangSum.rangSum2(0, 2);
//        System.out.println(sum2);

        int testTimes = 10000;
        int k = 9;
        int[] counts = new int[9];
        for (int i = 0;i<testTimes;i++){
            int ans = (int) (Math.random() * k);
            counts[ans] ++;
        }
        for (int i = 0;i<k;i++){
            System.out.println(i + "的次数： " + counts[i]);
        }
    }
}
