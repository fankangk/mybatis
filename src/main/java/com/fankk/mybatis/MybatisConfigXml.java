package com.fankk.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Auther: fankk
 * @Date: 2018/10/11 10:51
 * @Desc:
 */
//@Configurable
@Configuration
public class MybatisConfigXml {
    @Autowired
    SqlSessionFactory sqlSessionFactory;
    @Bean
    public SqlSessionFactory sqlSessionFactory(){
        try {


//            String resource = "src/main/resources/mybatis-config.xml";
//            File file = new File(resource);
//            InputStream inputStream = new FileInputStream(file);
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            System.out.println("##########fankk###############");
            System.out.println("##########fankk###############");
            return sqlSessionFactory;
        }catch (Exception e ){
            e.printStackTrace();
            throw new RuntimeException("mybatis的配置error" + e.getMessage());
        }
    }

    @Bean
    public SqlSession sqlSession(){
        return sqlSessionFactory.openSession();
    }
}
