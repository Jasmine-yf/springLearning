package com.yc.springframework.stereotype;

import java.lang.annotation.*;

/**
 * @program: testSpring
 * @description:
 * @author: 易帆
 * @create: 2021-04-05 19:02
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface MyComponentScan {

    String [] basePackages() default {};

}
