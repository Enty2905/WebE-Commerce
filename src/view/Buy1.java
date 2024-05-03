/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author AN
 */
public class Buy1 extends javax.swing.JFrame {
    private Document document;
    /**
     * Creates new form Buy1
     */
    public Buy1(String productName, String price) {
        initComponents();
        nameProduct.setText(productName);
        priceProduct.setText(price);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phonetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        idtxt = new javax.swing.JTextField();
        priceProduct = new javax.swing.JLabel();
        nameProduct = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Phone Number:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 190, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Quantity:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Citizen Identification:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, 30));
        jPanel1.add(phonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 300, 30));

        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        jPanel1.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 300, 30));
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 300, 30));

        priceProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        priceProduct.setForeground(new java.awt.Color(255, 0, 51));
        priceProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(priceProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 580, 30));

        nameProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(nameProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 580, 30));

        kButton1.setText("CANCEL");
        kButton1.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverEndColor(new java.awt.Color(51, 153, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton1.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton1.setkSelectedColor(new java.awt.Color(51, 153, 255));
        kButton1.setkStartColor(new java.awt.Color(51, 153, 255));
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 160, -1));

        kButton2.setText("BUY");
        kButton2.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverEndColor(new java.awt.Color(51, 153, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton2.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton2.setkSelectedColor(new java.awt.Color(51, 153, 255));
        kButton2.setkStartColor(new java.awt.Color(51, 153, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 160, -1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 102, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 155, 60, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:\
        String name = nametxt.getText();
        String id = idtxt.getText();
        String phone = phonetxt.getText();
        String productName = nameProduct.getText();
        String price = priceProduct.getText();

        try {
            File xmlFile = new File("C:\\Users\\AN\\Downloads\\XML\\purchase.xml");
            Document document;

            if (xmlFile.exists()) {
                // Nếu tệp đã tồn tại, load tài liệu XML từ tệp đó
                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                document = docBuilder.parse(xmlFile);

                // Tìm phần tử gốc <buy>
                Element buyElement = (Element) document.getElementsByTagName("buy").item(0);

                // Tạo các phần tử con và gắn chúng vào phần tử gốc
                Element personElement = document.createElement("Order");
                buyElement.appendChild(personElement);

                Element nameElement = document.createElement("name");
                nameElement.appendChild(document.createTextNode(name));
                personElement.appendChild(nameElement);

                Element cccdElement = document.createElement("cccd");
                cccdElement.appendChild(document.createTextNode(id));
                personElement.appendChild(cccdElement);

                Element phoneElement = document.createElement("phone");
                phoneElement.appendChild(document.createTextNode(phone));
                personElement.appendChild(phoneElement);

                Element productNameElement = document.createElement("productName");
                productNameElement.appendChild(document.createTextNode(productName));
                personElement.appendChild(productNameElement);

                Element priceElement = document.createElement("price");
                priceElement.appendChild(document.createTextNode(price));
                personElement.appendChild(priceElement);
            } else {
                // Nếu tệp chưa tồn tại, tạo một tài liệu XML mới và thêm dữ liệu vào đó
                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                document = docBuilder.newDocument();

                // Tạo phần tử gốc <buy>
                Element buyElement = document.createElement("buy");
                document.appendChild(buyElement);

                // Tạo các phần tử con và gắn chúng vào phần tử gốc
                Element personElement = document.createElement("Order");
                buyElement.appendChild(personElement);

                Element nameElement = document.createElement("name");
                nameElement.appendChild(document.createTextNode(name));
                personElement.appendChild(nameElement);

                Element cccdElement = document.createElement("cccd");
                cccdElement.appendChild(document.createTextNode(id));
                personElement.appendChild(cccdElement);

                Element phoneElement = document.createElement("phone");
                phoneElement.appendChild(document.createTextNode(phone));
                personElement.appendChild(phoneElement);

                Element productNameElement = document.createElement("productName");
                productNameElement.appendChild(document.createTextNode(productName));
                personElement.appendChild(productNameElement);

                Element priceElement = document.createElement("price");
                priceElement.appendChild(document.createTextNode(price));
                personElement.appendChild(priceElement);
            }

            // Tạo một đối tượng Transformer để ghi tài liệu XML đã cập nhật hoặc mới vào tệp
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // Ghi tài liệu XML vào tệp
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(xmlFile);
            transformer.transform(source, result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_kButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Buy1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buy1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buy1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buy1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatMacLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buy1("ProductName", "Price").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private javax.swing.JLabel nameProduct;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JLabel priceProduct;
    // End of variables declaration//GEN-END:variables
}