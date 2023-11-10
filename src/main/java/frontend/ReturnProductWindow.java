
package frontend;

import backend.EmployeeRole;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ReturnProductWindow extends javax.swing.JFrame implements Node {
    private Navigation windowNavigation;
    private Node parent;
    private EmployeeRole employee;


    public ReturnProductWindow(Navigation windowNavigation , Node parent, EmployeeRole employee ) {
        initComponents();
        this.parent=parent;
        this.windowNavigation=windowNavigation;
        this.setTitle("Return Product");
        this.employee = employee;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jDateChooserReturnDate = new com.toedter.calendar.JDateChooser();
        jLabelCustomerSSN = new javax.swing.JLabel();
        jLabelProductId = new javax.swing.JLabel();
        jLabelPurchaseDate = new javax.swing.JLabel();
        jLabelReturnDate = new javax.swing.JLabel();
        jTextFieldProductId = new javax.swing.JTextField();
        jDateChooserPurchaseDate = new com.toedter.calendar.JDateChooser();
        jTextFieldCustomerSSN = new javax.swing.JTextField();
        ReturnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelCustomerSSN.setBackground(new java.awt.Color(0, 255, 102));
        jLabelCustomerSSN.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelCustomerSSN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCustomerSSN.setText("CustomerSSN");
        jLabelCustomerSSN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelCustomerSSN.setOpaque(true);

        jLabelProductId.setBackground(new java.awt.Color(0, 255, 102));
        jLabelProductId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelProductId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProductId.setText("ProductID");
        jLabelProductId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelProductId.setOpaque(true);

        jLabelPurchaseDate.setBackground(new java.awt.Color(0, 255, 102));
        jLabelPurchaseDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelPurchaseDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPurchaseDate.setText("Purchase Date");
        jLabelPurchaseDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelPurchaseDate.setOpaque(true);

        jLabelReturnDate.setBackground(new java.awt.Color(0, 255, 102));
        jLabelReturnDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelReturnDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReturnDate.setText("Return Date");
        jLabelReturnDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelReturnDate.setOpaque(true);

        jTextFieldProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductIdActionPerformed(evt);
            }
        });

        jTextFieldCustomerSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerSSNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPurchaseDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooserPurchaseDate, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jTextFieldProductId)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCustomerSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCustomerSSN)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCustomerSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCustomerSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPurchaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserPurchaseDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooserReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        ReturnButton.setBackground(new java.awt.Color(51, 51, 51));
        ReturnButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ReturnButton.setForeground(new java.awt.Color(255, 255, 255));
        ReturnButton.setText("Return");
        ReturnButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(ReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCustomerSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerSSNActionPerformed

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        String CustomerSSN = jTextFieldCustomerSSN.getText();
        String ProductId = jTextFieldProductId.getText();
        Date PurchaseDate = jDateChooserPurchaseDate.getDate();
        Date ReturnDate = jDateChooserReturnDate.getDate();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");
        //LocalDate date = LocalDate.parse((CharSequence) PurchaseDate, formatter);
        SimpleDateFormat date=new SimpleDateFormat("dd-M-yyyy");
        
        if(CustomerSSN.isEmpty() || ProductId.isEmpty())
            JOptionPane.showMessageDialog(null, "Some fields are empty" , "Alert!", JOptionPane.ERROR_MESSAGE);
        else 
        {
          if(employee.returnProduct(CustomerSSN, ProductId, LocalDate.parse( date.format(PurchaseDate), formatter ) , LocalDate.parse( date.format(ReturnDate), formatter )) > 0){
           
           jTextFieldCustomerSSN.setText("");
           jTextFieldProductId.setText("");
           jDateChooserPurchaseDate.setDate(null);
           jDateChooserReturnDate.setDate(null);
          
            JOptionPane.showMessageDialog(null, "The customer with SSN = "+ CustomerSSN +" should be paid the price of the returned product");
            windowNavigation.setNavigation((JFrame)parent, this);
          }else{
            JOptionPane.showMessageDialog(null, "Invalid Return process!","Failure!",JOptionPane.ERROR_MESSAGE);
          }
        }
        
    }//GEN-LAST:event_ReturnButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        windowNavigation.setNavigation((JFrame)this.getParentNode(), this);
    }//GEN-LAST:event_formWindowClosing

    private void jTextFieldProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductIdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ReturnProductWindow(null,null,null).setVisible(true);
            }
        });
    }

    @Override
    public Node getParentNode() {
      return this.parent;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReturnButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooserPurchaseDate;
    private com.toedter.calendar.JDateChooser jDateChooserReturnDate;
    private javax.swing.JLabel jLabelCustomerSSN;
    private javax.swing.JLabel jLabelProductId;
    private javax.swing.JLabel jLabelPurchaseDate;
    private javax.swing.JLabel jLabelReturnDate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCustomerSSN;
    private javax.swing.JTextField jTextFieldProductId;
    // End of variables declaration//GEN-END:variables
}
