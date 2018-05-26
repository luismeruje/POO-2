/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafactura;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author utilizador
 */
public class RegistarContribuinteColetivo extends javax.swing.JFrame {
    JavaFactura javaFactura;
    Login returnPage;
    /**
     * Creates new form RegistarContribuinteColetivo
     * @param javaFactura instância da classe central.
     */
    public RegistarContribuinteColetivo(JavaFactura javaFactura, Login returnPage) {
        initComponents();
        this.javaFactura = javaFactura;
        this.setLocationRelativeTo(null);
        this.returnPage = returnPage;
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        textFieldNome = new javax.swing.JTextField();
        textFieldNIF = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldMorada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        checkBoxRestauracao = new javax.swing.JCheckBox();
        checkBoxSaude = new javax.swing.JCheckBox();
        checkBoxEducacao = new javax.swing.JCheckBox();
        checkBoxHabitacao = new javax.swing.JCheckBox();
        checkBoxDespesasFamiliares = new javax.swing.JCheckBox();
        ButtonVoltar = new javax.swing.JButton();
        ButtonConfirmar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        textFieldFator = new javax.swing.JTextField();
        textFieldPassword = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldConcelho = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
        jLabel1.setText("JavaFatura");

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Preencha as suas informações");

        jLabel4.setText("NIF:");

        jLabel5.setText("Email:");

        jLabel6.setText("Nome:");

        jLabel7.setText("Morada:");

        jLabel8.setText("Password:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
        jLabel2.setText("JavaFatura");

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        textFieldNIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNIFActionPerformed(evt);
            }
        });

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Preencha as suas informações");

        jLabel10.setText("NIF:");

        jLabel11.setText("Email:");

        jLabel12.setText("Nome:");

        jLabel13.setText("Morada:");

        jLabel14.setText("Password:");

        jSeparator5.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel15.setText("Indique as atividades económicas que a empresa suporta");

        checkBoxRestauracao.setText("Restauração");
        checkBoxRestauracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxRestauracaoActionPerformed(evt);
            }
        });

        checkBoxSaude.setText("Saúde");

        checkBoxEducacao.setText("Educação");
        checkBoxEducacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxEducacaoActionPerformed(evt);
            }
        });

        checkBoxHabitacao.setText("Habitação");

        checkBoxDespesasFamiliares.setText("Despesas Familiares");

        ButtonVoltar.setText("Voltar");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });

        ButtonConfirmar.setText("Confirmar");
        ButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConfirmarActionPerformed(evt);
            }
        });

        jLabel16.setText("Fator que a empresa apresenta no cálculo de dedução fiscal:");

        textFieldFator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldFatorActionPerformed(evt);
            }
        });

        textFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPasswordActionPerformed(evt);
            }
        });

        jLabel17.setText("Concelho:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNome)
                            .addComponent(textFieldEmail)
                            .addComponent(textFieldMorada, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                            .addComponent(jTextFieldConcelho))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNIF, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(textFieldPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(440, 440, 440)
                                .addComponent(ButtonVoltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonConfirmar))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldFator, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkBoxRestauracao)
                                    .addComponent(checkBoxEducacao, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxSaude, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxHabitacao)
                                    .addComponent(checkBoxDespesasFamiliares)))
                            .addComponent(jLabel9))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonVoltar)
                            .addComponent(ButtonConfirmar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(textFieldNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldConcelho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxRestauracao)
                    .addComponent(checkBoxHabitacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxEducacao)
                    .addComponent(checkBoxDespesasFamiliares))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxSaude)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(textFieldFator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxEducacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxEducacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxEducacaoActionPerformed

    private void checkBoxRestauracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxRestauracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxRestauracaoActionPerformed

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
        (new Login(javaFactura)).setVisible(true);
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void textFieldNIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNIFActionPerformed

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void textFieldFatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldFatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldFatorActionPerformed

    private void ButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConfirmarActionPerformed
        Integer nif ;
        
        String email, nome, morada, password;
        Float fatorEmpresarial;
        List<Integer> atividades = new ArrayList<>();
        try{
            nif = Integer.parseInt(textFieldNIF.getText());
        }
        catch(NumberFormatException e){
            nif = new Integer(-1);
        }
        
        try{
            fatorEmpresarial = Float.parseFloat(textFieldFator.getText());
        } catch(NumberFormatException e){
            fatorEmpresarial = new Float(-1.0);
        }
        
        if(nif <= 0){
            textFieldNIF.setText("");
            JOptionPane.showMessageDialog(this, "NIF deve ser um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if(fatorEmpresarial < 0){
            JOptionPane.showMessageDialog(this, "Factor não é float.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if(!(email = textFieldEmail.getText()).contains("@")){
            JOptionPane.showMessageDialog(this, "Email inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else{
            nome = textFieldNome.getText();
            morada = textFieldMorada.getText();
            password = textFieldPassword.getText();
            if(checkBoxRestauracao.isSelected())
                atividades.add(CommonVariables.RESTAURACAO);
            if(checkBoxEducacao.isSelected())
                atividades.add(CommonVariables.EDUCACAO);
            if(checkBoxSaude.isSelected())
                atividades.add(CommonVariables.SAUDE);
            if(checkBoxHabitacao.isSelected())
                atividades.add(CommonVariables.HABITACAO);
            if(checkBoxDespesasFamiliares.isSelected())
                atividades.add(CommonVariables.DESPESAS_FAMILIARES);
                
            if(email.length() > 0 && nome.length() > 0 && morada.length() > 0 && password.length() > 0 && atividades.size() > 0){
                if(javaFactura.registaContribuinteColetivo(nif,email,nome,morada,password,fatorEmpresarial,atividades)){
                    this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
                    returnPage.setVisible(true);
                    JOptionPane.showMessageDialog(this, "Registado com sucesso.", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Utilizador com nif " + nif + " já registado.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Preencher campos vazios.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
      
        }
    }//GEN-LAST:event_ButtonConfirmarActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void textFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonConfirmar;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JCheckBox checkBoxDespesasFamiliares;
    private javax.swing.JCheckBox checkBoxEducacao;
    private javax.swing.JCheckBox checkBoxHabitacao;
    private javax.swing.JCheckBox checkBoxRestauracao;
    private javax.swing.JCheckBox checkBoxSaude;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldConcelho;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldFator;
    private javax.swing.JTextField textFieldMorada;
    private javax.swing.JTextField textFieldNIF;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JPasswordField textFieldPassword;
    // End of variables declaration//GEN-END:variables
}
