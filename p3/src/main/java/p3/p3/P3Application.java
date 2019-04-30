package p3.p3;

import p3.p3.Model.*;
import p3.p3.Repository.ClienteRepo;
import p3.p3.Repository.HechoRepo;
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
	public CommandLineRunner addData (HechoRepo hechoRepo,ClienteRepo clienteRepo){
		return (args) -> {
			List<Hecho> hecho1 = hechoRepo.findAllByOrderByNombre();

			List<Cliente> clientes = new ArrayList<>();
			for(Hecho h: hecho1){
				Cliente cliente = new Cliente(h.getNombre(),h.getApellido(),h.getEmail(),null,h.getDia(),h.getMes(),h.getAnyo());
				if(!cliente.contenido(clientes)){
					clientes.add(cliente);
					clienteRepo.save(cliente);
				}
			}
			DividirNombre dividirNombre = new DividirNombre();
			List<Hecho> hecho = dividirNombre.separar_hecho3();
			for (Hecho h: hecho){
				hechoRepo.save(h);
			}
		};
	}
}
