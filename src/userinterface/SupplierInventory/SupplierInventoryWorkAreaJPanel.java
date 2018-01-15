/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierInventory;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SupplierInventoryOrganization;
import Business.RawMaterial.RawMaterial;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SupplierWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AMY
 */
public class SupplierInventoryWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private SupplierInventoryOrganization supplierInventoryOrganization;

    /**
     * Creates new form SupplierInventoryWorkAreaJPanel
     */
    public SupplierInventoryWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,
            Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.supplierInventoryOrganization = (SupplierInventoryOrganization) organization;
        this.enterprise = enterprise;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : supplierInventoryOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            SupplierWorkRequest supplierWorkRequest = (SupplierWorkRequest) request;
            row[0] = supplierWorkRequest;
            row[1] = supplierWorkRequest.getReceiver();

            if (supplierWorkRequest.getRawMaterial() != null) {
                row[2] = supplierWorkRequest.getRawMaterial().getName();
                row[3] = supplierWorkRequest.getRawMaterial().getQuantity();
            } else {
                row[2] = null;
                row[3] = null;
            }
            row[4] = request.getStatus();

            model.addRow(row);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        acceptBtn = new javax.swing.JButton();
        addRawMaterialBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTable.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Receiver", "Raw Material", "Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(requestTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 500, 143));

        acceptBtn.setBackground(new java.awt.Color(0, 102, 102));
        acceptBtn.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        acceptBtn.setForeground(new java.awt.Color(255, 255, 255));
        acceptBtn.setText("CLICK TO ACCEPT");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });
        add(acceptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        addRawMaterialBtn.setBackground(new java.awt.Color(0, 102, 102));
        addRawMaterialBtn.setFont(new java.awt.Font("Chalkboard SE", 0, 12)); // NOI18N
        addRawMaterialBtn.setForeground(new java.awt.Color(255, 255, 255));
        addRawMaterialBtn.setText("ADD RAW MATERIALS");
        addRawMaterialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRawMaterialBtnActionPerformed(evt);
            }
        });
        add(addRawMaterialBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 210, -1));

        jLabel4.setFont(new java.awt.Font("Chalkboard SE", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("WELCOME TO SUPPLIER INVENTORY WORKAREA");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row ");
            return;
        }
        boolean isValid = true;
        SupplierWorkRequest request = (SupplierWorkRequest) requestTable.getValueAt(selectedRow, 0);
        RawMaterial rawMaterialRequested = request.getRawMaterial();
        String name = rawMaterialRequested.getName();
        int qty = rawMaterialRequested.getQuantity();
        RawMaterial.RawMaterialType type = rawMaterialRequested.getRawMaterialType();
        int count=0;
        for (RawMaterial rawMaterial : supplierInventoryOrganization.getRawMaterialsDirectory().getRawMaterialList()) {
            if (rawMaterial.getRawMaterialType() == type && rawMaterial.getName().equals(name)) {
                count++;
                if (qty > rawMaterial.getQuantity()) {
                    isValid = false;
                    break;
                }
            }
        }

        if (isValid && count > 0) {
            request.setReceiver(userAccount);
            request.setStatus("Completed");
            // update the quantity in the inventory
            for (RawMaterial rawMaterial : supplierInventoryOrganization.getRawMaterialsDirectory().getRawMaterialList()) {
                if (rawMaterial.getRawMaterialType() == type && rawMaterial.getName().equals(name)) {
                    int q = rawMaterial.getQuantity();
                    q = q - qty;
                    rawMaterial.setQuantity(q);
                    break;
                }
            }
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Quantity not available");
        }

    }//GEN-LAST:event_acceptBtnActionPerformed

    private void addRawMaterialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRawMaterialBtnActionPerformed
        // TODO add your handling code here:
        AddRawMaterialJPanel addRawMaterialJPanel = new AddRawMaterialJPanel(userProcessContainer, supplierInventoryOrganization);
        userProcessContainer.add("addRawMaterialJPanel", addRawMaterialJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addRawMaterialBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton addRawMaterialBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
}