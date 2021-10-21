package setdi;

import lombok.Data;

/**
 * @author 泽众
 */

@Data
public class ClazzServiceImpl implements ClazzService{

    private ClazzDAO clazzDAO;

    @Override
    public void save(String str) {

        System.out.println("ClazzService:"+str);
        clazzDAO.save(str);
    }
}
