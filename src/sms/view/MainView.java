/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms.view;

/**
 *
 * @author hirwa
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        StudentRegistrationMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        staffRegistrationMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        courseMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System");

        fileMenu.setMnemonic('s');
        fileMenu.setText("Student");

        StudentRegistrationMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        StudentRegistrationMenuItem.setMnemonic('r');
        StudentRegistrationMenuItem.setText("Registration");
        StudentRegistrationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentRegistrationMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(StudentRegistrationMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('t');
        editMenu.setText("Staff");

        staffRegistrationMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        staffRegistrationMenuItem.setMnemonic('s');
        staffRegistrationMenuItem.setText("Staff Registration");
        staffRegistrationMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffRegistrationMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(staffRegistrationMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('c');
        helpMenu.setText("Courses");

        courseMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        courseMenuItem.setMnemonic('c');
        courseMenuItem.setText("Course Registration");
        courseMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(courseMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1284, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentRegistrationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentRegistrationMenuItemActionPerformed
        // TODO add your handling code here:
        StudentRegistration register = new StudentRegistration();
        desktopPane.add(register);
        register.show();
    }//GEN-LAST:event_StudentRegistrationMenuItemActionPerformed

    private void courseMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseMenuItemActionPerformed
        // TODO add your handling code here:
        CourseRegistration course = new CourseRegistration();
        desktopPane.add(course);
        course.show();
    }//GEN-LAST:event_courseMenuItemActionPerformed

    private void staffRegistrationMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffRegistrationMenuItemActionPerformed
        // TODO add your handling code here:
        StaffRegistration staff = new StaffRegistration();
        desktopPane.add(staff);
        staff.show();
    }//GEN-LAST:event_staffRegistrationMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem StudentRegistrationMenuItem;
    private javax.swing.JMenuItem courseMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem staffRegistrationMenuItem;
    // End of variables declaration//GEN-END:variables

}
