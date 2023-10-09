public class CajeraThread extends Thread {
    private String nombre;
    private Cliente cliente;
    private  long tiempo;

    public CajeraThread() {
    }

    public CajeraThread(String nombre, Cliente cliente, long tiempo) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempo=tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }
    @Override
    public void run(){
        for (int i =0;i<this.cliente.getCarroCompra().length;i++){
            //se procesa el pedido en x segundos
           this.esperarXsegundos(cliente.getCarroCompra()[i]);
          /*  System.out.println("procesando el producto : "+(i+1)+" del cliente : "+this.cliente.getNombre()+" en el tiempo: "
                    +(System.currentTimeMillis()-this.tiempo)/1000+" seg");*/

        }
        System.out.println("la cajera : "+this.nombre+" ha terminado de procesar  : "+this.cliente.getNombre()+" en el tiempo: "
                +(System.currentTimeMillis()-this.tiempo)/1000+" seg");

    }
    private void esperarXsegundos(int segundos){
        try{
            Thread.sleep(segundos*1000);
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
