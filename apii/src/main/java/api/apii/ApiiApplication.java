package api.apii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ApiiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiiApplication.class, args);
    }

}
