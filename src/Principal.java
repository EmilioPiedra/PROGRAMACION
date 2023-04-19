import Clases.Cliente;
import Clases.Direccion;
import Logica.LogCliente;

import java.sql.SQLException;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    //entrada->> se necesita objeto
        Cliente objCliente = new Cliente();
        Direccion objDireccion = new Direccion();
        ArrayList<Direccion> direcciones = new ArrayList();
        LogCliente objLogCliente = new LogCliente();

        //con lo metodos set se llena el  objeto Cliente de datos
        objCliente.setId(0);
        objCliente.setCedula("1145");
        objCliente.setNombres("Gamboa");
        objCliente.setApellidos("Sanchez");
    //con lo metodos set se llena el  objeto Cliente de datos
        objDireccion.setId(0);
        objDireccion.setNumero("223-112");
        objDireccion.setCalle1("Azuay");
        objDireccion.setCalle2("Avenida principal");
        objDireccion.setActual(1);
    //En la clase Cliente y Direccion existe una relacion, se debe mandar direcciones
        //.add <--- para llenar el array
        direcciones.add(objDireccion);
        objCliente.setDirecciones(direcciones);
        objLogCliente.Insertar(objCliente);


    }
}