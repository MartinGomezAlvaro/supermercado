package com.example.aplicacion_accesodatos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MostrarCategoriaTareas {

    @FXML
    private Button btnMostrar;

    @FXML
    private Button btnVolver;

    @FXML
    private TableColumn<?, ?> columnaDescripcion;

    @FXML
    private TableColumn<?, ?> columnaEstado;

    @FXML
    private TableColumn<?, ?> columnaFechaVencimiento;

    @FXML
    private TableColumn<?, ?> columnaID;

    @FXML
    private TableView<?> tablaMostrarTareas;

    @FXML
    private TextField txtID;

    @FXML
    void mostrarTareas(ActionEvent event) {

    }

    @FXML
    void volverInicio(ActionEvent event) {

    }

}
