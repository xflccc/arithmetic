/**
 * @auther XuGeGe
 * @date 2022/6/4
 *  阶乘相加    1!+2!+...+   N!
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(f1(1));
        System.out.println(f1(2));
        System.out.println(f1(3));
    }

    /**
     * 1!+2!+...+   N!
     */
    public static int f1(int num){
        int count = 0;
        int index = 1;
        for (int i=1;i<=num;i++){
            index = index*i;
            count += index;
        }
        return count;
    }
}
