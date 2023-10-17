package com.example.aplicacion_accesodatos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TareasHechas {

    @FXML
    private Button btnMostrar;

    @FXML
    private Button btnVolver;

    @FXML
    private TableColumn<?, ?> columnaCategoria;

    @FXML
    private TableColumn<?, ?> columnaDescripcion;

    @FXML
    private TableColumn<?, ?> columnaFecha;

    @FXML
    private TableColumn<?, ?> columnaID;

    @FXML
    private TableView<?> tablaTareasHechas;

    @FXML
    void mostrarTareasHechas(ActionEvent event) {

    }

    @FXML
    void volverInicio(ActionEvent event) {

    }

}
