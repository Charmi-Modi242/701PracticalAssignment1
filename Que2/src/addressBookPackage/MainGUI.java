/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package addressBookPackage;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public List<AddressBook> addressBookList = new ArrayList<AddressBook>();
    public int index = -1;

    public MainGUI() {
        initComponents();
        this.initValue();
    }

    private void initValue() {
        this.addressBookList.add(new AddressBook("Charmi", "Surat", 12456981, "Bharuch", 56321478, "FX1234", 789654123, "PG123"));
        this.addressBookList.add(new AddressBook("Mansi", "Surat", 23654789, "Vapi", 85921478, "FX2345", 963258741, "PG234"));
        DefaultTableModel model = (DefaultTableModel) tblAddressBookList.getModel();
        for (int i = 0; i < this.addressBookList.size(); i++) {
            model.addRow(new Object[]{this.addressBookList.get(i).Name, this.addressBookList.get(i).Address, this.addressBookList.get(i).PhoneNo, this.addressBookList.get(i).BussinessAddress, this.addressBookList.get(i).BussinessPhoneNo, this.addressBookList.get(i).FaxMachineNo, this.addressBookList.get(i).CellularPhoneNo, this.addressBookList.get(i).PagerNo});
        }
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
        MainPanel = new javax.swing.JPanel();
        javax.swing.JPanel FormPanel = new javax.swing.JPanel();
        javax.swing.JLabel lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        javax.swing.JLabel lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        javax.swing.JLabel lblPhoneNo = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        javax.swing.JLabel lblBussAddress = new javax.swing.JLabel();
        txtBussAddress = new javax.swing.JTextField();
        txtBussPhoneNo = new javax.swing.JTextField();
        javax.swing.JLabel lblBussPhoneNo = new javax.swing.JLabel();
        javax.swing.JLabel lblFaxMachineNo = new javax.swing.JLabel();
        txtFaxMachineNo = new javax.swing.JTextField();
        javax.swing.JLabel lblCellularPhoneNo = new javax.swing.JLabel();
        txtCellularPhoneNo = new javax.swing.JTextField();
        txtPagerNo = new javax.swing.JTextField();
        javax.swing.JLabel lblPagerNo = new javax.swing.JLabel();
        javax.swing.JButton btnAdd = new javax.swing.JButton();
        javax.swing.JButton btnClear = new javax.swing.JButton();
        javax.swing.JLabel title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddressBookList = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AddressBook");
        setMinimumSize(new java.awt.Dimension(960, 520));
        setName("MainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(960, 520));

        MainPanel.setBackground(new java.awt.Color(153, 153, 255));
        MainPanel.setMinimumSize(new java.awt.Dimension(960, 520));
        MainPanel.setPreferredSize(new java.awt.Dimension(960, 520));

        FormPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Address Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        FormPanel.setOpaque(false);
        FormPanel.setPreferredSize(new java.awt.Dimension(300, 480));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");

        txtName.setPreferredSize(new java.awt.Dimension(64, 23));

        lblAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address");

        txtAddress.setPreferredSize(new java.awt.Dimension(64, 23));

        lblPhoneNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNo.setText("Phone No");

        txtPhoneNo.setPreferredSize(new java.awt.Dimension(64, 23));

        lblBussAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBussAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblBussAddress.setText("Bussiness Address");

        txtBussAddress.setPreferredSize(new java.awt.Dimension(64, 23));

        txtBussPhoneNo.setPreferredSize(new java.awt.Dimension(64, 23));

        lblBussPhoneNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBussPhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        lblBussPhoneNo.setText("Bussiness Phone No");

        lblFaxMachineNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFaxMachineNo.setForeground(new java.awt.Color(255, 255, 255));
        lblFaxMachineNo.setText("Fax Machine No");

        txtFaxMachineNo.setPreferredSize(new java.awt.Dimension(64, 23));

        lblCellularPhoneNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCellularPhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        lblCellularPhoneNo.setText("Cellular Phone No");

        txtCellularPhoneNo.setPreferredSize(new java.awt.Dimension(64, 23));

        txtPagerNo.setPreferredSize(new java.awt.Dimension(64, 23));

        lblPagerNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPagerNo.setForeground(new java.awt.Color(255, 255, 255));
        lblPagerNo.setText("Pager No");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setText("Submit");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setPreferredSize(new java.awt.Dimension(80, 30));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addComponent(lblPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblBussAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtBussAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblBussPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtBussPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblFaxMachineNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtFaxMachineNo, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addComponent(lblCellularPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtCellularPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addComponent(lblPagerNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtPagerNo, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FormPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnClear});

        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPhoneNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBussAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBussAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBussPhoneNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBussPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFaxMachineNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFaxMachineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCellularPhoneNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCellularPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPagerNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPagerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        FormPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnClear});

        title.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("List of Address Book");
        title.setMaximumSize(new java.awt.Dimension(174, 30));
        title.setMinimumSize(new java.awt.Dimension(174, 30));
        title.setPreferredSize(new java.awt.Dimension(174, 30));

        tblAddressBookList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblAddressBookList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Adress", "PhoneNo", "BussinessAddress", "BusinessPhoneNo", "FaxMachineNo", "CellularPhoneNo", "PagerNo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAddressBookList.setFocusable(false);
        tblAddressBookList.setMinimumSize(new java.awt.Dimension(800, 480));
        tblAddressBookList.setPreferredSize(new java.awt.Dimension(800, 480));
        tblAddressBookList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAddressBookListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAddressBookList);

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(80, 30));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtBussAddress.getText().isEmpty() || txtBussPhoneNo.getText().isEmpty() || txtFaxMachineNo.getText().isEmpty() || txtCellularPhoneNo.getText().isEmpty() || txtPagerNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all fields properly", "Try again", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tblAddressBookList.getModel();
            if (this.index >= 0) {
                AddressBook ab = this.addressBookList.get(index);
                ab.Name = txtName.getText();
                ab.Address = txtAddress.getText();
                ab.PhoneNo = Integer.parseInt(txtPhoneNo.getText());
                ab.BussinessAddress = txtBussAddress.getText();
                ab.BussinessPhoneNo = Integer.parseInt(txtBussPhoneNo.getText());
                ab.FaxMachineNo = txtFaxMachineNo.getText();
                ab.CellularPhoneNo = Integer.parseInt(txtCellularPhoneNo.getText());
                ab.PagerNo = txtPagerNo.getText();
                model.setValueAt(ab.Name, index, 0);
                model.setValueAt(ab.Address, index, 1);
                model.setValueAt(ab.PhoneNo, index, 2);
                model.setValueAt(ab.BussinessAddress, index, 3);
                model.setValueAt(ab.BussinessPhoneNo, index, 4);
                model.setValueAt(ab.FaxMachineNo, index, 5);
                model.setValueAt(ab.CellularPhoneNo, index, 6);
                model.setValueAt(ab.PagerNo, index, 7);
                System.out.print("Row Updated ==> " + ab);
            } else {
                AddressBook ab = new AddressBook(txtName.getText(), txtAddress.getText(), Long.parseLong(txtPhoneNo.getText()), txtBussAddress.getText(), Long.parseLong(txtBussPhoneNo.getText()), txtFaxMachineNo.getText(), Long.parseLong(txtCellularPhoneNo.getText()), txtPagerNo.getText());
                model.addRow(new Object[]{ab.Name, ab.Address, ab.PhoneNo, ab.BussinessAddress, ab.BussinessPhoneNo, ab.FaxMachineNo, ab.CellularPhoneNo, ab.PagerNo});
                this.addressBookList.add(ab);
                System.out.print("Row Added ==> " + ab);
            }
            this.clearFields();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tblAddressBookList.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(this, "No row is selected! Please select any row", "Select Row", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tblAddressBookList.getModel();
            System.out.print("Deleted row ==> " + this.addressBookList.get(row));
            this.addressBookList.remove(row);
            model.removeRow(row);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblAddressBookListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddressBookListMouseClicked

        int row = tblAddressBookList.getSelectedRow();
        System.out.print(this.addressBookList.get(row));
        txtName.setText(this.addressBookList.get(row).Name);
        txtAddress.setText(this.addressBookList.get(row).Address);
        txtPhoneNo.setText(String.valueOf(this.addressBookList.get(row).PhoneNo));
        txtBussAddress.setText(this.addressBookList.get(row).BussinessAddress);
        txtBussPhoneNo.setText(String.valueOf(this.addressBookList.get(row).BussinessPhoneNo));
        txtFaxMachineNo.setText(this.addressBookList.get(row).FaxMachineNo);
        txtCellularPhoneNo.setText(String.valueOf(this.addressBookList.get(row).CellularPhoneNo));
        txtPagerNo.setText(this.addressBookList.get(row).PagerNo);
        this.index = row;
    }//GEN-LAST:event_tblAddressBookListMouseClicked

    private void clearFields() {
        txtName.setText("");
        txtAddress.setText("");
        txtPhoneNo.setText("");
        txtBussAddress.setText("");
        txtBussPhoneNo.setText("");
        txtFaxMachineNo.setText("");
        txtCellularPhoneNo.setText("");
        txtPagerNo.setText("");
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblAddressBookList;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBussAddress;
    private javax.swing.JTextField txtBussPhoneNo;
    private javax.swing.JTextField txtCellularPhoneNo;
    private javax.swing.JTextField txtFaxMachineNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPagerNo;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
}
