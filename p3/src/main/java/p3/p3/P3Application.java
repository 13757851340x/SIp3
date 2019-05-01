package p3.p3;

import p3.p3.Model.*;
import p3.p3.Repository.ClienteRepo;
import p3.p3.Repository.HechoRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import p3.p3.Repository.LugarRepo;
import p3.p3.Repository.ProductoRepo;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class P3Application {

    public static void main(String[] args) {
        SpringApplication.run(P3Application.class, args);
    }

    @Bean
    public CommandLineRunner addData(HechoRepo hechoRepo, ClienteRepo clienteRepo, ProductoRepo productoRepo, LugarRepo lugarRepo) {
        return (args) -> {
            hechoRepo.deleteAll();
            clienteRepo.deleteAll();
            productoRepo.deleteAll();
            lugarRepo.deleteAll();
            Dividir dividirNombre = new Dividir();
            dividirNombre.separar_hecho1();
            dividirNombre.separar_hecho2();
            dividirNombre.separar_hecho3();
            List<Hecho> hechos = dividirNombre.getHechos();
            for (Hecho h : hechos) {
                hechoRepo.save(h);
            }

            List<Hecho> hecho = hechoRepo.findAllByOrderByNombre();

            List<Cliente> clientes = new ArrayList<>();
            for (Hecho h : hecho) {
                Cliente cliente = new Cliente(h.getNombre(), h.getApellido(), h.getEmail(), null, h.getDia(), h.getMes(), h.getAnyo(), h.getImporte());
                if (!cliente.contenido(clientes)) {
                    clientes.add(cliente);
                }
                for (Cliente c:clientes){
                    clienteRepo.save(c);
                }
            }

            List<Producto> productos = new ArrayList<>();
            for (Hecho h : hecho) {
                Producto producto = new Producto(h.getItem(), h.getDescripcion(), h.getImporte());
                if (!producto.contenido(productos)) {
                    productos.add(producto);
                }
                for(Producto p:productos){
                    productoRepo.save(p);
                }
            }

            List<Lugar> lugares = new ArrayList<>();
            for (Hecho h : hecho) {
                Lugar lugar = new Lugar(h.getCapital(), h.getPais(), h.getHabitantes(), h.getImporte());
                if (!lugar.contenido(lugares)) {
                    lugares.add(lugar);
                }
            }
            for (Lugar l: lugares){
                lugarRepo.save(l);
            }
        };
    }
}
