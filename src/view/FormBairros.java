/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BairrosDAO;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.Bairro;
import util.ConexaoBanco;
import util.ModeloTabela;
import util.UpperCaseField;

/**
 *
 * @author Escritorio
 */
public class FormBairros extends javax.swing.JDialog {
    private final DecimalFormat decimal = new DecimalFormat("0.00");
    private Bairro bairro = new Bairro();
    private final BairrosDAO bairroDAO = new BairrosDAO();
    private final ConexaoBanco conexao = new ConexaoBanco();
    
    /**
     * Creates new form FormBairros
     */
    public FormBairros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nomeBairro = new UpperCaseField();
        txt_valorBairro = new javax.swing.JTextField();
        bt_novo = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(170, 169, 149));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/goldFood.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CADASTRO DE BAIRROS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/map.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(64, 64, 64)))
                .addComponent(jLabel5)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados Cadastrais"));

        jLabel1.setText("NOME DO BAIRRO:");

        jLabel2.setText("VALOR DA ENTREGA:");

        txt_nomeBairro.setEnabled(false);
        txt_nomeBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nomeBairroKeyPressed(evt);
            }
        });

        txt_valorBairro.setEnabled(false);
        txt_valorBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_valorBairroKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_valorBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nomeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nomeBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_valorBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        bt_novo.setBackground(new java.awt.Color(170, 169, 149));
        bt_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add.png"))); // NOI18N
        bt_novo.setText("NOVO");
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        bt_salvar.setBackground(new java.awt.Color(170, 169, 149));
        bt_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save.png"))); // NOI18N
        bt_salvar.setText("SALVAR");
        bt_salvar.setEnabled(false);
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });
        bt_salvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bt_salvarKeyPressed(evt);
            }
        });

        bt_editar.setBackground(new java.awt.Color(170, 169, 149));
        bt_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Edit_text.png"))); // NOI18N
        bt_editar.setText("EDITAR");
        bt_editar.setEnabled(false);
        bt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editarActionPerformed(evt);
            }
        });

        bt_excluir.setBackground(new java.awt.Color(170, 169, 149));
        bt_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Eraser.png"))); // NOI18N
        bt_excluir.setText("EXCLUIR");
        bt_excluir.setEnabled(false);
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        bt_sair.setBackground(new java.awt.Color(170, 169, 149));
        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        bt_sair.setText("SAIR");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bt_novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_sair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_excluir)
                    .addComponent(bt_editar)
                    .addComponent(bt_salvar)
                    .addComponent(bt_novo)
                    .addComponent(bt_sair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void carregarBairro(String bairro){
        txt_nomeBairro.setText(bairro);
        ativarComponentes();
        txt_nomeBairro.requestFocus();
        bt_novo.setEnabled(false);
        bt_salvar.setEnabled(true);
        bt_editar.setEnabled(false);
        bt_excluir.setEnabled(false);
    }
    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        //função do botão novo
        ativarComponentes();
        txt_nomeBairro.requestFocus();
        bt_novo.setEnabled(false);
        bt_salvar.setEnabled(true);
        bt_editar.setEnabled(false);
        bt_excluir.setEnabled(false);
    }//GEN-LAST:event_bt_novoActionPerformed
    public void ativarComponentes(){
        txt_nomeBairro.setEnabled(true);
        txt_valorBairro.setEnabled(true);
    }
    public void desativarComponentes(){
        txt_nomeBairro.setEnabled(false);
        txt_valorBairro.setEnabled(false);
    }
    public void limparComponentes(){
        txt_nomeBairro.setText("");
        txt_valorBairro.setText("");
    }
    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        // funcão do botão salvar
        salvar();
        
        
    }//GEN-LAST:event_bt_salvarActionPerformed

    private void bt_salvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bt_salvarKeyPressed
        if (evt.getKeyCode() == 10){
            salvar();
        }
    }//GEN-LAST:event_bt_salvarKeyPressed
    public void salvar(){
        if(!txt_nomeBairro.getText().isEmpty()|| !txt_valorBairro.getText().isEmpty()){
             bairro.setNomeBairro(txt_nomeBairro.getText());
             bairro.setPrecoBairro(Double.parseDouble(txt_valorBairro.getText().replaceAll(",", ".")));
             bairroDAO.SalvarBairro(bairro);
             
             JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
             listarTabela();
             limparComponentes();
             desativarComponentes();
        }else{
            JOptionPane.showMessageDialog(this, "Preenche os campos Descrição e Preço");
        }
        bt_novo.setEnabled(true);
        bt_salvar.setEnabled(false);
    }
    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
        // evento para botão alterar
        String id = ""+tabela.getValueAt(tabela.getSelectedRow(), 0);

        try {
            conexao.conecta();
            conexao.executaSQL("select * from tb_bairros where codigo_bairro = '"+id +"'");
            conexao.rs.first();
            System.out.println(conexao.rs.first());
            bairro = new Bairro();

            bairro.setCodigoBairro(conexao.rs.getInt("codigo_bairro"));
            bairro.setNomeBairro(txt_nomeBairro.getText());
            bairro.setPrecoBairro(Double.parseDouble(txt_valorBairro.getText().replace(",", ".")));
           
            bairroDAO.alterarBairro(bairro);

            JOptionPane.showMessageDialog(this, "Cliente Alterado!");
            limparComponentes();
            listarTabela();

        } catch (SQLException ex) {
            Logger.getLogger(FormProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        desativarComponentes();
        limparComponentes();
    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        // evento para excluir
        String id = ""+tabela.getValueAt(tabela.getSelectedRow(), 0);
        if (JOptionPane.showConfirmDialog(this, "Deseja Excluir o bairro Selecionado?","Gold Food",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){

        try {
            conexao.conecta();

            conexao.executaSQL("select * from tb_bairros where codigo_bairro = '"+id +"'");
            conexao.rs.first();
            bairro.setCodigoBairro(conexao.rs.getInt("codigo_bairro"));
            bairroDAO.excluirBairro(bairro);
            JOptionPane.showMessageDialog(this, "Bairro Excluido!");
            limparComponentes();
            listarTabela();

        } catch (SQLException ex) {
            Logger.getLogger(FormBairros.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        //sair da tela
        desativarComponentes();
        bt_novo.setEnabled(true);
        limparComponentes();
        this.dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        ativarComponentes();
        String id = ""+tabela.getValueAt(tabela.getSelectedRow(), 0);
        conexao.conecta();
       
        conexao.executaSQL("select * from tb_bairros where codigo_bairro = '"+id +"'");
        bt_editar.setEnabled(true);
        bt_excluir.setEnabled(true);
        try {
            conexao.rs.first();
            txt_nomeBairro.setText(conexao.rs.getString("nome_bairro"));
            txt_valorBairro.setText(String.valueOf(decimal.format(conexao.rs.getDouble("preco_bairro"))));
                
            
        } catch (SQLException ex) {
            Logger.getLogger(FormBairros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void txt_nomeBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nomeBairroKeyPressed
         if (evt.getKeyCode() == 10){
           txt_valorBairro.requestFocus();
        }
    }//GEN-LAST:event_txt_nomeBairroKeyPressed

    private void txt_valorBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valorBairroKeyPressed
         if (evt.getKeyCode() == 10){
           bt_salvar.requestFocus();
        }
    }//GEN-LAST:event_txt_valorBairroKeyPressed
    public void listarTabela(){
        String sql = "SELECT * FROM tb_bairros";
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[]{"Código","Nome do Bairro","Valor da entrega"};
        conexao.conecta();
        conexao.executaSQL(sql);
        
               
        try {
            conexao.rs.first();
            do{
                dados.add(new Object[]{
                                                       conexao.rs.getInt("codigo_bairro"),
                                                       conexao.rs.getString("nome_bairro"),
                                                       String.valueOf(decimal.format(conexao.rs.getDouble("preco_bairro"))),
                                                       });
            
            }while(conexao.rs.next());
        } catch (SQLException ex) {
            System.out.println("Erro ao Preencher a Tabela"+ ex);
        }
         ModeloTabela modelo = new ModeloTabela(dados, Colunas);
         tabela.setModel(modelo);
         tabela.getColumnModel().getColumn(0).setPreferredWidth(80);
         tabela.getColumnModel().getColumn(0).setResizable(false);
         tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
         tabela.getColumnModel().getColumn(1).setResizable(false);
         tabela.getColumnModel().getColumn(2).setPreferredWidth(300);
         tabela.getColumnModel().getColumn(2).setResizable(false);
         
                             
         tabela.getTableHeader().setReorderingAllowed(false);
         tabela.setAutoResizeMode( tabela.AUTO_RESIZE_OFF);
         tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     
       
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBairros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBairros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBairros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBairros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormBairros dialog = new FormBairros(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txt_nomeBairro;
    private javax.swing.JTextField txt_valorBairro;
    // End of variables declaration//GEN-END:variables
}