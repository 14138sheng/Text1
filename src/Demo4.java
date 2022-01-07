import java.util.Scanner;
/**
 *方法模拟登录界面
 */
public class Demo4 {
    public static void main(String[] args) {
        String b ;
        do {
            main1();
            System.out.println("是否继续？Y/N");
            Scanner s = new Scanner(System.in);
            b = s.next();
        }while(b.equals("Y"));
        System.out.println("程序已退出");
    }

    public static void main1() {
        System.out.println("请选择：1.注册 2.登录 3.退出");
        Scanner ss = new Scanner(System.in);
        int aa = ss.nextInt();
        if(aa == 1){System.out.println("欢迎进入注册界面！");}
        else if(aa == 2){
            System.out.println("欢迎进入登录界面！");
        }
        else if(aa == 3){System.out.println("退出成功！");}
        else{System.out.println("输入有误！");}
    }
}
