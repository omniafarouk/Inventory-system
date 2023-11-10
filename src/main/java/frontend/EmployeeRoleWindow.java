package frontend;

import backend.EmployeeRole;
import javax.swing.JFrame;

public class EmployeeRoleWindow extends javax.swing.JFrame implements Node{
    
    private Navigation windowNavigation;
    private Node parent;
    EmployeeRole employee;
    
    public EmployeeRoleWindow(Navigation windowNavigation, Node parent) {
        
        initComponents();
        this.windowNavigation=windowNavigation;
        this.parent = parent;
        this.setTitle("Employee Role");
        employee= new EmployeeRole();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddProductButton = new javax.swing.JButton();
        PurchaseProductButton = new javax.swing.JButton();
        ViewProductButton = new javax.swing.JButton();
        ViewPurchasedProductsButton = new javax.swing.JButton();
        ReturnProductButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        AddProductButton.setBackground(new java.awt.Color(0, 0, 0));
        AddProductButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddProductButton.setForeground(new java.awt.Color(255, 255, 255));
        AddProductButton.setText("Add Product");
        AddProductButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        AddProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductButtonActionPerformed(evt);
            }
        });

        PurchaseProductButton.setBackground(new java.awt.Color(0, 0, 0));
        PurchaseProductButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PurchaseProductButton.setForeground(new java.awt.Color(255, 255, 255));
        PurchaseProductButton.setText("Purchase Product");
        PurchaseProductButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        PurchaseProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseProductButtonActionPerformed(evt);
            }
        });

        ViewProductButton.setBackground(new java.awt.Color(0, 0, 0));
        ViewProductButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ViewProductButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewProductButton.setText("View Products ");
        ViewProductButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        ViewProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProductButtonActionPerformed(evt);
            }
        });

        ViewPurchasedProductsButton.setBackground(new java.awt.Color(0, 0, 0));
        ViewPurchasedProductsButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ViewPurchasedProductsButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewPurchasedProductsButton.setText("View Purchased Products ");
        ViewPurchasedProductsButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        ViewPurchasedProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPurchasedProductsButtonActionPerformed(evt);
            }
        });

        ReturnProductButton.setBackground(new java.awt.Color(0, 0, 0));
        ReturnProductButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ReturnProductButton.setForeground(new java.awt.Color(255, 255, 255));
        ReturnProductButton.setText("Return Product ");
        ReturnProductButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        ReturnProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnProductButtonActionPerformed(evt);
            }
        });

        LogoutButton.setBackground(new java.awt.Color(0, 0, 0));
        LogoutButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setText("Logout");
        LogoutButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReturnProductButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewPurchasedProductsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PurchaseProductButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewProductButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(AddProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ViewProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PurchaseProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ViewPurchasedProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReturnProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductButtonActionPerformed
            AddProductWindow addProduct= new AddProductWindow(this.windowNavigation, this, employee);
           this.windowNavigation.setNavigation(addProduct, this);
    }//GEN-LAST:event_AddProductButtonActionPerformed

    private void PurchaseProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseProductButtonActionPerformed
         PurchaseProductWindow PurchaseProduct= new PurchaseProductWindow(this.windowNavigation, this, employee);
           this.windowNavigation.setNavigation(PurchaseProduct, this);
    }//GEN-LAST:event_PurchaseProductButtonActionPerformed

    private void ViewProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProductButtonActionPerformed
         ViewProducts viewProductsWindow = new ViewProducts(windowNavigation, this, employee.getListOfProducts());
        windowNavigation.setNavigation(viewProductsWindow, this);
    }//GEN-LAST:event_ViewProductButtonActionPerformed

    private void ViewPurchasedProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPurchasedProductsButtonActionPerformed
        ViewPurchasedProducts viewPurchasedProductsWindow = new ViewPurchasedProducts(windowNavigation, this,employee.getListOfPurchasingOperations());
        windowNavigation.setNavigation(viewPurchasedProductsWindow, this);
    }//GEN-LAST:event_ViewPurchasedProductsButtonActionPerformed

    private void ReturnProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnProductButtonActionPerformed
        ReturnProductWindow ReturnProduct= new ReturnProductWindow(this.windowNavigation, this, employee);
           this.windowNavigation.setNavigation(ReturnProduct, this);
    }//GEN-LAST:event_ReturnProductButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
       employee.logout();
       windowNavigation.setNavigation((JFrame)this.getParentNode(), this);
    }//GEN-LAST:event_LogoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EmployeeRoleWindow(null,null).setVisible(true);
            }
        });
    }

    @Override
    public Node getParentNode() {
        return this.parent;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProductButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton PurchaseProductButton;
    private javax.swing.JButton ReturnProductButton;
    private javax.swing.JButton ViewProductButton;
    private javax.swing.JButton ViewPurchasedProductsButton;
    // End of variables declaration//GEN-END:variables
}
