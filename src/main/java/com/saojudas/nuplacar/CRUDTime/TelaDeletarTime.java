package com.saojudas.nuplacar.CRUDTime;;

import com.saojudas.nuplacar.Campeonato;
import com.saojudas.nuplacar.CRUDUsuario.TelaListarUsuarios;
import com.saojudas.nuplacar.Campeonato;
import com.saojudas.nuplacar.TelaInicialAdm;
import com.saojudas.nuplacar.DAO.TimeDAO;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import com.saojudas.nuplacar.CRUDUsuario.TelaListarUsuarios;
import com.saojudas.nuplacar.TelaInicialAdm;
import com.saojudas.nuplacar.DAO.TimeDAO;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TelaDeletarTime extends javax.swing.JFrame {

    public TelaDeletarTime() {
        super("Tela Inicial");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        deletarTimeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        deletaTimeTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        buscarIdTextField = new javax.swing.JTextField();
        buscarUsuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        novoTimeButton = new javax.swing.JButton();
        menuLateralPanel = new javax.swing.JPanel();
        simularButton = new javax.swing.JButton();
        placarButton = new javax.swing.JButton();
        gruposButton = new javax.swing.JButton();
        timesButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gerenciarUsuariosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deletarTimeButton.setBackground(new java.awt.Color(141, 27, 61));
        deletarTimeButton.setForeground(new java.awt.Color(255, 255, 255));
        deletarTimeButton.setText("Deletar time");
        deletarTimeButton.setBorder(null);
        deletarTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarTimeButtonActionPerformed(evt);
            }
        });

        deletaTimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Bandeira"
            }
        ));
        jScrollPane1.setViewportView(deletaTimeTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(151, 151, 151));
        jLabel1.setText("Dados atuais");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                    .addComponent(deletarTimeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(deletarTimeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(233, 233, 233));

        buscarIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarIdTextFieldActionPerformed(evt);
            }
        });

        buscarUsuario.setText("Buscar");
        buscarUsuario.setBorder(null);
        buscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(buscarIdTextField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
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
        timeLabel.setText("Deletar Time");

        novoTimeButton.setBackground(new java.awt.Color(141, 27, 61));
        novoTimeButton.setForeground(new java.awt.Color(255, 255, 255));
        novoTimeButton.setText("Novo Time");
        novoTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoTimeButtonActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(novoTimeButton)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novoTimeButton))
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

        timesButton.setBackground(new java.awt.Color(105, 29, 51));
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

        jPanel7.setBackground(new java.awt.Color(141, 27, 61));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile-user.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Admin");

        gerenciarUsuariosButton.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        gerenciarUsuariosButton.setForeground(new java.awt.Color(255, 255, 255));
        gerenciarUsuariosButton.setText("Gerenciar usuários");
        gerenciarUsuariosButton.setBorder(null);
        gerenciarUsuariosButton.setContentAreaFilled(false);
        gerenciarUsuariosButton.setDefaultCapable(false);
        gerenciarUsuariosButton.setMargin(new java.awt.Insets(2, 20, 3, 20));
        gerenciarUsuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarUsuariosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(gerenciarUsuariosButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gerenciarUsuariosButton))
                    .addComponent(jLabel2))
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
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(menuLateralPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoTimeButtonActionPerformed
        TelaCadastrarTimes TCT = new TelaCadastrarTimes();
        TCT.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_novoTimeButtonActionPerformed

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
        // colocar redirecionamento para telaListarGrupos
    }//GEN-LAST:event_gruposButtonActionPerformed

    private void timesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesButtonActionPerformed
        TelaListarTimes tlt = new TelaListarTimes();
        tlt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_timesButtonActionPerformed

    private void buscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUsuarioActionPerformed
            TimeDAO timeDAO = new TimeDAO();
            int id = Integer.parseInt(buscarIdTextField.getText());
            ArrayList<Time> list = timeDAO.obterTimeId(id);
            DefaultTableModel model = (DefaultTableModel)deletaTimeTable.getModel();
            model.setRowCount(0);
            Object[] row = new Object[3];
            for (int i = 0;i < list.size();i++) {
                row[0] = list.get(i).getIdTime();
                row[1] = list.get(i).getNome();
                row[2] = list.get(i).getBandeira();
                model.addRow(row);
            }  
    }//GEN-LAST:event_buscarUsuarioActionPerformed

    private void buscarIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarIdTextFieldActionPerformed

    private void deletarTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarTimeButtonActionPerformed
        TimeDAO timeDAO = new TimeDAO();
        int id = Integer.parseInt(buscarIdTextField.getText());
        
        int confirmacao = JOptionPane.showConfirmDialog(null,
                "Essa ação é irreversível. Deseja continuar?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,2);
        if (confirmacao == JOptionPane.YES_OPTION) {
            timeDAO.deletarTime(id);
            atualizarTabela();
            JOptionPane.showMessageDialog(null, "Time deletado com sucesso","NuPlacar",1);
        } else if (confirmacao == JOptionPane.NO_OPTION){
        }
    }//GEN-LAST:event_deletarTimeButtonActionPerformed

    private void gerenciarUsuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarUsuariosButtonActionPerformed
        TelaListarUsuarios TLU = new TelaListarUsuarios();
        TLU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gerenciarUsuariosButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeletarTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TelaDeletarTime().setVisible(true);
            }
        });
    }
    
    private void atualizarTabela() {
        TimeDAO timeDAO = new TimeDAO();
            int id = Integer.parseInt(buscarIdTextField.getText());
            ArrayList<Time> list = timeDAO.obterTimeId(id);
            DefaultTableModel model = (DefaultTableModel)deletaTimeTable.getModel();
            model.setRowCount(0);
            Object[] row = new Object[3];
            for (int i = 0;i < list.size();i++) {
                row[0] = list.get(i).getIdTime();
                row[1] = list.get(i).getNome();
                row[2] = list.get(i).getBandeira();
                model.addRow(row);
            }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarIdTextField;
    private javax.swing.JButton buscarUsuario;
    private javax.swing.JTable deletaTimeTable;
    private javax.swing.JButton deletarTimeButton;
    private javax.swing.JButton gerenciarUsuariosButton;
    private javax.swing.JButton gruposButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel menuLateralPanel;
    private javax.swing.JButton novoTimeButton;
    private javax.swing.JButton placarButton;
    private javax.swing.JButton simularButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JButton timesButton;
    // End of variables declaration//GEN-END:variables
}
