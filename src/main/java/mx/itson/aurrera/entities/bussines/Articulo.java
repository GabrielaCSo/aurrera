/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.aurrera.entities.bussines;

/**
 *
 * @author alumnog
 */
public class Articulo {

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the tasaIva
     */
    public int getTasaIva() {
        return tasaIva;
    }

    /**
     * @param tasaIva the tasaIva to set
     */
    public void setTasaIva(int tasaIva) {
        this.tasaIva = tasaIva;
    }
    public int codigo;
    public String nombre;
    public Double precio;
    public int tasaIva;
    
}
