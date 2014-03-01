/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.BestDeal.gui;

import edu.BestDeal.dao.MailDAO;
import edu.BestDeal.entites.Mail;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JFileChooser;

/**
 *
 * @author yakoubi
 */
public class Frame_Mail extends javax.swing.JFrame {

    URL url;
    Mail mail = new Mail();

    /**
     * Creates new form Frame_Mail
     */
    public Frame_Mail() {
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

        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jTextMailAdresseExpéditeur = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPassworExpéditeur = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jTextMailAdresseDestinataire = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextmailObjet = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTareaCorps = new javax.swing.JTextArea();
        btEnvoyer = new javax.swing.JButton();
        jLabelpieceJointe = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_Attach = new javax.swing.JButton();
        btn_Annuler = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        label1.setText("Contacter Client");

        jLabel1.setText("expéditeur");

        jLabel2.setText("Mot de passe");

        jLabel3.setText("destinataire");

        jTextMailAdresseDestinataire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMailAdresseDestinataireActionPerformed(evt);
            }
        });

        jLabel4.setText("Objet");

        jLabel5.setText("corps du mail");

        jTareaCorps.setColumns(20);
        jTareaCorps.setRows(5);
        jScrollPane1.setViewportView(jTareaCorps);

        btEnvoyer.setText("Envoyer");
        btEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnvoyerActionPerformed(evt);
            }
        });

        jLabel6.setText("joindre des fichiers");

        btn_Attach.setText("Attach");
        btn_Attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AttachActionPerformed(evt);
            }
        });

        btn_Annuler.setText("Annuler");
        btn_Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnnulerActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/BestDeal/gui/mail.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btEnvoyer, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(btn_Annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelpieceJointe)
                                    .addComponent(jTextMailAdresseExpéditeur)
                                    .addComponent(jPassworExpéditeur)
                                    .addComponent(jTextMailAdresseDestinataire)
                                    .addComponent(jTextmailObjet)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)))
                .addGap(18, 18, 18)
                .addComponent(btn_Attach)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMailAdresseExpéditeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jPassworExpéditeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextMailAdresseDestinataire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextmailObjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelpieceJointe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btn_Attach))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnvoyer)
                    .addComponent(btn_Annuler))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextMailAdresseDestinataireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMailAdresseDestinataireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMailAdresseDestinataireActionPerformed

    private void btEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnvoyerActionPerformed
        // TODO add your handling code here:
        mail.setMailAddressRecipient(jTextMailAdresseDestinataire.getText());
        mail.setPwd(jPassworExpéditeur.getText());
        mail.setMailAddressSender(jTextMailAdresseExpéditeur.getText());
        mail.setMailSubject(jTextmailObjet.getText());
        String[] lines = jTareaCorps.getText().split("\\n");
        String msg = "";
        for (String s : lines) {
            msg = msg + s;
        }
        mail.setMailObject(msg);
        //System.out.println(jTextArearObject.getToolTipText());

        MailDAO mc = new MailDAO();
        mc.getMailProperties();

        String s = this.cleanUrl(url);
        mc.getMailMessage(s, mail);
        mc.SendMessage();
    }//GEN-LAST:event_btEnvoyerActionPerformed

    private void btn_AttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AttachActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int option = chooser.showOpenDialog(null);
        if(option == JFileChooser.APPROVE_OPTION){
            try{
                url = chooser.getSelectedFile().toURL();
                System.out.println(url);
                jLabelpieceJointe.setText(url.toString());
               
            }
            catch(MalformedURLException exception){
                System.out.println("The URL was malformed ... ");
              
            }
        }
        
    }//GEN-LAST:event_btn_AttachActionPerformed

    private void btn_AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnnulerActionPerformed
        // TODO add your handling code here:
        Frame_Interface_Administrateur M = new Frame_Interface_Administrateur();
       M.setVisible(true);
       dispose();
    }//GEN-LAST:event_btn_AnnulerActionPerformed

    public String cleanUrl(URL url) {

        String s = url.toString();
        System.out.println("Before Clean");
        System.out.println(s);
        String delims = "/";
        String[] tokens = s.split(delims);
        System.out.println("After Clean");
        String mailPart = "";
        for (int i = 1; i < tokens.length; i++) {
            mailPart += tokens[i] + "\\\\";
        }
        System.out.println(mailPart);
        return mailPart;
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
            java.util.logging.Logger.getLogger(Frame_Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Mail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Mail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnvoyer;
    private javax.swing.JButton btn_Annuler;
    private javax.swing.JButton btn_Attach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jLabelpieceJointe;
    private javax.swing.JPasswordField jPassworExpéditeur;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTareaCorps;
    private javax.swing.JTextField jTextMailAdresseDestinataire;
    private javax.swing.JTextField jTextMailAdresseExpéditeur;
    private javax.swing.JTextField jTextmailObjet;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
