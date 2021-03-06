/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafactura;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author utilizador
 */
public class MenuContribuinteColetivo extends javax.swing.JFrame {
    JavaFactura javaFactura;
    Login returnWindow;
    ContribuinteColetivo contr;
    /**
     * Creates new form MenuEmpresa
     */
    public MenuContribuinteColetivo(JavaFactura javaFactura, Login returnWindow, ContribuinteColetivo contr) {
        initComponents();
        this.javaFactura = javaFactura;
        this.returnWindow = returnWindow;
        this.setLocationRelativeTo(null);
        this.contr = contr;
    }

    public void setContr(ContribuinteColetivo contr){
        this.contr = contr;
    }
    
    public void mostraAnterior(){
        returnWindow.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButtonTerminarSessao = new javax.swing.JButton();
        jButtonDataEmissao = new javax.swing.JButton();
        jButtonValorDespesa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNIFCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDia2 = new javax.swing.JTextField();
        jButtonIntervaloDatas = new javax.swing.JButton();
        jButtonValorDecrescente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonTotalFaturado = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonAdicionarFatura = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldMes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldMes2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldAno2 = new javax.swing.JTextField();
        jTextFieldDia3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldMes3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldAno3 = new javax.swing.JTextField();
        jTextFieldDia4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldMes4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldAno4 = new javax.swing.JTextField();

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

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

        jButtonDataEmissao.setText("data de emissão");
        jButtonDataEmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDataEmissaoActionPerformed(evt);
            }
        });

        jButtonValorDespesa.setText("valor da despesa");
        jButtonValorDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValorDespesaActionPerformed(evt);
            }
        });

        jLabel3.setText("Obter lista das faturas emitidas ordenadas por:");

        jLabel4.setText("Obter lista das faturas do contribuinte com o NIF");

        jLabel5.setText("entre");

        jTextFieldDia.setText("DD");

        jLabel6.setText("e");

        jTextFieldDia2.setText("DD");

        jButtonIntervaloDatas.setText("intervalo de datas");
        jButtonIntervaloDatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIntervaloDatasActionPerformed(evt);
            }
        });

        jButtonValorDecrescente.setText("valor decrescente de despesa");
        jButtonValorDecrescente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValorDecrescenteActionPerformed(evt);
            }
        });

        jLabel7.setText("por:");

        jButtonTotalFaturado.setText("Total Faturado");
        jButtonTotalFaturado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalFaturadoActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setText("Obter total faturado entre");

        jLabel9.setText("e");

        jButtonAdicionarFatura.setText("Adicionar fatura");
        jButtonAdicionarFatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarFaturaActionPerformed(evt);
            }
        });

        jLabel10.setText("/");

        jTextFieldMes.setText("MM");

        jLabel11.setText("/");

        jTextFieldAno.setText("AAAA");
        jTextFieldAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnoActionPerformed(evt);
            }
        });

        jLabel12.setText("/");

        jTextFieldMes2.setText("MM");

        jLabel13.setText("/");

        jTextFieldAno2.setText("AAAA");
        jTextFieldAno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAno2ActionPerformed(evt);
            }
        });

        jTextFieldDia3.setText("DD");

        jLabel14.setText("/");

        jTextFieldMes3.setText("MM");

        jLabel15.setText("/");

        jTextFieldAno3.setText("AAAA");
        jTextFieldAno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAno3ActionPerformed(evt);
            }
        });

        jTextFieldDia4.setText("DD");

        jLabel16.setText("/");

        jTextFieldMes4.setText("MM");

        jLabel17.setText("/");

        jTextFieldAno4.setText("AAAA");
        jTextFieldAno4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAno4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdicionarFatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTerminarSessao)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDia3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDia4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMes4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAno4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNIFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButtonValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDataEmissao))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButtonTotalFaturado, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonValorDecrescente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButtonIntervaloDatas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDia2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTerminarSessao)
                            .addComponent(jButtonAdicionarFatura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNIFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIntervaloDatas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldAno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonValorDecrescente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jTextFieldMes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jTextFieldAno3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(jTextFieldMes4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(jTextFieldAno4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTotalFaturado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDataEmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDataEmissaoActionPerformed
        List<Factura> facturas = javaFactura.getFacturasWithNIF(contr.getNif());
        facturas.sort(new ComparatorFacturasData());
        JFrame novoUserFrame = new ListaFaturas(this,contr,facturas);
        novoUserFrame.addWindowListener(new WindowAdapter()
                        {
                            public void windowClosing(WindowEvent e)
                            {
                               ((ListaFaturas)e.getWindow()).mostraAnterior();
                            }
                        });
        this.setVisible(false);
        novoUserFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        novoUserFrame.setVisible(true);
    }//GEN-LAST:event_jButtonDataEmissaoActionPerformed

    private void jButtonAdicionarFaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarFaturaActionPerformed
        JFrame novoUserFrame = new AdicionarFatura(javaFactura,this,contr);
        novoUserFrame.addWindowListener(new WindowAdapter()
                        {
                            public void windowClosing(WindowEvent e)
                            {
                               ((AdicionarFatura)e.getWindow()).mostraAnterior();
                            }
                        });
        this.setVisible(false);
        novoUserFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        novoUserFrame.setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarFaturaActionPerformed

    private void jButtonTerminarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminarSessaoActionPerformed
        this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
        returnWindow.setVisible(true);
    }//GEN-LAST:event_jButtonTerminarSessaoActionPerformed

    private void jTextFieldAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnoActionPerformed

    private void jTextFieldAno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAno2ActionPerformed

    private void jTextFieldAno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAno3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAno3ActionPerformed

    private void jTextFieldAno4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAno4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAno4ActionPerformed

    private void jButtonValorDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValorDespesaActionPerformed
        List<Factura> facturas = javaFactura.getFacturasWithNIF(contr.getNif());
        facturas.sort(new ComparatorFacturasValor());
        JFrame novoUserFrame = new ListaFaturas(this,contr,facturas);
        novoUserFrame.addWindowListener(new WindowAdapter()
                        {
                            public void windowClosing(WindowEvent e)
                            {
                               ((ListaFaturas)e.getWindow()).mostraAnterior();
                            }
                        });
        this.setVisible(false);
        novoUserFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        novoUserFrame.setVisible(true);
    }//GEN-LAST:event_jButtonValorDespesaActionPerformed

    private void jButtonIntervaloDatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIntervaloDatasActionPerformed
        Integer ano, mes, dia, ano2, mes2, dia2,nif;
         try{
            nif = Integer.parseInt(jTextFieldNIFCliente.getText());
        }
        catch(NumberFormatException e){
            nif = new Integer(-1);
        }
        try{
            ano = Integer.parseInt(jTextFieldAno.getText());
            mes = Integer.parseInt(jTextFieldMes.getText());
            dia = Integer.parseInt(jTextFieldDia.getText());
        }
        catch(NumberFormatException e){
            ano = new Integer(-1);
            mes = new Integer(-1);
            dia = new Integer(-1);
        }
        try{
            ano2 = Integer.parseInt(jTextFieldAno2.getText());
            mes2 = Integer.parseInt(jTextFieldMes2.getText());
            dia2 = Integer.parseInt(jTextFieldDia2.getText());
        }
        catch(NumberFormatException e){
            ano2 = new Integer(-1);
            mes2 = new Integer(-1);
            dia2 = new Integer(-1);
        }
        
        if(ano < 0 || mes < 0 || dia < 0 || mes > 12 || dia > 31){
            JOptionPane.showMessageDialog(this, "Data inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if(ano2 < 0 || mes2 < 0 || dia2 < 0 || mes2 > 12 || dia2 > 31){
            JOptionPane.showMessageDialog(this, "Data inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if(nif == -1){
            JOptionPane.showMessageDialog(this, "NIF de cliente inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            List<Factura> facturas = javaFactura.getFacturasEmpresaEntreDatas(nif,LocalDateTime.of(ano,mes,dia,0,0),LocalDateTime.of(ano2,mes2,dia2,0,0));
            facturas.sort(new ComparatorFacturasData());
            JFrame novoUserFrame = new ListaFaturas(this,contr,facturas);
            novoUserFrame.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                                {
                                   ((ListaFaturas)e.getWindow()).mostraAnterior();
                                }
                            });
            this.setVisible(false);
            novoUserFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            novoUserFrame.setVisible(true);
        }
    }//GEN-LAST:event_jButtonIntervaloDatasActionPerformed

    private void jButtonValorDecrescenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValorDecrescenteActionPerformed
        Integer nif; 
        try{
            nif = Integer.parseInt(jTextFieldNIFCliente.getText());
        }
        catch(NumberFormatException e){
            nif = new Integer(-1);
        }
        if(nif == -1){
            JOptionPane.showMessageDialog(this, "NIF de cliente inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            List<Factura> facturas = javaFactura. getFacturasEmpresaOrdenadaPorDespesa(nif,false);
            JFrame novoUserFrame = new ListaFaturas(this,contr,facturas);
            novoUserFrame.addWindowListener(new WindowAdapter()
                            {
                                public void windowClosing(WindowEvent e)
                                {
                                   ((ListaFaturas)e.getWindow()).mostraAnterior();
                                }
                            });
            this.setVisible(false);
            novoUserFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            novoUserFrame.setVisible(true);
        }
    }//GEN-LAST:event_jButtonValorDecrescenteActionPerformed

    private void jButtonTotalFaturadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalFaturadoActionPerformed
        Integer ano,mes,dia,ano2,mes2,dia2;
        
        try{
            ano = Integer.parseInt(jTextFieldAno3.getText());
            mes = Integer.parseInt(jTextFieldMes3.getText());
            dia = Integer.parseInt(jTextFieldDia3.getText());
        }
        catch(NumberFormatException e){
            ano = new Integer(-1);
            mes = new Integer(-1);
            dia = new Integer(-1);
        }
        try{
            ano2 = Integer.parseInt(jTextFieldAno4.getText());
            mes2 = Integer.parseInt(jTextFieldMes4.getText());
            dia2 = Integer.parseInt(jTextFieldDia4.getText());
        }
        catch(NumberFormatException e){
            ano2 = new Integer(-1);
            mes2 = new Integer(-1);
            dia2 = new Integer(-1);
        }
        
        if(ano < 0 || mes < 0 || dia < 0 || mes > 12 || dia > 31){
            JOptionPane.showMessageDialog(this, "Data inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if(ano2 < 0 || mes2 < 0 || dia2 < 0 || mes2 > 12 || dia2 > 31){
            JOptionPane.showMessageDialog(this, "Data inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else{
            float valorFaturado = 0;
            valorFaturado = javaFactura.getFacturadoEntreDatas(contr.getNif(),LocalDateTime.of(ano,mes,dia,0,0),LocalDateTime.of(ano2,mes2,dia2,0,0));
            JOptionPane.showMessageDialog(this, "Total faturado: " + valorFaturado, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonTotalFaturadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarFatura;
    private javax.swing.JButton jButtonDataEmissao;
    private javax.swing.JButton jButtonIntervaloDatas;
    private javax.swing.JButton jButtonTerminarSessao;
    private javax.swing.JButton jButtonTotalFaturado;
    private javax.swing.JButton jButtonValorDecrescente;
    private javax.swing.JButton jButtonValorDespesa;
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
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldAno2;
    private javax.swing.JTextField jTextFieldAno3;
    private javax.swing.JTextField jTextFieldAno4;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldDia2;
    private javax.swing.JTextField jTextFieldDia3;
    private javax.swing.JTextField jTextFieldDia4;
    private javax.swing.JTextField jTextFieldMes;
    private javax.swing.JTextField jTextFieldMes2;
    private javax.swing.JTextField jTextFieldMes3;
    private javax.swing.JTextField jTextFieldMes4;
    private javax.swing.JTextField jTextFieldNIFCliente;
    // End of variables declaration//GEN-END:variables
}
