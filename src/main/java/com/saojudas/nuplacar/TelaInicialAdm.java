package com.saojudas.nuplacar;

import com.saojudas.nuplacar.CRUDUsuario.TelaListarUsuarios;
import com.saojudas.nuplacar.CRUDTime.TelaListarTimes;
import com.saojudas.nuplacar.CRUDTime.Time;
import com.saojudas.nuplacar.DAO.CampeonatoDAO;
import com.saojudas.nuplacar.DAO.PartidaDAO;
import com.saojudas.nuplacar.DAO.TimeDAO;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import util.Imagem;

public class TelaInicialAdm extends javax.swing.JFrame {
    
    private Campeonato campeonato;
    
    public TelaInicialAdm() {
        super("Tela Inicial Adm");
        initComponents();
        setLocationRelativeTo(null);
        mostrarRank();
        int idCampeonato = CampeonatoDAO.getIdUltimoCampeonatoFinalizado();
        try {
            preencherPartidas(PartidaDAO.getPartidasPorCampeonato(idCampeonato));
        }
        catch(Exception ex) {}
        dadosCampeao();
        exibirBandeira();
    }
    
    public TelaInicialAdm(Campeonato campeonato) {
        super("Tela Inicial Adm");
        initComponents();
        setLocationRelativeTo(null);
        this.campeonato = campeonato;
        
        preencherPartidas(campeonato.getTodasPartidas());
        mostrarRank();
        dadosCampeao();
        exibirBandeira ();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        menuLateralPanel = new javax.swing.JPanel();
        simularButton = new javax.swing.JButton();
        placarButton = new javax.swing.JButton();
        gruposButton = new javax.swing.JButton();
        timesButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gerenciarUsuariosButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        bemVindoAdminTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campeaoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rankTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        golsCampeaoLabel = new javax.swing.JLabel();
        derrotasCampeaoLabel = new javax.swing.JLabel();
        empateCampeaoLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pontosCampeaoLabel = new javax.swing.JLabel();
        vitoriasCampeaoLabel = new javax.swing.JLabel();
        bandeiraIconLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        time1Jogo32Label = new javax.swing.JLabel();
        golsTime2Jogo32Label = new javax.swing.JLabel();
        time2Jogo32Label = new javax.swing.JLabel();
        golsTime1Jogo32Label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        time1Jogo31Label = new javax.swing.JLabel();
        golsTime2Jogo31Label = new javax.swing.JLabel();
        time2Jogo31Label = new javax.swing.JLabel();
        golsTime1Jogo31Label = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        time1Jogo26Label = new javax.swing.JLabel();
        golsTime2Jogo26Label = new javax.swing.JLabel();
        time2Jogo26Label = new javax.swing.JLabel();
        golsTime1Jogo26Label = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        time1Jogo25Label = new javax.swing.JLabel();
        golsTime2Jogo25Label = new javax.swing.JLabel();
        time2Jogo25Label = new javax.swing.JLabel();
        golsTime1Jogo25Label = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        time1Jogo28Label = new javax.swing.JLabel();
        golsTime2Jogo28Label = new javax.swing.JLabel();
        time2Jogo28Label = new javax.swing.JLabel();
        golsTime1Jogo28Label = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        time1Jogo27Label = new javax.swing.JLabel();
        golsTime2Jogo27Label = new javax.swing.JLabel();
        time2Jogo27Label = new javax.swing.JLabel();
        golsTime1Jogo27Label = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        time1Jogo18Label = new javax.swing.JLabel();
        golsTime2Jogo18Label = new javax.swing.JLabel();
        time2Jogo18Label = new javax.swing.JLabel();
        golsTime1Jogo18Label = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        time1Jogo17Label = new javax.swing.JLabel();
        golsTime2Jogo17Label = new javax.swing.JLabel();
        time2Jogo17Label = new javax.swing.JLabel();
        golsTime1Jogo17Label = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        time1Jogo24Label = new javax.swing.JLabel();
        golsTime2Jogo24Label = new javax.swing.JLabel();
        time2Jogo24Label = new javax.swing.JLabel();
        golsTime1Jogo24Label = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        time1Jogo23Label = new javax.swing.JLabel();
        golsTime2Jogo23Label = new javax.swing.JLabel();
        time2Jogo23Label = new javax.swing.JLabel();
        golsTime1Jogo23Label = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        time1Jogo22Label = new javax.swing.JLabel();
        golsTime2Jogo22Label = new javax.swing.JLabel();
        time2Jogo22Label = new javax.swing.JLabel();
        golsTime1Jogo22Label = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        time1Jogo21Label = new javax.swing.JLabel();
        golsTime2Jogo21Label = new javax.swing.JLabel();
        time2Jogo21Label = new javax.swing.JLabel();
        golsTime1Jogo21Label = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        time1Jogo20Label = new javax.swing.JLabel();
        golsTime2Jogo20Label = new javax.swing.JLabel();
        time2Jogo20Label = new javax.swing.JLabel();
        golsTime1Jogo20Label = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        time1Jogo19Label = new javax.swing.JLabel();
        golsTime2Jogo19Label = new javax.swing.JLabel();
        time2Jogo19Label = new javax.swing.JLabel();
        golsTime1Jogo19Label = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        time1Jogo30Label = new javax.swing.JLabel();
        golsTime2Jogo30Label = new javax.swing.JLabel();
        time2Jogo30Label = new javax.swing.JLabel();
        golsTime1Jogo30Label = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        time1Jogo29Label = new javax.swing.JLabel();
        golsTime2Jogo29Label = new javax.swing.JLabel();
        time2Jogo29Label = new javax.swing.JLabel();
        golsTime1Jogo29Label = new javax.swing.JLabel();
        iconeBandeiraLabel = new javax.swing.JLabel();

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
        timeLabel.setText("Cadastrar Usuário");

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
                .addContainerGap(445, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jPanel6.setBackground(new java.awt.Color(141, 27, 61));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profile-user.png"))); // NOI18N

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gerenciarUsuariosButton)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gerenciarUsuariosButton))
                    .addComponent(jLabel1))
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
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel4.setPreferredSize(new java.awt.Dimension(968, 1011));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bemVindoAdminTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        bemVindoAdminTitulo.setForeground(new java.awt.Color(151, 151, 151));
        bemVindoAdminTitulo.setText("Seja bem-vindo, Administrador!");

        jScrollPane2.setBackground(new java.awt.Color(242, 242, 242));

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(151, 151, 151));
        jLabel2.setText("CAMPEÃO");
        jLabel2.setToolTipText("");

        campeaoLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        campeaoLabel.setForeground(new java.awt.Color(151, 151, 151));
        campeaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campeaoLabel.setText("Simulando...");

        rankTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Time", "P", "J", "V", "E", "D", "G"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(rankTable);

        jPanel7.setBackground(new java.awt.Color(246, 246, 246));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(151, 151, 151));
        jLabel10.setText("Empate:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(151, 151, 151));
        jLabel12.setText("Derrotas:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(151, 151, 151));
        jLabel14.setText("Gols:");

        golsCampeaoLabel.setText("0");

        derrotasCampeaoLabel.setText("0");

        empateCampeaoLabel.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(151, 151, 151));
        jLabel8.setText("Vitórias:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(151, 151, 151));
        jLabel6.setText("Jogos:");

        pontosCampeaoLabel.setText("0");

        vitoriasCampeaoLabel.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(derrotasCampeaoLabel))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(golsCampeaoLabel))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empateCampeaoLabel))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pontosCampeaoLabel)
                                    .addComponent(vitoriasCampeaoLabel))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pontosCampeaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(vitoriasCampeaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(empateCampeaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(derrotasCampeaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(golsCampeaoLabel)))
        );

        bandeiraIconLabel.setForeground(new java.awt.Color(255, 255, 255));
        bandeiraIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bandeiraIconLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bandeiraIconLabel.setOpaque(true);

        jPanel8.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo32Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo32Label.setText("Time1");

        golsTime2Jogo32Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo32Label.setText("0");

        time2Jogo32Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo32Label.setText("Time1");

        golsTime1Jogo32Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo32Label.setText("0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo32Label, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(time2Jogo32Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo32Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo32Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo32Label)
                    .addComponent(golsTime1Jogo32Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(golsTime2Jogo32Label)
                    .addComponent(time2Jogo32Label))
                .addGap(26, 26, 26))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Final");

        jPanel9.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo31Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo31Label.setText("Time1");

        golsTime2Jogo31Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo31Label.setText("0");

        time2Jogo31Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo31Label.setText("Time1");

        golsTime1Jogo31Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo31Label.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo31Label, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(time2Jogo31Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo31Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo31Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo31Label)
                    .addComponent(golsTime1Jogo31Label))
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo31Label)
                    .addComponent(golsTime2Jogo31Label))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Terceiro lugar");

        jPanel11.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo26Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo26Label.setText("Time1");

        golsTime2Jogo26Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo26Label.setText("0");

        time2Jogo26Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo26Label.setText("Time1");

        golsTime1Jogo26Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo26Label.setText("0");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo26Label, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addComponent(time2Jogo26Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo26Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo26Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo26Label)
                    .addComponent(golsTime1Jogo26Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo26Label)
                    .addComponent(golsTime2Jogo26Label))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Quartas de final");

        jPanel12.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo25Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo25Label.setText("Time1");

        golsTime2Jogo25Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo25Label.setText("0");

        time2Jogo25Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo25Label.setText("Time1");

        golsTime1Jogo25Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo25Label.setText("0");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo25Label, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(time2Jogo25Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo25Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo25Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo25Label)
                    .addComponent(golsTime1Jogo25Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo25Label)
                    .addComponent(golsTime2Jogo25Label))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo28Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo28Label.setText("Time1");

        golsTime2Jogo28Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo28Label.setText("0");

        time2Jogo28Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo28Label.setText("Time1");

        golsTime1Jogo28Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo28Label.setText("0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo28Label, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addComponent(time2Jogo28Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo28Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo28Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo28Label)
                    .addComponent(golsTime1Jogo28Label))
                .addGap(28, 28, 28)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo28Label)
                    .addComponent(golsTime2Jogo28Label))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo27Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo27Label.setText("Time1");

        golsTime2Jogo27Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo27Label.setText("0");

        time2Jogo27Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo27Label.setText("Time1");

        golsTime1Jogo27Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo27Label.setText("0");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo27Label, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(time2Jogo27Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo27Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo27Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo27Label)
                    .addComponent(golsTime1Jogo27Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo27Label)
                    .addComponent(golsTime2Jogo27Label))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setText("Oitavas de final");

        jPanel15.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo18Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo18Label.setText("Time1");

        golsTime2Jogo18Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo18Label.setText("0");

        time2Jogo18Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo18Label.setText("Time1");

        golsTime1Jogo18Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo18Label.setText("0");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo18Label, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addComponent(time2Jogo18Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo18Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo18Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo18Label)
                    .addComponent(golsTime1Jogo18Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo18Label)
                    .addComponent(golsTime2Jogo18Label))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo17Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo17Label.setText("Time1");

        golsTime2Jogo17Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo17Label.setText("0");

        time2Jogo17Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo17Label.setText("Time1");

        golsTime1Jogo17Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo17Label.setText("0");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo17Label, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                    .addComponent(time2Jogo17Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo17Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo17Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo17Label)
                    .addComponent(golsTime1Jogo17Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo17Label)
                    .addComponent(golsTime2Jogo17Label))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo24Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo24Label.setText("Time1");

        golsTime2Jogo24Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo24Label.setText("0");

        time2Jogo24Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo24Label.setText("Time1");

        golsTime1Jogo24Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo24Label.setText("0");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo24Label, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addComponent(time2Jogo24Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo24Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo24Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo24Label)
                    .addComponent(golsTime1Jogo24Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo24Label)
                    .addComponent(golsTime2Jogo24Label))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo23Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo23Label.setText("Time1");

        golsTime2Jogo23Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo23Label.setText("0");

        time2Jogo23Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo23Label.setText("Time1");

        golsTime1Jogo23Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo23Label.setText("0");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo23Label, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                    .addComponent(time2Jogo23Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo23Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo23Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo23Label)
                    .addComponent(golsTime1Jogo23Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo23Label)
                    .addComponent(golsTime2Jogo23Label))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo22Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo22Label.setText("Time1");

        golsTime2Jogo22Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo22Label.setText("0");

        time2Jogo22Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo22Label.setText("Time1");

        golsTime1Jogo22Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo22Label.setText("0");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo22Label, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                    .addComponent(time2Jogo22Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo22Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo22Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo22Label)
                    .addComponent(golsTime1Jogo22Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo22Label)
                    .addComponent(golsTime2Jogo22Label))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo21Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo21Label.setText("Time1");

        golsTime2Jogo21Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo21Label.setText("0");

        time2Jogo21Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo21Label.setText("Time1");

        golsTime1Jogo21Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo21Label.setText("0");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo21Label, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addComponent(time2Jogo21Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo21Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo21Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo21Label)
                    .addComponent(golsTime1Jogo21Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo21Label)
                    .addComponent(golsTime2Jogo21Label))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo20Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo20Label.setText("Time1");

        golsTime2Jogo20Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo20Label.setText("0");

        time2Jogo20Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo20Label.setText("Time1");

        golsTime1Jogo20Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo20Label.setText("0");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo20Label, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addComponent(time2Jogo20Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo20Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo20Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo20Label)
                    .addComponent(golsTime1Jogo20Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo20Label)
                    .addComponent(golsTime2Jogo20Label))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo19Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo19Label.setText("Time1");

        golsTime2Jogo19Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo19Label.setText("0");

        time2Jogo19Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo19Label.setText("Time1");

        golsTime1Jogo19Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo19Label.setText("0");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo19Label, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addComponent(time2Jogo19Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo19Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo19Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo19Label)
                    .addComponent(golsTime1Jogo19Label))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo19Label)
                    .addComponent(golsTime2Jogo19Label))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel73.setText("Semifinais");

        jPanel23.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo30Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo30Label.setText("Time1");

        golsTime2Jogo30Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo30Label.setText("0");

        time2Jogo30Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo30Label.setText("Time1");

        golsTime1Jogo30Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo30Label.setText("0");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo30Label, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addComponent(time2Jogo30Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo30Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo30Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo30Label)
                    .addComponent(golsTime1Jogo30Label))
                .addGap(27, 27, 27)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo30Label)
                    .addComponent(golsTime2Jogo30Label))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(217, 217, 217));

        time1Jogo29Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time1Jogo29Label.setText("Time1");

        golsTime2Jogo29Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime2Jogo29Label.setText("0");

        time2Jogo29Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time2Jogo29Label.setText("Time1");

        golsTime1Jogo29Label.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        golsTime1Jogo29Label.setText("0");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time1Jogo29Label, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addComponent(time2Jogo29Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(golsTime2Jogo29Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(golsTime1Jogo29Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1Jogo29Label)
                    .addComponent(golsTime1Jogo29Label))
                .addGap(28, 28, 28)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time2Jogo29Label)
                    .addComponent(golsTime2Jogo29Label))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        iconeBandeiraLabel.setBackground(new java.awt.Color(246, 246, 246));
        iconeBandeiraLabel.setForeground(new java.awt.Color(255, 255, 255));
        iconeBandeiraLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeBandeiraLabel.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(223, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campeaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(iconeBandeiraLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bandeiraIconLabel)
                        .addGap(95, 95, 95)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(385, 385, 385))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel40))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bandeiraIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iconeBandeiraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campeaoLabel)
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel73)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bemVindoAdminTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bemVindoAdminTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 3106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuLateralPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuLateralPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 3182, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularButtonActionPerformed
        if (Campeonato.iniciarCampeonato()) {
            this.dispose();
        }
    }//GEN-LAST:event_simularButtonActionPerformed

    private void placarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placarButtonActionPerformed
        
    }//GEN-LAST:event_placarButtonActionPerformed

    private void gruposButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposButtonActionPerformed
        new TelaListarGrupos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gruposButtonActionPerformed

    private void timesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesButtonActionPerformed
        new TelaListarTimes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_timesButtonActionPerformed

    private void gerenciarUsuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarUsuariosButtonActionPerformed
        new TelaListarUsuarios().setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaInicialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialAdm().setVisible(true);
            }
        });
    }
    
    private void mostrarRank() {
        TimeDAO timeDAO = new TimeDAO();
        ArrayList<Time> lista = timeDAO.listarRankTimes();
        DefaultTableModel modelo = (DefaultTableModel)rankTable.getModel(); 
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(rankTable.getModel());
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
        rankTable.setRowSorter(sorter);
        sortKeys.add(new RowSorter.SortKey(1, SortOrder.DESCENDING));
        sorter.setSortKeys(sortKeys);
        sorter.sort();  
        modelo.setRowCount(0); 
            Object[] row = new Object[7]; 
            for (int i = 0;i < lista.size();i++) { 
                row[0] = lista.get(i).getNome(); 
                row[1] = lista.get(i).getPontos(); 
                row[2] = lista.get(i).getJogos();
                row[3] = lista.get(i).getVitorias();
                row[4] = lista.get(i).getEmpates();
                row[5] = lista.get(i).getDerrotas();
                row[6] = lista.get(i).getGolPro();
        modelo.addRow(row); 
            }    
    }

    
    private void dadosCampeao(){
        String campeao1 = time1Jogo32Label.getText();
        String campeao2 = time2Jogo32Label.getText();
        
        if (Integer.parseInt(golsTime1Jogo32Label.getText()) 
                        >  Integer.parseInt(golsTime2Jogo32Label.getText())) {
        campeaoLabel.setText(time1Jogo32Label.getText());
        
        String pontosCampeao = new TimeDAO().getJogosCampeao(campeao1);
        pontosCampeaoLabel.setText(pontosCampeao);
        
        String vitoriasCampeao = new TimeDAO().getVitoriasCampeao(campeao1);
        vitoriasCampeaoLabel.setText(vitoriasCampeao);
        
        String empatesCampeao = new TimeDAO().getEmpatesCampeao(campeao1);
        empateCampeaoLabel.setText(empatesCampeao);
        
        String derrotasCampeao = new TimeDAO().getDerrotasCampeao(campeao1);
        derrotasCampeaoLabel.setText(derrotasCampeao);
        
        String golsCampeao = new TimeDAO().getGolsCampeao(campeao1);
        golsCampeaoLabel.setText(golsCampeao); 
        
        } else {
        campeaoLabel.setText(time2Jogo32Label.getText());
        String pontosCampeao = new TimeDAO().getJogosCampeao(campeao2);
        pontosCampeaoLabel.setText(pontosCampeao);
        
        String vitoriasCampeao = new TimeDAO().getVitoriasCampeao(campeao2);
        vitoriasCampeaoLabel.setText(vitoriasCampeao);
        
        String empatesCampeao = new TimeDAO().getEmpatesCampeao(campeao2);
        empateCampeaoLabel.setText(empatesCampeao);
        
        String derrotasCampeao = new TimeDAO().getDerrotasCampeao(campeao2);
        derrotasCampeaoLabel.setText(derrotasCampeao);
        
        String golsCampeao = new TimeDAO().getGolsCampeao(campeao2);
        golsCampeaoLabel.setText(golsCampeao); 
        
        }  
              
      }
    
    
    private void exibirBandeira () {
        String campeao1 = time1Jogo32Label.getText();
        String campeao2 = time2Jogo32Label.getText();
        
    if (Integer.parseInt(golsTime1Jogo32Label.getText()) 
                        >  Integer.parseInt(golsTime2Jogo32Label.getText())) {
        
        try {
            ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(campeao1+".png"));
            Image image = icon.getImage().getScaledInstance(256, 240, Image.SCALE_DEFAULT);
            ImageIcon imageIcon = new ImageIcon(image);
            iconeBandeiraLabel.setIcon(imageIcon);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    } else {
            try {
            ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource(campeao2+".png"));
            Image image = icon.getImage().getScaledInstance(256, 240, Image.SCALE_DEFAULT);
            ImageIcon imageIcon = new ImageIcon(image);
            iconeBandeiraLabel.setIcon(imageIcon);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    }
            
            
    private void preencherPartidas(ArrayList<Partida> todasPartidas) {
        //<editor-fold defaultstate="collapsed" desc=" Final ">
        time1Jogo32Label.setText(todasPartidas.get(63).getTime1().getNome());
        time2Jogo32Label.setText(todasPartidas.get(63).getTime2().getNome());
        golsTime1Jogo32Label.setText(Integer.toString(todasPartidas.get(63).getGolsTime1()));
        golsTime2Jogo32Label.setText(Integer.toString(todasPartidas.get(63).getGolsTime2()));
        time1Jogo32Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(63).getTime1().getNome() + ".png"));
        time2Jogo32Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(63).getTime2().getNome() + ".png"));
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Terceiro lugar ">
        time1Jogo31Label.setText(todasPartidas.get(62).getTime1().getNome());
        time2Jogo31Label.setText(todasPartidas.get(62).getTime2().getNome());
        golsTime1Jogo31Label.setText(Integer.toString(todasPartidas.get(62).getGolsTime1()));
        golsTime2Jogo31Label.setText(Integer.toString(todasPartidas.get(62).getGolsTime2()));
        time1Jogo31Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(62).getTime1().getNome() + ".png"));
        time2Jogo31Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(62).getTime2().getNome() + ".png"));
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Semifinal ">
        time1Jogo30Label.setText(todasPartidas.get(61).getTime1().getNome());
        time2Jogo30Label.setText(todasPartidas.get(61).getTime2().getNome());
        golsTime1Jogo30Label.setText(Integer.toString(todasPartidas.get(61).getGolsTime1()));
        golsTime2Jogo30Label.setText(Integer.toString(todasPartidas.get(61).getGolsTime2()));
        time1Jogo30Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(61).getTime1().getNome() + ".png"));
        time2Jogo30Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(61).getTime2().getNome() + ".png"));
        
        time1Jogo29Label.setText(todasPartidas.get(60).getTime1().getNome());
        time2Jogo29Label.setText(todasPartidas.get(60).getTime2().getNome());
        golsTime1Jogo29Label.setText(Integer.toString(todasPartidas.get(60).getGolsTime1()));
        golsTime2Jogo29Label.setText(Integer.toString(todasPartidas.get(60).getGolsTime2()));
        time1Jogo29Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(60).getTime1().getNome() + ".png"));
        time2Jogo29Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(60).getTime2().getNome() + ".png"));
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Quartas de final ">
        time1Jogo28Label.setText(todasPartidas.get(59).getTime1().getNome());
        time2Jogo28Label.setText(todasPartidas.get(59).getTime2().getNome());
        golsTime1Jogo28Label.setText(Integer.toString(todasPartidas.get(59).getGolsTime1()));
        golsTime2Jogo28Label.setText(Integer.toString(todasPartidas.get(59).getGolsTime2()));
        time1Jogo28Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(59).getTime1().getNome() + ".png"));
        time2Jogo28Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(59).getTime2().getNome() + ".png"));
        
        time1Jogo27Label.setText(todasPartidas.get(58).getTime1().getNome());
        time2Jogo27Label.setText(todasPartidas.get(58).getTime2().getNome());
        golsTime1Jogo27Label.setText(Integer.toString(todasPartidas.get(58).getGolsTime1()));
        golsTime2Jogo27Label.setText(Integer.toString(todasPartidas.get(58).getGolsTime2()));
        time1Jogo27Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(58).getTime1().getNome() + ".png"));
        time2Jogo27Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(58).getTime2().getNome() + ".png"));
        
        time1Jogo26Label.setText(todasPartidas.get(57).getTime1().getNome());
        time2Jogo26Label.setText(todasPartidas.get(57).getTime2().getNome());
        golsTime1Jogo26Label.setText(Integer.toString(todasPartidas.get(57).getGolsTime1()));
        golsTime2Jogo26Label.setText(Integer.toString(todasPartidas.get(57).getGolsTime2()));
        time1Jogo26Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(57).getTime1().getNome() + ".png"));
        time2Jogo26Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(57).getTime2().getNome() + ".png"));
        
        time1Jogo25Label.setText(todasPartidas.get(56).getTime1().getNome());
        time2Jogo25Label.setText(todasPartidas.get(56).getTime2().getNome());
        golsTime1Jogo25Label.setText(Integer.toString(todasPartidas.get(56).getGolsTime1()));
        golsTime2Jogo25Label.setText(Integer.toString(todasPartidas.get(56).getGolsTime2()));
        time1Jogo25Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(56).getTime1().getNome() + ".png"));
        time2Jogo25Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(56).getTime2().getNome() + ".png"));
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" Oitavas de final ">
        time1Jogo24Label.setText(todasPartidas.get(55).getTime1().getNome());
        time2Jogo24Label.setText(todasPartidas.get(55).getTime2().getNome());
        golsTime1Jogo24Label.setText(Integer.toString(todasPartidas.get(55).getGolsTime1()));
        golsTime2Jogo24Label.setText(Integer.toString(todasPartidas.get(55).getGolsTime2()));
        time1Jogo24Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(55).getTime1().getNome() + ".png"));
        time2Jogo24Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(55).getTime2().getNome() + ".png"));
        
        time1Jogo23Label.setText(todasPartidas.get(54).getTime1().getNome());
        time2Jogo23Label.setText(todasPartidas.get(54).getTime2().getNome());
        golsTime1Jogo23Label.setText(Integer.toString(todasPartidas.get(54).getGolsTime1()));
        golsTime2Jogo23Label.setText(Integer.toString(todasPartidas.get(54).getGolsTime2()));
        time1Jogo23Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(54).getTime1().getNome() + ".png"));
        time2Jogo23Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(54).getTime2().getNome() + ".png"));
        
        time1Jogo22Label.setText(todasPartidas.get(53).getTime1().getNome());
        time2Jogo22Label.setText(todasPartidas.get(53).getTime2().getNome());
        golsTime1Jogo22Label.setText(Integer.toString(todasPartidas.get(53).getGolsTime1()));
        golsTime2Jogo22Label.setText(Integer.toString(todasPartidas.get(53).getGolsTime2()));
        time1Jogo22Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(53).getTime1().getNome() + ".png"));
        time2Jogo22Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(53).getTime2().getNome() + ".png"));
        
        time1Jogo21Label.setText(todasPartidas.get(52).getTime1().getNome());
        time2Jogo21Label.setText(todasPartidas.get(52).getTime2().getNome());
        golsTime1Jogo21Label.setText(Integer.toString(todasPartidas.get(52).getGolsTime1()));
        golsTime2Jogo21Label.setText(Integer.toString(todasPartidas.get(52).getGolsTime2()));
        time1Jogo21Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(52).getTime1().getNome() + ".png"));
        time2Jogo21Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(52).getTime2().getNome() + ".png"));
        
        time1Jogo20Label.setText(todasPartidas.get(51).getTime1().getNome());
        time2Jogo20Label.setText(todasPartidas.get(51).getTime2().getNome());
        golsTime1Jogo20Label.setText(Integer.toString(todasPartidas.get(51).getGolsTime1()));
        golsTime2Jogo20Label.setText(Integer.toString(todasPartidas.get(51).getGolsTime2()));
        time1Jogo20Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(51).getTime1().getNome() + ".png"));
        time2Jogo20Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(51).getTime2().getNome() + ".png"));
        
        time1Jogo19Label.setText(todasPartidas.get(50).getTime1().getNome());
        time2Jogo19Label.setText(todasPartidas.get(50).getTime2().getNome());
        golsTime1Jogo19Label.setText(Integer.toString(todasPartidas.get(50).getGolsTime1()));
        golsTime2Jogo19Label.setText(Integer.toString(todasPartidas.get(50).getGolsTime2()));
        time1Jogo19Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(50).getTime1().getNome() + ".png"));
        time2Jogo19Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(50).getTime2().getNome() + ".png"));
        
        time1Jogo18Label.setText(todasPartidas.get(49).getTime1().getNome());
        time2Jogo18Label.setText(todasPartidas.get(49).getTime2().getNome());
        golsTime1Jogo18Label.setText(Integer.toString(todasPartidas.get(49).getGolsTime1()));
        golsTime2Jogo18Label.setText(Integer.toString(todasPartidas.get(49).getGolsTime2()));
        time1Jogo18Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(49).getTime1().getNome() + ".png"));
        time2Jogo18Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(49).getTime2().getNome() + ".png"));
        
        time1Jogo17Label.setText(todasPartidas.get(48).getTime1().getNome());
        time2Jogo17Label.setText(todasPartidas.get(48).getTime2().getNome());
        golsTime1Jogo17Label.setText(Integer.toString(todasPartidas.get(48).getGolsTime1()));
        golsTime2Jogo17Label.setText(Integer.toString(todasPartidas.get(48).getGolsTime2()));
        time1Jogo17Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(48).getTime1().getNome() + ".png"));
        time2Jogo17Label.setIcon(new Imagem().criaIcone(
                todasPartidas.get(48).getTime2().getNome() + ".png"));
        //</editor-fold>
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bandeiraIconLabel;
    private javax.swing.JLabel bemVindoAdminTitulo;
    private javax.swing.JLabel campeaoLabel;
    private javax.swing.JLabel derrotasCampeaoLabel;
    private javax.swing.JLabel empateCampeaoLabel;
    private javax.swing.JButton gerenciarUsuariosButton;
    private javax.swing.JLabel golsCampeaoLabel;
    private javax.swing.JLabel golsTime1Jogo17Label;
    private javax.swing.JLabel golsTime1Jogo18Label;
    private javax.swing.JLabel golsTime1Jogo19Label;
    private javax.swing.JLabel golsTime1Jogo20Label;
    private javax.swing.JLabel golsTime1Jogo21Label;
    private javax.swing.JLabel golsTime1Jogo22Label;
    private javax.swing.JLabel golsTime1Jogo23Label;
    private javax.swing.JLabel golsTime1Jogo24Label;
    private javax.swing.JLabel golsTime1Jogo25Label;
    private javax.swing.JLabel golsTime1Jogo26Label;
    private javax.swing.JLabel golsTime1Jogo27Label;
    private javax.swing.JLabel golsTime1Jogo28Label;
    private javax.swing.JLabel golsTime1Jogo29Label;
    private javax.swing.JLabel golsTime1Jogo30Label;
    private javax.swing.JLabel golsTime1Jogo31Label;
    private javax.swing.JLabel golsTime1Jogo32Label;
    private javax.swing.JLabel golsTime2Jogo17Label;
    private javax.swing.JLabel golsTime2Jogo18Label;
    private javax.swing.JLabel golsTime2Jogo19Label;
    private javax.swing.JLabel golsTime2Jogo20Label;
    private javax.swing.JLabel golsTime2Jogo21Label;
    private javax.swing.JLabel golsTime2Jogo22Label;
    private javax.swing.JLabel golsTime2Jogo23Label;
    private javax.swing.JLabel golsTime2Jogo24Label;
    private javax.swing.JLabel golsTime2Jogo25Label;
    private javax.swing.JLabel golsTime2Jogo26Label;
    private javax.swing.JLabel golsTime2Jogo27Label;
    private javax.swing.JLabel golsTime2Jogo28Label;
    private javax.swing.JLabel golsTime2Jogo29Label;
    private javax.swing.JLabel golsTime2Jogo30Label;
    private javax.swing.JLabel golsTime2Jogo31Label;
    private javax.swing.JLabel golsTime2Jogo32Label;
    private javax.swing.JButton gruposButton;
    private javax.swing.JLabel iconeBandeiraLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel menuLateralPanel;
    private javax.swing.JButton placarButton;
    private javax.swing.JLabel pontosCampeaoLabel;
    private javax.swing.JTable rankTable;
    private javax.swing.JButton simularButton;
    private javax.swing.JLabel time1Jogo17Label;
    private javax.swing.JLabel time1Jogo18Label;
    private javax.swing.JLabel time1Jogo19Label;
    private javax.swing.JLabel time1Jogo20Label;
    private javax.swing.JLabel time1Jogo21Label;
    private javax.swing.JLabel time1Jogo22Label;
    private javax.swing.JLabel time1Jogo23Label;
    private javax.swing.JLabel time1Jogo24Label;
    private javax.swing.JLabel time1Jogo25Label;
    private javax.swing.JLabel time1Jogo26Label;
    private javax.swing.JLabel time1Jogo27Label;
    private javax.swing.JLabel time1Jogo28Label;
    private javax.swing.JLabel time1Jogo29Label;
    private javax.swing.JLabel time1Jogo30Label;
    private javax.swing.JLabel time1Jogo31Label;
    private javax.swing.JLabel time1Jogo32Label;
    private javax.swing.JLabel time2Jogo17Label;
    private javax.swing.JLabel time2Jogo18Label;
    private javax.swing.JLabel time2Jogo19Label;
    private javax.swing.JLabel time2Jogo20Label;
    private javax.swing.JLabel time2Jogo21Label;
    private javax.swing.JLabel time2Jogo22Label;
    private javax.swing.JLabel time2Jogo23Label;
    private javax.swing.JLabel time2Jogo24Label;
    private javax.swing.JLabel time2Jogo25Label;
    private javax.swing.JLabel time2Jogo26Label;
    private javax.swing.JLabel time2Jogo27Label;
    private javax.swing.JLabel time2Jogo28Label;
    private javax.swing.JLabel time2Jogo29Label;
    private javax.swing.JLabel time2Jogo30Label;
    private javax.swing.JLabel time2Jogo31Label;
    private javax.swing.JLabel time2Jogo32Label;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JButton timesButton;
    private javax.swing.JLabel vitoriasCampeaoLabel;
    // End of variables declaration//GEN-END:variables
}
