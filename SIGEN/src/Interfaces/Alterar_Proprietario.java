/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.EnderecoDAO;
import DAO.ProprietarioDAO;
import Modelo.Cidades;
import Modelo.Enderecos;
import Modelo.Estados;
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
public class Alterar_Proprietario extends javax.swing.JFrame {

    /**
     * Creates new form Alterar_Proprietario
     */
    List<String> cidadeNomes;
    int i;
    EnderecoDAO edao;
    ProprietarioDAO pdao;
    Proprietarios proprietario = new Proprietarios();
    Enderecos endereco = new Enderecos();
    Cidades cidade = new Cidades();
    Estados estado = new Estados();
    
    public Alterar_Proprietario(int ID) throws SQLException, ParseException {
        super("SIGEN - Alteração de Cadastro de Clientes");
        
        this.setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        MaskFormatter maskData = new MaskFormatter("(##) ####-####");
        MaskFormatter maskData2 = new MaskFormatter("(##) ####-####");
        maskData.install(jFTTelefone);
        maskData2.install(jFTCelular);
        fillField(ID);
        preencheCidade();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBUF = new javax.swing.JComboBox();
        jTComplemento = new javax.swing.JTextField();
        jTCEP = new javax.swing.JTextField();
        jLCabecalho = new javax.swing.JLabel();
        jLCPF = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLRG = new javax.swing.JLabel();
        jLCEP = new javax.swing.JLabel();
        jLLogradouro = new javax.swing.JLabel();
        jLCelular = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jCBCidade = new javax.swing.JComboBox();
        jBCadastrar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jTNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jLBairro = new javax.swing.JLabel();
        jLNumero = new javax.swing.JLabel();
        jLCidade = new javax.swing.JLabel();
        jLComplemento = new javax.swing.JLabel();
        jTLogradouro = new javax.swing.JTextField();
        jTNumero = new javax.swing.JTextField();
        jTBairro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTCPF = new javax.swing.JTextField();
        jTRG = new javax.swing.JTextField();
        jFTTelefone = new javax.swing.JFormattedTextField();
        jDCNascimento = new com.toedter.calendar.JDateChooser();
        jFTCelular = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jCBUF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jCBUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBUFActionPerformed(evt);
            }
        });

        jTComplemento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Edição de Proprietários");

        jLCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCPF.setText("CPF:");

        jLNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNome.setText("Nome:");

        jLRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLRG.setText("RG:");

        jLCEP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCEP.setText("CEP:");

        jLLogradouro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLogradouro.setText("Logradouro:");

        jLCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCelular.setText("Celular:");

        jLTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLTelefone.setText("Telefone:");

        jCBCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        jBCadastrar.setText("Editar");
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

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nascimento:");

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setText("Estado:");

        jLBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLBairro.setText("Bairro:");

        jLNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNumero.setText("Número:");

        jLCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCidade.setText("Cidade:");

        jLComplemento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLComplemento.setText("Complemento:");

        jTLogradouro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTLogradouroActionPerformed(evt);
            }
        });

        jTNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setText("Versão: 1.4.6");

        jLabel2.setText("VL Solutions. Todos os direitos reservados.");

        jTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jTRG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTTelefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jDCNascimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jFTCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLCabecalho)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTNome))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLCPF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLRG)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTRG, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jDCNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(jLCidade))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLCEP)
                                    .addGap(10, 10, 10)
                                    .addComponent(jTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLComplemento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTComplemento))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLLogradouro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTLogradouro))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLTelefone)
                                        .addGap(9, 9, 9)
                                        .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLCelular)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBCadastrar)
                                .addGap(42, 42, 42)
                                .addComponent(jBLimpar)))
                        .addGap(35, 35, 35))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTCPF, jTRG});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLCabecalho)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPF)
                    .addComponent(jLRG)
                    .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jDCNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jLCelular)
                    .addComponent(jFTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEstado)
                    .addComponent(jCBUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCidade)
                        .addComponent(jCBCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLogradouro)
                    .addComponent(jTLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBairro)
                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNumero)
                    .addComponent(jTNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCEP)
                    .addComponent(jTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLComplemento)
                    .addComponent(jTComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBLimpar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        if ((jDCNascimento.getDate() != null) || (jCBCidade.getSelectedItem() != null)) {
            try {
                Cidades cidade = new Cidades();
                Enderecos endereco = new Enderecos();
                Proprietarios proprietarioAux = new Proprietarios();
                
                edao = new EnderecoDAO();
                pdao = new ProprietarioDAO();
                
                cidade.setCid_codigo(edao.CapturarID(String.valueOf(jCBUF.getSelectedItem()), String.valueOf(jCBCidade.getSelectedItem())));
                endereco.setCidade(cidade);
                endereco.setEnd_logradouro(jTLogradouro.getText());
                endereco.setEnd_bairro(jTBairro.getText());
                endereco.setEnd_numero(jTNumero.getText());
                endereco.setEnd_cep(jTCEP.getText());
                endereco.setEnd_complemento(jTComplemento.getText());
                endereco.setEnd_id(proprietario.getEndereco().getEnd_id());
                edao.editar(endereco);
                
                endereco.setEnd_id(edao.CapturarEndereco());
                proprietarioAux.setEndereco(endereco);
                proprietarioAux.setPro_nome(jTNome.getText());
                proprietarioAux.setPro_cpf(jTCPF.getText());
                proprietarioAux.setPro_rg(jTRG.getText());
                proprietarioAux.setCel_numero(jFTCelular.getText());
                proprietarioAux.setTel_numero(jFTTelefone.getText());
                proprietarioAux.setPro_codigo(proprietario.getPro_codigo());
                proprietarioAux.setPro_nascimento(jDCNascimento.getDate());
                pdao.editar(proprietarioAux);
                JOptionPane.showMessageDialog(null, "Cliente editado com Sucesso!");
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Alguns campos obrigatórios estão faltando. Por favor, preenche-los!");
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed
    
    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTNome.setText("aaaaaaaaaaaa");
        jTBairro.setText("");
        jTCEP.setText("");
        jTCPF.setText("");
        jTComplemento.setText("");
        jTNome.setText("");
        jTRG.setText("");
        jTLogradouro.setText("");
        jTNumero.setText("");
        jFTTelefone.setText("");
        jFTTelefone.setText("");
        jCBUF.setSelectedIndex(1);
        jCBCidade.removeAllItems();
    }//GEN-LAST:event_jBLimparActionPerformed
    
    private void jTLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTLogradouroActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JComboBox jCBCidade;
    private javax.swing.JComboBox jCBUF;
    private com.toedter.calendar.JDateChooser jDCNascimento;
    private javax.swing.JFormattedTextField jFTCelular;
    private javax.swing.JFormattedTextField jFTTelefone;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLCelular;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLComplemento;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLLogradouro;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNumero;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCEP;
    private javax.swing.JTextField jTCPF;
    private javax.swing.JTextField jTComplemento;
    private javax.swing.JTextField jTLogradouro;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNumero;
    private javax.swing.JTextField jTRG;
    // End of variables declaration//GEN-END:variables

    public void fillField(int ID) throws SQLException {
        pdao = new ProprietarioDAO();
        proprietario = pdao.getEdit(ID);
        jTNome.setText(proprietario.getPro_nome());
        jTCPF.setText(proprietario.getPro_cpf());
        jTRG.setText(proprietario.getPro_rg());
        jTLogradouro.setText(proprietario.getEndereco().getEnd_logradouro());
        jTBairro.setText(proprietario.getEndereco().getEnd_bairro());
        jTNumero.setText(proprietario.getEndereco().getEnd_numero());
        jTCEP.setText(proprietario.getEndereco().getEnd_cep());
        jTComplemento.setText(proprietario.getEndereco().getEnd_complemento());
        jFTCelular.setText(proprietario.getCel_numero());
        jFTTelefone.setText(proprietario.getTel_numero());
        
        for (int i = 0; i < 27; i++) {
            if (proprietario.getEndereco().getCidade().getEstado().getEst_sigla().equals(jCBUF.getItemAt(i))) {
                jCBUF.setSelectedIndex(i);
            }
        }
    }
    
    public void preencheCidade() {
        for (int i = 0; i < jCBCidade.getItemCount(); i++) {
            if (proprietario.getEndereco().getCidade().getCid_nome().equals(jCBCidade.getItemAt(i))) {
                jCBCidade.setSelectedIndex(i);
            }
        }
    }
}
