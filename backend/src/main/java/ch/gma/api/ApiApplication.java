package ch.gma.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ApiApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void insertInitialData() {
		jdbcTemplate.execute("INSERT INTO users (id, name) VALUES (1, 'John Doe'), (2, 'Alice Smith'), (3, 'Bob Johnson')");
	}

}
