package Logica;

import BaseDatos.BDCliente;
import BaseDatos.BDDireccion;
import BaseDatos.Conexion;
import Clases.Cliente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LogCliente {
    Conexion BLcon = new Conexion();
    BDCliente objBDCliente = new BDCliente();
    BDDireccion objBDDireccion = new BDDireccion();
    public boolean validarCedula (Cliente objCliente){
        if (objCliente.getCedula().length()==4)
            return true;
        return false;
    }

    public void Insertar(Cliente objCliente) throws ClassNotFoundException, SQLException {
        objBDCliente.Insertar(objCliente);   //Insertar el padre
        //buscar por cedula
        BuscarClienteCedula(objCliente);
        //insertar por cedula
        objBDDireccion.InsertarDireccion(objCliente);
    }

    public void RecuperarClientes(ArrayList<Cliente> arrayClientes) throws SQLException, ClassNotFoundException {
        Cliente objCliente = new Cliente();
        ResultSet rs = objBDCliente.RecuperarClientes();
        while (rs.next()){
            objCliente = new Cliente();
            objCliente.setId(rs.getInt(1));
            objCliente.setCedula(rs.getString(2));
            objCliente.setNombres(rs.getString(3));
            objCliente.setApellidos(rs.getString(4));
            arrayClientes.add(objCliente);
        }

    }

    public boolean BuscarClienteCedula(Cliente objCliente) throws SQLException, ClassNotFoundException {
        ResultSet rs =objBDCliente.BuscarClientePorCedula(objCliente);
        while (rs.next()){
            objCliente.setId(Integer.parseInt(rs.getString(1)));
            return true;

        }
        return false;

    }
    public int RecuperarMAXClientes(Cliente objCliente) throws SQLException, ClassNotFoundException {
        ResultSet rs = objBDCliente.maxID(objCliente);
        while (rs.next()) {
            objCliente = new Cliente();
            objCliente.setId((Integer.parseInt(rs.getString(1))));
           // objCliente.add(objCliente);
        }
        return objCliente.getId();
    }



}