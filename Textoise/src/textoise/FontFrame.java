package textoise;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;

public class FontFrame extends javax.swing.JFrame {
    Font newFont = null;
    DefaultListModel listModel = null;
    MainFrame mainFrame = null;
    
    private static void LookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FontFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    public FontFrame(Font oldFont, MainFrame mf) {
        initComponents();
        LookAndFeel();
        mainFrame = mf;
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Font.png")));
        newFont = oldFont;
        SetFontList();
        InitFont();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfFont = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFonts = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        tfStyle = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listStyles = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        tfSize = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listSize = new javax.swing.JList<>();
        lbExample = new javax.swing.JTextField();
        btCancel = new javax.swing.JButton();
        btOk = new javax.swing.JButton();
        btApply = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fonte");

        jLabel1.setText("Fonte:");

        tfFont.setEditable(false);
        tfFont.setText("[font]");

        listFonts.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listFonts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listFonts.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listFontsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listFonts);

        jLabel2.setText("Estilo:");

        tfStyle.setEditable(false);
        tfStyle.setText("Exemplo");

        listStyles.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Normal", "Negrito", "Itálico", "Negrito e Itálico" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listStyles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listStyles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listStylesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listStyles);

        jLabel3.setText("Tamanho:");

        tfSize.setText("[size]");
        tfSize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSizeKeyTyped(evt);
            }
        });

        listSize.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "8", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40", "42", "44", "46", "48" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listSize.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listSize.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listSizeValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listSize);

        lbExample.setEditable(false);
        lbExample.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lbExample.setText("ABCabcXYZxyz0123");
        lbExample.setBorder(javax.swing.BorderFactory.createTitledBorder("Exemplo"));

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btOk.setText("Ok");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        btApply.setText("Aplicar");
        btApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbExample)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFont)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2)
                            .addComponent(tfStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(tfSize)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfSize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfStyle)
                            .addComponent(tfFont, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbExample, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btApply, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listFontsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listFontsValueChanged
        tfFont.setText(listFonts.getSelectedValue());
        UpdateFont();
    }//GEN-LAST:event_listFontsValueChanged

    private void listStylesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listStylesValueChanged
        tfStyle.setFont(new Font("Consolas", listStyles.getSelectedIndex(), 12));
        tfStyle.setText(listStyles.getSelectedValue());
        UpdateFont();
    }//GEN-LAST:event_listStylesValueChanged

    private void listSizeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listSizeValueChanged
        tfSize.setText(""+listSize.getSelectedValue());
        UpdateFont();
    }//GEN-LAST:event_listSizeValueChanged

    private void tfSizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSizeKeyTyped
        String chars="0987654321";
        if(!chars.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfSizeKeyTyped

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    private void btApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApplyActionPerformed
        mainFrame.ChangeFont(newFont);
    }//GEN-LAST:event_btApplyActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        mainFrame.ChangeFont(newFont);
        dispose();
    }//GEN-LAST:event_btOkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApply;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lbExample;
    private javax.swing.JList<String> listFonts;
    private javax.swing.JList<String> listSize;
    private javax.swing.JList<String> listStyles;
    private javax.swing.JTextField tfFont;
    private javax.swing.JTextField tfSize;
    private javax.swing.JTextField tfStyle;
    // End of variables declaration//GEN-END:variables

    private void SetFontList() {
        String[] fontes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        listModel = new DefaultListModel();
        for (String fonte : fontes) {
            listModel.addElement(fonte);
        }
        listFonts.setModel(listModel);
    }

    private void InitFont() {
        tfFont.setText(newFont.getFontName());
        tfStyle.setFont(new Font("Consolas", newFont.getStyle(), 12));
        tfSize.setText(""+newFont.getSize());
        lbExample.setFont(newFont);
        listFonts.setSelectedIndex(listModel.indexOf(newFont.getFontName()));
        listFonts.ensureIndexIsVisible(listModel.indexOf(newFont.getFontName()));
        listStyles.setSelectedIndex(newFont.getStyle());
        tfStyle.setText(listStyles.getSelectedValue());
    }
    
    private void UpdateFont(){
        if(tfSize.getText().equals("") || tfSize.getText().equals("0")){
            tfFont.setText(""+1);
        }
        int size = Integer.parseInt(tfSize.getText());
        newFont = new Font(tfFont.getText(), listStyles.getSelectedIndex(), size);
        tfFont.setText(newFont.getFontName());
        tfStyle.setFont(new Font("Consolas", newFont.getStyle(), 12));
        tfSize.setText(""+newFont.getSize());
        lbExample.setFont(newFont);
    }
}
