public class Usuario extends Cliente{
    public boolean premium;

    public Usuario(){
    }
    public Usuario(String identificador, String contraseña, double descuento, boolean premium){
        super(identificador, contraseña, descuento);
        this.identificador=identificador;
        this.contraseña=contraseña;
        this.descuento=descuento;
        this.premium=premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public String toString(){
        return "Identificador: "+identificador+" , contraseña: "+contraseña+" , descuento: "+descuento+" , premium: "+premium;
    }
}
