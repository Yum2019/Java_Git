package com.atguigu.Student;

import java.util.Random;
import java.util.Scanner;

public class StudentView {
    private enroll enroll;
    private CaptchaTest cap;
    private StudentManage studentManage = new StudentManage();
    private enrollTest enrollTest = new enrollTest(10);

    private  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentView s = new StudentView();
        s.StudentManage();
    }

    //首页提示
    public void Page(){
        System.out.println("----欢迎来到学生管理系统----");
        System.out.println("请选择操作：1注册 2登录 3忘记密码 4退出");
    }

    //选项
        boolean flag = true;
    public void StudentManage(){

       do{
            Page();
            char key = StudentUtil.getOption();
            switch (key){
                case '1':
                    Enroll();
                    break;
                case '2':
                    login();

                    break;
                case '3':
                    Forgotpassword();
                case '4':
                    Exit();
            }
        } while (flag);
    }


    //退出
    public void Exit(){
        System.out.println("是否确定退出(Y/N):");
        char exit = StudentUtil.getExit();
        if (exit == 'Y'){
         flag = false;
        }

    }

    //忘记密码
    public void Forgotpassword(){
        System.out.println("----修改密码----");
        System.out.println("请输入你的账号：");
        String FGuser = StudentUtil.getUser(15, 3);
        boolean userlogin = enrollTest.Userlogin(FGuser);
        for (;;) {
            if (userlogin) {
                System.out.println("请输入你的身份证：");
                String passwDr = StudentUtil.getPASSWDr(18, 15);
                boolean passwdlogin = enrollTest.IDUlogin(passwDr);
                if (passwdlogin){
                    System.out.println("请输入你的电话号码:：");
                    String phone = StudentUtil.getPhone(11, 8);
                    boolean b = enrollTest.PhomeLogin(phone);
                    if (b) {
                        System.out.println("请输入你的新密码：");
                        String passwd = StudentUtil.getPASSWDr(15,3);
                        System.out.println("请再次输入你的新密码：");
                        String passwd1 = StudentUtil.getPASSWDr(15,3);
                        if (passwd1.equals(passwd)) {
                            boolean xinPasswd = enrollTest.getXinPasswd(FGuser, passwd);
                            if (xinPasswd){
                                System.out.println("密码修改成功！");
                                break;
                            }else {
                                System.out.println("修改密码失败！");
                            }

                        } else {
                            System.out.println("两次密码不一致！");
                            break;
                        }
                    }else {
                        break;
                    }
                }else {
                    break;
                }
            } else {
                System.out.println("没有该账号");
                break;
            }
        }
    }

    //登录功能
    public void login(){
        System.out.println("----登录----");
        System.out.println("用户名：");
        String u1 = StudentUtil.getUser(15,3);
        boolean userlogin = enrollTest.Userlogin(u1);
        if (userlogin){
            for (int i = 0; i < 3; i++) {
                System.out.println("请输入密码：");
                String p1 = StudentUtil.getUser(15,3);
                boolean passwdlogin = enrollTest.Passwdlogin(p1);
                if (passwdlogin){
                    for (int j = 0; j < 3; j++) {
                        System.out.println("密码正确，请输入验证吗：");
                        String cc = verifyCode();
                        System.out.println(cc);
                        String ss = scanner.nextLine();
                        boolean captcha = enrollTest.capRun(cc, ss);
                        if (captcha) {
                            System.out.println("登录成功！");
                            studentManage.Student();
                            return;
                        } else {
                            System.out.println("验证码输入错误,请重新输入:");
                        }
                    }
                }else {
                    System.out.println("密码不正确，请重新输入：");
                }
            }
        }else {
            System.out.println("用户不存在，请先注册！");
        }
    }


    //注册功能
    public void Enroll(){
        Error er = null;
        String phome;
        System.out.println("-----注册-----");
        System.out.println("请输入你要注册的账号：");
        String user = StudentUtil.getUser(15,3);
        System.out.println("请输入你要账号的密码：");
        String passwd = StudentUtil.getPASSWDr(15,3);
        System.out.println("请再次输入你要账号的密码：");
        String passwd1 = StudentUtil.getPASSWDr(15,3);
        if (passwd1.equals(passwd)) {
            System.out.println("请输入你的身份证号：");
        } else {
            System.out.println("两次密码不一致！");
            return;
        }
        System.out.println("请输入你的身份证：");

        String idu = scanner.nextLine();
        boolean f1 = enrollTest.TFuid(idu);
        if (f1){
            System.out.println("身份证输出格式正确！");
            System.out.println("请输入你的手机号码:");
            phome = StudentUtil.getPhone(11,8);
            enroll E1 = new enroll(user,passwd,idu,phome);
            boolean f = enrollTest.getAdd(E1);
            if (f){
                System.out.println("注册成功！");
            }else{
                System.out.println("注册失败。");
            }
        }else{
            System.out.println("身份证输入格式不正确！");
        }
    }

    public String verifyCode() {
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            //随机生成一个整数，值域 [0, arr.length)
            int index = random.nextInt(arr.length);
            code += arr[index];
        }
        return code;
    }
}

