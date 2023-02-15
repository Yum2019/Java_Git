package com.atguigu.Student;

/*  删除功能
    键盘录入要删除的学生id，需要满足以下要求：
    - id存在删除
    - id不存在，需要提示不存在，并回到初始菜单
    #### 修改功能：

    键盘录入要修改的学生id，需要满足以下要求
    - id存在，继续录入其他信息
    - id不存在，需要提示不存在，并回到初始菜单

    查询功能：
    打印所有的学生信息，需要满足以下要求
    - 如果没有学生信息，提示：当前无学生信息，请添加后再查询
    - 如果有学生信息，需要按照以下格式输出。（不用过于纠结对齐的问题）

 */
public class StudentService {
    private Student[] student;
    private int total = 0;

    //构造器new数组
    public StudentService(int totalStudent){
        student = new Student[totalStudent];
    }
    //添加操作
    public boolean AddStudent(Student dent){
        if (total >= student.length) {
            return false;
        }
        student[total++] = dent;
        return true;
    }

    //删除操作
    public boolean deleteStudent(int index){
        if (index >= total || index < 0){
            return false;
        }else if (student[index] == null){
            return false;
        }else {
            for (int i = index; i < total-1; i++) {
                student[i] = student[i+1];
            }
            student[--total] = null;
            return true;
        }
    }

    //获取全部列表
    public Student[] getAllstudent(){
        Student[] students1 = new Student[total];
        for (int i = 0; i < total; i++) {
            students1[i] = student[i];
        }
        return students1;
    }

    //修改信息
    public Student reviseStudent(int inden){
        if (inden-1 >= total){
            return null;
        }
        if (student[inden-1] == null){
            return null;
        }
        return student[inden-1];
    }
    public boolean setStudent1Xinxi(int id,Student student11){
        if (student[id-1] == null){
            return false;
        }
        student[id-1] = student11;
        return true;
    }
}
