package com.fankk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Project:html_template
 * Author:hangke
 * Date:2017/3/22
 * Description://TODO add description here
 */
@SpringBootApplication
@ComponentScan("com.fankk.*")
public class TestApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(TestApplication.class,args);
    }
}
