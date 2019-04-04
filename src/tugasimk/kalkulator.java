package tugasimk;


/**
 *
 * @author lenovo
 */
public class kalkulator extends javax.swing.JPanel {

   String angka,proses1,proses2,hasilfinal,operasi,jumlah2;
   int pilih;
   double angka1,angka2,jumlah;
   
    public kalkulator() {
        initComponents();
        angka="";
    }
    
    void angka1(){
        angka +="1";
        Inputan.setText(angka);
    }
    void angka2(){
        angka +="2";
        Inputan.setText(angka);
    }
    void angka3(){
        angka +="3";
        Inputan.setText(angka);
    }
    void angka4(){
        angka +="4";
        Inputan.setText(angka);
    }
    void angka5(){
        angka +="5";
        Inputan.setText(angka);
    }
    void angka6(){
        angka +="6";
        Inputan.setText(angka);
    }
    void angka7(){
        angka +="7";
        Inputan.setText(angka);
    }
    void angka8(){
        angka +="8";
        Inputan.setText(angka);
    }
    void angka9(){
        angka +="9";
        Inputan.setText(angka);
    }
    void angka0(){
        angka +="0";
        Inputan.setText(angka);
    }
    void koma(){
        angka +=".";
        Inputan.setText(angka);
    }
    
    void hasil(){
        switch(pilih){
            case 1:
                angka2=Double.parseDouble(angka);
                jumlah=angka1+angka2;
                angka=Double.toString(jumlah);
                Inputan.setText(angka);
                break;
            case 2:
                angka2=Double.parseDouble(angka);
                jumlah=angka1-angka2;
                angka=Double.toString(jumlah);
                Inputan.setText(angka);
                break;
            case 3:
                angka2=Double.parseDouble(angka);
                jumlah=angka1*angka2;
                angka=Double.toString(jumlah);
                Inputan.setText(angka);
                break;
            case 4:
                angka2=Double.parseDouble(angka);
                jumlah=angka1/angka2;
                angka=Double.toString(jumlah);
                Inputan.setText(angka);
                break;
        }
    }
    
    void tambah(){
        angka1=Double.parseDouble(angka);
        operasi="+";
        Inputan.setText(operasi);
        angka="";
        pilih=1;
    }
    
    void kurang(){
        angka1=Double.parseDouble(angka);
        operasi="-";
        Inputan.setText(operasi);
        angka="";
        pilih=2;
    }
    
    void kali(){
        angka1=Double.parseDouble(angka);
        operasi="X";
        Inputan.setText(operasi);
        angka="";
        pilih=3;
    }
    
    void bagi(){
        angka1=Double.parseDouble(angka);
        operasi=":";
        Inputan.setText(operasi);
        angka="";
        pilih=4;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inputan = new javax.swing.JTextField();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btnkoma = new javax.swing.JButton();
        btnnol = new javax.swing.JButton();
        btnhasil = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        History = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(444, 373));
        setLayout(null);

        Inputan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(Inputan);
        Inputan.setBounds(46, 70, 344, 48);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        add(btn7);
        btn7.setBounds(46, 129, 69, 35);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        add(btn8);
        btn8.setBounds(145, 129, 68, 35);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        add(btn9);
        btn9.setBounds(234, 129, 68, 35);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        add(btn5);
        btn5.setBounds(145, 183, 68, 35);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        add(btn4);
        btn4.setBounds(46, 183, 69, 35);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        add(btn2);
        btn2.setBounds(145, 236, 68, 35);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        add(btn6);
        btn6.setBounds(234, 183, 68, 35);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        add(btn1);
        btn1.setBounds(46, 236, 69, 35);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        add(btn3);
        btn3.setBounds(232, 236, 70, 35);

        btnkali.setText("*");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });
        add(btnkali);
        btnkali.setBounds(320, 129, 70, 35);

        btnbagi.setText("/");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });
        add(btnbagi);
        btnbagi.setBounds(320, 183, 70, 35);

        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        add(btntambah);
        btntambah.setBounds(320, 236, 70, 35);

        btnkurang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });
        add(btnkurang);
        btnkurang.setBounds(320, 290, 70, 31);

        btnkoma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnkoma.setText(".");
        btnkoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkomaActionPerformed(evt);
            }
        });
        add(btnkoma);
        btnkoma.setBounds(232, 290, 70, 31);

        btnnol.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnol.setText("0");
        btnnol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnolActionPerformed(evt);
            }
        });
        add(btnnol);
        btnnol.setBounds(46, 289, 167, 33);

        btnhasil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnhasil.setText("=");
        btnhasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhasilActionPerformed(evt);
            }
        });
        add(btnhasil);
        btnhasil.setBounds(232, 328, 158, 34);

        btnc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnc.setText("C");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });
        add(btnc);
        btnc.setBounds(47, 328, 167, 34);

        History.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        History.setForeground(new java.awt.Color(255, 255, 255));
        History.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(History);
        History.setBounds(46, 11, 344, 41);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3692.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 444, 373);
    }// </editor-fold>//GEN-END:initComponents

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       angka5();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnnolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnolActionPerformed
        angka0();
    }//GEN-LAST:event_btnnolActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        angka1();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        angka2();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       angka3();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       angka4();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        angka6();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        angka7();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        angka8();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        angka9();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        tambah();
        proses1=Double.toString(angka1);
        History.setText(proses1+" "+operasi);
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnhasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhasilActionPerformed
        hasil();
        proses2=Double.toString(angka2);
        jumlah2=Double.toString(jumlah);
        hasilfinal=proses1+" "+operasi+" "+proses2+" = "+jumlah2;
        History.setText(hasilfinal);
    }//GEN-LAST:event_btnhasilActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        kali();
        proses1=Double.toString(angka1);
        History.setText(proses1+" "+operasi);
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
       bagi();
       proses1=Double.toString(angka1);
       History.setText(proses1+" "+operasi);
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        kurang();
        proses1=Double.toString(angka1);
        History.setText(proses1+" "+operasi);
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        Inputan.setText("");
        History.setText("");
        
        angka1= (int) 0.0;
        angka2= (int) 0.0;
        jumlah= (int) 0.0;
        angka="";
        proses1="";
        proses2="";
        hasilfinal="";
        operasi="";
        jumlah2="";
    }//GEN-LAST:event_btncActionPerformed

    private void btnkomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkomaActionPerformed
        koma();
    }//GEN-LAST:event_btnkomaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel History;
    private javax.swing.JTextField Inputan;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnhasil;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkoma;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnnol;
    private javax.swing.JButton btntambah;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
