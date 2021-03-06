import com.yc.dao.StudentDao;
import org.springframework.stereotype.Repository;

import java.util.Random;

/**
 * @program: testSpring
 * @description:
 * @author: 易帆
 * @create: 2021-04-04 21:20
 */
@Repository
public class StudentBizImplTest implements StudentDao {

    public int add(String name) {
        System.out.println("jpa 添加学生：" +name);
        Random r= new Random();
        return r.nextInt();
    }

    public void update(String name) {
        System.out.println("jpa更新学生："+name);
    }
}
