package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("\ndata1: "+obj1.getData1());
        System.out.println("data2: "+obj1.getData2());

        TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
        System.out.println("\ndata3: "+obj2.getData3());

        ctx.close();
    }
}