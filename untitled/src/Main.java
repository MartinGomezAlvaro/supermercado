import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Usuario usuario1 = new Usuario();
        Lista lista1 = new Lista();

        int respuesta;
        do{
            System.out.println("Elige una opcion");
            System.out.println("1- Añadir anunciante a la lista");
            System.out.println("2- Buscar anunciante por su identificador");
            System.out.println("3- Calcular ingresos totales por anunciantes");
            System.out.println("4- Salir");
            respuesta = sc.nextInt();
            switch (respuesta){
                case 1:
                    lista1.añadirAnunciante();
                    System.out.println("anunciante añadido");
                break;
                case 2:
                    lista1.buscarAnunciante();
                break;
                case 3:
                    lista1.ingresos();
                break;
                case 4:
                    System.out.println("has salido");
                break;
            }
        }while(respuesta<4);
    }
}