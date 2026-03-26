package kr.hs.study;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);

        System.out.println(obj1.getData1());
        System.out.println(obj1.getData2());
        System.out.println(obj1.isData3());
        System.out.println(obj1.getData4());

        TestBean2 t2 = ctx.getBean("t2", TestBean2.class);
        t2.printData();

        ctx.close();
    }
}