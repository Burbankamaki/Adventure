/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui260.adventure.frames;

import byui260.adventure.exceptions.GasPriceException;

/**
 *
 * @author Motoko Kusanagi
 */
public class GetGasFrame extends javax.swing.JFrame {

    /**
     * Creates new form GetGasFrame
     */
    public GetGasFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtGasInfo = new javax.swing.JTextArea();
        jtGallons = new javax.swing.JTextField();
        jPurchse = new javax.swing.JButton();
        jContinue = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPurchaseReturn = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtGasInfo.setEditable(false);
        jtGasInfo.setColumns(20);
        jtGasInfo.setRows(5);
        jtGasInfo.setText("you take off in your car for work, but notice the\ngas is low you pull into your neighborhood\ngas station and notice you have\n40 dollars cash.\ngas is currently $3.75 a gallon\nHow many gallons of gas do you want to buy?\n\nEnter the amount Below.");
        jScrollPane1.setViewportView(jtGasInfo);

        jtGallons.setText("Enter gallon amount here");

        jPurchse.setText("Purchase");
        jPurchse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPurchseActionPerformed(evt);
            }
        });

        jContinue.setText("Continue");
        jContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContinueActionPerformed(evt);
            }
        });

        jtPurchaseReturn.setEditable(false);
        jtPurchaseReturn.setColumns(20);
        jtPurchaseReturn.setRows(5);
        jScrollPane2.setViewportView(jtPurchaseReturn);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPurchse)
                        .addGap(18, 18, 18)
                        .addComponent(jtGallons, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addGap(18, 18, 18)
                .addComponent(jContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtGallons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPurchse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPurchseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPurchseActionPerformed
        // TODO add your handling code here:
        Double gallons;
         
        
        String gallonsString = this.jtGallons.getText();
        String check = "[0-9]+";
       // if (!gallonsString.matches(check)){
         //   this.jtPurchaseReturn.setText("Please enter a valid number. \nBe sure to enter 0 or more, \nand that your choice is a whole number.");
          
        //    }
        try{
          gallons = Double.parseDouble(gallonsString);
        

               
                
        if (gallons < 0){
           this.jtPurchaseReturn.setText("Please enter 0 or more");
           
        }   
        
        
        if (3.75 * gallons > 40){
            this.jtPurchaseReturn.setText("you don't have enough money \nfor that much gas! \ntry buying fewer gallons\n");
            
        }
       
        
        
        
        
     if (3.75 * gallons < 40 && 3.75 * gallons >= 0){
         
     double price = 3.75 * gallons;
     dispose();
        GasPurchaseFrame gasPurchaseFrame = new GasPurchaseFrame();
        gasPurchaseFrame.setVisible(true);
     
     
    gasPurchaseFrame.jtGasPurchase.setText("you paid $"+price+" for gas \nand continue on your way to work.");
     }
        
        
        
        
        
        
       } catch(NumberFormatException e){
        this.jtPurchaseReturn.setText("Please enter a valid number. \nBe sure to enter 0 or more, \nand that your choice is a whole number.");
        } 
        
        
        
    }//GEN-LAST:event_jPurchseActionPerformed

    private void jContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContinueActionPerformed
        // TODO add your handling code here:
        dispose();
        DriveFrame driveFrame = new DriveFrame();
        driveFrame.setVisible(true);
    }//GEN-LAST:event_jContinueActionPerformed

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
            java.util.logging.Logger.getLogger(GetGasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetGasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetGasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetGasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetGasFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jContinue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jPurchse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtGallons;
    private javax.swing.JTextArea jtGasInfo;
    private javax.swing.JTextArea jtPurchaseReturn;
    // End of variables declaration//GEN-END:variables
}