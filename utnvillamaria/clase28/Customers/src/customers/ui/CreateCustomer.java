
package customers.ui;

import customers.domain.Customer;
import java.util.ArrayList;
import java.util.List;


public class CreateCustomer extends javax.swing.JFrame {
    
    private List<Customer> customerList = new ArrayList<>();

    // Creates new form CreateCustomer
    public CreateCustomer() {
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

        labelTitle = new javax.swing.JLabel();
        TextFieldFirstName = new javax.swing.JTextField();
        TextFieldNationalId = new javax.swing.JTextField();
        TextFieldlastName = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        ButtonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setText("Ingrese los datos del cliente y luego pulse Guardar");
        getContentPane().add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));
        getContentPane().add(TextFieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 200, -1));

        TextFieldNationalId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNationalIdActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldNationalId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 200, -1));

        TextFieldlastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldlastNameActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldlastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 200, -1));

        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombre.setText("Nombre:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 50, 60, -1));

        jLabelApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelApellido.setText("Apellido:");
        getContentPane().add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 90, 60, -1));

        jLabelDni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDni.setText("Doc. Nacional:");
        getContentPane().add(jLabelDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 20));

        ButtonGuardar.setText("Guardar");
        ButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonGuardarMouseClicked(evt);
            }
        });
        ButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldNationalIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNationalIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNationalIdActionPerformed

    private void TextFieldlastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldlastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldlastNameActionPerformed

    private void ButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonGuardarActionPerformed

    private void ButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonGuardarMouseClicked
        //System.out.println("Click en el boton");
        Customer customer = new Customer(); 
        customer.setFirstname(TextFieldFirstName.getText());
        customer.setLastname(TextFieldlastName.getText());
        customer.setNationalId(TextFieldNationalId.getText());
        //para imprimir el objeto asi veo que se setteo
        //System.out.println(customer);
        //agrego el customer a mi ArrayList
        customerList.add(customer);
        //recorro el array e imprimo para ver que agregue al cliente
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
        //Y voy a setear los campos nombre, apellido dni a vacio para que queden limpios 
        //para el proximo cliente
    }//GEN-LAST:event_ButtonGuardarMouseClicked


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
            java.util.logging.Logger.getLogger(CreateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JTextField TextFieldFirstName;
    private javax.swing.JTextField TextFieldNationalId;
    private javax.swing.JTextField TextFieldlastName;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel labelTitle;
    // End of variables declaration//GEN-END:variables
}
