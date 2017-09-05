/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Daniel
 */
public class Hornoselectricosygas extends Articulos {
    
    private String potencia;
    private int numbandejas;
    private String gratinador;
    private String tipocontrol;
    private int temperaturamax;

    public Hornoselectricosygas(String potencia, int numbandejas, String gratinador, String tipocontrol, int temperaturamax, int idMarca, int idCategoria, int idArticulo, String nombre, int cantidad, float precio, String descripcion, String color, String imagen) {
        super(idMarca, idCategoria, idArticulo, nombre, cantidad, precio, descripcion, color, imagen);
        this.potencia = potencia;
        this.numbandejas = numbandejas;
        this.gratinador = gratinador;
        this.tipocontrol = tipocontrol;
        this.temperaturamax = temperaturamax;
    }

    public Hornoselectricosygas(String potencia, int numbandejas, String gratinador, String tipocontrol, int temperaturamax) {
        this.potencia = potencia;
        this.numbandejas = numbandejas;
        this.gratinador = gratinador;
        this.tipocontrol = tipocontrol;
        this.temperaturamax = temperaturamax;
    }

    public Hornoselectricosygas() {
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getNumbandejas() {
        return numbandejas;
    }

    public void setNumbandejas(int numbandejas) {
        this.numbandejas = numbandejas;
    }

    public String getGratinador() {
        return gratinador;
    }

    public void setGratinador(String gratinador) {
        this.gratinador = gratinador;
    }

    public String getTipocontrol() {
        return tipocontrol;
    }

    public void setTipocontrol(String tipocontrol) {
        this.tipocontrol = tipocontrol;
    }

    public int getTemperaturamax() {
        return temperaturamax;
    }

    public void setTemperaturamax(int temperaturamax) {
        this.temperaturamax = temperaturamax;
    }

    @Override
    public String toString() {
        return "Hornoselectricosygas{" + "potencia=" + potencia + ", numbandejas=" + numbandejas + ", gratinador=" + gratinador + ", tipocontrol=" + tipocontrol + ", temperaturamax=" + temperaturamax + '}';
    }
    
    
}
