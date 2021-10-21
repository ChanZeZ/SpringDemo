package init;

public class TestUserDAO {
    public static void main(String[] args) {

        //没用Spring之前，管理组件对象
        //使用new创建对象
        UserDAOImpl userDAO = new UserDAOImpl();
        //使用对象
        userDAO.save("say my name!");
        //销毁对象，jvm来做
    }
}
