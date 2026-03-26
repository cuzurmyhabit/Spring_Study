package kr.hs.study.beans;

public class TestBean2 {

    private DataBean2 data1;
    private DataBean2 data2;

    public void setData1(DataBean2 data1) {
        this.data1 = data1;
    }

    public void setData2(DataBean2 data2) {
        this.data2 = data2;
    }

    public void printData() {
        System.out.println("data1 : " + data1.getData());
        System.out.println("data2 : " + data2.getData());
    }
}