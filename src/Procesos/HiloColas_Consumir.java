
package Procesos;

import static Interfaz.Main.tabla_reg;
import Sistema.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HiloColas_Consumir extends Thread {
    
    JLabel emp, clte;
    JProgressBar barra;
    JComboBox combo;
    JTable tablaC;
    int [] ne, nc, ta;
    int c, t, a;
    String consultEmp = "select * from empleado where id_empleado = ";
    String consultClte = "select * from cliente where id_cliente = ";
    LinkedList cola = new LinkedList();
    String [] cajeros = new String[4];
    String [] clientes = new String[4];
    Random aleatorio= new Random();
    public static boolean dormirColas = true;
    
    public HiloColas_Consumir(JLabel emp, JLabel clte, JProgressBar barra, JComboBox combo, JTable tablaC, int c, int [] ne,
            int [] nc, int [] ta) {
        this.emp = emp;
        this.clte = clte;
        this.barra = barra;
        this.combo = combo;
        this.tablaC = tablaC;
        this.c = c;
        this.ne = ne;
        this.nc = nc;
        this.ta = ta;
        this.setName("Hilo para pasar a la cola.");
    }

    @Override
    public void run() {
        // Llena las Colas de las cajas.
        for (int i = 0; i < nc.length; i++) {
            llenarCola(i);
        }
        // Llega primer Cajero de la caja.
        llegadaCajero(0);
        int i = 0;
        for (int j = 0; j < nc.length; j++) {
            llegadaCliente();
            // Actualiza la cola.
            mostrarCola(tablaC);
            // Tiempo de espera (barra de progreso).
            barraTiempo(j, i);
            if (dormirColas == false) {
                return;
            }
            // Si es la ultima iteracion, la cortamos para finalizar el registro.
            if (j == (nc.length)-1) {
                break;
            }
            i++;
            // Cada 2 Clientes se cambiara el Cajero.
            if (i % 2 == 0) {
                llegadaCajero(j);
            }
        }
        System.out.println("\tº Cola "+c+" atendida º Caja "+c+" libre º");
        emp.setText(""); clte.setText(""); barra.setValue(0);
    }

    // METODOS DEL HILO COLAS:
    
    // Metodo para dormir el hilo.
    
    public void colaDetenida(int t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            System.out.println(" º Problemas al pausar.");
        }
    }
    
    // Metodo para tiempo del hilo.
    
    public void barraTiempo (int pos, int i){
        String tiempo = "";
        int tp = 0;
        for (tp = 1; tp <= 100; tp++) {
            barra.setValue(tp);
            colaDetenida(ta[pos]);
            if (dormirColas == false) {
                return;
            }
        }
        t = (((ta[pos]) * 100)/1000);
        tiempo = "Tiempo: " + t + " s.";
        combo.addItem(tiempo);
        combo.setSelectedIndex(i);
        // Consumir y registrar venta.
        registroVenta();
        int N_productos = (1+aleatorio.nextInt(5));
        for (int j = 0; j < N_productos; j++) {
            consumir();
        }
        // Actualizar registro venta.
        consultaReg();
    }
    
    // Metodo de Consulta en la base de datos.
    
    public String[] llegada (String con, int nid) {
        String datos[] = null;
        Conexion cn = null;
        Statement s = null;
        ResultSet rs = null;
        try {
            cn = new Conexion();
            s = cn.retornarConexion().createStatement();
            rs = s.executeQuery(con + nid);
            ResultSetMetaData dr = rs.getMetaData();
            
            datos = new String[dr.getColumnCount()];
            while (rs.next()) {
                for (int i = 0; i < datos.length; i++) {
                    datos[i] = rs.getString(i + 1);
                }
            }
            return datos;
        } catch (SQLException ex) {
            Logger.getLogger(HiloColas_Consumir.class.getName()).log(Level.SEVERE, null, ex);
            return datos;
        } finally {
            cn.cerrarConexion();
            cn.cerrarStatement(s);
            cn.cerrarResultSet(rs);
        }
    }  
    
    // Metodos de la Cola.
    
    public void llenarCola (int pos){
        cola.offer(llegada(consultClte, nc[pos]));
    }
    public void mostrarCola (JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("CC.");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        for (int i = 0; i < cola.size(); i++) {
            modelo.addRow((Object[]) cola.get(i));
        }
        tabla.setModel(modelo);
    }
     
    // Metodos de Llegada en las cajas.
    
    public void llegadaCajero (int pos){
        cajeros = llegada(consultEmp, ne[pos]);
        emp.setText(cajeros[0] + " | " + cajeros[1] + " " + cajeros[2]);
    }
    public void llegadaCliente (){
        clientes = (String[]) cola.poll();
        clte.setText(clientes[0] + " | " + clientes[2] + " " + clientes[3]);
    }
    
     // Metodo para mostrar la tabla de registros de ventas.
    
    public void consultaReg () {
        Conexion cn = null;
        Statement s = null;
        ResultSet rs = null;
        try {
            cn = new Conexion();
            s = cn.retornarConexion().createStatement();
            rs = s.executeQuery("select * from factura");
            ResultSetMetaData dr = rs.getMetaData();

            DefaultTableModel modelo = new DefaultTableModel();
            String nombresC[] = new String[dr.getColumnCount()], datosC[] = new String[dr.getColumnCount()];

            while (rs.next()) {
                for (int i = 0; i < nombresC.length; i++) {
                    nombresC[i] = dr.getColumnName(i + 1);
                    datosC[i] = rs.getString(i + 1);
                }
                modelo.setColumnIdentifiers(nombresC);
                modelo.addRow(datosC);
            }
            tabla_reg.setModel(modelo);
        } catch (SQLException e) {
            System.out.println("º Problemas al pasar los datos.");
        } finally {
            cn.cerrarConexion();
            cn.cerrarStatement(s);
            cn.cerrarResultSet(rs);
        }
    }
    
    public void registroVenta(){
        Conexion cn = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            cn = new Conexion();
            // Registra venta.
            boolean registro = false;
            s = cn.retornarConexion().prepareStatement("insert into factura (caja, id_empleado, id_cliente, cc_cliente, tiempo) "
                    + "values (?, ?, ?, ?, ?)");
            s.setInt(1, c);
            s.setInt(2, Integer.parseInt(cajeros[0]));
            s.setInt(3, Integer.parseInt(clientes[0]));
            s.setString(4, clientes[1]);
            s.setInt(5, t);
            int r = s.executeUpdate();
            if (r != 0) {
                registro = true;
                //System.out.println("° Se registro correctamente la venta. ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HiloColas_Consumir.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cn.cerrarConexion();
            cn.cerrarStatement(s);
            cn.cerrarResultSet(rs);
        }
    }
    
     public void consumir(){
        Conexion cn = null;
        PreparedStatement s = null;
        ResultSet rs = null;
        try {
            cn = new Conexion();
            s = cn.retornarConexion().prepareCall("select * from articulo where existencia > stock_minimo");
            rs = s.executeQuery();
            while (rs.next()) {
                int id_p = rs.getInt(1);
                String nombre_p = rs.getString(2);
                float precio= rs.getFloat(4);
                int existencia = rs.getInt(5);
                int S_minima = rs.getInt(6);
                int N_consumo= (1 + aleatorio.nextInt(S_minima + 10));
                float precioFinal = precio*N_consumo;    
                
                s = cn.retornarConexion().prepareCall("select * from factura");
                rs = s.executeQuery();
                int id_venta = 0;
                while (rs.next()) {         
                    id_venta = rs.getInt(1);
                }
                
                if (existencia > S_minima && existencia > N_consumo) {
                    // Registra los productos de la venta.
                    boolean registro = false;
                    s = cn.retornarConexion().prepareStatement("insert into detalle ( id_venta, id_producto, nombre_producto, precio, cantidad )"
                            + "values (?, ?, ?, ?, ?)");
                    s.setInt(1, id_venta);
                    s.setInt(2, id_p);
                    s.setString(3, nombre_p);
                    s.setFloat(4, precioFinal);
                    s.setInt(5, N_consumo);
                    int r1 = s.executeUpdate();
                    if (r1 != 0) {
                        registro = true;
                        System.out.println("______________________________________________________________________\n"
                                + "º Se compro el producto: "+nombre_p+" --cantidad-- "+N_consumo);
                    }
                    
                    // Actualizar productos consumidos.
                    boolean modificar = false;
                    s = cn.retornarConexion().prepareStatement("update articulo set existencia = ? where id_producto = ?");
                    s.setInt(1, (existencia - N_consumo));
                    s.setInt(2, id_p);
                    int r2 = s.executeUpdate();
                    if (r2 != 0) {
                        modificar = true;
                        //System.out.println("º Se actualizo correctamente los productos vendidos.");
                    }
                    
                }   
            }   
        } catch (SQLException ex) {
            Logger.getLogger(HiloColas_Consumir.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cn.cerrarConexion();
            cn.cerrarStatement(s);
            cn.cerrarResultSet(rs);
        }
    }
    
    
}
