import java.util.Arrays;

/**
 * 有一个生成1~5的随机数 在不改变该方法的和不适用其他函数的前提下 实现1~7的随机数
 */
public class Random5to7 {


    /**
     *生成随机数1~5
     */
    public static int f1(){
        return (int) ((Math.random() * 5) +1);
    }

    /**
     *将f1生成的随机数1~5 分成3分
     * 1，2 为 0
     * 4.5为1
     * 3就重新刷新
     */
    public static int f2(){
        int ans = 0;
        //ans = 3 刷新
        do {
            ans = f1();
        }while (ans == 3);
        return ans < 3 ? 0:1;
    }

    /**
     * 用二进制的位数来表示1~7的值
     * @return
     */
    public static int f3(){
        int ans = (f2() << 2) + (f2() << 1) +(f2() << 0);
        return ans;
    }

    public static void main(String[] args) {
        int ans = 1+1;
        System.out.println(ans);
        int ans2 = (1<<2) + (1<<1) + (1<<0);
        System.out.println(ans2);
        System.out.println("======================================");


        int times = 10000;
        int[] counts = new int[8];
        for (int i=0;i<times;i++){
            int value = f3();
            counts[value]++;
        }
        for (int i = 0;i<8;i++){
            System.out.println(i + " 出现了：" + counts[i] + "次");
        }


    }
}
