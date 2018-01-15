/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Farmer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FarmerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CarrierWorkRequest;
import Business.WorkQueue.ComplaintWorkRequest;
import Business.WorkQueue.DoctorTreatmentWorkRequest;
import Business.WorkQueue.EducationEventsWorkRequest;
import Business.WorkQueue.FreeHandBooksRequest;
import Business.WorkQueue.InterestFreeLoanWorkRequest;
import Business.WorkQueue.SellingWorkRequest;
import Business.WorkQueue.SupplierWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class FarmerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private FarmerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    EcoSystem business;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public FarmerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,
            FarmerOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());

        populateRequestTable();
        populateServiceRequestTable();
        populateSellingRequestTable();
        populateEventRequestTable();
        populateInterestFreeLoanRequestTable();
        populateHandBookRequestTable();
        populateTreatmentRequestTable();
        populateComplaintTable();

    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable1.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.CarrierWorkRequest
                //String x = request.getReceiver().getRole().toString();
                if (x.equals("class Business.WorkQueue.SupplierWorkRequest")) {
                    SupplierWorkRequest supplierWorkRequest = (SupplierWorkRequest) request;
                    Object[] row = new Object[4];
                    row[0] = supplierWorkRequest.getReceiver();
                    row[1] = supplierWorkRequest.getStatus();
                    if (supplierWorkRequest.getRawMaterial() != null) {
                        row[2] = supplierWorkRequest.getRawMaterial().getName();
                        row[3] = supplierWorkRequest.getRawMaterial().getQuantity();
                    }

                    model.addRow(row);
                }
            }
        }
    }

    public void populateEventRequestTable() {
        DefaultTableModel model = (DefaultTableModel) educationalRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();

                if (x.equals("class Business.WorkQueue.EducationEventsWorkRequest")) {
                    EducationEventsWorkRequest educationEventsWorkRequest = (EducationEventsWorkRequest) request;
                    Object[] row = new Object[8];
                    row[0] = educationEventsWorkRequest.getReceiver();
                    if (educationEventsWorkRequest.getEvent() != null) {
                        row[1] = educationEventsWorkRequest.getEvent().getEventName();
                        row[2] = educationEventsWorkRequest.getEvent().getEventType();
                        row[3] = educationEventsWorkRequest.getEvent().getEventDate();
                        row[4] = educationEventsWorkRequest.getEvent().getTime();
                        row[5] = educationEventsWorkRequest.getEvent().getVenue();
                        row[6] = educationEventsWorkRequest.getClaimedMoney();
                    }
                    row[7] = educationEventsWorkRequest.getStatus();

                    model.addRow(row);
                }
            }
        }

    }

    public void populateSellingRequestTable() {
        DefaultTableModel model = (DefaultTableModel) sellingWorkRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.CarrierWorkRequest
                //String x = request.getReceiver().getRole().toString();
                if (x.equals("class Business.WorkQueue.SellingWorkRequest")) {
                    SellingWorkRequest sellingWorkRequest = (SellingWorkRequest) request;
                    Object[] row = new Object[10];
                    row[0] = sellingWorkRequest;
                    row[1] = sellingWorkRequest.getReceiver();
                    row[2] = sellingWorkRequest.getStatus();
                    row[3] = sellingWorkRequest.getSource();
                    row[4] = sellingWorkRequest.getDestination();
                    row[5] = sellingWorkRequest.getProductName();
                    row[6] = sellingWorkRequest.getQuantity();
                    row[7] = sellingWorkRequest.getTransportationCost();
                    row[8] = sellingWorkRequest.getCommission();
                    row[9] = sellingWorkRequest.getSellingPrice();

                    model.addRow(row);
                }
            }
        }
    }

    public void populateServiceRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblCarrierRequest1.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.CarrierServiceRole
                if (x.equals("class Business.WorkQueue.CarrierWorkRequest")) {
                    CarrierWorkRequest carrierWorkRequest = (CarrierWorkRequest) request;
                    Object[] row = new Object[5];
                    row[0] = carrierWorkRequest.getReceiver();
                    row[1] = carrierWorkRequest.getStatus();
                    row[2] = carrierWorkRequest.getTypeOfProvider();
                    row[3] = carrierWorkRequest.getTypeOfPlan();
                    row[4] = carrierWorkRequest.getCost();
                    model.addRow(row);
                }
            }

        }
    }

    public void populateInterestFreeLoanRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblInterestFreeLoan.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.CarrierServiceRole
                if (x.equals("class Business.WorkQueue.InterestFreeLoanWorkRequest")) {
                    InterestFreeLoanWorkRequest interestFreeLoanWorkRequest = (InterestFreeLoanWorkRequest) request;
                    Object[] row = new Object[5];
                    row[0] = interestFreeLoanWorkRequest.getReceiver();
                    row[1] = interestFreeLoanWorkRequest.getStatus();
                    row[2] = interestFreeLoanWorkRequest.getName();
                    row[3] = interestFreeLoanWorkRequest.getAmount();
                    row[4] = interestFreeLoanWorkRequest.getMonthlyIncome();
                    model.addRow(row);
                }
            }

        }
    }

    public void populateHandBookRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblFreeHandBooks.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                if (x.equals("class Business.WorkQueue.FreeHandBooksRequest")) {
                    FreeHandBooksRequest FreeHandBooksWorkRequest = (FreeHandBooksRequest) request;
                    Object[] row = new Object[3];
                    row[0] = FreeHandBooksWorkRequest.getName();
                    row[1] = FreeHandBooksWorkRequest.getDescription();
                    row[2] = FreeHandBooksWorkRequest.getStatus();

                    model.addRow(row);
                }
            }

        }

    }

    public void populateTreatmentRequestTable() {
        DefaultTableModel model = (DefaultTableModel) treatmentJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.CarrierWorkRequest
                //String x = request.getReceiver().getRole().toString();
                if (x.equals("class Business.WorkQueue.DoctorTreatmentWorkRequest")) {

                    // WorkRequest supplierWorkRequest = (SupplierWorkRequest) request;
                    DoctorTreatmentWorkRequest docRequest = (DoctorTreatmentWorkRequest) request;

                    Object[] row = new Object[9];
                    // row[0] = request.getDate();

                    // LocalDate localDate = LocalDate.now();
                    row[0] = docRequest; //diseaseName
                    row[1] = docRequest.getDate();
                    // row[2] = docRequest.getReceiver();
                    row[2] = docRequest.getStatus();
                    String result = ((DoctorTreatmentWorkRequest) request).getTestResult();
                    row[3] = result == null ? "Waiting" : result;
                    // row[4] = request.getResults();
                    row[4] = docRequest.getFreeMed();
                    row[5] = docRequest.getQuantity();
                    row[6] = docRequest.getAppointmentDate();
                    row[7] = docRequest.getComments();

                    model.addRow(row);

                }
            }
        }
    }

    public void populateComplaintTable() {
        DefaultTableModel model = (DefaultTableModel) complaintRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request.getClass() != null) {
                String x = request.getClass().toString();
                //Business.WorkQueue.ComplaintWorkRequest
                //String x = request.getReceiver().getRole().toString();

                if (x.equals("class Business.WorkQueue.ComplaintWorkRequest")) {

                    ComplaintWorkRequest complaintWorkRequest = (ComplaintWorkRequest) request;

                    Object[] row = new Object[4];
                    row[0] = complaintWorkRequest;
                    row[1] = complaintWorkRequest.getDate();
                    row[2] = complaintWorkRequest.getComplaintMessage();
                    //  row[3] = complaintWorkRequest.getReceiver();
                    row[3] = complaintWorkRequest.getStatus();

                    model.addRow(row);
                }
            }
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
        sellingWorkRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        btnRequestService = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        educationalRequestJTable = new javax.swing.JTable();
        requestSellingButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        eventRequestBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCarrierRequest1 = new javax.swing.JTable();
        btnInterestFreeLoan = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblInterestFreeLoan = new javax.swing.JTable();
        btnViewFreeHandbooks = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblFreeHandBooks = new javax.swing.JTable();
        CompaintJButton = new javax.swing.JButton();
        requestTestJButton1 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        treatmentJTable = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        complaintRequestJTable = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sellingWorkRequestJTable.setFont(new java.awt.Font("Chalkboard", 0, 12)); // NOI18N
        sellingWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Receiver", "Status", "Source", "Destination", "Product Name", "Quantity", "Transportation Cost", "Third party Commision", "Sold Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sellingWorkRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1160, 97));

        requestTestJButton.setBackground(new java.awt.Color(0, 102, 102));
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Request  Raw Material");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, -1));

        enterpriseLabel.setBackground(new java.awt.Color(0, 102, 102));
        enterpriseLabel.setFont(new java.awt.Font("Chalkboard SE", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseLabel.setText("FARMER DASHBOARD ");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 240, 30));

        btnRequestService.setBackground(new java.awt.Color(0, 102, 102));
        btnRequestService.setForeground(new java.awt.Color(255, 255, 255));
        btnRequestService.setText("Request Service ");
        btnRequestService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestServiceActionPerformed(evt);
            }
        });
        add(btnRequestService, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 220, -1));

        educationalRequestJTable.setFont(new java.awt.Font("Chalkboard", 0, 12)); // NOI18N
        educationalRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receiver", "Event Name", "Event type", "Event Date", "Event Time", "Venue", "Allowance", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(educationalRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 748, 100));

        requestSellingButton.setBackground(new java.awt.Color(0, 102, 102));
        requestSellingButton.setForeground(new java.awt.Color(255, 255, 255));
        requestSellingButton.setText("Request Selling");
        requestSellingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestSellingButtonActionPerformed(evt);
            }
        });
        add(requestSellingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 230, -1));

        workRequestJTable1.setFont(new java.awt.Font("Chalkboard", 0, 12)); // NOI18N
        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Receiver", "Status", "Raw Material", "Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestJTable1);
        if (workRequestJTable1.getColumnModel().getColumnCount() > 0) {
            workRequestJTable1.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 540, 97));

        eventRequestBtn.setBackground(new java.awt.Color(0, 102, 102));
        eventRequestBtn.setForeground(new java.awt.Color(255, 255, 255));
        eventRequestBtn.setText("View Educational Events");
        eventRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventRequestBtnActionPerformed(evt);
            }
        });
        add(eventRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 230, -1));

        tblCarrierRequest1.setFont(new java.awt.Font("Chalkboard", 0, 12)); // NOI18N
        tblCarrierRequest1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receiver", "Status", "Provider Type", "Plan type", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblCarrierRequest1);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 590, 100));

        btnInterestFreeLoan.setBackground(new java.awt.Color(0, 102, 102));
        btnInterestFreeLoan.setForeground(new java.awt.Color(255, 255, 255));
        btnInterestFreeLoan.setText("Request Interest Free Loan");
        btnInterestFreeLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterestFreeLoanActionPerformed(evt);
            }
        });
        add(btnInterestFreeLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 200, -1));

        tblInterestFreeLoan.setFont(new java.awt.Font("Chalkboard", 0, 12)); // NOI18N
        tblInterestFreeLoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receiver", "Status", "Sender", "Loan Amount", "Monthly Income"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblInterestFreeLoan);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 550, 90));

        btnViewFreeHandbooks.setBackground(new java.awt.Color(0, 102, 102));
        btnViewFreeHandbooks.setForeground(new java.awt.Color(255, 255, 255));
        btnViewFreeHandbooks.setText("View Free HandBooks");
        btnViewFreeHandbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFreeHandbooksActionPerformed(evt);
            }
        });
        add(btnViewFreeHandbooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 260, -1));

        tblFreeHandBooks.setFont(new java.awt.Font("Chalkboard", 0, 12)); // NOI18N
        tblFreeHandBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblFreeHandBooks);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 390, 100));

        CompaintJButton.setBackground(new java.awt.Color(0, 102, 102));
        CompaintJButton.setForeground(new java.awt.Color(255, 255, 255));
        CompaintJButton.setText("Complaint Status");
        CompaintJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompaintJButtonActionPerformed(evt);
            }
        });
        add(CompaintJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 240, -1));

        requestTestJButton1.setBackground(new java.awt.Color(0, 102, 102));
        requestTestJButton1.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton1.setText("Request Treatment");
        requestTestJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButton1ActionPerformed(evt);
            }
        });
        add(requestTestJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 210, -1));

        treatmentJTable.setFont(new java.awt.Font("Chalkboard", 0, 12)); // NOI18N
        treatmentJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Disease/Symptoms", "Date", "Status", "Result", "Free Medicines Given", "Quantity", "Next Appointmment Date", "Other Comments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(treatmentJTable);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 1160, 90));

        complaintRequestJTable.setFont(new java.awt.Font("Chalkboard", 0, 12)); // NOI18N
        complaintRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DEPARTMENT", "DATE COMPLAINT FILED", "COMPLAINT MESSAGE", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(complaintRequestJTable);

        add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, 550, 90));

        BackBtn.setBackground(new java.awt.Color(0, 102, 102));
        BackBtn.setFont(new java.awt.Font("Chalkboard SE", 1, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("BACK");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestRawMaterialJPanel", new RequestRawMaterialJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void btnRequestServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestServiceActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestServiceProviderJPanel", new RequestServiceProviderJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestServiceActionPerformed

    private void requestSellingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestSellingButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestSellingJPanel", new RequestSellingJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestSellingButtonActionPerformed

    private void eventRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventRequestBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestEventJPanel", new RequestEventJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_eventRequestBtnActionPerformed

    private void btnInterestFreeLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterestFreeLoanActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestInterestFreeLoanJPanel", new RequestInterestFreeLoanJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnInterestFreeLoanActionPerformed

    private void btnViewFreeHandbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFreeHandbooksActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestFreeHandBooksJPanel", new RequestFreeHandBooksJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewFreeHandbooksActionPerformed

    private void CompaintJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompaintJButtonActionPerformed
        // TODO add your handling code here:

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("FarmerCallCentreComplaintsWorkAreaJPanel", new FarmerCallCentreComplaintsWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_CompaintJButtonActionPerformed

    private void requestTestJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("FarmertoDoctorWorkAreaJPanel", new FarmertoDoctorWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestTestJButton1ActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CompaintJButton;
    private javax.swing.JButton btnInterestFreeLoan;
    private javax.swing.JButton btnRequestService;
    private javax.swing.JButton btnViewFreeHandbooks;
    private javax.swing.JTable complaintRequestJTable;
    private javax.swing.JTable educationalRequestJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton eventRequestBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JButton requestSellingButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton requestTestJButton1;
    private javax.swing.JTable sellingWorkRequestJTable;
    private javax.swing.JTable tblCarrierRequest1;
    private javax.swing.JTable tblFreeHandBooks;
    private javax.swing.JTable tblInterestFreeLoan;
    private javax.swing.JTable treatmentJTable;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables
}
