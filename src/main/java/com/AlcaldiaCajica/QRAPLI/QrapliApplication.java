package com.AlcaldiaCajica.QRAPLI;

import com.AlcaldiaCajica.QRAPLI.Model.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class QrapliApplication {

	public static void main(String[] args) {
		SpringApplication.run(QrapliApplication.class, args);
	}


}
