import java.util.Scanner;
/**
 * 登录的方法
 */
public class Demo8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入账号");
        String userName = s.next();
        System.out.println("请输入密码");
        String passWord = s.next();
        if(LoginInfo(userName,passWord)){
            System.out.println("登录成功");
        }else{
            System.out.println("密码错误");
        }
    }

    public static boolean LoginInfo(String userName,String passWord) {
        String [] userNames = new String[10];
        String [] passWords = new String[10];
        userNames[0] = "admin";
        passWords[0] = "123456";
        for (int i = 0; i < passWords.length;i++){
           if(userName.equals(userNames[i]) && passWord.equals(passWords[i])){
                return true;
           }
        }
        return false;
    }
}