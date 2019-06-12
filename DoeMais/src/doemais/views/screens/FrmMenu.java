package doemais.views.screens;

import doemais.BD.Acessa;
import doemais.views.screens.Funcionario.FrmAdicionarFuncionario;
import doemais.views.screens.Funcionario.FrmEditarFuncionario;
import doemais.views.screens.Item.FrmAdicionarItem;
import doemais.views.screens.Item.FrmEditarItem;
import java.awt.Point;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();

        card = (java.awt.CardLayout) panel_lateralDireitoCards.getLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_tudo = new javax.swing.JPanel();
        panel_titleBar = new javax.swing.JPanel();
        label_login = new javax.swing.JLabel();
        button_minimizar = new javax.swing.JButton();
        button_fechar = new javax.swing.JButton();
        panel_fundoLateral = new javax.swing.JPanel();
        panel_lateralMenu = new javax.swing.JPanel();
        button_addItens = new javax.swing.JButton();
        button_funcionarios = new javax.swing.JButton();
        button_instituicoes = new javax.swing.JButton();
        label_icon = new javax.swing.JLabel();
        panel_lateralDireitoCards = new javax.swing.JPanel();
        panel_itens = new javax.swing.JPanel();
        scrollPane_Itens = new javax.swing.JScrollPane();
        listItens = new javax.swing.JList<>();
        button_AdicionarItem = new javax.swing.JButton();
        textField_BuscarItem = new javax.swing.JTextField();
        button_buscarItem = new javax.swing.JButton();
        panel_funcionarios = new javax.swing.JPanel();
        scrollPane_funcionarios = new javax.swing.JScrollPane();
        listFuncionarios = new javax.swing.JList<>();
        button_AdicionarFuncionario = new javax.swing.JButton();
        textField_BuscarFuncionario = new javax.swing.JTextField();
        button_buscar = new javax.swing.JButton();
        panel_instituicoes = new javax.swing.JPanel();
        scrollPane_Instituicoes = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        checkBox_filtrarSomenteNaoAtivos = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doe Mais - Menu");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        panel_tudo.setLayout(null);

        panel_titleBar.setBackground(new java.awt.Color(0, 29, 73));
        panel_titleBar.setFocusable(false);
        panel_titleBar.setPreferredSize(new java.awt.Dimension(40, 450));
        panel_titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_titleBarMouseDragged(evt);
            }
        });
        panel_titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_titleBarMousePressed(evt);
            }
        });
        panel_titleBar.setLayout(null);

        label_login.setFont(new java.awt.Font("David", 0, 18)); // NOI18N
        label_login.setForeground(new java.awt.Color(255, 255, 255));
        label_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_login.setText("DoeMais - Menu");
        label_login.setToolTipText("");
        label_login.setFocusable(false);
        label_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_titleBar.add(label_login);
        label_login.setBounds(0, 0, 150, 40);

        button_minimizar.setBackground(new java.awt.Color(255, 255, 255));
        button_minimizar.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        button_minimizar.setForeground(new java.awt.Color(255, 255, 255));
        button_minimizar.setText("-");
        button_minimizar.setBorder(null);
        button_minimizar.setFocusable(false);
        button_minimizar.setOpaque(false);
        button_minimizar.setRequestFocusEnabled(false);
        button_minimizar.addActionListener((e)-> {setExtendedState(ICONIFIED);});
        panel_titleBar.add(button_minimizar);
        button_minimizar.setBounds(520, 0, 40, 40);

        button_fechar.setBackground(new java.awt.Color(250, 65, 65));
        button_fechar.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        button_fechar.setForeground(new java.awt.Color(255, 255, 255));
        button_fechar.setText("X");
        button_fechar.setBorder(null);
        button_fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_fechar.setFocusable(false);
        button_fechar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_fechar.setRequestFocusEnabled(false);
        button_fechar.addActionListener((e)-> {System.exit(0);});
        panel_titleBar.add(button_fechar);
        button_fechar.setBounds(560, 0, 40, 40);

        panel_tudo.add(panel_titleBar);
        panel_titleBar.setBounds(0, 0, 600, 40);

        panel_fundoLateral.setBackground(new java.awt.Color(0, 44, 112));
        panel_fundoLateral.setLayout(null);

        panel_lateralMenu.setBackground(new java.awt.Color(255,255,255,10));
        panel_lateralMenu.setLayout(null);

        button_addItens.setBackground(new java.awt.Color(11, 26, 51));
        button_addItens.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_addItens.setForeground(new java.awt.Color(255, 255, 255));
        button_addItens.setText("Itens");
        button_addItens.setBorder(null);
        button_addItens.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_addItens.setFocusPainted(false);
        button_addItens.addActionListener((e) -> {card.show(panel_lateralDireitoCards, "itens");});
        panel_lateralMenu.add(button_addItens);
        button_addItens.setBounds(40, 23, 180, 35);

        button_funcionarios.setBackground(new java.awt.Color(11, 26, 51));
        button_funcionarios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_funcionarios.setForeground(new java.awt.Color(255, 255, 255));
        button_funcionarios.setText("Funcionários");
        button_funcionarios.setBorder(null);
        button_funcionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_funcionarios.setFocusPainted(false);
        button_funcionarios.addActionListener((e)->{card.show(panel_lateralDireitoCards, "func");});
        panel_lateralMenu.add(button_funcionarios);
        button_funcionarios.setBounds(40, 81, 180, 35);

        button_instituicoes.setBackground(new java.awt.Color(11, 26, 51));
        button_instituicoes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_instituicoes.setForeground(new java.awt.Color(255, 255, 255));
        button_instituicoes.setText("Instituições");
        button_instituicoes.setBorder(null);
        button_instituicoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_instituicoes.setFocusPainted(false);
        button_instituicoes.addActionListener((e)->{card.show(panel_lateralDireitoCards, "insti");});
        panel_lateralMenu.add(button_instituicoes);
        button_instituicoes.setBounds(40, 139, 180, 35);

        panel_fundoLateral.add(panel_lateralMenu);
        panel_lateralMenu.setBounds(0, 205, 280, 205);

        label_icon.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/doemais/views/imgs/DoeMais.png")).getImage().getScaledInstance(300, 180, java.awt.Image.SCALE_SMOOTH)));
        panel_fundoLateral.add(label_icon);
        label_icon.setBounds(0, 0, 280, 205);

        panel_tudo.add(panel_fundoLateral);
        panel_fundoLateral.setBounds(0, 40, 280, 410);

        panel_lateralDireitoCards.setLayout(new java.awt.CardLayout());

        panel_itens.setBackground(new java.awt.Color(255, 255, 255));
        panel_itens.setLayout(null);

        scrollPane_Itens.setBackground(new java.awt.Color(255, 255, 255));
        scrollPane_Itens.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Itens", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        listItens.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listItens.setToolTipText("Clique duas vezes sobre um item para ativar ou desativar");
        listItens.setSelectionBackground(new java.awt.Color(77, 141, 239));
        listItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listItensMouseClicked(evt);
            }
        });
        scrollPane_Itens.setViewportView(listItens);

        panel_itens.add(scrollPane_Itens);
        scrollPane_Itens.setBounds(0, 30, 320, 350);

        button_AdicionarItem.setBackground(new java.awt.Color(11, 26, 51));
        button_AdicionarItem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button_AdicionarItem.setForeground(new java.awt.Color(255, 255, 255));
        button_AdicionarItem.setText("Adicionar Item");
        button_AdicionarItem.setBorder(null);
        button_AdicionarItem.setBorderPainted(false);
        button_AdicionarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_AdicionarItem.setFocusPainted(false);
        button_AdicionarItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_AdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AdicionarItemActionPerformed(evt);
            }
        });
        panel_itens.add(button_AdicionarItem);
        button_AdicionarItem.setBounds(0, 380, 320, 30);

        textField_BuscarItem.setBackground(new java.awt.Color(219, 243, 255));
        textField_BuscarItem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_BuscarItem.setToolTipText("Preencha este campo com o nome do Item");
        textField_BuscarItem.setUI(new doemais.views.UI.JTextFieldHintUI("Buscar...", new java.awt.Color(166,166,166)));
        textField_BuscarItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textField_BuscarItem.setSelectionColor(new java.awt.Color(77, 141, 239));
        panel_itens.add(textField_BuscarItem);
        textField_BuscarItem.setBounds(0, 0, 230, 30);

        button_buscarItem.setBackground(new java.awt.Color(11, 26, 51));
        button_buscarItem.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        button_buscarItem.setForeground(new java.awt.Color(255, 255, 255));
        button_buscarItem.setText("Buscar");
        button_buscarItem.setBorder(null);
        button_buscarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_buscarItem.setFocusPainted(false);
        button_buscarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_buscarItemActionPerformed(evt);
            }
        });
        panel_itens.add(button_buscarItem);
        button_buscarItem.setBounds(230, 0, 90, 30);

        panel_lateralDireitoCards.add(panel_itens, "itens");

        panel_funcionarios.setLayout(null);

        scrollPane_funcionarios.setBackground(new java.awt.Color(255, 255, 255));
        scrollPane_funcionarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funcionários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        scrollPane_funcionarios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        listFuncionarios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listFuncionarios.setToolTipText("Clique duas vezes no funcionário desejado");
        listFuncionarios.setSelectionBackground(new java.awt.Color(77, 141, 239));
        listFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listFuncionariosMouseClicked(evt);
            }
        });
        scrollPane_funcionarios.setViewportView(listFuncionarios);

        panel_funcionarios.add(scrollPane_funcionarios);
        scrollPane_funcionarios.setBounds(0, 30, 320, 350);
        scrollPane_funcionarios.getAccessibleContext().setAccessibleDescription("");

        button_AdicionarFuncionario.setBackground(new java.awt.Color(11, 26, 51));
        button_AdicionarFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button_AdicionarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        button_AdicionarFuncionario.setText("Adicionar Funcionário");
        button_AdicionarFuncionario.setToolTipText("");
        button_AdicionarFuncionario.setBorder(null);
        button_AdicionarFuncionario.setBorderPainted(false);
        button_AdicionarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_AdicionarFuncionario.setFocusPainted(false);
        button_AdicionarFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_AdicionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AdicionarFuncionarioActionPerformed(evt);
            }
        });
        panel_funcionarios.add(button_AdicionarFuncionario);
        button_AdicionarFuncionario.setBounds(0, 380, 320, 30);

        textField_BuscarFuncionario.setBackground(new java.awt.Color(219, 243, 255));
        textField_BuscarFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_BuscarFuncionario.setToolTipText("Preencha este campo com o nome ou CPF do funcionário.");
        textField_BuscarFuncionario.setUI(new doemais.views.UI.JTextFieldHintUI("Buscar... (CPF ou Nome)", new java.awt.Color(166,166,166)));
        textField_BuscarFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textField_BuscarFuncionario.setSelectionColor(new java.awt.Color(77, 141, 255));
        panel_funcionarios.add(textField_BuscarFuncionario);
        textField_BuscarFuncionario.setBounds(0, 0, 230, 30);

        button_buscar.setBackground(new java.awt.Color(11, 26, 51));
        button_buscar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        button_buscar.setForeground(new java.awt.Color(255, 255, 255));
        button_buscar.setText("Buscar");
        button_buscar.setBorder(null);
        button_buscar.setBorderPainted(false);
        button_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_buscar.setFocusPainted(false);
        button_buscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_buscarActionPerformed(evt);
            }
        });
        panel_funcionarios.add(button_buscar);
        button_buscar.setBounds(230, 0, 90, 30);

        panel_lateralDireitoCards.add(panel_funcionarios, "func");

        panel_instituicoes.setBackground(new java.awt.Color(255, 255, 255));
        panel_instituicoes.setLayout(null);

        scrollPane_Instituicoes.setBackground(new java.awt.Color(255, 255, 255));
        scrollPane_Instituicoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Instituições", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        scrollPane_Instituicoes.setToolTipText("");

        list.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        list.setToolTipText("Clique duas vezes na instituição desejada");
        list.setSelectionBackground(new java.awt.Color(77, 141, 239));
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        scrollPane_Instituicoes.setViewportView(list);

        panel_instituicoes.add(scrollPane_Instituicoes);
        scrollPane_Instituicoes.setBounds(0, 0, 320, 380);

        checkBox_filtrarSomenteNaoAtivos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        checkBox_filtrarSomenteNaoAtivos.setText("Mostrar somente inativas");
        checkBox_filtrarSomenteNaoAtivos.setToolTipText("Filtrar e mostrar somente inativas");
        checkBox_filtrarSomenteNaoAtivos.setFocusPainted(false);
        checkBox_filtrarSomenteNaoAtivos.setOpaque(false);
        checkBox_filtrarSomenteNaoAtivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBox_filtrarSomenteNaoAtivosMouseClicked(evt);
            }
        });
        panel_instituicoes.add(checkBox_filtrarSomenteNaoAtivos);
        checkBox_filtrarSomenteNaoAtivos.setBounds(50, 380, 230, 30);

        panel_lateralDireitoCards.add(panel_instituicoes, "insti");

        panel_tudo.add(panel_lateralDireitoCards);
        panel_lateralDireitoCards.setBounds(280, 40, 320, 410);

        getContentPane().add(panel_tudo, "card2");

        setSize(new java.awt.Dimension(600, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panel_titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_titleBarMouseDragged
        Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_panel_titleBarMouseDragged

    private void panel_titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_titleBarMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_panel_titleBarMousePressed


    private void checkBox_filtrarSomenteNaoAtivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBox_filtrarSomenteNaoAtivosMouseClicked
        //Quando checkBox alterado faça
        if (checkBox_filtrarSomenteNaoAtivos.isSelected()) {
            setListInstituicoes(0);
        } else {
            setListInstituicoes(1);
        }
    }//GEN-LAST:event_checkBox_filtrarSomenteNaoAtivosMouseClicked
//eventos de itens
    private void button_buscarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_buscarItemActionPerformed
        // Evento de busca aqui
        setListItens(textField_BuscarItem.getText().toString());
    }//GEN-LAST:event_button_buscarItemActionPerformed

    private void listItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listItensMouseClicked
        // Double Click - ativar ou desativar
        if (evt.getClickCount() == 2) {
            if (listItens.isSelectionEmpty()) {

            } else {
                String[] Item = listItens.getSelectedValue().split(";");
                updateItem(Integer.parseInt(Item[0].trim()), Item[1]);
                button_buscarItem.doClick();
            }
        }
    }//GEN-LAST:event_listItensMouseClicked

    private void button_AdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AdicionarItemActionPerformed
        addItem();
    }//GEN-LAST:event_button_AdicionarItemActionPerformed
//eventos de funcionários
    private void button_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_buscarActionPerformed
        // buscar funcionário
        setListFuncionarios(textField_BuscarFuncionario.getText().toString());
    }//GEN-LAST:event_button_buscarActionPerformed

    private void listFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listFuncionariosMouseClicked
        // double click - abrir janela
        if (evt.getClickCount() == 2) {
            if(listFuncionarios.isSelectionEmpty()){
                
            }else{
                updateFuncionario("");
            }
        }
    }//GEN-LAST:event_listFuncionariosMouseClicked

    private void button_AdicionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AdicionarFuncionarioActionPerformed
        // Adicionar funcionário DoeMais
        addFunc();
    }//GEN-LAST:event_button_AdicionarFuncionarioActionPerformed
//
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // On Load
        setListItens("");
        setListFuncionarios("");
        setListInstituicoes(1);
    }//GEN-LAST:event_formWindowOpened

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        // Double click em instituição
        if (evt.getClickCount() == 2) {
            if (list.isSelectionEmpty()) {

            } else {
                String cnpj = list.getSelectedValue().split(";")[0];
                updateInstituicao(cnpj);
            }
        }
    }//GEN-LAST:event_listMouseClicked

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton button_AdicionarFuncionario;
    private javax.swing.JButton button_AdicionarItem;
    private javax.swing.JButton button_addItens;
    private javax.swing.JButton button_buscar;
    private javax.swing.JButton button_buscarItem;
    private javax.swing.JButton button_fechar;
    private javax.swing.JButton button_funcionarios;
    private javax.swing.JButton button_instituicoes;
    private javax.swing.JButton button_minimizar;
    private javax.swing.JCheckBox checkBox_filtrarSomenteNaoAtivos;
    private javax.swing.JLabel label_icon;
    private javax.swing.JLabel label_login;
    private javax.swing.JList<String> list;
    private javax.swing.JList<String> listFuncionarios;
    private javax.swing.JList<String> listItens;
    private javax.swing.JPanel panel_funcionarios;
    private javax.swing.JPanel panel_fundoLateral;
    private javax.swing.JPanel panel_instituicoes;
    private javax.swing.JPanel panel_itens;
    private javax.swing.JPanel panel_lateralDireitoCards;
    private javax.swing.JPanel panel_lateralMenu;
    private javax.swing.JPanel panel_titleBar;
    private javax.swing.JPanel panel_tudo;
    private javax.swing.JScrollPane scrollPane_Instituicoes;
    private javax.swing.JScrollPane scrollPane_Itens;
    private javax.swing.JScrollPane scrollPane_funcionarios;
    private javax.swing.JTextField textField_BuscarFuncionario;
    private javax.swing.JTextField textField_BuscarItem;
    // End of variables declaration//GEN-END:variables

    //Design
    private Point point = new Point();
    private java.awt.CardLayout card;
    //Lógica
    Acessa bd = new Acessa();

    private void setListItens(String nome) {
        List<String> itens = new ArrayList<>();
        //conection with the bank here
        bd.entBanco();
        String comando = "SELECT "
                + " IdItemPreCadastro, "
                + " ItemNome, "
                + " Ativo "
                + " FROM tblItemPreCadastro "
                + " WHERE ItemNome LIKE '%'+ '" + nome + "' +'%' "
                + " ORDER BY Ativo DESC ";
        try {
            bd.RS = bd.stmt.executeQuery(comando);
            while (bd.RS.next()) {
                itens.add(bd.RS.getString(1) + " ; " + bd.RS.getString(2) + " ; " + (bd.RS.getString(3) == "1" ? "Ativo" : "Inativo"));
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "ERRO ao conectar ao banco" + sql);
        }
        String[] itensArray = new String[itens.size()];
        //
        listItens = new JList<>(itens.toArray(itensArray));
        setListStyle(listItens);
        listItens.setToolTipText("Clique duas vezes sobre um item para ativar ou desativar.");
        listItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listItensMouseClicked(evt);
            }
        });
        scrollPane_Itens.setViewportView(listItens);
    }

    private void setListFuncionarios(String nomeCpf) {
        List<String> funcionarios = new ArrayList<>();
        //conection with the bank here
        bd.entBanco();
        String comando = "SELECT  "
                + " CPF, "
                + " Nome, "
                + " Sobrenome, "
                + " Ativo "
                + " FROM tblFuncionarioDoeMais "
                + " WHERE ((Nome + ' ' +Sobrenome) LIKE '%' + '" + nomeCpf + "' + '%') "
                + " OR CPF LIKE '%' + '" + nomeCpf + "' + '%' ";
        try {
            bd.RS = bd.stmt.executeQuery(comando);
            while (bd.RS.next()) {
                funcionarios.add(bd.RS.getString(1) + " ; " + bd.RS.getString(2) + " " + bd.RS.getString(3) + " ; " + (bd.RS.getString(4) == "1" ? "Ativo" : "Inativo"));
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "ERRO ao conectar ao banco" + sql);
        }
        String[] funcionariosArray = new String[funcionarios.size()];
        //
        listFuncionarios = new JList<>(funcionarios.toArray(funcionariosArray));
        setListStyle(listFuncionarios);
        listFuncionarios.setToolTipText("Clique duas vezes no funcionário desejado");
        listFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listFuncionariosMouseClicked(evt);
            }
        });
        scrollPane_funcionarios.setViewportView(listFuncionarios);
    }

    private void setListInstituicoes(int ativo) {
        List<String> instituicoes = new ArrayList<>();
        //conection with the bank here
        bd.entBanco();
        String comando = "SELECT  "
                + "CNPJ, "
                + "RazaoSocial, "
                + "Ativo "
                + "FROM tblInstituicao "
                + "WHERE Ativo BETWEEN 0 AND " + ativo + " "
                + "ORDER BY Ativo, RazaoSocial";
        try {
            bd.RS = bd.stmt.executeQuery(comando);
            while (bd.RS.next()) {
                instituicoes.add(bd.RS.getString(1) + " ; " + bd.RS.getString(2) + " ; " + (bd.RS.getString(3) == "1" ? "Ativo" : "Inativo"));
            }
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, "ERRO ao conectar ao banco" + sql);
        }
        String[] instituicoesArray = new String[instituicoes.size()];
        //
        list = new JList<>(instituicoes.toArray(instituicoesArray));
        setListStyle(list);
        list.setToolTipText("Clique duas vezes na instituição desejada.");
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        scrollPane_Instituicoes.setViewportView(list);
    }

    private void setListStyle(JList jList) {
        jList.setSelectionBackground(new java.awt.Color(77, 141, 239));
        jList.setFont(new java.awt.Font("Arial", 0, 14));
        //
    }

    private void updateItem(int cod, String item) {
        int certeza = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja ativar/desativar este item? \n" + item);
        if (certeza == 0) {
            bd.entBanco();
            String comando = "UPDATE tblItemPreCadastro "
                    + "SET Ativo = (CASE (SELECT Ativo FROM tblItemPreCadastro WHERE IdItemPreCadastro = " + cod + ") WHEN 1 then 0 else 1 end) "
                    + "WHERE IdItemPreCadastro = " + cod;
            int resultado = 0;
            try {
                resultado = bd.stmt.executeUpdate(comando);
                if (resultado > 0) {

                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao ativar ou desativar item");
                }
            } catch (SQLException sqle) {

            }
        }
    }

    private void updateInstituicao(String cnpj) {
        String instituicaoDados = "";

        bd.entBanco();
        String comando = "SELECT [CNPJ] "
                + ",[Ativo] "
                + ",[RazaoSocial] "
                + ",[NomeFantasia] "
                + ",[ResumoEmpresa] "
                + ",[RetiraDoacao] "
                + ",[TelefoneA] "
                + ",[TelefoneB] "
                + ",[Email] "
                + ",[HoraAbre] "
                + ",[HoraFecha] "
                + ",[DiasAbertos] "
                + ",[Logradouro] "
                + ",[Numero] "
                + ",[Complemento] "
                + ",[CEP] "
                + ",[UF] "
                + ",[Cidade] "
                + ",[Bairro] "
                + "FROM [dbo].[tblInstituicao] "
                + "WHERE CNPJ LIKE '" + cnpj.trim() + "'";
        try {
            bd.RS = bd.stmt.executeQuery(comando);
            while (bd.RS.next()) {
                instituicaoDados = "CNPJ" + " = " + bd.RS.getString(1) + "\n"
                        + "Ativo" + " = " + bd.RS.getString(2) + "\n"
                        + "RazaoSocial" + " = " + bd.RS.getString(3) + "\n"
                        + "NomeFantasia" + " = " + bd.RS.getString(4) + "\n"
                        + "ResumoEmpresa" + " = " + bd.RS.getString(5) + "\n"
                        + "RetiraDoacao" + " = " + bd.RS.getString(6) + "\n"
                        + "TelefoneA" + " = " + bd.RS.getString(7) + "\n"
                        + "TelefoneB" + " = " + bd.RS.getString(8) + "\n"
                        + "Email" + " = " + bd.RS.getString(9) + "\n"
                        + "HoraAbre" + " = " + bd.RS.getString(10) + "\n"
                        + "HoraFecha" + " = " + bd.RS.getString(11) + "\n"
                        + "DiasAbertos" + " = " + bd.RS.getString(12) + "\n"
                        + "Logradouro" + " = " + bd.RS.getString(13) + "\n"
                        + "Numero" + " = " + bd.RS.getString(14) + "\n"
                        + "Complemento" + " = " + bd.RS.getString(15) + "\n"
                        + "CEP" + " = " + bd.RS.getString(16) + "\n"
                        + "UF" + " = " + bd.RS.getString(17) + "\n"
                        + "Cidade" + " = " + bd.RS.getString(18) + "\n"
                        + "Bairro" + " = " + bd.RS.getString(19);
            }
        } catch (SQLException sqle) {

        }

        int opcao = JOptionPane.showConfirmDialog(null, instituicaoDados + "\n\nDeseja ativar/desativar instituição?", "Dados da instituição", JOptionPane.YES_NO_OPTION);
        if (opcao == 0) {
            bd.entBanco();
            comando = "UPDATE tblInstituicao\n"
                    + "SET Ativo = (CASE (SELECT Ativo FROM tblInstituicao WHERE CNPJ LIKE '" + cnpj.trim() + "') WHEN 1 then 0 else 1 end)\n"
                    + "WHERE CNPJ LIKE	'" + cnpj.trim() + "'";
            try {
                int resultado = bd.stmt.executeUpdate(comando);
                if (resultado > 0) {

                } else {
                    JOptionPane.showMessageDialog(null, "Falha ao alterar");
                }
            } catch (SQLException sqle) {

            }
        }

        if (checkBox_filtrarSomenteNaoAtivos.isSelected()) {
            setListInstituicoes(0);
        } else {
            setListInstituicoes(1);
        }
    }
//Em implementação
    private void updateFuncionario(String cpf){
        //CODE HERE
        button_AdicionarFuncionario.setEnabled(false);
        listFuncionarios.setEnabled(false);
        new FrmEditarFuncionario().setVisible(true);
        JOptionPane.showMessageDialog(null, "Área em construção");
    }
    
    private void addItem(){
        //CODE HERE
        button_AdicionarItem.setEnabled(false);
        listItens.setEnabled(false);
        new FrmAdicionarItem().setVisible(true);
        JOptionPane.showMessageDialog(null, "Área em construção");
    }
    
    private void addFunc(){
        //CODE HERE
        button_AdicionarFuncionario.setEnabled(false);
        listFuncionarios.setEnabled(false);
        new FrmAdicionarFuncionario().setVisible(true);
        JOptionPane.showMessageDialog(null, "Área em construção");
    }
}
