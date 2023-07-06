
package Log;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class JFrameLogIn extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    

    public JFrameLogIn() throws SQLException {
        this.conn = null;

        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
        
    }

   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        MainPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Txtname = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        Jname = new javax.swing.JLabel();
        Jpass = new javax.swing.JLabel();
        JbLogin = new javax.swing.JButton();
        Option = new javax.swing.JLabel();
        jcombox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        signUp = new javax.swing.JButton();
        jbCAncel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("MOTORPH"); // NOI18N

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 153, 153)));
        MainPanel.setDoubleBuffered(false);
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Please enter your username and password");
        MainPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 269, 247, -1));

        Txtname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        MainPanel.add(Txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 292, 204, 30));

        txtpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        MainPanel.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 328, 204, 30));

        Jname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Jname.setForeground(new java.awt.Color(255, 255, 255));
        Jname.setText("Username:");
        MainPanel.add(Jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 291, 90, 30));

        Jpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Jpass.setForeground(new java.awt.Color(255, 255, 255));
        Jpass.setText("Password:");
        MainPanel.add(Jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 332, 84, -1));

        JbLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JbLogin.setText("LOGIN");
        JbLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JbLogin.setFocusable(false);
        JbLogin.setVerifyInputWhenFocusTarget(false);
        JbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbLoginActionPerformed(evt);
            }
        });
        MainPanel.add(JbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 415, 80, -1));

        Option.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Option.setForeground(new java.awt.Color(255, 255, 255));
        Option.setText("Select User:");
        MainPanel.add(Option, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 367, 82, 30));

        jcombox1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jcombox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "Employee" }));
        jcombox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 2, 3)));
        jcombox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jcombox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombox1ActionPerformed(evt);
            }
        });
        MainPanel.add(jcombox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 364, 204, 30));

        jPanel1.setLayout(null);
        MainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 255, 0, 0));

        jPanel2.setLayout(null);
        MainPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 262, 0, 0));

        jPanel3.setLayout(null);

        signUp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signUp.setText("SIGN UP");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        jPanel3.add(signUp);
        signUp.setBounds(20, 550, 90, 23);

        jbCAncel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbCAncel.setText("CANCEL");
        jbCAncel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbCAncel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCAncel.setFocusable(false);
        jbCAncel.setVerifyInputWhenFocusTarget(false);
        jbCAncel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCAncelActionPerformed(evt);
            }
        });
        jPanel3.add(jbCAncel);
        jbCAncel.setBounds(410, 550, 80, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Log/images/LogInFrameBackground.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 510, 590);

        MainPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 510, 590));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel2.setText("MOTOR PH");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 95, 31));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("MOTORPH");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCAncelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCAncelActionPerformed
        // TODO add your handling code here:
        //cancel
        System.exit(0);
    }//GEN-LAST:event_jbCAncelActionPerformed

    private void jcombox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombox1ActionPerformed

    private void JbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbLoginActionPerformed
        //Login Button
        String Jname = Txtname.getText();
        String Jpass = txtpass.getText();
        String Option = jcombox1.getSelectedItem().toString();

        if(Jname.equals("")||Jpass.equals("")||Option.equals("Select")){
            JOptionPane.showMessageDialog(rootPane, "Some Fields are Empty", "Error", 1);
        }else{
            try{
                conn = db.getConnection();
                ps = conn.prepareStatement("SELECT * FROM employee WHERE username=? and password=? and Options=?");
                ps.setString(1, Jname);
                ps.setString(2, Jpass);
                ps.setString(3, Option);
                rs= ps.executeQuery();

               if(rs.next()){
               int id = rs.getInt(1);
               Emp.empID = id;
               
                    String s1 = rs.getString("Options");
                    String un = rs.getString("username");

                    if(Option.equalsIgnoreCase("Admin")&& s1.equalsIgnoreCase("Admin")){
                        AdminPage ad =  new AdminPage(un);
                        ad.setVisible(true);
                        setVisible(false);
                    }
                    if(Option.equalsIgnoreCase("Employee")&& s1.equalsIgnoreCase("Employee")){
                        EmployeePage ep =  new EmployeePage(un);
                        ep.setVisible(true);
                        setVisible(false);
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "username or password Not Matched", "Login Error", 1);
                }

            }catch(Exception ex){
                System.out.println(""+ex);
            }
        }

    }//GEN-LAST:event_JbLoginActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
  
         SignupData x = null;
        try {
            x = new SignupData();
        } catch (SQLException ex) {
            Logger.getLogger(JFrameLogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
            x.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_signUpActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameLogIn().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrameLogIn.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbLogin;
    private javax.swing.JLabel Jname;
    private javax.swing.JLabel Jpass;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Option;
    private javax.swing.JTextField Txtname;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbCAncel;
    private javax.swing.JComboBox<String> jcombox1;
    private javax.swing.JButton signUp;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}

