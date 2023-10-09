import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lista {
    Scanner sc = new Scanner(System.in);
    ArrayList<Cliente> array = new <Cliente>ArrayList();

    public void añadirAnunciante() {
        System.out.println("escribe el identificador(correo)");
        String resp1 = sc.next();
        System.out.println("su contraseña");
        String resp2 = sc.next();
        System.out.println("descuentos");
        double resp3 = sc.nextDouble();
        System.out.println("eres usuario premium? , escribe 'true' si es asi , si no escribe 'false'");
        boolean resp4 = Boolean.parseBoolean(sc.next());

        Usuario usuario1 = new Usuario(resp1, resp2, resp3, resp4);
        array.add(usuario1);
    }

    public void buscarAnunciante() {
        System.out.println("escribe el identificador(correo)");
        String id = sc.next();
        for (Cliente posicion : array) {
            if (posicion instanceof Usuario) {
                if (posicion.identificador.equals(id)) {
                    System.out.println(posicion.toString());
                } else {
                    System.out.println("no hay busqueda para el identificador ");
                }
            }
        }
    }
    public void ingresos(){
        double importe =0;
        System.out.println("escribe el identificador(correo)");
        String id = sc.next();
        for (Cliente posicion : array) {
            if (posicion instanceof Usuario) {
                if (posicion.identificador.equals(id)) {
                    if(((Usuario) posicion).isPremium()){
                        importe = 35.5-posicion.descuento;
                    }else {
                        importe = 20.5-posicion.descuento;
                    }
                }
            }
        }
        System.out.println("importe: "+importe);
    }
}
