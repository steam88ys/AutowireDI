package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestBean1.class);

        TestBean1 obj1 = ctx.getBean(TestBean1.class);
        System.out.println(obj1.getData1());
        System.out.println(obj1.getData2());

        ctx.close();
    }
}