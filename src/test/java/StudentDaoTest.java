import com.yc.biz.StudentBizimpl;
import com.yc.dao.StudentDao;
import com.yc.dao.StudentDaoJpalmpl;
import junit.framework.TestCase;

/**
 * @program: testSpring
 * @description:
 * @author: 易帆
 * @create: 2021-04-04 15:56
 */
public class StudentDaoTest extends TestCase {

    private StudentDao studentDao;
    private StudentBizimpl studentBizimpl;

    @Override
    protected void setUp() throws Exception {
        //1.能否自动完成      实例化对象 -> IOC控制 反转 ->由容器实例化对象，由容器来完成

        studentDao =new StudentDaoJpalmpl();

        //studentBizimpl =new StudentBizimpl(studentDao);    IOC
        studentBizimpl =new StudentBizimpl();

        //2.能否自动完成 装配过程 -> DI 依赖注入 -> 由容器装配对象
        studentBizimpl.setStudentDao(studentDao);

    }

    public void testAdd(){
        studentDao.add("张三");
    }

    public void testUpdate(){
        studentDao.update("张三");
    }
    public void testBizAdd(){
        studentBizimpl.add("张三");
    }
}
