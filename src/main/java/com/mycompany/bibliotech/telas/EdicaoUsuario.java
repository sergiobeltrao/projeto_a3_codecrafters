package com.mycompany.bibliotech.telas;

import com.mycompany.bibliotech.dao.LivroCategoriaDAO;
import com.mycompany.bibliotech.model.bean.Usuario;
import com.mycompany.bibliotech.dao.UsuarioCadastroDAO;
import com.mycompany.bibliotech.dao.EnderecoDAO;
import com.mycompany.bibliotech.model.bean.Endereco;
import com.mycompany.bibliotech.dao.TelefoneDAO;
import com.mycompany.bibliotech.model.bean.Telefone;
import com.mycompany.bibliotech.dao.FavoritosDAO;
import com.mycompany.bibliotech.model.bean.Favoritos;
import com.mycompany.bibliotech.dao.CpfDAO;
import com.mycompany.bibliotech.model.bean.Hash;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.text.MaskFormatter;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EdicaoUsuario extends javax.swing.JFrame {


    public EdicaoUsuario() {
        initComponents();
        //listarCategorias1();
        //listarCategorias2();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoCentral = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        endTxt = new javax.swing.JTextField();
        ufTxt = new javax.swing.JTextField();
        bairroTxt = new javax.swing.JTextField();
        cidadeTxt = new javax.swing.JTextField();
        paisTxt = new javax.swing.JTextField();
        numTxt = new javax.swing.JTextField();
        compTxt = new javax.swing.JTextField();
        ProxCadLivButton = new javax.swing.JButton();
        cepTxt = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        cboxCategoria2 = new javax.swing.JComboBox<>();
        cboxSubCategoria2 = new javax.swing.JComboBox<>();
        cboxCategoria1 = new javax.swing.JComboBox<>();
        cboxSubCategoria1 = new javax.swing.JComboBox<>();
        enterButton = new javax.swing.JButton();
        LimparButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        senhaTxt = new javax.swing.JPasswordField();
        sexoBox = new javax.swing.JComboBox<>();
        sobrenomeTxt = new javax.swing.JTextField();
        nickTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        nomeTxt = new javax.swing.JTextField();
        cargoBox = new javax.swing.JComboBox<>();
        dataNascChooser = new com.toedter.calendar.JDateChooser();
        resenhaTxt = new javax.swing.JPasswordField();
        telefoneTipoBox = new javax.swing.JComboBox<>();
        foneTxt = new javax.swing.JFormattedTextField();
        ProxCadEndButton = new javax.swing.JButton();
        cpfTxt = new javax.swing.JFormattedTextField();
        menuLateral = new javax.swing.JPanel();
        txtMenuPrincipal = new javax.swing.JTextField();
        CadUserButton = new javax.swing.JButton();
        CadLivroButton = new javax.swing.JButton();
        btnEncerrarSessao = new javax.swing.JButton();
        avaliacaoButton = new javax.swing.JButton();
        ExcluirUserButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoCentral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        endTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        endTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        endTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTxtActionPerformed(evt);
            }
        });

        ufTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ufTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        ufTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufTxtActionPerformed(evt);
            }
        });

        bairroTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bairroTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bairro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        bairroTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroTxtActionPerformed(evt);
            }
        });

        cidadeTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cidadeTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        cidadeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeTxtActionPerformed(evt);
            }
        });

        paisTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        paisTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "País", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        paisTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisTxtActionPerformed(evt);
            }
        });

        numTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Número", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        numTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTxtActionPerformed(evt);
            }
        });

        compTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        compTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Complemento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        compTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compTxtActionPerformed(evt);
            }
        });

        ProxCadLivButton.setText("Próxima Aba");
        ProxCadLivButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProxCadLivButtonActionPerformed(evt);
            }
        });

        cepTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("CEP"));
        try {
            cepTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(endTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(compTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ufTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bairroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(ProxCadLivButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ProxCadLivButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro endereço", jPanel3);

        cboxCategoria2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cboxCategoria2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Informada" }));
        cboxCategoria2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria 2 *", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        cboxCategoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCategoria2ActionPerformed(evt);
            }
        });

        cboxSubCategoria2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cboxSubCategoria2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Informada" }));
        cboxSubCategoria2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sub-categoria 2 *", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        cboxSubCategoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxSubCategoria2ActionPerformed(evt);
            }
        });

        cboxCategoria1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cboxCategoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Informada" }));
        cboxCategoria1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria 1 *", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        cboxCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCategoria1ActionPerformed(evt);
            }
        });

        cboxSubCategoria1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cboxSubCategoria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Informada" }));
        cboxSubCategoria1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sub-categoria 1 *", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        cboxSubCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxSubCategoria1ActionPerformed(evt);
            }
        });

        enterButton.setText("Cadastrar");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        LimparButton.setText("Limpar");
        LimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cboxCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxSubCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cboxCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxSubCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LimparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxSubCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxSubCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(268, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tipos de livro favorito", jPanel2);

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        senhaTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senhaTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        senhaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTxtActionPerformed(evt);
            }
        });

        sexoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASC", "FEM", "OUTRO" }));
        sexoBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));
        sexoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoBoxActionPerformed(evt);
            }
        });

        sobrenomeTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sobrenomeTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sobrenome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        sobrenomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobrenomeTxtActionPerformed(evt);
            }
        });

        nickTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nickTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nickname", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        nickTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickTxtActionPerformed(evt);
            }
        });

        emailTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        nomeTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });

        cargoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "BIBLIOTECARIO", "CLIENTE" }));
        cargoBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));
        cargoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoBoxActionPerformed(evt);
            }
        });

        dataNascChooser.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Nascimento"));
        dataNascChooser.setToolTipText("2004-08-07");
        dataNascChooser.setDateFormatString("yyyy-MM-dd");

        resenhaTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resenhaTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Re-Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        resenhaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resenhaTxtActionPerformed(evt);
            }
        });

        telefoneTipoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RESIDENCIAL", "COMERCIAL", "CELULAR" }));
        telefoneTipoBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de número"));
        telefoneTipoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneTipoBoxActionPerformed(evt);
            }
        });

        foneTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));
        try {
            foneTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        foneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foneTxtActionPerformed(evt);
            }
        });

        ProxCadEndButton.setText("Próxima Aba");
        ProxCadEndButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProxCadEndButtonActionPerformed(evt);
            }
        });

        cpfTxt.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));
        try {
            cpfTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cargoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resenhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataNascChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sobrenomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nickTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(telefoneTipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(foneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(ProxCadEndButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sobrenomeTxt)
                    .addComponent(sexoBox, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nickTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telefoneTipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resenhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ProxCadEndButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro usuario", jPanel1);

        javax.swing.GroupLayout campoCentralLayout = new javax.swing.GroupLayout(campoCentral);
        campoCentral.setLayout(campoCentralLayout);
        campoCentralLayout.setHorizontalGroup(
            campoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        campoCentralLayout.setVerticalGroup(
            campoCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campoCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        menuLateral.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuLateral.setPreferredSize(new java.awt.Dimension(272, 40));

        txtMenuPrincipal.setEditable(false);
        txtMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtMenuPrincipal.setText("Menu Principal");
        txtMenuPrincipal.setBorder(null);

        CadUserButton.setText("Cadastro de Usuarios");
        CadUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadUserButtonActionPerformed(evt);
            }
        });

        CadLivroButton.setText("Cadastro de Livros");
        CadLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadLivroButtonActionPerformed(evt);
            }
        });

        btnEncerrarSessao.setText("Encerrar Sessão");
        btnEncerrarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarSessaoActionPerformed(evt);
            }
        });

        avaliacaoButton.setText("Avaliações");
        avaliacaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliacaoButtonActionPerformed(evt);
            }
        });

        ExcluirUserButton.setText("Excluir Usuarios");
        ExcluirUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CadUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(txtMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEncerrarSessao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CadLivroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExcluirUserButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(avaliacaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CadUserButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CadLivroButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(avaliacaoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExcluirUserButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEncerrarSessao)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTxtActionPerformed

    private void sexoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoBoxActionPerformed

    private void sobrenomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sobrenomeTxtActionPerformed

    private void nickTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nickTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nickTxtActionPerformed

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void cargoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoBoxActionPerformed

    private void resenhaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resenhaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resenhaTxtActionPerformed

    private void telefoneTipoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneTipoBoxActionPerformed

    }//GEN-LAST:event_telefoneTipoBoxActionPerformed

    private void foneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foneTxtActionPerformed

    private void ProxCadEndButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProxCadEndButtonActionPerformed
        this.jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_ProxCadEndButtonActionPerformed

    private void cpfTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTxtActionPerformed

    private void endTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endTxtActionPerformed

    private void ufTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufTxtActionPerformed

    private void bairroTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroTxtActionPerformed

    private void cidadeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeTxtActionPerformed

    private void paisTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisTxtActionPerformed

    private void numTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numTxtActionPerformed

    private void compTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compTxtActionPerformed

    private void ProxCadLivButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProxCadLivButtonActionPerformed
        this.jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_ProxCadLivButtonActionPerformed

    private void cboxCategoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCategoria2ActionPerformed
        // Executar após o clique final na ComboBox
        String dados[] = String.valueOf(cboxCategoria2.getSelectedItem()).split(" - ");
        if (!dados[0].equalsIgnoreCase("Não Informada")) {
            cboxSubCategoria2.removeAllItems();
            cboxSubCategoria2.addItem("Não Informada");
            //listarSubCategoria2(dados[0]);

        } else {
            cboxSubCategoria2.removeAllItems();
            cboxSubCategoria2.addItem("Não Informada");
        }
    }//GEN-LAST:event_cboxCategoria2ActionPerformed

    private void cboxSubCategoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxSubCategoria2ActionPerformed

    }//GEN-LAST:event_cboxSubCategoria2ActionPerformed

    private void cboxCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCategoria1ActionPerformed
        // TODO add your handling code here:
        String dados[] = String.valueOf(cboxCategoria1.getSelectedItem()).split(" - ");
        if (!dados[0].equalsIgnoreCase("Não Informada")) {
            cboxSubCategoria1.removeAllItems();
            cboxSubCategoria1.addItem("Não Informada");
            //listarSubCategoria1(dados[0]);

        } else {
            cboxSubCategoria1.removeAllItems();
            cboxSubCategoria1.addItem("Não Informada");
        }
    }//GEN-LAST:event_cboxCategoria1ActionPerformed

    private void cboxSubCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxSubCategoria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxSubCategoria1ActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed

    }//GEN-LAST:event_enterButtonActionPerformed

    private void LimparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparButtonActionPerformed
        new CadastroUsuario().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LimparButtonActionPerformed

    private void CadUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadUserButtonActionPerformed
        new CadastroUsuario().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CadUserButtonActionPerformed

    private void CadLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadLivroButtonActionPerformed
        new CadastroDeLivros().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CadLivroButtonActionPerformed

    private void btnEncerrarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarSessaoActionPerformed
        // TODO add your handling code here:
        new TelaDeLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEncerrarSessaoActionPerformed

    private void avaliacaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliacaoButtonActionPerformed
        new TelaAvaliacao().setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_avaliacaoButtonActionPerformed

    private void ExcluirUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirUserButtonActionPerformed

        // Implementação Bruno
        // ExcluirUserDAO ex = new ExcluirUserDAO();
        // ex.mostrarEExcluirUsuario();
        // Cria a instância o UsuarioDAO
        UsuarioCadastroDAO usercadastrodao = new UsuarioCadastroDAO();
        // Cria a combobox
        JComboBox<String> userList = new JComboBox<>();
        // Preenche a lista de usuários cadastrados no banco
        usercadastrodao.preencherListaUsuarios(userList);
        // Exibição da caixa de diálogo para o usuário fazer uma escolha
        int option = JOptionPane.showConfirmDialog(
            null,
            userList,
            "Selecione um usuário para excluir:",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        // Verifica se o usuário clicou em "OK" na caixa de diálogo
        if (option == JOptionPane.OK_OPTION) {
            String selectedUser = userList.getSelectedItem().toString();
            // Confirmação para excluir o usuário
            int confirmOption = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja excluir o usuário " + selectedUser + "?",
                "Confirmação de exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
            );

            // Verifica se o usuário confirmou a exclusão
            if (confirmOption == JOptionPane.YES_OPTION) {
                // Realiza a exclusão do usuário
                usercadastrodao.excluirUsuario(selectedUser);
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
            }
        }
    }//GEN-LAST:event_ExcluirUserButtonActionPerformed


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
            java.util.logging.Logger.getLogger(EdicaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdicaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdicaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdicaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdicaoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadLivroButton;
    private javax.swing.JButton CadUserButton;
    private javax.swing.JToggleButton ExcluirUserButton;
    private javax.swing.JButton LimparButton;
    private javax.swing.JButton ProxCadEndButton;
    private javax.swing.JButton ProxCadLivButton;
    private javax.swing.JButton avaliacaoButton;
    private javax.swing.JTextField bairroTxt;
    private javax.swing.JButton btnEncerrarSessao;
    private javax.swing.JPanel campoCentral;
    private javax.swing.JComboBox<String> cargoBox;
    private javax.swing.JComboBox<String> cboxCategoria1;
    private javax.swing.JComboBox<String> cboxCategoria2;
    private javax.swing.JComboBox<String> cboxSubCategoria1;
    private javax.swing.JComboBox<String> cboxSubCategoria2;
    private javax.swing.JFormattedTextField cepTxt;
    private javax.swing.JTextField cidadeTxt;
    private javax.swing.JTextField compTxt;
    private javax.swing.JFormattedTextField cpfTxt;
    private com.toedter.calendar.JDateChooser dataNascChooser;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField endTxt;
    private javax.swing.JButton enterButton;
    private javax.swing.JFormattedTextField foneTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JTextField nickTxt;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField numTxt;
    private javax.swing.JTextField paisTxt;
    private javax.swing.JPasswordField resenhaTxt;
    private javax.swing.JPasswordField senhaTxt;
    private javax.swing.JComboBox<String> sexoBox;
    private javax.swing.JTextField sobrenomeTxt;
    private javax.swing.JComboBox<String> telefoneTipoBox;
    private javax.swing.JTextField txtMenuPrincipal;
    private javax.swing.JTextField ufTxt;
    // End of variables declaration//GEN-END:variables
}