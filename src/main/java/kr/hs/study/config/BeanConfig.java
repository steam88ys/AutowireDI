package kr.hs.study.config;

import kr.hs.study.beans.DataBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfig {
    @Bean
    public DataBean1 dataBean1() {
        return new DataBean1();
    }

    @Bean
    public DataBean1 dataBean2() {
        return new DataBean1();
    }
}
