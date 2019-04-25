package p3.p3;

import p3.p3.Model.*;
import p3.p3.Repository.ClienteRepo;
import p3.p3.Repository.Hecho1Repo;
import p3.p3.Repository.Hecho2Repo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import p3.p3.Repository.Hecho3Repo;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class P3Application {

	public static void main(String[] args) {
		SpringApplication.run(P3Application.class, args);
	}

	@Bean
	public CommandLineRunner addData (Hecho1Repo hecho1Repo, Hecho2Repo hecho2Repo, Hecho3Repo hecho3Repo,ClienteRepo clienteRepo){
		return (args) -> {
			List<Hecho1> hecho1 = hecho1Repo.findAllByOrderByNombre();

			List<Cliente> clientes = new ArrayList<>();
			for(Hecho1 h: hecho1){
				Cliente cliente = new Cliente(h.getNombre(),h.getApellido(),h.getEmail(),null,h.getDia(),h.getMes(),h.getAnyo());
				if(!cliente.contenido(clientes)){
					clientes.add(cliente);
					clienteRepo.save(cliente);
				}
			}
			DividirNombre dividirNombre = new DividirNombre();
			List<Hecho3> hecho3 = dividirNombre.separar();
			for (Hecho3 h: hecho3){
				hecho3Repo.save(h);
			}
		};
	}
}
