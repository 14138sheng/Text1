import java.util.Arrays;
/**
 *方法
 */
public class Demo2 {
    public static void main(String[] args) {
        int [] arr = {20,10,30,60,50};
        //快速排序
        Arrays.sort(arr);
        for (int i : arr) System.out.print(i + " ");
    }
}
