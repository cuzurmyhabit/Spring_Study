package kr.hs.study.beans;

public class TestBean2 {

    public class TestBean2 {
        private int data1;
        private double data2;
        private String data3;

        public TestBean2() {
            System.out.println("TestBean1의 기본생성자");
            this.data1 = 1;
            this.data2 = 1.1;
            this.data3 = "hi1";
        }

        public TestBean2(int data1) {
            System.out.println("int 매개변수 1개 기본생성자");
            this.data1 = data1;
            this.data2 = 2.2;
            this.data3 = "hi2";
        }

        public TestBean2(double data2) {
            System.out.println("double 매개변수 1개 기본생성자");
            this.data1 = 3;
            this.data2 = data2;
            this.data3 = "hi3";
        }

        public TestBean2(String data3) {
            System.out.println("String 매개변수 1개 기본생성자");
            this.data1 = 4;
            this.data2 = 4.4;
            this.data3 = data3;
        }

        public TestBean2(int data1, double data2, String data3) {
            System.out.println("매개변수 3개 생성자");
            this.data1 = data1;
            this.data2 = data2;
            this.data3 = data3;
        }

        public void prData() {
            System.out.println("data1: " + data1);
            System.out.println("data2: " + data2);
            System.out.println("data3: " + data3);
        }
    }

}
