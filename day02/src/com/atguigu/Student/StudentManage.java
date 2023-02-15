package com.atguigu.Student;

import java.util.Scanner;

public class StudentManage {
    private Student[] student;
    private  Scanner scanner = new Scanner(System.in);

    private StudentService studentService = new StudentService(10);
    public boolean Flags = true;
    //跳转到学生管理页面
    public void Student(){
        do{
            Interface();
            System.out.print("请输入你的选项：");
            char Option = SMutil.readMenuSelection();
            switch (Option){
                case '1':
                    AddStudent();
                    break;
                case '2':
                    DeleteStudent();
                    break;
                case '3':
                    getAllStudent();
                    break;
                case '4':
                    revise();
                    break;
                case '5':
                    exit();
                    break;
            }
        }while (Flags);
    }

    public void Interface(){
        System.out.println("-----学生管理界面-----");
        System.out.println("请选择操作： 1添加学生 2删除学生 3查看列表 4修改信息 5退出系统");
    }
    //添加操作
    public void AddStudent(){
        System.out.println("-----添加学生信息-----");
        System.out.println("学生姓名：");
        String name = SMutil.readString(3);
        System.out.println("请输入学生的年龄：");
        int age = SMutil.readInt();
        System.out.println("请输入学生的住址：");
        String home = SMutil.readString(10);
        Student student = new Student(name,age,home);
        boolean b = studentService.AddStudent(student);
        if (b){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
    public void DeleteStudent(){
        System.out.println("-----删除界面-----");
        System.out.print("请输入要删除的学生id：");
        String line = scanner.nextLine();
        int delete = Integer.parseInt(line);
        boolean b = studentService.deleteStudent(delete);
        if (b) {
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败！");
        }
    }

    public void getAllStudent() {
        System.out.println("----------学生列表---------");
        System.out.println("id\t\t" + "姓名\t\t" + "年龄\t\t" + "地址");
        student = studentService.getAllstudent();
        if (student.length == 0) {
            System.out.println("还没有学生信息");
        } else {
            for (int i = 0; i < student.length; i++) {
//                System.out.println((i + 1) + "\t" + student[i].toString());
                System.out.println(i+1 + "\t\t" + student[i].getName() + "\t\t" + student[i].getAge() + "\t\t" + student[i].getHome());
            }
        }
    }

    //修改学生信息
    public void revise(){
        System.out.println("-----修改学生信息界面-----");
        System.out.println("请输入你要修改的id");
        String line = scanner.nextLine();
        int revise = Integer.parseInt(line);
        Student student1 = studentService.reviseStudent(revise);
        System.out.println("姓名（" + student1.getName()+"):" );
        String name = SMutil.readString(4,student1.getName());
        System.out.println("年龄（" + student1.getAge()+"):" );
        int age = SMutil.readInt(student1.getAge());
        System.out.println("住址（" + student1.getHome()+"):" );
        String home = SMutil.readString(10, student1.getHome());
        Student student = new Student(name,age,home);
        boolean b = studentService.setStudent1Xinxi(revise, student1);
        if (b) {
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败");
        }
    }
        //退出
        public void exit(){
            System.out.println("退出(Y/N)：");
            char exit = StudentUtil.getExit();
            if (exit == 'Y' || exit == 'y'){
                Flags = false;
            }
        }
}
