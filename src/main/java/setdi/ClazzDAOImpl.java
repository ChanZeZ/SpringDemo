package setdi;

public class ClazzDAOImpl implements ClazzDAO{

    @Override
    public void save(String str) {
        System.out.println("ClazzDAO:"+str);
    }
}
