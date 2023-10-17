package com.example.aplicacion_accesodatos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Inicio {

    @FXML
    private AnchorPane anchorBtnAnadir;

    @FXML
    private AnchorPane anchorBtnEditar;

    @FXML
    private AnchorPane anchorBtnEliminar;

    @FXML
    private AnchorPane anchorBtnMostrar;

    @FXML
    private AnchorPane anchorBtnRealizadas;

    @FXML
    private AnchorPane anchorInicio;

    @FXML
    private Button btnAñadir;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnMostrar;

    @FXML
    private Button btnRealizadas;

    @FXML
    void añadirTarea(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("añadirTarea.fxml"));
        try {
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

            // Obtener una referencia al Stage de la ventana actual
            Stage currentStage = (Stage) btnAñadir.getScene().getWindow();
            // Cerrar la ventana actual
            currentStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void editarTarea(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("editarTarea.fxml"));
        try {
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

            // Obtener una referencia al Stage de la ventana actual
            Stage currentStage = (Stage) btnEditar.getScene().getWindow();
            // Cerrar la ventana actual
            currentStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void eliminarTarea(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eliminarTarea.fxml"));
        try {
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

            // Obtener una referencia al Stage de la ventana actual
            Stage currentStage = (Stage) btnEliminar.getScene().getWindow();
            // Cerrar la ventana actual
            currentStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void mostrarTarea(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mostrarTarea.fxml"));
        try {
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

            // Obtener una referencia al Stage de la ventana actual
            Stage currentStage = (Stage) btnMostrar.getScene().getWindow();
            // Cerrar la ventana actual
            currentStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void tareasRealizadas(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tareasRealizadas.fxml"));
        try {
            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

            // Obtener una referencia al Stage de la ventana actual
            Stage currentStage = (Stage) btnRealizadas.getScene().getWindow();
            // Cerrar la ventana actual
            currentStage.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
