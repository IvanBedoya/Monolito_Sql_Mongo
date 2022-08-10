package monolito.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CrudApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	public void run(String... args) throws  Exception {
		String sql = "INSERT INTO PERSONAS(NOMBRES,APELLIDOS,ID_DOCUMENTO,EDAD,ID_CIUDAD,ID_FOTO) " +
				"VALUES (?,?,?,?,?,?); ";

		int result = jdbcTemplate.update(sql, "IVAN", "BEDOYAX", 3, 22, 1, 2);

		if(result > 0){
			System.out.println("goxd.");
		}
	}
}
