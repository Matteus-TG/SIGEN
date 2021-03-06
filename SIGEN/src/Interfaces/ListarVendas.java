/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes_Auxiliares.Methods;
import DAO.TumuloDAO;
import DAO.VendaDAO;
import Modelo.Chapas;
import Modelo.Letras;
import Modelo.Quadras;
import Modelo.Vendas;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ListarVendas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listar_Vendas
     */
    TumuloDAO tdao;
    List<Quadras> tumulosQuadras;
    List<Chapas> tumulosChapas;
    List<Letras> tumulosLetras;
    VendaDAO vdao;
    List<Vendas> vendas; //List de uma classe do modelo para utilização na tabela;
    ListSelectionModel lsmVenda;
    DefaultTableModel tmVenda = new DefaultTableModel(null, new String[]{"Nome", "CPF", "RG", "Quadra", "Chapa", "Letra", "Data"});
    //definição das colunas da tabela

    public ListarVendas() {
        super("SIGEN - Listagem das Vendas");

        initComponents();

        jCBLetra.removeAllItems();
        jCBChapa.removeAllItems();
        jCBQuadra.removeAllItems();
        tdao = new TumuloDAO();
        tumulosQuadras = tdao.listarQuadrasVendidas();
        for (int i = 0; i < tumulosQuadras.size(); i++) {
            jCBQuadra.addItem(tumulosQuadras.get(i).getQuadra());
        }
        tabela.setRowHeight(23);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRBCliente = new javax.swing.JRadioButton();
        jRBTumulo = new javax.swing.JRadioButton();
        jRBData = new javax.swing.JRadioButton();
        jTCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDCInicio = new com.toedter.calendar.JDateChooser();
        jDCFim = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLCabecalho = new javax.swing.JLabel();
        jLQuadra = new javax.swing.JLabel();
        jLChapa = new javax.swing.JLabel();
        jLLetra = new javax.swing.JLabel();
        jCBQuadra = new javax.swing.JComboBox();
        jCBChapa = new javax.swing.JComboBox();
        jCBLetra = new javax.swing.JComboBox();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();

        setClosable(true);

        jRBCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBCliente.setText("Cliente - ");
        jRBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBClienteActionPerformed(evt);
            }
        });

        jRBTumulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBTumulo.setText("Túmulo - ");
        jRBTumulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTumuloActionPerformed(evt);
            }
        });

        jRBData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBData.setText("Data -");
        jRBData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBDataActionPerformed(evt);
            }
        });

        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTClienteActionPerformed(evt);
            }
        });
        jTCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTClienteKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Início");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Fim");

        jDCInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDCInicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCInicioPropertyChange(evt);
            }
        });

        jDCFim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDCFim.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCFimPropertyChange(evt);
            }
        });

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmVenda);
        jScrollPane1.setViewportView(tabela);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Listagem de Vendas - Túmulos");

        jLQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuadra.setText("Quadra:");

        jLChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLChapa.setText("Letra: ");

        jLLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLetra.setText("Chapa:");

        jCBQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBQuadraActionPerformed(evt);
            }
        });

        jCBChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBChapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBChapaActionPerformed(evt);
            }
        });

        jCBLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBLetraActionPerformed(evt);
            }
        });

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRBTumulo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jCBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLChapa)
                                                .addGap(68, 68, 68)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCBChapa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLLetra)))
                                    .addComponent(jLCabecalho))
                                .addGap(0, 631, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRBCliente)
                        .addGap(12, 12, 12)
                        .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRBData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jDCFim, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLCabecalho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRBCliente)
                        .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jDCFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jDCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addComponent(jRBData)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBTumulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLQuadra)
                            .addComponent(jLChapa)
                            .addComponent(jLLetra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmpresa)
                    .addComponent(jLVersao)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTClienteActionPerformed

    private void jRBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBClienteActionPerformed
        if (jRBCliente.isSelected()) {

            try {
                jRBTumulo.setSelected(false);
                jRBData.setSelected(false);
                jDCFim.setDate(null);
                jDCInicio.setDate(null);

                vdao = new VendaDAO();
                vendas = vdao.getByName(jTCliente.getText());

                while (tmVenda.getRowCount() > 0) {
                    tmVenda.removeRow(0);
                }
                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < vendas.size(); i++) {
                    tmVenda.addRow(linha);
                    tmVenda.setValueAt(vendas.get(i).getProprietario().getPro_nome(), i, 0);
                    tmVenda.setValueAt(vendas.get(i).getProprietario().getPro_cpf(), i, 1);
                    tmVenda.setValueAt(vendas.get(i).getProprietario().getPro_rg(), i, 2);
                    tmVenda.setValueAt(vendas.get(i).getChapa().getLetra().getQuadra().getQuadra(), i, 3);
                    tmVenda.setValueAt(vendas.get(i).getChapa().getChapa(), i, 4);
                    tmVenda.setValueAt(vendas.get(i).getChapa().getLetra().getLetra(), i, 5);
                    tmVenda.setValueAt(Methods.formatData(vendas.get(i).getVen_data()), i, 6);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
            }
        }
    }//GEN-LAST:event_jRBClienteActionPerformed

    private void jTClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClienteKeyTyped
        if (jRBCliente.isSelected()) {

            try {
                jRBTumulo.setSelected(false);
                jRBData.setSelected(false);
                jDCFim.setDate(null);
                jDCInicio.setDate(null);

                vdao = new VendaDAO();
                vendas = vdao.getByName(jTCliente.getText());

                while (tmVenda.getRowCount() > 0) {
                    tmVenda.removeRow(0);
                }
                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < vendas.size(); i++) {
                    tmVenda.addRow(linha);
                    tmVenda.setValueAt(vendas.get(i).getProprietario().getPro_nome(), i, 0);
                    tmVenda.setValueAt(vendas.get(i).getProprietario().getPro_cpf(), i, 1);
                    tmVenda.setValueAt(vendas.get(i).getProprietario().getPro_rg(), i, 2);
                    tmVenda.setValueAt(vendas.get(i).getChapa().getLetra().getQuadra().getQuadra(), i, 3);
                    tmVenda.setValueAt(vendas.get(i).getChapa().getChapa(), i, 4);
                    tmVenda.setValueAt(vendas.get(i).getChapa().getLetra().getLetra(), i, 5);
                    tmVenda.setValueAt(Methods.formatData(vendas.get(i).getVen_data()), i, 6);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
            }
        }
    }//GEN-LAST:event_jTClienteKeyTyped

    private void jRBDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBDataActionPerformed
        if (((jRBData.isSelected()) && (jDCFim.getDate() != null)) && (jDCInicio.getDate() != null)) {
            try {
                jRBTumulo.setSelected(false);
                jRBCliente.setSelected(false);
                jTCliente.setText("");

                vdao = new VendaDAO();
                vendas = vdao.getByDate(jDCInicio.getDate(), jDCFim.getDate());

                while (tmVenda.getRowCount() > 0) {
                    tmVenda.removeRow(0);
                }
                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < vendas.size(); i++) {
                    tmVenda.addRow(linha);
                    tmVenda.setValueAt(vendas.get(i).getProprietario().getPro_nome(), i, 0);
                    tmVenda.setValueAt(vendas.get(i).getProprietario().getPro_cpf(), i, 1);
                    tmVenda.setValueAt(vendas.get(i).getProprietario().getPro_rg(), i, 2);
                    tmVenda.setValueAt(vendas.get(i).getChapa().getLetra().getQuadra().getQuadra(), i, 3);
                    tmVenda.setValueAt(vendas.get(i).getChapa().getChapa(), i, 4);
                    tmVenda.setValueAt(vendas.get(i).getChapa().getLetra().getLetra(), i, 5);
                    tmVenda.setValueAt(Methods.formatData(vendas.get(i).getVen_data()), i, 6);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
            }
            jRBData.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(null, "Favor, preencher campos obrigatórios.");
            jRBData.setSelected(false);
        }
    }//GEN-LAST:event_jRBDataActionPerformed

    private void jRBTumuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTumuloActionPerformed
        if (jRBTumulo.isSelected()) {

            try {
                jRBCliente.setSelected(false);
                jRBData.setSelected(false);
                jDCFim.setDate(null);
                jDCInicio.setDate(null);
                jTCliente.setText("");

                vdao = new VendaDAO();
                vendas = vdao.getByTomb(String.valueOf(jCBQuadra.getSelectedItem()),
                        String.valueOf(jCBChapa.getSelectedItem()),
                        String.valueOf(jCBLetra.getSelectedItem()));

                while (tmVenda.getRowCount() > 0) {
                    tmVenda.removeRow(0);
                }
                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < vendas.size(); i++) {
                    tmVenda.addRow(linha);
                    tmVenda.setValueAt(vendas.get(i).getProprietario().getPro_nome(), i, 0);
                    tmVenda.setValueAt(vendas.get(i).getProprietario().getPro_cpf(), i, 1);
                    tmVenda.setValueAt(vendas.get(i).getProprietario().getPro_rg(), i, 2);
                    tmVenda.setValueAt(vendas.get(i).getChapa().getLetra().getQuadra().getQuadra(), i, 3);
                    tmVenda.setValueAt(vendas.get(i).getChapa().getChapa(), i, 4);
                    tmVenda.setValueAt(vendas.get(i).getChapa().getLetra().getLetra(), i, 5);
                    tmVenda.setValueAt(Methods.formatData(vendas.get(i).getVen_data()), i, 6);
                }
                jRBTumulo.setSelected(false);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
            }
        }
    }//GEN-LAST:event_jRBTumuloActionPerformed

    private void jCBQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBQuadraActionPerformed
        jCBLetra.removeAllItems();
        tdao = new TumuloDAO();

        String aux = String.valueOf(jCBQuadra.getSelectedItem());
        tumulosLetras = tdao.listarLetrasVendidas();
        for (int i = 0; i < tumulosLetras.size(); i++) {
            jCBLetra.addItem(tumulosLetras.get(i).getLetra());
        }
        jRBTumulo.setSelected(false);
    }//GEN-LAST:event_jCBQuadraActionPerformed

    private void jCBLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLetraActionPerformed
        String aux = String.valueOf(jCBQuadra.getSelectedItem());
        String aux2 = String.valueOf(jCBLetra.getSelectedItem());
        jCBChapa.removeAllItems();

        tdao = new TumuloDAO();
        tumulosChapas = tdao.listarChapasVendidas(tdao.pegaIDLetra(aux, aux2), aux);
        for (int i = 0; i < tumulosChapas.size(); i++) {
            jCBChapa.addItem(tumulosChapas.get(i).getChapa());
        }
        jRBTumulo.setSelected(false);
    }//GEN-LAST:event_jCBLetraActionPerformed

    private void jCBChapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBChapaActionPerformed
        jRBTumulo.setSelected(false);
    }//GEN-LAST:event_jCBChapaActionPerformed

    private void jDCInicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCInicioPropertyChange
        jRBData.setSelected(false);
    }//GEN-LAST:event_jDCInicioPropertyChange

    private void jDCFimPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCFimPropertyChange
        jRBData.setSelected(false);
    }//GEN-LAST:event_jDCFimPropertyChange
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jCBChapa;
    private javax.swing.JComboBox jCBLetra;
    private javax.swing.JComboBox jCBQuadra;
    private com.toedter.calendar.JDateChooser jDCFim;
    private com.toedter.calendar.JDateChooser jDCInicio;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLChapa;
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLLetra;
    private javax.swing.JLabel jLQuadra;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRBCliente;
    private javax.swing.JRadioButton jRBData;
    private javax.swing.JRadioButton jRBTumulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
