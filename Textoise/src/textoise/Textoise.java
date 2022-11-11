package textoise;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Textoise extends javax.swing.JFrame {
    static File fileText;
    
    public Textoise() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Textoise.png")));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spScrollPane = new javax.swing.JScrollPane();
        tfTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        btNew = new javax.swing.JMenuItem();
        btOpen = new javax.swing.JMenuItem();
        btSave = new javax.swing.JMenuItem();
        menuSaveAs = new javax.swing.JMenuItem();
        menuSeparator = new javax.swing.JPopupMenu.Separator();
        btExit = new javax.swing.JMenuItem();
        menuOptions = new javax.swing.JMenu();
        btFont = new javax.swing.JMenuItem();
        btTheme = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Textoise");

        tfTextArea.setBackground(new java.awt.Color(51, 51, 51));
        tfTextArea.setColumns(20);
        tfTextArea.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tfTextArea.setForeground(new java.awt.Color(255, 255, 255));
        tfTextArea.setRows(5);
        tfTextArea.setCaretColor(new java.awt.Color(255, 255, 255));
        spScrollPane.setViewportView(tfTextArea);

        menuFile.setText("Arquivo");

        btNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New.png"))); // NOI18N
        btNew.setText("Novo");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });
        menuFile.add(btNew);

        btOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Open.png"))); // NOI18N
        btOpen.setText("Abrir");
        btOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpenActionPerformed(evt);
            }
        });
        menuFile.add(btOpen);

        btSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        btSave.setText("Salvar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        menuFile.add(btSave);

        menuSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SaveAs.png"))); // NOI18N
        menuSaveAs.setText("Salvar como...");
        menuSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveAsActionPerformed(evt);
            }
        });
        menuFile.add(menuSaveAs);
        menuFile.add(menuSeparator);

        btExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        menuFile.add(btExit);

        jMenuBar1.add(menuFile);

        menuOptions.setText("Configurações");

        btFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Font.png"))); // NOI18N
        btFont.setText("Fonte");
        btFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFontActionPerformed(evt);
            }
        });
        menuOptions.add(btFont);

        btTheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Theme.png"))); // NOI18N
        btTheme.setText("Tema");
        btTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemeActionPerformed(evt);
            }
        });
        menuOptions.add(btTheme);

        jMenuBar1.add(menuOptions);

        menuHelp.setText("Ajuda");

        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuHelp.add(jMenuItem1);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpenActionPerformed
        if(fileText == null && tfTextArea.getText().equals("")){
            try {
                openFile();
            } catch (IOException ex) {
                Logger.getLogger(Textoise.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            if(JOptionPane.showConfirmDialog(rootPane, "Fechar texto atual? (alterações não salvas serão descartadas)","Fechar",JOptionPane.YES_NO_OPTION)==0){
                try {
                    openFile();
                } catch (IOException ex) {
                    Logger.getLogger(Textoise.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btOpenActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if(fileText == null){
            try {
                saveAsFile();
            } catch (IOException ex) {
                Logger.getLogger(Textoise.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                saveFile();
            } catch (IOException ex) {
                Logger.getLogger(Textoise.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        if(fileText != null || !tfTextArea.getText().equals("")){
            if(JOptionPane.showConfirmDialog(rootPane, "Fechar texto atual? (alterações não salvas serão descartadas)","Fechar",JOptionPane.YES_NO_OPTION)==0){
                tfTextArea.setText("");
                fileText = null;
                setTitle("Textoise");
            }
        }
    }//GEN-LAST:event_btNewActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        if(fileText == null && tfTextArea.getText().equals("")){
            System.exit(0);
        }else{
            if(JOptionPane.showConfirmDialog(rootPane, "Fechar texto atual? (alterações não salvas serão descartadas)","Fechar",JOptionPane.YES_NO_OPTION)==0){
                System.exit(0);
            }
        }
    }//GEN-LAST:event_btExitActionPerformed

    private void btFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFontActionPerformed
        FontFrame ff = new FontFrame(tfTextArea.getFont());
        ff.run(this);
    }//GEN-LAST:event_btFontActionPerformed

    private void btThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemeActionPerformed
        ThemeFrame tf = new ThemeFrame();
        tf.run(this);
    }//GEN-LAST:event_btThemeActionPerformed

    private void menuSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveAsActionPerformed
        try {
            saveAsFile();
        } catch (IOException ex) {
            Logger.getLogger(Textoise.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuSaveAsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        HelpFrame hf = new HelpFrame();
        hf.run();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Textoise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Textoise().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btExit;
    private javax.swing.JMenuItem btFont;
    private javax.swing.JMenuItem btNew;
    private javax.swing.JMenuItem btOpen;
    private javax.swing.JMenuItem btSave;
    private javax.swing.JMenuItem btTheme;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menuOptions;
    private javax.swing.JMenuItem menuSaveAs;
    private javax.swing.JPopupMenu.Separator menuSeparator;
    private javax.swing.JScrollPane spScrollPane;
    private javax.swing.JTextArea tfTextArea;
    // End of variables declaration//GEN-END:variables

    private void openFile() throws FileNotFoundException, IOException {
        JFileChooser fc = new JFileChooser();
        if(fc.showOpenDialog(btOpen)==0){
            fileText = fc.getSelectedFile();
            try (FileReader fr = new FileReader(fileText); BufferedReader br = new BufferedReader(fr)) {
                String text = "";
                while(br.ready()){
                    text += br.readLine();
                    if(br.ready()){
                        text += "\n";
                    }
                }
                tfTextArea.setText(text);
                setTitle("Textoise - "+fileText.getPath());
            }
        }
    }
    
    public void changeFont(Font newFont){
        tfTextArea.setFont(newFont);
    }
    
    public void changeTheme(Color bg, Color fg){
        tfTextArea.setBackground(bg);
        tfTextArea.setForeground(fg);
    }

    private void saveAsFile() throws IOException {
        JFileChooser fc = new JFileChooser();
        if(fc.showSaveDialog(btFont)==0){
            fileText = fc.getSelectedFile();
            String finalPath = fileText.getPath();
            if(!fileText.getPath().endsWith(".txt")){
                finalPath = fileText.getPath()+".txt";
            }
                
            try (FileWriter fw = new FileWriter(finalPath); BufferedWriter bf = new BufferedWriter(fw)) {
                bf.write(tfTextArea.getText());
                bf.close();
                fw.close();
                setTitle("Textoise - "+fileText.getPath());
            }
        }
    }

    private void saveFile() throws IOException {
        String finalPath = fileText.getPath();
        if(!fileText.getPath().endsWith(".txt")){
            finalPath = fileText.getPath()+".txt";
        }
        try (FileWriter fw = new FileWriter(finalPath); BufferedWriter bf = new BufferedWriter(fw)) {
            bf.write(tfTextArea.getText());
            bf.close();
            fw.close();
            setTitle("Textoise - "+fileText.getPath());
        }
    }
    
}
