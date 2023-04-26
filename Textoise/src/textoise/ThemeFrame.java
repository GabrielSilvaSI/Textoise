package textoise;

import java.awt.Color;
import java.awt.Toolkit;

public class ThemeFrame extends javax.swing.JFrame {
    MainFrame mainFrame;
    Color foreColor;
    Color backColor;
    
    private static void LookAndFeel() {
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
    }

    public ThemeFrame(Color frColor, Color bgColor, MainFrame mf) {
        initComponents();
        LookAndFeel();
        mainFrame = mf;
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Theme.png")));
        initColors(frColor, bgColor);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfExample = new javax.swing.JTextField();
        tfClaro = new javax.swing.JTextField();
        rbClaro = new javax.swing.JRadioButton();
        rbClaro1 = new javax.swing.JRadioButton();
        tfClaro1 = new javax.swing.JTextField();
        rbClaro2 = new javax.swing.JRadioButton();
        tfClaro2 = new javax.swing.JTextField();
        rbClaro3 = new javax.swing.JRadioButton();
        tfClaro3 = new javax.swing.JTextField();
        rbClaro4 = new javax.swing.JRadioButton();
        tfClaro4 = new javax.swing.JTextField();
        rbClaro5 = new javax.swing.JRadioButton();
        tfClaro5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tema");
        setResizable(false);

        tfExample.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfExample.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfExample.setText("Exemplo");

        tfClaro.setEditable(false);
        tfClaro.setBackground(new java.awt.Color(255, 255, 255));
        tfClaro.setText("Claro");

        tfClaro1.setEditable(false);
        tfClaro1.setBackground(new java.awt.Color(255, 255, 255));
        tfClaro1.setText("Escuro");

        tfClaro2.setEditable(false);
        tfClaro2.setBackground(new java.awt.Color(255, 255, 255));
        tfClaro2.setText("Midnight");

        tfClaro3.setEditable(false);
        tfClaro3.setBackground(new java.awt.Color(255, 255, 255));
        tfClaro3.setText("Industry");

        tfClaro4.setEditable(false);
        tfClaro4.setBackground(new java.awt.Color(255, 255, 255));
        tfClaro4.setText("Sugar");

        tfClaro5.setEditable(false);
        tfClaro5.setBackground(new java.awt.Color(255, 255, 255));
        tfClaro5.setText("Hackerman");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfExample, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbClaro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfClaro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbClaro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfClaro1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbClaro2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfClaro2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbClaro3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfClaro3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbClaro4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfClaro4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbClaro5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfClaro5)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfExample, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbClaro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfClaro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbClaro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfClaro1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbClaro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfClaro2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbClaro3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfClaro3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbClaro4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfClaro4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbClaro5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfClaro5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton rbClaro;
    private javax.swing.JRadioButton rbClaro1;
    private javax.swing.JRadioButton rbClaro2;
    private javax.swing.JRadioButton rbClaro3;
    private javax.swing.JRadioButton rbClaro4;
    private javax.swing.JRadioButton rbClaro5;
    private javax.swing.JTextField tfClaro;
    private javax.swing.JTextField tfClaro1;
    private javax.swing.JTextField tfClaro2;
    private javax.swing.JTextField tfClaro3;
    private javax.swing.JTextField tfClaro4;
    private javax.swing.JTextField tfClaro5;
    private javax.swing.JTextField tfExample;
    // End of variables declaration//GEN-END:variables

    private void initColors(Color frColor, Color bgColor) {
        foreColor = frColor;
        backColor = bgColor;
        tfExample.setBackground(backColor);
        tfExample.setForeground(foreColor);
    }
}
