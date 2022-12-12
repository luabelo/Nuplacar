package com.saojudas.nuplacar;;


import com.saojudas.nuplacar.CRUDTime.*;
import com.saojudas.nuplacar.DAO.TimeDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import com.saojudas.nuplacar.DAO.GrupoDAO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class TelaListarGrupos extends javax.swing.JFrame {
    
    public TelaListarGrupos() {
        super("Tela Inicial");
        initComponents();
        buscarGrupos();
        buscarTimes();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grupoATable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grupoBTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        grupoDTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        grupoCTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        grupoFTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        grupoETable = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        grupoGTable = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        grupoHTable = new javax.swing.JTable();
        salvarConjuntoButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        conjuntosComboBox = new javax.swing.JComboBox<>();
        novoTimeButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        menuLateralPanel = new javax.swing.JPanel();
        simularButton = new javax.swing.JButton();
        placarButton = new javax.swing.JButton();
        gruposButton = new javax.swing.JButton();
        timesButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        gerenciarUsuariosButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        timesComboBox = new javax.swing.JComboBox<>();
        gruposComboBox = new javax.swing.JComboBox<>();
        AdicionarTimesGrupos = new javax.swing.JButton();
        idConjuntoGrupoTextField = new javax.swing.JTextField();
        limparGruposButton = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Grupo A");

        jLabel2.setText("Grupo B");

        jLabel3.setText("Grupo D");

        jLabel4.setText("Grupo C");

        grupoATable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        jScrollPane1.setViewportView(grupoATable);

        jLabel5.setText("Grupo E");

        jLabel7.setText("Grupo F");

        jLabel8.setText("Grupo G");

        jLabel9.setText("Grupo H");

        grupoBTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        jScrollPane2.setViewportView(grupoBTable);

        grupoDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        jScrollPane3.setViewportView(grupoDTable);

        grupoCTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        jScrollPane4.setViewportView(grupoCTable);

        grupoFTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        jScrollPane5.setViewportView(grupoFTable);

        grupoETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        jScrollPane6.setViewportView(grupoETable);

        grupoGTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        jScrollPane7.setViewportView(grupoGTable);

        grupoHTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        jScrollPane8.setViewportView(grupoHTable);

        salvarConjuntoButton.setBackground(new java.awt.Color(141, 27, 61));
        salvarConjuntoButton.setForeground(new java.awt.Color(255, 255, 255));
        salvarConjuntoButton.setText("Salvar");
        salvarConjuntoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarConjuntoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel5)
                                .addGap(116, 116, 116)
                                .addComponent(jLabel7)
                                .addGap(115, 115, 115)
                                .addComponent(jLabel8)
                                .addGap(107, 107, 107)
                                .addComponent(jLabel9))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel1)
                                .addGap(114, 114, 114)
                                .addComponent(jLabel2)
                                .addGap(114, 114, 114)
                                .addComponent(jLabel4)
                                .addGap(113, 113, 113)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(salvarConjuntoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(salvarConjuntoButton)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(233, 233, 233));

        conjuntosComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                conjuntosComboBoxItemStateChanged(evt);
            }
        });
        conjuntosComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conjuntosComboBoxMouseClicked(evt);
            }
        });
        conjuntosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conjuntosComboBoxActionPerformed(evt);
            }
        });

        novoTimeButton2.setBackground(new java.awt.Color(141, 27, 61));
        novoTimeButton2.setForeground(new java.awt.Color(255, 255, 255));
        novoTimeButton2.setText("Escolher");
        novoTimeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoTimeButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(conjuntosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(novoTimeButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conjuntosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novoTimeButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        timeLabel.setText("Grupos");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel8.setBackground(new java.awt.Color(141, 27, 61));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile-user.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Admin");

        gerenciarUsuariosButton1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        gerenciarUsuariosButton1.setForeground(new java.awt.Color(255, 255, 255));
        gerenciarUsuariosButton1.setText("Gerenciar usuários");
        gerenciarUsuariosButton1.setBorder(null);
        gerenciarUsuariosButton1.setContentAreaFilled(false);
        gerenciarUsuariosButton1.setDefaultCapable(false);
        gerenciarUsuariosButton1.setMargin(new java.awt.Insets(2, 20, 3, 20));
        gerenciarUsuariosButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarUsuariosButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(gerenciarUsuariosButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gerenciarUsuariosButton1))
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
                    .addGroup(menuLateralPanelLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.setBackground(new java.awt.Color(233, 233, 233));

        timesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesComboBoxActionPerformed(evt);
            }
        });

        gruposComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grupo A", "Grupo B ", "Grupo C", "Grupo D", "Grupo E", "Grupo F", "Grupo G", "Grupo H" }));
        gruposComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruposComboBoxActionPerformed(evt);
            }
        });

        AdicionarTimesGrupos.setBackground(new java.awt.Color(141, 27, 61));
        AdicionarTimesGrupos.setForeground(new java.awt.Color(255, 255, 255));
        AdicionarTimesGrupos.setText("Adicionar Time");
        AdicionarTimesGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarTimesGruposActionPerformed(evt);
            }
        });

        idConjuntoGrupoTextField.setBackground(new java.awt.Color(233, 233, 233));
        idConjuntoGrupoTextField.setToolTipText("");
        idConjuntoGrupoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Insira o nome do \"Conjunto de Grupos\""));

        limparGruposButton.setBackground(new java.awt.Color(141, 27, 61));
        limparGruposButton.setForeground(new java.awt.Color(255, 255, 255));
        limparGruposButton.setText("Limpar Grupos");
        limparGruposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparGruposButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gruposComboBox, 0, 681, Short.MAX_VALUE)
                    .addComponent(idConjuntoGrupoTextField))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdicionarTimesGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limparGruposButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(idConjuntoGrupoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(timesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gruposComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(limparGruposButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AdicionarTimesGrupos)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuLateralPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(menuLateralPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void timesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesComboBoxActionPerformed
       
    }//GEN-LAST:event_timesComboBoxActionPerformed

    private void gruposComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposComboBoxActionPerformed

    }//GEN-LAST:event_gruposComboBoxActionPerformed

    private void AdicionarTimesGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarTimesGruposActionPerformed
       switch (gruposComboBox.getSelectedIndex()+1) {
        case 1:
                DefaultTableModel model8 = (DefaultTableModel) grupoATable.getModel();
                if(model8.getRowCount() <  4){
                model8.addRow(new Object[] {timesComboBox.getSelectedItem()});
                } else {}
                break;
        case 2:
                DefaultTableModel model9 = (DefaultTableModel) grupoBTable.getModel();
                if(model9.getRowCount() <  4){
                model9.addRow(new Object[] {timesComboBox.getSelectedItem()});
                } else {}
                break;
        case 3:
                DefaultTableModel model10 = (DefaultTableModel) grupoCTable.getModel();
                if(model10.getRowCount() <  4){
                model10.addRow(new Object[]{timesComboBox.getSelectedItem()});
                } else {}
                break;
        case 4:
                DefaultTableModel model11 = (DefaultTableModel) grupoDTable.getModel();
                if(model11.getRowCount() <  4){
                model11.addRow(new Object[] {timesComboBox.getSelectedItem()});
                } else {}
                break;
        case 5:
                DefaultTableModel model12 = (DefaultTableModel) grupoETable.getModel();
                if(model12.getRowCount() <  4){
                model12.addRow(new Object[] {timesComboBox.getSelectedItem()});
                } else {}
                break;        
        case 6:
                DefaultTableModel model13 = (DefaultTableModel) grupoFTable.getModel();
                if(model13.getRowCount() <  4){
                model13.addRow(new Object[] {timesComboBox.getSelectedItem()});
                } else {}
                break;       
        case 7:
                DefaultTableModel model14 = (DefaultTableModel) grupoGTable.getModel();
                if(model14.getRowCount() <  4){
                model14.addRow(new Object[] {timesComboBox.getSelectedItem()});
                } else {}
                break;
        case 8:
                DefaultTableModel model15 = (DefaultTableModel) grupoHTable.getModel();
                if(model15.getRowCount() <  4){
                model15.addRow(new Object[] {timesComboBox.getSelectedItem()});
                } else {}
                break;           
       }
    }//GEN-LAST:event_AdicionarTimesGruposActionPerformed

    private void novoTimeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoTimeButton2ActionPerformed
        adicionarTimes();
    }//GEN-LAST:event_novoTimeButton2ActionPerformed

    private void conjuntosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conjuntosComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conjuntosComboBoxActionPerformed

    private void salvarConjuntoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarConjuntoButtonActionPerformed
        SalvarConjuntosDB();
        JOptionPane.showMessageDialog(null, "Conjunto cadastrado com sucesso","NuPlacar",1);
        buscarGrupos();
    }//GEN-LAST:event_salvarConjuntoButtonActionPerformed

    private void limparGruposButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparGruposButtonActionPerformed
        limparGrupos();
    }//GEN-LAST:event_limparGruposButtonActionPerformed

    private void conjuntosComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conjuntosComboBoxMouseClicked

    }//GEN-LAST:event_conjuntosComboBoxMouseClicked

    private void conjuntosComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_conjuntosComboBoxItemStateChanged

    }//GEN-LAST:event_conjuntosComboBoxItemStateChanged

    private void gerenciarUsuariosButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarUsuariosButton1ActionPerformed

    }//GEN-LAST:event_gerenciarUsuariosButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaListarGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaListarGrupos().setVisible(true);
            }
        });
    }
    
    

    
    
    private void adicionarTimes() {
            GrupoDAO grupoDAO = new GrupoDAO();
            ArrayList<Time> timesA = grupoDAO.obterTimes(conjuntosComboBox.getSelectedItem().toString(), "A");
            DefaultTableModel modelA = (DefaultTableModel)grupoATable.getModel();
            modelA.setRowCount(0);
            Object[] objA = new Object[1];
            for (int i = 0;i < 4;i++) {
                objA[0] = timesA.get(i).getNome();
                modelA.addRow(objA);  
            }    
            ArrayList<Time> timesB = grupoDAO.obterTimes(conjuntosComboBox.getSelectedItem().toString(), "B");  
            DefaultTableModel modelB = (DefaultTableModel)grupoBTable.getModel();
            modelB.setRowCount(0);
            Object[] objB = new Object[1];
            for (int i = 0;i < 4;i++) {
                objB[0] = timesB.get(i).getNome();
                modelB.addRow(objB);      
            }
            ArrayList<Time> timesC = grupoDAO.obterTimes(conjuntosComboBox.getSelectedItem().toString(), "C");  
            DefaultTableModel modelC = (DefaultTableModel)grupoCTable.getModel();
            modelC.setRowCount(0);
            Object[] objC = new Object[1];
            for (int i = 0;i < 4;i++) {
                objC[0] = timesC.get(i).getNome();
                modelC.addRow(objC);         
            }
            ArrayList<Time> timesD = grupoDAO.obterTimes(conjuntosComboBox.getSelectedItem().toString(), "D");  
            DefaultTableModel modelD = (DefaultTableModel)grupoDTable.getModel();
            modelD.setRowCount(0);
            Object[] objD = new Object[1];
            for (int i = 0;i < 4;i++) {
                objD[0] = timesD.get(i).getNome();
                modelD.addRow(objD);         
            }
            ArrayList<Time> timesE = grupoDAO.obterTimes(conjuntosComboBox.getSelectedItem().toString(), "E");  
            DefaultTableModel modelE = (DefaultTableModel)grupoETable.getModel();
            modelE.setRowCount(0);
            Object[] objE = new Object[1];
            for (int i = 0;i < 4;i++) {
                objE[0] = timesE.get(i).getNome();
                modelE.addRow(objE);         
            }
            ArrayList<Time> timesF = grupoDAO.obterTimes(conjuntosComboBox.getSelectedItem().toString(), "F");  
            DefaultTableModel modelF = (DefaultTableModel)grupoFTable.getModel();
            modelF.setRowCount(0);
            Object[] objF = new Object[1];
            for (int i = 0;i < 4;i++) {
                objF[0] = timesF.get(i).getNome();
                modelF.addRow(objF);         
            }
            ArrayList<Time> timesG = grupoDAO.obterTimes(conjuntosComboBox.getSelectedItem().toString(), "G");  
            DefaultTableModel modelG = (DefaultTableModel)grupoGTable.getModel();
            modelG.setRowCount(0);
            Object[] objG = new Object[1];
            for (int i = 0;i < 4;i++) {
                objG[0] = timesG.get(i).getNome();
                modelG.addRow(objG);         
            }
            ArrayList<Time> timesH = grupoDAO.obterTimes(conjuntosComboBox.getSelectedItem().toString(), "H");  
            DefaultTableModel modelH = (DefaultTableModel)grupoHTable.getModel();
            modelH.setRowCount(0);
            Object[] objH = new Object[1];
            for (int i = 0;i < 4;i++) {
                objH[0] = timesH.get(i).getNome();
                modelH.addRow(objH);         
            }
    }

        private void SalvarConjuntosDB() {
            GrupoDAO grupoDAO = new GrupoDAO();

            String time1 = grupoATable.getModel().getValueAt(0,0).toString();
            String time2 = grupoATable.getModel().getValueAt(1,0).toString();
            String time3 = grupoATable.getModel().getValueAt(2,0).toString();
            String time4 = grupoATable.getModel().getValueAt(3,0).toString();
            String idConjuntoGrupos = idConjuntoGrupoTextField.getText();
            grupoDAO.inserirTimesGruposDB("A", time1, time2, time3, time4, idConjuntoGrupos);
            
            String time5 = grupoBTable.getModel().getValueAt(0,0).toString();
            String time6 = grupoBTable.getModel().getValueAt(1,0).toString();
            String time7 = grupoBTable.getModel().getValueAt(2,0).toString();
            String time8 = grupoBTable.getModel().getValueAt(3,0).toString();
            String idConjuntoGrupos1 = idConjuntoGrupoTextField.getText();
            grupoDAO.inserirTimesGruposDB("B", time5, time6, time7, time8, idConjuntoGrupos1);
            
            String time9 = grupoCTable.getModel().getValueAt(0,0).toString();
            String time10 = grupoCTable.getModel().getValueAt(1,0).toString();
            String time11 = grupoCTable.getModel().getValueAt(2,0).toString();
            String time12 = grupoCTable.getModel().getValueAt(3,0).toString();
            String idConjuntoGrupos2 = idConjuntoGrupoTextField.getText();
            grupoDAO.inserirTimesGruposDB("C", time9, time10, time11, time12, idConjuntoGrupos2);
            
            String time13 = grupoDTable.getModel().getValueAt(0,0).toString();
            String time14 = grupoDTable.getModel().getValueAt(1,0).toString();
            String time15 = grupoDTable.getModel().getValueAt(2,0).toString();
            String time16 = grupoDTable.getModel().getValueAt(3,0).toString();
            String idConjuntoGrupos3 = idConjuntoGrupoTextField.getText();
            grupoDAO.inserirTimesGruposDB("D", time13, time14, time15, time16, idConjuntoGrupos3);
            
            String time17 = grupoETable.getModel().getValueAt(0,0).toString();
            String time18 = grupoETable.getModel().getValueAt(1,0).toString();
            String time19 = grupoETable.getModel().getValueAt(2,0).toString();
            String time20 = grupoETable.getModel().getValueAt(3,0).toString();
            String idConjuntoGrupos4 = idConjuntoGrupoTextField.getText();
            grupoDAO.inserirTimesGruposDB("E", time17, time18, time19, time20, idConjuntoGrupos4);
            
            String time21 = grupoFTable.getModel().getValueAt(0,0).toString();
            String time22 = grupoFTable.getModel().getValueAt(1,0).toString();
            String time23 = grupoFTable.getModel().getValueAt(2,0).toString();
            String time24 = grupoFTable.getModel().getValueAt(3,0).toString();
            String idConjuntoGrupos5 = idConjuntoGrupoTextField.getText();
            grupoDAO.inserirTimesGruposDB("F", time21, time22, time23, time24, idConjuntoGrupos5);
            
            String time25 = grupoGTable.getModel().getValueAt(0,0).toString();
            String time26 = grupoGTable.getModel().getValueAt(1,0).toString();
            String time27 = grupoGTable.getModel().getValueAt(2,0).toString();
            String time28 = grupoGTable.getModel().getValueAt(3,0).toString();
            String idConjuntoGrupos6 = idConjuntoGrupoTextField.getText();
            grupoDAO.inserirTimesGruposDB("G", time25, time26, time27, time28, idConjuntoGrupos6);
            
            String time29 = grupoHTable.getModel().getValueAt(0,0).toString();
            String time30 = grupoHTable.getModel().getValueAt(1,0).toString();
            String time31 = grupoHTable.getModel().getValueAt(2,0).toString();
            String time32 = grupoHTable.getModel().getValueAt(3,0).toString();
            String idConjuntoGrupos7 = idConjuntoGrupoTextField.getText();
            grupoDAO.inserirTimesGruposDB("H", time29, time30, time31, time32, idConjuntoGrupos7);
        }
    
        
    private void limparGrupos () {
       DefaultTableModel modelA = (DefaultTableModel)grupoATable.getModel();
       modelA.setRowCount(0);
       
       DefaultTableModel modelB = (DefaultTableModel)grupoBTable.getModel();
       modelB.setRowCount(0);
       
       DefaultTableModel modelC = (DefaultTableModel)grupoCTable.getModel();
       modelC.setRowCount(0);
       
       DefaultTableModel modelD = (DefaultTableModel)grupoDTable.getModel();
       modelD.setRowCount(0);
       
       DefaultTableModel modelE = (DefaultTableModel)grupoETable.getModel();
       modelE.setRowCount(0);
       
       DefaultTableModel modelF = (DefaultTableModel)grupoFTable.getModel();
       modelF.setRowCount(0);
       
       DefaultTableModel modelG = (DefaultTableModel)grupoGTable.getModel();
       modelG.setRowCount(0);
       
       DefaultTableModel modelH = (DefaultTableModel)grupoHTable.getModel();
       modelH.setRowCount(0);
    }    
        
    private void buscarTimes() {
        try {
            TimeDAO timeDAO = new TimeDAO();
            ArrayList<Time> time = timeDAO.obterTimes();
            timesComboBox.setModel(new DefaultComboBoxModel<>(time.toArray()));
            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Times indisponíveis");
            e.printStackTrace();
        }
    }
    
        private void buscarGrupos() {
        try {
            GrupoDAO grupoDAO = new GrupoDAO();
            ConjuntoGrupos[] conjuntoGrupos = grupoDAO.obterConjuntoGrupos();
            conjuntosComboBox.setModel(new DefaultComboBoxModel<>(conjuntoGrupos));
            }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Grupos indisponíveis");
            e.printStackTrace();
            }
        }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarTimesGrupos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JComboBox<ConjuntoGrupos> conjuntosComboBox;
    private javax.swing.JButton gerenciarUsuariosButton1;
    private javax.swing.JTable grupoATable;
    private javax.swing.JTable grupoBTable;
    private javax.swing.JTable grupoCTable;
    private javax.swing.JTable grupoDTable;
    private javax.swing.JTable grupoETable;
    private javax.swing.JTable grupoFTable;
    private javax.swing.JTable grupoGTable;
    private javax.swing.JTable grupoHTable;
    private javax.swing.JButton gruposButton;
    private javax.swing.JComboBox<String> gruposComboBox;
    private javax.swing.JTextField idConjuntoGrupoTextField;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JButton limparGruposButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel menuLateralPanel;
    private javax.swing.JButton novoTimeButton2;
    private javax.swing.JButton placarButton;
    private javax.swing.JButton salvarConjuntoButton;
    private javax.swing.JButton simularButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JButton timesButton;
    private javax.swing.JComboBox<Object> timesComboBox;
    // End of variables declaration//GEN-END:variables
}
