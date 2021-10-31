/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.poo.view;

import com.poo.libsbooks.Author;
import com.poo.sevices.DataBase;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author scherman
 */
public class AuthorView extends javax.swing.JFrame {
    
    private DataBase dataBase;
    private Author author;

    /**
     * Creates new form Author
     */
    public AuthorView() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Autor");
        dataBase = new DataBase();
        dataBase.insertAuthors();
        fillTable(dataBase.getAuthors());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pageArea = new javax.swing.JPanel();
        authorsTableArea = new javax.swing.JScrollPane();
        authorsTable = new javax.swing.JTable();
        inputName = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFame = new javax.swing.JRadioButton();
        labelAuthorName = new javax.swing.JLabel();
        authorsButtonsArea = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        authorsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        authorsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorsTableMouseClicked(evt);
            }
        });
        authorsTableArea.setViewportView(authorsTable);

        inputName.setText("Informe o nome do autor");
        inputName.setEnabled(false);
        inputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNameActionPerformed(evt);
            }
        });

        genderLabel.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        genderLabel.setText("Gênero");

        rbMale.setText("Masculino");
        rbMale.setEnabled(false);

        rbFame.setText("Feminino");
        rbFame.setEnabled(false);
        rbFame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFameActionPerformed(evt);
            }
        });

        labelAuthorName.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        labelAuthorName.setText("Nome:");

        authorsButtonsArea.setBackground(new java.awt.Color(123, 123, 123));
        authorsButtonsArea.setAutoscrolls(true);

        btnAdd.setText("Cadastrar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setText("Salvar");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Apagar");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout authorsButtonsAreaLayout = new javax.swing.GroupLayout(authorsButtonsArea);
        authorsButtonsArea.setLayout(authorsButtonsAreaLayout);
        authorsButtonsAreaLayout.setHorizontalGroup(
            authorsButtonsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authorsButtonsAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addGap(34, 34, 34)
                .addComponent(btnEdit)
                .addGap(37, 37, 37)
                .addComponent(btnSave)
                .addGap(36, 36, 36)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        authorsButtonsAreaLayout.setVerticalGroup(
            authorsButtonsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(authorsButtonsAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(authorsButtonsAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnSave)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pageAreaLayout = new javax.swing.GroupLayout(pageArea);
        pageArea.setLayout(pageAreaLayout);
        pageAreaLayout.setHorizontalGroup(
            pageAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(authorsTableArea, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
            .addGroup(pageAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pageAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageAreaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelAuthorName))
                    .addComponent(genderLabel))
                .addGap(24, 24, 24)
                .addGroup(pageAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pageAreaLayout.createSequentialGroup()
                        .addComponent(rbMale)
                        .addGap(18, 18, 18)
                        .addComponent(rbFame)
                        .addContainerGap())
                    .addComponent(inputName)))
            .addComponent(authorsButtonsArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pageAreaLayout.setVerticalGroup(
            pageAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pageAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pageAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAuthorName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pageAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMale)
                    .addComponent(genderLabel)
                    .addComponent(rbFame))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(authorsButtonsArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(authorsTableArea, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pageArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pageArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNameActionPerformed

    private void rbFameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFameActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        btnDelete.setEnabled(false);
        enableCreateEdit(true);        
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        btnSave.setEnabled(false);
        int response = JOptionPane.showConfirmDialog(null, "Tchê, tens certeza que quer apagar o autor '" + author.getName() + "' mesmo?");
        if (response == 0) {
            if (dataBase.deleteAuthor(author)) {
                cleanData();
                fillTable(dataBase.getAuthors());
                JOptionPane.showMessageDialog(null, "Bom, agora já era. Os dados foram apagados!!");
                
            } else {
                JOptionPane.showMessageDialog(null, "Opss.. Não rolou. Dados não foram apagados!!");
            }
        }
        enableCreateEdit(false);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        enableCreateEdit(true);
        cleanData();
        author = new Author();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

            enableCreateEdit(false);
            btnEdit.setEnabled(false);
            author.setName(inputName.getText());
            author.setGender(rbMale.isSelected());
            if (author.getId() == 0) {
                dataBase.createAuthor(author);
            } else {
                dataBase.updateAuthor(author);
            }
            cleanData();
            fillTable(dataBase.getAuthors());
            btnEdit.setEnabled(false);
            btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void authorsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorsTableMouseClicked
        
        btnAdd.setEnabled(true);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        
        int id = (int) authorsTable.getValueAt(authorsTable.getSelectedRow(), 0);
        author = dataBase.searchAuthorById(id);
        
        String name = author.getName();        
        if (author.isGender()) {
            rbMale.setSelected(true);            
        } else {
            rbFame.setSelected(false);
        }
        
        inputName.setText(name);
        
    }//GEN-LAST:event_authorsTableMouseClicked

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
            java.util.logging.Logger.getLogger(AuthorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel authorsButtonsArea;
    private javax.swing.JTable authorsTable;
    private javax.swing.JScrollPane authorsTableArea;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField inputName;
    private javax.swing.JLabel labelAuthorName;
    private javax.swing.JPanel pageArea;
    private javax.swing.JRadioButton rbFame;
    private javax.swing.JRadioButton rbMale;
    // End of variables declaration//GEN-END:variables

    private void fillTable(List<Author> authors) {
        
        DefaultTableModel model = new DefaultTableModel();
        authorsTable.setModel(model);
        
        model.addColumn("ID");
        model.addColumn("Nome");
        model.addColumn("Genero");
        authorsTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        
        for (Author author : authors) {
            model.addRow(new Object[]{author.getId(), author.getName(), author.isGender() == false ? "Feminino" : "Masculino"});
        }
    }
    
    public void enableCreateEdit(boolean createStatus) {
        inputName.setEnabled(createStatus);
        rbFame.setEnabled(createStatus);
        rbMale.setEnabled(createStatus);
        btnSave.setEnabled(createStatus);
        btnAdd.setEnabled(!createStatus);
        btnEdit.setEnabled(createStatus);

    }
    
    public void cleanData() {
        inputName.setText("");
        rbMale.setSelected(true);
        author = new Author();
    }
}
