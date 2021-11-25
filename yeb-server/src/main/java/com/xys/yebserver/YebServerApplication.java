package com.xys.yebserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com,xys.yeb-server.mapper")
public class YebServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YebServerApplication.class, args);
    }

}
