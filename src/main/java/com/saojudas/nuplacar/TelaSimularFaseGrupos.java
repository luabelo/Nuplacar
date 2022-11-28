package com.saojudas.nuplacar;;

import com.saojudas.nuplacar.DAO.GrupoDAO;
import com.saojudas.nuplacar.DAO.TimeDAO;
import javax.swing.JTable;
import java.util.ArrayList;
import java.util.Collections;
import com.saojudas.nuplacar.CRUDTime.Time;


public class TelaSimularFaseGrupos extends javax.swing.JFrame {

    private Campeonato campeonato;
    
    public TelaSimularFaseGrupos(ArrayList<Grupo> grupos) {
        super("Simular fase grupos");
        
        initComponents();
        setLocationRelativeTo(null);
        
        this.campeonato = new Campeonato(grupos);
        setValoresIniciaisTabelas();
    }
    
    public TelaSimularFaseGrupos(ArrayList<Grupo> grupos, boolean voltandoDeMataMata) {
        super("Simular fase grupos");
        
        initComponents();
        setLocationRelativeTo(null);
        
        if (voltandoDeMataMata) {
            SimularButton.setEnabled(false);
            refazerSimulacaoButton.setEnabled(true);
        }
        
        this.campeonato = new Campeonato(grupos);
        setValoresIniciaisTabelas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        FaseGruposLabel = new javax.swing.JLabel();
        voltarButton = new javax.swing.JButton();
        refazerSimulacaoButton = new javax.swing.JButton();
        avancarButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        grupoATable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        grupoCTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        grupoBTable = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        grupoDTable = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        grupoFTable = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        grupoHTable = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        grupoETable = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        grupoGTable = new javax.swing.JTable();
        SimularButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(141, 27, 61));

        FaseGruposLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        FaseGruposLabel.setForeground(new java.awt.Color(255, 255, 255));
        FaseGruposLabel.setText("Fase de grupos");
        FaseGruposLabel.setMaximumSize(new java.awt.Dimension(142, 48));
        FaseGruposLabel.setMinimumSize(new java.awt.Dimension(142, 48));

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        refazerSimulacaoButton.setText("Refazer simulação");
        refazerSimulacaoButton.setEnabled(false);
        refazerSimulacaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refazerSimulacaoButtonActionPerformed(evt);
            }
        });

        avancarButton.setText("Avançar para a próxima fase");
        avancarButton.setEnabled(false);
        avancarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avancarButtonActionPerformed(evt);
            }
        });

        grupoATable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        grupoATable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Brasil",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Jamaica",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Coreia do Sul",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Afeganistão",  new Integer(5),  new Integer(5),  new Integer(5)}
            },
            new String [] {
                "Grupo A", "P", "G", "S"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupoATable.setGridColor(new java.awt.Color(153, 102, 255));
        grupoATable.setRowHeight(30);
        grupoATable.setRowSelectionAllowed(false);
        jScrollPane4.setViewportView(grupoATable);
        if (grupoATable.getColumnModel().getColumnCount() > 0) {
            grupoATable.getColumnModel().getColumn(0).setPreferredWidth(700);
        }

        grupoCTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        grupoCTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Brasil",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Jamaica",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Coreia do Sul",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Afeganistão",  new Integer(5),  new Integer(5),  new Integer(5)}
            },
            new String [] {
                "Grupo C", "P", "G", "S"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupoCTable.setGridColor(new java.awt.Color(153, 102, 255));
        grupoCTable.setRowHeight(30);
        grupoCTable.setRowSelectionAllowed(false);
        jScrollPane5.setViewportView(grupoCTable);
        if (grupoCTable.getColumnModel().getColumnCount() > 0) {
            grupoCTable.getColumnModel().getColumn(0).setPreferredWidth(700);
        }

        grupoBTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        grupoBTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Brasil",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Jamaica",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Coreia do Sul",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Afeganistão",  new Integer(5),  new Integer(5),  new Integer(5)}
            },
            new String [] {
                "Grupo B", "P", "G", "S"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupoBTable.setGridColor(new java.awt.Color(153, 102, 255));
        grupoBTable.setRowHeight(30);
        grupoBTable.setRowSelectionAllowed(false);
        jScrollPane6.setViewportView(grupoBTable);
        if (grupoBTable.getColumnModel().getColumnCount() > 0) {
            grupoBTable.getColumnModel().getColumn(0).setPreferredWidth(700);
        }

        grupoDTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        grupoDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Brasil",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Jamaica",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Coreia do Sul",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Afeganistão",  new Integer(5),  new Integer(5),  new Integer(5)}
            },
            new String [] {
                "Grupo D", "P", "G", "S"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupoDTable.setGridColor(new java.awt.Color(153, 102, 255));
        grupoDTable.setRowHeight(30);
        grupoDTable.setRowSelectionAllowed(false);
        jScrollPane7.setViewportView(grupoDTable);
        if (grupoDTable.getColumnModel().getColumnCount() > 0) {
            grupoDTable.getColumnModel().getColumn(0).setPreferredWidth(700);
        }

        grupoFTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        grupoFTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Brasil",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Jamaica",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Coreia do Sul",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Afeganistão",  new Integer(5),  new Integer(5),  new Integer(5)}
            },
            new String [] {
                "Grupo F", "P", "G", "S"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupoFTable.setGridColor(new java.awt.Color(153, 102, 255));
        grupoFTable.setRowHeight(30);
        grupoFTable.setRowSelectionAllowed(false);
        jScrollPane8.setViewportView(grupoFTable);
        if (grupoFTable.getColumnModel().getColumnCount() > 0) {
            grupoFTable.getColumnModel().getColumn(0).setPreferredWidth(700);
        }

        grupoHTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        grupoHTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Brasil",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Jamaica",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Coreia do Sul",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Afeganistão",  new Integer(5),  new Integer(5),  new Integer(5)}
            },
            new String [] {
                "Grupo H", "P", "G", "S"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupoHTable.setGridColor(new java.awt.Color(153, 102, 255));
        grupoHTable.setRowHeight(30);
        grupoHTable.setRowSelectionAllowed(false);
        jScrollPane9.setViewportView(grupoHTable);
        if (grupoHTable.getColumnModel().getColumnCount() > 0) {
            grupoHTable.getColumnModel().getColumn(0).setPreferredWidth(700);
        }

        grupoETable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        grupoETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Brasil",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Jamaica",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Coreia do Sul",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Afeganistão",  new Integer(5),  new Integer(5),  new Integer(5)}
            },
            new String [] {
                "Grupo E", "P", "G", "S"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupoETable.setGridColor(new java.awt.Color(153, 102, 255));
        grupoETable.setRowHeight(30);
        grupoETable.setRowSelectionAllowed(false);
        jScrollPane10.setViewportView(grupoETable);
        if (grupoETable.getColumnModel().getColumnCount() > 0) {
            grupoETable.getColumnModel().getColumn(0).setPreferredWidth(700);
        }

        grupoGTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        grupoGTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Brasil",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Jamaica",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Coreia do Sul",  new Integer(5),  new Integer(5),  new Integer(5)},
                {"Afeganistão",  new Integer(5),  new Integer(5),  new Integer(5)}
            },
            new String [] {
                "Grupo G", "P", "G", "S"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupoGTable.setGridColor(new java.awt.Color(153, 102, 255));
        grupoGTable.setRowHeight(30);
        grupoGTable.setRowSelectionAllowed(false);
        jScrollPane11.setViewportView(grupoGTable);
        if (grupoGTable.getColumnModel().getColumnCount() > 0) {
            grupoGTable.getColumnModel().getColumn(0).setPreferredWidth(700);
        }

        SimularButton.setText("Simular agora");
        SimularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimularButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(FaseGruposLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(318, 318, 318)
                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(SimularButton)
                        .addGap(43, 43, 43)
                        .addComponent(refazerSimulacaoButton)
                        .addGap(33, 33, 33)
                        .addComponent(avancarButton))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(FaseGruposLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avancarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refazerSimulacaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SimularButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        new TelaInicialAdm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void SimularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimularButtonActionPerformed
        simularFaseGrupo();
        refazerSimulacaoButton.setEnabled(true);
        avancarButton.setEnabled(true);
        SimularButton.setEnabled(false);
    }//GEN-LAST:event_SimularButtonActionPerformed

    private void refazerSimulacaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refazerSimulacaoButtonActionPerformed
        TimeDAO.zerarClassificacaoGeral();
        this.campeonato = new Campeonato(GrupoDAO.listarGruposCompletos());
        simularFaseGrupo();
        avancarButton.setEnabled(true);
    }//GEN-LAST:event_refazerSimulacaoButtonActionPerformed

    private void avancarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avancarButtonActionPerformed
        new TelaSimularMataMata(this.campeonato).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_avancarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSimularFaseGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSimularFaseGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSimularFaseGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSimularFaseGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSimularFaseGrupos(GrupoDAO.listarGruposCompletos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FaseGruposLabel;
    private javax.swing.JButton SimularButton;
    private javax.swing.JButton avancarButton;
    private javax.swing.JTable grupoATable;
    private javax.swing.JTable grupoBTable;
    private javax.swing.JTable grupoCTable;
    private javax.swing.JTable grupoDTable;
    private javax.swing.JTable grupoETable;
    private javax.swing.JTable grupoFTable;
    private javax.swing.JTable grupoGTable;
    private javax.swing.JTable grupoHTable;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton refazerSimulacaoButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables

    private void simularFaseGrupo() {
        campeonato.simularPartidasFaseGrupo();
        campeonato.getGrupos().forEach((grupo) -> {
            ArrayList<Time> times = grupo.getTimes();
            Collections.sort(times, new ClassificacaoComparator());
            switch (grupo.getId()) {
                case 'A' -> setResultadoSimulacao(grupoATable, times);
                case 'B' -> setResultadoSimulacao(grupoBTable, times);
                case 'C' -> setResultadoSimulacao(grupoCTable, times);
                case 'D' -> setResultadoSimulacao(grupoDTable, times);
                case 'E' -> setResultadoSimulacao(grupoETable, times);
                case 'F' -> setResultadoSimulacao(grupoFTable, times);
                case 'G' -> setResultadoSimulacao(grupoGTable, times);
                case 'H' -> setResultadoSimulacao(grupoHTable, times);
            }
        });
    }
    
    private void setValoresIniciaisTabelas() {
        ArrayList<Grupo> grupos = campeonato.getGrupos();
        grupos.forEach((grupo) -> {
            ArrayList<Time> times = grupo.getTimes();
            switch (grupo.getId()) {
                case 'A' -> setValorTabela(grupoATable, times);
                case 'B' -> setValorTabela(grupoBTable, times);
                case 'C' -> setValorTabela(grupoCTable, times);
                case 'D' -> setValorTabela(grupoDTable, times);
                case 'E' -> setValorTabela(grupoETable, times);
                case 'F' -> setValorTabela(grupoFTable, times);
                case 'G' -> setValorTabela(grupoGTable, times);
                case 'H' -> setValorTabela(grupoHTable, times);
            }
        });
    }
    
    private void setValorTabela(JTable tabela, ArrayList<Time> times) {        
        for (int i = 0; i < 4; i++) {
            tabela.setValueAt(times.get(i).getNome(), i, 0);
            tabela.setValueAt(0, i, 1);
            tabela.setValueAt(0, i, 2);
            tabela.setValueAt(0, i, 3);
        }
    }
    
    private void setResultadoSimulacao(JTable tabela, ArrayList<Time> times) {
        for (int i = 0; i < 4; i++) {
            tabela.setValueAt(times.get(i).getNome(), i, 0);
            tabela.setValueAt(times.get(i).getPontos(), i, 1);
            tabela.setValueAt(times.get(i).getGolPro(), i, 2);
            tabela.setValueAt(times.get(i).getSaldoGols(), i, 3);
        }
    }
}
