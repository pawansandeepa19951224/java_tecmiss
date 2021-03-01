/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturer;

import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dell
 */
public class Attnd extends javax.swing.JInternalFrame {

    /**
     * Creates new form Attnd
     */
    dbCon con = new dbCon();

    public Attnd() {
        initComponents();
        showList();
    }
    
    public void showList(){
        con.getConnection();                    
        con.setSql("SELECT a_id, s_id, s_code, tp,state,date FROM attendances");          
        ResultSet result = con.getResultSet();
        tblList.setModel(DbUtils.resultSetToTableModel(result));   
    }
    
    public void showListById(){
        con.getConnection();                    
        con.setSql("SELECT a_id, s_id, s_code, tp,state,date FROM attendances where s_id='"+txtSID.getText()+"'");          
        ResultSet result = con.getResultSet();
        tblList.setModel(DbUtils.resultSetToTableModel(result));   
    }
    
    public void showListByTheory(){
        con.getConnection();                    
        con.setSql("SELECT a_id, s_id, s_code,tp,state,date FROM attendances where tp='theory'");          
        ResultSet result = con.getResultSet();
        tblList.setModel(DbUtils.resultSetToTableModel(result));   
    }
    
    public void showListByPractical(){
        con.getConnection();                    
        con.setSql("SELECT a_id, s_id, s_code,tp,state,date FROM attendances where tp='practical'");          
        ResultSet result = con.getResultSet();
        tblList.setModel(DbUtils.resultSetToTableModel(result));   
    }
    
    public void showListByPresent(){
        con.getConnection();                    
        con.setSql("SELECT a_id, s_id, s_code,tp,state,date FROM attendances where state='present'");          
        ResultSet result = con.getResultSet();
        tblList.setModel(DbUtils.resultSetToTableModel(result));   
    }
    
    public void showListByMedical(){
        con.getConnection();                    
        con.setSql("SELECT a_id, s_id, s_code,tp,state,date FROM attendances where state='medical'");          
        ResultSet result = con.getResultSet();
        tblList.setModel(DbUtils.resultSetToTableModel(result));   
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
        jLabel3 = new javax.swing.JLabel();
        txtSID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        cmbLecType = new javax.swing.JComboBox<>();
        cmbPresent = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Students Attendance");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 10, 260, 29);

        txtSID.setMinimumSize(new java.awt.Dimension(20, 50));
        txtSID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSIDKeyReleased(evt);
            }
        });
        jPanel1.add(txtSID);
        txtSID.setBounds(30, 100, 210, 30);

        jLabel1.setText("Student ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 70, 61, 14);

        btnSearch.setText("Search");
        jPanel1.add(btnSearch);
        btnSearch.setBounds(500, 100, 90, 30);

        tblList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblList);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 150, 730, 290);

        cmbLecType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theory", "Practical", "All" }));
        cmbLecType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLecTypeItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbLecType);
        cmbLecType.setBounds(260, 100, 90, 30);

        cmbPresent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Medical", "All" }));
        cmbPresent.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPresentItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbPresent);
        cmbPresent.setBounds(380, 100, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecturer/light-blue-abstract-wallpaper-19.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 690, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-10, -20, 810, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSIDKeyReleased
        showListById();
    }//GEN-LAST:event_txtSIDKeyReleased

    private void cmbLecTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLecTypeItemStateChanged
        String lecType = (String) cmbLecType.getSelectedItem(); 
        if(lecType=="Theory"){
            showListByTheory();
        }
        else if (lecType=="Practical"){
             showListByPractical();
        }
        else{
            showList();
        }
    }//GEN-LAST:event_cmbLecTypeItemStateChanged

    private void cmbPresentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPresentItemStateChanged
        String present = (String) cmbPresent.getSelectedItem(); 
        if(present=="Present"){
            showListByPresent();
        }
        else if (present=="Medical"){
             showListByMedical();
        }
        else{
            showList();
        }
    }//GEN-LAST:event_cmbPresentItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbLecType;
    private javax.swing.JComboBox<String> cmbPresent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtSID;
    // End of variables declaration//GEN-END:variables
}
