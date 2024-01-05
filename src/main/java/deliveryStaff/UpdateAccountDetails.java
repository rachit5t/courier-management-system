/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package deliveryStaff;
import account.Login;
import deliveryStaff.ViewDelivery;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author kir7
 */
public class UpdateAccountDetails extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    String userId;
    public UpdateAccountDetails(String userId) {
        this.userId = userId;
        initComponents();
        setResizable(false);
        setId();
    }

    private UpdateAccountDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jbTrackOrder = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jbLogout = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jbAccountDetails = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jbViewDetails = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbUpdateDetails = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jlPhone = new javax.swing.JLabel();
        jlPersonalDetails = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        tfUname = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();
        btnClear = new javax.swing.JButton();
        jlName = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jlAddress = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        tfUID = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setForeground(new java.awt.Color(223, 61, 76));

        jPanel4.setBackground(new java.awt.Color(71, 88, 168));
        jPanel4.setForeground(new java.awt.Color(60, 63, 65));

        jLabel3.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jLabel3.setText("Way Express");

        jPanel6.setBackground(new java.awt.Color(71, 88, 168));
        jPanel6.setPreferredSize(new java.awt.Dimension(0, 38));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(71, 88, 168));

        jbTrackOrder.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jbTrackOrder.setText("View Delivery");
        jbTrackOrder.setBorder(null);
        jbTrackOrder.setBorderPainted(false);
        jbTrackOrder.setContentAreaFilled(false);
        jbTrackOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbTrackOrder.setDefaultCapable(false);
        jbTrackOrder.setFocusPainted(false);
        jbTrackOrder.setFocusable(false);
        jbTrackOrder.setMargin(null);
        jbTrackOrder.setRequestFocusEnabled(false);
        jbTrackOrder.setRolloverEnabled(false);
        jbTrackOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTrackOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbTrackOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jbTrackOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(71, 88, 168));
        jPanel13.setPreferredSize(new java.awt.Dimension(0, 38));

        jbLogout.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jbLogout.setText("Logout");
        jbLogout.setBorder(null);
        jbLogout.setBorderPainted(false);
        jbLogout.setContentAreaFilled(false);
        jbLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLogout.setDefaultCapable(false);
        jbLogout.setFocusPainted(false);
        jbLogout.setFocusable(false);
        jbLogout.setMargin(null);
        jbLogout.setRequestFocusEnabled(false);
        jbLogout.setRolloverEnabled(false);
        jbLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(111, 138, 255));

        jbAccountDetails.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jbAccountDetails.setText("Account Details");
        jbAccountDetails.setBorder(null);
        jbAccountDetails.setBorderPainted(false);
        jbAccountDetails.setContentAreaFilled(false);
        jbAccountDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAccountDetails.setDefaultCapable(false);
        jbAccountDetails.setFocusPainted(false);
        jbAccountDetails.setFocusable(false);
        jbAccountDetails.setMargin(null);
        jbAccountDetails.setRequestFocusEnabled(false);
        jbAccountDetails.setRolloverEnabled(false);
        jbAccountDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAccountDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAccountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jbAccountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(111, 138, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jPanel16.setBackground(new java.awt.Color(0, 95, 105));
        jPanel16.setPreferredSize(new java.awt.Dimension(360, 40));

        jbViewDetails.setBackground(new java.awt.Color(0, 128, 128));
        jbViewDetails.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        jbViewDetails.setText("View Details");
        jbViewDetails.setBorder(null);
        jbViewDetails.setContentAreaFilled(false);
        jbViewDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jbViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(0, 128, 128));

        jbUpdateDetails.setBackground(new java.awt.Color(153, 0, 153));
        jbUpdateDetails.setFont(new java.awt.Font("Sora", 1, 18)); // NOI18N
        jbUpdateDetails.setText("Update Details");
        jbUpdateDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jbUpdateDetails.setBorderPainted(false);
        jbUpdateDetails.setContentAreaFilled(false);
        jbUpdateDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbUpdateDetails.setFocusPainted(false);
        jbUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbUpdateDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbUpdateDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 40));

        jLabel10.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 63, 65));
        jLabel10.setText("Password");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jlPhone.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlPhone.setForeground(new java.awt.Color(60, 63, 65));
        jlPhone.setText("Phone");
        jPanel5.add(jlPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jlPersonalDetails.setFont(new java.awt.Font("Sora", 1, 13)); // NOI18N
        jlPersonalDetails.setForeground(new java.awt.Color(60, 63, 65));
        jlPersonalDetails.setText("Personal Contact Details:");
        jPanel5.add(jlPersonalDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        tfPhone.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfPhone.setPreferredSize(new java.awt.Dimension(110, 25));
        jPanel5.add(tfPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 160, -1));

        tfAddress.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfAddress.setPreferredSize(new java.awt.Dimension(110, 25));
        jPanel5.add(tfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 160, -1));

        tfUname.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfUname.setPreferredSize(new java.awt.Dimension(110, 25));
        jPanel5.add(tfUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 160, -1));

        tfEmail.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfEmail.setPreferredSize(new java.awt.Dimension(110, 25));
        jPanel5.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 160, -1));

        tfName.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfName.setPreferredSize(new java.awt.Dimension(110, 25));
        jPanel5.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 160, -1));

        jLabel14.setFont(new java.awt.Font("Sora", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(60, 63, 65));
        jLabel14.setText("User Credentials:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        tfPass.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfPass.setPreferredSize(new java.awt.Dimension(110, 25));
        jPanel5.add(tfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 160, -1));

        btnClear.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel5.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        jlName.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlName.setForeground(new java.awt.Color(60, 63, 65));
        jlName.setText("Full Name");
        jPanel5.add(jlName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jlEmail.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(60, 63, 65));
        jlEmail.setText("Email");
        jPanel5.add(jlEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jlAddress.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlAddress.setForeground(new java.awt.Color(60, 63, 65));
        jlAddress.setText("Address");
        jPanel5.add(jlAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(60, 63, 65));
        jLabel9.setText("Username");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Note:\nClick 'View Details' button if\nyou want to view the current\ndetails.\nType in the text fields, use the \ncurrent detail if you don't want \nto change.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 250, 140));

        jLabel1.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 63, 65));
        jLabel1.setText("User ID");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        tfUID.setEditable(false);
        tfUID.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jPanel5.add(tfUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 160, -1));

        btnUpdate.setFont(new java.awt.Font("Sora", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbAccountDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAccountDetailsActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jbAccountDetailsActionPerformed

    private void jbLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLogoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true); 
    }//GEN-LAST:event_jbLogoutActionPerformed

    private void jbTrackOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTrackOrderActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ViewDelivery(userId).setVisible(true);
    
    }//GEN-LAST:event_jbTrackOrderActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            update();
        } catch (IOException ex) {
            Logger.getLogger(UpdateAccountDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void update() throws IOException{
        File tempFile = new File("temp.txt");
        File oldFile = new File("user.txt");

        Scanner fileReader = new Scanner(oldFile);
        FileWriter fw = new FileWriter(tempFile);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        if(tfName.getText().isEmpty() || tfEmail.getText().isEmpty() || tfPhone.getText().isEmpty() || tfAddress.getText().isEmpty() || tfUname.getText().isEmpty() || tfPass.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill up all the fields!");
        }
        else {
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] value = line.split("_");    //split on "_"

                if(value[0].equals(userId)){
                    pw.println(value[0]+"_"+tfName.getText()+"_"+tfEmail.getText()+"_"+tfPhone.getText()+"_"+value[4]+"_"+value[5]+"_"+tfAddress.getText()+"_"+tfUname.getText()+"_"+tfPass.getText()+"_"+value[9]);
                    JOptionPane.showMessageDialog(this, "Updated successfully!");
                }

                else{
                    pw.println(value[0]+"_"+value[1]+"_"+value[2]+"_"+value[3]+"_"+value[4]+"_"+value[5]+"_"+value[6]+"_"+value[7]+"_"+value[8]+"_"+value[9]);
                }
            }
        fileReader.close();
        pw.flush();
        pw.close();
        bw.close();
        fw.close();
        oldFile.delete();// deletes user.txt
        tempFile.renameTo(oldFile);// renames temp.txt to user.txt
        }
    }
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        tfName.setText("");
        tfEmail.setText("");
        tfPhone.setText("");
        tfAddress.setText("");
        tfUname.setText("");
        tfPass.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void jbUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateDetailsActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jbUpdateDetailsActionPerformed

    private void jbViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbViewDetailsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new DStaffViewAccountDetails(userId).setVisible(true);
    }//GEN-LAST:event_jbViewDetailsActionPerformed

    private void setId() {                                                  
        
        File file = new File("user.txt"); // new file instance

        Scanner fileReader = null;
        try {
           fileReader = new Scanner(file); //scanner instance to read file
        } catch (FileNotFoundException ex) {
           
        }
        while(fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            String[] value = line.split("_");    //split on "_"
            if(value[0].equals(userId)){
                tfUID.setText(value[0]);
            }
        }
        fileReader.close();
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new UpdateAccountDetails("rachitDhakal").setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbAccountDetails;
    private javax.swing.JButton jbLogout;
    private javax.swing.JButton jbTrackOrder;
    private javax.swing.JButton jbUpdateDetails;
    private javax.swing.JButton jbViewDetails;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlName;
    private javax.swing.JLabel jlPersonalDetails;
    private javax.swing.JLabel jlPhone;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfUID;
    private javax.swing.JTextField tfUname;
    // End of variables declaration//GEN-END:variables
}
