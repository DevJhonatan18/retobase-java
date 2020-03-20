package arcmop.blog.springbootest.configuracion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"arcmop.blog.springbootest" , "arcmop.blog.springbootest.repository.OperacionRepository"}   )
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
}
