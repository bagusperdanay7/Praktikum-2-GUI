
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fauzanlh
 */
public class Praktikum3_3 extends javax.swing.JFrame {

    /**
     * Creates new form Praktikum3_3
     */
    public Praktikum3_3() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtkelas = new javax.swing.JTextField();
        tbltambah = new javax.swing.JButton();
        tbledit = new javax.swing.JButton();
        tblexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Mahasiswa");

        jLabel2.setText("NIM   :");

        jLabel3.setText("Nama :");

        jLabel4.setText("Kelas :");

        tbltambah.setText("Tambah");
        tbltambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbltambahActionPerformed(evt);
            }
        });

        tbledit.setText("Edit");
        tbledit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbleditActionPerformed(evt);
            }
        });

        tblexit.setText("Exit");
        tblexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(tbltambah))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tbledit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tblexit)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbltambah)
                    .addComponent(tbledit)
                    .addComponent(tblexit))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbltambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbltambahActionPerformed
        // TODO add your handling code here:
        if(tbltambah.getText().equals("Tambah")) {
            tbltambah.setText("Simpan");
            tbltambah.setMnemonic('S');
            tbledit.setText("Batal");
            tbledit.setMnemonic('B');
            tbledit.setEnabled(false);
            tblexit.setEnabled(false);
            txtnim.setEnabled(true);
            txtnama.setEnabled(true);
            txtkelas.setEnabled(true);

            txtnim.requestFocus();
        } else {
            //simpan data
            JOptionPane.showMessageDialog(null, " Menyimpan data "
                + " NIM : '" + txtnim.getText() + "'"
                + " Nama : " + txtnama.getText()
                + " Kelas : ''" + txtkelas.getText() + "'");
            tbltambah.setText("Tambah");
            tbltambah.setMnemonic('T');
            tbledit.setText("Edit");
            tbledit.setMnemonic('E');
            tbledit.setEnabled(true);
            tblexit.setEnabled(true);
            txtnim.setEnabled(false);
            txtnama.setEnabled(false);
            txtkelas.setEnabled(false);
            //txtnim.setEditable(true);
            //txtnama.setEditable(true);
            //txtkelas.setEditable(true);
            tbltambah.requestFocus();

        }
    }//GEN-LAST:event_tbltambahActionPerformed

    private void tbleditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbleditActionPerformed
        // TODO add your handling code here:
        if(tbledit.getText().equals("Edit")) {
            tbledit.setText("Selesai");
            tbledit.setMnemonic('S');
            tbltambah.setText("Tambah");
            tbltambah.setMnemonic('T');
            tbltambah.setEnabled(false);
            tblexit.setEnabled(false);
            txtnim.setEditable(true);
            txtnama.setEditable(true);
            txtkelas.setEditable(true);
            txtnim.setEnabled(true);
            txtnama.setEnabled(true);
            txtkelas.setEnabled(true);

            txtnim.requestFocus();
        } else {
            //simpan data
            JOptionPane.showMessageDialog(null, " Menyimpan data "
                + " NIM : '" + txtnim.getText() + "'"
                + " Nama : " + txtnama.getText()
                + " Kelas : ''" + txtkelas.getText() + "'");
            tbltambah.setText("Tambah");
            tbltambah.setMnemonic('T');
            tbledit.setText("Edit");
            tbledit.setMnemonic('E');
            tblexit.setEnabled(true);
            tbltambah.setEnabled(true);
            txtnim.setEditable(true);
            txtnama.setEditable(true);
            txtkelas.setEditable(true);
            txtnim.setEnabled(false);
            txtnama.setEnabled(false);
            txtkelas.setEnabled(false);
            tbltambah.requestFocus();

        }
    }//GEN-LAST:event_tbleditActionPerformed

    private void tblexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblexitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tblexitActionPerformed

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
            java.util.logging.Logger.getLogger(Praktikum3_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Praktikum3_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Praktikum3_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Praktikum3_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Praktikum3_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton tbledit;
    private javax.swing.JButton tblexit;
    private javax.swing.JButton tbltambah;
    private javax.swing.JTextField txtkelas;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    // End of variables declaration//GEN-END:variables
}
