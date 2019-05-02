package p3.p3;

import p3.p3.Model.*;
import p3.p3.Repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import p3.p3.utils.Wrapper;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class P3Application {

    public static void main(String[] args) {
        SpringApplication.run(P3Application.class, args);
    }

    @Bean
    public CommandLineRunner addData(CompraRepo compraRepo, DataTableRepo dataTableRepo, ClienteRepo clienteRepo, ProductoRepo productoRepo, LugarRepo lugarRepo, TiempoRepo tiempoRepo) {
        return (args) -> {
            compraRepo.deleteAll();
            dataTableRepo.deleteAll();
            clienteRepo.deleteAll();
            productoRepo.deleteAll();
            lugarRepo.deleteAll();
            tiempoRepo.deleteAll();
            Wrapper wrapper = new Wrapper();
            wrapper.separar_hecho1();
            wrapper.separar_hecho2();
            wrapper.separar_hecho3();
            List<DataTable> datas = wrapper.getDataTables();
            for (DataTable d : datas) {
                dataTableRepo.save(d);
            }

            List<DataTable> dataTable = dataTableRepo.findAll();

            List<Cliente> clientes = new ArrayList<>();
            List<Producto> productos = new ArrayList<>();
            List<Lugar> lugares = new ArrayList<>();
            List<Tiempo> tiempos = new ArrayList<>();
            for (DataTable d : dataTable) {
                Cliente cliente = new Cliente(d.getNombre(), d.getApellido(), d.getEmail(), d.getDia(), d.getMes(), d.getAnyo());
                if (!cliente.contenido(clientes)) {
                    clientes.add(cliente);
                }
                Producto producto = new Producto(d.getItem(), d.getDescripcion(), d.getImporte());
                if (!producto.contenido(productos)) {
                    productos.add(producto);
                }
                Lugar lugar = new Lugar(d.getCapital(), d.getPais(), d.getHabitantes());
                if (!lugar.contenido(lugares)) {
                    lugares.add(lugar);
                }
                String[] fecha = d.getFechaPedido().split("/");
                Tiempo tiempo = new Tiempo(Integer.parseInt(fecha[0]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[2]));
                if (!tiempo.contenido(tiempos)) {
                    tiempos.add(tiempo);
                }
            }
            clientes=clienteRepo.saveAll(clientes);
            productos=productoRepo.saveAll(productos);
            lugares=lugarRepo.saveAll(lugares);
            tiempos=tiempoRepo.saveAll(tiempos);

            for(DataTable d: dataTable){
                Compra compra = new Compra();
                compra.setCliente(clienteRepo.findByNombreAndApellido(d.getNombre(),d.getApellido()));
                compra.setLugar(lugarRepo.findByCapital(d.getCapital()));
                String[] fecha = d.getFechaPedido().split("/");
                compra.setTiempo(tiempoRepo.findByDiaAndNumMesAndAnyo(Integer.parseInt(fecha[0]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[2])));
                compra.setProducto(productoRepo.findByNombre(d.getItem()));
                compra.setValoracion(d.getValoracion());
                compraRepo.save(compra);
            }
        };
    }
}
