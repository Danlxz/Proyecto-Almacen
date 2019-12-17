
package Sistema;

import static Interfaz.Main.bd;
import static Interfaz.Main.tabla_reg;
import static Interfaz.Main.tabla_reg2;
import Procesos.HiloColas_Consumir;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;


public class RegistroV {
    
    Consulta con = new Consulta();
    
    public void seleccionData (){
        tabla_reg.getSelectionModel().addListSelectionListener((ListSelectionEvent lse) -> {
            if (tabla_reg.getSelectedRow() != -1) {
                bd.setText("");
                int fila = tabla_reg.getSelectedRow();
                String venta = tabla_reg.getValueAt(fila, 0).toString();
                String caja = tabla_reg.getValueAt(fila, 1).toString();
                String id1 = tabla_reg.getValueAt(fila, 2).toString();
                String id2 = tabla_reg.getValueAt(fila, 3).toString();
                String cc = tabla_reg.getValueAt(fila, 4).toString();
                String tiempo = tabla_reg.getValueAt(fila, 5).toString();
                tomarData(venta, id1, id2, cc, caja, tiempo);
            }
        });
    }
    
    public void colocarData (String venta, String caja, String cajero, String cliente, String t){ 
       bd.setText( bd.getText()+"\t Venta # "+ venta );
       bd.setText( bd.getText()+"\n_____________________________________\n Caja | Id | Cajero | Tel.\n");
       bd.setText( bd.getText()+caja + " | " + cajero + "\n");
       bd.setText( bd.getText()+" Id | CC | Cliente | Se atendio en: \n");
       bd.setText( bd.getText()+cliente + " | Tiempo: " + t );
    }
    
     public void tomarData (String venta, String id1, String id2, String cc, String caj, String tiempo){
        Conexion cn = null;
        Statement s = null;
        ResultSet rs = null;
        try {
            cn = new Conexion();
            s = cn.retornarConexion().createStatement();
            rs = s.executeQuery("select * from empleado where id_empleado = " + id1);
            String recuperarEmp [] = new String[3];
            while (rs.next()) {
                recuperarEmp[0] = rs.getString(2); // nombre
                recuperarEmp[1] = rs.getString(3); // apellido
                recuperarEmp[2] = rs.getString(4); // telefono
            }
            rs = s.executeQuery("select * from cliente where id_cliente = " + id2);
            String recuperarClte [] = new String[3];
            while (rs.next()) {
                recuperarClte[0] = rs.getString(3); // nombre
                recuperarClte[1] = rs.getString(4); // apellido
            }
            con.ConsultaTabla(tabla_reg2, "select * from detalle where id_venta = " + venta);
            
            colocarData( venta, caj, id1+" | "+recuperarEmp[0]+" "+recuperarEmp[1]+" | "+recuperarEmp[2], 
                    id2+" | "+cc+" | "+recuperarClte[0]+" "+recuperarClte[1], tiempo);
        } catch (SQLException ex) {
            Logger.getLogger(HiloColas_Consumir.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cn.cerrarConexion();
            cn.cerrarStatement(s);
            cn.cerrarResultSet(rs);
        }
     }
     
}
