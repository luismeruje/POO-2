/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafactura;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author utilizador
 */
public class MenuAdmin extends javax.swing.JFrame {
    JavaFactura javaFactura;
    Login returnWindow;
    Admin admin;
    
    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin(JavaFactura javaFactura, Login returnWindow, Admin admin) {
        initComponents();
        this.javaFactura = javaFactura;
        this.setLocationRelativeTo(null);
        this.returnWindow = returnWindow;
    }
    
    public void mostraAnterior(){
        returnWindow.setVisible(true);
    }
    /**

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonTerminarSessao = new javax.swing.JButton();
        jButton10Contribuintes = new javax.swing.JButton();
        jButtonMaisFaturas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNumeroEmpresas = new javax.swing.JTextField();

        jButton1.setText("Terminar sessão");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 36)); // NOI18N
        jLabel1.setText("JavaFatura");

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonTerminarSessao.setText("Terminar sessão");
        jButtonTerminarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminarSessaoActionPerformed(evt);
            }
        });

        jButton10Contribuintes.setText("Obter os 10 contribuintes que mais gastam no ano presente");
        jButton10Contribuintes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ContribuintesActionPerformed(evt);
            }
        });

        jButtonMaisFaturas.setText("Lista das empresas com mais faturas");
        jButtonMaisFaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaisFaturasActionPerformed(evt);
            }
        });

        jLabel2.setText("Número de empresas nas listas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumeroEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonMaisFaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10Contribuintes, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonTerminarSessao)
                                .addGap(40, 40, 40)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonTerminarSessao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton10Contribuintes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNumeroEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonMaisFaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMaisFaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaisFaturasActionPerformed
        Integer contagemEmpresas;
        
        try {
            contagemEmpresas = Integer.parseInt(jTextFieldNumeroEmpresas.getText());
        }
        catch(NumberFormatException e){
            contagemEmpresas = new Integer(-1);
        }
        
        if (contagemEmpresas != -1) {
            Map <Contribuinte,Float> contribuintes = javaFactura.getTopXEmpresasFaturadoras(contagemEmpresas);
            JFrame novoUserFrame = new ListaContribuintes(this, contribuintes, new String[] {"NIF", "Nome", "Morada", "Email", "Montante"});
            novoUserFrame.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                                {
                                   ((ListaContribuintes)e.getWindow()).mostraAnterior();
                                }
                            });
            this.setVisible(false);
            novoUserFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            novoUserFrame.setVisible(true);
        }
        else
            JOptionPane.showMessageDialog(this, "Número de empresas inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButtonMaisFaturasActionPerformed

    private void jButtonTerminarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminarSessaoActionPerformed
        this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
        returnWindow.setVisible(true);
    }//GEN-LAST:event_jButtonTerminarSessaoActionPerformed

    private void jButton10ContribuintesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ContribuintesActionPerformed
        Map <Contribuinte,Float> contribuintes = javaFactura.getTop10Contribuintes();
        JFrame novoUserFrame = new ListaContribuintes(this, contribuintes, new String[] {"NIF", "Nome", "Morada", "Email", "Despesa"});
        novoUserFrame.addWindowListener(new WindowAdapter()
                        {
                            public void windowClosing(WindowEvent e)
                            {
                               ((ListaContribuintes)e.getWindow()).mostraAnterior();
                            }
                        });
        this.setVisible(false);
        novoUserFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        novoUserFrame.setVisible(true);
    }//GEN-LAST:event_jButton10ContribuintesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10Contribuintes;
    private javax.swing.JButton jButtonMaisFaturas;
    private javax.swing.JButton jButtonTerminarSessao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldNumeroEmpresas;
    // End of variables declaration//GEN-END:variables
}
