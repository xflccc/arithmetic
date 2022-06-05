/**
 * @auther XuGeGe
 * @date 2022/6/4
 */
public class Dome {

    public static void main(String[] args) {
//        int num = 2;
//        print(num);

        int a = 22;
        int b = ~a;
        System.out.println(a);
        System.out.println(b);
        print(a);
        print(b);
    }

    public static void print(int num) {
        for (int i = 31 ; i>=0; i--){
            System.out.print((num & (1<<i)) == 0 ? "0" :"1");
        }
        System.out.println();
    }
}
