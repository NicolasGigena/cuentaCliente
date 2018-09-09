/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import vistas.interfaces.IvistaAltaClientesInterface;
import presentadores.PresentadorAltaClientes;

/**
 *
 * @author nicol
 */
public class VistaAltaClientes extends javax.swing.JFrame implements IvistaAltaClientesInterface {

    PresentadorAltaClientes presentadorAltaClientes;

    public VistaAltaClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Nuevo Cliente");
        
        this.presentadorAltaClientes = new PresentadorAltaClientes(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombrejTextFieldAltaClinente = new javax.swing.JTextField();
        ApellidojTextFieldAltaClinente = new javax.swing.JTextField();
        DnijTextFieldAltaClinente = new javax.swing.JTextField();
        FondoInicialjTextFieldAltaClinente = new javax.swing.JTextField();
        AltajButton = new javax.swing.JButton();
        ErrorNombrejLabel = new javax.swing.JLabel();
        ErrorApellidojLabel = new javax.swing.JLabel();
        ErrorDnijLabel = new javax.swing.JLabel();
        ErrorFondojLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        TransferenciajMenuItem = new javax.swing.JMenuItem();
        MovimientosjMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel4.setText("Dni:");

        jLabel5.setText("Fondo Inicial:");

        AltajButton.setText("Dar De Alta");
        AltajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltajButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("Funciones");

        TransferenciajMenuItem.setText("Transferencias");
        TransferenciajMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferenciajMenuItemApetado(evt);
            }
        });
        jMenu1.add(TransferenciajMenuItem);

        MovimientosjMenuItem.setText("Movimientos");
        MovimientosjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovimientosjMenuItemApretado(evt);
            }
        });
        jMenu1.add(MovimientosjMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AltajButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(NombrejTextFieldAltaClinente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ApellidojTextFieldAltaClinente)
                                    .addComponent(DnijTextFieldAltaClinente)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(FondoInicialjTextFieldAltaClinente)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ErrorNombrejLabel)
                            .addComponent(ErrorApellidojLabel)
                            .addComponent(ErrorDnijLabel)
                            .addComponent(ErrorFondojLabel))
                        .addGap(0, 208, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NombrejTextFieldAltaClinente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorNombrejLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ApellidojTextFieldAltaClinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorApellidojLabel))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DnijTextFieldAltaClinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ErrorDnijLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FondoInicialjTextFieldAltaClinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorFondojLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(AltajButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TransferenciajMenuItemApetado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferenciajMenuItemApetado
        this.presentadorAltaClientes.haciaVistaTransferencias();
    }//GEN-LAST:event_TransferenciajMenuItemApetado

    private void MovimientosjMenuItemApretado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovimientosjMenuItemApretado
        this.presentadorAltaClientes.haciaMovimientos();
    }//GEN-LAST:event_MovimientosjMenuItemApretado

    private void AltajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltajButtonActionPerformed
        this.presentadorAltaClientes.darDeAltaCliente();
    }//GEN-LAST:event_AltajButtonActionPerformed

    public JTextField getApellidojTextFieldAltaClinente() {
        return ApellidojTextFieldAltaClinente;
    }

    public JTextField getDnijTextFieldAltaClinente() {
        return DnijTextFieldAltaClinente;
    }

    public JTextField getNombrejTextFieldAltaClinente() {
        return NombrejTextFieldAltaClinente;
    }

    public JTextField getFondoInicialjTextFieldAltaClinente() {
        return FondoInicialjTextFieldAltaClinente;
    }

    public JLabel getErrorApellidojLabel() {
        return ErrorApellidojLabel;
    }

    public JLabel getErrorDnijLabel() {
        return ErrorDnijLabel;
    }

    public JLabel getErrorFondojLabel() {
        return ErrorFondojLabel;
    }

    public JLabel getErrorNombrejLabel() {
        return ErrorNombrejLabel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AltajButton;
    private javax.swing.JTextField ApellidojTextFieldAltaClinente;
    private javax.swing.JTextField DnijTextFieldAltaClinente;
    private javax.swing.JLabel ErrorApellidojLabel;
    private javax.swing.JLabel ErrorDnijLabel;
    private javax.swing.JLabel ErrorFondojLabel;
    private javax.swing.JLabel ErrorNombrejLabel;
    private javax.swing.JTextField FondoInicialjTextFieldAltaClinente;
    private javax.swing.JMenuItem MovimientosjMenuItem;
    private javax.swing.JTextField NombrejTextFieldAltaClinente;
    private javax.swing.JMenuItem TransferenciajMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    public void limpiarErrores() {
        getApellidojTextFieldAltaClinente().setBorder(new LineBorder(Color.GRAY));
        getErrorApellidojLabel().setText("");
        getErrorApellidojLabel().setForeground(null);

        getDnijTextFieldAltaClinente().setBorder(new LineBorder(Color.GRAY));
        getErrorDnijLabel().setText("");
        getErrorDnijLabel().setForeground(null);

        getNombrejTextFieldAltaClinente().setBorder(new LineBorder(Color.GRAY));
        getErrorNombrejLabel().setText("");
        getErrorNombrejLabel().setForeground(null);

        getFondoInicialjTextFieldAltaClinente().setBorder(new LineBorder(null));
        getErrorFondojLabel().setText("");
        getErrorFondojLabel().setForeground(null);
    }

    public void LimpiarInputText() {
        getNombrejTextFieldAltaClinente().setText("");
        getApellidojTextFieldAltaClinente().setText("");
        getDnijTextFieldAltaClinente().setText("");
        getFondoInicialjTextFieldAltaClinente().setText("");
    }

    public void setErrorNombre(String error) {

        getNombrejTextFieldAltaClinente().setBorder(new LineBorder(Color.red));
        getErrorNombrejLabel().setText(error);
        getErrorNombrejLabel().setForeground(Color.red);

    }

    public void setErrorApellido(String error) {
        getApellidojTextFieldAltaClinente().setBorder(new LineBorder(Color.red));
        getErrorApellidojLabel().setText(error);
        getErrorApellidojLabel().setForeground(Color.red);

    }

    public void setErrorDni(String error) {
        getDnijTextFieldAltaClinente().setBorder(new LineBorder(Color.red));
        getErrorDnijLabel().setText(error);
        getErrorDnijLabel().setForeground(Color.red);
    }

    public void setErrorFondoInicial(String error) {
        getFondoInicialjTextFieldAltaClinente().setBorder(new LineBorder(Color.red));
        getErrorFondojLabel().setText(error);
        getErrorFondojLabel().setForeground(Color.red);
    }

    public void mensajeGuardadoConExito() {
        JOptionPane.showMessageDialog(this, "Guardado con exito", "ATENCION", JOptionPane.DEFAULT_OPTION);
    }


}
