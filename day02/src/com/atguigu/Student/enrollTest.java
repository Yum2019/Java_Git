package com.atguigu.Student;

import java.util.Objects;

public class enrollTest {
     private static CaptchaTest cap;
    private int total = 0;
     private enroll[] enrolls;

     public enrollTest(int in){
        enrolls = new enroll[in];
     }
    public boolean getAdd(enroll er){
        if (total >= enrolls.length) return false;
        enrolls[total++] = er;
        return true;
    }


    public boolean capRun(String strt,String strt2){
        if (strt.equals(strt2)){
            return true;
        }else {
            return false;
        }
    }

    //返回账号。遍历，将新密码带入原来的列表中
    public boolean getXinPasswd(String user,String passwd){
         for (int i = 0;i <= enrolls.length;i++){
             if (user.equals(enrolls[i].getUser())){
                 enrolls[i].setPasswd(passwd);
                 return true;
             }
         }
             return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        enrollTest that = (enrollTest) o;
        return Objects.equals(cap, that.cap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cap);
    }

    //验证账户
    public boolean Userlogin(String user) {
        for (int i = 0; i < enrolls.length; i++) {
            if (user.equals(enrolls[i].getUser())) {
                return true;
            }else {
                return false;
            }
        }
            return false;
    }
    //验证密码
    public boolean Passwdlogin(String passwd) {
        for (int i = 0; i < enrolls.length; i++) {
            if (passwd.equals(enrolls[i].getPasswd())) {
                return true;
            }else {
                return false;
            }
        }
            return false;
    }
    public boolean IDUlogin(String passwd) {
        for (int i = 0; i < enrolls.length; i++) {
            if (passwd.equals(enrolls[i].getIdU())) {
                return true;
            }else {
                return false;
            }
        }
            return false;
    }
    //验证电话是否一致
    public boolean PhomeLogin(String passwd) {
        for (int i = 0; i < enrolls.length; i++) {
            if (passwd.equals(enrolls[i].getPhome())) {
                return true;
            }else {
                return false;
            }
        }
            return false;
    }

    //身份证号
    public boolean TFuid(String str) {
        //不能小于18位
        if (str.length()  >= 18 && str.length() <= 15) {
            return false;
        }
        //首位部位0
        if (str.charAt(0) == '0') {
            return false;
        }
        //1-17位要位1-9
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            if (c[i] >= 0 && c[i] <= 9) {
                return false;
            }
        }
        //最后一位是：X-X 1-9
        try {
        char ch = str.charAt(17);
            if (ch == 'X' || ch == 'x' || (ch >= '0' && ch <= '9')) {
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            System.out.println("长度不正确");
            return false;
        }
     }
}


