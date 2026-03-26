package kr.hs.study;
import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");

        TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
        TestBean1 t2 = ctx.getBean("t2", TestBean1.class);
        TestBean1 t3 = ctx.getBean("t3", TestBean1.class);
        TestBean1 t4 = ctx.getBean("t4", TestBean1.class);
        TestBean1 t6 = ctx.getBean("t6", TestBean1.class);
        TestBean1 d2 = ctx.getBean("d2", TestBean1.class);
        TestBean2 t7 = ctx.getBean("t7", TestBean2.class);

        System.out.println("===== t1 =====");
        t1.prData();

        System.out.println("===== t2 =====");
        t2.prData();

        System.out.println("===== t3 =====");
        t3.prData();

        System.out.println("===== t4 =====");
        t4.prData();

        System.out.println("===== t6 =====");
        t6.prData();

        System.out.println("===== d2 =====");
        d2.prData();

      t7.prData();
        ctx.close();
    }
}