package com.boss.mall.entity;

public class Product {
    private int pid;
    private String pname;
    private int pprice;
    private int pnum;

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public int getPprice() {
        return pprice;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPprice(int pprice) {
        this.pprice = pprice;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pprice=" + pprice +
                ", pnum=" + pnum +
                '}';
    }
}
