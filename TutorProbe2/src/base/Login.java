/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.awt.Color;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Hp
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private static int x;
    private static int y;
    public Login() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        //jPanel1.setBackground(new Color(0,0,0,0));
        Name_F.setBackground(new Color(0,0,0,0));
        Pass_F.setBackground(new Color(0,0,0,0));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LOGIN_I = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Name_F = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Pass = new javax.swing.JLabel();
        Pass_F = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        LoginB = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SignB = new javax.swing.JLabel();
        Home1 = new javax.swing.JLabel();
        Home2 = new javax.swing.JLabel();
        Close_Pan = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome To");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, 40));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TutorProbe");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 30, 20));

        LOGIN_I.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        LOGIN_I.setForeground(new java.awt.Color(255, 255, 255));
        LOGIN_I.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGIN_I.setText("LOGIN");
        jPanel1.add(LOGIN_I, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        Username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username :");
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        Name_F.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Name_F.setForeground(new java.awt.Color(255, 255, 255));
        Name_F.setToolTipText("Enter UserName");
        Name_F.setBorder(null);
        Name_F.setOpaque(false);
        jPanel1.add(Name_F, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 270, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 280, 10));

        Pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pass.setForeground(new java.awt.Color(240, 240, 240));
        Pass.setText("Password : ");
        Pass.setToolTipText("");
        jPanel1.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        Pass_F.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pass_F.setForeground(new java.awt.Color(240, 240, 240));
        Pass_F.setToolTipText("Enter Password");
        Pass_F.setBorder(null);
        Pass_F.setOpaque(false);
        jPanel1.add(Pass_F, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 290, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 280, 10));

        LoginB.setBackground(new java.awt.Color(100, 145, 217));
        LoginB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LoginB.setForeground(new java.awt.Color(240, 240, 240));
        LoginB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginB.setText("Login");
        LoginB.setOpaque(true);
        LoginB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginBMouseExited(evt);
            }
        });
        jPanel1.add(LoginB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Or");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        SignB.setBackground(new java.awt.Color(100, 145, 217));
        SignB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SignB.setForeground(new java.awt.Color(240, 240, 240));
        SignB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignB.setText("SignUp");
        SignB.setOpaque(true);
        SignB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignBMouseExited(evt);
            }
        });
        jPanel1.add(SignB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 80, 30));

        Home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/base/Login Light (4).png"))); // NOI18N
        jPanel1.add(Home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 390, 450));

        Home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/base/Home.jpg"))); // NOI18N
        jPanel1.add(Home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 390, 450));

        Close_Pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(Close_Pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 350, 30));

        jLabel5.setText("jLabel5");
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 720, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void LoginBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBMouseEntered
        // TODO add your handling code here:
        LoginB.setBackground(new Color(69, 95, 181));
    }//GEN-LAST:event_LoginBMouseEntered

    private void LoginBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBMouseExited
        // TODO add your handling code here:
        LoginB.setBackground(new Color(100, 145, 217));
    }//GEN-LAST:event_LoginBMouseExited

    private void SignBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignBMouseEntered
        // TODO add your handling code here:
         SignB.setBackground(new Color(69, 95, 181));
    }//GEN-LAST:event_SignBMouseEntered

    private void SignBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignBMouseExited
        // TODO add your handling code here:
        SignB.setBackground(new Color(100, 145, 217));
    }//GEN-LAST:event_SignBMouseExited

    private void LoginBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBMouseClicked
        // TODO add your handling code here:
        String name,uname,pass,stu;
        String username = Name_F.getText().toString();
        String password = Pass_F.getText().toString();
        boolean flag = false;
        int r = evt.getClickCount();
        if(r==1)
        {
            try
            {
                FileReader fy = new FileReader("LOGIN.txt");
                BufferedReader reader = new BufferedReader(fy);
                
                String line = null;
                while((line = reader.readLine())!= null)
                {
                    StringTokenizer t = new StringTokenizer(line,"/");
                    while(t.hasMoreTokens())
                    {
                        name = t.nextToken();
                        uname = t.nextToken();
                        pass = t.nextToken();
                        stu = t.nextToken();
                    if(uname.equals(username) && pass.equals(password))
                    {
                        flag = true;
                        //s.setVisible(true);
                        JOptionPane.showMessageDialog(this, "Successfully Login!!");
                        Dashboard d = new Dashboard();
                        d.setVisible(true);
                        this.setVisible(false);
                        d.WelcomeScreen(name,username,password,stu);
                        break;
                    }
                    
                    }
                }
                if(!flag)
                {
                    JOptionPane.showMessageDialog(this, "Username or Password wrong!!");
                }
                
            }
            catch(IOException e)
        {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_LoginBMouseClicked

    private void SignBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignBMouseClicked
        // TODO add your handling code here:
         Register r = new Register();
         int f = evt.getClickCount();
         if(f==1)
         {
             this.setVisible(false);
             r.setVisible(true);
         }
    }//GEN-LAST:event_SignBMouseClicked

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        // TODO add your handling code here:
        int c_x = evt.getXOnScreen();
        int c_y = evt.getYOnScreen();
        
        this.setLocation(c_x - x, c_y - y);
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel5MousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Close_Pan;
    private javax.swing.JLabel Home1;
    private javax.swing.JLabel Home2;
    private javax.swing.JLabel LOGIN_I;
    private javax.swing.JLabel LoginB;
    private javax.swing.JTextField Name_F;
    private javax.swing.JLabel Pass;
    private javax.swing.JPasswordField Pass_F;
    private javax.swing.JLabel SignB;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
