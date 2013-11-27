/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes_Auxiliares.Methods;
import DAO.EnderecoDAO;
import DAO.ProprietarioDAO;
import Modelo.Cidades;
import Modelo.Enderecos;
import Modelo.Proprietarios;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author user
 */
public class CadastrarProprietario extends javax.swing.JInternalFrame {

    List<String> cidadeNomes;
    int i;
    EnderecoDAO edao;
    ProprietarioDAO pdao;

    /**
     * Creates new form Cadastro_Proprietarios
     */
    public CadastrarProprietario() throws ParseException {
        super("SIGEN - Cadastro de Proprietários");
        initComponents();
        MaskFormatter maskTelefone = new MaskFormatter("(##) ####-####");
        MaskFormatter maskCelular = new MaskFormatter("(##) #####-####");
        MaskFormatter maskCPF = new MaskFormatter("###.###.###-##");
        MaskFormatter maskCEP = new MaskFormatter("#####-###");
        maskTelefone.install(jFTTelefone);
        maskCelular.install(jFTCelular);
        maskCPF.install(jFTCPF);
        maskCEP.install(jFTCEP);
        populaCidade();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCabecalho = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLRG = new javax.swing.JLabel();
        jLCPF = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLCelular = new javax.swing.JLabel();
        jLLogradouro = new javax.swing.JLabel();
        jLCEP = new javax.swing.JLabel();
        jLNumero = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        jLComplemento = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jTRG = new javax.swing.JTextField();
        jTLogradouro = new javax.swing.JTextField();
        jTNumero = new javax.swing.JTextField();
        jTBairro = new javax.swing.JTextField();
        jTComplemento = new javax.swing.JTextField();
        jCBUF = new javax.swing.JComboBox();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jFTCelular = new javax.swing.JFormattedTextField();
        jBCadastrar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jCBCidade = new javax.swing.JComboBox();
        jDCNascimento = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jFTCPF = new javax.swing.JFormattedTextField();
        jFTCEP = new javax.swing.JFormattedTextField();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Proprietários");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRG.setText("RG:");

        jLCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCPF.setText("CPF:");

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jLCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCelular.setText("Celular:");

        jLLogradouro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLogradouro.setText("Logradouro:");

        jLCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCEP.setText("CEP:");

        jLNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNumero.setText("Número:");

        jLBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLBairro.setText("Bairro:");

        jLComplemento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLComplemento.setText("Complemento:");

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Estado:");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTLogradouro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTComplemento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jCBUF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jCBUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBUFActionPerformed(evt);
            }
        });

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/limpar.png"))); // NOI18N
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jCBCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jDCNascimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nascimento:");

        jFTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLCabecalho)
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDCNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLLogradouro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLBairro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLNumero)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLEstado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCBUF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(jLCidade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLTelefone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFTTelefone)
                            .addGap(18, 18, 18)
                            .addComponent(jLCelular)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLCEP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBCadastrar)
                                    .addGap(29, 29, 29)
                                    .addComponent(jBLimpar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLComplemento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCPF)
                        .addGap(18, 18, 18)
                        .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPF)
                    .addComponent(jLRG)
                    .addComponent(jTRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jDCNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCelular)
                    .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEstado)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCBUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLCidade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLogradouro)
                    .addComponent(jTLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBairro)
                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNumero)
                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCEP)
                    .addComponent(jLComplemento)
                    .addComponent(jTComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBLimpar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmpresa)
                    .addComponent(jLVersao)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jCBUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBUFActionPerformed
        populaCidade();
    }//GEN-LAST:event_jCBUFActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        try {
            Cidades cidade = new Cidades();
            Enderecos endereco = new Enderecos();
            Proprietarios proprietario = new Proprietarios();

            edao = new EnderecoDAO();
            pdao = new ProprietarioDAO();

            cidade.setCid_codigo(edao.CapturarID(String.valueOf(jCBUF.getSelectedItem()), String.valueOf(jCBCidade.getSelectedItem())));
            endereco.setCidade(cidade);
            endereco.setEnd_logradouro(jTLogradouro.getText());
            endereco.setEnd_bairro(jTBairro.getText());
            endereco.setEnd_numero(jTNumero.getText());
            endereco.setEnd_cep(jFTCEP.getText());
            endereco.setEnd_complemento(jTComplemento.getText());
            endereco.setEnd_id(edao.CapturarEndereco());
            proprietario.setEndereco(endereco);
            proprietario.setPro_nome(jTNome.getText());
            proprietario.setPro_cpf(jFTCPF.getText());
            proprietario.setPro_rg(jTRG.getText());
            proprietario.setCel_numero(jFTCelular.getText());
            proprietario.setTel_numero(jFTTelefone.getText());
            proprietario.setPro_nascimento(jDCNascimento.getDate());

            if (verifica(proprietario)) {
                if (Methods.validaCPF(jFTCPF.getText())) {
                    edao.adicionar(endereco);
                    pdao.adicionar(proprietario);
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(null, "CPF inválido, por favor preencher corretamente.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Dados obrigatórios (campos em negrito) faltando, por favor preencher corretamente.");
                marcaCampo();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JComboBox jCBCidade;
    private javax.swing.JComboBox jCBUF;
    private com.toedter.calendar.JDateChooser jDCNascimento;
    private javax.swing.JFormattedTextField jFTCEP;
    private javax.swing.JFormattedTextField jFTCPF;
    private javax.swing.JFormattedTextField jFTCelular;
    private javax.swing.JFormattedTextField jFTTelefone;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLComplemento;
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLLogradouro;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTComplemento;
    private javax.swing.JTextField jTLogradouro;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTRG;
    // End of variables declaration//GEN-END:variables

    public void limpar() {
        jTBairro.setText("");
        jFTCEP.setText("");
        jFTCPF.setText("");
        jTComplemento.setText("");
        jTNome.setText("");
        jTRG.setText("");
        jTLogradouro.setText("");
        jTNumero.setText("");
        jFTCelular.setText("");
        jFTTelefone.setText("");
        jCBUF.setSelectedIndex(0);
        jCBCidade.removeAllItems();
        jDCNascimento.setDate(null);
        populaCidade();
    }

    public boolean verifica(Proprietarios proprietario) {
        if ((((((proprietario.getPro_nome().equals(""))
                || proprietario.getPro_cpf().equals("   .   .   -  "))
                || proprietario.getEndereco().getEnd_logradouro().equals(""))
                || proprietario.getEndereco().getEnd_bairro().equals(""))
                || proprietario.getEndereco().getEnd_numero().equals(""))
                || proprietario.getPro_rg().equals("")) {
            return false;
        }
        return true;
    }

    public void marcaCampo() {
        jLNome.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLCPF.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLLogradouro.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLBairro.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLNumero.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLRG.setFont(new java.awt.Font("Tahoma", 1, 18));
        jDCNascimento.setDate(null);
    }

    private void populaCidade() {
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
}