public class Demo7 {
    public static void main(String[] args) {
        int [] arr = {20,35,25,40,50};
        //int a = 10; 不能被改变
        //方式1:
        int bn = getMax(arr);
        System.out.println(bn);
        //方式2:
        System.out.println(getMax(arr));
    }
    public static int getMax(int [] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
