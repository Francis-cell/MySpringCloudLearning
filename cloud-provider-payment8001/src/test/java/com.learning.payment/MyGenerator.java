package com.learning.payment;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;

import java.util.Collections;

public class MyGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create(
                // 数据源配置
                new DataSourceConfig.Builder("jdbc:mysql://localhost:3306/db2021?useUnicode=true&characterEncoding=utf-8&useSSL=false",
                        "root", "123456")
                        .dbQuery(new MySqlQuery())
                        .schema("mybatis-plus")
                        .typeConvert(new MySqlTypeConvert())
                        .keyWordsHandler(new MySqlKeyWordsHandler())
                )
                // 全局配置
                // D:\Learning_Files\Mybatis-plus\mybatisPlusGeneratorTest\src\main
                .globalConfig(builder -> {
                    builder.author("zhumengren") // 设置作者
                            .disableOpenDir()//禁止打开输出目录
                            // .enableSwagger() // 开启Swagger模式
                            // .fileOverride() // 覆盖已经生成的文件
                            // 指定输出目录
                            .outputDir("D:\\Learning_Files\\Mybatis-plus\\cloudLearning\\cloud-provider-payment8001\\src\\main");

                })
                // 包配置
                .packageConfig(builder -> {
                    builder.parent("java.com.learning.springcloud") // 设置父包名
                            // .moduleName("bookKeeping02") // 设置父模块名
                            .entity("pojo")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .xml("mapper.xml")
                            .controller("controller");
                            // 设置mapperXml生成路径
                            // .pathInfo(Collections.singletonMap(OutputFile.mapperXml, System.getProperty("user.dir") +
                            //        "/src/main/resources/mapper"));

                })
                // 策略配置
                .strategyConfig(builder -> {
                    // 设置需要生成的表名
                    builder.addInclude("payment")
                            // .addTablePrefix("bill_") // 设置过滤的表前缀
                            // .entityBuilder() // 实体类配置
                            // .enableLombok() // 使用Lombok
                            // .enableTableFieldAnnotation() // 实体类字段注解
                            // .controllerBuilder() // controller配置
                            // .enableRestStyle() // 开启restController
                            .mapperBuilder()
                            .enableMapperAnnotation() // 开启Mapper注解
                            .enableBaseResultMap() // 启用BaseResultMap生成
                            .enableBaseColumnList(); // 启用BaseColumnList
                })
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                // .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
