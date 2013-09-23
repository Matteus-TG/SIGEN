/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.ObitoDAO;
import DAO.TumuloDAO;
import Modelo.Chapas;
import Modelo.Letras;
import Modelo.Obitos;
import Modelo.Quadras;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matt
 */
public class Listar_Obitos extends javax.swing.JInternalFrame {

    TumuloDAO tdao;
    ObitoDAO odao;
    List<Quadras> tumulosQuadras;
    List<Chapas> tumulosChapas;
    List<Letras> tumulosLetras;
    int i;
    List<Obitos> obitos;
    ListSelectionModel lsmObitos;
    DefaultTableModel tmObito = new DefaultTableModel(null, new String[]{"Proprietário do Túmulo", "Falecido", "Idade", "Cidade", "Protocolo", "Guia", "Data", "Nº Documento", "Filiação - Pai", "Filiação - Mãe", "Médico", "Causa da Morte", "Tumulo"});

    /**
     * Creates new form Listar_Obitos
     */
    public Listar_Obitos() {
        super("SIGEN - Listagem dos Óbitos");
        initComponents();

        jCBLetra.removeAllItems();
        jCBChapa.removeAllItems();
        jCBQuadra.removeAllItems();
        tdao = new TumuloDAO();
        tumulosQuadras = tdao.listarQuadras();
        for (int i = 0; i < tumulosQuadras.size(); i++) {
            jCBQuadra.addItem(tumulosQuadras.get(i).getQuadra());
        }
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
        jTCliente = new javax.swing.JTextField();
        jLCabecalho = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jDCInicio = new com.toedter.calendar.JDateChooser();
        jDCFim = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRBData = new javax.swing.JRadioButton();
        jRBCPF = new javax.swing.JRadioButton();
        jTCPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFalecido = new javax.swing.JTextField();
        jRBFalecido = new javax.swing.JRadioButton();
        jCBChapa = new javax.swing.JComboBox();
        jLQuadra = new javax.swing.JLabel();
        jLChapa = new javax.swing.JLabel();
        jLLetra = new javax.swing.JLabel();
        jCBLetra = new javax.swing.JComboBox();
        jCBQuadra = new javax.swing.JComboBox();

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

        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTClienteKeyTyped(evt);
            }
        });

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Listagem dos Óbitos");

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
        jDCFim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDCFimKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Início");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Fim");

        jRBData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBData.setText("Data -");
        jRBData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBDataActionPerformed(evt);
            }
        });

        jRBCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBCPF.setText("CPF - Cliente");
        jRBCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBCPFActionPerformed(evt);
            }
        });

        jTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCPFActionPerformed(evt);
            }
        });
        jTCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCPFKeyTyped(evt);
            }
        });

        tabela.setModel(tmObito);
        jScrollPane1.setViewportView(tabela);

        jLabel3.setText("VL Solutions. Todos os direitos reservados.");

        jLabel4.setText("Versão: 1.4.6");

        jTFalecido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFalecido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFalecidoKeyTyped(evt);
            }
        });

        jRBFalecido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBFalecido.setText("Nome - Falecido");
        jRBFalecido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBFalecidoActionPerformed(evt);
            }
        });

        jCBChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBChapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBChapaActionPerformed(evt);
            }
        });

        jLQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuadra.setText("Quadra:");

        jLChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLChapa.setText("Letra:");

        jLLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLetra.setText("Chapa:");

        jCBLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBLetraActionPerformed(evt);
            }
        });

        jCBQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBQuadraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                                    .addComponent(jLLetra))
                                .addGap(117, 117, 117)
                                .addComponent(jRBData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(19, 19, 19)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDCFim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDCInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRBCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRBFalecido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFalecido, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(94, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBTumulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jDCInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDCFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jRBData))
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
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRBCPF)
                        .addComponent(jRBFalecido)
                        .addComponent(jTFalecido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRBCliente)
                        .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBClienteActionPerformed
        if (jRBCliente.isSelected()) {
            jRBData.setSelected(false);
            jRBTumulo.setSelected(false);
            jRBCPF.setSelected(false);
            jRBFalecido.setSelected(false);
            jDCFim.setDate(null);
            jDCInicio.setDate(null);
            jTCPF.setText("");
            jTFalecido.setText("");

            try {
                odao = new ObitoDAO();
                obitos = odao.listarNomeP(jTCliente.getText());
                String tumAux = "6";

                while (tmObito.getRowCount() > 0) {
                    tmObito.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};


                for (int i = 0; i < obitos.size(); i++) {

                    tumAux = "Quadra: " + obitos.get(i).getChapa().getLetra().getQuadra().getQuadra() + " Chapa: "
                            + obitos.get(i).getChapa().getChapa() + " Letra: "
                            + obitos.get(i).getChapa().getLetra().getLetra();

                    tmObito.addRow(linha);
                    tmObito.setValueAt(obitos.get(i).getProprietario().getPro_nome(), i, 0);
                    tmObito.setValueAt(obitos.get(i).getObi_nome(), i, 1);
                    tmObito.setValueAt(obitos.get(i).getObi_idade(), i, 2);
                    tmObito.setValueAt(obitos.get(i).getCidade().getCid_nome(), i, 3);
                    tmObito.setValueAt(obitos.get(i).getObi_protocolo(), i, 4);
                    tmObito.setValueAt(obitos.get(i).getObi_guia(), i, 5);
                    tmObito.setValueAt(obitos.get(i).getObi_data(), i, 6);
                    tmObito.setValueAt(obitos.get(i).getObi_numero_documento(), i, 7);
                    tmObito.setValueAt(obitos.get(i).getObi_pai(), i, 8);
                    tmObito.setValueAt(obitos.get(i).getObi_mae(), i, 9);
                    tmObito.setValueAt(obitos.get(i).getObi_medico(), i, 10);
                    tmObito.setValueAt(obitos.get(i).getObi_causa_morte(), i, 11);
                    tmObito.setValueAt(tumAux, i, 12);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jRBClienteActionPerformed

    private void jTClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClienteKeyTyped
        if (jRBCliente.isSelected()) {
            jRBData.setSelected(false);
            jRBTumulo.setSelected(false);
            jRBCPF.setSelected(false);
            jRBFalecido.setSelected(false);
            jDCFim.setDate(null);
            jDCInicio.setDate(null);
            jTCPF.setText("");
            jTFalecido.setText("");

            try {
                odao = new ObitoDAO();
                obitos = odao.listarNomeP(jTCliente.getText());
                String tumAux = "6";

                while (tmObito.getRowCount() > 0) {
                    tmObito.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};


                for (int i = 0; i < obitos.size(); i++) {

                    tumAux = "Quadra: " + obitos.get(i).getChapa().getLetra().getQuadra().getQuadra() + " Chapa: "
                            + obitos.get(i).getChapa().getChapa() + " Letra: "
                            + obitos.get(i).getChapa().getLetra().getLetra();

                    tmObito.addRow(linha);
                    tmObito.setValueAt(obitos.get(i).getProprietario().getPro_nome(), i, 0);
                    tmObito.setValueAt(obitos.get(i).getObi_nome(), i, 1);
                    tmObito.setValueAt(obitos.get(i).getObi_idade(), i, 2);
                    tmObito.setValueAt(obitos.get(i).getCidade().getCid_nome(), i, 3);
                    tmObito.setValueAt(obitos.get(i).getObi_protocolo(), i, 4);
                    tmObito.setValueAt(obitos.get(i).getObi_guia(), i, 5);
                    tmObito.setValueAt(obitos.get(i).getObi_data(), i, 6);
                    tmObito.setValueAt(obitos.get(i).getObi_numero_documento(), i, 7);
                    tmObito.setValueAt(obitos.get(i).getObi_pai(), i, 8);
                    tmObito.setValueAt(obitos.get(i).getObi_mae(), i, 9);
                    tmObito.setValueAt(obitos.get(i).getObi_medico(), i, 10);
                    tmObito.setValueAt(obitos.get(i).getObi_causa_morte(), i, 11);
                    tmObito.setValueAt(tumAux, i, 12);

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_jTClienteKeyTyped

    private void jRBDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBDataActionPerformed
        if (jRBData.isSelected()) {
            jRBTumulo.setSelected(false);
            jRBCliente.setSelected(false);
            jRBCPF.setSelected(false);
            jRBFalecido.setSelected(false);
            jTCPF.setText("");
            jTCliente.setText("");
            jTFalecido.setText("");
            if ((jDCInicio.getDate() == null) || (jDCFim.getDate() == null)) {
                JOptionPane.showMessageDialog(null, "Favor, preencher os campos de data!");
                jRBData.setSelected(false);
                while (tmObito.getRowCount() > 0) {
                    tmObito.removeRow(0);
                }
            } else {

                try {
                    odao = new ObitoDAO();
                    obitos = odao.listarData(jDCInicio.getDate(), jDCFim.getDate());
                    String tumAux = "6";

                    while (tmObito.getRowCount() > 0) {
                        tmObito.removeRow(0);
                    }

                    String[] linha = new String[]{null, null, null, null};


                    for (int i = 0; i < obitos.size(); i++) {

                        tumAux = "Quadra: " + obitos.get(i).getChapa().getLetra().getQuadra().getQuadra() + " Chapa: "
                                + obitos.get(i).getChapa().getChapa() + " Letra: "
                                + obitos.get(i).getChapa().getLetra().getLetra();

                        tmObito.addRow(linha);
                        tmObito.setValueAt(obitos.get(i).getProprietario().getPro_nome(), i, 0);
                        tmObito.setValueAt(obitos.get(i).getObi_nome(), i, 1);
                        tmObito.setValueAt(obitos.get(i).getObi_idade(), i, 2);
                        tmObito.setValueAt(obitos.get(i).getCidade().getCid_nome(), i, 3);
                        tmObito.setValueAt(obitos.get(i).getObi_protocolo(), i, 4);
                        tmObito.setValueAt(obitos.get(i).getObi_guia(), i, 5);
                        tmObito.setValueAt(obitos.get(i).getObi_data(), i, 6);
                        tmObito.setValueAt(obitos.get(i).getObi_numero_documento(), i, 7);
                        tmObito.setValueAt(obitos.get(i).getObi_pai(), i, 8);
                        tmObito.setValueAt(obitos.get(i).getObi_mae(), i, 9);
                        tmObito.setValueAt(obitos.get(i).getObi_medico(), i, 10);
                        tmObito.setValueAt(obitos.get(i).getObi_causa_morte(), i, 11);
                        tmObito.setValueAt(tumAux, i, 12);

                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jRBDataActionPerformed

    private void jRBCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBCPFActionPerformed
        if (jRBCPF.isSelected()) {
            jRBData.setSelected(false);
            jRBCliente.setSelected(false);
            jRBTumulo.setSelected(false);
            jRBFalecido.setSelected(false);
            jDCFim.setDate(null);
            jDCInicio.setDate(null);
            jTCliente.setText("");
            jTFalecido.setText("");

            try {
                odao = new ObitoDAO();
                obitos = odao.listarCPF(jTCPF.getText());
                String tumAux = "6";

                while (tmObito.getRowCount() > 0) {
                    tmObito.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};


                for (int i = 0; i < obitos.size(); i++) {

                    tumAux = "Quadra: " + obitos.get(i).getChapa().getLetra().getQuadra().getQuadra() + " Chapa: "
                            + obitos.get(i).getChapa().getChapa() + " Letra: "
                            + obitos.get(i).getChapa().getLetra().getLetra();

                    tmObito.addRow(linha);
                    tmObito.setValueAt(obitos.get(i).getProprietario().getPro_nome(), i, 0);
                    tmObito.setValueAt(obitos.get(i).getObi_nome(), i, 1);
                    tmObito.setValueAt(obitos.get(i).getObi_idade(), i, 2);
                    tmObito.setValueAt(obitos.get(i).getCidade().getCid_nome(), i, 3);
                    tmObito.setValueAt(obitos.get(i).getObi_protocolo(), i, 4);
                    tmObito.setValueAt(obitos.get(i).getObi_guia(), i, 5);
                    tmObito.setValueAt(obitos.get(i).getObi_data(), i, 6);
                    tmObito.setValueAt(obitos.get(i).getObi_numero_documento(), i, 7);
                    tmObito.setValueAt(obitos.get(i).getObi_pai(), i, 8);
                    tmObito.setValueAt(obitos.get(i).getObi_mae(), i, 9);
                    tmObito.setValueAt(obitos.get(i).getObi_medico(), i, 10);
                    tmObito.setValueAt(obitos.get(i).getObi_causa_morte(), i, 11);
                    tmObito.setValueAt(tumAux, i, 12);

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jRBCPFActionPerformed

    private void jTCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCPFActionPerformed

    private void jTFalecidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFalecidoKeyTyped
        if (jRBFalecido.isSelected()) {
            jRBData.setSelected(false);
            jRBCliente.setSelected(false);
            jRBCPF.setSelected(false);
            jRBTumulo.setSelected(false);
            jDCFim.setDate(null);
            jDCInicio.setDate(null);
            jTCPF.setText("");
            jTCliente.setText("");
            try {
                odao = new ObitoDAO();
                obitos = odao.listarObito(jTFalecido.getText());
                String tumAux = "6";

                while (tmObito.getRowCount() > 0) {
                    tmObito.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};


                for (int i = 0; i < obitos.size(); i++) {

                    tumAux = "Quadra: " + obitos.get(i).getChapa().getLetra().getQuadra().getQuadra() + " Chapa: "
                            + obitos.get(i).getChapa().getChapa() + " Letra: "
                            + obitos.get(i).getChapa().getLetra().getLetra();

                    tmObito.addRow(linha);
                    tmObito.setValueAt(obitos.get(i).getProprietario().getPro_nome(), i, 0);
                    tmObito.setValueAt(obitos.get(i).getObi_nome(), i, 1);
                    tmObito.setValueAt(obitos.get(i).getObi_idade(), i, 2);
                    tmObito.setValueAt(obitos.get(i).getCidade().getCid_nome(), i, 3);
                    tmObito.setValueAt(obitos.get(i).getObi_protocolo(), i, 4);
                    tmObito.setValueAt(obitos.get(i).getObi_guia(), i, 5);
                    tmObito.setValueAt(obitos.get(i).getObi_data(), i, 6);
                    tmObito.setValueAt(obitos.get(i).getObi_numero_documento(), i, 7);
                    tmObito.setValueAt(obitos.get(i).getObi_pai(), i, 8);
                    tmObito.setValueAt(obitos.get(i).getObi_mae(), i, 9);
                    tmObito.setValueAt(obitos.get(i).getObi_medico(), i, 10);
                    tmObito.setValueAt(obitos.get(i).getObi_causa_morte(), i, 11);
                    tmObito.setValueAt(tumAux, i, 12);

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_jTFalecidoKeyTyped

    private void jRBFalecidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBFalecidoActionPerformed
        if (jRBFalecido.isSelected()) {
            jRBData.setSelected(false);
            jRBCliente.setSelected(false);
            jRBCPF.setSelected(false);
            jRBTumulo.setSelected(false);
            jDCFim.setDate(null);
            jDCInicio.setDate(null);
            jTCPF.setText("");
            jTCliente.setText("");
            try {
                odao = new ObitoDAO();
                obitos = odao.listarObito(jTFalecido.getText());
                String tumAux = "6";

                while (tmObito.getRowCount() > 0) {
                    tmObito.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};

                for (int i = 0; i < obitos.size(); i++) {

                    tumAux = "Quadra: " + obitos.get(i).getChapa().getLetra().getQuadra().getQuadra() + " Chapa: "
                            + obitos.get(i).getChapa().getChapa() + " Letra: "
                            + obitos.get(i).getChapa().getLetra().getLetra();

                    tmObito.addRow(linha);
                    tmObito.setValueAt(obitos.get(i).getProprietario().getPro_nome(), i, 0);
                    tmObito.setValueAt(obitos.get(i).getObi_nome(), i, 1);
                    tmObito.setValueAt(obitos.get(i).getObi_idade(), i, 2);
                    tmObito.setValueAt(obitos.get(i).getCidade().getCid_nome(), i, 3);
                    tmObito.setValueAt(obitos.get(i).getObi_protocolo(), i, 4);
                    tmObito.setValueAt(obitos.get(i).getObi_guia(), i, 5);
                    tmObito.setValueAt(obitos.get(i).getObi_data(), i, 6);
                    tmObito.setValueAt(obitos.get(i).getObi_numero_documento(), i, 7);
                    tmObito.setValueAt(obitos.get(i).getObi_pai(), i, 8);
                    tmObito.setValueAt(obitos.get(i).getObi_mae(), i, 9);
                    tmObito.setValueAt(obitos.get(i).getObi_medico(), i, 10);
                    tmObito.setValueAt(obitos.get(i).getObi_causa_morte(), i, 11);
                    tmObito.setValueAt(tumAux, i, 12);

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }//GEN-LAST:event_jRBFalecidoActionPerformed

    private void jRBTumuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTumuloActionPerformed
        if (jRBTumulo.isSelected()) {
            jRBData.setSelected(false);
            jRBCliente.setSelected(false);
            jRBCPF.setSelected(false);
            jRBFalecido.setSelected(false);
            jDCFim.setDate(null);
            jDCInicio.setDate(null);
            jTCPF.setText("");
            jTCliente.setText("");
            jTFalecido.setText("");

            try {
                odao = new ObitoDAO();
                obitos = odao.listarTumulo(tdao.getTomb(String.valueOf(jCBQuadra.getSelectedItem()),
                        String.valueOf(jCBChapa.getSelectedItem()),
                        String.valueOf(jCBLetra.getSelectedItem())));

                String tumAux = "6";

                while (tmObito.getRowCount() > 0) {
                    tmObito.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};


                for (int i = 0; i < obitos.size(); i++) {

                    tumAux = "Quadra: " + obitos.get(i).getChapa().getLetra().getQuadra().getQuadra() + " Chapa: "
                            + obitos.get(i).getChapa().getChapa() + " Letra: "
                            + obitos.get(i).getChapa().getLetra().getLetra();

                    tmObito.addRow(linha);
                    tmObito.setValueAt(obitos.get(i).getProprietario().getPro_nome(), i, 0);
                    tmObito.setValueAt(obitos.get(i).getObi_nome(), i, 1);
                    tmObito.setValueAt(obitos.get(i).getObi_idade(), i, 2);
                    tmObito.setValueAt(obitos.get(i).getCidade().getCid_nome(), i, 3);
                    tmObito.setValueAt(obitos.get(i).getObi_protocolo(), i, 4);
                    tmObito.setValueAt(obitos.get(i).getObi_guia(), i, 5);
                    tmObito.setValueAt(obitos.get(i).getObi_data(), i, 6);
                    tmObito.setValueAt(obitos.get(i).getObi_numero_documento(), i, 7);
                    tmObito.setValueAt(obitos.get(i).getObi_pai(), i, 8);
                    tmObito.setValueAt(obitos.get(i).getObi_mae(), i, 9);
                    tmObito.setValueAt(obitos.get(i).getObi_medico(), i, 10);
                    tmObito.setValueAt(obitos.get(i).getObi_causa_morte(), i, 11);
                    tmObito.setValueAt(tumAux, i, 12);

                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jRBTumuloActionPerformed

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

    private void jCBQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBQuadraActionPerformed
        jCBLetra.removeAllItems();
        tdao = new TumuloDAO();

        String aux = String.valueOf(jCBQuadra.getSelectedItem());
        tumulosLetras = tdao.listarLetras(aux);
        for (int i = 0; i < tumulosLetras.size(); i++) {
            jCBLetra.addItem(tumulosLetras.get(i).getLetra());
        }
        jRBTumulo.setSelected(false);
    }//GEN-LAST:event_jCBQuadraActionPerformed

    private void jTCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCPFKeyTyped
        jRBCPF.setSelected(false);
    }//GEN-LAST:event_jTCPFKeyTyped

    private void jDCFimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDCFimKeyTyped
        jRBData.setSelected(false);
    }//GEN-LAST:event_jDCFimKeyTyped

    private void jDCInicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCInicioPropertyChange
        jRBData.setSelected(false);
    }//GEN-LAST:event_jDCInicioPropertyChange

    private void jDCFimPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCFimPropertyChange
        jRBData.setSelected(false);
    }//GEN-LAST:event_jDCFimPropertyChange

    private void jCBChapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBChapaActionPerformed
        jRBTumulo.setSelected(false);
    }//GEN-LAST:event_jCBChapaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jCBChapa;
    private javax.swing.JComboBox jCBLetra;
    private javax.swing.JComboBox jCBQuadra;
    private com.toedter.calendar.JDateChooser jDCFim;
    private com.toedter.calendar.JDateChooser jDCInicio;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLChapa;
    private javax.swing.JLabel jLLetra;
    private javax.swing.JLabel jLQuadra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRBCPF;
    private javax.swing.JRadioButton jRBCliente;
    private javax.swing.JRadioButton jRBData;
    private javax.swing.JRadioButton jRBFalecido;
    private javax.swing.JRadioButton jRBTumulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTCPF;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTextField jTFalecido;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
