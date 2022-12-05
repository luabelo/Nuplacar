package com.saojudas.nuplacar.CRUDUsuário;;

import com.saojudas.nuplacar.Campeonato;
import com.saojudas.nuplacar.TelaListarGrupos;
import com.saojudas.nuplacar.DAO.UsuarioDAO;
import com.saojudas.nuplacar.TelaInicialAdm;
import com.saojudas.nuplacar.CRUDTime.TelaListarTimes;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TelaEditarUsuario extends javax.swing.JFrame {

    public TelaEditarUsuario() {
        super("Tela Inicial");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        editarUsuarioButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        atualizaUsuarioTable = new javax.swing.JTable();
        novoNomeTextField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        novoTipoUsuarioComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        novaConfirmarSenhaPasswordField = new javax.swing.JPasswordField();
        novaSenhaPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        buscarIdTextField = new javax.swing.JTextField();
        buscarUsuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        novoUsuarioButton = new javax.swing.JButton();
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(151, 151, 151));
        jLabel2.setText(" Novos dados");

        editarUsuarioButton.setBackground(new java.awt.Color(141, 27, 61));
        editarUsuarioButton.setForeground(new java.awt.Color(255, 255, 255));
        editarUsuarioButton.setText("Editar Usuário");
        editarUsuarioButton.setBorder(null);
        editarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioButtonActionPerformed(evt);
            }
        });

        atualizaUsuarioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IdUsuario", "Nome", "Senha", "Tipo de Usuario"
            }
        ));
        jScrollPane1.setViewportView(atualizaUsuarioTable);

        nomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(151, 151, 151));
        nomeLabel.setText(" Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(151, 151, 151));
        jLabel3.setText("Nova senha");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(151, 151, 151));
        jLabel4.setText("Confirmar Senha");

        novoTipoUsuarioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Administrador" }));
        novoTipoUsuarioComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoTipoUsuarioComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(151, 151, 151));
        jLabel5.setText("Tipo de usuário");

        novaConfirmarSenhaPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaConfirmarSenhaPasswordFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(151, 151, 151));
        jLabel1.setText(" Dados atuais");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editarUsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(novoNomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(novoTipoUsuarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(116, 116, 116))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(novaConfirmarSenhaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(novaSenhaPasswordField, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoNomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novoTipoUsuarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novaSenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novaConfirmarSenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(editarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        timeLabel.setText("Editar Usuário");

        novoUsuarioButton.setBackground(new java.awt.Color(141, 27, 61));
        novoUsuarioButton.setForeground(new java.awt.Color(255, 255, 255));
        novoUsuarioButton.setText("Novo Usuário");
        novoUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoUsuarioButtonActionPerformed(evt);
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
                .addComponent(novoUsuarioButton)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novoUsuarioButton))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gerenciarUsuariosButton2)))
                .addGap(47, 47, 47))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(menuLateralPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoUsuarioButtonActionPerformed
        TelaCadastrarUsuario TCU = new TelaCadastrarUsuario();
        TCU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_novoUsuarioButtonActionPerformed

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

    private void buscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUsuarioActionPerformed
            UsuarioDAO usuarioDao = new UsuarioDAO();
            int id = Integer.parseInt(buscarIdTextField.getText());
            ArrayList<Usuario> list = usuarioDao.obterUsuarioId(id);
            DefaultTableModel model = (DefaultTableModel)atualizaUsuarioTable.getModel();
            model.setRowCount(0);
            Object[] row = new Object[4];
            for (int i = 0;i < list.size();i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getNome();
                row[2] = list.get(i).getSenha();
                row[3] = list.get(i).getTipoUsuario();
                model.addRow(row);
            }  
    }//GEN-LAST:event_buscarUsuarioActionPerformed

    private void editarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioButtonActionPerformed
        UsuarioDAO usuarioDao = new UsuarioDAO();
        int id = Integer.parseInt(buscarIdTextField.getText());
        String novoNome = novoNomeTextField.getText();
        String novaSenha = new String(novaSenhaPasswordField.getPassword());
        String confirmarNovaSenha = new String(novaConfirmarSenhaPasswordField.getPassword());
        String novoTipoUsuario = novoTipoUsuarioComboBox.getSelectedItem().toString();
        
        Usuario usuario = new Usuario (id, novoNome, novaSenha,novoTipoUsuario);
        usuarioDao.atualizarUsuario(usuario);
        
        if (novaSenha.equals(confirmarNovaSenha)) {
                JOptionPane.showMessageDialog(null,"Usuário atualizado com sucesso", "NuPlacar",1);
                mostrarUsuarioAtualizado();
            } else {
                JOptionPane.showMessageDialog(null,"Senhas não coincidem. Tente novamente", "Erro",2);
            }
    }//GEN-LAST:event_editarUsuarioButtonActionPerformed

    private void buscarIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarIdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarIdTextFieldActionPerformed

    private void novoTipoUsuarioComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoTipoUsuarioComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novoTipoUsuarioComboBoxActionPerformed

    private void gerenciarUsuariosButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarUsuariosButton2ActionPerformed
        TelaListarUsuarios TLU = new TelaListarUsuarios();
        TLU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gerenciarUsuariosButton2ActionPerformed

    private void novaConfirmarSenhaPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaConfirmarSenhaPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novaConfirmarSenhaPasswordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarUsuario().setVisible(true);
            }
        });
    }
    
    private void mostrarUsuarioAtualizado() {
            UsuarioDAO usuarioDao = new UsuarioDAO();
            int id = Integer.parseInt(buscarIdTextField.getText());
            ArrayList<Usuario> list = usuarioDao.obterUsuarioId(id);
            DefaultTableModel model = (DefaultTableModel)atualizaUsuarioTable.getModel();
            model.setRowCount(0);
            Object[] row = new Object[4];
            for (int i = 0;i < list.size();i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getNome();
                row[2] = list.get(i).getSenha();
                row[3] = list.get(i).getTipoUsuario();
                model.addRow(row);
            }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable atualizaUsuarioTable;
    private javax.swing.JTextField buscarIdTextField;
    private javax.swing.JButton buscarUsuario;
    private javax.swing.JButton editarUsuarioButton;
    private javax.swing.JButton gerenciarUsuariosButton2;
    private javax.swing.JButton gruposButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel menuLateralPanel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPasswordField novaConfirmarSenhaPasswordField;
    private javax.swing.JPasswordField novaSenhaPasswordField;
    private javax.swing.JTextField novoNomeTextField;
    private javax.swing.JComboBox<String> novoTipoUsuarioComboBox;
    private javax.swing.JButton novoUsuarioButton;
    private javax.swing.JButton placarButton;
    private javax.swing.JButton simularButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JButton timesButton;
    // End of variables declaration//GEN-END:variables
}
