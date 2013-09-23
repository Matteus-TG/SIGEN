/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.EnderecoDAO;
import DAO.ObitoDAO;
import DAO.TumuloDAO;
import Modelo.Chapas;
import Modelo.Cidades;
import Modelo.Letras;
import Modelo.Obitos;
import Modelo.Quadras;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Cadastrar_Obito extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastrar_Obito
     */
    TumuloDAO tdao;
    EnderecoDAO edao;
    ObitoDAO odao;
    List<Quadras> tumulosQuadras;
    List<Chapas> tumulosChapas;
    List<Letras> tumulosLetras;
    List<String> cidadeNomes;
    int i;

    public Cadastrar_Obito() {
        super("SIGEN - Cadastro dos Óbitos");
        initComponents();
        jCBChapa.removeAllItems();
        jCBLetra.removeAllItems();
        jCBQuadra.removeAllItems();
        String aux = (String) jCBUF.getSelectedItem();
        jCBCidade.removeAllItems();
        i = 0;
        edao = new EnderecoDAO();
        cidadeNomes = edao.listarCidades(aux);

        while (i < cidadeNomes.size()) {
            jCBCidade.addItem(cidadeNomes.get(i));
            i++;
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

        jLabel1 = new javax.swing.JLabel();
        jLProtocolo = new javax.swing.JLabel();
        jLGuia = new javax.swing.JLabel();
        jLFiliacaoM = new javax.swing.JLabel();
        jLFiliacaoP = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jLDocumento = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLIdade = new javax.swing.JLabel();
        jLMedico = new javax.swing.JLabel();
        jLCausa = new javax.swing.JLabel();
        jTIdade = new javax.swing.JTextField();
        jTNome = new javax.swing.JTextField();
        jTProtocolo = new javax.swing.JTextField();
        jTDocumento = new javax.swing.JTextField();
        jTGuia = new javax.swing.JTextField();
        jTFiliacaoP = new javax.swing.JTextField();
        jTMedico = new javax.swing.JTextField();
        jTFiliacaoM = new javax.swing.JTextField();
        jTCausa = new javax.swing.JTextField();
        jCBCidade = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDCData = new com.toedter.calendar.JDateChooser();
        jCBUF = new javax.swing.JComboBox();
        jLEstado = new javax.swing.JLabel();
        jLProprietario = new javax.swing.JLabel();
        jTProprietario = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jCBLetra = new javax.swing.JComboBox();
        jLQuadra = new javax.swing.JLabel();
        jLLetra = new javax.swing.JLabel();
        jLChapa = new javax.swing.JLabel();
        jCBChapa = new javax.swing.JComboBox();
        jCBQuadra = new javax.swing.JComboBox();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro Obituário");

        jLProtocolo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLProtocolo.setText("Protocolo:");

        jLGuia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLGuia.setText("Guia:");

        jLFiliacaoM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFiliacaoM.setText("Filiação - Mãe:");

        jLFiliacaoP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLFiliacaoP.setText("Filiação - Pai:");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLData.setText("Data:");

        jLDocumento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDocumento.setText("Nº Documento:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Cidade:");

        jLIdade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLIdade.setText("Idade:");

        jLMedico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLMedico.setText("Médico:");

        jLCausa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCausa.setText("Causa da Morte:");

        jTIdade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTProtocolo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTDocumento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTGuia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTFiliacaoP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTMedico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTFiliacaoM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCausa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar.png"))); // NOI18N
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jLabel2.setText("VL Solutions. Todos os direitos reservados.");

        jLabel3.setText("Versão: 1.4.6");

        jDCData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBUF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jCBUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBUFActionPerformed(evt);
            }
        });

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Estado:");

        jLProprietario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLProprietario.setText("Proprietário:");

        jTProprietario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jCBLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBLetraActionPerformed(evt);
            }
        });

        jLQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuadra.setText("Quadra:");

        jLLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLetra.setText("Letra:");

        jLChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLChapa.setText("Chapa:");

        jCBChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBQuadraActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel3))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(26, 26, 26)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLFiliacaoP)
                            .add(layout.createSequentialGroup()
                                .add(jLFiliacaoM)
                                .add(8, 8, 8)
                                .add(jTFiliacaoM, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 399, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(jLMedico)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTMedico))
                    .add(layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(jBCadastrar)
                                .add(18, 18, 18)
                                .add(jButton1))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(jLData)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jDCData, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jLDocumento)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jTDocumento))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .add(jLCausa)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jTCausa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 383, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jTFiliacaoP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 399, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .add(jLProtocolo)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jTProtocolo)
                                        .add(18, 18, 18)
                                        .add(jLGuia)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jTGuia))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .add(jLEstado)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jCBUF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jLabel12)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jCBCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 296, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLNome)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jTNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 332, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(jLIdade)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jTIdade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(layout.createSequentialGroup()
                                    .add(jLProprietario)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(layout.createSequentialGroup()
                                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                .add(jLQuadra, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(jCBQuadra, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 79, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(60, 60, 60)
                                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                .add(jCBLetra, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(jLLetra))
                                            .add(44, 44, 44)
                                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                .add(jLChapa)
                                                .add(jCBChapa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                        .add(layout.createSequentialGroup()
                                            .add(jTProprietario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(18, 18, 18)
                                            .add(jBPesquisar))))))))
                .add(26, 26, 26))
            .add(layout.createSequentialGroup()
                .add(176, 176, 176)
                .add(jLabel1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(new java.awt.Component[] {jBCadastrar, jButton1}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLProprietario)
                    .add(jTProprietario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jBPesquisar))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLQuadra)
                    .add(jLLetra)
                    .add(jLChapa))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jCBQuadra, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jCBLetra, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jCBChapa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLNome)
                    .add(jTNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLIdade)
                    .add(jTIdade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jCBCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLEstado)
                    .add(jCBUF, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLProtocolo)
                            .add(jTProtocolo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLGuia)
                            .add(jTGuia, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLDocumento)
                                    .add(jTDocumento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(layout.createSequentialGroup()
                                .add(24, 24, 24)
                                .add(jDCData, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jLData))
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLFiliacaoM)
                    .add(jTFiliacaoM, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLFiliacaoP)
                    .add(jTFiliacaoP, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLMedico)
                    .add(jTMedico, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLCausa)
                    .add(jTCausa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jBCadastrar)
                    .add(jButton1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2))
                .add(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTIdade.setText("");
        jTNome.setText("");
        jTProtocolo.setText("");
        jTDocumento.setText("");
        jTGuia.setText("");
        jTFiliacaoP.setText("");
        jTMedico.setText("");
        jTFiliacaoM.setText("");
        jTCausa.setText("");
        jDCData.setDate(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCBUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBUFActionPerformed
        String aux = (String) jCBUF.getSelectedItem();
        jCBCidade.removeAllItems();
        i = 0;
        edao = new EnderecoDAO();
        cidadeNomes = edao.listarCidades(aux);

        while (i < cidadeNomes.size()) {
            jCBCidade.addItem(cidadeNomes.get(i));
            i++;
        }
    }//GEN-LAST:event_jCBUFActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        try {
            Obitos obito = new Obitos();
            Cidades cidade = new Cidades();
            Chapas chapa = new Chapas();
            edao = new EnderecoDAO();
            odao = new ObitoDAO();
            tdao = new TumuloDAO();

            chapa.setCodigo(tdao.getIdChapa(String.valueOf(jCBChapa.getSelectedItem()),
                    String.valueOf(jCBLetra.getSelectedItem())));

            obito.setChapa(chapa);
            obito.setObi_nome(jTNome.getText());
            obito.setObi_idade(jTIdade.getText());
            cidade.setCid_codigo(edao.CapturarID(String.valueOf(jCBUF.getSelectedItem()), String.valueOf(jCBCidade.getSelectedItem())));
            obito.setCidade(cidade);
            obito.setObi_protocolo(jTProtocolo.getText());
            obito.setObi_guia(jTGuia.getText());
            obito.setObi_data(jDCData.getDate());
            obito.setObi_numero_documento(jTDocumento.getText());
            obito.setObi_mae(jTFiliacaoM.getText());
            obito.setObi_pai(jTFiliacaoP.getText());
            obito.setObi_medico(jTMedico.getText());
            obito.setObi_causa_morte(jTCausa.getText());
            odao.adicionar(obito);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastrar_Obito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        jCBChapa.removeAllItems();
        jCBLetra.removeAllItems();
        jCBQuadra.removeAllItems();

        tdao = new TumuloDAO();
        tumulosQuadras = tdao.listarQuadraBYCPF(jTProprietario.getText());

        for (int i = 0; i < tumulosQuadras.size(); i++) {
            jCBQuadra.addItem(tumulosQuadras.get(i).getQuadra());
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jCBLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLetraActionPerformed
        jCBChapa.removeAllItems();
        tdao = new TumuloDAO();
        String aux = String.valueOf(jCBQuadra.getSelectedItem());
        tumulosChapas = tdao.listarQuadrasBYCPF(jTProprietario.getText(),
                aux,
                tdao.pegaIDLetra(aux, String.valueOf(jCBLetra.getSelectedItem())));

        for (int i = 0; i < tumulosChapas.size(); i++) {
            jCBChapa.addItem(tumulosChapas.get(i).getChapa());
        }
    }//GEN-LAST:event_jCBLetraActionPerformed

    private void jCBQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBQuadraActionPerformed
        jCBLetra.removeAllItems();
        tdao = new TumuloDAO();

        String aux = String.valueOf(jCBQuadra.getSelectedItem());
        tumulosLetras = tdao.listarLetrasBYCPF(jTProprietario.getText(), aux);
        for (int i = 0; i < tumulosLetras.size(); i++) {
            jCBLetra.addItem(tumulosLetras.get(i).getLetra());
        }
    }//GEN-LAST:event_jCBQuadraActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCBChapa;
    private javax.swing.JComboBox jCBCidade;
    private javax.swing.JComboBox jCBLetra;
    private javax.swing.JComboBox jCBQuadra;
    private javax.swing.JComboBox jCBUF;
    private com.toedter.calendar.JDateChooser jDCData;
    private javax.swing.JLabel jLCausa;
    private javax.swing.JLabel jLChapa;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLDocumento;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLFiliacaoM;
    private javax.swing.JLabel jLFiliacaoP;
    private javax.swing.JLabel jLGuia;
    private javax.swing.JLabel jLIdade;
    private javax.swing.JLabel jLLetra;
    private javax.swing.JLabel jLMedico;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLProprietario;
    private javax.swing.JLabel jLProtocolo;
    private javax.swing.JLabel jLQuadra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTCausa;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JTextField jTFiliacaoM;
    private javax.swing.JTextField jTFiliacaoP;
    private javax.swing.JTextField jTGuia;
    private javax.swing.JTextField jTIdade;
    private javax.swing.JTextField jTMedico;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTProprietario;
    private javax.swing.JTextField jTProtocolo;
    // End of variables declaration//GEN-END:variables
}
