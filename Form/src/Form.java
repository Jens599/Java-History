/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
/**
 *
 * @author Jens
 */
public class Form extends javax.swing.JFrame {
     private boolean keycode;
    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
        jButton6_delete.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1_INTENDENDBUYER = new ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1_item = new javax.swing.JTextField();
        jTextField2_series = new javax.swing.JTextField();
        jTextField3_price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4_quantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1_type = new javax.swing.JComboBox<>();
        jButton1_clearI = new javax.swing.JButton();
        jButton2_add = new javax.swing.JButton();
        jRadioButton1_kids = new javax.swing.JRadioButton();
        jRadioButton2_adults = new javax.swing.JRadioButton();
        jRadioButton3_everyone = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3_SBtype = new javax.swing.JButton();
        jButton4_SBprice = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton6_delete = new javax.swing.JButton();
        jButton8_clearS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1_Soitem = new javax.swing.JButton();
        jButton2_Sotype = new javax.swing.JButton();
        jButton3_SoPrice = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Item");

        jLabel2.setText("Series");

        jLabel3.setText("Price");

        jTextField3_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3_priceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3_priceKeyReleased(evt);
            }
        });

        jLabel4.setText("Intended Buyer :");

        jLabel5.setText("Quantity :");

        jTextField4_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4_quantityActionPerformed(evt);
            }
        });
        jTextField4_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4_quantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4_quantityKeyReleased(evt);
            }
        });

        jLabel6.setText("Type:");

        jComboBox1_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T-Shirt", "Key Chain", "Mini Backpack", "Figure", "Patch", "Plush", "Ring", "Hoodie" }));
        jComboBox1_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1_typeActionPerformed(evt);
            }
        });

        jButton1_clearI.setText("Clear");
        jButton1_clearI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_clearIActionPerformed(evt);
            }
        });

        jButton2_add.setText("Add Item");
        jButton2_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_addActionPerformed(evt);
            }
        });

        buttonGroup1_INTENDENDBUYER.add(jRadioButton1_kids);
        jRadioButton1_kids.setText("Kids");

        buttonGroup1_INTENDENDBUYER.add(jRadioButton2_adults);
        jRadioButton2_adults.setText("Adults");

        buttonGroup1_INTENDENDBUYER.add(jRadioButton3_everyone);
        jRadioButton3_everyone.setText("Everyone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1_item)
                            .addComponent(jTextField2_series)
                            .addComponent(jTextField3_price)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4_quantity)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1_clearI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2_add, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButton1_kids)
                            .addComponent(jRadioButton2_adults)
                            .addComponent(jRadioButton3_everyone))
                        .addGap(0, 249, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2_series, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1_kids)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2_adults)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3_everyone)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_add)
                    .addComponent(jButton1_clearI))
                .addGap(32, 32, 32))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T-Shirt", "Key Chain", "Mini Backpack", "Figure", "Patch", "Plush", "Ring", "Hoodie" }));

        jButton3_SBtype.setText("Search by type");
        jButton3_SBtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_SBtypeActionPerformed(evt);
            }
        });

        jButton4_SBprice.setText("Search By Price");
        jButton4_SBprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_SBpriceActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton6_delete.setText("Delete");
        jButton6_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_deleteActionPerformed(evt);
            }
        });

        jButton8_clearS.setText("Clear");
        jButton8_clearS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8_clearSActionPerformed(evt);
            }
        });

        jTable1.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Series", "Type", "Intended Buyer", "Price", "Quantity"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1_Soitem.setText("Sort By Item");
        jButton1_Soitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SoitemActionPerformed(evt);
            }
        });

        jButton2_Sotype.setText("Sort By Type");
        jButton2_Sotype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_SotypeActionPerformed(evt);
            }
        });

        jButton3_SoPrice.setText("Sort By Price");
        jButton3_SoPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_SoPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3_SBtype)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton6_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jButton8_clearS, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                            .addComponent(jTextField5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4_SBprice)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1_Soitem)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2_Sotype)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3_SoPrice)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4_SBprice)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3_SBtype)
                    .addComponent(jButton8_clearS)
                    .addComponent(jButton6_delete))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_Soitem)
                    .addComponent(jButton2_Sotype)
                    .addComponent(jButton3_SoPrice))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Anime Merchandise");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_quantityActionPerformed

    private void jComboBox1_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1_typeActionPerformed

    private void jButton2_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_addActionPerformed
        // TODO add your handling code here:
        String item = jTextField1_item.getText();
        String series = jTextField2_series.getText();
        String price =jTextField3_price.getText();
        String quantity =jTextField4_quantity.getText();
        
        String intendendbuyer = "";
        String type = jComboBox1_type.getSelectedItem().toString();
        if(jRadioButton1_kids.isSelected()){
            intendendbuyer = "Kids";
        }else if (jRadioButton2_adults.isSelected()){
            intendendbuyer = "Adults";
        }else if (jRadioButton3_everyone.isSelected()){
            intendendbuyer = "Everyone";
        }
        if(item.equals("")||series.equals("")||intendendbuyer.equals("")||
                quantity.equals("")||price.equals("")){
            JOptionPane.showMessageDialog(null,"Empty Field OR Intended Buyer Not Selected"
                ,"INVALID INPUT!", JOptionPane.ERROR_MESSAGE);
        }else{
            if(isAdd){
                id = String.valueOf((bookData.size())+1);
                bookData.add(new Data(id,Integer.valueOf(quantity),item,series,type,intendendbuyer,Double.valueOf(price)));
            }else{
                bookData.set(selectedIndex,new Data(id,Integer.valueOf(quantity),item,series,type,intendendbuyer,Double.valueOf(price)));
            }
                clearTable();
                updateTable(bookData);
                clearData();
                }
                    
        
    }//GEN-LAST:event_jButton2_addActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton6_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_deleteActionPerformed
     int option = JOptionPane.showConfirmDialog(null,
                 "Do you want to delete the selected data? ","Confirm",
                 JOptionPane.YES_NO_CANCEL_OPTION);
         if (option == 0){
            bookData.remove(selectedIndex);
            clearTable();
            updateTable(bookData);
            clearData();
            isAdd = true;
            jButton6_delete.setVisible(false);
        }
         else{
             System.out.println("Cancel pressed");
         }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6_deleteActionPerformed

    private void jButton1_SoitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SoitemActionPerformed
        sort("item");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_SoitemActionPerformed
private void clearData(){                                            
    jTextField1_item.setText("");
    jTextField2_series.setText("");
    jTextField3_price.setText("");
    jTextField4_quantity.setText("");
    jRadioButton1_kids.setSelected(false);
    jRadioButton2_adults.setSelected(false);
    jRadioButton3_everyone.setSelected(false);
    jComboBox1_type.setSelectedIndex(0);
    jButton2_add.setText("Add new Book");
    jButton1_clearI.setText("Clear");
    jButton6_delete.setVisible(false);
    id="";
    isAdd=true;
    selectedIndex=0;
    jTable1.clearSelection();
    
// TODO add your handling code here:
    }
    private void clearTable(){
       DefaultTableModel mdl = (DefaultTableModel) jTable1.getModel();
       int rowcount = mdl.getRowCount();
       for(int intable = 0; intable<rowcount;intable++){
           mdl.removeRow(0);
       }
   }
    
    private void jButton3_SoPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_SoPriceActionPerformed
        sort("price");  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3_SoPriceActionPerformed

    private void jTextField3_priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_priceKeyPressed
        char character = evt.getKeyChar(); 
int Keycode = evt.getKeyCode();
System.out.println(Keycode);
if(!(Character.isDigit(character))){
    if(Keycode==8 || Keycode==46){
        jTextField3_price.setEditable(true);
    
    }
    else{
        jTextField3_price.setEditable(false);
    }
}
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_priceKeyPressed

    private void jTextField3_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3_priceKeyReleased
        jTextField3_price.setEditable(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_priceKeyReleased

    private void jTextField4_quantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_quantityKeyPressed
       char character = evt.getKeyChar(); 
int Keycode = evt.getKeyCode();
System.out.println(Keycode);
if(!(Character.isDigit(character))){
    if(Keycode==8 || Keycode==46){
        jTextField4_quantity.setEditable(true);
    
    }
    else{
        jTextField4_quantity.setEditable(false);
    }
}        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_quantityKeyPressed

    private void jTextField4_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4_quantityKeyReleased
       jTextField4_quantity.setEditable(true); 
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4_quantityKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jButton2_add.setText("Update Book");
    jButton1_clearI.setText("Cancel");
    jButton6_delete.setVisible(true);
    int rowIndex = jTable1.getSelectedRow();
    Data rowdata = bookData.get(rowIndex);
    isAdd = false;
    id=rowdata.id;
    selectedIndex= rowIndex;
    DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
     if(model.getValueAt(rowIndex, 4).toString().equals("kids")){
        jRadioButton1_kids.setSelected(true);}
       else if(model.getValueAt(rowIndex, 4).toString().equals("Adults")){
        jRadioButton2_adults.setSelected(true);}
       else{
           jRadioButton3_everyone.setSelected(true);
        }
     jTextField1_item.setText(model.getValueAt(rowIndex, 1).toString());
        jTextField2_series.setText(model.getValueAt(rowIndex, 2).toString());
        jComboBox1_type.setSelectedItem(model.getValueAt(rowIndex, 1).toString());
        jTextField3_price.setText(model.getValueAt(rowIndex, 5).toString());
        jTextField4_quantity.setText(model.getValueAt(rowIndex, 6).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3_SBtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_SBtypeActionPerformed
        String result;
       int count = 0;
       String searchValue = (String) jComboBox2.getSelectedItem();
       String listOfItems = "";
       for (int i = 0; i < jTable1.getRowCount(); i++){
           String value = (String) jTable1.getValueAt(i,3);
           System.out.print(value);
           if (searchValue.equals(value)){
               String item = String.valueOf(jTable1.getValueAt(i,1));
               String series = String.valueOf(jTable1.getValueAt(i,2));
               String intendendbuyer = String.valueOf(jTable1.getValueAt(i,4));
               String price = String.valueOf(jTable1.getValueAt(i,5));
               String quantity = String.valueOf(jTable1.getValueAt(i,6));
               count++;
               listOfItems += String.valueOf(count) + ". Item =n" + item + ", Series = " + series + 
                       ", Intended Buyer = " + intendendbuyer + ", Price = " + price + ", Quantity = " + quantity + "\n";
           }
       }
       result = "There are " + count + " item(s) with type " + searchValue + ";\n" + listOfItems;
       JOptionPane.showMessageDialog(null, result, "Number of Items", JOptionPane.INFORMATION_MESSAGE);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3_SBtypeActionPerformed

    private void jButton4_SBpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_SBpriceActionPerformed
        String searchPrice = jTextField5.getText();
        sort("price");
        if(searchPrice.equals("")){
            JOptionPane.showMessageDialog(null, "price enter price to" + "search" , "price missing", JOptionPane.ERROR_MESSAGE);
        } else {
            double searchKey = Double.parseDouble(searchPrice);
            Data item = bs.binarySearch(bookData, 0, bookData.size() - 1, searchKey);
            if(item == null){
                JOptionPane.showMessageDialog(null,"There are no items matching the price you entered.", "price not found", JOptionPane.ERROR_MESSAGE);
            }else{
                String item1 = item.item + "";
                String type = item.type + "";
                String intendendbuyer = item.intendendbuyer + "";
                String quantity = item.quantity + "";
                String series = item.series + "";
                
                JOptionPane.showMessageDialog(null, item1 + " " + type + " " + intendendbuyer + " " + 
                        series + " " + quantity, "price matched!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4_SBpriceActionPerformed

    private void jButton8_clearSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8_clearSActionPerformed
        jTextField5.setText("");           // TODO add your handling code here:
    }//GEN-LAST:event_jButton8_clearSActionPerformed

    private void jButton1_clearIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_clearIActionPerformed
       clearData(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_clearIActionPerformed

    private void jButton2_SotypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_SotypeActionPerformed
        sort("type");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2_SotypeActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonGroup buttonGroup1_INTENDENDBUYER;
    private javax.swing.JButton jButton1_Soitem;
    private javax.swing.JButton jButton1_clearI;
    private javax.swing.JButton jButton2_Sotype;
    private javax.swing.JButton jButton2_add;
    private javax.swing.JButton jButton3_SBtype;
    private javax.swing.JButton jButton3_SoPrice;
    private javax.swing.JButton jButton4_SBprice;
    private javax.swing.JButton jButton6_delete;
    private javax.swing.JButton jButton8_clearS;
    private javax.swing.JComboBox<String> jComboBox1_type;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1_kids;
    private javax.swing.JRadioButton jRadioButton2_adults;
    private javax.swing.JRadioButton jRadioButton3_everyone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1_item;
    private javax.swing.JTextField jTextField2_series;
    private javax.swing.JTextField jTextField3_price;
    private javax.swing.JTextField jTextField4_quantity;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
  ArrayList<Data> bookData = new ArrayList<>();
   private final BinarySearch bs = new BinarySearch();
   private String id= "";
   private boolean isAdd= true;
   private int selectedIndex;
   public void updateTable(ArrayList<Data>dataList){
       DefaultTableModel mdl = (DefaultTableModel) jTable1.getModel();
       for(int in=0; in<dataList.size(); in++){
           Data dl = dataList.get(in);
           Object[] o =new Object[]{dl.id,dl.item,dl.series,dl.type,dl.intendendbuyer,dl.price,dl.quantity};
           mdl.addRow(o);
       }

   }
  final void getInitialTableData(){
        int rowCount = jTable1.getRowCount();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        String intendendbuyer;
        String item;
        String series;
        String id;
        double price;
        int quantity;
        String type;
        for(int i=0; i< rowCount; i++){
            if(model.getValueAt(i,4).toString().equals("children")){
                intendendbuyer = "children";                
            }else if(model.getValueAt(i,4).toString().equals("Advanced")){
                intendendbuyer = "Advanced";                
            }else if(model.getValueAt(i,4).toString().equals("Teen")){
                intendendbuyer = "Teen";                
            }else{
                intendendbuyer ="Everyone";
            }
            id = model.getValueAt(i,0).toString();
            item= model.getValueAt(i,1).toString();
            series = model.getValueAt(i,2).toString();
            type = model.getValueAt(i,3).toString();
            price = Double.valueOf(model.getValueAt(i,5).toString());
            quantity = Integer.valueOf(model.getValueAt(i,6).toString());
             bookData.add(new Data(id,quantity,item,series,type,intendendbuyer,price));
        } 
    }
    public void sort(String sortBy){
    Data tempData;
        for(int i = 0; i<bookData.size(); i++){
            for(int j=1; j<bookData.size();j++){
                Data first=bookData.get(j);
                Data second=bookData.get(j-1);
                System.out.println(first.item);
                if(sortBy.equals("price")){
                    if(first.price<second.price){
                        tempData=bookData.get(j);
                        bookData.set(j, bookData.get(j-1));
                        bookData.set(j-1, tempData);
                    }
                }else if(first.item.compareToIgnoreCase(second.item)<0){
                    tempData = bookData.get(j);
                    bookData.set(j, bookData.get(j-1));
                    bookData.set(j-1, tempData);
                }
            }
        }
        clearTable();
        updateTable(bookData);
    }

}

