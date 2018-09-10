/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Cliente;
import modelos.Transferencia;
import presentadores.PresentadorMovimientos;
import vistas.interfaces.IvistaMoviemientosInterface;

/**
 *
 * @author nicol
 */
public class VistaMovimientos extends javax.swing.JFrame implements IvistaMoviemientosInterface {

    PresentadorMovimientos presentadorMovimientos;

    private static DefaultTableModel defaultTableModel;

    public VistaMovimientos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Movimientos");
        presentadorMovimientos = new PresentadorMovimientos(this);
        presentadorMovimientos.inicializarClientes();
        defaultTableModel = new DefaultTableModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ImprimirDejComboBox = new javax.swing.JComboBox<>();
        VerResumenjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostararMovimientosjTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        MostararCapitaljLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AltaClientejMenuItem1 = new javax.swing.JMenuItem();
        TransferenciasjMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cliente:");

        VerResumenjButton.setText("Ver Resumen");
        VerResumenjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerResumenjButtonApretado(evt);
            }
        });

        MostararMovimientosjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "De:", "Hacia:", "Monto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MostararMovimientosjTable);

        jLabel2.setText("Capital del cliente:");

        jMenu1.setText("Funciones");

        AltaClientejMenuItem1.setText("Nuevo Cliente");
        AltaClientejMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaClientejMenuItem1Apretado(evt);
            }
        });
        jMenu1.add(AltaClientejMenuItem1);

        TransferenciasjMenuItem.setText("Tranferencias");
        TransferenciasjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferenciasjMenuItemApretado(evt);
            }
        });
        jMenu1.add(TransferenciasjMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VerResumenjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(ImprimirDejComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MostararCapitaljLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ImprimirDejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(MostararCapitaljLabel))
                .addGap(18, 18, 18)
                .addComponent(VerResumenjButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AltaClientejMenuItem1Apretado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaClientejMenuItem1Apretado
        presentadorMovimientos.haciaAltaCliente();
    }//GEN-LAST:event_AltaClientejMenuItem1Apretado

    private void TransferenciasjMenuItemApretado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferenciasjMenuItemApretado
        presentadorMovimientos.haciaTransferencias();
    }//GEN-LAST:event_TransferenciasjMenuItemApretado

    private void VerResumenjButtonApretado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerResumenjButtonApretado
        presentadorMovimientos.imprimirLista();
    }//GEN-LAST:event_VerResumenjButtonApretado

    public JComboBox<Cliente> getImprimirDejComboBox() {
        return ImprimirDejComboBox;
    }

    public JLabel getMostararCapitaljLabel() {
        return MostararCapitaljLabel;
    }

    public JTable getMostararMovimientosjTable() {
        return MostararMovimientosjTable;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AltaClientejMenuItem1;
    private javax.swing.JComboBox<Cliente> ImprimirDejComboBox;
    private javax.swing.JLabel MostararCapitaljLabel;
    private javax.swing.JTable MostararMovimientosjTable;
    private javax.swing.JMenuItem TransferenciasjMenuItem;
    private javax.swing.JButton VerResumenjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void imprimirSaldoCliente(String saldo) {
        getMostararCapitaljLabel().setText(String.valueOf(saldo));
        getMostararCapitaljLabel().setForeground(Color.BLUE);
    }

    public void imprimirTransferencias(Transferencia[] tranferencias) {
        this.defaultTableModel = (DefaultTableModel) getMostararMovimientosjTable().getModel();
            
            for (Transferencia tranferencia : tranferencias) {
               
                this.defaultTableModel.addRow(new Object[]{tranferencia.getDesde(), tranferencia.getHacia(), tranferencia,String.valueOf(tranferencia.getMonto())});

            }

    }

    public void limpiarMovimientos() {
        for (int i = this.defaultTableModel.getRowCount() - 1; i >= 0; i--) {
            this.defaultTableModel.removeRow(i);
        }
    }

    public void cargarClientes(Cliente[] clientes) {
        for (Cliente cliente : clientes) {
            getImprimirDejComboBox().addItem(cliente);
        }
    }

}
