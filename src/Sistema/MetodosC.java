
package Sistema;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MetodosC {

    Random nr = new Random();

    // Devuelve el numero de filas de la tabla virtual

    public int contar (String consul) {
        Conexion cn = null;
        Statement s = null;
        ResultSet rs = null;
        int cont = 0;
         try {
            cn = new Conexion();
            s = cn.retornarConexion().createStatement();
            rs = s.executeQuery(consul);
            while (rs.next()){
                cont++;
            }
            return (cont);
        } catch (SQLException ex) {
            Logger.getLogger(MetodosC.class.getName()).log(Level.SEVERE, null, ex);
            return (cont);
        } finally {
            cn.cerrarConexion();
            cn.cerrarStatement(s);
            cn.cerrarResultSet(rs);
        }
    }
    
    public void aleatorio (int [] vr){
        int[] aux = new int[vr.length];
        int j = vr.length;
        for (int i = 0; i < aux.length; i++) {
            aux[i] = i + 1;
        }
        for (int i = 0; i < aux.length; i++) {
            int pos = nr.nextInt(j);
            vr[i] = aux[pos];
            aux[pos] = aux[j - 1];
            j--;
        }
    }
    
    public int [] vectorRandom (int opc){
        int num = contar("select * from cliente");
        int [] vr = new int[num];
        switch(opc){
            // Vector de cajero random.
            case 1:
                aleatorio(vr);
                break;
            // Vector de clientes random.
            case 2:
                aleatorio(vr);
                break;
            // Vector de tiempos random.
            case 3:
                for (int i = 0; i < vr.length; i++) {
                    vr[i] = ((nr.nextInt(250))+3);
                }
                break;
        }
        return vr;
    }
    
    public ArrayList colasRandom (){
        int [] vemp = vectorRandom(1);
        int [] vcl = vectorRandom(2);
        int [] tiempo = vectorRandom(3);
        int t1 = 0, t2 = 0, t3 = 0;
        while (true) {
            t1 = (nr.nextInt(vcl.length))+1; 
            t2 = (nr.nextInt(vcl.length))+1; 
            t3 = (nr.nextInt(vcl.length))+1;
            if ((t1+t2+t3) == vcl.length) {
               break;
            }
        }
        System.out.println("\n º Caja 1 --- Clientes: "+t1+" º Caja 2 --- Clientes: "+t2+" º Caja 3 --- Clientes: "+t3);
        int [] empRandom, clteRandom, tRandom;
        ArrayList datosRandom = new ArrayList();
        
        // Datos caja 1.
        empRandom = new int[t1];
        clteRandom = new int[t1];
        tRandom = new int[t1];
        Llenar(empRandom, clteRandom, tRandom, vemp, vcl, tiempo, 0);
        datosRandom.add(empRandom);
        datosRandom.add(clteRandom);
        datosRandom.add(tRandom);
        
        // Datos caja 2.
        empRandom = new int[t2];
        clteRandom = new int[t2];
        tRandom = new int[t2];
        Llenar(empRandom, clteRandom, tRandom, vemp, vcl, tiempo, t1);
        datosRandom.add(empRandom);
        datosRandom.add(clteRandom);
        datosRandom.add(tRandom);
        
        // Datos caja 3.
        empRandom = new int[t3];
        clteRandom = new int[t3];
        tRandom = new int[t3];
        Llenar(empRandom, clteRandom, tRandom, vemp, vcl, tiempo, (t1+t2));
        datosRandom.add(empRandom);
        datosRandom.add(clteRandom);
        datosRandom.add(tRandom);
        
        return datosRandom;
    }
    
    public void Llenar(int[] er, int[] cr, int [] tr, int [] vemp, int [] vcl, int [] t, int t_anterior){
        for (int i = 0; i < cr.length; i++) {
            er[i] = vemp[t_anterior+i];
            cr[i] = vcl[t_anterior+i];
            tr[i] = t[t_anterior+i];
        }
    }
    
}
