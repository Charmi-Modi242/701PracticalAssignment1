/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SwingFrames;

import Interfaces.Featurable;
import com.ozten.font.JFontChooser;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class MainFrame extends javax.swing.JFrame {

    Color BColor;
    Color FColor;
    Font font; 
    Featurable dt;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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
        btnFont = new javax.swing.JButton();
        javax.swing.JLabel lblBColor = new javax.swing.JLabel();
        btnBColor = new javax.swing.JButton();
        javax.swing.JLabel lblFColor = new javax.swing.JLabel();
        btnFColor = new javax.swing.JButton();
        javax.swing.JLabel lblFont = new javax.swing.JLabel();
        javax.swing.JLabel lblRows = new javax.swing.JLabel();
        txtRows = new javax.swing.JTextField();
        javax.swing.JLabel lblCols = new javax.swing.JLabel();
        txtCols = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFont.setText("Select any Font");
        btnFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFontActionPerformed(evt);
            }
        });

        lblBColor.setText("Background Color: ");
        lblBColor.setMaximumSize(new java.awt.Dimension(60, 20));
        lblBColor.setMinimumSize(new java.awt.Dimension(200, 30));
        lblBColor.setPreferredSize(new java.awt.Dimension(60, 20));

        btnBColor.setText("Select any Color");
        btnBColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBColorActionPerformed(evt);
            }
        });

        lblFColor.setText("Foreground Color: ");
        lblFColor.setMaximumSize(new java.awt.Dimension(60, 20));
        lblFColor.setMinimumSize(new java.awt.Dimension(200, 30));
        lblFColor.setPreferredSize(new java.awt.Dimension(60, 20));

        btnFColor.setText("Select any Color");
        btnFColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFColorActionPerformed(evt);
            }
        });

        lblFont.setText("Font Size:");
        lblFont.setMaximumSize(new java.awt.Dimension(60, 20));
        lblFont.setMinimumSize(new java.awt.Dimension(200, 30));
        lblFont.setPreferredSize(new java.awt.Dimension(60, 20));

        lblRows.setText("Rows");
        lblRows.setMaximumSize(new java.awt.Dimension(60, 20));
        lblRows.setMinimumSize(new java.awt.Dimension(200, 30));
        lblRows.setPreferredSize(new java.awt.Dimension(60, 20));

        lblCols.setText("Columns");
        lblCols.setMaximumSize(new java.awt.Dimension(60, 20));
        lblCols.setMinimumSize(new java.awt.Dimension(200, 30));
        lblCols.setPreferredSize(new java.awt.Dimension(60, 20));

        btnSubmit.setText("Submit");
        btnSubmit.setToolTipText("");
        btnSubmit.setMinimumSize(new java.awt.Dimension(120, 22));
        btnSubmit.setPreferredSize(new java.awt.Dimension(120, 22));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.setToolTipText("");
        btnReset.setMinimumSize(new java.awt.Dimension(120, 22));
        btnReset.setPreferredSize(new java.awt.Dimension(120, 22));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRows, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRows))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCols, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCols))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBColor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBColor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFColor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFColor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFont, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFont, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBColor, btnFColor, btnFont, btnReset, btnSubmit, lblBColor, lblCols, lblFColor, lblFont, lblRows, txtCols, txtRows});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCols, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCols, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFont))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(321, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnReset, btnSubmit});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBColorActionPerformed
        this.BColor = Color.BLACK;

        this.BColor = JColorChooser.showDialog(this, "Select any color", this.BColor);
        if (this.BColor == null) {
            this.BColor = Color.WHITE;
        }
        System.out.println("Selected Background Color: " + this.BColor);
    }//GEN-LAST:event_btnBColorActionPerformed

    private void btnFColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFColorActionPerformed
        this.FColor = Color.WHITE;

        this.FColor = JColorChooser.showDialog(this, "Select any color", this.FColor);
        if (this.FColor == null) {
            this.FColor = Color.BLACK;
            System.out.println("Condition true");
        }
        System.out.println("Selected Foreground Color: " + this.FColor);
    }//GEN-LAST:event_btnFColorActionPerformed

    private void btnFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFontActionPerformed
        JFontChooser fc = new JFontChooser();
        JOptionPane.showMessageDialog(null, fc, "Please choose Font", JOptionPane.PLAIN_MESSAGE);
        System.out.print(fc.getPreviewFont());
        this.font = fc.getPreviewFont();
    }//GEN-LAST:event_btnFontActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        JTable table = new JTable();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setColumnCount(Integer.parseInt(txtCols.getText()));
        model.setRowCount(Integer.parseInt(txtRows.getText()));
        dt = new DataTable(table);
        dt.setBackground(this.BColor);
        dt.setFont(this.font);
        dt.setForeground(this.FColor);
        table.setGridColor(Color.WHITE);
        table.setShowGrid(true);
        JOptionPane.showMessageDialog(null, table, "Please choose Font", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBColor;
    private javax.swing.JButton btnFColor;
    private javax.swing.JButton btnFont;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCols;
    private javax.swing.JTextField txtRows;
    // End of variables declaration//GEN-END:variables
}