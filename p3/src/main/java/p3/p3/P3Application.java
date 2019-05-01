package p3.p3;

import p3.p3.Model.*;
import p3.p3.Repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import p3.p3.utils.Dividir;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class P3Application {

    public static void main(String[] args) {
        SpringApplication.run(P3Application.class, args);
    }

    @Bean
    public CommandLineRunner addData(CompraRepo compraRepo, ClienteRepo clienteRepo, ProductoRepo productoRepo, LugarRepo lugarRepo, TiempoRepo tiempoRepo) {
        return (args) -> {
            compraRepo.deleteAll();
            clienteRepo.deleteAll();
            productoRepo.deleteAll();
            lugarRepo.deleteAll();
            tiempoRepo.deleteAll();
            Dividir dividirNombre = new Dividir();
            dividirNombre.separar_hecho1();
            dividirNombre.separar_hecho2();
            dividirNombre.separar_hecho3();
            List<Compra> hechos = dividirNombre.getCompras();
            for (Compra h : hechos) {
                compraRepo.save(h);
            }

            List<Compra> compra = compraRepo.findAll();

            List<Cliente> clientes = new ArrayList<>();
            for (Compra c : compra) {
                Cliente cliente = new Cliente(c.getNombre(), c.getApellido(), c.getEmail(), null, c.getDia(), c.getMes(), c.getAnyo());
                if (!cliente.contenido(clientes)) {
                    clientes.add(cliente);
                }
            }
            clienteRepo.saveAll(clientes);

            List<Producto> productos = new ArrayList<>();
            for (Compra c : compra) {
                Producto producto = new Producto(c.getItem(), c.getDescripcion(), c.getImporte());
                if (!producto.contenido(productos)) {
                    productos.add(producto);
                }
            }
            productoRepo.saveAll(productos);

            List<Lugar> lugares = new ArrayList<>();
            for (Compra c : compra) {
                Lugar lugar = new Lugar(c.getCapital(), c.getPais(), c.getHabitantes());
                if (!lugar.contenido(lugares)) {
                    lugares.add(lugar);
                }
            }
            lugarRepo.saveAll(lugares);

            List<Tiempo> tiempos = new ArrayList<>();
            for (Compra c : compra) {
                String[] fecha = c.getFechaPedido().split("/");
                Tiempo tiempo = new Tiempo(Integer.parseInt(fecha[0]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[2]));
                if (!tiempo.contenido(tiempos)) {
                    tiempos.add(tiempo);
                }
            }
            tiempoRepo.saveAll(tiempos);

        };
    }
}
