/**
 * return
 */
public class Demo9 {
    public static void main(String[] args) {
        System.out.println(getSum());
        int a = getSum();
        System.out.println(a);
    }
    public static int getSum(){
        int sum = 0;
        for (int i = 1;i <= 10;i++){
            sum+=i;
        }
        return sum;
    }
}
