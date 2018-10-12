//package fankk.mybatis;
//
//import org.apache.ibatis.mapping.Environment;
//import org.apache.ibatis.session.Configuration;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.apache.ibatis.transaction.TransactionFactory;
//import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.TransactionManagementConfigurer;
//
//import javax.sql.DataSource;
//
///**
// * @Auther: fankk
// * @Date: 2018/10/9 16:21
// * @Desc:
// */
//@Configurable
//
//public class MybatisConfig implements TransactionManagementConfigurer {
//
//    @Autowired
//    org.springframework.core.env.Environment env;    //读取配置文件的信息
//
//    @Autowired
//    SqlSessionFactory sqlSessionFactory;
////
//   @Autowired
//    DataSource dataSource;
//
//    @Bean
//    public DataSource dataSource() throws Exception {
//        DataSourceBuilder dataSourceBuilder= DataSourceBuilder.create();
//        dataSourceBuilder.type(javax.sql.DataSource.class);
//        dataSourceBuilder.url(env.getProperty("spring.datasource.url"));
//        dataSourceBuilder.driverClassName(env.getProperty("spring.datasource.driverClassName"));
//        dataSourceBuilder.username(env.getProperty("spring.datasource.username"));
//        dataSourceBuilder.password(env.getProperty("spring.datasource.password"));
//        DataSource dataSource =  dataSourceBuilder.build();
//        return dataSource;
//    }
//        @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//
//
//        TransactionFactory transactionFactory = new JdbcTransactionFactory();
//
//       org.apache.ibatis.mapping.Environment environment = new org.apache.ibatis.mapping.Environment("development", transactionFactory, dataSource);
//        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration(environment);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
//        return sqlSessionFactory;
//    }
//    @Bean
//    public SqlSession sqlSession() throws Exception {
//          return sqlSessionFactory.openSession();
//    }
//
////    DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
////    TransactionFactory transactionFactory = new JdbcTransactionFactory();
////    Environment environment = new Environment("development", transactionFactory, dataSource);
////    Configuration configuration = new Configuration(environment);
////configuration.addMapper(BlogMapper.class);
////    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
//
//    @Bean
//    @Override
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new DataSourceTransactionManager(dataSource);
//    }
//}
