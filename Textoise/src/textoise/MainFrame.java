package textoise;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    File archive;
    String appData = System.getenv("APPDATA")+"/Textoise/temporary.txt";
    
    private static void lookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
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

    public MainFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Textoise.png")));
        archive = null;
        try {
            temporaryText();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao manipular arquivo temporário!\n"+e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        menuFiles = new javax.swing.JMenu();
        miNew = new javax.swing.JMenuItem();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        miSaveAs = new javax.swing.JMenuItem();
        separator = new javax.swing.JPopupMenu.Separator();
        miExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Textoise");
        setLocation(new java.awt.Point(50, 50));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        textArea.setBackground(new java.awt.Color(51, 51, 51));
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        textArea.setForeground(new java.awt.Color(255, 255, 255));
        textArea.setRows(5);
        textArea.setCaretColor(new java.awt.Color(204, 204, 204));
        scrollPane.setViewportView(textArea);

        menuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        menuFiles.setText("Arquivo");

        miNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New.png"))); // NOI18N
        miNew.setText("Novo");
        miNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewActionPerformed(evt);
            }
        });
        menuFiles.add(miNew);

        miOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Open.png"))); // NOI18N
        miOpen.setText("Abrir");
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenActionPerformed(evt);
            }
        });
        menuFiles.add(miOpen);

        miSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        miSave.setText("Salvar");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        menuFiles.add(miSave);

        miSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SaveAs.png"))); // NOI18N
        miSaveAs.setText("Salvar como");
        menuFiles.add(miSaveAs);
        menuFiles.add(separator);

        miExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        miExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        miExit.setText("Sair");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        menuFiles.add(miExit);

        menuBar.add(menuFiles);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void windowClosing(WindowEvent e) {
        JOptionPane.showMessageDialog(rootPane, "AEE");
    }
    
    private void miNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewActionPerformed
        newFile();
    }//GEN-LAST:event_miNewActionPerformed

    private void miOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenActionPerformed
        openFile();
    }//GEN-LAST:event_miOpenActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        try {
            exit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao tentar sair!\n"+e);
        }
    }//GEN-LAST:event_miExitActionPerformed

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        saveFile();
    }//GEN-LAST:event_miSaveActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            exit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao tentar sair!\n"+e);
        }
    }//GEN-LAST:event_formWindowClosing

    public void run() {
        lookAndFeel();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFiles;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miNew;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JMenuItem miSaveAs;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPopupMenu.Separator separator;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    private void newFile() {
        if(checkFile()){
            discartFile();
            setTitle("Textoise - [Texto temporário]");
        }
    }
    
    private boolean checkFile(){
        return !textArea.getText().equals("") || archive!=null;
    }
    private boolean discartFile() {
        if(JOptionPane.showConfirmDialog(rootPane, "Descartar alterações?","Novo",JOptionPane.YES_NO_OPTION)==0){
            textArea.setText("");
            archive = null;
            setTitle("Textoise");
            return true;
        }
        return false;
    }

    private void openFile() {
        if(checkFile()){
            if(discartFile()){
                try {
                    openOperation();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao tentar abrir arquivo!\n"+e);
                }
            }
        }else{
            try {
                openOperation();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao tentar abrir arquivo!\n"+e);
            }
        }
    }

    

    private void openOperation() throws IOException {
        JFileChooser fc = new JFileChooser();
        if(fc.showOpenDialog(miOpen)==0){
            archive = fc.getSelectedFile();
            try (FileReader fr = new FileReader(archive); BufferedReader br = new BufferedReader(fr)) {
                String text = "";
                while(br.ready()){
                    text += br.readLine();
                    if(br.ready()){
                        text += "\n";
                    }
                }
                br.close();
                fr.close();
                textArea.setText(text);
                setTitle("Textoise - "+archive.getPath());
            }
        }
    }

    private void exit() throws IOException {
        FileWriter fw = new FileWriter(appData);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(textArea.getText());
        bw.close();
        fw.close();
        System.exit(0);
    }

    private void saveFile() {
        if(archive==null){
            try {
                saveAsOperation();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao salvar arquivo!\n"+e);
            }
        }else{
            try {
                saveOperation();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao salvar arquivo!\n"+e);
            }
        }
    }

    private void saveAsOperation() throws IOException {
        JFileChooser fc = new JFileChooser();
        if(fc.showSaveDialog(miSaveAs)==0){
            archive = fc.getSelectedFile();
            String finalPath = archive.getPath();
            if(!archive.getPath().endsWith(".txt")){
                finalPath = archive.getPath()+".txt";
            }
            FileWriter fw = new FileWriter(finalPath);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(textArea.getText());
            bw.close();
            fw.close();
            setTitle("Textoise - "+archive.getPath());
        }
    }

    private void saveOperation() throws IOException {
        String finalPath = archive.getPath();
        if(!archive.getPath().endsWith(".txt"))
            finalPath = archive.getPath()+".txt";
        FileWriter fw = new FileWriter(finalPath);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(textArea.getText());
        bw.close();
        fw.close();
    }

    private void temporaryText() throws IOException {
        if (!new File(appData).exists()) {
            new File(System.getenv("APPDATA")+"/Textoise").mkdir();
            FileWriter fw = new FileWriter(appData);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(textArea.getText());
            bw.close();
            fw.close();
        }else{
            FileReader fr = new FileReader(appData);
            BufferedReader br = new BufferedReader(fr);
            String text = "";
            while(br.ready()){
                text += br.readLine();
                if(br.ready()){
                    text += "\n";
                }
            }
            br.close();
            fr.close();
            textArea.setText(text);
            setTitle("Textoise - [Texto temporário]");
        }
    }
}
