package com.saojudas.nuplacar.CRUDUsuário;;

import com.saojudas.nuplacar.Campeonato;
import com.saojudas.nuplacar.TelaListarGrupos;
import com.saojudas.nuplacar.TelaInicialAdm;
import com.saojudas.nuplacar.CRUDTime.TelaListarTimes;
import com.saojudas.nuplacar.DAO.UsuarioDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TelaListarUsuarios extends javax.swing.JFrame {

    public TelaListarUsuarios() {
        super("Tela Inicial");
        initComponents();
        listarUsuariosTela();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usuarioTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        listarUsuariosButton = new javax.swing.JButton();
        buscarUsuarioTextField = new javax.swing.JTextField();
        listarUsuariosButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        deleteUsuarioButton = new javax.swing.JButton();
        editarUsuarioButton = new javax.swing.JButton();
        novoUsuarioButton2 = new javax.swing.JButton();
        menuLateralPanel = new javax.swing.JPanel();
        simularButton = new javax.swing.JButton();
        placarButton = new javax.swing.JButton();
        gruposButton = new javax.swing.JButton();
        timesButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gerenciarUsuariosButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuarioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Usuário", "Tipo de Usuário"
            }
        ));
        jScrollPane1.setViewportView(usuarioTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(233, 233, 233));

        listarUsuariosButton.setText("Buscar");
        listarUsuariosButton.setBorder(null);
        listarUsuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarUsuariosButtonActionPerformed(evt);
            }
        });

        listarUsuariosButton1.setText("Limpar");
        listarUsuariosButton1.setBorder(null);
        listarUsuariosButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarUsuariosButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(buscarUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listarUsuariosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listarUsuariosButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listarUsuariosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listarUsuariosButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(java.awt.SystemColor.controlHighlight);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        timeLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(151, 151, 151));
        timeLabel.setText("Gerenciar Usuários");

        deleteUsuarioButton.setBackground(new java.awt.Color(141, 27, 61));
        deleteUsuarioButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteUsuarioButton.setText("Deletar Usuário");
        deleteUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUsuarioButtonActionPerformed(evt);
            }
        });

        editarUsuarioButton.setBackground(new java.awt.Color(141, 27, 61));
        editarUsuarioButton.setForeground(new java.awt.Color(255, 255, 255));
        editarUsuarioButton.setText("Editar Usuário");
        editarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioButtonActionPerformed(evt);
            }
        });

        novoUsuarioButton2.setBackground(new java.awt.Color(141, 27, 61));
        novoUsuarioButton2.setForeground(new java.awt.Color(255, 255, 255));
        novoUsuarioButton2.setText("Novo Usuário");
        novoUsuarioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoUsuarioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(novoUsuarioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editarUsuarioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteUsuarioButton)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(novoUsuarioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        menuLateralPanel.setBackground(new java.awt.Color(141, 27, 61));
        menuLateralPanel.setForeground(new java.awt.Color(86, 4, 44));

        simularButton.setBackground(new java.awt.Color(141, 27, 61));
        simularButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        simularButton.setForeground(new java.awt.Color(255, 255, 255));
        simularButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simularMenu.png"))); // NOI18N
        simularButton.setText("  Simular");
        simularButton.setAlignmentY(0.0F);
        simularButton.setBorder(null);
        simularButton.setContentAreaFilled(false);
        simularButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        simularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simularButtonActionPerformed(evt);
            }
        });

        placarButton.setBackground(new java.awt.Color(105, 29, 51));
        placarButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        placarButton.setForeground(new java.awt.Color(255, 255, 255));
        placarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placarMenu.png"))); // NOI18N
        placarButton.setText("  Placar");
        placarButton.setBorder(null);
        placarButton.setBorderPainted(false);
        placarButton.setContentAreaFilled(false);
        placarButton.setFocusPainted(false);
        placarButton.setFocusable(false);
        placarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placarButtonActionPerformed(evt);
            }
        });

        gruposButton.setBackground(new java.awt.Color(141, 27, 61));
        gruposButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        gruposButton.setForeground(new java.awt.Color(255, 255, 255));
        gruposButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gruposMenu.png"))); // NOI18N
        gruposButton.setText("  Grupos");
        gruposButton.setBorder(null);
        gruposButton.setContentAreaFilled(false);
        gruposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruposButtonActionPerformed(evt);
            }
        });

        timesButton.setBackground(new java.awt.Color(141, 27, 61));
        timesButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        timesButton.setForeground(new java.awt.Color(255, 255, 255));
        timesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timesMenu.png"))); // NOI18N
        timesButton.setText("  Times");
        timesButton.setBorder(null);
        timesButton.setContentAreaFilled(false);
        timesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesButtonActionPerformed(evt);
            }
        });

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoNuplacarMenu.png"))); // NOI18N

        jPanel9.setBackground(new java.awt.Color(141, 27, 61));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile-user.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Admin");

        gerenciarUsuariosButton2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        gerenciarUsuariosButton2.setForeground(new java.awt.Color(255, 255, 255));
        gerenciarUsuariosButton2.setText("Gerenciar usuários");
        gerenciarUsuariosButton2.setBorder(null);
        gerenciarUsuariosButton2.setContentAreaFilled(false);
        gerenciarUsuariosButton2.setDefaultCapable(false);
        gerenciarUsuariosButton2.setMargin(new java.awt.Insets(2, 20, 3, 20));
        gerenciarUsuariosButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarUsuariosButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(gerenciarUsuariosButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gerenciarUsuariosButton2))
                    .addComponent(jLabel6))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout menuLateralPanelLayout = new javax.swing.GroupLayout(menuLateralPanel);
        menuLateralPanel.setLayout(menuLateralPanelLayout);
        menuLateralPanelLayout.setHorizontalGroup(
            menuLateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gruposButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(timesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(simularButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLateralPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLateralPanelLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        menuLateralPanelLayout.setVerticalGroup(
            menuLateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLateralPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gruposButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(simularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuLateralPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(menuLateralPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUsuarioButtonActionPerformed
        TelaDeletarUsuario TDU = new TelaDeletarUsuario ();
        TDU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteUsuarioButtonActionPerformed

    private void listarUsuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarUsuariosButtonActionPerformed
            UsuarioDAO usuarioDao = new UsuarioDAO();
            int id = Integer.parseInt(buscarUsuarioTextField.getText());
            ArrayList<Usuario> list = usuarioDao.obterUsuarioId(id);
            DefaultTableModel model = (DefaultTableModel)usuarioTable.getModel();
            model.setRowCount(0);
            Object[] row = new Object[3];
            for (int i = 0;i < list.size();i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getNome();
                row[2] = list.get(i).getTipoUsuario();
                model.addRow(row);
            }    
    }//GEN-LAST:event_listarUsuariosButtonActionPerformed

    private void simularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularButtonActionPerformed
        if (Campeonato.iniciarCampeonato()) {
        this.dispose();
        }
    }//GEN-LAST:event_simularButtonActionPerformed

    private void placarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placarButtonActionPerformed
        TelaInicialAdm tia = new TelaInicialAdm();
        tia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_placarButtonActionPerformed

    private void gruposButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposButtonActionPerformed
        TelaListarGrupos TLG = new TelaListarGrupos();
        TLG.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gruposButtonActionPerformed

    private void timesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesButtonActionPerformed
        TelaListarTimes tlt = new TelaListarTimes();
        tlt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_timesButtonActionPerformed

    private void listarUsuariosButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarUsuariosButton1ActionPerformed
        listarUsuariosTela();
    }//GEN-LAST:event_listarUsuariosButton1ActionPerformed

    private void editarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioButtonActionPerformed
        TelaEditarUsuario TEU = new TelaEditarUsuario ();
        TEU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editarUsuarioButtonActionPerformed

    private void novoUsuarioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoUsuarioButton2ActionPerformed
        TelaCadastrarUsuario TCU = new TelaCadastrarUsuario ();
        TCU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_novoUsuarioButton2ActionPerformed

    private void gerenciarUsuariosButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarUsuariosButton2ActionPerformed
        TelaListarUsuarios TLU = new TelaListarUsuarios();
        TLU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gerenciarUsuariosButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new TelaListarUsuarios().setVisible(true);
            }
        });
    }
    
    private void listarUsuariosTela() {
            
            UsuarioDAO usuarioDao = new UsuarioDAO();
            ArrayList<Usuario> list = usuarioDao.obterUsuario();
            DefaultTableModel model = (DefaultTableModel)usuarioTable.getModel();
            model.setRowCount(0);
            Object[] row = new Object[3];
            for (int i = 0;i < list.size();i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getNome();
                row[2] = list.get(i).getTipoUsuario();
                model.addRow(row);
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarUsuarioTextField;
    private javax.swing.JButton deleteUsuarioButton;
    private javax.swing.JButton editarUsuarioButton;
    private javax.swing.JButton gerenciarUsuariosButton2;
    private javax.swing.JButton gruposButton;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listarUsuariosButton;
    private javax.swing.JButton listarUsuariosButton1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel menuLateralPanel;
    private javax.swing.JButton novoUsuarioButton2;
    private javax.swing.JButton placarButton;
    private javax.swing.JButton simularButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JButton timesButton;
    private javax.swing.JTable usuarioTable;
    // End of variables declaration//GEN-END:variables
}
