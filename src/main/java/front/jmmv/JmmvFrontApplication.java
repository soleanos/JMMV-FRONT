package front.jmmv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class JmmvFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmmvFrontApplication.class, args);
		//cl = new Client()
	}
}
