/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package account;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kir7
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        jlCompName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlFullName = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jlGender = new javax.swing.JLabel();
        jlDob = new javax.swing.JLabel();
        jlAddress = new javax.swing.JLabel();
        jlUname = new javax.swing.JLabel();
        jlPass = new javax.swing.JLabel();
        jlPhone = new javax.swing.JLabel();
        jlPersonalDetails = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfUname = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        jlUserCredentials = new javax.swing.JLabel();
        tfPass = new javax.swing.JPasswordField();
        tfCpass = new javax.swing.JPasswordField();
        jlCpass = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        tfDob = new javax.swing.JTextField();
        cbGender = new javax.swing.JComboBox<>();
        jlDateformat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(111, 138, 255));

        jPanel2.setBackground(new java.awt.Color(71, 88, 168));

        jlCompName.setFont(new java.awt.Font("Sora", 1, 24)); // NOI18N
        jlCompName.setText("Way Express");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlCompName))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jlLogo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jlLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jlCompName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlFullName.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlFullName.setForeground(new java.awt.Color(60, 63, 65));
        jlFullName.setText("Full Name");

        jlEmail.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(60, 63, 65));
        jlEmail.setText("Email");

        jlGender.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlGender.setForeground(new java.awt.Color(60, 63, 65));
        jlGender.setText("Gender");

        jlDob.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlDob.setForeground(new java.awt.Color(60, 63, 65));
        jlDob.setText("Date of Birth");

        jlAddress.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlAddress.setForeground(new java.awt.Color(60, 63, 65));
        jlAddress.setText("Address");

        jlUname.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlUname.setForeground(new java.awt.Color(60, 63, 65));
        jlUname.setText("Username");

        jlPass.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlPass.setForeground(new java.awt.Color(60, 63, 65));
        jlPass.setText("Password");

        jlPhone.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlPhone.setForeground(new java.awt.Color(60, 63, 65));
        jlPhone.setText("Phone");

        jlPersonalDetails.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jlPersonalDetails.setForeground(new java.awt.Color(60, 63, 65));
        jlPersonalDetails.setText("Personal Contact Details:");

        tfName.setBackground(new java.awt.Color(111, 138, 255));
        tfName.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        tfName.setPreferredSize(new java.awt.Dimension(110, 25));

        tfEmail.setBackground(new java.awt.Color(111, 138, 255));
        tfEmail.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        tfEmail.setPreferredSize(new java.awt.Dimension(110, 25));

        tfPhone.setBackground(new java.awt.Color(111, 138, 255));
        tfPhone.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        tfPhone.setPreferredSize(new java.awt.Dimension(110, 25));

        tfUname.setBackground(new java.awt.Color(111, 138, 255));
        tfUname.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfUname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        tfUname.setPreferredSize(new java.awt.Dimension(110, 25));

        tfAddress.setBackground(new java.awt.Color(111, 138, 255));
        tfAddress.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        tfAddress.setPreferredSize(new java.awt.Dimension(110, 25));

        jlUserCredentials.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jlUserCredentials.setForeground(new java.awt.Color(60, 63, 65));
        jlUserCredentials.setText("User Credentials:");

        tfPass.setBackground(new java.awt.Color(111, 138, 255));
        tfPass.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        tfPass.setPreferredSize(new java.awt.Dimension(110, 25));

        tfCpass.setBackground(new java.awt.Color(111, 138, 255));
        tfCpass.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfCpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        tfCpass.setPreferredSize(new java.awt.Dimension(110, 25));

        jlCpass.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        jlCpass.setForeground(new java.awt.Color(60, 63, 65));
        jlCpass.setText("Confirm Password");

        btnSignup.setBackground(new java.awt.Color(111, 138, 255));
        btnSignup.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        btnSignup.setText("Sign Up");
        btnSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(111, 138, 255));
        btnCancel.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        tfDob.setBackground(new java.awt.Color(111, 138, 255));
        tfDob.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        tfDob.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        tfDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDobActionPerformed(evt);
            }
        });

        cbGender.setFont(new java.awt.Font("Sora", 0, 13)); // NOI18N
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        cbGender.setBorder(new javax.swing.border.MatteBorder(null));

        jlDateformat.setFont(new java.awt.Font("Sora", 0, 8)); // NOI18N
        jlDateformat.setText("( dd-mm-yyyy)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlGender)
                            .addComponent(jlPhone)
                            .addComponent(jlEmail)
                            .addComponent(jlFullName)
                            .addComponent(jlDob)
                            .addComponent(jlAddress)
                            .addComponent(jlDateformat))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDob)
                            .addComponent(tfAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlUserCredentials)
                            .addComponent(jlUname)
                            .addComponent(jlPass)
                            .addComponent(jlCpass)
                            .addComponent(btnSignup, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfUname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfCpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel)))
                    .addComponent(jlPersonalDetails))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlPersonalDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlFullName)
                                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlEmail)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(jlPhone))
                            .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlGender)
                            .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDob)
                            .addComponent(tfDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jlDateformat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlAddress))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlUserCredentials)
                                .addGap(16, 16, 16)
                                .addComponent(jlUname))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jlPass)
                                .addGap(19, 19, 19)
                                .addComponent(jlCpass)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSignup)
                            .addComponent(btnCancel))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(tfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(tfCpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed
    
    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        try {
            if(!tfName.getText().isEmpty() && !tfEmail.getText().isEmpty() && !tfPhone.getText().isEmpty() && !tfDob.getText().isEmpty() && !tfAddress.getText().isEmpty() && !tfUname.getText().isEmpty() && !tfPass.getText().isEmpty() && !tfCpass.getText().isEmpty()){
                if(valDOB(tfDob.getText())){
                    if (tfPhone.getText().matches("[0-9]+") && tfPhone.getText().length()==10) {    //checks whether tfPhone has only digits or not
                        if((tfPass.getText()).equals(tfCpass.getText())){   //checks if password and confirm passwords are same
                            if(unameVal() == true){
                                JOptionPane.showMessageDialog(this, "User already exists, choose another username."); 
                            }
                            else{
                                setData();
                                JOptionPane.showMessageDialog(this, "Registered Successfully!, You can Login.");
                                clearInfo();
                                setVisible(false);
                                new Login().setVisible(true); 
                            }     
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Passwords did not match.");
                        }                              
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Invalid phone number!");
                    }                      
                }
                else{
                    JOptionPane.showMessageDialog(this, "Date format is incorrect!");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            }
        } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSignupActionPerformed

    private void tfDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDobActionPerformed

    public void setData() throws IOException{
        File file = new File("user.txt");
        if(!file.exists()){ //checks if user.txt exists or not, if doesnt creates the file
            file.createNewFile();   
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        Object[] Lines = br.lines().toArray();
        int id = 0;
        for(int i=0; i<Lines.length;i++){
            String Line = Lines[i].toString().trim();
            String[] Row = Line.split("_");
            id = Integer.parseInt(Row[0]);
        }
        int uId=id+1;
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(uId+"_"+tfName.getText()+"_"+tfEmail.getText()+"_"+tfPhone.getText()+"_"+cbGender.getSelectedItem()+"_"+tfDob.getText()+"_"+tfAddress.getText()+"_"+tfUname.getText()+"_"+tfPass.getText()+"_User");
        pw.flush();
        pw.close();
        bw.close();
        fw.close();
    }
    
    private void clearInfo(){   //clear the fields
        tfName.setText("");
        tfEmail.setText("");
        tfPhone.setText("");
        tfDob.setText("");
        tfAddress.setText("");
        tfUname.setText("");
        tfPass.setText("");
        tfCpass.setText("");
    }
    
    public static boolean valDOB(String DOB){   //validates the date of birth
        DateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        dateformat.setLenient(false);
        try{
            date = dateformat.parse(DOB);
            return true;
        }
        catch(Exception e){
        return false;
        }
    } 
    
    public boolean unameVal() throws FileNotFoundException, IOException{
        File file = new File("user.txt"); // new file instance
        if(!file.exists()){ //creates file if doesnt exist
            file.createNewFile();
        }
        Scanner fileReader = new Scanner(file); //scanner instance to read file
        while(fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            String[] value = line.split("_");    //split on "_"
            if(tfUname.getText().equals(value[7])){
                return true;
            }
        }
        return false;
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlAddress;
    private javax.swing.JLabel jlCompName;
    private javax.swing.JLabel jlCpass;
    private javax.swing.JLabel jlDateformat;
    private javax.swing.JLabel jlDob;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlFullName;
    private javax.swing.JLabel jlGender;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlPass;
    private javax.swing.JLabel jlPersonalDetails;
    private javax.swing.JLabel jlPhone;
    private javax.swing.JLabel jlUname;
    private javax.swing.JLabel jlUserCredentials;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JPasswordField tfCpass;
    private javax.swing.JTextField tfDob;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPass;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfUname;
    // End of variables declaration//GEN-END:variables
}