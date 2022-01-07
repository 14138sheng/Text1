import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        int a = getSum();
        System.out.println("面积为"+a);
    }
    public static int getSum(){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入m");
        int m = s.nextInt();
        System.out.println("请输入n");
        int n = s.nextInt();
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                System.out.print("* ");
            }System.out.println();
        }
        return (m*n);
    }
}
