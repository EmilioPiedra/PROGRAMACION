package BaseDatos;
import Clases.Cliente;
import Clases.Direccion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BDDireccion {

    Conexion BLcon = new Conexion();


    public int InsertarDireccion(Cliente cliente)
            throws SQLException, ClassNotFoundException  {
        String Sentencia = "INSERT INTO DIRECCION ( numero, calle1, calle2, actual, ID_Cliente)"
                + " VALUES (?,?,?,?,?)";
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, cliente.getDirecciones().get(0).getNumero());
        ps.setString(2, cliente.getDirecciones().get(0).getCalle1());
        ps.setString(3, cliente.getDirecciones().get(0).getCalle2());
        ps.setInt(4, cliente.getDirecciones().get(0).getActual());
        ps.setInt(5,cliente.getId());
        return ps.executeUpdate();
    }
    public ResultSet RecuperarDireccion() throws SQLException, ClassNotFoundException {
        Statement st = BLcon.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM DIRECCION";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    public ResultSet BuscarDireccionPorNumero(Direccion objDireccion) throws SQLException, ClassNotFoundException {
        Statement st = BLcon.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM DIRECCION WHERE NUMERO = "+ objDireccion.getNumero();;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public ResultSet BuscarDireccionPorCliente(Cliente id) throws SQLException, ClassNotFoundException {
        Statement st = BLcon.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM DIRECCION WHERE ID_Cliente = " + id.getId() ;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
}
