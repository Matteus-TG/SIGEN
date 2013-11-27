/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import DAO.ProprietarioDAO;
import DAO.TumuloDAO;
import DAO.VendaDAO;
import Modelo.Chapas;
import Modelo.Letras;
import Modelo.Proprietarios;
import Modelo.Quadras;
import Modelo.Vendas;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class CadastrarVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastrar_Venda
     */
    VendaDAO vdao;
    TumuloDAO tdao;
    List<Quadras> tumulosQuadras;
    List<Chapas> tumulosChapas;
    List<Letras> tumulosLetras;
    List<Proprietarios> proprietarios;
    ProprietarioDAO pdao;
    List<Vendas> vendas; //List de uma classe do modelo para utilização na tabela;
    ListSelectionModel lsmVenda;
    DefaultTableModel tmVenda = new DefaultTableModel(null, new String[]{"Nome", "CPF", "RG"});
    //definição das colunas da tabela

    public CadastrarVenda() {
        super("SIGEN - Cadastro das Vendas de Túmulos");
        initComponents();
        preencheQuadra();
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

        jLCliente = new javax.swing.JLabel();
        jLQuadra = new javax.swing.JLabel();
        jLChapa = new javax.swing.JLabel();
        jLLetra = new javax.swing.JLabel();
        jLData = new javax.swing.JLabel();
        jTCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jCBQuadra = new javax.swing.JComboBox();
        jCBLetra = new javax.swing.JComboBox();
        jCBChapa = new javax.swing.JComboBox();
        jLCabecalho = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jDCData = new com.toedter.calendar.JDateChooser();
        jLEmpresa = new javax.swing.JLabel();
        jLVersao = new javax.swing.JLabel();

        setClosable(true);

        jLCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLCliente.setText("Cliente:");

        jLQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLQuadra.setText("Quadra:");

        jLChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLChapa.setText("Letra:");

        jLLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLLetra.setText("Chapa:");

        jLData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLData.setText("Data da Venda:");

        jTCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTClienteKeyTyped(evt);
            }
        });

        tabela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabela.setModel(tmVenda);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jCBQuadra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBQuadraActionPerformed(evt);
            }
        });

        jCBLetra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCBLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBLetraActionPerformed(evt);
            }
        });

        jCBChapa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLCabecalho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLCabecalho.setText("Cadastro de Vendas");

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

        jDCData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLEmpresa.setText("NBNG. Todos os direitos reservados.");

        jLVersao.setText("Versão: 1.4.6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLCabecalho))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBCadastrar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBLimpar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTCliente))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLVersao))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCadastrar, jBLimpar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCBChapa, jCBLetra, jCBQuadra});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCabecalho)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCliente)
                    .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuadra)
                    .addComponent(jLChapa)
                    .addComponent(jLLetra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLData)
                    .addComponent(jDCData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
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

    private void jTClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTClienteKeyTyped
        try {
            pdao = new ProprietarioDAO();
            proprietarios = pdao.getVenda("%" + jTCliente.getText() + "%");
            while (tmVenda.getRowCount() > 0) {
                tmVenda.removeRow(0);
            }
            String[] linha = new String[]{null, null, null, null};
            for (int i = 0; i < proprietarios.size(); i++) {
                tmVenda.addRow(linha);
                tmVenda.setValueAt(proprietarios.get(i).getPro_nome(), i, 0);
                tmVenda.setValueAt(proprietarios.get(i).getPro_cpf(), i, 1);
                tmVenda.setValueAt(proprietarios.get(i).getPro_rg(), i, 2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
        }
    }//GEN-LAST:event_jTClienteKeyTyped

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        jTCliente.setText(proprietarios.get(tabela.getSelectedRow()).getPro_nome());
    }//GEN-LAST:event_tabelaMouseClicked

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        try {
            Vendas venda = new Vendas();
            Proprietarios proprietario = new Proprietarios();
            Chapas chapa = new Chapas();
            tdao = new TumuloDAO();
            vdao = new VendaDAO();
            chapa.setCodigo(tdao.getTomb(String.valueOf(jCBQuadra.getSelectedItem()),
                    String.valueOf(jCBLetra.getSelectedItem()),
                    String.valueOf(jCBChapa.getSelectedItem())));

            if (verifica(jTCliente.getText(), jDCData.getDate())) {
                proprietario.setPro_codigo(proprietarios.get(tabela.getSelectedRow()).getPro_codigo());
                venda.setProprietario(proprietario);
                venda.setChapa(chapa);
                venda.setVen_data(jDCData.getDate());
                vdao.adicionar(venda);
                tdao.sellTomb(venda.getProprietario().getPro_codigo(), venda.getChapa().getCodigo());
                JOptionPane.showMessageDialog(null, "Venda efetuada com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Dados obrigatórios (campos em negrito) faltando, por favor preencher corretamente.");
            }
            jCBLetra.removeAllItems();
            jCBChapa.removeAllItems();
            jCBQuadra.removeAllItems();
            tdao = new TumuloDAO();
            tumulosQuadras = tdao.listarQuadras();
            for (int i = 0; i < tumulosQuadras.size(); i++) {
                jCBQuadra.addItem(tumulosQuadras.get(i).getQuadra());
            }
            limpar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: \n" + ex);
        }
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jCBQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBQuadraActionPerformed
        preencheLetra();
    }//GEN-LAST:event_jCBQuadraActionPerformed

    private void jCBLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBLetraActionPerformed
        preencheChapa();
    }//GEN-LAST:event_jCBLetraActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JComboBox jCBChapa;
    private javax.swing.JComboBox jCBLetra;
    private javax.swing.JComboBox jCBQuadra;
    private com.toedter.calendar.JDateChooser jDCData;
    private javax.swing.JLabel jLCabecalho;
    private javax.swing.JLabel jLChapa;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLLetra;
    private javax.swing.JLabel jLQuadra;
    private javax.swing.JLabel jLVersao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        //metodo utilizado para limpar os campos de preencimento
        jTCliente.setText(""); //limpa o nome do cliente

        while (tmVenda.getRowCount() > 0) { //while para tirar todas as linhas (limpar) da tabela
            tmVenda.removeRow(0);
        }
        jDCData.setDate(null);
        vendas = null;
        preencheChapa();
    }

    private boolean verifica(String cliente, Date data) {
        if ((cliente.equals("")) || data == null) {
            return false;
        } else {
            return true;
        }
    }

    private void preencheQuadra() {

        jCBLetra.removeAllItems();
        jCBChapa.removeAllItems();
        jCBQuadra.removeAllItems();
        tdao = new TumuloDAO();
        tumulosQuadras = tdao.listarQuadras();
        for (int i = 0; i < tumulosQuadras.size(); i++) {
            jCBQuadra.addItem(tumulosQuadras.get(i).getQuadra());
        }
    }

    private void preencheLetra() {
        jCBLetra.removeAllItems();
        tdao = new TumuloDAO();

        String aux = String.valueOf(jCBQuadra.getSelectedItem());
        tumulosLetras = tdao.listarLetras(aux);
        for (int i = 0; i < tumulosLetras.size(); i++) {
            jCBLetra.addItem(tumulosLetras.get(i).getLetra());
        }
    }

    private void preencheChapa() {
        String aux = String.valueOf(jCBQuadra.getSelectedItem());
        String aux2 = String.valueOf(jCBLetra.getSelectedItem());
        jCBChapa.removeAllItems();
        tdao = new TumuloDAO();
        tumulosChapas = tdao.listarChapas(tdao.pegaIDLetra(aux, aux2), aux);
        for (int i = 0; i < tumulosChapas.size(); i++) {
            jCBChapa.addItem(tumulosChapas.get(i).getChapa());
        }
    }
}