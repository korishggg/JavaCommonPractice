//package com.example.demo.hibernate.config;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class DataSourceConfig  {
//
//    @Bean
//    public SessionFactory sessionFactory(){
//        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate/hibernate.cfg.xml").build();
//        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//        SessionFactory sessionFactory = meta.getSessionFactoryBuilder().build();
//        return sessionFactory;
//    }
//
//
//}
