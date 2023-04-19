package Clases;

import java.util.ArrayList;

public class Cliente {
    int id;
    String Cedula;
    String Nombres;
    String Apellidos;
    ArrayList<Direccion> direcciones = new ArrayList<Direccion>();

    public Cliente() {
    }

    public Cliente(int id, String cedula, String nombres, String apellidos, ArrayList<Direccion> direcciones) {
        this.id = id;
        Cedula = cedula;
        Nombres = nombres;
        Apellidos = apellidos;
        this.direcciones = direcciones;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public void setDirecciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
    }
}
