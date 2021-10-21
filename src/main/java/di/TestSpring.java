package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //启动工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringService.xml");

        DeptService deptService = (DeptService) applicationContext.getBean("deptService");
        deptService.save("百知教育");
    }
}
