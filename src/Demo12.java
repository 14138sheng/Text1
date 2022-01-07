import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args){
            int[] a ={30,50,40,10};
            int number,i,j,m,n;
            System.out.println("原始数组为:");
            for(i=0;i<a.length;i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
            Scanner input = new Scanner(System.in);
            System.out.print("输入要删除的数:");
            number = input.nextInt();
            for (i=0;i<a.length;i++){
                if (a[i]==number){
                    break;
                }
            }
            if(i<a.length){
                if(i <=a.length-2 ){
                    for(j=i;j<a.length-1;j++){
                        a[j]=a[j+1];
                    }
                }
                System.out.println("删除后的数组为:");
                for(m = 0;m < a.length-2;m++) {
                    for (n = 0;n < a.length-m-2;n++) {
                        if(a[n] > a[n+1]) {
                            int a1 = a[n];
                            a[n] = a[n+1];
                            a[n+1] = a1;
                        }
                    }
                }
                for(m = 0;m < a.length-1;m++) {
                    System.out.print(a[m] + " ");
                }
            }
        }
}
