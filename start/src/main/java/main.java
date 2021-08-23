package com.wisely.highlight_spring4.ch1.di;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedArrayType;

public class main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext(DiConfig.class);
        //使用 AnnotationConfigApplicationContext作为spring容器，接受输入一个配置类作为参数
        new AnnotationCOnfigApplicationContext(DiConfig.class);

        UseFunctionService useFunctionService =
                context.getBean(UseFunctionService.class);
        //获得声明配置的UseFuncationService的bean
        System.out.println(useFunctionService.SayHello("di"));

        context.close();
    }
}
