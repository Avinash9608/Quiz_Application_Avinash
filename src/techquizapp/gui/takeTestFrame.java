/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquizapp.dao.PerformanceDao;
import techquizapp.dao.QuestionDao;
import techquizapp.pojo.Answer;
import techquizapp.pojo.AnswerStore;
import techquizapp.pojo.Exam;
import techquizapp.pojo.Performance;
import techquizapp.pojo.Question;
import techquizapp.pojo.QuestionStore;
import techquizapp.pojo.UserProfile;

/**
 *
 * @author Vishal Kumar
 */
public class takeTestFrame extends javax.swing.JFrame {
    private QuestionStore Store;
    private AnswerStore aStore;
    private Exam exam;
    int qno,pos=0;
    Color oldColor;
    public takeTestFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblShowUserName.setText("Hello "+UserProfile.getUsername());
        Store=new QuestionStore();
        aStore=new AnswerStore();
        qno=1;
        lblShowQno.setText("Question No:"+qno);
        oldColor=lblLogout.getForeground();
    }
    public takeTestFrame(Exam exam)
    {
        this();
        this.exam=exam;
        lblTitle.setText(exam.getLanguage().toUpperCase()+"PAPER");
        loadQuestion();
        showQuestion();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lblShowUserName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblShowQno = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtShowQuestion = new javax.swing.JTextArea();
        jrbOption1 = new javax.swing.JRadioButton();
        jrbOption3 = new javax.swing.JRadioButton();
        jrbOption2 = new javax.swing.JRadioButton();
        jrbOption4 = new javax.swing.JRadioButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lblShowUserName.setForeground(new java.awt.Color(204, 102, 0));
        lblShowUserName.setText("jLabel6");

        lblLogout.setForeground(new java.awt.Color(204, 102, 0));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 102, 0));
        lblTitle.setText("SUBJECT PAPER");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquizapp/images/good luck2.jpg"))); // NOI18N

        lblShowQno.setBackground(new java.awt.Color(0, 0, 0));
        lblShowQno.setForeground(new java.awt.Color(204, 102, 0));
        lblShowQno.setText("Question no :");

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(204, 102, 0));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(204, 102, 0));
        btnCancel.setText("Cancel");

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(204, 102, 0));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDone.setForeground(new java.awt.Color(204, 102, 0));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        txtShowQuestion.setColumns(20);
        txtShowQuestion.setRows(5);
        jScrollPane1.setViewportView(txtShowQuestion);

        jrbOption1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbOption1);
        jrbOption1.setForeground(new java.awt.Color(204, 102, 0));
        jrbOption1.setText("jRadioButton1");

        jrbOption3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbOption3);
        jrbOption3.setForeground(new java.awt.Color(204, 102, 0));
        jrbOption3.setText("jRadioButton2");

        jrbOption2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbOption2);
        jrbOption2.setForeground(new java.awt.Color(204, 102, 0));
        jrbOption2.setText("jRadioButton3");

        jrbOption4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbOption4);
        jrbOption4.setForeground(new java.awt.Color(204, 102, 0));
        jrbOption4.setText("jRadioButton4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblShowUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblShowQno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbOption1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbOption2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbOption3)
                                .addGap(141, 141, 141)
                                .addComponent(jrbOption4)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblShowUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(343, 343, 343)
                        .addComponent(lblShowQno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbOption1)
                    .addComponent(jrbOption2))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbOption3)
                    .addComponent(jrbOption4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String choosenAnswer=getUserAnswer();
        if(choosenAnswer!=null)
        {
            Question quest=Store.getQuestionByQno(qno);
            String correctAnswer=quest.getCorrectAnswer();
            Answer ans=new Answer(exam.getExamId(),exam.getLanguage(),qno,choosenAnswer,correctAnswer);
            Answer attemp=aStore.getAnswerByQno(qno);
            if(attemp==null)
            {
                aStore.addAnswer(ans);
                
            }
            else
            {
                String prevAnswer=attemp.getChoosenAnswer();
                if(prevAnswer.equals(choosenAnswer)==false)
                {
                    int apos=aStore.removeAnswer(attemp);
                    aStore.setAnswerAt(apos, ans);
                }
            }
                
        }
          pos++;
         if(pos>=exam.getTotalQuestion())
         {
           
             pos=0;
             
         }
         
         qno++;
         if(qno>exam.getTotalQuestion())
         {
             qno=1;
         }
        lblShowQno.setText("Question No:"+qno);
        showQuestion();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
          pos--;
         if(pos<0)
         {
           
             pos=Store.getCount()-1;
             
         }
         
         qno--;
         if(qno<=0)
         {
             qno=Store.getCount();
         }
        lblShowQno.setText("Question No:"+qno);
        showQuestion();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
           String choosenAnswer=getUserAnswer();
        if(choosenAnswer!=null)
        {
            Question quest=Store.getQuestionByQno(qno);
            String correctAnswer=quest.getCorrectAnswer();
            Answer ans=new Answer(exam.getExamId(),exam.getLanguage(),qno,choosenAnswer,correctAnswer);
            Answer attemp=aStore.getAnswerByQno(qno);
            if(attemp==null)
            {
                aStore.addAnswer(ans);
                
            }
            else
            {
                String prevAnswer=attemp.getChoosenAnswer();
                if(prevAnswer.equals(choosenAnswer)==false)
                {
                    int apos=aStore.removeAnswer(attemp);
                    aStore.setAnswerAt(apos, ans);
                }
            }
                
        }
        int right=0,wrong=0;
        for(Question quest:Store.getAllQuestion())
        {
            int qno=quest.getQno();
            Answer ans=aStore.getAnswerByQno(qno);
            if(ans==null)
            {
                continue;
            }
            String attempAnswer=ans.getChoosenAnswer();
            String correctAnswe=ans.getCorrectAnswer();
            if(attempAnswer.equals(correctAnswe))
                right++;
            else
             wrong++;
            
        }
        StringBuilder b=new StringBuilder();
        b.append("\nRight answer: "+right);
        b.append("\nWrong answer: "+wrong);
        b.append("\nUnattempted answer: "+(Store.getCount()-(right+wrong)));
        JOptionPane.showMessageDialog(null,b.toString(),"Result!",JOptionPane.INFORMATION_MESSAGE);
        try
        {
            Performance per=new Performance(exam.getExamId(),exam.getLanguage(),UserProfile.getUsername(),right,wrong,Store.getCount()-(right+wrong),(double)right/Store.getCount()*100);
            PerformanceDao.addPerformance(per);
            ChoosePaperFrame fr=new ChoosePaperFrame();
            
            fr.setVisible(true);
            this.dispose();
        }
        catch(Exception ex)
        {
          JOptionPane.showMessageDialog(null,"DB Error!","Take Testframe Error!",JOptionPane.ERROR_MESSAGE);  
          ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
         
        LoginFrame fr=new LoginFrame();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
       
         lblLogout.setForeground(Color.red);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(oldColor);
    }//GEN-LAST:event_lblLogoutMouseExited

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(takeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(takeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(takeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(takeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new takeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbOption1;
    private javax.swing.JRadioButton jrbOption2;
    private javax.swing.JRadioButton jrbOption3;
    private javax.swing.JRadioButton jrbOption4;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblShowQno;
    private javax.swing.JLabel lblShowUserName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtShowQuestion;
    // End of variables declaration//GEN-END:variables

   

    private void showQuestion() {
        
       Question q=Store.getQuestion(pos);
       buttonGroup1.clearSelection();
       txtShowQuestion.setText(q.getQuestion());
       jrbOption1.setText(q.getAnswer1());
       jrbOption2.setText(q.getAnswer2());
       jrbOption3.setText(q.getAnswer3());
       jrbOption4.setText(q.getAnswer4());
       Answer ans=aStore.getAnswerByQno(qno);
       if(ans==null)
       {
           return;
       }
       String str=ans.getChoosenAnswer();
       switch(str)
       {
           case "Answer1":
               jrbOption1.setSelected(true);
               break;
           case "Answer2":
               jrbOption2.setSelected(true);
               break;
           case "Answer3":
               jrbOption3.setSelected(true);
               break;
           case "Answer4":
               jrbOption4.setSelected(true);
               break;
       }
               
    }

    private void loadQuestion() {
         try
        {
            ArrayList<Question> questionList=QuestionDao.getQuestionByExamId(exam.getExamId());
            for(Question q:questionList)
            {
                
                Store.addQuestion(q);
            }
            System.out.println(questionList);
        }
        catch(Exception ex)
            {
              JOptionPane.showMessageDialog(null,"DB Error","Take Test Ques Error",JOptionPane.ERROR_MESSAGE);
              ex.printStackTrace();
            }
    }

    private String getUserAnswer() {
        if(jrbOption1.isSelected())
            return "Answer1";
        if(jrbOption2.isSelected())
            return "Answer2";
        if(jrbOption3.isSelected())
            return "Answer3";
        if(jrbOption4.isSelected())
            return "Answer4";
        else 
            return null;
    }
}