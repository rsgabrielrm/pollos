/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholab1;

import Banco.Conector;
import Banco.PedidosDB;
import javax.swing.JOptionPane;

/**
 *
 * @author gabrielrm
 */
public class novoPedido extends javax.swing.JFrame {

    /**
     * Creates new form NovoPedido
     */
    public novoPedido() {
        initComponents();
        // Para fechar a janela e não o sistema
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );  
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFormCodigoCliente = new javax.swing.JTextField();
        jTextFieldFormCodigoProduto = new javax.swing.JTextField();
        jTextFieldFormQuantidadeCombo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextFieldFormObservacoes = new javax.swing.JTextArea();
        jButtonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Novo Pedido");

        jLabel2.setText("Código do Cliente:");

        jLabel3.setText("Código do Produto:");

        jLabel4.setText("Quantidade:");

        jLabel5.setText("Observações:");

        jTextFieldFormCodigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormCodigoClienteActionPerformed(evt);
            }
        });

        jTextFieldFormCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormCodigoProdutoActionPerformed(evt);
            }
        });

        jTextFieldFormQuantidadeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFormQuantidadeComboActionPerformed(evt);
            }
        });

        jTextFieldFormObservacoes.setColumns(20);
        jTextFieldFormObservacoes.setRows(5);
        jScrollPane1.setViewportView(jTextFieldFormObservacoes);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldFormCodigoCliente)
                            .addComponent(jTextFieldFormCodigoProduto)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFormQuantidadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jButtonCadastrar)
                        .addGap(75, 75, 75)))
                .addGap(101, 135, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldFormCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldFormCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldFormQuantidadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFormCodigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormCodigoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFormCodigoClienteActionPerformed

    private void jTextFieldFormCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFormCodigoProdutoActionPerformed

    private void jTextFieldFormQuantidadeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFormQuantidadeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFormQuantidadeComboActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
         Conector db = new Conector();
        // Aqui chamamos a classe DadosPeidos e atribuimos a pedidos
        PedidosDB pedidos = new PedidosDB(db);
        // Declaramos as variáveis e pegamos os valores dos campos com o método getText
        // Como codigoCliente,codigoProduto e quantidadeConbo é um inteiro parseamos o valor do campo que é texto para inteiro
        int codigoCliente = Integer.parseInt(jTextFieldFormCodigoCliente.getText());
        int codigoProduto = Integer.parseInt(jTextFieldFormCodigoProduto.getText());
        int quantidadeConbo = Integer.parseInt(jTextFieldFormQuantidadeCombo.getText());
        String observacoes = jTextFieldFormObservacoes.getText();
        // Declaramos uma variável para pegar o retorno da chamada da função que fica dentro da classe DadosPedidos
        String retorno = pedidos.cadastraPedidos(codigoCliente,  codigoProduto,  quantidadeConbo,  observacoes);
        // Imprimimos na tela a mensagem de retorno
        JOptionPane.showMessageDialog(null, retorno);
          //Chamamos nosso jframe e atribuimos a form
        listaPedidos form = new listaPedidos();
        //Aqui setamos para abrir no centro quando aberto
        form.setLocationRelativeTo(null);
        //Deixamos o jframe visivel
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(novoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(novoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(novoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(novoPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new novoPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldFormCodigoCliente;
    private javax.swing.JTextField jTextFieldFormCodigoProduto;
    private javax.swing.JTextArea jTextFieldFormObservacoes;
    private javax.swing.JTextField jTextFieldFormQuantidadeCombo;
    // End of variables declaration//GEN-END:variables
}
