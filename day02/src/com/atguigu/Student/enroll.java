package com.atguigu.Student;

import java.util.Objects;

public class enroll {
    public int total = 3;
    public String user;
    public String passwd ;
    public String passwd1;
    public String idU;
    public String phome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        enroll enroll = (enroll) o;
        return Objects.equals(passwd, enroll.passwd) && Objects.equals(passwd1, enroll.passwd1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwd, passwd1);
    }

    public enroll(String user, String passwd, String idU, String phome) {
        this.user = user;
        this.passwd = passwd;
        this.idU = idU;
        this.phome = phome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getIdU() {
        return idU;
    }

    public void setIdU(String idU) {
        this.idU = idU;
    }

    public String getPhome() {
        return phome;
    }

    public void setPhome(String phome) {
        this.phome = phome;
    }
}
