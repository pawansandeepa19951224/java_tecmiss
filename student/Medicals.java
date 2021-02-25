/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mycode.dbconnect;

/**
 *
 * @author Uddhika
 */
public class Medicals extends javax.swing.JInternalFrame {

        String person="stu006";
    
        PreparedStatement pst=null;
        Connection con=null;
        ResultSet rs=null;
        
    public Medicals() {
        initComponents();
        
        con=dbconnect.connect();
        
        
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
        Scode = new javax.swing.JComboBox<>();
        medicalcount = new javax.swing.JLabel();

        setTitle("Medicals");

        jLabel1.setText("Subject code :");

        Scode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select subject", "OOAD", "Internet application development", "System analysis ", "Data structure and algorithms", "Economics", "English" }));
        Scode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Scode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(medicalcount, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(Scode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(medicalcount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ScodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScodeActionPerformed
        String subject=Scode.getSelectedItem().toString();
        String subject_id=null;
        
        String getscode="select s_code from subject where s_name='"+ subject +"'";
        
        try {
            
            pst=con.prepareStatement(getscode);
            rs=pst.executeQuery();  
            
            while(rs.next()){
                subject_id=rs.getString("s_code");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        String getMedicals="select count(s_id) as count from medical where s_id='"+ person +"' and s_code='"+ subject_id +"'";
        
        String scount=null;
        try {
            pst=con.prepareStatement(getMedicals);
            rs=pst.executeQuery();
            
            
            while(rs.next()){
                scount=rs.getString("count");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        int count=Integer.parseInt(scount);
        
        String spresentage=String.valueOf(scount);
        
        medicalcount.setText(spresentage);
        
    }//GEN-LAST:event_ScodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Scode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel medicalcount;
    // End of variables declaration//GEN-END:variables
}
