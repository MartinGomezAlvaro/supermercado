package com.example.aplicacion_accesodatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Operaciones {
    private Connection conexion;

    public void conectar() throws ClassNotFoundException, SQLException, IOException {

        Properties properties= new Properties();
        String host="";
        String port="";
        String name="";
        String username="";
        String password="";
        try {
            System.out.println("river");
            properties.load(new FileInputStream(new File("src/main/resources/configuration/database.properties")));
//System.out.println("river");

            host=String.valueOf(properties.get("host"));

            port=String.valueOf(properties.get("port"));

            name=String.valueOf(properties.get("name"));

            username=String.valueOf(properties.get("username"));

            password=String.valueOf(properties.get("password"));

            System.out.println(host+" "+port+" "+name+" "+username+" "+password);
        }catch (FileNotFoundException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + name + "?serverTimezone=UTC",
                username, password);
        if (conexion!=null)
            System.out.println("Conexion correcta");
    }

    public void desconectar() throws SQLException {
        conexion.close();
    }

    public void guardarDatos(Tareas tareas) throws SQLException {
        String sql = "INSERT INTO tareas (Id,Descripcion, FechaVencimiento, Estado, CategoriaID) VALUES (?, ?, ?, ?,?)";

        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1, tareas.getId());
        sentencia.setString(2, tareas.getDescripcion());
        sentencia.setString(3,  tareas.getFechaVencimiento());
        sentencia.setString(4, tareas.getEstado());
        sentencia.setInt(5, tareas.getCategoriaID());
        sentencia.executeUpdate();
    }
    public void eliminarTarea(Tareas tareas) throws SQLException{
        String sql = "DELETE FROM tareas WHERE Id = ?";

        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1, tareas.getId());
        sentencia.executeUpdate();

    }
    public void actualizarTareas(Tareas tareas) throws  SQLException{
        String sql = "UPDATE tareas set Descripcion = ?, FechaVencimiento=?, Estado=?, CategoriaID =? where Id = ?";

        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1, tareas.getId());
        sentencia.executeUpdate();
    }
}
