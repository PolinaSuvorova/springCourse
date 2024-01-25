package com.polinasuvorova.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.polinasuvorova.aop")
@EnableAspectJAutoProxy
public class MyConfigAOP {
}
