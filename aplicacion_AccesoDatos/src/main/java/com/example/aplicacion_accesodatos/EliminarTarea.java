package com.example.aplicacion_accesodatos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class EliminarTarea implements Initializable {

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnVolver;

    @FXML
    private TableColumn<?, ?> columnaID;

    @FXML
    private TableColumn<?, ?> columnaTarea;

    @FXML
    private TableView<Tareas> tablaEliminar;

    @FXML
    private TextField txtID;
    private ObservableList<Tareas> tareas;
    private final com.example.aplicacion_accesodatos.Operaciones operaciones;

    public EliminarTarea() {
        operaciones = new Operaciones();
        try {
            operaciones.conectar();
        } catch (SQLException sqle) {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error al conectar a la base de dasos");
            alert.showAndWait();
            throw new RuntimeException("");
        } catch (ClassNotFoundException cnfe) {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.showAndWait();
            throw new RuntimeException("");
        } catch (IOException ioe) {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.showAndWait();
            throw new RuntimeException("");
        }

        System.out.println(System.getProperty("user.home"));
    }

    @FXML
    void eliminarTarea(ActionEvent event) {
        try{
            int Id = Integer.parseInt(txtID.getText());
            if (!txtID.getText().isEmpty()){
                Tareas tareas = new Tareas(Id);
                operaciones.eliminarTarea(tareas);
            }else{
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error en datos");
                alert.setContentText("Debe introducir los datos");
                alert.showAndWait();
                throw new RuntimeException("");
            }
        }catch(SQLException sqle) {
            }
    }

    @FXML
    void volverInicio(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("inicio.fxml"));
        try {
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

            // Obtener una referencia al Stage de la ventana actual
            Stage currentStage = (Stage) btnVolver.getScene().getWindow();
            // Cerrar la ventana actual
            currentStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        // Creo el observablelist
        tareas = FXCollections.observableArrayList();

        // Asigno las columnas con los atributos del modelo
        this.columnaID.setCellValueFactory(new PropertyValueFactory("Id"));
        this.columnaTarea.setCellValueFactory(new PropertyValueFactory("Descripcion"));
        try {
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nba", "root", "ivan");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from tareas");
            while (rs.next()) {
                int Id = rs.getInt("Id");
                String descripcion = rs.getString("Descripcion");
                this.tareas.add(new Tareas(Id, descripcion));
                this.tablaEliminar.setItems(this.tareas);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }


}

