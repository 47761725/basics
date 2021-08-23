package com.wisely.highlight_spring4.ch1.di;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Cofiguration//表明当前类是一个配置类
@ComponentScan("com.wisely.highlight_spring4.ch1.di")//@componentscan，自动扫描包名下所有使用@Service等的类，并注册为bean。
public class DiConfig {
}
