/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.supermercadomvc.modelo;

import com.mycompany.supermercadomvc.conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpleadoDAO {

    // Crear objeto de conexión
    ConexionBD conexionBD = new ConexionBD();

    // Método para guardar empleados en MySQL
    public boolean guardarEmpleado(Empleado empleado) {

        // Consulta SQL INSERT
        String sql =
                "INSERT INTO empleados(nombre, cargo, salario) VALUES (?, ?, ?)";

        try {

            // Obtener conexión a la base de datos
            Connection conexion = conexionBD.conectar();

            // Preparar la consulta SQL
            PreparedStatement ps =
                    conexion.prepareStatement(sql);

            // Reemplazar los parámetros ?
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getCargo());
            ps.setDouble(3, empleado.getSalario());

            // Ejecutar INSERT
            ps.executeUpdate();

            System.out.println("Empleado guardado correctamente");

            return true;

        } catch (SQLException e) {

            System.out.println(
                    "Error al guardar empleado: " + e.getMessage());

            return false;

        }

    }

    public ArrayList<Empleado> buscarPorCargo(String cargo) {

        ArrayList<Empleado> listaEmpleados =
        new ArrayList<>();
        
        String sql =
        "SELECT * FROM empleados WHERE cargo = ?";
        
        try {

            Connection conexion = conexionBD.conectar();
            PreparedStatement ps =
                conexion.prepareStatement(sql);
            
            ps.setString(1, cargo);//Reemplaza el ? por el cargo recibido//
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {

                Empleado empleado = new Empleado();//Crea objeto Empleado nuevo//
              
                empleado.setId(rs.getInt("id"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setCargo(rs.getString("cargo"));
                empleado.setSalario(rs.getDouble("salario"));
                
                listaEmpleados.add(empleado);//Agrega el empleado a la lista//
        }
            
    } catch (SQLException e) {

        System.out.println(
        "Error al buscar empleados: " + e.getMessage());
        
    }
        
        return listaEmpleados;//Retorna  la lista completa de empleados encontrados//
}
    
    public boolean actualizarEmpleado(Empleado empleado) {

    String sql =
            "UPDATE empleados SET nombre = ?, cargo = ?, salario = ? WHERE id = ?";

    try {

        Connection conexion = conexionBD.conectar();

        PreparedStatement ps =
                conexion.prepareStatement(sql);

        ps.setString(1, empleado.getNombre());
        ps.setString(2, empleado.getCargo());
        ps.setDouble(3, empleado.getSalario());
        ps.setInt(4, empleado.getId());

        ps.executeUpdate();

        System.out.println(
                "Empleado actualizado correctamente");

        return true;

    } catch (SQLException e) {

        System.out.println(
                "Error al actualizar empleado: "
                + e.getMessage());

        return false;

    }

}
    
        public boolean eliminarEmpleado(int id) {

        String sql =
                "DELETE FROM empleados WHERE id = ?";

        try {

            Connection conexion = conexionBD.conectar();

            PreparedStatement ps =
                    conexion.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println(
                    "Empleado eliminado correctamente");

            return true;

        } catch (SQLException e) {

            System.out.println(
                    "Error al eliminar empleado: "
                    + e.getMessage());

            return false;

        }

    }
    
    
    
    
    
}
