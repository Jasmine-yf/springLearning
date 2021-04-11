package com.yc.biz;

import com.yc.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @program: testSpring
 * @description:
 * @author: 易帆
 * @create: 2021-04-04 15:51
 */
@Service
public class StudentBizimpl {
    private StudentDao studentDao;

    public StudentBizimpl(StudentDao studentDao){
        this.studentDao =studentDao;
    }

    public StudentBizimpl(){

    }
    @Autowired
    @Qualifier("studentDaoJpaImpl")

    public void setStudentDao(StudentDao studentDao){
        this.studentDao =studentDao;
    }

    public int add(String name){
        System.out.println("==========业务层=============");
        System.out.println("用户名是否重名");
        int result =studentDao.add(name);
        System.out.println("========业务操作结束==========");
        return result;
    }

    public void update(String name){
        System.out.println("==========业务层=============");
        System.out.println("用户名是否重名");
        int result =studentDao.add(name);
        System.out.println("========业务操作结束==========");
    }

}
