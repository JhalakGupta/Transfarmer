/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FreeHandBooksRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jhalak
 */
public class RequestFreeHandBooksJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

    /**
     * Creates new form RequestFreeHandBooksJPanel
     */
    public RequestFreeHandBooksJPanel(JPanel userProcessContainer, UserAccount account,
            Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        populateHandBooksTable();
        //tblHandBooks.setValueAt("Hello", 0, 1);
    }
    String name = null;
    String description = null;
    String category = null;

    //ImageIcon icon = new ImageIcon("image.gif");
    // tblHandBooks.setValueAt(icon, row, column);
    public void populateHandBooksTable() {
        try {

            if (cmbCategory.getSelectedItem().equals("Agriculture")) {
                tblHandBooks.setValueAt("Agroecology", 0, 0);
                name = "Agroecology";
                tblHandBooks.setValueAt("Agriculture is culture of plants and animals \n "
                        + "for production of food and raw materials.", 0, 1);
                description = "Agriculture is culture of plants and animals for production of food, fiber, fuel, raw materials etc";
                tblHandBooks.setValueAt(" Agriculture", 0, 2);
                category = " Agriculture";

                tblHandBooks.setValueAt("Agriculture Production", 1, 0);
                name = "Agriculture Production";
                tblHandBooks.setValueAt("A sustainable agricultural production system which will have the least impact on the environment and give drastic increase in the crops", 1, 1);
                description = "A sustainable agricultural production system which will have the least impact on the environment and give drastic increase in the crops";
                tblHandBooks.setValueAt(" Agriculture", 1, 2);
                category = " Agriculture";

                tblHandBooks.setValueAt("Agriculture Engineering", 2, 0);
                name = "Agriculture Engineering";
                tblHandBooks.setValueAt("It is a multidisciplinary study that employs science and technology to all aspects of agricultural production and processing.", 2, 1);
                description = "It is a multidisciplinary study that employs science and technology to all aspects of agricultural production and processing.";
                tblHandBooks.setValueAt(" Agriculture", 2, 2);
                category = " Agriculture";
                
                tblHandBooks.setValueAt("Agriculture Machinery", 3, 0);
                name = "Agriculture Machinery";
                tblHandBooks.setValueAt("Plows and tillers towed by tractors, Power tiller and chisels are used for preparing the soil.", 3, 1);
                description = "Plows and tillers towed by tractors, Power tiller and chisels are used for preparing the soil.";
                tblHandBooks.setValueAt(" Agriculture", 3, 2);
                category = " Agriculture";
                
            } else if (cmbCategory.getSelectedItem().equals("Fertilizers")) {
                tblHandBooks.setValueAt("Fertilizers Basics", 0, 0);
                name = "Fertilizers Basics";
                tblHandBooks.setValueAt("A plant to grow and thrive, it needs a number of different chemical elements.How to use fertlizers efficiently.", 0, 1);
                description = "A plant to grow and thrive, it needs a number of different chemical elements.How to use fertlizers efficiently.";
                tblHandBooks.setValueAt("Fertilizers", 0, 2);
                category = "Fertilizers";

                tblHandBooks.setValueAt("Organic Fertilizers", 1, 0);
                name = "Organic Fertilizers";
                tblHandBooks.setValueAt("Naturally occurring organic fertilizers include animal wastes from meat processing, peat, manure, slurry, and guano.How does it help in farming.", 1, 1);
                description = "Naturally occurring organic fertilizers include animal wastes from meat processing, peat, manure, slurry, and guano.How does it help in farming.";
                tblHandBooks.setValueAt("Fertilizers", 1, 2);
                category = "Fertilizers";

                tblHandBooks.setValueAt("Soil Fertility and Fertilizers", 2, 0);
                name = "Soil Fertility and Fertilizers";
                tblHandBooks.setValueAt("An Introduction to Nutrient Management, provides a thorough understanding of the biological, chemical, and physical properties affecting soil fertility and plant nutrition.", 2, 1);
                description = "An Introduction to Nutrient Management, provides a thorough understanding of the biological, chemical, and physical properties affecting soil fertility and plant nutrition.";
                tblHandBooks.setValueAt("Fertilizers", 2, 2);
                category = "Fertilizers";

            } else if (cmbCategory.getSelectedItem().equals("Pesticides")) {
                tblHandBooks.setValueAt("Effective Use of Pesticides", 0, 0);
                name = "Effective Use of Pesticides";
                tblHandBooks.setValueAt("An introduction to safe and efficient use of pesticides.", 0, 1);
                description = "An introduction to safe and efficient use of pesticides.";
                tblHandBooks.setValueAt("Pesticides", 0, 2);
                category = "Pesticides";

                tblHandBooks.setValueAt("The Pesticide Book", 1, 0);
                name = "The Pesticide Book";
                tblHandBooks.setValueAt("Not just a catalogue of pesticides, rather individual pesticides are used to illustrate various points about chemical properties, usage and application, ecological and environmental interactions.", 1, 1);
                description = "Not just a catalogue of pesticides, rather individual pesticides are used to illustrate various points about chemical properties, usage and application, ecological and environmental interactions.";
                tblHandBooks.setValueAt("Pesticides", 1, 2);
                category = "Pesticides";

                tblHandBooks.setValueAt("", 2, 0);
                tblHandBooks.setValueAt("", 2, 1);
                //description = "Not just a catalogue of pesticides, rather individual pesticides are used to illustrate various points about chemical properties, usage and application, ecological and environmental interactions.";
                tblHandBooks.setValueAt("", 2, 2);
                //category = "Pesticides";

            }

        } catch (Exception e) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHandBooks = new javax.swing.JTable();
        cmbCategory = new javax.swing.JComboBox<>();
        btnRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblHandBooks.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblHandBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "                                                                      Description", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHandBooks);
        if (tblHandBooks.getColumnModel().getColumnCount() > 0) {
            tblHandBooks.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblHandBooks.getColumnModel().getColumn(1).setPreferredWidth(500);
            tblHandBooks.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 113, 685, 90));

        cmbCategory.setFont(new java.awt.Font("Chalkboard SE", 1, 12)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agriculture", "Fertilizers", "Pesticides" }));
        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });
        add(cmbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 222, -1, -1));

        btnRequest.setBackground(new java.awt.Color(0, 102, 102));
        btnRequest.setFont(new java.awt.Font("Chalkboard SE", 1, 12)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnRequest.setText("REQUEST>>");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 221, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Chalkboard SE", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 346, 118, -1));

        jLabel2.setFont(new java.awt.Font("Chalkboard SE", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("FREE HAND BOOK STORE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblHandBooks.getSelectedRow();

        if (selectedRow >= 0) {
            FreeHandBooksRequest freeHandBooksRequest = new FreeHandBooksRequest();
            freeHandBooksRequest.setCategory(category);
            freeHandBooksRequest.setDescription(description);
            freeHandBooksRequest.setName(name);
            freeHandBooksRequest.setStatus("Completed");
            userAccount.getWorkQueue().getWorkRequestList().add(freeHandBooksRequest);
            JOptionPane.showMessageDialog(null, "Your request has been placed successfully");

        } else {
            JOptionPane.showMessageDialog(null, "Choose any handbook.");
            return;
        }
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerWorkAreaJPanel dwjp = (FarmerWorkAreaJPanel) component;
        dwjp.populateHandBookRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        // TODO add your handling code here:
        populateHandBooksTable();
    }//GEN-LAST:event_cmbCategoryActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHandBooks;
    // End of variables declaration//GEN-END:variables
}
