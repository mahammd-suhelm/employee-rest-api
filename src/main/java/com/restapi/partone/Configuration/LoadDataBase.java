package com.restapi.partone.Configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.restapi.partone.Entiry.Employee;
import com.restapi.partone.Repo.EmployeeRepository;

@Configuration
public class LoadDataBase {

	private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);
	
	@SuppressWarnings("unused")
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args -> {
			log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar", 1000, 1)));
			log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief", 1000, 2)));
		};
	}
}
