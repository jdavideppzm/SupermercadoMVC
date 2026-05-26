/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercadomvc.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private final String BD = "supermercado_mvc";// Nombre de la base de datos
    private final String USUARIO = "root";// Usuario de MySQL
    private final String PASSWORD = "23Agosto081992";// Contraseña de MySQL
    private final String IP = "localhost";// Dirección del servidor
    private final String PUERTO = "3306";// Puerto de MySQL

private final String URL = 
        "jdbc:mysql://" + IP + ":" + PUERTO + "/" + BD; // Cadena de conexión JDBC

// Método para conectar Java con MySQL
public Connection conectar() {
    // Variable que almacenará la conexión
        Connection conexion = null;

        try {

            // Intentar establecer conexión
            conexion = DriverManager.getConnection(
                    URL, USUARIO, PASSWORD);

            System.out.println("Conexión exitosa a la base de datos");

        } catch (SQLException e) {

            // Mostrar error si falla la conexión
            System.out.println(
                    "Error en la conexión: " + e.getMessage());

        }

        // Retornar la conexión
        return conexion;
    
    
}

}
