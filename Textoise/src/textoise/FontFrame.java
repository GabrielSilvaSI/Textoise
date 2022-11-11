package textoise;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;

public class FontFrame extends javax.swing.JFrame {
    static Textoise textoise;
    static DefaultListModel lm = new DefaultListModel();
    
    public FontFrame(Font oldFont) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Font.png")));
        String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(int i=0;i<fonts.length;i++){
            lm.add(i, fonts[i]);
        }
        listFont.setModel(lm);
        listFont.setSelectedIndex(lm.indexOf(oldFont.getName()));
        listFont.ensureIndexIsVisible(lm.indexOf(oldFont.getName()));
        listStyle.setSelectedIndex(oldFont.getStyle());
        tfSize.setText(""+oldFont.getSize());
        changeExample();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFont = new javax.swing.JLabel();
        tfFont = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listFont = new javax.swing.JList<>();
        lbStyle = new javax.swing.JLabel();
        tfStyle = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listStyle = new javax.swing.JList<>();
        lbSize = new javax.swing.JLabel();
        tfSize = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        listSize = new javax.swing.JList<>();
        tfExample = new javax.swing.JTextField();
        btApply = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar fonte");
        setResizable(false);

        lbFont.setText("Fonte");

        tfFont.setEditable(false);
        tfFont.setBackground(new java.awt.Color(255, 255, 255));
        tfFont.setText("Consolas");

        listFont.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listFont.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listFontValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listFont);

        lbStyle.setText("Estilo");

        tfStyle.setEditable(false);
        tfStyle.setBackground(new java.awt.Color(255, 255, 255));
        tfStyle.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        tfStyle.setText("Regular");

        listStyle.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Regular", "Negrito", "Itálico", "Negrito e Itálico" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listStyle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listStyle.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listStyleValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listStyle);

        lbSize.setText("Tamanho");

        tfSize.setText("12");
        tfSize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSizeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSizeKeyTyped(evt);
            }
        });

        listSize.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "28", "32", "36", "40", "46", "52", "60", "70", "80", "90", "100" };
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

        tfExample.setEditable(false);
        tfExample.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfExample.setText("AaBbCc XxYyZz...");
        tfExample.setBorder(javax.swing.BorderFactory.createTitledBorder("Exemplo"));

        btApply.setText("Aplicar");
        btApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApplyActionPerformed(evt);
            }
        });

        btCancel.setText("Cancelar");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFont, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFont, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStyle)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbSize)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(tfSize)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfExample)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btApply, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbSize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbStyle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbFont)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFont, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tfExample, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btApply, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSizeKeyTyped
        String chars="0987654321";
        if(!chars.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfSizeKeyTyped

    private void listFontValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listFontValueChanged
        tfFont.setText(listFont.getSelectedValue());
        tfFont.setFont(new Font(listFont.getSelectedValue(), 0, 11));
        changeExample();
    }//GEN-LAST:event_listFontValueChanged

    private void listStyleValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listStyleValueChanged
        tfStyle.setText(listStyle.getSelectedValue());
        tfStyle.setFont(new Font("Consolas", listStyle.getSelectedIndex(), 11));
        changeExample();
    }//GEN-LAST:event_listStyleValueChanged

    private void listSizeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listSizeValueChanged
        tfSize.setText(listSize.getSelectedValue());
        changeExample();
    }//GEN-LAST:event_listSizeValueChanged

    private void tfSizeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSizeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(tfFont.getText().equals("") || tfFont.getText().equals("0")){
                tfFont.setText("1");
            }
            changeExample();
	}
    }//GEN-LAST:event_tfSizeKeyPressed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    private void btApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApplyActionPerformed
        textoise.changeFont(tfExample.getFont());
        dispose();
    }//GEN-LAST:event_btApplyActionPerformed

    public void run(Textoise textObject) {
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
        this.setVisible(true);
        textoise = textObject;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApply;
    private javax.swing.JButton btCancel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbFont;
    private javax.swing.JLabel lbSize;
    private javax.swing.JLabel lbStyle;
    private javax.swing.JList<String> listFont;
    private javax.swing.JList<String> listSize;
    private javax.swing.JList<String> listStyle;
    private javax.swing.JTextField tfExample;
    private javax.swing.JTextField tfFont;
    private javax.swing.JTextField tfSize;
    private javax.swing.JTextField tfStyle;
    // End of variables declaration//GEN-END:variables

    private void changeExample(){
        tfExample.setFont(new Font(tfFont.getText(), listStyle.getSelectedIndex(), Integer.parseInt(tfSize.getText())));
    }
    
}
