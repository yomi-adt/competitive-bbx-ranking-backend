package com.yomi_adt.bbx_2026_backend;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Bbx2026BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bbx2026BackendApplication.class, args);
	}

	@PostConstruct
	public void init() {
		new File("/var/data").mkdirs();
	}

}
