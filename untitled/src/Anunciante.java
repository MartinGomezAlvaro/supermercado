public class Anunciante extends Cliente {
    public int numeroAnuncios;

    public Anunciante(){

    }
    public Anunciante(String identificador, String contraseña, double descuento, int numeroAnuncios){
        super(identificador, contraseña, descuento);
        this.identificador=identificador;
        this.contraseña=contraseña;
        this.descuento=descuento;
        this.numeroAnuncios=numeroAnuncios;
    }

    public int getNumeroAnuncios() {
        return numeroAnuncios;
    }

    public void setNumeroAnuncios(int numeroAnuncios) {
        this.numeroAnuncios = numeroAnuncios;
    }

}

