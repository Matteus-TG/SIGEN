/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.FuncionarioDAO;
import DAO.ProprietarioDAO;
import Modelo.Chapas;
import Modelo.Funcionarios;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Listar_Funcionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Listar_Funcionario
     */
    FuncionarioDAO fdao;
    List<Funcionarios> funcionarios;//List de uma classe do modelo para utilização na tabela;
    ListSelectionModel lsmFuncionario;
    DefaultTableModel tmFuncionario = new DefaultTableModel(null, new String[]{"Nome", "Data de Cadastro", "CTPS", "CPF", "RG", "Telefone", "Celular", "Endereço"});
    //definição das colunas da tabela

    public Listar_Funcionario() {
        super("SIGEN - Listagem de Funcionários");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRBNome = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jBAtualizar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFTCPF = new javax.swing.JFormattedTextField();
        jBPesquisar = new javax.swing.JButton();

        setClosable(true);

        jRBNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBNome.setText("Nome:");
        jRBNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Listagem de Funcionários");

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomeKeyTyped(evt);
            }
        });

        tabela.setModel(tmFuncionario);
        jScrollPane1.setViewportView(tabela);

        jBAtualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jBAtualizar.setText("Atualizar");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jBExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.gif"))); // NOI18N
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jLabel2.setText("VL Solutions. Todos os direitos reservados.");

        jLabel3.setText("Versão: 1.4.6");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CPF:");

        jFTCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jBPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBExcluir)
                            .addComponent(jBAtualizar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jRBNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jFTCPF)
                                .addGap(18, 18, 18)
                                .addComponent(jBPesquisar))
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAtualizar, jBExcluir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jBExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNomeActionPerformed
        if (jRBNome.isSelected()) {
            try {
                jRBNome.setSelected(true);
                jFTCPF.setText("");

                fdao = new FuncionarioDAO();
                funcionarios = fdao.listarNome("%" + jTNome.getText() + "%");
                String endereco;

                while (tmFuncionario.getRowCount() > 0) {
                    tmFuncionario.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < funcionarios.size(); i++) {
                    endereco = funcionarios.get(i).getEndereco().getEnd_logradouro() + " - "
                            + funcionarios.get(i).getEndereco().getEnd_numero() + ". "
                            + funcionarios.get(i).getEndereco().getCidade().getCid_nome() + ", "
                            + funcionarios.get(i).getEndereco().getCidade().getEstado().getEst_sigla() + " - "
                            + funcionarios.get(i).getEndereco().getEnd_bairro() + ". CEP: "
                            + funcionarios.get(i).getEndereco().getEnd_cep() + " ("
                            + funcionarios.get(i).getEndereco().getEnd_complemento() + ").";

                    tmFuncionario.addRow(linha);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_nome(), i, 0);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_data_cadastro(), i, 1);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_ctps(), i, 2);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_cpf(), i, 3);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_rg(), i, 4);
                    tmFuncionario.setValueAt(funcionarios.get(i).getTel_numero(), i, 5);
                    tmFuncionario.setValueAt(funcionarios.get(i).getCel_numero(), i, 6);
                    tmFuncionario.setValueAt(endereco, i, 7);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Listar_Proprietarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jRBNomeActionPerformed

    private void jTNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomeKeyTyped
        if (jRBNome.isSelected()) {
            try {
                jRBNome.setSelected(true);
                jFTCPF.setText("");

                fdao = new FuncionarioDAO();
                funcionarios = fdao.listarNome("%" + jTNome.getText() + "%");
                String endereco;

                while (tmFuncionario.getRowCount() > 0) {
                    tmFuncionario.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < funcionarios.size(); i++) {
                    endereco = funcionarios.get(i).getEndereco().getEnd_logradouro() + " - "
                            + funcionarios.get(i).getEndereco().getEnd_numero() + ". "
                            + funcionarios.get(i).getEndereco().getCidade().getCid_nome() + ", "
                            + funcionarios.get(i).getEndereco().getCidade().getEstado().getEst_sigla() + " - "
                            + funcionarios.get(i).getEndereco().getEnd_bairro() + ". CEP: "
                            + funcionarios.get(i).getEndereco().getEnd_cep() + " ("
                            + funcionarios.get(i).getEndereco().getEnd_complemento() + ").";

                    tmFuncionario.addRow(linha);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_nome(), i, 0);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_data_cadastro(), i, 1);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_ctps(), i, 2);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_cpf(), i, 3);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_rg(), i, 4);
                    tmFuncionario.setValueAt(funcionarios.get(i).getTel_numero(), i, 5);
                    tmFuncionario.setValueAt(funcionarios.get(i).getCel_numero(), i, 6);
                    tmFuncionario.setValueAt(endereco, i, 7);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Listar_Proprietarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTNomeKeyTyped

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int pergunta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este Cliente?\n");
        if (pergunta == 0) {//clicou em sim  
            try {
                fdao = new FuncionarioDAO();
                fdao.remover(funcionarios.get(tabela.getSelectedRow()).getFun_codigo());
                JOptionPane.showMessageDialog(null, "Cliente deletado com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
            }
        }
        while (tmFuncionario.getRowCount() > 0) {
            tmFuncionario.removeRow(0);
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        try {
            if (tabela.getSelectedRowCount() < 1) {
                JOptionPane.showMessageDialog(null, "Selecione um cadastro a ser alterado.");
            } else {
                Alterar_funcionario af = new Alterar_funcionario(funcionarios.get(tabela.getSelectedRow()).getFun_codigo());
                af.setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }//GEN-LAST:event_jBAtualizarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
           try {
                jRBNome.setSelected(false);
                jTNome.setText("");

                fdao = new FuncionarioDAO();
                Funcionarios funcionario = fdao.listarCPF(jFTCPF.getText());
                String endereco;

                while (tmFuncionario.getRowCount() > 0) {
                    tmFuncionario.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < funcionarios.size(); i++) {
                    endereco = funcionarios.get(i).getEndereco().getEnd_logradouro() + " - "
                            + funcionarios.get(i).getEndereco().getEnd_numero() + ". "
                            + funcionarios.get(i).getEndereco().getCidade().getCid_nome() + ", "
                            + funcionarios.get(i).getEndereco().getCidade().getEstado().getEst_sigla() + " - "
                            + funcionarios.get(i).getEndereco().getEnd_bairro() + ". CEP: "
                            + funcionarios.get(i).getEndereco().getEnd_cep() + " ("
                            + funcionarios.get(i).getEndereco().getEnd_complemento() + ").";

                    tmFuncionario.addRow(linha);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_nome(), i, 0);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_data_cadastro(), i, 1);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_ctps(), i, 2);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_cpf(), i, 3);
                    tmFuncionario.setValueAt(funcionarios.get(i).getFun_rg(), i, 4);
                    tmFuncionario.setValueAt(funcionarios.get(i).getTel_numero(), i, 5);
                    tmFuncionario.setValueAt(funcionarios.get(i).getCel_numero(), i, 6);
                    tmFuncionario.setValueAt(endereco, i, 7);
                }
           }catch(SQLException ex){
               
           }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JFormattedTextField jFTCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
