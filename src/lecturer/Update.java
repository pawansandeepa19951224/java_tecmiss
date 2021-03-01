/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public final class Update extends javax.swing.JInternalFrame {

    String lec_id="lec1";
   
    Connection conn = null;
    PreparedStatement psd = null;
     ResultSet rs = null;
    
    /**
     * Creates new form Update
     */
    public Update() {
        
        conn = dbconnect.connect();
        
        initComponents();
        loaddetail();
    }
    
    public void loaddetail(){
            
        String sql = "Select * from lecturer WHERE lec_id = '"+ lec_id + "'limit 1";
    
        try {
            psd = conn.prepareStatement(sql);
            rs = psd.executeQuery();
          
            while(rs.next()){
               String getId = rs.getString("lec_id");
               String getDid= rs.getString("d_id");
               String getname=rs.getString("lec_name");
               String getemail=rs.getString("lec_email");
               String getContact = rs.getString("lec_contact");

                jlec_id.setText(getId);
                juser.setText(getname);
                jdep_name.addItem(getDid);
                jcontact.setText(getContact);
                jemail.setText(getemail);
                
                
                
            }
        } catch (Exception e) {
            System.out.println(e);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        juser = new javax.swing.JLabel();
        jlec_id = new javax.swing.JLabel();
        jdep_name = new javax.swing.JComboBox<>();
        jcontact = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        jupdate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(891, 514));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("User name: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 121, -1, 66));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Dep name: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Contact no:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 292, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Email: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 343, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Lecture ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 187, -1, -1));

        juser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        juser.setText("usrname");
        getContentPane().add(juser, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 143, 176, -1));

        jlec_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlec_id.setText("id");
        getContentPane().add(jlec_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 188, 503, 21));

        jdep_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jdep_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdep_nameActionPerformed(evt);
            }
        });
        getContentPane().add(jdep_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 227, -1, -1));

        jcontact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcontactActionPerformed(evt);
            }
        });
        getContentPane().add(jcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 289, 300, -1));

        jemail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemailActionPerformed(evt);
            }
        });
        getContentPane().add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 340, 300, -1));

        jupdate.setText("Update");
        jupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupdateActionPerformed(evt);
            }
        });
        getContentPane().add(jupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 331, 78, 33));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecturer/light-blue-abstract-wallpaper-19.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdep_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdep_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdep_nameActionPerformed

    private void jcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcontactActionPerformed

    private void jemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jemailActionPerformed

    private void jupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupdateActionPerformed
        updateLect();
    }//GEN-LAST:event_jupdateActionPerformed

     public void updateLect(){
        String getDid=jdep_name.getSelectedItem().toString();
        String getContact =jcontact.getText();
        String getemail=jemail.getText();
        
        
        int p= JOptionPane.showConfirmDialog(null, "Do you really want to update ?", "Update Details", JOptionPane.YES_NO_OPTION);
        if(p==0){
            
            String update ="UPDATE lecturer SET d_id='"+getDid+"', lec_contact='"+getContact+"', lec_email='"+getemail+"' WHERE lec_id='"+jlec_id.getText()+"'";
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            try {
                psd=conn.prepareStatement(update);
                psd.executeUpdate();
            } catch (Exception e) {
                System.out.println(e);
            }
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jcontact;
    private javax.swing.JComboBox<String> jdep_name;
    private javax.swing.JTextField jemail;
    private javax.swing.JLabel jlec_id;
    private javax.swing.JButton jupdate;
    private javax.swing.JLabel juser;
    // End of variables declaration//GEN-END:variables
}
