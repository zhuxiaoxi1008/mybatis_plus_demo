package com.mybatis.test;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.nio.file.Paths;
import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/mybatis", "root", "123456")
                .globalConfig(builder -> builder
                        .author("zhuXiaoxi")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java")
                        .commentDate("yyyy-MM-dd")
                )
                .packageConfig(builder -> builder
                        .parent("com.mybatis.test")
                        .entity("entity")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        .pathInfo(Collections.singletonMap(OutputFile.xml, "src/main/resources/mapper"))
//                      .xml("resources.mapper")
                )
//                .strategyConfig(builder -> builder
//                        .entityBuilder()
//                        .enableLombok()
//                )
                .strategyConfig(builder -> builder
//                        .addInclude("your_table_name") // 指定要生成的表名
                        .entityBuilder()
                        .enableLombok() // 启用Lombok，会生成@Data注解
                        .controllerBuilder()
                        .enableRestStyle() // 启用@RestController注解
                        .serviceBuilder()
                )
                // .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

}
