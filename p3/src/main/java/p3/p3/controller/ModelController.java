package p3.p3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import p3.p3.model.*;
import p3.p3.repository.*;

import java.util.List;

@Controller
public class ModelController {
    @Autowired
    private CompraRepo compraRepo;
    @Autowired
    private ClienteRepo clienteRepo;
    @Autowired
    private LugarRepo lugarRepo;
    @Autowired
    private ProductoRepo productoRepo;
    @Autowired
    private TiempoRepo tiempoRepo;

    @GetMapping("/index")
    public String index(Model model){
        List<Compra> compras = compraRepo.findAll();
        List<Cliente> clientes = clienteRepo.findALL();
        List<Lugar> lugares = lugarRepo.findAll();
        List<Producto> productos = productoRepo.findAll();
        List<Tiempo> tiempos = tiempoRepo.findAll();
        model.addAttribute("compras",compras);
        model.addAttribute("clientes",clientes);
        model.addAttribute("lugares",lugares);
        model.addAttribute("productos",productos);
        model.addAttribute("tiempos",tiempos);
        return "index";
    }

}
