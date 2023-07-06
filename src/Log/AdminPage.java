
package Log;


import java.sql.*;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class AdminPage extends javax.swing.JFrame {
 Connection conn;
 PreparedStatement ps=null;
 ResultSet rs=null;

 
    public AdminPage() throws SQLException {
        initComponents();
        conn = db.getConnection();
        Fetch();
        
       
    }
public AdminPage(String id) {
        initComponents();
        jLabel1.setText(id);
 
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
       
        empID.setText(String.valueOf(Emp.empID));
}
private void Fetch (){
    int q;
     try {
         ps = conn.prepareStatement("SELECT * FROM employee");
         rs = ps.executeQuery();
         ResultSetMetaData rss= rs.getMetaData();
         q = rss.getColumnCount();
         
         DefaultTableModel df= (DefaultTableModel)EmployeeInfo_Table.getModel();
         df.setRowCount(0);
         while(rs.next()){
             Vector v2 = new Vector();
             for (int a=1; q>a; a++){
                 
                 v2.add(rs.getString("ID"));
                 v2.add(rs.getString("name"));
                 v2.add(rs.getString("Position"));
                 v2.add(rs.getString("Options"));
                 v2.add(rs.getString("Birthday"));
                 v2.add(rs.getString("Address"));
                 v2.add(rs.getString("username"));
                 v2.add(rs.getString("BasicSalary"));
                 v2.add(rs.getString("TotalAllowance"));
                 v2.add(rs.getString("Hourlyrate"));
                 v2.add(rs.getString("PhoneNumber"));
                 v2.add(rs.getString("SSSNumber"));
                 v2.add(rs.getString("PhilHealth"));
                 v2.add(rs.getString("PagIbig"));
                 v2.add(rs.getString("TinNumber"));

                 df.addRow(v2);
                 
             }
             
         }
     } catch (SQLException ex) {
         Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
     }
}
public void getEmployeeId (){
     try {
         ps=conn.prepareStatement("SELECT ID From employee");
         rs=ps.executeQuery();
         txt_id.removeAllItems();
         while(rs.next()){
         txt_id.addItem(rs.getString(1));
         }
         
     } catch (SQLException ex) {
         Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
     }
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jb_logout = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Empid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_pnumber = new javax.swing.JTextField();
        jb_search = new javax.swing.JButton();
        jb_add = new javax.swing.JButton();
        jb_clear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_sss = new javax.swing.JTextField();
        txt_phil = new javax.swing.JTextField();
        txt_pag = new javax.swing.JTextField();
        txt_tin = new javax.swing.JTextField();
        txt_position = new javax.swing.JTextField();
        txt_bday = new javax.swing.JTextField();
        txt_adds = new javax.swing.JTextField();
        txt_option = new javax.swing.JTextField();
        txt_allowance = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_rate = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeInfo_Table = new javax.swing.JTable();
        txt_id = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txt_un = new javax.swing.JTextField();
        empID = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jb_Update = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        txt_name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setText("ADMIN");

        jb_logout.setText("Logout");
        jb_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_logoutActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel18.setText("EMPLOYEES RECORD");

        jLabel19.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jLabel19.setText("User: ADMIN:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_logout)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jb_logout)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        Empid.setText("Employee ID:");

        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });

        jLabel4.setText("Name:");

        jLabel5.setText("Position:");

        jLabel6.setText("Address:");

        jLabel7.setText("Birthday:");

        jLabel8.setText("Phone:");

        jLabel9.setText("Allowance:");

        jb_search.setText("Search");
        jb_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_searchActionPerformed(evt);
            }
        });

        jb_add.setText("Add");
        jb_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_addActionPerformed(evt);
            }
        });

        jb_clear.setText("Clear");
        jb_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_clearActionPerformed(evt);
            }
        });

        jLabel10.setText("Options:");

        jLabel2.setText("SSS:");

        jLabel11.setText("PhilHealth Number:");

        jLabel12.setText("Pag-Ibig Number:");

        jLabel13.setText("Tin Number:");

        jLabel14.setText("Basic Salary:");

        txt_pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pagActionPerformed(evt);
            }
        });

        txt_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_positionActionPerformed(evt);
            }
        });

        txt_bday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bdayActionPerformed(evt);
            }
        });

        txt_adds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addsActionPerformed(evt);
            }
        });

        txt_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_optionActionPerformed(evt);
            }
        });

        txt_allowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_allowanceActionPerformed(evt);
            }
        });

        txt_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salaryActionPerformed(evt);
            }
        });

        txt_rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rateActionPerformed(evt);
            }
        });

        jLabel16.setText("Hourly rate:");

        EmployeeInfo_Table.setAutoCreateRowSorter(true);
        EmployeeInfo_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Position", "Role", "Bday", "Add", "Username", "Salary", "Allowance", "Rate", "Phone", "SSS", "Philh", "PagIbig", "Tin"
            }
        ));
        EmployeeInfo_Table.setAutoscrolls(false);
        EmployeeInfo_Table.setColumnSelectionAllowed(true);
        EmployeeInfo_Table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmployeeInfo_Table.setDoubleBuffered(true);
        EmployeeInfo_Table.setDropMode(javax.swing.DropMode.INSERT);
        EmployeeInfo_Table.setRowSelectionAllowed(false);
        EmployeeInfo_Table.setShowGrid(true);
        EmployeeInfo_Table.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(EmployeeInfo_Table);
        EmployeeInfo_Table.getAccessibleContext().setAccessibleName("");

        txt_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10001", "10002", "10003", "10004", "10005", "10006", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " }));
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jLabel15.setText("Username:");

        empID.setText("ID");

        jLabel17.setText("Password:");

        jb_Update.setText("Update");
        jb_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_UpdateActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel20.setText("Remarks:");

        jScrollPane2.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Empid)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(empID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_tin)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_phil, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_sss, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jb_search))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_pnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(46, 46, 46)
                                        .addComponent(txt_pag, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jb_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jb_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jb_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_allowance, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_option)
                                    .addComponent(txt_adds)
                                    .addComponent(txt_bday)
                                    .addComponent(txt_position)
                                    .addComponent(txt_un)
                                    .addComponent(txt_salary, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_rate)
                                    .addComponent(Id)
                                    .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_search)
                    .addComponent(Empid, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_un, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_position, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bday, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_adds, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_option, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_allowance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_rate, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_pnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(jb_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_pag, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(txt_sss, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 41, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jb_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_phil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_tin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_logoutActionPerformed
        // TODO add your handling code here:
        System.exit(0);
            try {
            JFrameLogIn x = new JFrameLogIn();
            x.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {                   
        }
    }//GEN-LAST:event_jb_logoutActionPerformed

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdActionPerformed

    private void jb_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_searchActionPerformed
           
     try {
         String empId = txt_id.getSelectedItem().toString();
         
         ps=conn.prepareStatement("SELECT * FROM employee where ID=?");
         ps.setString(1, empId);
         rs=ps.executeQuery();
         
         if (rs.next()==true){
             
             Id.setText(rs.getString(1));
             txt_name.setText(rs.getString(2));
             txt_pass.setText(rs.getString(3));
             txt_position.setText(rs.getString(4));
             txt_option.setText(rs.getString(5));
             txt_bday.setText(rs.getString(6));
             txt_adds.setText(rs.getString(7));
             txt_un.setText(rs.getString(8));
             txt_salary.setText(rs.getString(9));
             txt_allowance.setText(rs.getString(10));
             txt_rate.setText(rs.getString(11));
             txt_pnumber.setText(rs.getString(12));
             txt_sss.setText(rs.getString(13));
             txt_phil.setText(rs.getString(14));
             txt_pag.setText(rs.getString(15));
             txt_tin.setText(rs.getString(16));
                       
         }else{
         JOptionPane.showMessageDialog(null, "Record not found");

         }

     } catch (SQLException ex) {
         Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
     }
    
    }//GEN-LAST:event_jb_searchActionPerformed

    private void jb_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_addActionPerformed
            if(Id.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Some Fields are Empty", "Error", 1);
            }
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to save record?","Add record",JOptionPane.YES_NO_OPTION);
           if (p==0){
               
         String showId= Id.getText();
         String name= txt_name.getText();
         String password= txt_pass.getText();
         String Position= txt_position.getText();
         String Options=txt_option.getText();
         String Birthday= txt_bday.getText();
         String Address=txt_adds.getText();
         String username= txt_un.getText();
         String Salary=txt_salary.getText();
         String TotalAllowance=txt_allowance.getText();
         String Hourlyrate= txt_rate.getText();
         String PhoneNumber=txt_pnumber.getText();
         String SSSNumber=txt_sss.getText();
         String PhilHealth=txt_phil.getText();
         String PagIbig=txt_pag.getText();
         String TinNumber=txt_tin.getText();
         String ID=txt_id.getSelectedItem().toString();
               
  try {
           ps= conn.prepareStatement("INSERT INTO employee(ID,name,password,Position,Options,Birthday,Address,username"
                   + "BasicSalary,TotalAllowance,Hourlyrate,"
                   + "PhoneNumber,SSSNumber,PhilHealth,PagIbig,TinNumber) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
           
           ps.setString(1,name);
           ps.setString(2,password);
           ps.setString(3, Position);
           ps.setString(4, Options);
           ps.setString(5,Birthday);
           ps.setString(6, Address);
           ps.setString(7, username);
           ps.setString(8, Salary);
           ps.setString(9, TotalAllowance);
           ps.setString(10, Hourlyrate);
           ps.setString(11, PhoneNumber);
           ps.setString(12,SSSNumber);
           ps.setString(13,PhilHealth);
           ps.setString(14, PagIbig);
           ps.setString(15, TinNumber);
           ps.setString(16, ID);
          
           int k= ps.executeUpdate();
           if (k==1){
           JOptionPane.showMessageDialog(this, "Data Added Successfully");
           
             Id.setText("");
             txt_name.setText("");
             txt_pass.setText("");
             txt_position.setText("");
             txt_option.setText("");
             txt_bday.setText("");
             txt_adds.setText("");
             txt_allowance.setText("");
             txt_un.setText("");
             txt_salary.setText("");
             txt_rate.setText("");
             txt_pnumber.setText("");
             txt_sss.setText("");
             txt_phil.setText("");
             txt_pag.setText("");
             txt_tin.setText("");
            }else{
               JOptionPane.showMessageDialog(null, "Data not saved");
           }
          
           }    catch (SQLException ex) { 
                    Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
    }//GEN-LAST:event_jb_addActionPerformed

    private void txt_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_positionActionPerformed

    private void txt_bdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bdayActionPerformed

    private void txt_addsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addsActionPerformed

    private void txt_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_optionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_optionActionPerformed

    private void txt_allowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_allowanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_allowanceActionPerformed

    private void txt_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salaryActionPerformed

    private void txt_rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rateActionPerformed

    private void txt_pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pagActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void jb_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_UpdateActionPerformed
      
     try {
         String showId= Id.getText();
         String name= txt_name.getText();
         String password= txt_pass.getText();
         String Position= txt_position.getText();
         String Options=txt_option.getText();
         String Birthday= txt_bday.getText();
         String Address=txt_adds.getText();
         String username= txt_un.getText();
         String Salary=txt_salary.getText();
         String TotalAllowance=txt_allowance.getText();
         String Hourlyrate= txt_rate.getText();
         String PhoneNumber=txt_pnumber.getText();
         String SSSNumber=txt_sss.getText();
         String PhilHealth=txt_phil.getText();
         String PagIbig=txt_pag.getText();
         String TinNumber=txt_tin.getText();
         String ID=txt_id.getSelectedItem().toString();
         
         
         ps=conn.prepareStatement("UPDATE employee SET name=?,password=?,Position=?,Options=?,Birthday=?,Address=?,username=?,BasicSalary=?,TotalAllowance=?,Hourlyrate=?,PhoneNumber=?,SSSNumber=?,PhilHealth=?,PagIbig=?, TinNumber=? WHERE ID=?");
         
           ps.setString(1,name);
           ps.setString(2,password);
           ps.setString(3, Position);
           ps.setString(4, Options);
           ps.setString(5,Birthday);
           ps.setString(6, Address);
           ps.setString(7, username);
           ps.setString(8, Salary);
           ps.setString(9, TotalAllowance);
           ps.setString(10, Hourlyrate);
           ps.setString(11, PhoneNumber);
           ps.setString(12,SSSNumber);
           ps.setString(13,PhilHealth);
           ps.setString(14, PagIbig);
           ps.setString(15, TinNumber);
           ps.setString(16, ID);
          
           int k= ps.executeUpdate();
           if (k==1){
           JOptionPane.showMessageDialog(this, "Data Save Successfully");
             Id.setText("");
             txt_name.setText("");
             txt_pass.setText("");
             txt_position.setText("");
             txt_option.setText("");
             txt_bday.setText("");
             txt_adds.setText("");
             txt_allowance.setText("");
             txt_un.setText("");
             txt_salary.setText("");
             txt_rate.setText("");
             txt_pnumber.setText("");
             txt_sss.setText("");
             txt_phil.setText("");
             txt_pag.setText("");
             txt_tin.setText("");
             Id.requestFocus();
             getEmployeeId();
           }else{
               JOptionPane.showMessageDialog(null, "Data not saved");
           }
           
     } catch (SQLException ex) {
         Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
     }
     
    }//GEN-LAST:event_jb_UpdateActionPerformed

    private void jb_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_clearActionPerformed
             Id.setText("");
             txt_name.setText("");
             txt_pass.setText("");
             txt_position.setText("");
             txt_option.setText("");
             txt_bday.setText("");
             txt_adds.setText("");
             txt_allowance.setText("");
             txt_un.setText("");
             txt_salary.setText("");
             txt_rate.setText("");
             txt_pnumber.setText("");
             txt_sss.setText("");
             txt_phil.setText("");
             txt_pag.setText("");
             txt_tin.setText("");
             Id.requestFocus();
             getEmployeeId();
    }//GEN-LAST:event_jb_clearActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminPage().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Empid;
    private javax.swing.JTable EmployeeInfo_Table;
    private javax.swing.JTextField Id;
    private javax.swing.JLabel empID;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_Update;
    private javax.swing.JButton jb_add;
    private javax.swing.JButton jb_clear;
    private javax.swing.JButton jb_logout;
    public static javax.swing.JButton jb_search;
    private javax.swing.JTextField txt_adds;
    private javax.swing.JTextField txt_allowance;
    private javax.swing.JTextField txt_bday;
    private javax.swing.JComboBox<String> txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_option;
    private javax.swing.JTextField txt_pag;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_phil;
    private javax.swing.JTextField txt_pnumber;
    private javax.swing.JTextField txt_position;
    private javax.swing.JTextField txt_rate;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_sss;
    private javax.swing.JTextField txt_tin;
    private javax.swing.JTextField txt_un;
    // End of variables declaration//GEN-END:variables

}
