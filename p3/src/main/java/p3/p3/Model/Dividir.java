package p3.p3.Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Dividir {

    List<Hecho> hechos = new ArrayList<>();

    File archivo1 = new File ("Data/Practica_3_SSII_hechos1.csv");
    FileReader fr1 = new FileReader (archivo1);
    BufferedReader bf1 = new BufferedReader(fr1);

    File archivo2 = new File ("Data/Practica_3_SSII_hechos2.csv");
    FileReader fr2 = new FileReader (archivo2);
    BufferedReader bf2 = new BufferedReader(fr2);

    File archivo3 = new File ("Data/Practica_3_SSII_hechos3.csv");
    FileReader fr3 = new FileReader (archivo3);
    BufferedReader bf3 = new BufferedReader(fr3);



    String[] parts;
    String[] apellidoNombre;
    String[] diaMesAnyo;


    public void separar_hecho1() {
        try {
            String lines;
            if((lines=bf1.readLine())!=null){}
            while ((lines = bf1.readLine()) != null) {
                Hecho h1 = new Hecho();
                parts = lines.split(";");
                h1.setIdCliente(Integer.parseInt(parts[0]));
                h1.setApellido(parts[2]);
                h1.setNombre(parts[1]);
                h1.setEmail(parts[3]);
                h1.setDia(Integer.parseInt(parts[4]));
                h1.setMes(parts[5]);
                h1.setAnyo(Integer.parseInt(parts[6]));
                h1.setPais(null);
                h1.setCapital(parts[7]);
                h1.setHabitantes(null);
                h1.setItem(parts[8]);
                h1.setDescripcion(parts[9]);
                h1.setImporte(Integer.parseInt(parts[10]));
                h1.setValoracion(Integer.parseInt(parts[11]));
                h1.setFechaPedido(parts[12]);
                hechos.add(h1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void separar_hecho2() {
        try {
            String lines;
            if((lines=bf2.readLine())!=null){}
            while ((lines = bf2.readLine()) != null) {
                Hecho h2 = new Hecho();
                parts = lines.split(";");
                apellidoNombre = parts[0].split(" ");
                h2.setApellido(apellidoNombre[1]);
                h2.setNombre(apellidoNombre[0]);
                h2.setEmail(parts[1]);
                diaMesAnyo = parts[2].split(" de ");
                h2.setDia(Integer.parseInt(diaMesAnyo[0]));
                h2.setMes(diaMesAnyo[1]);
                h2.setAnyo(Integer.parseInt(diaMesAnyo[2]));
                h2.setPais(parts[3]);
                h2.setCapital(parts[4]);
                h2.setHabitantes(null);
                h2.setItem(parts[5]);
                h2.setDescripcion(parts[6]);
                h2.setImporte(Integer.parseInt(parts[8]));
                h2.setValoracion(Integer.parseInt(parts[7]));
                h2.setFechaPedido(parts[9]);
                hechos.add(h2);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void separar_hecho3() {
        try {
            String lines;
            if((lines=bf3.readLine())!=null){}
            while ((lines = bf3.readLine()) != null) {
                Hecho h3 = new Hecho();
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
                h3.setHabitantes(Integer.parseInt(parts[7]));
                h3.setItem(parts[8]);
                h3.setDescripcion(parts[9]);
                h3.setImporte(Integer.parseInt(parts[10]));
                h3.setValoracion(Integer.parseInt(parts[11]));
                h3.setFechaPedido(parts[12]);
                hechos.add(h3);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Dividir() throws FileNotFoundException, IOException {
    }

    public List<Hecho> getHechos(){
        return this.hechos;
    }


}
