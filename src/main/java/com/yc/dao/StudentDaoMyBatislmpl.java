package com.yc.dao;

import java.util.Random;

/**
 * @program: testSpring
 * @description:
 * @author: 易帆
 * @create: 2021-04-04 15:47
 */
public class StudentDaoMyBatislmpl  implements StudentDao {

    @Override
    public int add(String name) {
        System.out.println("jpa 添加学生：" +name);
        Random r= new Random();
        return r.nextInt();
    }

    @Override
    public void update(String name) {
        System.out.println("jpa 更新学生："+name);
    }
}
