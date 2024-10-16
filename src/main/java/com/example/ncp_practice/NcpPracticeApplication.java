package com.example.ncp_practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class NcpPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(NcpPracticeApplication.class, args);
	}

}
/*@SpringBootApplication
public class NcpPracticeApplication implements CommandLineRunner {
	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(NcpPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Testing MySQL connection...");
		try (Connection connection = dataSource.getConnection()) {
			System.out.println("Connected to MySQL: " + connection.getMetaData().getDatabaseProductName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}*/
