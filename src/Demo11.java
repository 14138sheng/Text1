import java.util.Scanner;

public class Demo11 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            //键盘输入获取账号信息和密码
            System.out.println("请输入账号：");
            String userName = s.next();
            System.out.println("请输入密码：");
            String passWord = s.next();
            //调用方法，进行逻辑判断
            if (registerInfo(userName, passWord)) {
                System.out.println("注册成功！");
            } else {
                System.out.println("注册失败");
            }
        }

        public static boolean registerInfo(String userName, String passWord) {
            //创建数组，存放注册账号密码
            String[] userNames = new String[10];
            String[] passWords = new String[10];
            //假设已有注册账号
            userNames[0] = "admin";
            passWords[0] = "123456";
            //找到数组为空的下标
            int empty = 0;
            for (int i = 0; i < passWords.length; i++) {
                if (userNames[i] == null) {
                    empty = i;
                    break;
                }
            }
            //判断账号是否存在
            int position = 0;
            //empty是第一个为空的数组，所以遍历数组时，以empty为终点
            for (; position < empty; position++) {
                if (userName.equals(userNames[position])) {
                    return false;
                }
            }
            //存放注册信息
            if (position == empty) {
            //如果该下标既没有存放信息，有和原有信息不相同，就存放注册信息
                userNames[position] = userName;
                passWords[position] = passWord;
            }
            return true;
        }
}
