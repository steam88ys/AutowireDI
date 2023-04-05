package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("test2")
// type으로 주입
public class TestBean2 {
    @Autowired  // spring이 알아서 객체를 넣어주기 때문에 setter가 필요 없음
    @Qualifier("dataBean2")
    private DataBean1 data1;
    
    @Autowired
    private DataBean2 data2;

    public DataBean1 getData1() {
        return data1;
    }

    public DataBean2 getData2() {
        return data2;
    }
}
