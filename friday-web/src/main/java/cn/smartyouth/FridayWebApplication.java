package cn.smartyouth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.smartyouth.mapper")
public class FridayWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FridayWebApplication.class, args);
    }

}
