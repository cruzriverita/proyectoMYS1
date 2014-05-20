package Principal;



import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rony
 */
public class Ventana_principal extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_principal
     */
     public  ImageIcon imagen;

  double factor = 1e5;
     //variables para calculos 
     double ac=0;
     double df=0;
     double vf=0;
     double tvelmax=0;
     double dvelmax=0;
     double trecorrido=0;
     static double x1,x2,x3,x4,x5,x6,x7,x8,y1,y2,y3,y4,y5,y6,y7,y8,v1,v2,v3,v4,v5,v6,v7,v8;
     
     
     //probicional tiene que ser una lista
     Coloca_imagen nuevo;
     JLabel vista_datos;
     
     // panel para mostrar carros al elegir
     Coloca_imagen nuevo2;
     
     /****************variable para poder verificar si ya se simulo porlomenos una ves *************/
      boolean sea_simulado = false;
     /********************** variables para mostar la grafica *****************************/
     Coloca_imagen graficas;
     int posicion=0;
     ImageIcon grafica;
    public Ventana_principal() {
        initComponents();
        
       /* creo el panel que se mira en el Jdialog donde se muestra el carro selecionado*/ 
       nuevo2 = new Coloca_imagen();
       nuevo2.setBounds(15,90,90,80);
       nuevo2.setVisible(true);
       jDialog1.add(nuevo2);
       /******************************panel para las graficas ***************************/
       graficas = new Coloca_imagen();
       graficas.setBounds(250,150,700,500);
       graficas.setVisible(true);
       graficas.pone_tamaño(700,500);
       jDialog2.add(graficas);
       
       
       /********** pone invisible los botones de eliminar*********/
        pone_invisible_eliminar();
    }
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        caracteristicas = new javax.swing.JLabel();
        caracteristicas1 = new javax.swing.JLabel();
        caracteristicas2 = new javax.swing.JLabel();
        caracteristicas3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        caracteristicas4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        eliminar1 = new javax.swing.JButton();
        eliminar2 = new javax.swing.JButton();
        eliminar3 = new javax.swing.JButton();
        eliminar4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jDialog1.setTitle("Agregar Carro");
        jDialog1.setBackground(new java.awt.Color(255, 204, 51));
        jDialog1.setLocationByPlatform(true);
        jDialog1.setResizable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lambor veneno", "Mclaren Spider", "Volkswagen scirocco", "Ford Mustang" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Seleccionar tipo de carro ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Distancia arrecorrer");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "500", "800", "1000", "1200", "1500" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton4.setText("cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Caracteristicas");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("V_maxima");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("100 km/h en ");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("200 km/h en");

        caracteristicas.setBackground(new java.awt.Color(255, 255, 255));
        caracteristicas.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        caracteristicas.setText("Caracteristicas");

        caracteristicas1.setBackground(new java.awt.Color(255, 255, 255));
        caracteristicas1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        caracteristicas1.setText("Caracteristicas");

        caracteristicas2.setBackground(new java.awt.Color(255, 255, 255));
        caracteristicas2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        caracteristicas2.setText("Caracteristicas");

        caracteristicas3.setBackground(new java.awt.Color(255, 255, 255));
        caracteristicas3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        caracteristicas3.setText("Caracteristicas");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel8.setText("peso (kg)");

        caracteristicas4.setBackground(new java.awt.Color(255, 255, 255));
        caracteristicas4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        caracteristicas4.setText("Caracteristicas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addComponent(caracteristicas1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(caracteristicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(14, 14, 14)
                        .addComponent(caracteristicas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(caracteristicas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(36, 36, 36)
                        .addComponent(caracteristicas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(caracteristicas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(caracteristicas1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(caracteristicas2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(caracteristicas3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(caracteristicas4))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel9.setText("Tipo de carro");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jButton4)))
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton5))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        jDialog2.setBackground(new java.awt.Color(255, 204, 102));
        jDialog2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jDialog2WindowClosing(evt);
            }
        });

        jTable2.setBorder(new javax.swing.border.MatteBorder(null));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Automovil", "Aceleracion ", "Distancia en alcanzar los 200km/h", "Velocidad final alcanzada", "t en alcanzar Velocidad maxima", "Distancia donde alcanza la V. Max.", "t en completar Recorrido"
            }
        ));
        jTable2.setCellSelectionEnabled(true);
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setRowHeight(20);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable2.getColumnModel().getColumn(0).setResizable(false);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(50);
        jTable2.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTable2.getColumnModel().getColumn(3).setResizable(false);
        jTable2.getColumnModel().getColumn(4).setResizable(false);
        jTable2.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTable2.getColumnModel().getColumn(5).setResizable(false);
        jTable2.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTable2.getColumnModel().getColumn(6).setResizable(false);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton6.setText("Ver desplazamiento");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("ver velocidad");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador_MRU");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(943, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(943, 550));

        eliminar1.setBackground(new java.awt.Color(255, 255, 255));
        eliminar1.setForeground(new java.awt.Color(255, 255, 255));
        eliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminar1.setToolTipText("eliminar carro");
        eliminar1.setBorderPainted(false);
        eliminar1.setContentAreaFilled(false);
        eliminar1.setDefaultCapable(false);
        eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar1ActionPerformed(evt);
            }
        });

        eliminar2.setBackground(new java.awt.Color(255, 255, 255));
        eliminar2.setForeground(new java.awt.Color(255, 255, 255));
        eliminar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminar2.setToolTipText("eliminar carro");
        eliminar2.setBorderPainted(false);
        eliminar2.setContentAreaFilled(false);
        eliminar2.setDefaultCapable(false);
        eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar2ActionPerformed(evt);
            }
        });

        eliminar3.setForeground(new java.awt.Color(255, 255, 255));
        eliminar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminar3.setToolTipText("eliminar carro");
        eliminar3.setBorderPainted(false);
        eliminar3.setContentAreaFilled(false);
        eliminar3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminar3.setDefaultCapable(false);
        eliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar3ActionPerformed(evt);
            }
        });

        eliminar4.setForeground(new java.awt.Color(255, 255, 255));
        eliminar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminar4.setToolTipText("eliminar carro");
        eliminar4.setBorderPainted(false);
        eliminar4.setContentAreaFilled(false);
        eliminar4.setDefaultCapable(false);
        eliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eliminar4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(eliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(eliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(eliminar3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(eliminar4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/star.png"))); // NOI18N
        jButton1.setToolTipText("iniciar simulacion");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stop.png"))); // NOI18N
        jButton2.setToolTipText("detener simulacion");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas_carro.png"))); // NOI18N
        jButton3.setToolTipText("agregar carro");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jMenuItem3.setText("Nueva simulacion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setText("Salir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Simulacion");

        jMenuItem1.setText("Agregar Carro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem4.setText("Estadistica");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Manuales");

        jMenuItem2.setText("Manual Tecnico");
        jMenu3.add(jMenuItem2);

        jMenuItem5.setText("Manual De Usuario");
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1261, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      // boton que esta en la barra de herramientas
        // esto es lo mismo que el boton del dibujo del carro
       int cantidad=Datos_estaticos.Lista_simulacion.size();  // obrengo el tamaño de la lista
       if(cantidad <=3){  // verifico si ya hay 4 elemento sino entra   
        jComboBox1.setSelectedIndex(0);
       jComboBox2.setSelectedIndex(0);
       Datos_estaticos.distancia = 500;
       poner_datos(0); 
       jDialog1.setVisible(true);
       jDialog1.setSize(500,350);
       jDialog1.repaint();
        }
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //boton para ver estadisticas 
        if(sea_simulado){
         try{
          limpia_comboBox();
          this.limpiarTabla(jTable2);
          this.posicion =0;
          for(Iterator<Nodo_simulacion> ite = Datos_estaticos.Lista_simulacion.iterator(); ite.hasNext();){ // recorro la lista de  simulacion
           Nodo_simulacion uno= ite.next(); //inicio la simulacion de cada nodo en la lista 
           this.calculos(uno.obten_tipo(),uno.obten_distancia(),this.posicion);
           jComboBox3.addItem(String.valueOf(posicion+1)+"-"+uno.obten_nom_carro());
           this.posicion +=1;
          }
          this.posicion =0;
          grafica = new ImageIcon("Graficas/0V.jpg");
          graficas.pone_imagen(grafica.getImage());
          graficas.repaint();
          jDialog2.setBounds(100, 100, 1200,750);
          jDialog2.show();
          jDialog2.setLocationRelativeTo(null);
          sea_simulado=false;
         }
         catch(Exception e ){
         
         }
        
        }
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Boton para nueva simulacion 
        try{
        Datos_estaticos.Lista_simulacion.clear(); //limpio la lista para que no tenga ninigun elemeto
        this.dispose();
        Ventana_principal nuevo = new Ventana_principal();
        nuevo.setVisible(true);
        nuevo.setLocationRelativeTo(null);
        }
        catch(Exception e){  
              System.out.println(e);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Boton salir
        System.exit(100);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ///Boton para iniciar la simulacion
     for(Iterator<Nodo_simulacion> ite = Datos_estaticos.Lista_simulacion.iterator(); ite.hasNext();){ // recorro la lista de  simulacion
            ite.next().iniciar_simulacion(); //inicio la simulacion de cada nodo en la lista         
     }
     sea_simulado=true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar3ActionPerformed
        // elimina el carro que esta en la posision 3
        jPanel1.removeAll(); //elimina todo lso elementos del panel
        elimina_carro(2); // ingreso el de la posicion de la lista que se va a eliminar (3 por que la lista enpieza en  0)
    }//GEN-LAST:event_eliminar3ActionPerformed

    private void eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar2ActionPerformed
        // elimina el carro que esta en la posicion 2
        jPanel1.removeAll(); //elimina todo lso elementos del panel
        elimina_carro(1); // ingreso el de la posicion de la lista que se va a eliminar (3 por que la lista enpieza en  0)
    }//GEN-LAST:event_eliminar2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //boton que esta en el Jdialog ..  agregar
      int cantidad=Datos_estaticos.Lista_simulacion.size(); //obtengo el tamaño de la lista para ver que elemnto toca colocar
       pone_visible_eliminar(cantidad);// llamo la funcion para poner visible el boton elimnar , le mando el valor del que toca
       /****************** creoo el nuevo panel que va hacer la pista *************************************/
       int largo= (int)((Datos_estaticos.distancia*75)/100)+100; 
       nuevo = new Coloca_imagen();
       nuevo.setBounds(40,40+(130*cantidad),largo,85);
       nuevo.setVisible(true);
       
       /**************************************************************************************************************/
       vista_datos = new JLabel();
       vista_datos.setFont(new java.awt.Font("Tahoma", 3, 12));
       vista_datos.setText(caracteristicas.getText());
       vista_datos.setBounds(70,20+(130*cantidad),500,20);
       vista_datos.setVisible(true);
       
       // creo el nuevo elemento para la lista del simulaciones ***********/
       Nodo_simulacion uno = new Nodo_simulacion(imagen,nuevo,vista_datos,Datos_estaticos.tipo_carro,Datos_estaticos.distancia,Integer.valueOf(caracteristicas1.getText()),Float.parseFloat(caracteristicas3.getText())); 
       nuevo.pone_imagen(uno.obten_imagen().getImage()); // agrego la imagen del carro  que fue selecionado
       Datos_estaticos.Lista_simulacion.add(uno); //agrego el nodo de la simulacion a la lista de simulaicion
       this.jPanel1.add(nuevo); // agrego el panel pista al panel principal
       this.jPanel1.add( vista_datos);
       this.jPanel1.repaint(); // repinto el panel principanl
       
       jDialog1.setVisible(false); // pongo invisible el Jdialog por que ya termino la accion de agregar
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // boton que cancela la creacion de un nuevo carro
        jDialog1.setVisible(false);  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //Acion cuando se elije carro
        poner_datos(jComboBox1.getSelectedIndex());  //solo llamo la funcion cada ves que alguie elige un elemento nuevo en el comboBox de los carros
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // selecina distancia
         switch(jComboBox2.getSelectedIndex()){ // segun sea la selccion en el comboBox de distancia,seteo el valor ala variable distancia
             case 0: Datos_estaticos.distancia = 500;
                 break;
             case 1: Datos_estaticos.distancia =800;
                 break;
             case 2: Datos_estaticos.distancia = 1000;
                 break;
              case 3: Datos_estaticos.distancia = 1200;
                 break; 
             case 4: Datos_estaticos.distancia = 1500;
                break;
             default:
                 
         }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // accion para el boton agregar carro  que esta en el dibujo
       int cantidad=Datos_estaticos.Lista_simulacion.size();  // obtengo el ramaño de la lista
       if(cantidad <=3){  //verifico si ya hay 4 elementos  si hay menos entro al if
       jComboBox1.setSelectedIndex(0);
       jComboBox2.setSelectedIndex(0);
       Datos_estaticos.distancia = 500;
       poner_datos(0);   //se ponen los datos del carro lambo que va ser el que va estar por default selecionado
       jDialog1.setVisible(true);
       jDialog1.setSize(500,350);
       jDialog1.repaint();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar1ActionPerformed
        //elimina el carro en posicion 1
        jPanel1.removeAll(); //elimina todo lso elementos del panel
        elimina_carro(0);
    }//GEN-LAST:event_eliminar1ActionPerformed

    private void eliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar4ActionPerformed
        // elimina el carro en la posicion 4
        jPanel1.removeAll(); //elimina todo lso elementos del panel
        elimina_carro(3);  // ingreso el de la posicion de la lista que se va a eliminar (3 por que la lista enpieza en  0)
    }//GEN-LAST:event_eliminar4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // acction del boton stop
     try{ 
     for(Iterator<Nodo_simulacion> ite = Datos_estaticos.Lista_simulacion.iterator(); ite.hasNext();){ // recorro la lista de  simulacion
      ite.next().obten_hilo().detener_hilo(); //para la simulacion de cada nodo en la lista         
     }  
     }
     catch(Exception e){}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jDialog2WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog2WindowClosing
        // TODO add your handling code here:
        this.limpiarTabla(jTable2);
    
    }//GEN-LAST:event_jDialog2WindowClosing

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // pone la grafica de desplazamiento
        grafica = new ImageIcon("Graficas/"+String.valueOf(this.posicion)+"D.jpg");
         graficas.pone_imagen(grafica.getImage());
         graficas.repaint();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       // pone la grafica de velocidad
        grafica = new ImageIcon("Graficas/"+String.valueOf(this.posicion)+"V.jpg");
         graficas.pone_imagen(grafica.getImage());
         graficas.repaint();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        //eleccion de carro para ver grafica
       posicion= jComboBox3.getSelectedIndex();
       jButton7ActionPerformed(evt);
    }//GEN-LAST:event_jComboBox3ActionPerformed

   /************************************************************************************/
    void limpia_comboBox(){
        try{
    jComboBox3.removeAllItems();
    }
        catch(Exception e){}
    }
    
    /************************************************************************************/
    public void limpiarTabla(JTable tabla){
        try {
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            int filas=tabla.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    
/***************************** funcion para eliminar un carro y reposicionar los restantes *********************/
    public void elimina_carro(int  posicion){
       pone_invisible_eliminar(); //pongo todo los botones eliminar invisibles para reajustar los elementos que no son removidos
       int numero=0; // sirve para ver en que nueva  posicion van a quedar 
       Datos_estaticos.Lista_simulacion.remove(posicion); // elimino el nodo del carro que se solicito
       
     for(Iterator<Nodo_simulacion> ite = Datos_estaticos.Lista_simulacion.iterator(); ite.hasNext();){ // recorro al lista para ver cules quedan
            Nodo_simulacion cambiar = ite.next();
            nuevo = cambiar.obten_pista();     // obtengo el nodo del recorrido
            int largo= (int)((cambiar.obten_distancia()*75)/100)+100;
            nuevo.setBounds(40,40+(130*numero),largo,85); // le doy una nueva ubicacion
            vista_datos = cambiar.obten_etiq();
            vista_datos.setBounds(70,20+(130*numero),500,20);
            pone_visible_eliminar(numero); // llamo la funcion para poner el boton eleminar en modo visible
            numero+=1;  // sumo una para saver que ya dibuje uno
            jPanel1.add(vista_datos);
            jPanel1.add(nuevo); // vuelvo agregar la pisa 
     }
     
     /******** *** vuelvo a agregar todos los botones de eliminar .. ya que con removeall- se habian quitado** ***************************/
     jPanel1.add(eliminar1);
     jPanel1.add(eliminar2);
     jPanel1.add(eliminar3);
     jPanel1.add(eliminar4);
     jPanel1.repaint();
     
    }
    
    
   //********* funcion para poner  visible el boton eliminar segun sea la posicion que se este agregando *********************/
    public void pone_visible_eliminar(int cantidad){
        /// aca solo pongo visible el boton eliminar  segun sea la posiscion solisitada
        switch(cantidad){
            case 0: 
                 eliminar1.setVisible(true);
                break;
                case 1: 
                 eliminar2.setVisible(true);
                break;
                    case 2: 
                 eliminar3.setVisible(true);
                break;
                        case 3: 
                 eliminar4.setVisible(true);
                break;
        }
  
    }
    
    
    //************************** funcion para poner invisible todos los botones de eliminar.**************************************/
    public void pone_invisible_eliminar(){
        eliminar1.setVisible(false);
        eliminar2.setVisible(false);
        eliminar3.setVisible(false);
        eliminar4.setVisible(false);
    }
    
    
    //***************funcion para cambar los datos cuando elejan el las lista desplegable. ******************/
   //4 opciones diferentes
    public void poner_datos(int index){
            /*esta funcion solo setea los valores predeterminados de cada carro, segun sea el numero de peticion el cual es como estan en
           el comboBox si son setiado a las label que estan en el JDialog.*/
        switch(index){
            case 0:
                this.caracteristicas.setText(Datos_estaticos.L_nombre);
                this.caracteristicas1.setText(String.valueOf(Datos_estaticos.L_Velocidad_max));
                this.caracteristicas2.setText(String.valueOf(Datos_estaticos.L_aceleracion));
                this.caracteristicas3.setText(String.valueOf(Datos_estaticos.L_aceleracion2));
                this.caracteristicas4.setText(String.valueOf(Datos_estaticos.L_peso));
                imagen = new ImageIcon(Datos_estaticos.L_imagen);
                nuevo2.pone_imagen(imagen.getImage());
                Datos_estaticos.tipo_carro =0;
                break;
            case 1:
                this.caracteristicas.setText(Datos_estaticos.M_nombre);
                this.caracteristicas1.setText(String.valueOf(Datos_estaticos.M_Velocidad_max));
                this.caracteristicas2.setText(String.valueOf(Datos_estaticos.M_aceleracion));
                this.caracteristicas3.setText(String.valueOf(Datos_estaticos.M_aceleracion2));
                this.caracteristicas4.setText(String.valueOf(Datos_estaticos.M_peso));
                imagen = new ImageIcon(Datos_estaticos.M_imagen);
                nuevo2.pone_imagen(imagen.getImage());
                Datos_estaticos.tipo_carro =1;
                break;
            case 2:
                this.caracteristicas.setText(Datos_estaticos.Vw_nombre);
                this.caracteristicas1.setText(String.valueOf(Datos_estaticos.Vw_Velocidad_max));
                this.caracteristicas2.setText(String.valueOf(Datos_estaticos.Vw_aceleracion));
                this.caracteristicas3.setText(String.valueOf(Datos_estaticos.Vw_aceleracion2));
                this.caracteristicas4.setText(String.valueOf(Datos_estaticos.Vw_peso));
                imagen = new ImageIcon(Datos_estaticos.Vw_imagen);
                nuevo2.pone_imagen(imagen.getImage());
                Datos_estaticos.tipo_carro =2;
                break;
            case 3:
               this.caracteristicas.setText(Datos_estaticos.F_nombre);
                this.caracteristicas1.setText(String.valueOf(Datos_estaticos.F_Velocidad_max));
                this.caracteristicas2.setText(String.valueOf(Datos_estaticos.F_aceleracion));
                this.caracteristicas3.setText(String.valueOf(Datos_estaticos.F_aceleracion2));
                this.caracteristicas4.setText(String.valueOf(Datos_estaticos.F_peso));
                imagen = new ImageIcon(Datos_estaticos.F_imagen);
                nuevo2.pone_imagen(imagen.getImage());
                Datos_estaticos.tipo_carro =3;
                break;
            default:
                break; 
        }       
    
    
    }
    
    public void calculos (int tipo,int distancia,int posicion){
     //Agregar modelo a la tabla de resultados 
      DefaultTableModel modelo1=(DefaultTableModel) jTable2.getModel();
     
        //DECISION SOBRE QUE DATOS MOSTRAR
      switch(tipo){
      //********************************lamborginhi************************************** 
       case 0: 
    
       //CALCULOS
       //aceleracion constante
       this.ac=(200*1000)/(3600*Datos_estaticos.L_aceleracion2);
       //distancia en alcanzar 200km/h
       this.df = (ac*(Datos_estaticos.L_aceleracion2)*(Datos_estaticos.L_aceleracion2))/2;
       //velocidad final alcanzada por el auto
       this.vf= Math.sqrt(2*ac*distancia);
       
       //SE evalua si el auto alcanza su velocidad maxima, si el valor de vf es mayor al dato tecnico
       //de velocidad maxima del auto se coloca tal valor.
       // si vf > 355 km/h
       if (vf>(Datos_estaticos.L_Velocidad_max*1000/3600)){
           vf=Datos_estaticos.L_Velocidad_max*1000/3600;
       }
       
       //tiempo en que el auto alcanza su velocidad maxima
       this.tvelmax = vf/ac;
       this.dvelmax = (Datos_estaticos.L_Velocidad_max*1000/3600)*tvelmax/2;
       
       /*sino alcanza la velocidad maxima antes de terminar de recorrer toda la pista entonces 
        * el tiempo en alcanzar la velocidad maxima y la distancia en alcanzar la velocidad 
        * maxima no pueden ser calculados y por lo tanto se les asigna un cero.
        */
       if (dvelmax>distancia){
       tvelmax =0;
       dvelmax=0;
       }
       this.trecorrido = Math.sqrt((2*distancia)/ac);
       
       //redondeo de todos los calculos a 5 decimales.
       ac = Math.round(ac * factor) / factor;
       df = Math.round(df * factor) / factor;
       vf = Math.round(vf * factor) / factor;
       tvelmax = Math.round(tvelmax * factor) / factor;
       dvelmax = Math.round(dvelmax * factor) / factor;
       trecorrido = Math.round(trecorrido * factor) / factor;
       
       //se agrega la fila a la tabla
       modelo1.addRow(new Object[]{"Lamborghini",ac+" m/s^2",df+" m",vf+" m/s",tvelmax+" s",dvelmax+" m",trecorrido+" s"});
       
       
       //********************************GRAFICAR****************************************************
    
       //**************************GRAFICA DE DESPLAZAMIENTO****************************************
       //coordenadas tiempo eje x se divide el tiempo del recorrido total dentro de 8 puntos a graficar 
       x1=trecorrido/8;
       x2=x1+x1;
       x3=x2+x1;
       x4=x3+x1;
       x5=x4+x1;
       x6=x5+x1;
       x7=x6+x1;
       x8=x7+x1;
       
       //coordenadas desplazamiento eje y, el desplazamiento se calcula df = (at^2)/2
       y1 = ac*Math.pow(x1,2)/2;
       y2 = ac*Math.pow(x2,2)/2;
       y3 = ac*Math.pow(x3,2)/2;
       y4 = ac*Math.pow(x4,2)/2;
       y5 = ac*Math.pow(x5,2)/2;
       y6 = ac*Math.pow(x6,2)/2;
       y7 = ac*Math.pow(x7,2)/2;
       y8 = ac*Math.pow(x8,2)/2;
       //se redondean los tiempos a 5 decimales 
       x1 = Math.round(x1 * factor) / factor;
       x2 = Math.round(x2 * factor) / factor;
       x3 = Math.round(x3 * factor) / factor;
       x4 = Math.round(x4 * factor) / factor;
       x5 = Math.round(x5 * factor) / factor;
       x6 = Math.round(x6 * factor) / factor;
       x7 = Math.round(x7 * factor) / factor;
       x8 = Math.round(x8 * factor) / factor;
       
       // se llama al metodo para graficar 
       Graficar.graph("Distancia","DESPLAZAMIENTO-TIEMPO LAMBORGINHI",x1,x2,x3,x4,x5,x6,x7,x8,y1,y2,y3,y4,y5,y6,y7,y8,String.valueOf(posicion)+"D");
       
      
       //**************************GRAFICA DE VELOCIDAD*********************************
       //coordenadas velocidad eje y, la velocidad se calcula con la formula vf=at
       // las decisiones indican que si la velocidad en el tiempo x1, x2, etc. sobrepasa a la velocidad max del vehiculo
       //entonces la velocidad en ese punto sera la velocidad maxima de los datos tecnicos del vehiculo.
       v1 = ac*x1;
       if (v1>(Datos_estaticos.L_Velocidad_max*1000/3600)){
           v1=Datos_estaticos.L_Velocidad_max*1000/3600;
       }
       v2 = ac*x2;
       if (v2>(Datos_estaticos.L_Velocidad_max*1000/3600)){
           v2=Datos_estaticos.L_Velocidad_max*1000/3600;
       }
       v3 = ac*x3;
       if (v3>(Datos_estaticos.L_Velocidad_max*1000/3600)){
           v3=Datos_estaticos.L_Velocidad_max*1000/3600;
       }
       v4 = ac*x4;
       if (v4>(Datos_estaticos.L_Velocidad_max*1000/3600)){
           v4=Datos_estaticos.L_Velocidad_max*1000/3600;
       }
       v5 = ac*x5;
       if (v5>(Datos_estaticos.L_Velocidad_max*1000/3600)){
           v5=Datos_estaticos.L_Velocidad_max*1000/3600;
       }
       
       v6 = ac*x6;
       if (v6>(Datos_estaticos.L_Velocidad_max*1000/3600)){
           v6=Datos_estaticos.L_Velocidad_max*1000/3600;
       }
       
        v7 = ac*x7;
       if (v7>(Datos_estaticos.L_Velocidad_max*1000/3600)){
           v7=Datos_estaticos.L_Velocidad_max*1000/3600;
       }
       
        v8 = ac*x8;
       if (v8>(Datos_estaticos.L_Velocidad_max*1000/3600)){
           v8=Datos_estaticos.L_Velocidad_max*1000/3600;
       }
       
       Graficar.graph("Distancia","VELOCIDAD-TIEMPO LAMBORGINHI",x1,x2,x3,x4,x5,x6,x7,x8,v1,v2,v3,v4,v5,v6,v7,v8,String.valueOf(posicion)+"V");
       
       break;
    
       //**********************Vokswagen*********************************//
       case 2:
       //CALCULOS
       //aceleracion constante
       this.ac=(200*1000)/(3600*Datos_estaticos.Vw_aceleracion2);
       //distancia en alcanzar 200km/h
       this.df = (ac*(Datos_estaticos.Vw_aceleracion2)*(Datos_estaticos.Vw_aceleracion2))/2;
       //velocidad final alcanzada por el auto
       this.vf= Math.sqrt(2*ac*distancia);
       
       //SE evalua si el auto alcanza su velocidad maxima, si el valor de vf es mayor al dato tecnico
       //de velocidad maxima del auto se coloca tal valor.
       // si vf > 355 km/h
       if (vf>(Datos_estaticos.Vw_Velocidad_max*1000/3600)){
           vf=Datos_estaticos.Vw_Velocidad_max*1000/3600;
       }
       
       //tiempo en que el auto alcanza su velocidad maxima
       this.tvelmax = vf/ac;
       this.dvelmax = (Datos_estaticos.Vw_Velocidad_max*1000/3600)*tvelmax/2;
       
       /*sino alcanza la velocidad maxima antes de terminar de recorrer toda la pista entonces 
        * el tiempo en alcanzar la velocidad maxima y la distancia en alcanzar la velocidad 
        * maxima no pueden ser calculados y por lo tanto se les asigna un cero.
        */
       if (dvelmax>distancia){
       tvelmax =0;
       dvelmax=0;
       }
       this.trecorrido = Math.sqrt((2*distancia)/ac);
       
       //redondeo de todos los calculos a 5 decimales.
       ac = Math.round(ac * factor) / factor;
       df = Math.round(df * factor) / factor;
       vf = Math.round(vf * factor) / factor;
       tvelmax = Math.round(tvelmax * factor) / factor;
       dvelmax = Math.round(dvelmax * factor) / factor;
       trecorrido = Math.round(trecorrido * factor) / factor;
       
       //se agrega la fila a la tabla
       modelo1.addRow(new Object[]{"Volkswagen",ac+" m/s^2",df+" m",vf+" m/s",tvelmax+" s",dvelmax+" m",trecorrido+" s"});
       
            //********************************GRAFICAR****************************************************
    
       //**************************GRAFICA DE DESPLAZAMIENTO****************************************
       //coordenadas tiempo eje x se divide el tiempo del recorrido total dentro de 8 puntos a graficar 
       x1=trecorrido/8;
       x2=x1+x1;
       x3=x2+x1;
       x4=x3+x1;
       x5=x4+x1;
       x6=x5+x1;
       x7=x6+x1;
       x8=x7+x1;
       
       //coordenadas desplazamiento eje y, el desplazamiento se calcula df = (at^2)/2
       y1 = ac*Math.pow(x1,2)/2;
       y2 = ac*Math.pow(x2,2)/2;
       y3 = ac*Math.pow(x3,2)/2;
       y4 = ac*Math.pow(x4,2)/2;
       y5 = ac*Math.pow(x5,2)/2;
       y6 = ac*Math.pow(x6,2)/2;
       y7 = ac*Math.pow(x7,2)/2;
       y8 = ac*Math.pow(x8,2)/2;
       //se redondean los tiempos a 5 decimales 
       x1 = Math.round(x1 * factor) / factor;
       x2 = Math.round(x2 * factor) / factor;
       x3 = Math.round(x3 * factor) / factor;
       x4 = Math.round(x4 * factor) / factor;
       x5 = Math.round(x5 * factor) / factor;
       x6 = Math.round(x6 * factor) / factor;
       x7 = Math.round(x7 * factor) / factor;
       x8 = Math.round(x8 * factor) / factor;
       
       // se llama al metodo para graficar 
       Graficar.graph("Distancia","DESPLAZAMIENTO-TIEMPO VOLKSWAGEN",x1,x2,x3,x4,x5,x6,x7,x8,y1,y2,y3,y4,y5,y6,y7,y8,String.valueOf(posicion)+"D");
       
      
       //**************************GRAFICA DE VELOCIDAD*********************************
       //coordenadas velocidad eje y, la velocidad se calcula con la formula vf=at
       // las decisiones indican que si la velocidad en el tiempo x1, x2, etc. sobrepasa a la velocidad max del vehiculo
       //entonces la velocidad en ese punto sera la velocidad maxima de los datos tecnicos del vehiculo.
       v1 = ac*x1;
       if (v1>(Datos_estaticos.Vw_Velocidad_max*1000/3600)){
           v1=Datos_estaticos.Vw_Velocidad_max*1000/3600;
       }
       v2 = ac*x2;
       if (v2>(Datos_estaticos.Vw_Velocidad_max*1000/3600)){
           v2=Datos_estaticos.Vw_Velocidad_max*1000/3600;
       }
       v3 = ac*x3;
       if (v3>(Datos_estaticos.Vw_Velocidad_max*1000/3600)){
           v3=Datos_estaticos.Vw_Velocidad_max*1000/3600;
       }
       v4 = ac*x4;
       if (v4>(Datos_estaticos.Vw_Velocidad_max*1000/3600)){
           v4=Datos_estaticos.Vw_Velocidad_max*1000/3600;
       }
       v5 = ac*x5;
       if (v5>(Datos_estaticos.Vw_Velocidad_max*1000/3600)){
           v5=Datos_estaticos.Vw_Velocidad_max*1000/3600;
       }
       
       v6 = ac*x6;
       if (v6>(Datos_estaticos.Vw_Velocidad_max*1000/3600)){
           v6=Datos_estaticos.Vw_Velocidad_max*1000/3600;
       }
       
        v7 = ac*x7;
       if (v7>(Datos_estaticos.Vw_Velocidad_max*1000/3600)){
           v7=Datos_estaticos.Vw_Velocidad_max*1000/3600;
       }
       
        v8 = ac*x8;
       if (v8>(Datos_estaticos.Vw_Velocidad_max*1000/3600)){
           v8=Datos_estaticos.Vw_Velocidad_max*1000/3600;
       }
       
       Graficar.graph("Distancia","VELOCIDAD-TIEMPO VOLKSWAGEN",x1,x2,x3,x4,x5,x6,x7,x8,v1,v2,v3,v4,v5,v6,v7,v8,String.valueOf(posicion)+"V");
       
       break;
    
       //***********************************************MCLAREN**************************************************
       
       case 1:
       //CALCULOS
       //aceleracion constante
       this.ac=(200*1000)/(3600*Datos_estaticos.M_aceleracion2);
       //distancia en alcanzar 200km/h
       this.df = (ac*(Datos_estaticos.M_aceleracion2)*(Datos_estaticos.M_aceleracion2))/2;
       //velocidad final alcanzada por el auto
       this.vf= Math.sqrt(2*ac*distancia);
       
       //SE evalua si el auto alcanza su velocidad maxima, si el valor de vf es mayor al dato tecnico
       //de velocidad maxima del auto se coloca tal valor.
       // si vf > 355 km/h
       if (vf>(Datos_estaticos.M_Velocidad_max*1000/3600)){
           vf=Datos_estaticos.M_Velocidad_max*1000/3600;
       }
       
       //tiempo en que el auto alcanza su velocidad maxima
       this.tvelmax = vf/ac;
       this.dvelmax = (Datos_estaticos.M_Velocidad_max*1000/3600)*tvelmax/2;
       
       /*sino alcanza la velocidad maxima antes de terminar de recorrer toda la pista entonces 
        * el tiempo en alcanzar la velocidad maxima y la distancia en alcanzar la velocidad 
        * maxima no pueden ser calculados y por lo tanto se les asigna un cero.
        */
       if (dvelmax>distancia){
       tvelmax =0;
       dvelmax=0;
       }
       this.trecorrido = Math.sqrt((2*distancia)/ac);
       
       //redondeo de todos los calculos a 5 decimales.
       ac = Math.round(ac * factor) / factor;
       df = Math.round(df * factor) / factor;
       vf = Math.round(vf * factor) / factor;
       tvelmax = Math.round(tvelmax * factor) / factor;
       dvelmax = Math.round(dvelmax * factor) / factor;
       trecorrido = Math.round(trecorrido * factor) / factor;
       
       //se agrega la fila a la tabla
       modelo1.addRow(new Object[]{"McLaren",ac+" m/s^2",df+" m",vf+" m/s",tvelmax+" s",dvelmax+" m",trecorrido+" s"});
       
         //********************************GRAFICAR****************************************************
    
       //**************************GRAFICA DE DESPLAZAMIENTO****************************************
       //coordenadas tiempo eje x se divide el tiempo del recorrido total dentro de 8 puntos a graficar 
       x1=trecorrido/8;
       x2=x1+x1;
       x3=x2+x1;
       x4=x3+x1;
       x5=x4+x1;
       x6=x5+x1;
       x7=x6+x1;
       x8=x7+x1;
       
       //coordenadas desplazamiento eje y, el desplazamiento se calcula df = (at^2)/2
       y1 = ac*Math.pow(x1,2)/2;
       y2 = ac*Math.pow(x2,2)/2;
       y3 = ac*Math.pow(x3,2)/2;
       y4 = ac*Math.pow(x4,2)/2;
       y5 = ac*Math.pow(x5,2)/2;
       y6 = ac*Math.pow(x6,2)/2;
       y7 = ac*Math.pow(x7,2)/2;
       y8 = ac*Math.pow(x8,2)/2;
       //se redondean los tiempos a 5 decimales 
       x1 = Math.round(x1 * factor) / factor;
       x2 = Math.round(x2 * factor) / factor;
       x3 = Math.round(x3 * factor) / factor;
       x4 = Math.round(x4 * factor) / factor;
       x5 = Math.round(x5 * factor) / factor;
       x6 = Math.round(x6 * factor) / factor;
       x7 = Math.round(x7 * factor) / factor;
       x8 = Math.round(x8 * factor) / factor;
       
       // se llama al metodo para graficar 
       Graficar.graph("Distancia","DESPLAZAMIENTO-TIEMPO McLAREN",x1,x2,x3,x4,x5,x6,x7,x8,y1,y2,y3,y4,y5,y6,y7,y8,String.valueOf(posicion)+"D");
       
      
       //**************************GRAFICA DE VELOCIDAD*********************************
       //coordenadas velocidad eje y, la velocidad se calcula con la formula vf=at
       // las decisiones indican que si la velocidad en el tiempo x1, x2, etc. sobrepasa a la velocidad max del vehiculo
       //entonces la velocidad en ese punto sera la velocidad maxima de los datos tecnicos del vehiculo.
       v1 = ac*x1;
       if (v1>(Datos_estaticos.M_Velocidad_max*1000/3600)){
           v1=Datos_estaticos.M_Velocidad_max*1000/3600;
       }
       v2 = ac*x2;
       if (v2>(Datos_estaticos.M_Velocidad_max*1000/3600)){
           v2=Datos_estaticos.M_Velocidad_max*1000/3600;
       }
       v3 = ac*x3;
       if (v3>(Datos_estaticos.M_Velocidad_max*1000/3600)){
           v3=Datos_estaticos.M_Velocidad_max*1000/3600;
       }
       v4 = ac*x4;
       if (v4>(Datos_estaticos.M_Velocidad_max*1000/3600)){
           v4=Datos_estaticos.M_Velocidad_max*1000/3600;
       }
       v5 = ac*x5;
       if (v5>(Datos_estaticos.M_Velocidad_max*1000/3600)){
           v5=Datos_estaticos.M_Velocidad_max*1000/3600;
       }
       
       v6 = ac*x6;
       if (v6>(Datos_estaticos.M_Velocidad_max*1000/3600)){
           v6=Datos_estaticos.M_Velocidad_max*1000/3600;
       }
       
        v7 = ac*x7;
       if (v7>(Datos_estaticos.M_Velocidad_max*1000/3600)){
           v7=Datos_estaticos.M_Velocidad_max*1000/3600;
       }
       
        v8 = ac*x8;
       if (v8>(Datos_estaticos.M_Velocidad_max*1000/3600)){
           v8=Datos_estaticos.M_Velocidad_max*1000/3600;
       }
       
       Graficar.graph("Distancia","VELOCIDAD-TIEMPO MCLAREN",x1,x2,x3,x4,x5,x6,x7,x8,v1,v2,v3,v4,v5,v6,v7,v8,String.valueOf(posicion)+"V");
        
        break;
        
       //***********************************************FORD MUSTANG****************************************
       
       case 3:
       //CALCULOS
       //aceleracion constante
       this.ac=(200*1000)/(3600*Datos_estaticos.F_aceleracion2);
       //distancia en alcanzar 200km/h
       this.df = (ac*(Datos_estaticos.F_aceleracion2)*(Datos_estaticos.F_aceleracion2))/2;
       //velocidad final alcanzada por el auto
       this.vf= Math.sqrt(2*ac*distancia);
       
       //SE evalua si el auto alcanza su velocidad maxima, si el valor de vf es mayor al dato tecnico
       //de velocidad maxima del auto se coloca tal valor.
       // si vf > 355 km/h
       if (vf>(Datos_estaticos.F_Velocidad_max*1000/3600)){
           vf=Datos_estaticos.F_Velocidad_max*1000/3600;
       }
       
       //tiempo en que el auto alcanza su velocidad maxima
       this.tvelmax = vf/ac;
       this.dvelmax = (Datos_estaticos.F_Velocidad_max*1000/3600)*tvelmax/2;
       
       /*sino alcanza la velocidad maxima antes de terminar de recorrer toda la pista entonces 
        * el tiempo en alcanzar la velocidad maxima y la distancia en alcanzar la velocidad 
        * maxima no pueden ser calculados y por lo tanto se les asigna un cero.
        */
       if (dvelmax>distancia){
       tvelmax =0;
       dvelmax=0;
       }
       this.trecorrido = Math.sqrt((2*distancia)/ac);
       
       //redondeo de todos los calculos a 5 decimales.
       ac = Math.round(ac * factor) / factor;
       df = Math.round(df * factor) / factor;
       vf = Math.round(vf * factor) / factor;
       tvelmax = Math.round(tvelmax * factor) / factor;
       dvelmax = Math.round(dvelmax * factor) / factor;
       trecorrido = Math.round(trecorrido * factor) / factor;
       
       //se agrega la fila a la tabla
       modelo1.addRow(new Object[]{"Ford",ac+" m/s^2",df+" m",vf+" m/s",tvelmax+" s",dvelmax+" m",trecorrido+" s"});
      
          //********************************GRAFICAR****************************************************
    
       //**************************GRAFICA DE DESPLAZAMIENTO****************************************
       //coordenadas tiempo eje x se divide el tiempo del recorrido total dentro de 8 puntos a graficar 
       x1=trecorrido/8;
       x2=x1+x1;
       x3=x2+x1;
       x4=x3+x1;
       x5=x4+x1;
       x6=x5+x1;
       x7=x6+x1;
       x8=x7+x1;
       
       //coordenadas desplazamiento eje y, el desplazamiento se calcula df = (at^2)/2
       y1 = ac*Math.pow(x1,2)/2;
       y2 = ac*Math.pow(x2,2)/2;
       y3 = ac*Math.pow(x3,2)/2;
       y4 = ac*Math.pow(x4,2)/2;
       y5 = ac*Math.pow(x5,2)/2;
       y6 = ac*Math.pow(x6,2)/2;
       y7 = ac*Math.pow(x7,2)/2;
       y8 = ac*Math.pow(x8,2)/2;
       //se redondean los tiempos a 5 decimales 
       x1 = Math.round(x1 * factor) / factor;
       x2 = Math.round(x2 * factor) / factor;
       x3 = Math.round(x3 * factor) / factor;
       x4 = Math.round(x4 * factor) / factor;
       x5 = Math.round(x5 * factor) / factor;
       x6 = Math.round(x6 * factor) / factor;
       x7 = Math.round(x7 * factor) / factor;
       x8 = Math.round(x8 * factor) / factor;
       
       // se llama al metodo para graficar 
       Graficar.graph("Distancia","DESPLAZAMIENTO-TIEMPO FORD",x1,x2,x3,x4,x5,x6,x7,x8,y1,y2,y3,y4,y5,y6,y7,y8,String.valueOf(posicion)+"D");
       
      
       //**************************GRAFICA DE VELOCIDAD*********************************
       //coordenadas velocidad eje y, la velocidad se calcula con la formula vf=at
       // las decisiones indican que si la velocidad en el tiempo x1, x2, etc. sobrepasa a la velocidad max del vehiculo
       //entonces la velocidad en ese punto sera la velocidad maxima de los datos tecnicos del vehiculo.
       v1 = ac*x1;
       if (v1>(Datos_estaticos.F_Velocidad_max*1000/3600)){
           v1=Datos_estaticos.F_Velocidad_max*1000/3600;
       }
       v2 = ac*x2;
       if (v2>(Datos_estaticos.F_Velocidad_max*1000/3600)){
           v2=Datos_estaticos.F_Velocidad_max*1000/3600;
       }
       v3 = ac*x3;
       if (v3>(Datos_estaticos.F_Velocidad_max*1000/3600)){
           v3=Datos_estaticos.F_Velocidad_max*1000/3600;
       }
       v4 = ac*x4;
       if (v4>(Datos_estaticos.F_Velocidad_max*1000/3600)){
           v4=Datos_estaticos.F_Velocidad_max*1000/3600;
       }
       v5 = ac*x5;
       if (v5>(Datos_estaticos.F_Velocidad_max*1000/3600)){
           v5=Datos_estaticos.F_Velocidad_max*1000/3600;
       }
       
       v6 = ac*x6;
       if (v6>(Datos_estaticos.F_Velocidad_max*1000/3600)){
           v6=Datos_estaticos.F_Velocidad_max*1000/3600;
       }
       
        v7 = ac*x7;
       if (v7>(Datos_estaticos.F_Velocidad_max*1000/3600)){
           v7=Datos_estaticos.F_Velocidad_max*1000/3600;
       }
       
        v8 = ac*x8;
       if (v8>(Datos_estaticos.F_Velocidad_max*1000/3600)){
           v8=Datos_estaticos.F_Velocidad_max*1000/3600;
       }
       
       Graficar.graph("Distancia","VELOCIDAD-TIEMPO FORD",x1,x2,x3,x4,x5,x6,x7,x8,v1,v2,v3,v4,v5,v6,v7,v8,String.valueOf(posicion)+"V");
       
       break;
           
       default:
           
    }
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        Ventana_principal nuevo = new Ventana_principal();
        nuevo.setVisible(true);
        nuevo.setLocationRelativeTo(null);
      
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caracteristicas;
    private javax.swing.JLabel caracteristicas1;
    private javax.swing.JLabel caracteristicas2;
    private javax.swing.JLabel caracteristicas3;
    private javax.swing.JLabel caracteristicas4;
    private static javax.swing.JButton eliminar1;
    private static javax.swing.JButton eliminar2;
    private static javax.swing.JButton eliminar3;
    private static javax.swing.JButton eliminar4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
