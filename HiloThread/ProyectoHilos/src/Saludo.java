public class Saludo extends Thread {
    int numHilo = 0;
    public Saludo(int numHilo){
        this.numHilo= numHilo;
    }
    @Override
    public void run(){
        System.out.println("...... ARRANCA EL HILO......"+numHilo);
        for (int i=0;i<3;i++){
            System.out.println("El hilo Nº "+numHilo+ " te saluda"+" Vez: "+(i+1));
        }
    }
}
