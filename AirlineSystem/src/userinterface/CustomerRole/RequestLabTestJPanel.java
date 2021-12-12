/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Airline.Airline;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel mainScreen;
    private UserAccount userAccount;
    private EcoSystem system;
    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestLabTestJPanel(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.mainScreen = mainScreen;
        this.userAccount = userAccount;
        this.system = system;
        populateFlt();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFlt = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("View Your Flight:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 170, 30));

        tblFlt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight_id", "Original Place", "Destination Place", "Airplane_id.", "Departure Time", "Arriving Time", "Airplane_id.", "Airline Company", "Order_id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFlt);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 950, 230));

        btnDelete.setText("Cancel");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 190, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        mainScreen.remove(this);
        Component[] componentArray = mainScreen.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        CardLayout layout = (CardLayout)mainScreen.getLayout();
        layout.previous(mainScreen);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlt.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this,"Please select a row from the table to cancel","Warning",JOptionPane.WARNING_MESSAGE);
        }else{
            for (Airline al : system.getAirlineDirectory().getAirlineList()){
                for (Order od : al.getOrderList()){
                    if(od.getOrder_id().equals((String) tblFlt.getValueAt(selectedRow, 6))){
                        al.deleteOrder(od.toString());
                        for(Customer cust : system.getCustomerDirectory().getCustList()){
                                if(cust.getName().equals(userAccount.getName())){
                                    cust.deleteOrder(od);
                                }
                            }
                    }
                }
            }
        }
        populateFlt();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFlt;
    // End of variables declaration//GEN-END:variables

    private void populateFlt() {
        DefaultTableModel model = (DefaultTableModel) tblFlt.getModel();
        model.setRowCount(0);
        for (Airline al : system.getAirlineDirectory().getAirlineList()) {
            for(Order od : al.getOrderList()){
                if(od.getCustomerName().equals(userAccount.getName())){
                    Object[] row = new Object[7];
                    row[0] = od.getFlight_id();
                    row[1] = od.getOriginalplace();
                    row[2] = od.getDestinationplace();
                    row[3] = od.getAirplane_id();
                    row[4] = od.getCost();
                    row[5] = al;
                    row[6] = od.getOrder_id();
                    model.addRow(row);
                }
            }
        }
    }
}
