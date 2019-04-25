package p3.p3.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DividirNombre {
    
    List<Hecho3> hechos3 = new ArrayList<>();

    File archivo = new File ("../Data/Practica_3_SSII_hechos3.csv");
    FileReader fr = new FileReader (archivo);
    BufferedReader bf = new BufferedReader(fr);

    String[] parts;
    String[] apellidoNombre;

    public List<Hecho3> separar() {
        try {
            String lines;
            Hecho3 h3 = null;
            while ((lines = bf.readLine()) != null) {
                System.out.println(lines);
                parts = lines.split(";");
                apellidoNombre = parts[0].split(",");
                
                h3.setApellido(apellidoNombre[0]);
                h3.setNombre(apellidoNombre[1].substring(1));
                h3.setEmail(parts[1]);
                h3.setDia(Integer.parseInt(parts[2]));
                h3.setMes(parts[3]);
                h3.setAnyo(Integer.parseInt(parts[4]));
                h3.setPais(parts[5]);
                h3.setCapital(parts[6]);
                h3.setPoblacion(Integer.parseInt(parts[7]));
                h3.setItem(parts[8]);
                h3.setDescripcion(parts[9]);
                h3.setImporte(Integer.parseInt(parts[10]));
                h3.setValoracion(Integer.parseInt(parts[11]));
                h3.setFechaPedido(parts[12]);
                hechos3.add(h3);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.hechos3;
    }

    public DividirNombre() throws FileNotFoundException, IOException {
    }




}
