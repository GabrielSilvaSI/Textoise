package textoise;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.PrintWriter;

public class MainFrame extends javax.swing.JFrame {

    File textFile = null;
    boolean textSaved = true;
    
    public MainFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Textoise.png")));
        //LoadFont();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taText = new javax.swing.JTextArea();
        tfPath = new javax.swing.JTextField();
        lbSaveStatus = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        miNew = new javax.swing.JMenuItem();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        miSaveAs = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        miFont = new javax.swing.JMenuItem();
        miTheme = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Textoise");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        taText.setBackground(new java.awt.Color(51, 51, 51));
        taText.setColumns(20);
        taText.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        taText.setForeground(new java.awt.Color(255, 255, 255));
        taText.setRows(5);
        taText.setCaretColor(new java.awt.Color(255, 255, 255));
        taText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                taTextKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(taText);

        tfPath.setEditable(false);

        lbSaveStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stSaveEmpty.png"))); // NOI18N

        menuFile.setText("Arquivo");

        miNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New.png"))); // NOI18N
        miNew.setText("Novo");
        miNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewActionPerformed(evt);
            }
        });
        menuFile.add(miNew);

        miOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Open.png"))); // NOI18N
        miOpen.setText("Abrir");
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenActionPerformed(evt);
            }
        });
        menuFile.add(miOpen);

        miSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        miSave.setText("Salvar");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        menuFile.add(miSave);

        miSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SaveAs.png"))); // NOI18N
        miSaveAs.setText("Salvar como");
        miSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveAsActionPerformed(evt);
            }
        });
        menuFile.add(miSaveAs);
        menuFile.add(jSeparator1);

        miExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        miExit.setText("Sair");
        menuFile.add(miExit);

        menuBar.add(menuFile);

        jMenu1.setText("Configurações");

        miFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Font.png"))); // NOI18N
        miFont.setText("Fonte");
        miFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFontActionPerformed(evt);
            }
        });
        jMenu1.add(miFont);

        miTheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Theme.png"))); // NOI18N
        miTheme.setText("Tema");
        miTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miThemeActionPerformed(evt);
            }
        });
        jMenu1.add(miTheme);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbSaveStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPath)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPath, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSaveStatus))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewActionPerformed
        NewText();
    }//GEN-LAST:event_miNewActionPerformed

    private void miSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveAsActionPerformed
        try {
            SaveAs();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao tentar realizar operação!\n"+ex);
        }
    }//GEN-LAST:event_miSaveAsActionPerformed

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        try {
            Save();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao tentar realizar operação!\n"+e);
        }
    }//GEN-LAST:event_miSaveActionPerformed

    private void taTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taTextKeyPressed
        if (evt.getKeyCode() != KeyEvent.VK_CONTROL) {
            changeSaved(false);
        }
        
    }//GEN-LAST:event_taTextKeyPressed

    private void miOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenActionPerformed
        Open();
    }//GEN-LAST:event_miOpenActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(!textSaved){
            int choice = JOptionPane.showConfirmDialog(rootPane, "Salvar alterações do texto atual?", "Textoise", JOptionPane.YES_NO_CANCEL_OPTION);
            if(choice == 0){
                try {
                    Save();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao tentar realizar operação!\n"+ex);
                }
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            if(choice == 1){
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            if(choice == 2){
                setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void miFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFontActionPerformed
        Font oldFont = taText.getFont();
        FontFrame ff = new  FontFrame(oldFont, this);
        ff.setVisible(true);
    }//GEN-LAST:event_miFontActionPerformed

    private void miThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miThemeActionPerformed
        ThemeFrame tf = new ThemeFrame(taText.getForeground(), taText.getBackground(), this);
        tf.setVisible(true);
    }//GEN-LAST:event_miThemeActionPerformed
    
    public void run() {
        LookAndFeel();
    }

    private void LookAndFeel() {
        try {
            for (var info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbSaveStatus;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miFont;
    private javax.swing.JMenuItem miNew;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JMenuItem miSaveAs;
    private javax.swing.JMenuItem miTheme;
    private javax.swing.JTextArea taText;
    private javax.swing.JTextField tfPath;
    // End of variables declaration//GEN-END:variables

    private void SaveAs() throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de Texto (*.txt)", "txt");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            textFile = fileChooser.getSelectedFile();
            if (!textFile.getName().endsWith(".txt")) {
                textFile = new File(textFile.getAbsolutePath() + ".txt");
            }
            // Obtém a string que será salva no arquivo
            String text = taText.getText();
            try ( // Salva a string no arquivo
                BufferedWriter writer = new BufferedWriter(new FileWriter(textFile))) {
                writer.write(text);
                writer.close();
            }
            tfPath.setText(textFile.getAbsolutePath());
            changeSaved(true);
        }
    }
    
    private void Save() throws IOException {
        if (textFile == null) {
            try {
                SaveAs();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao tentar realizar operação!\n"+e);
            }
        } else {
            String text = taText.getText();
            try (
                    BufferedWriter writer = new BufferedWriter(new FileWriter(textFile))) {
                writer.write(text);
                writer.close();
                changeSaved(true);
            }
        }
    }
    
    private void changeSaved(boolean status) {
        if (status) {
            lbSaveStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stSaveFilled.png")));
            textSaved = true;
        } else {
            lbSaveStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stSaveEmpty.png")));
            textSaved = false;
        }
    }
    
    private void NewText() {
        if (textSaved) {
            textFile = null;
            CleanAll();
        } else {
            int choose = JOptionPane.showConfirmDialog(rootPane, "Salvar alterações do texto atual?", "Textoise", JOptionPane.YES_NO_CANCEL_OPTION);
            if (choose == 0) {//0-yes 1-no 2-cancel
                try {
                    Save();
                    CleanAll();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao tentar realizar operação!\n"+ex);
                }
            }
            if (choose == 1) {
                CleanAll();
            }
        }
    }
    
    private void CleanAll() {
        textFile = null;
        taText.setText("");
        tfPath.setText("");
        changeSaved(true);
    }
    private void Open(){
        if (textSaved) {
            try {
                OpenFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao tentar realizar operação!\n"+ex);
            }
        } else {
            int choose = JOptionPane.showConfirmDialog(rootPane, "Salvar alterações do texto atual?", "Textoise", JOptionPane.YES_NO_CANCEL_OPTION);
            if (choose == 0) {//0-yes 1-no 2-cancel
                try {
                    Save();
                    try {
                        OpenFile();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao tentar realizar operação!\n"+ex);
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao tentar realizar operação!\n"+ex);
                }
            }
            if (choose == 1) {
                try {
                    OpenFile();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao tentar realizar operação!\n"+ex);
                }
            }
        }
    }
    
    private void OpenFile() throws FileNotFoundException, IOException {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de Texto (*.txt)", "txt");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            textFile = fileChooser.getSelectedFile();
            // Verifica se o arquivo tem extensão .txt
            if (!textFile.getName().endsWith(".txt")) {
                System.out.println("O arquivo selecionado não tem extensão .txt.");
                return;
            }
            // Lê o conteúdo do arquivo para uma String
            StringBuilder conteudoArquivo = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    conteudoArquivo.append(line).append("\n");
                }
            }
            String content = conteudoArquivo.toString();
            taText.setText(content);
            tfPath.setText(textFile.getAbsolutePath());
            changeSaved(true);
        }
    }
    
    public void ChangeFont(Font newFont){
        taText.setFont(newFont);
    }

    private void LoadFont() {
        String appDataDir = System.getenv("APPDATA");
        String filePath = appDataDir + "\\Textoise.txt";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("O arquivo já existe.");
        } else {
            try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                writer.println("Olá, mundo!");
                System.out.println("O arquivo foi criado com sucesso.");
            } catch (IOException e) {
                System.out.println("Não foi possível criar o arquivo.");
            }
        }
    }
    
}
