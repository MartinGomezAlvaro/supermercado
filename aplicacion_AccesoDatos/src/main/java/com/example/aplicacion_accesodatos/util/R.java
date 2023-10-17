package com.example.aplicacion_accesodatos.util;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

public class R {

    public static InputStream getImage(String name) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream("images" + File.separator + name);
    }

    public static InputStream getProperties(String name) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream("Configuration" + File.separator + name);
    }

    public static URL getAplicacion_accesodatos(String name) {
        return Thread.currentThread().getContextClassLoader().getResource("com/example/aplicacion_accesodatos" + File.separator + name);
    }
}