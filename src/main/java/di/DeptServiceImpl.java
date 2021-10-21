package di;

import init.UserDAO;
import lombok.Data;


@Data
public class DeptServiceImpl implements DeptService{

    //需要DAO组件对象，依赖DAO组件
    private UserDAO userDAO;

    @Override
    public void save(String name) {
        System.out.println("Service:" + name);
        userDAO.save(name);
    }
}
