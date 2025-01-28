package ru.eleventh.comunda_process;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableZeebeClient
@SpringBootApplication
public class CamundaProcessApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamundaProcessApplication.class, args);
	}

}
