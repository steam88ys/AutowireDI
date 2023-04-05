package kr.hs.study;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
        TestBean1 obj1 = ctx.getBean(TestBean1.class);
        System.out.println("data1: " + obj1.getData1());
        System.out.println("data2: " + obj1.getData2());

        // setter, constructor를 사용한다는 것 - 개발자가 직접 값을 넣어준다라는 의미
        TestBean2 obj2 = ctx.getBean(TestBean2.class);
        System.out.println("\ndata1: " + obj2.getData1());
        System.out.println("data2: " + obj2.getData2());

        ctx.close();
    }
}