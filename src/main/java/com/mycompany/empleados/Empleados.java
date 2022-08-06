/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empleados;

import Gui.Crear;
import api.api_cliente;
import java.sql.SQLException;

/**
 *
 * @author shiry
 */
public class Empleados {

    
    public static void main(String[] args) throws SQLException {
        api_cliente cd = new api_cliente();
        System.out.println(cd.getEmpleados());
        Crear cr = new Crear();
        cr.setVisible(true);
    }
}
