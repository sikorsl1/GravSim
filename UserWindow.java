/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Logics.Simultable;
import Logics.Body;
import static Logics.BodyFile.export;
import java.io.FileNotFoundException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import Logics.Scene;
import Logics.StepFile;
/**
 *
 * @author Leonard
 */
public class UserWindow extends javax.swing.JFrame {

    public Vector<Body> bds;
    int i = 0;
    /**
     * Creates new form UserWindow
     */
    public UserWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Reset = new javax.swing.JButton();
        bPokażEnergię = new javax.swing.JButton();
        PokażSiatkę = new javax.swing.JButton();
        bZapiszCiała = new javax.swing.JButton();
        DodajCiało = new javax.swing.JButton();
        tfName = new javax.swing.JTextField();
        NazwaPlanetyLabel = new javax.swing.JLabel();
        PołożenieLabel = new javax.swing.JLabel();
        PrędkośćLabel = new javax.swing.JLabel();
        PromieńLabel = new javax.swing.JLabel();
        tfRadius = new javax.swing.JTextField();
        MasaLabel = new javax.swing.JLabel();
        tfMass = new javax.swing.JTextField();
        SpężystośćLabel = new javax.swing.JLabel();
        tfSpringness = new javax.swing.JTextField();
        TwadrośćLabel = new javax.swing.JLabel();
        tfHardness = new javax.swing.JTextField();
        KruchośćLabel = new javax.swing.JLabel();
        tfFagility = new javax.swing.JTextField();
        rbSavePositions = new javax.swing.JRadioButton();
        bDodaj = new javax.swing.JButton();
        tfPosition = new javax.swing.JTextField();
        tfVelicoty = new javax.swing.JTextField();
        lTimeStep = new javax.swing.JLabel();
        tfTimeStep = new javax.swing.JTextField();
        bStart = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Reset.setText("Reset");

        bPokażEnergię.setText("Pokaż energię");
        bPokażEnergię.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPokażEnergięActionPerformed(evt);
            }
        });

        PokażSiatkę.setText("Pokaż siatkę ");

        bZapiszCiała.setText("Zapisz ciała");
        bZapiszCiała.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZapiszCiałaActionPerformed(evt);
            }
        });

        DodajCiało.setText("Dodaj ciało");

        NazwaPlanetyLabel.setText("Nazwa Palnety:");

        PołożenieLabel.setText("Położenie planety w kilometrach:");

        PrędkośćLabel.setText("Składowe prędkości ciała:");

        PromieńLabel.setText("Promień w kilometrach:");

        tfRadius.setText("0");

        MasaLabel.setText("Masa w kilogramach:");

        tfMass.setText("0");

        SpężystośćLabel.setText("Sprężystość:");

        tfSpringness.setText("0");

        TwadrośćLabel.setText("Twardość:");

        tfHardness.setText("0");

        KruchośćLabel.setText("Kruchość:");

        tfFagility.setText("0");

        rbSavePositions.setText("Zapisuj polożenia");

        bDodaj.setText("Dodaj!");
        bDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDodajActionPerformed(evt);
            }
        });

        tfPosition.setText("0 0 0");

        tfVelicoty.setText("0 0 0");

        lTimeStep.setText("Krok czasowy:");

        tfTimeStep.setText("10");

        bStart.setText("Start");
        bStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bDodaj))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NazwaPlanetyLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rbSavePositions)
                                .addComponent(KruchośćLabel)
                                .addComponent(TwadrośćLabel)
                                .addComponent(SpężystośćLabel)
                                .addComponent(MasaLabel)
                                .addComponent(PromieńLabel)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfFagility)
                                .addComponent(tfHardness)
                                .addComponent(tfSpringness)
                                .addComponent(tfMass)
                                .addComponent(PrędkośćLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfRadius)
                                .addComponent(tfPosition)
                                .addComponent(PołożenieLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfVelicoty))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(bPokażEnergię)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bStart)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTimeStep)
                            .addComponent(lTimeStep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(DodajCiało)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bZapiszCiała)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PokażSiatkę)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NazwaPlanetyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PołożenieLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrędkośćLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfVelicoty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PromieńLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MasaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpężystośćLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSpringness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TwadrośćLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfHardness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KruchośćLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFagility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSavePositions)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DodajCiało)
                            .addComponent(bZapiszCiała)
                            .addComponent(PokażSiatkę)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lTimeStep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(tfTimeStep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bPokażEnergię, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bStart, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPokażEnergięActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPokażEnergięActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPokażEnergięActionPerformed

    private void bDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDodajActionPerformed
        Simultable sim = new Simultable();
        bds = new Vector();
        sim.setPosition(tfPosition.getText());
        sim.setVelicoty(tfVelicoty.getText());
        sim.setRadius(tfRadius.getText());
        sim.setMass(tfMass.getText());
        sim.setSpringness(tfSpringness.getText());
        sim.setHardnes(tfHardness.getText());
        sim.setFragility(tfFagility.getText());
        Body bd = new Body();
        bd.Body(tfName.getText(), sim);
        bds.add(0, bd);
    }//GEN-LAST:event_bDodajActionPerformed

    private void bZapiszCiałaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZapiszCiałaActionPerformed
        try {
            export("D:\\Studia\\Sem II\\GravSim\\src\\Logics\\plik.txt", bds);
            System.out.println("Udało się!");
        } catch (FileNotFoundException ex) {
            System.out.println("Nie można utworzyć pliku o podanej nazwie!");
        }
    }//GEN-LAST:event_bZapiszCiałaActionPerformed

    private void bStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStartActionPerformed
        Scene symulation = new Scene();
        symulation.setTimeStep(tfTimeStep.getText());
        int j = 0;
        if(i == 0){
            bStart.setText("Stop");
            i=1;          
            while(j<3){ //warunek w pętli jest kijowy
                System.out.println("dupa"); //do wywalenia  (to dla mnie do sprawdzenia)
                
                symulation.simulateStep(bds);
                if(rbSavePositions.isSelected()){
                    for(int i=0; i<bds.size(); i++){
                        StepFile sf = new StepFile();
                        sf.setFilename(bds.get(i).name);
                        sf.setFile(sf.filename);
                        try {
                            sf.setPrintwriter(sf.file);
                        } catch (FileNotFoundException ex) {
                            System.out.println("Coś nie tak z plikiem");
                        }
                        try {
                            sf.openFile(sf.filename);
                        } catch (FileNotFoundException ex) {
                            System.out.println("Znowu coś nie tak");
                        }
                        sf.saveFile(sf.printwriter, bds.get(i).position);
                    }
                }   
                
                try {
                    Thread.sleep(1000);
                //obliczanie fizyki i rysowanie
                } catch (InterruptedException ex) {
                    System.out.println("Coś tu się zwaliło XDDDD");
                }
                j++;
            }
        }
        else{
            bStart.setText("Start");
            i=0;
        }           
    }//GEN-LAST:event_bStartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserWindow().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DodajCiało;
    private javax.swing.JLabel KruchośćLabel;
    private javax.swing.JLabel MasaLabel;
    private javax.swing.JLabel NazwaPlanetyLabel;
    private javax.swing.JButton PokażSiatkę;
    private javax.swing.JLabel PołożenieLabel;
    private javax.swing.JLabel PromieńLabel;
    private javax.swing.JLabel PrędkośćLabel;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel SpężystośćLabel;
    private javax.swing.JLabel TwadrośćLabel;
    private javax.swing.JButton bDodaj;
    private javax.swing.JButton bPokażEnergię;
    private javax.swing.JButton bStart;
    private javax.swing.JButton bZapiszCiała;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lTimeStep;
    private javax.swing.JRadioButton rbSavePositions;
    private javax.swing.JTextField tfFagility;
    private javax.swing.JTextField tfHardness;
    private javax.swing.JTextField tfMass;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPosition;
    private javax.swing.JTextField tfRadius;
    private javax.swing.JTextField tfSpringness;
    private javax.swing.JTextField tfTimeStep;
    private javax.swing.JTextField tfVelicoty;
    // End of variables declaration//GEN-END:variables
}
