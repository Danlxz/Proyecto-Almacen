
package Interfaz;

import Procesos.HiloColas_Consumir;
import Procesos.HiloLee;
import Procesos.HiloSurtir;
import Sistema.Consulta;
import Sistema.MetodosC;
import Sistema.RegistroV;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public final class Main extends javax.swing.JFrame {
    
    MetodosC mt = new MetodosC();
    Consulta cs = new Consulta();
    RegistroV rv = new RegistroV();
    HiloColas_Consumir hc1, hc2, hc3;
    HiloLee hle;
    HiloSurtir hs;
    int [] emp1, clte1, t1, emp2, clte2, t2, emp3, clte3, t3;
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        UIManager.put( "nimbusOrange", new Color(33,63,83));
        rv.seleccionData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        portada = new javax.swing.JScrollPane();
        pp = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        cajas = new javax.swing.JLabel();
        caj = new javax.swing.JTabbedPane();
        pp1 = new javax.swing.JPanel();
        vend1 = new javax.swing.JLabel();
        cl1 = new javax.swing.JLabel();
        barra1 = new javax.swing.JProgressBar();
        combot1 = new javax.swing.JComboBox();
        ptc1 = new javax.swing.JScrollPane();
        tc1 = new javax.swing.JTable();
        pp2 = new javax.swing.JPanel();
        vend2 = new javax.swing.JLabel();
        cl2 = new javax.swing.JLabel();
        barra2 = new javax.swing.JProgressBar();
        combot2 = new javax.swing.JComboBox();
        ptc2 = new javax.swing.JScrollPane();
        tc2 = new javax.swing.JTable();
        pp3 = new javax.swing.JPanel();
        vend3 = new javax.swing.JLabel();
        cl3 = new javax.swing.JLabel();
        barra3 = new javax.swing.JProgressBar();
        combot3 = new javax.swing.JComboBox();
        ptc3 = new javax.swing.JScrollPane();
        tc3 = new javax.swing.JTable();
        colas = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        otros = new javax.swing.JTabbedPane();
        cts = new javax.swing.JPanel();
        opcconsul = new javax.swing.JComboBox();
        pc = new javax.swing.JScrollPane();
        tabla_consul = new javax.swing.JTable();
        nombreconsultas = new javax.swing.JLabel();
        rgs = new javax.swing.JPanel();
        pc1 = new javax.swing.JScrollPane();
        tabla_reg = new javax.swing.JTable();
        sp = new javax.swing.JScrollPane();
        bd = new javax.swing.JTextArea();
        colas1 = new javax.swing.JLabel();
        pc2 = new javax.swing.JScrollPane();
        tabla_reg2 = new javax.swing.JTable();
        pt = new javax.swing.JPanel();
        autores = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        btpausar = new javax.swing.JButton();
        btiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setName("main"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        portada.setBackground(new java.awt.Color(0, 102, 102));
        portada.setBorder(null);
        portada.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        portada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        portada.setFocusable(false);
        portada.setHorizontalScrollBar(null);

        pp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajas.setBackground(new java.awt.Color(33, 63, 83));
        cajas.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        cajas.setForeground(new java.awt.Color(33, 63, 83));
        cajas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cajas.setText("Cajas.");
        cajas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cajas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        caj.setBackground(new java.awt.Color(255, 255, 255));
        caj.setForeground(new java.awt.Color(33, 63, 83));
        caj.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        caj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caj.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N

        pp1.setBackground(new java.awt.Color(33, 63, 83));

        vend1.setBackground(new java.awt.Color(255, 255, 255));
        vend1.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        vend1.setForeground(new java.awt.Color(255, 255, 255));
        vend1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vend1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "CAJERO", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Candara", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        vend1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vend1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cl1.setBackground(new java.awt.Color(255, 255, 255));
        cl1.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        cl1.setForeground(new java.awt.Color(255, 255, 255));
        cl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cl1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "CLIENTE", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Candara", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        cl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        barra1.setBackground(new java.awt.Color(204, 204, 204));
        barra1.setFont(new java.awt.Font("Digital-7 Mono", 1, 24)); // NOI18N
        barra1.setForeground(new java.awt.Color(255, 255, 255));
        barra1.setStringPainted(true);

        combot1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        combot1.setForeground(new java.awt.Color(33, 63, 83));
        combot1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ptc1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tc1.setBackground(new java.awt.Color(33, 63, 83));
        tc1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        tc1.setForeground(new java.awt.Color(255, 255, 255));
        tc1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ));
        tc1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tc1.setGridColor(new java.awt.Color(255, 255, 255));
        tc1.setRowHeight(25);
        tc1.setRowSelectionAllowed(false);
        ptc1.setViewportView(tc1);

        javax.swing.GroupLayout pp1Layout = new javax.swing.GroupLayout(pp1);
        pp1.setLayout(pp1Layout);
        pp1Layout.setHorizontalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pp1Layout.createSequentialGroup()
                        .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combot1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cl1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vend1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(ptc1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pp1Layout.createSequentialGroup()
                        .addComponent(ptc1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pp1Layout.createSequentialGroup()
                        .addComponent(vend1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cl1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combot1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(barra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        caj.addTab("Caja 1", pp1);

        pp2.setBackground(new java.awt.Color(33, 63, 83));

        vend2.setBackground(new java.awt.Color(255, 255, 255));
        vend2.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        vend2.setForeground(new java.awt.Color(255, 255, 255));
        vend2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vend2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "CAJERO", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Candara", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        vend2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vend2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cl2.setBackground(new java.awt.Color(255, 255, 255));
        cl2.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        cl2.setForeground(new java.awt.Color(255, 255, 255));
        cl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cl2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "CLIENTE", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Candara", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        cl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cl2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        barra2.setBackground(new java.awt.Color(204, 204, 204));
        barra2.setFont(new java.awt.Font("Digital-7 Mono", 1, 24)); // NOI18N
        barra2.setForeground(new java.awt.Color(255, 255, 255));
        barra2.setStringPainted(true);

        combot2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        combot2.setForeground(new java.awt.Color(33, 63, 83));
        combot2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ptc2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tc2.setBackground(new java.awt.Color(33, 63, 83));
        tc2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        tc2.setForeground(new java.awt.Color(255, 255, 255));
        tc2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ));
        tc2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tc2.setGridColor(new java.awt.Color(255, 255, 255));
        tc2.setRowHeight(25);
        tc2.setRowSelectionAllowed(false);
        ptc2.setViewportView(tc2);

        javax.swing.GroupLayout pp2Layout = new javax.swing.GroupLayout(pp2);
        pp2.setLayout(pp2Layout);
        pp2Layout.setHorizontalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pp2Layout.createSequentialGroup()
                        .addComponent(barra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combot2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cl2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vend2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(ptc2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pp2Layout.setVerticalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pp2Layout.createSequentialGroup()
                        .addComponent(ptc2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pp2Layout.createSequentialGroup()
                        .addComponent(vend2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cl2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combot2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        caj.addTab("   Caja 2   ", pp2);

        pp3.setBackground(new java.awt.Color(33, 63, 83));

        vend3.setBackground(new java.awt.Color(255, 255, 255));
        vend3.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        vend3.setForeground(new java.awt.Color(255, 255, 255));
        vend3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vend3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "CAJERO", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Candara", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        vend3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vend3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cl3.setBackground(new java.awt.Color(255, 255, 255));
        cl3.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        cl3.setForeground(new java.awt.Color(255, 255, 255));
        cl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cl3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "CLIENTE", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Candara", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        cl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cl3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        barra3.setBackground(new java.awt.Color(204, 204, 204));
        barra3.setFont(new java.awt.Font("Digital-7 Mono", 1, 24)); // NOI18N
        barra3.setForeground(new java.awt.Color(255, 255, 255));
        barra3.setStringPainted(true);

        combot3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        combot3.setForeground(new java.awt.Color(33, 63, 83));
        combot3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ptc3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tc3.setBackground(new java.awt.Color(33, 63, 83));
        tc3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        tc3.setForeground(new java.awt.Color(255, 255, 255));
        tc3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ));
        tc3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tc3.setGridColor(new java.awt.Color(255, 255, 255));
        tc3.setRowHeight(25);
        tc3.setRowSelectionAllowed(false);
        ptc3.setViewportView(tc3);

        javax.swing.GroupLayout pp3Layout = new javax.swing.GroupLayout(pp3);
        pp3.setLayout(pp3Layout);
        pp3Layout.setHorizontalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pp3Layout.createSequentialGroup()
                        .addComponent(barra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combot3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cl3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vend3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(ptc3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        pp3Layout.setVerticalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pp3Layout.createSequentialGroup()
                        .addComponent(ptc3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pp3Layout.createSequentialGroup()
                        .addComponent(vend3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cl3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combot3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(barra3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        caj.addTab("   Caja 3   ", pp3);

        colas.setBackground(new java.awt.Color(33, 63, 83));
        colas.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        colas.setForeground(new java.awt.Color(33, 63, 83));
        colas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colas.setText("Colas.");
        colas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(cajas, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(colas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(caj, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(caj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pp.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        p2.setBackground(new java.awt.Color(33, 63, 83));
        p2.setPreferredSize(new java.awt.Dimension(913, 347));

        otros.setBackground(new java.awt.Color(255, 255, 255));
        otros.setForeground(new java.awt.Color(33, 63, 83));
        otros.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        otros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        otros.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N

        cts.setBackground(new java.awt.Color(33, 63, 83));

        opcconsul.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        opcconsul.setForeground(new java.awt.Color(33, 63, 83));
        opcconsul.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ".... Consultas ....", "Consulta 1", "Consulta 2", "Consulta 3", "Consulta 4", "Consulta 5", "Consulta 6", "Consulta 7", "Consulta 8" }));
        opcconsul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcconsul.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                opcconsulItemStateChanged(evt);
            }
        });

        pc.setBorder(null);
        pc.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tabla_consul.setBackground(new java.awt.Color(33, 63, 83));
        tabla_consul.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        tabla_consul.setForeground(new java.awt.Color(255, 255, 255));
        tabla_consul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        tabla_consul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_consul.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_consul.setRowHeight(25);
        tabla_consul.setRowSelectionAllowed(false);
        pc.setViewportView(tabla_consul);

        nombreconsultas.setBackground(new java.awt.Color(33, 63, 83));
        nombreconsultas.setFont(new java.awt.Font("Candara", 1, 20)); // NOI18N
        nombreconsultas.setForeground(new java.awt.Color(255, 255, 255));
        nombreconsultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreconsultas.setText("Consultas.");
        nombreconsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nombreconsultas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ctsLayout = new javax.swing.GroupLayout(cts);
        cts.setLayout(ctsLayout);
        ctsLayout.setHorizontalGroup(
            ctsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ctsLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(ctsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ctsLayout.createSequentialGroup()
                        .addComponent(opcconsul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombreconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        ctsLayout.setVerticalGroup(
            ctsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ctsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ctsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcconsul, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        otros.addTab("Consultas", cts);

        rgs.setBackground(new java.awt.Color(33, 63, 83));

        pc1.setBorder(null);
        pc1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tabla_reg.setBackground(new java.awt.Color(33, 63, 83));
        tabla_reg.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        tabla_reg.setForeground(new java.awt.Color(255, 255, 255));
        tabla_reg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        tabla_reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_reg.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_reg.setRowHeight(25);
        tabla_reg.setShowVerticalLines(false);
        pc1.setViewportView(tabla_reg);

        sp.setBorder(null);

        bd.setBackground(new java.awt.Color(33, 63, 83));
        bd.setColumns(20);
        bd.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        bd.setForeground(new java.awt.Color(255, 255, 255));
        bd.setRows(5);
        bd.setBorder(null);
        sp.setViewportView(bd);

        colas1.setBackground(new java.awt.Color(255, 255, 255));
        colas1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        colas1.setForeground(new java.awt.Color(255, 255, 255));
        colas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colas1.setText("Ventas.");
        colas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        colas1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pc2.setBorder(null);
        pc2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tabla_reg2.setBackground(new java.awt.Color(33, 63, 83));
        tabla_reg2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        tabla_reg2.setForeground(new java.awt.Color(255, 255, 255));
        tabla_reg2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        tabla_reg2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla_reg2.setGridColor(new java.awt.Color(255, 255, 255));
        tabla_reg2.setRowHeight(25);
        tabla_reg2.setShowVerticalLines(false);
        pc2.setViewportView(tabla_reg2);

        javax.swing.GroupLayout rgsLayout = new javax.swing.GroupLayout(rgs);
        rgs.setLayout(rgsLayout);
        rgsLayout.setHorizontalGroup(
            rgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rgsLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(rgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pc2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(rgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rgsLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(colas1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rgsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pc1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        rgsLayout.setVerticalGroup(
            rgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rgsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(rgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(rgsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pc2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rgsLayout.createSequentialGroup()
                        .addComponent(colas1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pc1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        otros.addTab("   Registros   ", rgs);

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(otros)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(otros)
        );

        otros.getAccessibleContext().setAccessibleName("otros");

        pp.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 336, -1, 350));

        portada.setViewportView(pp);

        getContentPane().add(portada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 104, 930, 330));

        pt.setBackground(new java.awt.Color(33, 63, 83));

        autores.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        autores.setForeground(new java.awt.Color(255, 255, 255));
        autores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autores.setText("Autores: Daniel Luna - Johan Perez - Camilo Ojeda");
        autores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Almacen.");
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btpausar.setBackground(new java.awt.Color(255, 255, 255));
        btpausar.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        btpausar.setForeground(new java.awt.Color(255, 255, 255));
        btpausar.setText("||");
        btpausar.setBorder(null);
        btpausar.setContentAreaFilled(false);
        btpausar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btpausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpausarActionPerformed(evt);
            }
        });

        btiniciar.setBackground(new java.awt.Color(255, 255, 255));
        btiniciar.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        btiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btiniciar.setText(">");
        btiniciar.setBorder(null);
        btiniciar.setContentAreaFilled(false);
        btiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ptLayout = new javax.swing.GroupLayout(pt);
        pt.setLayout(ptLayout);
        ptLayout.setHorizontalGroup(
            ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(autores, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ptLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btpausar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        ptLayout.setVerticalGroup(
            ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptLayout.createSequentialGroup()
                .addGroup(ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(autores, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ptLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(titulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                .addGroup(ptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btpausar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        getContentPane().add(pt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btiniciarActionPerformed
        if (hc1 == null) {
            colasAleatorias();
            iniciarHilos();
            correrHilos();
        }
        if (!hc1.isAlive() && !hc2.isAlive() && !hc3.isAlive()) {
            int continuar = JOptionPane.showConfirmDialog(null, " ¿ Pasar mas Clientes ? ", null, JOptionPane.YES_NO_OPTION);
            if(continuar == JOptionPane.YES_OPTION){
                colasAleatorias();
                iniciarHilos();
                correrHilos();
            }
        }
    }//GEN-LAST:event_btiniciarActionPerformed

    private void btpausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpausarActionPerformed
        if (hle == null) {
            System.out.println(" º Hilos sin inicializar º");
        }else{
            DetenerHilos();
        }
    }//GEN-LAST:event_btpausarActionPerformed

    private void opcconsulItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_opcconsulItemStateChanged
        cs.comboConsultas(opcconsul.getSelectedIndex());
    }//GEN-LAST:event_opcconsulItemStateChanged
    
    public void iniciarHilos (){
        hc1 = new HiloColas_Consumir(vend1, cl1, barra1, combot1, tc1, 1, emp1, clte1, t1);
        hc2 = new HiloColas_Consumir(vend2, cl2, barra2, combot2, tc2, 2, emp2, clte2, t2);
        hc3 = new HiloColas_Consumir(vend3, cl3, barra3, combot3, tc3, 3, emp3, clte3, t3);
        hle = new HiloLee();
        hs = new HiloSurtir();
    }
    
    public void correrHilos (){
        hc1.start();
        hc2.start();
        hc3.start();
        hle.start();
        hs.start();
    }
    
    public void DetenerHilos (){
        hc1.dormirColas = false;
        hc2.dormirColas = false;
        hc3.dormirColas = false;
        hle.dormirLee = false;
        hs.dormirSurtir = false;
        System.out.println(" º Cajas cerradas º");
    }
    
    // Metodo para asignar los datos aleatorios a cada caja.
     public void colasAleatorias (){
         ArrayList vv = mt.colasRandom();
         emp1 = (int[]) vv.get(0);
         clte1 = (int[]) vv.get(1);
         t1 = (int[]) vv.get(2);

         emp2 = (int[]) vv.get(3);
         clte2 = (int[]) vv.get(4);
         t2 = (int[]) vv.get(5);

         emp3 = (int[]) vv.get(6);
         clte3 = (int[]) vv.get(7);
         t3 = (int[]) vv.get(8);
     }
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autores;
    public static javax.swing.JProgressBar barra1;
    public static javax.swing.JProgressBar barra2;
    public static javax.swing.JProgressBar barra3;
    public static javax.swing.JTextArea bd;
    public javax.swing.JButton btiniciar;
    public javax.swing.JButton btpausar;
    private javax.swing.JTabbedPane caj;
    private javax.swing.JLabel cajas;
    public static javax.swing.JLabel cl1;
    public static javax.swing.JLabel cl2;
    public static javax.swing.JLabel cl3;
    public static javax.swing.JLabel colas;
    public static javax.swing.JLabel colas1;
    public static javax.swing.JComboBox combot1;
    public static javax.swing.JComboBox combot2;
    public static javax.swing.JComboBox combot3;
    private javax.swing.JPanel cts;
    public static javax.swing.JLabel nombreconsultas;
    public static javax.swing.JComboBox opcconsul;
    private javax.swing.JTabbedPane otros;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JScrollPane pc;
    private javax.swing.JScrollPane pc1;
    private javax.swing.JScrollPane pc2;
    public static javax.swing.JScrollPane portada;
    public static javax.swing.JPanel pp;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JPanel pp3;
    private javax.swing.JPanel pt;
    private javax.swing.JScrollPane ptc1;
    private javax.swing.JScrollPane ptc2;
    private javax.swing.JScrollPane ptc3;
    private javax.swing.JPanel rgs;
    private javax.swing.JScrollPane sp;
    public static javax.swing.JTable tabla_consul;
    public static javax.swing.JTable tabla_reg;
    public static javax.swing.JTable tabla_reg2;
    public static javax.swing.JTable tc1;
    public static javax.swing.JTable tc2;
    public static javax.swing.JTable tc3;
    private javax.swing.JLabel titulo;
    public static javax.swing.JLabel vend1;
    public static javax.swing.JLabel vend2;
    public static javax.swing.JLabel vend3;
    // End of variables declaration//GEN-END:variables
}
