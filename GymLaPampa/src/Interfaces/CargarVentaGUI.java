/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alan
 */
public class CargarVentaGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form CargarVentaGUI
     */
    private DefaultTableModel tablaSociosDefault;
    private DefaultTableModel tablaArticulosDefault;
    private DefaultTableModel tablaVentaDefault;

    public CargarVentaGUI() {
        initComponents();
        tablaSociosDefault = (DefaultTableModel) tablaSocios.getModel();
        tablaArticulosDefault = (DefaultTableModel) tablaArticulos.getModel();
        tablaVentaDefault = (DefaultTableModel) tablaVenta.getModel();
        calendarioTxt.setDate(Calendar.getInstance().getTime());
        tablaVenta.getColumnModel().getColumn(0).setPreferredWidth(20);
        tablaVenta.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablaVenta.getColumnModel().getColumn(2).setPreferredWidth(30);
        tablaVenta.getColumnModel().getColumn(3).setPreferredWidth(40);
        tablaVenta.getColumnModel().getColumn(4).setPreferredWidth(40);

        tablaSocios.getColumnModel().getColumn(0).setPreferredWidth(20);
        tablaSocios.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablaSocios.getColumnModel().getColumn(2).setPreferredWidth(170);

        tablaArticulos.getColumnModel().getColumn(0).setPreferredWidth(20);
        tablaArticulos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablaArticulos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablaArticulos.getColumnModel().getColumn(3).setPreferredWidth(100);
        


    }

    public void reClick() {
        this.getNombreSocioTxt().setText("");
        this.getTablaVentaDefault().setRowCount(0);
        this.getTotalTxt().setText("0.00");
        this.getFormaPagoBox().setSelectedIndex(0);
        this.getBusquedaNombreTxt().setText("");
        this.getBusquedaArticulo().setText("");
    }

    public DefaultTableModel getTablaSociosDefault() {
        return tablaSociosDefault;
    }

    public DefaultTableModel getTablaArticulosDefault() {
        return tablaArticulosDefault;
    }

    public JTable getTablaVenta() {
        return tablaVenta;
    }

    public DefaultTableModel getTablaVentaDefault() {
        return tablaVentaDefault;
    }

    

    public JTextField getBusquedaArticulo() {
        return busquedaArticulo;
    }

    public JTextField getBusquedaNombreTxt() {
        return busquedaNombreTxt;
    }

    public JTextField getCalendarioTxt() {
        return ((JTextField) calendarioTxt.getDateEditor().getUiComponent());
    }

    public JDateChooser getCalendario() {
        return calendarioTxt;
    }

    public JButton getCancelarVentaBtn() {
        return cancelarVentaBtn;
    }

    

    public JComboBox getFormaPagoBox() {
        return formaPagoBox;
    }

    public JTextField getIdSocioTxt() {
        return idSocioTxt;
    }

    public JTextField getNombreSocioTxt() {
        return nombreSocioTxt;
    }

    public JButton getQuitarBtn() {
        return quitarBtn;
    }

    public JButton getRegistrarVentaBtn() {
        return registrarVentaBtn;
    }

    public JTable getTablaArticulos() {
        return tablaArticulos;
    }

    public JTable getTablaSocios() {
        return tablaSocios;
    }

    public JTextField getTotalTxt() {
        return totalTxt;
    }

    public void setActionListener(ActionListener lis) {
        quitarBtn.addActionListener(lis);
        registrarVentaBtn.addActionListener(lis);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSocios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        busquedaNombreTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaArticulos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        busquedaArticulo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        nombreSocioTxt = new javax.swing.JTextField();
        idSocioTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        calendarioTxt = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        formaPagoBox = new javax.swing.JComboBox();
        quitarBtn = new javax.swing.JButton();
        registrarVentaBtn = new javax.swing.JButton();
        cancelarVentaBtn = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cargar venta");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

        tablaSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaSocios);

        jLabel1.setText("Nombre");

        busquedaNombreTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedaNombreTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busquedaNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busquedaNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Articulos"));

        tablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Stock", "Precio venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaArticulos);

        jLabel2.setText("Articulo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busquedaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busquedaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Venta"));

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Articulo", "Cantidad","Precio unit.", "Precio tot." }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaVenta);

        jLabel4.setText("Cliente");

        nombreSocioTxt.setEditable(false);

        idSocioTxt.setEnabled(false);

        jLabel5.setText("Fecha");

        calendarioTxt.setDateFormatString("dd-MM-yyyy");

        jLabel6.setFont(new java.awt.Font("Droid Sans", 1, 24)); // NOI18N
        jLabel6.setText("TOTAL  $");

        totalTxt.setFont(new java.awt.Font("Droid Sans", 1, 24)); // NOI18N

        jLabel7.setText("Forma de pago");

        formaPagoBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A DEFINIR LUEGO", "CONTADO", "POR SEMANA", "POR QUINCENA", "POR MES" }));

        quitarBtn.setText("Quitar articulo");
        quitarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calendarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(nombreSocioTxt)
                        .addGap(18, 18, 18)
                        .addComponent(idSocioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(quitarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(totalTxt))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formaPagoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreSocioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(idSocioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calendarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                        .addGap(29, 29, 29)
                        .addComponent(quitarBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(formaPagoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        registrarVentaBtn.setText("Registrar venta");

        cancelarVentaBtn.setText("Cancelar venta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registrarVentaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarVentaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cancelarVentaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(registrarVentaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busquedaNombreTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaNombreTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaNombreTxtActionPerformed

    private void quitarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quitarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField busquedaArticulo;
    private javax.swing.JTextField busquedaNombreTxt;
    private com.toedter.calendar.JDateChooser calendarioTxt;
    private javax.swing.JButton cancelarVentaBtn;
    private javax.swing.JComboBox formaPagoBox;
    private javax.swing.JTextField idSocioTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nombreSocioTxt;
    private javax.swing.JButton quitarBtn;
    private javax.swing.JButton registrarVentaBtn;
    private javax.swing.JTable tablaArticulos;
    private javax.swing.JTable tablaSocios;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField totalTxt;
    // End of variables declaration//GEN-END:variables
}
