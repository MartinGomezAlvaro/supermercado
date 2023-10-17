package com.example.aplicacion_accesodatos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class EditarTarea {

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnVolver;

    @FXML
    private TextField txtCategoria;

    @FXML
    private TextArea txtDescripcion;

    @FXML
    private TextField txtEstado;

    @FXML
    private TextField txtFecha;

    @FXML
    private TextField txtID;

    private final com.example.aplicacion_accesodatos.Operaciones operaciones;

    public EditarTarea() {
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
    void actualizarTarea(ActionEvent event) {
        com.example.aplicacion_accesodatos.Tareas tareas = new Tareas();
        try{
            int Id = Integer.parseInt(txtID.getText());
            String Descripcion = txtDescripcion.getText();
            String FechaVencimiento =txtFecha.getText();
            String Estado = txtEstado.getText();
            int CategoriaID = Integer.parseInt(txtCategoria.getText());
            if(!txtID.getText().isEmpty() && !txtDescripcion.getText().isEmpty() && !txtEstado.getText().isEmpty() && !txtCategoria.getText().isEmpty() && !txtFecha.getText().isEmpty()){
                operaciones.guardarDatos(tareas);
            }
            else {
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error en datos");
                alert.setContentText("Debe introducir todos los datos");
                alert.showAndWait();
                throw new RuntimeException("");
            }
        }catch (SQLException sqle){
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

}
