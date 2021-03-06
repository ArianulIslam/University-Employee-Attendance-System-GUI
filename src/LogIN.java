
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NEW
 */
public class LogIN extends javax.swing.JFrame {
 FileClass F = new FileClass();
    /**
     * Creates new form LogIN
     */
    public LogIN() {
        initComponents();
        LoginButton.setBackground(new Color(94, 237, 181));
          
         this.setVisible(true);
         Toolkit tk = Toolkit.getDefaultToolkit();
         int xsize = (int)tk.getScreenSize().getWidth();
         int ysize = (int )tk.getScreenSize().getHeight();
         this.setSize(xsize, ysize);
        
         
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        GroupBox = new javax.swing.JComboBox();
        UserText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PassText = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(58, 56, 77));

        jPanel3.setBackground(new java.awt.Color(38, 40, 55));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Group : ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 201, -1, -1));

        GroupBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose", "Administrator", "Accountant", "Register", "Dean", "Head", "Faculty", "School Manager", " ", " ", " " }));
        GroupBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(GroupBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 201, 230, -1));

        UserText.setBackground(jPanel3.getBackground());
        UserText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UserText.setForeground(new java.awt.Color(255, 255, 255));
        UserText.setBorder(null);
        UserText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTextActionPerformed(evt);
            }
        });
        jPanel3.add(UserText, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 106, 200, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 129, 285, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 173, 285, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OAAS");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 31, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User ID :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 64, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        PassText.setBackground(jPanel3.getBackground());
        PassText.setForeground(new java.awt.Color(255, 255, 255));
        PassText.setBorder(null);
        jPanel3.add(PassText, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 150, 198, -1));

        LoginButton.setBackground(new java.awt.Color(94, 237, 181));
        LoginButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel3.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 239, 295, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
      
       
        
        
  
    private void UserTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTextActionPerformed
 
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        boolean login=false;
          File passFile = new File("password.txt");
        ArrayList<String> Bpassword = new ArrayList<String>();
        Bpassword.add("admin;admin");
        Bpassword.add("accountant;accountant");
        Bpassword.add("register;register");
        Bpassword.add("dean;dean");
        Bpassword.add("head;head");
        Bpassword.add("faculty;faculty");
        Bpassword.add("manager;manager");
        try{
        FileOutputStream fo = new FileOutputStream(passFile );
        ObjectOutputStream output = new ObjectOutputStream(fo);
          for( String a: Bpassword ){
            output.writeObject(a);
        }
          output.close();
          fo.close();
        }catch(Exception e){}
        ArrayList<String> passw = new ArrayList<String>();
       
        
        try{
        FileInputStream fi = new FileInputStream(passFile);
        ObjectInputStream input = new ObjectInputStream(fi);
       
       
            while(true)
            {
                String pas =  (String) input.readObject();
                 passw.add(pas);
            }
           
       
        
        }catch(Exception e){}
         String[] ar;
           int counter = 0;
            for (String p : passw) {
                  String str = p;
                  ar = str.split(";");
                  counter++;
                  if(counter==1 &&(GroupBox.getSelectedIndex() == 1)&& (ar[0].equals(UserText.getText()) && ar[1].equals(PassText.getText()))){
                       JOptionPane.showMessageDialog(null, "Login Successful.");
                        Admin ad = new Admin();
                        ad.show();
                        close();
                        login=true;
                     break;
                  }
                  else if(counter==2 &&(GroupBox.getSelectedIndex() == 2)&& (ar[0].equals(UserText.getText()) && ar[1].equals(PassText.getText()))){
                     JOptionPane.showMessageDialog(null, "Login Successful.");
                     Accountant ac = new Accountant();
                     ac.show();
                     close();
                     login=true;
                     break;
                  }
                  else if(counter==3 &&(GroupBox.getSelectedIndex() == 3)&& (ar[0].equals(UserText.getText()) && ar[1].equals(PassText.getText()))){
                     JOptionPane.showMessageDialog(null, "Login Successful.");
                     Register rr = new Register();
                     rr.show();
                     close();
                     login=true;
                     break;
                  }
                  else if(counter==4 &&(GroupBox.getSelectedIndex() == 4)&& (ar[0].equals(UserText.getText()) && ar[1].equals(PassText.getText()))){
                       JOptionPane.showMessageDialog(null, "Login Successful.");
                        Dean D = new Dean();
                        D.show();
                        close();
                        login=true;
                     break;
                  }
                  else if(counter==5&&(GroupBox.getSelectedIndex() == 5)&& (ar[0].equals(UserText.getText()) && ar[1].equals(PassText.getText()))){
                        JOptionPane.showMessageDialog(null, "Login Successful.");
                        Head hd = new Head();
                        hd.show();
                        close();
                        login=true;
                     break;
                  }
                  else if(counter==6&&(GroupBox.getSelectedIndex() == 6)&& (ar[0].equals(UserText.getText()) && ar[1].equals(PassText.getText()))){
                        JOptionPane.showMessageDialog(null, "Login Successful.");
                         Faculty fy = new Faculty();
                         fy.show();
                         close();
                         login=true;
                     break;
                  }
                 else if(counter==7&&(GroupBox.getSelectedIndex() == 7)&& (ar[0].equals(UserText.getText()) && ar[1].equals(PassText.getText()))){
                      JOptionPane.showMessageDialog(null, "Login Successful.");
                        Manager mr = new Manager();
                        mr.show();
                        close();
                        login=true;
                     break;
                  }
                  
               
            }
        if(login==false)
               JOptionPane.showMessageDialog(null, "Wrong User ID or Password.");
                 
        
        
        
         
    }//GEN-LAST:event_LoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LogIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIN().setVisible(true);
                //new Admin().setVisible(false);
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox GroupBox;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField PassText;
    private javax.swing.JTextField UserText;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
