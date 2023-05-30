/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.ClientesDAO;
import controller.UsuariosDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.Usuario;
import util.ConexaoBanco;
import util.ModeloTabela;
import util.UpperCaseField;

/**
 *
 * @author Escritorio
 */
public class FormUsuarios extends javax.swing.JFrame {
    private Usuario usuario = new Usuario();
    private final UsuariosDAO uDAO = new UsuariosDAO();
    private final ConexaoBanco conexao = new ConexaoBanco();
    /** Creates new form formDelivery */
    public FormUsuarios() {
        initComponents();
        listarTabela();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbl_icone = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbSair = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_nome = new UpperCaseField();
        txt_endereco = new UpperCaseField();
        txt_numero = new javax.swing.JTextField();
        txt_complemento = new UpperCaseField();
        txt_bairro = new UpperCaseField();
        txt_telefone = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txp_senha = new javax.swing.JPasswordField();
        rb_sim = new javax.swing.JRadioButton();
        rb_nao = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txt_usuario = new UpperCaseField();
        jLabel9 = new javax.swing.JLabel();
        cb_tipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        bt_novo = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        bt_editar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(170, 169, 149));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lbl_icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/goldFood.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastro de Funcionários");

        lbSair.setToolTipText("");
        lbSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSairMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esfihas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_icone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lbSair)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbl_icone)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados do Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("NOME:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("TELEFONE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("END:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nº");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("COMP:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("BAIRRO");

        txt_nome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_nome.setEnabled(false);

        txt_endereco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_endereco.setEnabled(false);

        txt_numero.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_numero.setEnabled(false);

        txt_complemento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_complemento.setEnabled(false);

        txt_bairro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_bairro.setEnabled(false);
        txt_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bairroActionPerformed(evt);
            }
        });

        txt_telefone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_telefone.setEnabled(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Usuário do Sistema?"));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("SENHA:");

        txp_senha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txp_senha.setEnabled(false);

        buttonGroup1.add(rb_sim);
        rb_sim.setText("SIM");
        rb_sim.setEnabled(false);
        rb_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_simActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_nao);
        rb_nao.setSelected(true);
        rb_nao.setText("Não");
        rb_nao.setEnabled(false);
        rb_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_naoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("USUÁRIO:");

        txt_usuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_usuario.setEnabled(false);
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 115, Short.MAX_VALUE)
                .addComponent(rb_sim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rb_nao)
                .addGap(82, 82, 82))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txp_senha)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_sim)
                    .addComponent(rb_nao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txp_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(32, 32, 32))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("TIPO:");

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Caixa" }));
        cb_tipo.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

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

        bt_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Add.png"))); // NOI18N
        bt_novo.setText("NOVO");
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        bt_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save.png"))); // NOI18N
        bt_salvar.setText("SALVAR");
        bt_salvar.setEnabled(false);
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });

        bt_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Edit_text.png"))); // NOI18N
        bt_editar.setText("EDITAR");
        bt_editar.setEnabled(false);
        bt_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editarActionPerformed(evt);
            }
        });

        bt_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Eraser.png"))); // NOI18N
        bt_excluir.setText("EXCLUIR");
        bt_excluir.setEnabled(false);
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        bt_sair.setText("SAIR");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_editar)
                        .addGap(10, 10, 10)
                        .addComponent(bt_excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_sair))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_salvar)
                    .addComponent(bt_editar)
                    .addComponent(bt_excluir)
                    .addComponent(bt_sair)
                    .addComponent(bt_novo))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairMouseClicked
        
    }//GEN-LAST:event_lbSairMouseClicked

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
        //sair da tela
        this.dispose();
    }//GEN-LAST:event_bt_sairActionPerformed

    private void txt_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bairroActionPerformed

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
         // funcão do botão salvar
        salvar();
        desativarComponentes();
        limparComponentes();
    }//GEN-LAST:event_bt_salvarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed
        // Funcão do botão excluir
         String id = ""+tabela.getValueAt(tabela.getSelectedRow(), 0);
          
    try {
            conexao.conecta();
                        
            conexao.executaSQL("select * from tb_usuarios where codigo = '"+id +"'");
            conexao.rs.first();
            usuario.setCodigo(conexao.rs.getInt("codigo"));
            uDAO.excluirUsuarios(usuario);
            JOptionPane.showMessageDialog(null, "Cliente Excluido!");
            
            listarTabela();
    
            
        } catch (SQLException ex) {
            Logger.getLogger(FormProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_bt_excluirActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
         //Carregar os componentes quanto clicar na linha da tabela
        ativarComponentes();
        String id = ""+tabela.getValueAt(tabela.getSelectedRow(), 0);
        conexao.conecta();
       
        conexao.executaSQL("select * from tb_usuarios where codigo = '"+id +"'");
        bt_editar.setEnabled(true);
        bt_excluir.setEnabled(true);
        try {
            conexao.rs.first();
            txt_nome.setText(conexao.rs.getString("nome"));
            txt_endereco.setText(conexao.rs.getString("endereco"));
            txt_numero.setText(String.valueOf(conexao.rs.getInt("numero")));
            txt_complemento.setText(conexao.rs.getString("complemento"));
            txt_bairro.setText(conexao.rs.getString("bairro"));
            txt_telefone.setText(conexao.rs.getString("telefone"));
            cb_tipo.setSelectedItem(conexao.rs.getString("tipo"));
            txp_senha.setText(conexao.rs.getString("senha"));
            txt_usuario.setText(conexao.rs.getString("usuario"));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FormProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void bt_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editarActionPerformed
           // evento para botão alterar
         String id = ""+tabela.getValueAt(tabela.getSelectedRow(), 0);
                         
    try {
            conexao.conecta();
            conexao.executaSQL("select * from tb_usuarios where codigo = '"+id +"'");
            conexao.rs.first();
            usuario = new Usuario();
            
            usuario.setCodigo(conexao.rs.getInt("codigo"));
            usuario.setNome(txt_nome.getText());
            usuario.setEndereco(txt_endereco.getText());
            usuario.setNumero(Integer.parseInt(txt_numero.getText()));
            usuario.setComplemento(txt_complemento.getText());
            usuario.setBairro(txt_bairro.getText());
            usuario.setTelefone(txt_telefone.getText());
            usuario.setTipo((String)cb_tipo.getSelectedItem());
            usuario.setUsuario(txt_usuario.getText());
            usuario.setSenha(String.valueOf(txp_senha.getPassword()));
            uDAO.alterarUsuarios(usuario);
            
            JOptionPane.showMessageDialog(null, "Cliente Alterado!");
            
            listarTabela();
            
        } catch (SQLException ex) {
            Logger.getLogger(FormProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
       desativarComponentes();
       limparComponentes();
    }//GEN-LAST:event_bt_editarActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        //função do botão novo
        ativarComponentes();
        txt_nome.requestFocus();
        bt_novo.setEnabled(false);
        bt_salvar.setEnabled(true);
    }//GEN-LAST:event_bt_novoActionPerformed

    private void rb_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_simActionPerformed
        //Ativar caixa de usuarios
        txt_usuario.setEnabled(true);
        txp_senha.setEnabled(true);
    }//GEN-LAST:event_rb_simActionPerformed

    private void rb_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_naoActionPerformed
        //Ativar caixa de usuarios
        txt_usuario.setEnabled(false);
        txp_senha.setEnabled(false);
    }//GEN-LAST:event_rb_naoActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed
     public void salvar(){
        if(!txt_nome.getText().isEmpty()|| !txt_telefone.getText().isEmpty()
                || !txt_endereco.getText().isEmpty()){
             usuario = new Usuario();
             usuario.setNome(txt_nome.getText());
             usuario.setTelefone(txt_telefone.getText());
             usuario.setEndereco(txt_endereco.getText());
             usuario.setNumero(Integer.parseInt(txt_numero.getText()));
             usuario.setComplemento(txt_complemento.getText());
             usuario.setBairro(txt_bairro.getText());
             usuario.setTipo((String)cb_tipo.getSelectedItem());
             usuario.setSenha(String.valueOf(txp_senha.getPassword()));
             usuario.setUsuario(txt_usuario.getText());
             uDAO.SalvarUsuarios(usuario);
             listarTabela();
            
        }else{
            JOptionPane.showMessageDialog(null, "Preenche os campos Descrição e Preço");
        }
        bt_novo.setEnabled(true);
        bt_salvar.setEnabled(false);
    }
     public final void listarTabela(){
        String sql = "SELECT * FROM tb_usuarios";
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[]{"Código","Nome","Telefone","Endereço"};
        conexao.conecta();
        conexao.executaSQL(sql);
        
               
        try {
            conexao.rs.first();
            do{
                dados.add(new Object[]{
                                                       conexao.rs.getInt("codigo"),
                                                       conexao.rs.getString("nome"),
                                                       conexao.rs.getString("telefone"),
                                                       conexao.rs.getString("endereco")
                                                               +" nº "+
                                                       conexao.rs.getString("numero")
                                                               +" - "+
                                                       conexao.rs.getString("bairro"),
                                                       });
            
            }while(conexao.rs.next());
        } catch (SQLException ex) {
            System.out.println("Erro ao Preencher a Tabela"+ ex);
        }
         ModeloTabela modelo = new ModeloTabela(dados, Colunas);
         tabela.setModel(modelo);
         tabela.getColumnModel().getColumn(0).setPreferredWidth(80);
         tabela.getColumnModel().getColumn(0).setResizable(false);
         tabela.getColumnModel().getColumn(1).setPreferredWidth(300);
         tabela.getColumnModel().getColumn(1).setResizable(false);
         tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
         tabela.getColumnModel().getColumn(2).setResizable(false);
         tabela.getColumnModel().getColumn(3).setPreferredWidth(400);
         tabela.getColumnModel().getColumn(3).setResizable(false);
                             
         tabela.getTableHeader().setReorderingAllowed(false);
         tabela.setAutoResizeMode( tabela.AUTO_RESIZE_OFF);
         tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     
       
     }
      public void ativarComponentes(){
        //Ativar as caixas
        txt_nome.setEnabled(true);
        txt_telefone.setEnabled(true);
        txt_endereco.setEnabled(true);
        txt_numero.setEnabled(true);
        txt_complemento.setEnabled(true);
        txt_bairro.setEnabled(true);
        cb_tipo.setEnabled(true);
        rb_nao.setEnabled(true);
        rb_sim.setEnabled(true);
    }
    public void desativarComponentes(){
        //Desativar as caixas
        txt_nome.setEnabled(false);
        txt_telefone.setEnabled(false);
        txt_endereco.setEnabled(false);
        txt_numero.setEnabled(false);
        txt_complemento.setEnabled(false);
        txt_bairro.setEnabled(false);
        cb_tipo.setEnabled(false);
        rb_nao.setEnabled(false);
        rb_sim.setEnabled(false);
        txt_usuario.setEnabled(false);
        txp_senha.setEnabled(false);
    }
    public void limparComponentes(){
        //limpar as caixas
        txt_nome.setText("");
        txt_telefone.setText("");
        txt_endereco.setText("");
        txt_numero.setText("");
        txt_complemento.setText("");
        txt_bairro.setText("");
        txp_senha.setText("");
        txt_usuario.setText("");
        txp_senha.setText("");
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
            java.util.logging.Logger.getLogger(FormUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton bt_salvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbSair;
    private javax.swing.JLabel lbl_icone;
    private javax.swing.JRadioButton rb_nao;
    private javax.swing.JRadioButton rb_sim;
    private javax.swing.JTable tabela;
    private javax.swing.JPasswordField txp_senha;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JFormattedTextField txt_telefone;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

}
