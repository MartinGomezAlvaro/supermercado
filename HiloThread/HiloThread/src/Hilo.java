public class Hilo {
    public void bucle() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("hola soy "+i);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
