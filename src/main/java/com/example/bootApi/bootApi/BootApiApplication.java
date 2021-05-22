package com.example.bootApi.bootApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@CrossOrigin( origins = "*" )
public class BootApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApiApplication.class, args);
	}
}
