// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     Cliente cliente1 = new Cliente("Cliente 1", new int[]{2,2,1,5,2,3});
     Cliente cliente2 = new Cliente("Cliente 2", new int[]{1,3,5,1,1});
     Cliente cliente3 = new Cliente("Cliente 3", new int[]{4,5,6,7,8});

      long initialTime = System.currentTimeMillis();
       // System.out.println(initialTime);
        CajeraThread  cajera1 = new CajeraThread("Cajera1",cliente1,initialTime);
        CajeraThread  cajera2 = new CajeraThread("Cajera2",cliente2,initialTime);
        CajeraThread  cajera3 = new CajeraThread("Cajera3",cliente3,initialTime);
        cajera1.start();
        cajera2.start();
        cajera3.start();

    }
}