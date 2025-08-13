package org.gaurav;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootMvcProj8CrmCrudappApplication {

	// static {
	// 	try {
	// 		io.github.cdimascio.dotenv.Dotenv dotenv = io.github.cdimascio.dotenv.Dotenv.load();
	// 		System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
	// 		System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
	// 		System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));
	// 	} catch (Exception e) {
	// 		System.err.println("Could not load .env file: " + e.getMessage());
	// 	}
	}
	public static void main(String[] args) {

		// Dotenv dotenv = Dotenv.configure()
		// 		.filename(".env") // load a specific .env file
				// .load();

		SpringApplication.run(BootMvcProj8CrmCrudappApplication.class, args);
	}

}
