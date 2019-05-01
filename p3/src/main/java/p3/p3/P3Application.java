package p3.p3;

import p3.p3.Model.*;
import p3.p3.Repository.*;
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
    public CommandLineRunner addData(CompraRepo hechoRepo, ClienteRepo clienteRepo, ProductoRepo productoRepo, LugarRepo lugarRepo, TiempoRepo tiempoRepo) {
        return (args) -> {
            hechoRepo.deleteAll();
            clienteRepo.deleteAll();
            productoRepo.deleteAll();
            lugarRepo.deleteAll();
            tiempoRepo.deleteAll();
            Dividir dividirNombre = new Dividir();
            dividirNombre.separar_hecho1();
            dividirNombre.separar_hecho2();
            dividirNombre.separar_hecho3();
            List<Compra> hechos = dividirNombre.getHechos();
            for (Compra h : hechos) {
                hechoRepo.save(h);
            }

            List<Compra> hecho = hechoRepo.findAllByOrderByNombre();

            List<Cliente> clientes = new ArrayList<>();
            for (Compra c : hecho) {
                Cliente cliente = new Cliente(c.getNombre(), c.getApellido(), c.getEmail(), null, c.getDia(), c.getMes(), c.getAnyo(), c.getImporte());
                if (!cliente.contenido(clientes)) {
                    clientes.add(cliente);
                }
                for (Cliente cl:clientes){
                    clienteRepo.save(cl);
                }
            }

            List<Producto> productos = new ArrayList<>();
            for (Compra c : hecho) {
                Producto producto = new Producto(c.getItem(), c.getDescripcion(), c.getImporte());
                if (!producto.contenido(productos)) {
                    productos.add(producto);
                }
                for(Producto p:productos){
                    productoRepo.save(p);
                }
            }

            List<Lugar> lugares = new ArrayList<>();
            for (Compra c : hecho) {
                Lugar lugar = new Lugar(c.getCapital(), c.getPais(), c.getHabitantes(), c.getImporte());
                if (!lugar.contenido(lugares)) {
                    lugares.add(lugar);
                }
            }
            for (Lugar l: lugares){
                lugarRepo.save(l);
            }

            List<Tiempo> tiempos = new ArrayList<>();
            for (Compra c : hecho) {
                Tiempo tiempo = new Tiempo(c.getDia(),c.getMes(),c.getAnyo(),c.getImporte());
                if (!tiempo.contenido(tiempos)) {
                    tiempos.add(tiempo);
                }
                for(Tiempo t:tiempos){
                    tiempoRepo.save(t);
                }
            }
        };
    }
}
