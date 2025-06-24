package com.github.everymusic.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.github.everymusic.model.mapper")
public class DBConfig {
}
