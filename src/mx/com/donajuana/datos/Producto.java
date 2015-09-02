/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.donajuana.datos;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rodrigo
 */
public class Producto {

    public static final String TABLA = "productos";
    public static final String[] FIELDS
            = {"id", "descripcion", "precio", "clasificacion", "existencia", 
                "existenciaMinima", "existenciaMaxima"};

    private Integer id;
    private String descripcion;
    private Double precio;
    private String clasificacion;
    private Integer existencia;
    private Integer existenciaMinima;
    private Integer existenciaMaxima;

    public Producto(Integer id, String descripcion, Double precio,
            String clasificacion, Integer existencia, Integer existenciaMinima,
            Integer existenciaMaxima) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.clasificacion = clasificacion;
        this.existencia = existencia;
        this.existenciaMinima = existenciaMinima;
        this.existenciaMaxima = existenciaMaxima;
    }

    public Integer getId() {
        if (this.id == null) {
            throw new NullPointerException(
                    String.format("El producto %s no existe.", 
                                    this.descripcion));
        }
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public Integer getExistenciaMinima() {
        return existenciaMinima;
    }

    public void setExistenciaMinima(Integer existenciaMinima) {
        this.existenciaMinima = existenciaMinima;
    }

    public Integer getExistenciaMaxima() {
        return existenciaMaxima;
    }

    public void setExistenciaMaxima(Integer existenciaMaxima) {
        this.existenciaMaxima = existenciaMaxima;
    }

    public static String fieldsToString() {
        String fieldsStr = "";
        List<String> fieldsToConvert = Arrays.asList(FIELDS);
        for (String field : fieldsToConvert) {
            fieldsStr = String.format("%s, %s", fieldsStr, field);
        }
        return fieldsStr.replaceFirst(",", fieldsStr);
    }

    @Override
    /*public String toString() {
        return String.format("%s %s %s %s %s %s %s", this.id, this.descripcion,
                this.precio, this.clasificacion, this.existencia,
                this.existenciaMinima, this.existenciaMaxima);
    }*/
    public String toString() {
            return String.format("%s %s %s %s", this.getId(), 
                    this.getDescripcion(), this.getPrecio(), 
                    this.getExistencia());
        }

}
