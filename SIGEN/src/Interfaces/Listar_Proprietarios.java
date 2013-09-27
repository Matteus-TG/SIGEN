package Interfaces;

import DAO.ProprietarioDAO;
import Modelo.Proprietarios;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author user
 */
public class Listar_Proprietarios extends javax.swing.JInternalFrame {

    ProprietarioDAO pdao;
    List<Proprietarios> proprietarios;//List de uma classe do modelo para utilização na tabela;
    DefaultTableModel tmProprietario = new DefaultTableModel(null, new String[]{"Nome", "CPF", "RG", "Telefone", "Celular", "Endereço"});
    //definição das colunas da tabela

    public Listar_Proprietarios() throws ParseException {
        super("SIGEN - Listagem de Proprietários");
        initComponents();
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

        jLCabecalho = new javax.swing.JLabel();
        jRBNome = new javax.swing.JRadioButton();
        jTNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLDireitos = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();
        jBExcluir = new javax.swing.JButton();
        jBAtualizar = new javax.swing.JButton();
        jLCPF = new javax.swing.JLabel();
        jFTCPF = new javax.swing.JFormattedTextField();
        jBPesquisar = new javax.swing.JButton();

        setClosable(true);

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Listagem de Proprietários");

        jRBNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRBNome.setText("Nome:");
        jRBNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNomeActionPerformed(evt);
            }
        });

        jTNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomeActionPerformed(evt);
            }
        });
        jTNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNomeKeyTyped(evt);
            }
        });

        tabela.setModel(tmProprietario);
        jScrollPane1.setViewportView(tabela);

        jLDireitos.setText("VL Solutions. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        jBExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/excluir.gif"))); // NOI18N
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBAtualizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        jBAtualizar.setText("Atualizar");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarActionPerformed(evt);
            }
        });

        jLCPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCPF.setText("CPF:");

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
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBExcluir)
                            .addComponent(jBAtualizar)))
                    .addComponent(jLCabecalho)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBNome)
                            .addComponent(jLCPF, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jFTCPF)
                                .addGap(18, 18, 18)
                                .addComponent(jBPesquisar))
                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLDireitos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAtualizar, jBExcluir});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar)
                    .addComponent(jLCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBNome)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDireitos)
                            .addComponent(jLVersao)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAtualizar)
                        .addGap(9, 9, 9)
                        .addComponent(jBExcluir)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNomeActionPerformed
        if (jRBNome.isSelected()) {
            try {
                jRBNome.setSelected(true);
                jFTCPF.setText("");

                pdao = new ProprietarioDAO();
                proprietarios = pdao.listarNome("%" + jTNome.getText() + "%");

                String endereco;

                while (tmProprietario.getRowCount() > 0) {
                    tmProprietario.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < proprietarios.size(); i++) {
                    endereco = proprietarios.get(i).getEndereco().getEnd_logradouro() + " - "
                            + proprietarios.get(i).getEndereco().getEnd_numero() + ". "
                            + proprietarios.get(i).getEndereco().getCidade().getCid_nome() + ", "
                            + proprietarios.get(i).getEndereco().getCidade().getEstado().getEst_sigla() + " - "
                            + proprietarios.get(i).getEndereco().getEnd_bairro() + ". CEP: "
                            + proprietarios.get(i).getEndereco().getEnd_cep() + " ("
                            + proprietarios.get(i).getEndereco().getEnd_complemento() + ").";

                    tmProprietario.addRow(linha);
                    tmProprietario.setValueAt(proprietarios.get(i).getPro_nome(), i, 0);
                    tmProprietario.setValueAt(proprietarios.get(i).getPro_cpf(), i, 1);
                    tmProprietario.setValueAt(proprietarios.get(i).getPro_rg(), i, 2);
                    tmProprietario.setValueAt(proprietarios.get(i).getTel_numero(), i, 3);
                    tmProprietario.setValueAt(proprietarios.get(i).getCel_numero(), i, 4);
                    tmProprietario.setValueAt(endereco, i, 5);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Listar_Proprietarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jRBNomeActionPerformed

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed
        if (jRBNome.isSelected()) {
            try {
                jRBNome.setSelected(true);
                jFTCPF.setText("");

                pdao = new ProprietarioDAO();
                proprietarios = pdao.listarNome("%" + jTNome.getText() + "%");

                String endereco;

                while (tmProprietario.getRowCount() > 0) {
                    tmProprietario.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < proprietarios.size(); i++) {
                    endereco = proprietarios.get(i).getEndereco().getEnd_logradouro() + " - "
                            + proprietarios.get(i).getEndereco().getEnd_numero() + ". "
                            + proprietarios.get(i).getEndereco().getCidade().getCid_nome() + ", "
                            + proprietarios.get(i).getEndereco().getCidade().getEstado().getEst_sigla() + " - "
                            + proprietarios.get(i).getEndereco().getEnd_bairro() + ". CEP: "
                            + proprietarios.get(i).getEndereco().getEnd_cep() + " ("
                            + proprietarios.get(i).getEndereco().getEnd_complemento() + ").";

                    tmProprietario.addRow(linha);
                    tmProprietario.setValueAt(proprietarios.get(i).getPro_nome(), i, 0);
                    tmProprietario.setValueAt(proprietarios.get(i).getPro_cpf(), i, 1);
                    tmProprietario.setValueAt(proprietarios.get(i).getPro_rg(), i, 2);
                    tmProprietario.setValueAt(proprietarios.get(i).getTel_numero(), i, 3);
                    tmProprietario.setValueAt(proprietarios.get(i).getCel_numero(), i, 4);
                    tmProprietario.setValueAt(endereco, i, 5);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Listar_Proprietarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTNomeActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        int pergunta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este Cliente?\n");
        if (pergunta == 0) {//clicou em sim  
            try {
                pdao = new ProprietarioDAO();
                pdao.remover(proprietarios.get(tabela.getSelectedRow()).getPro_codigo());
                JOptionPane.showMessageDialog(null, "Cliente deletado com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro:\n" + ex);
            }
        }
        while (tmProprietario.getRowCount() > 0) {
            tmProprietario.removeRow(0);
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jTNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomeKeyTyped
        if (jRBNome.isSelected()) {
            try {
                jRBNome.setSelected(true);
                jFTCPF.setText("");

                pdao = new ProprietarioDAO();
                proprietarios = pdao.listarNome("%" + jTNome.getText() + "%");

                String endereco;

                while (tmProprietario.getRowCount() > 0) {
                    tmProprietario.removeRow(0);
                }

                String[] linha = new String[]{null, null, null, null};
                for (int i = 0; i < proprietarios.size(); i++) {
                    endereco = proprietarios.get(i).getEndereco().getEnd_logradouro() + " - "
                            + proprietarios.get(i).getEndereco().getEnd_numero() + ". "
                            + proprietarios.get(i).getEndereco().getCidade().getCid_nome() + ", "
                            + proprietarios.get(i).getEndereco().getCidade().getEstado().getEst_sigla() + " - "
                            + proprietarios.get(i).getEndereco().getEnd_bairro() + ". CEP: "
                            + proprietarios.get(i).getEndereco().getEnd_cep() + " ("
                            + proprietarios.get(i).getEndereco().getEnd_complemento() + ").";

                    tmProprietario.addRow(linha);
                    tmProprietario.setValueAt(proprietarios.get(i).getPro_nome(), i, 0);
                    tmProprietario.setValueAt(proprietarios.get(i).getPro_cpf(), i, 1);
                    tmProprietario.setValueAt(proprietarios.get(i).getPro_rg(), i, 2);
                    tmProprietario.setValueAt(proprietarios.get(i).getTel_numero(), i, 3);
                    tmProprietario.setValueAt(proprietarios.get(i).getCel_numero(), i, 4);
                    tmProprietario.setValueAt(endereco, i, 5);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Listar_Proprietarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTNomeKeyTyped

    private void jBAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarActionPerformed
        try {
            if (tabela.getSelectedRowCount() < 1) {
                JOptionPane.showMessageDialog(null, "Selecione um cadastro a ser alterado.");
            } else {
                try {
                    Alterar_Proprietario ap = new Alterar_Proprietario(proprietarios.get(tabela.getSelectedRow()).getPro_codigo());
                    ap.setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(Listar_Proprietarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }
// Variables declaration - do not modify//GEN-LAST:event_jBAtualizarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            while (tmProprietario.getRowCount() > 0) {
                tmProprietario.removeRow(0);
            }
            jRBNome.setSelected(false);
            jTNome.setText("");
            pdao = new ProprietarioDAO();
            Proprietarios proprietario = pdao.listarCPF(jFTCPF.getText());

            tmProprietario.addRow(new String[]{null, null, null, null});
            tmProprietario.setValueAt(proprietario.getPro_nome(), 0, 0);
            tmProprietario.setValueAt(proprietario.getPro_cpf(), 0, 1);
            tmProprietario.setValueAt(proprietario.getPro_rg(), 0, 2);
            tmProprietario.setValueAt(proprietario.getTel_numero(), 0, 3);
            tmProprietario.setValueAt(proprietario.getCel_numero(), 0, 4);
            tmProprietario.setValueAt(proprietario.getEndereco().getEnd_logradouro() + " - "
                    + proprietario.getEndereco().getEnd_numero() + ". "
                    + proprietario.getEndereco().getCidade().getCid_nome() + ", "
                    + proprietario.getEndereco().getCidade().getEstado().getEst_sigla() + " - "
                    + proprietario.getEndereco().getEnd_bairro() + ". CEP: "
                    + proprietario.getEndereco().getEnd_cep() + " ("
                    + proprietario.getEndereco().getEnd_complemento() + ").", 0, 5);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JFormattedTextField jFTCPF;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLDireitos;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JRadioButton jRBNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
