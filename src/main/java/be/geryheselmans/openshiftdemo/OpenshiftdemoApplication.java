package be.geryheselmans.openshiftdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class OpenshiftdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftdemoApplication.class, args);
	}
}
