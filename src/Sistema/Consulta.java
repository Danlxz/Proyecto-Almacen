
package Sistema;

import static Interfaz.Main.nombreconsultas;
import static Interfaz.Main.tabla_consul;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Consulta {

    DefaultTableModel model;

    public void ConsultaTabla(JTable tabla, String consulta) {
        Conexion cn = null;
        Statement s = null;
        ResultSet rs = null;
        try {
            cn = new Conexion();
            s = cn.retornarConexion().createStatement();
            rs = s.executeQuery(consulta);
            ResultSetMetaData dr = rs.getMetaData();

            model = new DefaultTableModel();
            String nombresC[] = new String[dr.getColumnCount()], datosC[] = new String[dr.getColumnCount()];

            while (rs.next()) {
                for (int i = 0; i < nombresC.length; i++) {
                    nombresC[i] = dr.getColumnName(i + 1);
                    datosC[i] = rs.getString(i + 1);
                }
                model.setColumnIdentifiers(nombresC);
                model.addRow(datosC);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            System.out.println(" º Problemas con la consulta a la base de datos.");
        } finally {
            cn.cerrarConexion();
            cn.cerrarStatement(s);
            cn.cerrarResultSet(rs);
        }
    }

    public void ConsultaTabla21(JTable tabla, String consulta, String consulta2) {
        Conexion cn = null;
        Statement s = null;
        Statement ss = null;
        ResultSet rs = null;
        ResultSet rss = null;
        try {
            int c = 0;
            cn = new Conexion();
            s = cn.retornarConexion().createStatement();
            ss = cn.retornarConexion().createStatement();
            rs = s.executeQuery(consulta);
            rss = ss.executeQuery(consulta2);
            String data[][] = {};
            String columna[] = {"Nombre", "Precio"};
            System.out.println("hola5");
            model = new DefaultTableModel(data, columna);
            tabla.setModel(model);
            while (rs.next()) {
                if (rs.getInt(1) == rss.getInt(1)) {
                    model.insertRow(c, new Object[]{});
                    model.setValueAt(rss.getString(2), c, 0);
                    model.setValueAt(rs.getInt(2), c, 1);
                    c++;
                }
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            System.out.println(" º Problemas con la consulta a la base de datos.");
        } finally {
            cn.cerrarConexion();
            cn.cerrarStatement(s);
            cn.cerrarResultSet(rs);
        }
    }
    public void ConsultaTabla3(String consulta) {
        Conexion cn = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            cn = new Conexion();
            s = cn.retornarConexion().prepareCall(consulta);
            rs = s.executeQuery();
            ResultSetMetaData dr = rs.getMetaData();
            int mayor =0; 
            String datos[] = new String[2];
            String nombresC[] = new String[2];
            model = new DefaultTableModel();
            nombresC [0] = dr.getColumnName(1);
            nombresC [1] = dr.getColumnName(2);
            while (rs.next()) {
                if(mayor<rs.getInt(2)){
                mayor = rs.getInt(2);
                datos[0]= rs.getString(1);
                datos[1]= rs.getString(2);
                }
            }
            model.setColumnIdentifiers(nombresC);
            model.addRow(datos);
            tabla_consul.setModel(model);
        } catch (SQLException ex) {
            System.out.println(" º Problemas con la consulta a la base de datos.");
        } finally {
            cn.cerrarConexion();
            cn.cerrarStatement(s);
            cn.cerrarResultSet(rs);
        }
    }
    
    public void comboConsultas(int op) {
        switch (op) {
            case 1:
                nombreconsultas.setText("Listado de Clientes.");
                ConsultaTabla(tabla_consul, "select * from cliente");
                break;
            case 2:
                nombreconsultas.setText("Ventas x Cajero.");
                ConsultaTabla(tabla_consul,"select caja,sum(1) from factura group by  caja");
                break;
            case 3:
                nombreconsultas.setText("Caja que mas Clientes atendio.");
                ConsultaTabla3("select caja,sum(1) as total_ventas from factura group by  caja");
                break;
            case 4:
                nombreconsultas.setText("Productos mas consumidos.");
                ConsultaTabla(tabla_consul,"SELECT id_producto,nombre_producto, sum(cantidad) as total_venta FROM detalle group by id_producto, nombre_producto order by  total_venta desc");
                break;
            case 5:
                nombreconsultas.setText("Cliente que mas consumio Productos.");
                ConsultaTabla(tabla_consul,"select nombre_cliente,sum(cantidad) from cXp group by nombre_cliente order by sum desc");
                break;
            case 6:
                nombreconsultas.setText("Producto mas consumido x Familia.");
                ConsultaTabla(tabla_consul,"select nombre,sum(cantidad) as total_venta from cxp group by nombre order by  total_venta desc");
                break;
            case 7:
                nombreconsultas.setText("Familia que mas Producto vendio en pesos.");
                ConsultaTabla(tabla_consul,"select nombre,sum(valor) as total_venta from cxp group by nombre order by  total_venta desc");
                break;
            case 8:
                nombreconsultas.setText("Tiempos utilizados para consumir x Cliente.");
                ConsultaTabla(tabla_consul,"select id_cliente, nombre_cliente,sum(tiempo) as total_tiempo from cxp group by nombre_cliente,id_cliente order by  total_tiempo desc");
                break;
        }
    }
     
}
