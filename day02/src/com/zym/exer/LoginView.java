package com.zym.exer;


public class LoginView {
    LoginService l = new LoginService();
    public void login() {
        boolean flag = true;
        do {
            System.out.println("--------登录页面--------");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.修改密码");
            System.out.println("4.退出");
            System.out.println("请输入你的选项：");
            char key = LoginUtil.getOption();
            switch (key){
                case '1':

                    ZCUser();
                    break;
                case '2':
                    DLUser();
                    break;
                case '3':
                case '4':
                    System.out.print("是否退出(Y/N):");
                    char exit = LoginUtil.getExit();
                    if (exit == 'Y'){
                        flag = false;
                        System.out.println("退出成功！");
                    }else{
                       break;
                    }
            }
        } while (true);
    }
    public void ZCUser(){
       l.setUser();
}
    public void DLUser(){
        l.login();
    }

    public static void main(String[] args) {
        LoginView l1 = new LoginView();
        l1.login();
    }


}
