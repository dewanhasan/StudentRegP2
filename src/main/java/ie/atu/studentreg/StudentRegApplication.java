package ie.atu.studentreg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class StudentRegApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentRegApplication.class, args);
    }

}
