/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chemorrow
 */
public class Absenta {
    private int precio;
    private int graduacion;

    public Absenta() {
    }

    public Absenta(int precio, int graduacion) {
        this.precio = precio;
        this.graduacion = graduacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(int graduacion) {
        this.graduacion = graduacion;
    }

    @Override
    public String toString() {
        return "Absenta{" + "precio=" + precio + ", graduacion=" + graduacion + '}';
    }
}
