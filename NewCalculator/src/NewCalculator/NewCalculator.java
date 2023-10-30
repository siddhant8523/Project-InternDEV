
package NewCalculator;


public class NewCalculator extends javax.swing.JFrame {

    
    double NumEnter1;
    double NumEnter2;
    double Result;
    String op;
    
    public NewCalculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResult = new javax.swing.JTextField();
        jbtnCE = new javax.swing.JButton();
        jbtnBS = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnMul = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnDiv = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtResultActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 340, 80));

        jbtnCE.setBackground(new java.awt.Color(64, 96, 255));
        jbtnCE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnCE.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 70, 60));

        jbtnBS.setBackground(new java.awt.Color(64, 96, 255));
        jbtnBS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBS.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBS.setText("<-");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 70, 60));

        jbtnPM.setBackground(new java.awt.Color(64, 96, 255));
        jbtnPM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPM.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPM.setText("± ");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 60));

        jbtnC.setBackground(new java.awt.Color(64, 96, 255));
        jbtnC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnC.setForeground(new java.awt.Color(255, 255, 255));
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 70, 60));

        jbtnDigit8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 70, 60));

        jbtnDigit7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, 60));

        jbtnPlus.setBackground(new java.awt.Color(64, 96, 255));
        jbtnPlus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPlus.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 70, 60));

        jbtnDigit9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 70, 60));

        jbtnDigit5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 70, 60));

        jbtnDigit4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 70, 60));

        jbtnMinus.setBackground(new java.awt.Color(64, 96, 255));
        jbtnMinus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnMinus.setForeground(new java.awt.Color(255, 255, 255));
        jbtnMinus.setText("-");
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 70, 60));

        jbtnDigit6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 70, 60));

        jbtnDigit2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 70, 60));

        jbtnDigit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 70, 60));

        jbtnMul.setBackground(new java.awt.Color(64, 96, 255));
        jbtnMul.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnMul.setForeground(new java.awt.Color(255, 255, 255));
        jbtnMul.setText("*");
        jbtnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMulActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMul, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 70, 60));

        jbtnDigit3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 70, 60));

        jbtnDot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 70, 60));

        jbtnDigit0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 70, 60));

        jbtnDiv.setBackground(new java.awt.Color(64, 96, 255));
        jbtnDiv.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDiv.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDiv.setText("/");
        jbtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 70, 60));

        jbtnEqual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnEqual.setText("=");
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 70, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void EnterNumbers(String q)
    {
        String Nums = jtxtResult.getText() + q;
        jtxtResult.setText(Nums); 
        
    }
    
    private void jbtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivActionPerformed
      NumEnter1 = Double.parseDouble(jtxtResult.getText());
      jtxtResult.setText("");
        op="/" ;
    }//GEN-LAST:event_jbtnDivActionPerformed

    private void jtxtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultActionPerformed

    }//GEN-LAST:event_jtxtResultActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
        String backsp= null;
        if(jtxtResult.getText().length()>0)
        {
            StringBuilder sb= new StringBuilder(jtxtResult.getText());
            sb.deleteCharAt(jtxtResult.getText().length()-1);
            backsp=sb.toString();
            jtxtResult.setText(backsp);
        }
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
        double nums = Double.parseDouble(String.valueOf(jtxtResult.getText()));
        nums =nums *(-1);
        jtxtResult.setText(String.valueOf(nums));
        
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
    EnterNumbers("7");        
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
    EnterNumbers("8");        
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
    EnterNumbers("9");        
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
    EnterNumbers("4");        
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
    EnterNumbers("5");        
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
    EnterNumbers("6");        
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
    EnterNumbers("1");        
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
    EnterNumbers("2");        
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
    EnterNumbers("3");        
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
    EnterNumbers("0");        
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMulActionPerformed
     NumEnter1 = Double.parseDouble(jtxtResult.getText());
      jtxtResult.setText("");
        op="*" ;        
    }//GEN-LAST:event_jbtnMulActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
     NumEnter1 = Double.parseDouble(jtxtResult.getText());
      jtxtResult.setText("");
        op="-" ;        
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
     NumEnter1 = Double.parseDouble(jtxtResult.getText());
      jtxtResult.setText("");
        op="+" ;        
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
     jtxtResult.setText("");
     
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
     jtxtResult.setText("");
     String Fn, Sn;
     Fn= String.valueOf(NumEnter1);
     Sn= String.valueOf(NumEnter2);
     Fn="";
     Sn="";
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
      if(! jtxtResult.getText().contains("."))
      {
          jtxtResult.setText(jtxtResult.getText() + jbtnDot.getText());
      }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
       NumEnter2 =Double.parseDouble(jtxtResult.getText());
       if(op == "+")
       {
           Result = NumEnter1 + NumEnter2;
           jtxtResult.setText(String.valueOf(Result));
       }
       else if(op == "-")
       {
           Result = NumEnter1 - NumEnter2;
           jtxtResult.setText(String.valueOf(Result));
       }
       else if(op == "*")
       {
           Result = NumEnter1 * NumEnter2;
           jtxtResult.setText(String.valueOf(Result));
       }
       else if(op == "/")
       {
           Result = NumEnter1 / NumEnter2;
           jtxtResult.setText(String.valueOf(Result));
       }
    }//GEN-LAST:event_jbtnEqualActionPerformed

    
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
            java.util.logging.Logger.getLogger(NewCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDiv;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMul;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
