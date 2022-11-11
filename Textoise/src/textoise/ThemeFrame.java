package textoise;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static textoise.FontFrame.textoise;

public class ThemeFrame extends javax.swing.JFrame {
    static Textoise textoise;
    
    public ThemeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Theme.png")));
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        radioLight = new javax.swing.JRadioButton();
        tfLight = new javax.swing.JTextField();
        radioDark = new javax.swing.JRadioButton();
        tfDark = new javax.swing.JTextField();
        radioMidnight = new javax.swing.JRadioButton();
        tfMidnight = new javax.swing.JTextField();
        radioFactory = new javax.swing.JRadioButton();
        tfFactory = new javax.swing.JTextField();
        tfDoll = new javax.swing.JTextField();
        radioDoll = new javax.swing.JRadioButton();
        radioCustom = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        btForeground = new javax.swing.JButton();
        btBackground = new javax.swing.JButton();
        tfCustom = new javax.swing.JTextField();
        sldRed = new javax.swing.JSlider();
        tfRed = new javax.swing.JTextField();
        pnRed = new javax.swing.JPanel();
        pnGreen = new javax.swing.JPanel();
        sldGreen = new javax.swing.JSlider();
        tfGreen = new javax.swing.JTextField();
        pnBlue = new javax.swing.JPanel();
        sldBlue = new javax.swing.JSlider();
        tfBlue = new javax.swing.JTextField();
        panelColor = new javax.swing.JPanel();
        btApply = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tema");
        setResizable(false);

        buttonGroup.add(radioLight);
        radioLight.setText("Light");

        tfLight.setEditable(false);
        tfLight.setBackground(new java.awt.Color(255, 255, 255));
        tfLight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfLight.setText("AaBbCc XxYyZz...");

        buttonGroup.add(radioDark);
        radioDark.setSelected(true);
        radioDark.setText("Dark");

        tfDark.setEditable(false);
        tfDark.setBackground(new java.awt.Color(51, 51, 51));
        tfDark.setForeground(new java.awt.Color(255, 255, 255));
        tfDark.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDark.setText("AaBbCc XxYyZz...");

        buttonGroup.add(radioMidnight);
        radioMidnight.setText("Midnight");

        tfMidnight.setEditable(false);
        tfMidnight.setBackground(new java.awt.Color(44, 60, 88));
        tfMidnight.setForeground(new java.awt.Color(232, 106, 133));
        tfMidnight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfMidnight.setText("AaBbCc XxYyZz...");

        buttonGroup.add(radioFactory);
        radioFactory.setText("Factory");

        tfFactory.setEditable(false);
        tfFactory.setBackground(new java.awt.Color(25, 53, 73));
        tfFactory.setForeground(new java.awt.Color(254, 155, 2));
        tfFactory.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfFactory.setText("AaBbCc XxYyZz...");

        tfDoll.setEditable(false);
        tfDoll.setBackground(new java.awt.Color(204, 204, 204));
        tfDoll.setForeground(new java.awt.Color(255, 51, 102));
        tfDoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDoll.setText("AaBbCc XxYyZz...");

        buttonGroup.add(radioDoll);
        radioDoll.setText("Doll");

        buttonGroup.add(radioCustom);
        radioCustom.setText("Personalizado");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btForeground.setText("Texto");
        btForeground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btForegroundActionPerformed(evt);
            }
        });

        btBackground.setText("Fundo");
        btBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackgroundActionPerformed(evt);
            }
        });

        tfCustom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCustom.setText("AaBbCc XxYyZz...");

        sldRed.setMaximum(255);
        sldRed.setToolTipText("");
        sldRed.setValue(255);
        sldRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldRedStateChanged(evt);
            }
        });

        tfRed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRed.setText("255");
        tfRed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfRedKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRedKeyTyped(evt);
            }
        });

        pnRed.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnRedLayout = new javax.swing.GroupLayout(pnRed);
        pnRed.setLayout(pnRedLayout);
        pnRedLayout.setHorizontalGroup(
            pnRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnRedLayout.setVerticalGroup(
            pnRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnGreen.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout pnGreenLayout = new javax.swing.GroupLayout(pnGreen);
        pnGreen.setLayout(pnGreenLayout);
        pnGreenLayout.setHorizontalGroup(
            pnGreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnGreenLayout.setVerticalGroup(
            pnGreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        sldGreen.setMaximum(255);
        sldGreen.setToolTipText("");
        sldGreen.setValue(255);
        sldGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldGreenStateChanged(evt);
            }
        });

        tfGreen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfGreen.setText("255");
        tfGreen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfGreenKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfGreenKeyTyped(evt);
            }
        });

        pnBlue.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout pnBlueLayout = new javax.swing.GroupLayout(pnBlue);
        pnBlue.setLayout(pnBlueLayout);
        pnBlueLayout.setHorizontalGroup(
            pnBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnBlueLayout.setVerticalGroup(
            pnBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        sldBlue.setMaximum(255);
        sldBlue.setToolTipText("");
        sldBlue.setValue(255);
        sldBlue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldBlueStateChanged(evt);
            }
        });

        tfBlue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBlue.setText("255");
        tfBlue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBlueKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBlueKeyTyped(evt);
            }
        });

        panelColor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelColorLayout = new javax.swing.GroupLayout(panelColor);
        panelColor.setLayout(panelColorLayout);
        panelColorLayout.setHorizontalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelColorLayout.setVerticalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btApply, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfLight, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioLight))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfDark, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioDark))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfMidnight, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioMidnight))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfFactory, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioFactory))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfDoll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioDoll)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sldRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfRed, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sldGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sldBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radioCustom, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btBackground)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btForeground))
                                    .addComponent(tfCustom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfLight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioLight))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfDark, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioDark))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfMidnight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioMidnight))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfFactory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioFactory))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfDoll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioDoll)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioCustom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btForeground)
                                            .addComponent(btBackground)))
                                    .addComponent(panelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sldRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfRed)
                                    .addComponent(pnRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sldGreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfGreen)
                                    .addComponent(pnGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sldBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfBlue)
                                    .addComponent(pnBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btApply, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackgroundActionPerformed
        tfCustom.setBackground(panelColor.getBackground());
    }//GEN-LAST:event_btBackgroundActionPerformed

    private void tfRedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRedKeyTyped
        String chars="0987654321";
        if(!chars.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfRedKeyTyped
    
    private void sldRedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldRedStateChanged
        tfRed.setText(""+sldRed.getValue());
        pnRed.setBackground(new Color(sldRed.getValue(), 0, 0));
        attPanel();
    }//GEN-LAST:event_sldRedStateChanged

    private void sldGreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldGreenStateChanged
        tfGreen.setText(""+sldGreen.getValue());
        pnGreen.setBackground(new Color(0, sldGreen.getValue(), 0));
        attPanel();
    }//GEN-LAST:event_sldGreenStateChanged

    private void sldBlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldBlueStateChanged
        tfBlue.setText(""+sldBlue.getValue());
        pnBlue.setBackground(new Color(0, 0, sldBlue.getValue()));
        attPanel();
    }//GEN-LAST:event_sldBlueStateChanged

    private void tfGreenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGreenKeyTyped
        String chars="0987654321";
        if(!chars.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfGreenKeyTyped

    private void tfBlueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBlueKeyTyped
        String chars="0987654321";
        if(!chars.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfBlueKeyTyped

    private void tfRedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRedKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(tfRed.getText().equals("")){
                tfRed.setText(""+0);
            }
            
            if(Integer.parseInt(tfRed.getText())>255){
                tfRed.setText("255");
            }
            sldRed.setValue(Integer.parseInt(tfRed.getText()));
	}
    }//GEN-LAST:event_tfRedKeyPressed

    private void tfGreenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGreenKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(tfGreen.getText().equals("")){
                tfGreen.setText(""+0);
            }
            
            if(Integer.parseInt(tfGreen.getText())>255){
                tfGreen.setText("255");
            }
            sldGreen.setValue(Integer.parseInt(tfGreen.getText()));
	}
    }//GEN-LAST:event_tfGreenKeyPressed

    private void tfBlueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBlueKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(tfBlue.getText().equals("")){
                tfBlue.setText(""+0);
            }
            
            if(Integer.parseInt(tfBlue.getText())>255){
                tfBlue.setText("255");
            }
            sldBlue.setValue(Integer.parseInt(tfBlue.getText()));
	}
    }//GEN-LAST:event_tfBlueKeyPressed

    private void btForegroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btForegroundActionPerformed
        tfCustom.setForeground(panelColor.getBackground());
    }//GEN-LAST:event_btForegroundActionPerformed

    private void btApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApplyActionPerformed
        Color bg=null, fg=null;
        if(radioLight.isSelected()){ bg = tfLight.getBackground(); fg = tfLight.getForeground();}
        if(radioDark.isSelected()){ bg = tfDark.getBackground(); fg = tfDark.getForeground();}
        if(radioMidnight.isSelected()){ bg = tfMidnight.getBackground(); fg = tfMidnight.getForeground();}
        if(radioFactory.isSelected()){ bg = tfFactory.getBackground(); fg = tfFactory.getForeground();}
        if(radioDoll.isSelected()){ bg = tfDoll.getBackground(); fg = tfDoll.getForeground();}
        if(radioCustom.isSelected()){ bg = tfCustom.getBackground(); fg = tfCustom.getForeground();}
        textoise.changeTheme(bg, fg);
        dispose();
    }//GEN-LAST:event_btApplyActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    public void run(Textoise textObject) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ThemeFrame().setVisible(true);
        });
        textoise = textObject;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApply;
    private javax.swing.JButton btBackground;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btForeground;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelColor;
    private javax.swing.JPanel pnBlue;
    private javax.swing.JPanel pnGreen;
    private javax.swing.JPanel pnRed;
    private javax.swing.JRadioButton radioCustom;
    private javax.swing.JRadioButton radioDark;
    private javax.swing.JRadioButton radioDoll;
    private javax.swing.JRadioButton radioFactory;
    private javax.swing.JRadioButton radioLight;
    private javax.swing.JRadioButton radioMidnight;
    private javax.swing.JSlider sldBlue;
    private javax.swing.JSlider sldGreen;
    private javax.swing.JSlider sldRed;
    private javax.swing.JTextField tfBlue;
    private javax.swing.JTextField tfCustom;
    private javax.swing.JTextField tfDark;
    private javax.swing.JTextField tfDoll;
    private javax.swing.JTextField tfFactory;
    private javax.swing.JTextField tfGreen;
    private javax.swing.JTextField tfLight;
    private javax.swing.JTextField tfMidnight;
    private javax.swing.JTextField tfRed;
    // End of variables declaration//GEN-END:variables

    private void attPanel() {
        panelColor.setBackground(new Color(sldRed.getValue(), sldGreen.getValue(), sldBlue.getValue()));
    }
}
