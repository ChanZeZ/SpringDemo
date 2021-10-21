package init;

/**
 * @author 泽众
 */
public class UserDAOImpl implements UserDAO{
    @Override
    public void save(String name) {
        System.out.println("DAO:" + name);
    }
}
