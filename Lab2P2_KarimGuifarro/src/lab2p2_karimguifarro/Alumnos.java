/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_karimguifarro;

import java.util.Date;

/**
 *
 * @author karim
 */
public class Alumnos {
    private String nombre, usuario, contra,correo,tipo;
    private int num_cuenta;
    private Date Fecha_ingreso;

    public Alumnos() {
    }

    
    public Alumnos(String nombre, String usuario, String contra, String correo, int num_cuenta, Date Fecha_ingreso,String tipo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contra = contra;
        this.correo = correo;
        this.tipo = tipo;
        this.num_cuenta = num_cuenta;
        this.Fecha_ingreso = Fecha_ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public Date getFecha_ingreso() {
        return Fecha_ingreso;
    }

    public void setFecha_ingreso(Date Fecha_ingreso) {
        this.Fecha_ingreso = Fecha_ingreso;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", usuario=" + usuario + ", contra=" + contra + ", correo=" + correo + ", tipo=" + tipo + ", num_cuenta=" + num_cuenta + ", Fecha_ingreso=" + Fecha_ingreso + '}';
    }
    
    
    
}
