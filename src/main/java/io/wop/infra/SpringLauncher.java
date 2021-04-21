package io.wop.infra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"io.wop.domain.Game","io.wop.infra"})
public class SpringLauncher {

	public static void main(String[] args) {
		SpringApplication.run(SpringLauncher.class, args);
	}

}
