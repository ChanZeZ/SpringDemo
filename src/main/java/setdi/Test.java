package setdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("Clazz.xml");
        //获取工厂中创建好的对象 参数：获取工厂中指定对应的唯一标识
//        ClazzDAO clazzDAO = (ClazzDAOImpl) context.getBean("clazzDAO");
//        clazzDAO.save("say my name again!!!");
        ClazzService clazzService = (ClazzService) context.getBean("clazzService");
        clazzService.save("-,-");
        //clazzDAO.save("123");
    }
}
