/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import connection.MySQL;
import entity.Jogo;
import entity.Locacao;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.TDBComboBox;
import model.TDBList;

/**
 *
 * @author Felipe Lima
 */
public class ViewCadastroLocacao extends javax.swing.JFrame {
    MySQL mysqldb = new MySQL();
    
    /**
     * Creates new form NewJFrame
     */
    public ViewCadastroLocacao() {
        initComponents();
        cbJogo.setEnabled(false);
        cbNome.setEnabled(false);
        
        TDBComboBox cbos = new TDBComboBox();
        
        cbos.setStatus(cbJogo, "cad_jogo", "nm_titulo", null);
        cbos.setStatus(cbNome, "locacao_cliente_jogo", "nm_cliente", null);
        
        TDBComboBox cbo = new TDBComboBox();
        TDBList lst = new TDBList();
        
        cbo.setStatus(cboStatus, "cad_status_locacao", "nm_status", "nm_status");
        cbo.setStatus(cboCliente,"cad_funcionario","nm_cliente","nm_cliente");
        cbo.setStatus(cboJogo,"cad_jogo","nm_titulo","nm_titulo");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboStatus = new javax.swing.JComboBox<>();
        txtLocado = new javax.swing.JFormattedTextField();
        txtDevolver = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cboJogo = new javax.swing.JComboBox<>();
        cboCliente = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();
        rbJogo = new javax.swing.JRadioButton();
        rbNome = new javax.swing.JRadioButton();
        cbJogo = new javax.swing.JComboBox<>();
        cbNome = new javax.swing.JComboBox<>();

        jLabel1.setText("Jogo");

        jLabel2.setText("Cliente");

        jLabel3.setText("Status");

        try {
            txtLocado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDevolver.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setText("Locado em:");

        jLabel5.setText("Devolver em:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mole.png"))); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboJogo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboStatus, 0, 250, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLocado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Alugar", jPanel1);

        tblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Jogo", "Data Locação", "Data Devolução", "Cliente"
            }
        ));
        jScrollPane1.setViewportView(tblConsulta);

        buttonGroup1.add(rbJogo);
        rbJogo.setText("Jogo:");
        rbJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJogoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNome);
        rbNome.setText("Nome:");
        rbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeActionPerformed(evt);
            }
        });

        cbJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJogoActionPerformed(evt);
            }
        });

        cbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(rbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbJogo)
                    .addComponent(rbNome)
                    .addComponent(cbJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    /** 
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            mysqldb.conectaBanco();
            Locacao nova_locacao = new Locacao();
            
            nova_locacao.setNmJogo((String)cboJogo.getSelectedItem());
            nova_locacao.setNmCliente((String)cboCliente.getSelectedItem());
            nova_locacao.setNmStatus((String)cboStatus.getSelectedItem());
            nova_locacao.setDtLocacao(txtLocado.getText());
            nova_locacao.setDtDevolucao(txtDevolver.getText());
            
            String query = 
                   "INSERT INTO locacao_cliente_jogo (nm_jogo,nm_cliente,nm_status,dt_locacao,dt_devolucao) "+
                   "VALUES ("
                   +"'"+nova_locacao.getNmJogo()     +"',"
                   +"'"+nova_locacao.getNmCliente()  +"',"
                   +"'"+nova_locacao.getNmStatus()   +"',"
                   +"'"+nova_locacao.getDtLocacao()  +"',"
                   +"'"+nova_locacao.getDtDevolucao()+"')";
            
            int status = 0;
            
            status = this.mysqldb.insertSQL(query);

            if (status == 1) {
                JOptionPane.showMessageDialog(rootPane, "Jogo alugado com sucesso!");
                cboJogo.setSelectedIndex(0);
                cboCliente.setSelectedIndex(0);
                cboStatus.setSelectedIndex(0);
                txtLocado.setText(null);
                txtDevolver.setText(null);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Houve problemas no cadastro do jogo. Revise os dados.");
            }
                   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar a locação");
        } finally {
           mysqldb.fechaBanco();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJogoActionPerformed
        // TODO add your handling code here:
        if (rbJogo.isSelected()) {
            cbJogo.setEnabled(true);
            cbNome.setEnabled(false);
        }
        
    }//GEN-LAST:event_rbJogoActionPerformed

    private void rbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeActionPerformed
        // TODO add your handling code here:
        if (rbNome.isSelected()) {
            cbNome.setEnabled(true);
            cbJogo.setEnabled(false);
        }
    }//GEN-LAST:event_rbNomeActionPerformed

    private void cbJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJogoActionPerformed
        String Jogo = (String) cbJogo.getSelectedItem();
        try {
            mysqldb.conectaBanco();
            Locacao nova_locacao = new Locacao();
            
            String query = 
                   "SELECT * FROM locacao_cliente_jogo WHERE nm_jogo = '" + Jogo + "'";
            
            this.mysqldb.executarSQL(query);
            
            DefaultTableModel modelo = (DefaultTableModel)tblConsulta.getModel();
            
            modelo.setNumRows(0);

            while (this.mysqldb.getResultSet().next()) {
                nova_locacao.setNmJogo(this.mysqldb.getResultSet().getString(2));
                nova_locacao.setDtLocacao(this.mysqldb.getResultSet().getString(5));
                nova_locacao.setDtDevolucao(this.mysqldb.getResultSet().getString(6));
                nova_locacao.setNmCliente(this.mysqldb.getResultSet().getString(3));
                
                modelo.addRow(new Object[]{nova_locacao.getNmJogo(),nova_locacao.getDtLocacao(),nova_locacao.getDtDevolucao(),nova_locacao.getNmCliente()});
                
                System.out.println(nova_locacao.getNmCliente());
            }
            
            
            
            
            
            
                   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Buscar a locação");
        } finally {
           mysqldb.fechaBanco();
        }
        
    }//GEN-LAST:event_cbJogoActionPerformed

    private void cbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeActionPerformed
        
        String Nome = (String) cbNome.getSelectedItem();
        try {
            mysqldb.conectaBanco();
            Locacao nova_locacao = new Locacao();
            
            String query = 
                   "SELECT * FROM locacao_cliente_jogo WHERE nm_cliente = '" + Nome + "'";
            
            this.mysqldb.executarSQL(query);
            
            DefaultTableModel modelo = (DefaultTableModel)tblConsulta.getModel();
            
            modelo.setNumRows(0);

            while (this.mysqldb.getResultSet().next()) {
                nova_locacao.setNmJogo(this.mysqldb.getResultSet().getString(2));
                nova_locacao.setDtLocacao(this.mysqldb.getResultSet().getString(5));
                nova_locacao.setDtDevolucao(this.mysqldb.getResultSet().getString(6));
                nova_locacao.setNmCliente(this.mysqldb.getResultSet().getString(3));
                
                modelo.addRow(new Object[]{nova_locacao.getNmJogo(),nova_locacao.getDtLocacao(),nova_locacao.getDtDevolucao(),nova_locacao.getNmCliente()});
                
                System.out.println(nova_locacao.getNmCliente());
            }           
                   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Buscar a locação");
        } finally {
           mysqldb.fechaBanco();
        }
        
    }//GEN-LAST:event_cbNomeActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadastroLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroLocacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbJogo;
    private javax.swing.JComboBox<String> cbNome;
    private javax.swing.JComboBox<String> cboCliente;
    private javax.swing.JComboBox<String> cboJogo;
    private javax.swing.JComboBox<String> cboStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton rbJogo;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JFormattedTextField txtDevolver;
    private javax.swing.JFormattedTextField txtLocado;
    // End of variables declaration//GEN-END:variables
}
