public abstract class Cliente {
    public String identificador,contraseña;
    public double descuento;

    public Cliente(){

    }
    public Cliente(String identificador, String contraseña, double descuento){
        this.identificador =identificador;
        this.contraseña=contraseña;
        this.descuento=descuento;
    }

    public  String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public  double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
