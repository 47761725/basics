package com.wisely.highlight_spring4.ch1.di;
import org.springframework.stereotype.Service;
@Service//使用@service注解声明当前FunctionService类是Spring管理的一个Bean
public class FunctionService {
    public String sayHello(String word){
        return"hello" +word +"!";
    }
}
