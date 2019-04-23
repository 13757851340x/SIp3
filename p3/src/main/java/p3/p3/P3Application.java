package p3.p3;

import p3.p3.Model.Cliente;
import p3.p3.Model.Hecho1;
import p3.p3.Model.Hecho2;
import p3.p3.Repository.ClienteRepo;
import p3.p3.Repository.Hecho1Repo;
import p3.p3.Repository.Hecho2Repo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class P3Application {

	public static void main(String[] args) {
		SpringApplication.run(P3Application.class, args);
	}

	@Bean
	public CommandLineRunner addData (Hecho1Repo hecho1Repo,Hecho2Repo hecho2Repo,ClienteRepo clienteRepo){
		return (args) -> {
			List<Hecho1> hecho1 = hecho1Repo.findAllByOrderByNombre();
			List<Hecho2> hecho2 = hecho2Repo.findAllByOrderByNombre();
			List<Cliente> clientes = new ArrayList<>();
			for(Hecho1 h: hecho1){
				Cliente cliente = new Cliente(h.getNombre(),h.getApellido(),h.getEmail(),null,h.getDia(),h.getMes(),h.getAnyo());
				if(!cliente.contenido(clientes)){
					clientes.add(cliente);
					clienteRepo.save(cliente);
				}
			}
            
		};
	}
}
