package p3.p3;

import p3.p3.Model.Cliente;
import p3.p3.Model.Hecho1;
import p3.p3.Repository.ClienteRepo;
import p3.p3.Repository.Hecho1Repo;
import p3.p3.Repository.Hecho2Repo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class P3Application {

	public static void main(String[] args) {
		SpringApplication.run(P3Application.class, args);
	}



}
