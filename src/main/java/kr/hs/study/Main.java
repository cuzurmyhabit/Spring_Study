package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        config.xml(개발자의 명령) 파일을 읽어서 객체를 생성하고 컨테이너에 보관 (아래줄)
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ctx.getBean("t1", TestBean.class);
        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        System.out.println("obj1 : " +obj1);

        ctx.getBean("t2", TestBean.class);
        TestBean obj2 = ctx.getBean("t2", TestBean.class);
        System.out.println("obj2 : " +obj2);

        ctx.close();
    }
}