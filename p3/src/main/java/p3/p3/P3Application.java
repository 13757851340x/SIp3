package p3.p3;

import p3.p3.Model.*;
import p3.p3.Repository.ClienteRepo;
import p3.p3.Repository.HechoRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import p3.p3.Repository.ProductoRepo;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class P3Application {

	public static void main(String[] args) {
		SpringApplication.run(P3Application.class, args);
	}

	@Bean
	public CommandLineRunner addData (HechoRepo hechoRepo, ClienteRepo clienteRepo, ProductoRepo productoRepo){
		return (args) -> {
		    hechoRepo.deleteAll();
		    clienteRepo.deleteAll();
		    productoRepo.deleteAll();
            DividirNombre dividirNombre = new DividirNombre();
            List<Hecho> hecho1 = dividirNombre.separar_hecho1();
            List<Hecho> hecho2 = dividirNombre.separar_hecho2();
            List<Hecho> hecho3 = dividirNombre.separar_hecho3();
            for (Hecho h: hecho1){
                hechoRepo.save(h);
            }
            for (Hecho h: hecho2){
                hechoRepo.save(h);
            }
            for (Hecho h: hecho3){
                hechoRepo.save(h);
            }
			List<Hecho> hecho = hechoRepo.findAllByOrderByNombre();

			List<Cliente> clientes = new ArrayList<>();
			for(Hecho h: hecho){
				Cliente cliente = new Cliente(h.getNombre(),h.getApellido(),h.getEmail(),null,h.getDia(),h.getMes(),h.getAnyo(),h.getImporte());
				if(!cliente.contenido(clientes)){
					clientes.add(cliente);
					clienteRepo.save(cliente);
				}
			}

            List<Producto> productos = new ArrayList<>();
            for(Hecho h: hecho){
                Producto producto = new Producto(h.getItem(),h.getDescripcion(),h.getImporte());
                if(!producto.contenido(productos)){
                    productos.add(producto);
                    productoRepo.save(producto);
                }else{
                    producto.setImporte(producto.getImporte()+h.getImporte());
                    productoRepo.save(producto);
                }
            }
		};
	}
}
