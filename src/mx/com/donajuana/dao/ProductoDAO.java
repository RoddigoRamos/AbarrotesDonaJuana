/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.donajuana.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.donajuana.datos.Producto;

/**
 *
 * @author rodrigo
 */
public class ProductoDAO implements CRUD {

    @Override
    public List<Producto> list() {
        List<Producto> productos = new ArrayList<>();
        try {
            Statement st = Conexion.getInstance().
                    getConexion().createStatement();
            System.out.println(Producto.fieldsToString());
            ResultSet rs = st.executeQuery(String.format("SELECT %s FROM %s",
                    Producto.fieldsToString(), Producto.TABLA));

            while (rs.next()) {
                Integer id = rs.getInt(Producto.FIELDS[0]);
                String descripcion = rs.getString(Producto.FIELDS[1]);
                Double precio = Double.parseDouble(rs.getString(Producto.FIELDS[2]));
                String clasificacion = rs.getString(Producto.FIELDS[3]);
                Integer existencia = rs.getInt(Producto.FIELDS[4]);
                Integer existenciaMinima = rs.getInt(Producto.FIELDS[5]);
                Integer existenciaMaxima = rs.getInt(Producto.FIELDS[6]);

                Producto prod = new Producto(id, descripcion, precio,
                        clasificacion, existencia, existenciaMinima,
                        existenciaMaxima);
                productos.add(prod);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return productos;
    }

    @Override
    public void create(Producto producto) {

    }

    @Override
    public void update(Producto producto) {

    }

    @Override
    public void delete(Integer id) {

    }

}
