/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.EnderecoDAO;
import DAO.ObitoDAO;
import DAO.ProprietarioDAO;
import DAO.TumuloDAO;
import Modelo.Chapas;
import Modelo.Cidades;
import Modelo.Letras;
import Modelo.Obitos;
import Modelo.Proprietarios;
import Modelo.Quadras;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author user
 */
public class CadastrarObito extends javax.swing.JInternalFrame {

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

    public CadastrarObito() throws ParseException {
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
        MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
        maskCPF.install(jFTCPF);
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
        jDCData = new com.toedter.calendar.JDateChooser();
        jCBUF = new javax.swing.JComboBox();
        jLEstado = new javax.swing.JLabel();
        jLProprietario = new javax.swing.JLabel();
        jBPesquisar = new javax.swing.JButton();
        jCBLetra = new javax.swing.JComboBox();
        jLQuadra = new javax.swing.JLabel();
        jLLetra = new javax.swing.JLabel();
        jLChapa = new javax.swing.JLabel();
        jCBChapa = new javax.swing.JComboBox();
        jCBQuadra = new javax.swing.JComboBox();
        jLDono = new javax.swing.JLabel();
        jFTCPF = new javax.swing.JFormattedTextField();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();

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

        jLDono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLDono.setText("    ");

        jFTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLLetra)
                                .addGap(18, 18, 18)
                                .addComponent(jCBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLChapa)
                                .addGap(18, 18, 18)
                                .addComponent(jCBChapa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLMedico)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLData)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLDocumento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTDocumento))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLCausa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTCausa, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLFiliacaoP)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFiliacaoP, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLProtocolo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTProtocolo)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLGuia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTGuia))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCBUF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLIdade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBCadastrar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLFiliacaoM)
                            .addGap(18, 18, 18)
                            .addComponent(jTFiliacaoM, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLDono)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLProprietario)
                        .addGap(18, 18, 18)
                        .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBPesquisar)))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProprietario)
                    .addComponent(jBPesquisar)
                    .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLDono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLQuadra)
                    .addComponent(jLLetra)
                    .addComponent(jLChapa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIdade)
                    .addComponent(jTIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEstado)
                    .addComponent(jCBUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLProtocolo)
                            .addComponent(jTProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLGuia)
                            .addComponent(jTGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLDocumento)
                                    .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLData))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFiliacaoM)
                    .addComponent(jTFiliacaoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFiliacaoP)
                    .addComponent(jTFiliacaoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMedico)
                    .addComponent(jTMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCausa)
                    .addComponent(jTCausa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jButton1))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLVersao)
                    .addComponent(jLEmpresa))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpar();
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

            if (verifica(obito)) {
                odao.adicionar(obito);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Atenção, todos os campos (com exceção da filiação) são obrigatórios, favor verificar e preencher o formulário corretamente.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        jCBChapa.removeAllItems();
        jCBLetra.removeAllItems();
        jCBQuadra.removeAllItems();

        tdao = new TumuloDAO();
        tumulosQuadras = tdao.listarQuadraBYCPF(jFTCPF.getText());

        for (int i = 0; i < tumulosQuadras.size(); i++) {
            jCBQuadra.addItem(tumulosQuadras.get(i).getQuadra());
        }

        try {
            ProprietarioDAO pdao = new ProprietarioDAO();
            Proprietarios proprietario = pdao.listarCPF(jFTCPF.getText());
            jLDono.setText(proprietario.getPro_nome());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
        }

    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jCBLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLetraActionPerformed
        jCBChapa.removeAllItems();
        tdao = new TumuloDAO();
        String aux = String.valueOf(jCBQuadra.getSelectedItem());
        tumulosChapas = tdao.listarQuadrasBYCPF(jFTCPF.getText(),
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
        tumulosLetras = tdao.listarLetrasBYCPF(jFTCPF.getText(), aux);
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
    private javax.swing.JFormattedTextField jFTCPF;
    private javax.swing.JLabel jLCausa;
    private javax.swing.JLabel jLChapa;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLDocumento;
    private javax.swing.JLabel jLDono;
    private javax.swing.JLabel jLEmpresa;
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
    private javax.swing.JLabel jLVersao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JTextField jTCausa;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JTextField jTFiliacaoM;
    private javax.swing.JTextField jTFiliacaoP;
    private javax.swing.JTextField jTGuia;
    private javax.swing.JTextField jTIdade;
    private javax.swing.JTextField jTMedico;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTProtocolo;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
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
    }

    private boolean verifica(Obitos obito) {
        if (((((((((((obito.getChapa().getCodigo() == null) || obito.getObi_nome().equals(""))
                || obito.getObi_idade().equals("")) || obito.getCidade().getCid_codigo() == null)
                || obito.getObi_protocolo().equals("")) || obito.getObi_guia().equals("")))
                || new java.sql.Date(obito.getObi_data().getTime()) == null) || obito.getObi_numero_documento().equals(""))
                || obito.getObi_medico().equals(""))
                || obito.getObi_causa_morte().equals("")) {
            return false;
        } else {
            return true;
        }
    }
}
