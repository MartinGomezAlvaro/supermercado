package com.example.aplicacion_accesodatos;

public class Tareas {
    private int Id;
    private  String Descripcion;
    private String FechaVencimiento;
    private String Estado;
    private int CategoriaID;

    public Tareas() {

    }

    public Tareas(int id, String Descripcion, String FechaVencimiento, String Estado, int CategoriaID) {
        this.Id = id;
        this.Descripcion = Descripcion;
        this.FechaVencimiento = FechaVencimiento;
        this.Estado = Estado;
        this.CategoriaID = CategoriaID;
    }
    public Tareas(String Descripcion, String FechaVencimiento, String Estado, int CategoriaID) {
        this.Descripcion = Descripcion;
        this.FechaVencimiento = FechaVencimiento;
        this.Estado = Estado;
        this.CategoriaID = CategoriaID;
    }
    public Tareas(int Id , String descripcion){
        this.Id = Id;
        this.Descripcion = Descripcion;
    }
    public Tareas(int Id){
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public  String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        FechaVencimiento = fechaVencimiento;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public int getCategoriaID() {
        return CategoriaID;
    }

    public void setCategoriaID(int categoriaID) {
        CategoriaID = categoriaID;
    }
}
