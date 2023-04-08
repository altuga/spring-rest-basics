package jug.istanbul.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.management.ManagementFactory;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Total Compilation time: " + ManagementFactory.getCompilationMXBean().getTotalCompilationTime() + "ms");
	}

}
