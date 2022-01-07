/**
 * 二维数组求和
 */
public class Demo1 {
    public static void main(String[] args) {
    int [][] arr = {{70,80,90},{90,85,80},{99,97,98}};
    int a = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                a += anInt;
            }
        }
    System.out.println(a);
    }
}
