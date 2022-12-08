package com.leo.btlxulyanh;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class BTL extends JFrame {

    Image displayImage;
    BufferedImage biSrc, biDest, bi, de, cache;
    RescaleOp rescale;
    float scaleFactor = 1.0f;
    float offset = 0;
    boolean brighten, contrastInc;
    boolean checkImg = false;
    ImageIcon iconChange;

    public BTL() {
        initComponents();
        jbDecBrighten.addActionListener(new ButtonListener());
        jbDecContrast.addActionListener(new ButtonListener());
        jbIncBrighten.addActionListener(new ButtonListener());
        jbIncContrast.addActionListener(new ButtonListener());
        jbGrey.addActionListener(new ButtonListener());
        jbNegative.addActionListener(new ButtonListener());
        jbMedianFiltering.addActionListener(new ButtonListener());
        jbbinary.addActionListener(new ButtonListener());
        jbSmoothFilter.addActionListener(new ButtonListener());
    }

    //code iu java swing
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        displayImageRoot = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jlDisplayImage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jbOpen = new javax.swing.JButton();
        jbReset = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jbDecContrast = new javax.swing.JButton();
        jbIncContrast = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jbDecBrighten = new javax.swing.JButton();
        jbIncBrighten = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jbGrey = new javax.swing.JButton();
        jbNegative = new javax.swing.JButton();
        jbMedianFiltering = new javax.swing.JButton();
        jbbinary = new javax.swing.JButton();
        jbSmoothFilter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ảnh gốc"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayImageRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayImageRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ảnh sau thay đổi"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlDisplayImage, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlDisplayImage, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Load image"));

        jbOpen.setText("Open image");
        jbOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOpenActionPerformed(evt);
            }
        });

        jbReset.setText("Reset image");
        jbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbOpen)
                    .addComponent(jbReset))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jbOpen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbReset)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Contrast"));

        jbDecContrast.setText("Decrease <<");
        jbDecContrast.setToolTipText("");
        jbDecContrast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDecContrastActionPerformed(evt);
            }
        });

        jbIncContrast.setText(">> Increase");
        jbIncContrast.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jbDecContrast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jbIncContrast)
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDecContrast)
                    .addComponent(jbIncContrast))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Brightness"));

        jbDecBrighten.setText("Decrease <<");

        jbIncBrighten.setText(">> Increase");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jbDecBrighten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbIncBrighten)
                .addGap(22, 22, 22))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDecBrighten)
                    .addComponent(jbIncBrighten))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Other"));

        jbGrey.setText("Grey scale");

        jbNegative.setText("Negative");
        jbNegative.setToolTipText("");

        jbMedianFiltering.setText("Median Filtering");
        jbMedianFiltering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMedianFilteringActionPerformed(evt);
            }
        });

        jbbinary.setText("Binary image");
        jbbinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbinaryActionPerformed(evt);
            }
        });

        jbSmoothFilter.setText("Smooth Filter ");
        jbSmoothFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSmoothFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbGrey, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jbNegative, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbbinary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbMedianFiltering, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSmoothFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jbGrey)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbNegative)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbbinary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbMedianFiltering)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSmoothFilter))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// đừng quan tâm

    private void jbDecContrastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDecContrastActionPerformed
// đừng quan tâm
    }//GEN-LAST:event_jbDecContrastActionPerformed

    //sự kiện nút mở chọn ảnh
    private void jbOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOpenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());

        fileChooser.setFileFilter(imageFilter);
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            loadImage(file.getAbsolutePath());

        }
    }//GEN-LAST:event_jbOpenActionPerformed

    //nút làm mới ảnh
    private void jbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResetActionPerformed
        if (checkImg) {
            showImageChanged(de);
            scaleFactor = 1.0f;
            offset = 0;
        }
    }//GEN-LAST:event_jbResetActionPerformed

    private void jbMedianFilteringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMedianFilteringActionPerformed
        // đừng quan tâm
    }//GEN-LAST:event_jbMedianFilteringActionPerformed

    private void jbbinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbinaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbbinaryActionPerformed

    private void jbSmoothFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSmoothFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSmoothFilterActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new RunnableImpl());
    }

    private static class RunnableImpl implements Runnable {

        public RunnableImpl() {
        }

        @Override
        public void run() {
            new BTL().setVisible(true);
        }
    }

    //class sự kiện chung cho các nút thay đổi ảnh
    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton temp = (JButton) e.getSource();

            if (temp.equals(jbIncBrighten)) {//tăng sáng
                brighten = true;//flag kiểm tra chọn tăng hay giảm
                changeOffSet();
                System.out.println(offset + "=offset");
                rescale();
            } else if (temp.equals(jbDecBrighten)) {//giảm sáng
                brighten = false;
                changeOffSet();
                System.out.println(offset + "=offset");
                rescale();
            } else if (temp.equals(jbIncContrast)) {//tăng
                contrastInc = true;
                changeScaleFactor();
                System.out.println(scaleFactor + "=scaleF");
                rescale();
            } else if (temp.equals(jbDecContrast)) {//giảm
                contrastInc = false;
                changeScaleFactor();
                System.out.println(scaleFactor + "=scaleF");
                rescale();
            } else if (temp.equals(jbGrey)) {//thang xám
                changeColor(2);
                System.out.println("Grey scale");
            } else if (temp.equals(jbMedianFiltering)) {// lọc trung bình
                medianFiltering();
                System.out.println("Median Filtering");
            } else if (temp.equals(jbNegative)) {// màu âm bản
                changeColor(1);
                System.out.println("Negative");
            } else if (temp.equals(jbbinary)) {// màu nhị phân
                changeColor(4);
                System.out.println("Negative");
            } else if (temp.equals(jbSmoothFilter)) {// lọc mịn
                smoothFilter();
                System.out.println("Smooth Filter");
            }
        }
    }

    //
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel displayImageRoot;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton jbDecBrighten;
    private javax.swing.JButton jbDecContrast;
    private javax.swing.JButton jbGrey;
    private javax.swing.JButton jbIncBrighten;
    private javax.swing.JButton jbIncContrast;
    private javax.swing.JButton jbMedianFiltering;
    private javax.swing.JButton jbNegative;
    private javax.swing.JButton jbOpen;
    private javax.swing.JButton jbReset;
    private javax.swing.JButton jbSmoothFilter;
    private javax.swing.JButton jbbinary;
    private javax.swing.JLabel jlDisplayImage;
    // End of variables declaration//GEN-END:variables
///
    //load ảnh vào BufferedImage và show ảnh lên
    public void loadImage(String imageUrl) {
        createBufferedImages();
        File file = new File(imageUrl);
        try {
            //load ảnh gốc
            BufferedImage img = ImageIO.read(file);

            Image dimg = img.getScaledInstance(
                    displayImageRoot.getWidth(),
                    displayImageRoot.getHeight(),
                    Image.SCALE_SMOOTH);
            ImageIcon iconRoot = new ImageIcon(dimg);
            displayImageRoot.setIcon(iconRoot);

            //load ảnh vào BufferedImage để thay đổi
            biSrc = ImageIO.read(file);
            biDest = ImageIO.read(file);
            bi = ImageIO.read(file);
            cache = ImageIO.read(file);
            de = ImageIO.read(file);

            showImageChanged(de);//show ảnh để thay đổi lên
            checkImg = true;
        } catch (IOException ex) {
            System.out.println("Exception while loading.");
            checkImg = false;
        }
        if (displayImage.getWidth(this) == -1) {
            System.out.println("No image file");
            checkImg = false;
            System.exit(0);
        }
    }

    // thay đổi quy mô hoạt động trên màu sắc
    public void createBufferedImages() {
        biSrc = new BufferedImage(jlDisplayImage.getWidth(),
                jlDisplayImage.getHeight(),
                BufferedImage.TYPE_INT_RGB);

        biDest = new BufferedImage(jlDisplayImage.getWidth(),
                jlDisplayImage.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        bi = biSrc;
    }

    // thay đổi giá trị độ sáng từ bấm nút
    public void changeOffSet() {
        //tăng độ sáng trong khoảng -255->255 (- tối; + sáng)
        if (checkImg) {//nếu có ảnh
            if (brighten) {//tăng
                if (offset < 255) {//giới hạn tối đa 255
                    offset = offset + 5.0f;//tăng lên 5.0f
                }
            } else {//giảm 

                if (offset > -255) {//giới hạn nhỏ nhất -255
                    offset = offset - 5.0f;//giảm độ sáng 5.0f
                }
            }
        }
    }

    // thay đổi giá trị tương phản từ bấm nút
    public void changeScaleFactor() {
        if (checkImg) {
            if (contrastInc) {//tăng tương phản
                if (scaleFactor < 2) {//trên 2 nó sáng loá
                    scaleFactor = scaleFactor + 0.1f;
                }
            } else {//giảm tương phản
                if (scaleFactor > 0) {//dưới không nó đen xì
                    scaleFactor = scaleFactor - 0.1f;
                }
            }
        }
    }

    //thực hiện thay đổi giá trị scaleFactor, offset cho ảnh
    public void rescale() {
        if (checkImg) {
            rescale = new RescaleOp(scaleFactor, offset, null);
            //thực hiện thay đổi tỷ lệ từng pixel của dữ liệu trong hình ảnh nguồn 
            //bằng cách nhân các giá trị mẫu cho mỗi pixel với tỷ lệ và sau đó thêm một phần bù đắp
            // offset( tăng độ sáng)
            //scaleFactor tăng tương phản
            rescale.filter(biSrc, biDest);
            bi = biDest;
            showImageChanged(bi);
        }

    }

    //thực hiện đảo màu của ảnh
    public void changeColor(int c) {
        if (checkImg) {
            for (int x = 0; x < bi.getWidth(); x++) {
                for (int y = 0; y < bi.getHeight(); y++) {
                    //duyệt từng pixel của ảnh
                    int rgba = bi.getRGB(x, y);//lấy giá  trị RGB của pixel 
                    Color col = new Color(rgba, true);
                    switch (c) {
                        case 1 -> {  //âm màu
                            col = new Color(
                                    255 - col.getRed(),
                                    255 - col.getGreen(),
                                    255 - col.getBlue());
                            //màu từ 0-255
                            //dùng 255- để đảo màu này sang màu khác
                            cache.setRGB(x, y, col.getRGB());//set màu mới cho BufferedImage
                        }
                        case 2 -> { //thang xám

                            int agv = (col.getRed() + col.getGreen() + col.getBlue()) / 3;//lấy giá trị trung bình của rgb để ra màu xám
                            int r = agv;
                            int g = agv;
                            int b = agv;
//                        int rgb = (col.getAlpha() << 24) | (r << 16) | (g << 8) | b;
//                        cache.setRGB(x, y, rgb);
                            col = new Color(r, g, b);
                            cache.setRGB(x, y, col.getRGB());
                        }
                        case 3 -> { //nâu đỏ

                            int newRed = truncate((int) (0.393 * col.getRed() + 0.769 * col.getGreen() + 0.189 * col.getBlue()));
                            int newGreen = truncate((int) (0.349 * col.getRed() + 0.686 * col.getGreen() + 0.168 * col.getBlue()));
                            int newBlue = truncate((int) (0.272 * col.getRed() + 0.534 * col.getGreen() + 0.131 * col.getBlue()));
                            //công thức màu này dựa trên thuật toán đảo màu Sepia
                            // check gtri mới không vượt qua 255

                            col = new Color(newRed, newGreen, newBlue, col.getAlpha());
                            cache.setRGB(x, y, col.getRGB());
                        }
                        case 4 -> {
                            int m = (col.getRed() + col.getBlue() + col.getGreen());
                            if (m >= 383) {
                                // for light color it set white
                                cache.setRGB(x, y, Color.WHITE.getRGB());
                            } else {
                                // for dark color it will set black
                                cache.setRGB(x, y, 0);
                            }
                        }
                        default -> {
                        }
                    }
                }
            }
            showImageChanged(cache);
        }
    }

//thay đổi tương phản bằng các duyệt pixel như đảo màu
    public void changeContract(int contrastValue, int x, int y) {
        float factor = (259 * (contrastValue + 255)) / (255 * (259 - contrastValue));
        int rgba = bi.getRGB(x, y);
        Color col = new Color(rgba, true);
        int newRed = truncate((int) (factor * (col.getRed() - 128) + 128));
        int newGreen = truncate((int) (factor * (col.getGreen() - 128) + 128));
        int newBlue = truncate((int) (factor * (col.getBlue() - 128) + 128));
        col = new Color(newRed, newGreen, newBlue);
        biDest.setRGB(x, y, col.getRGB());
    }
//thay đổi độ sáng bằng các duyệt pixel như đảo màu

    public void changeBright(int brightValue, int x, int y) {
        int rgba = bi.getRGB(x, y);
        Color col = new Color(rgba, true);
        int newRed = truncate(col.getRed() + brightValue);
        int newGreen = truncate(col.getGreen() + brightValue);
        int newBlue = truncate(col.getBlue() + brightValue);
        col = new Color(newRed, newGreen, newBlue);
        biDest.setRGB(x, y, col.getRGB());

    }
//cắt bớt giá trị grb khi vượt qua mức 0-255

    public int truncate(int value) {
        if (value < 0) {
            value = 0;
        }
        if (value > 255) {
            value = 255;
        }
        return value;
    }

    //thực hiện thay đổi và hiển thị ảnh lên
    public void showImageChanged(BufferedImage bImg) {
        displayImage = bImg.getScaledInstance(
                displayImageRoot.getWidth(),
                displayImageRoot.getHeight(),
                Image.SCALE_SMOOTH);//set kích thước để ảnh hiển thị
        iconChange = new ImageIcon(displayImage);//dùng imageicon để hiển thị ảnh vào label
        jlDisplayImage.setIcon(iconChange);
    }

    public BufferedImage test(BufferedImage bImg, BufferedImage out) {
        for (int y = 0; y < bImg.getHeight(); y++) {
            for (int lx = 0, rx = bImg.getWidth() - 1; lx < bImg.getWidth(); lx++, rx--) {

                // lx bắt đầu từ phía bên trái của hình ảnh
                // rx bắt đầu từ phía bên phải của
                // hình ảnh lx được sử dụng vì chúng tôi đang nhận được
                // pixel từ bên trái rx được sử dụng để thiết lập
                // từ bên phải lấy giá trị pixel nguồn
                int p = bImg.getRGB(lx, y);
                out.setRGB(rx, y, p);
            }
        }
        return out;
    }

    public void medianFiltering() {

//        int[] reds = new int[3 * 3];
//        int[] greens = new int[3 * 3];
//        int[] blues = new int[3 * 3];
//
//        int kerneliter = 0;
//
//// Di chuyển toàn bộ hình ảnh nhưng dừng lại trước khi for đi ra khỏi giới hạn tại ranh giới kernel.       
//        for (int i = 1; i < bi.getWidth() - 1; i++) {
//            for (int j = 1; j < bi.getHeight() - 1; j++) {
//                /*
//                    A1|A2|A3
//                    --------
//                    B1|B2|B3
//                    --------
//                    C1|C2|C3
//                 */
//                for (int ki = 0; ki < 3; ki++) {
//                    for (int kj = 0; kj < 3; kj++) {
//                        Color col = new Color(bi.getRGB(i + ki - 1, j + kj - 1));
//                        reds[kerneliter] = col.getRed();
//                        greens[kerneliter] = col.getGreen();
//                        blues[kerneliter] = col.getBlue();
//                        kerneliter++;
//                    }
//                }
//                kerneliter = 0;
//                //sắp xếp các pixel từ nhỏ nhất đến lớn nhất
//                Arrays.sort(reds);
//                Arrays.sort(greens);
//                Arrays.sort(blues);
//                Color colfinal = new Color(reds[4], greens[4], blues[4]);
//                cache.setRGB(i + 1, j + 1, colfinal.getRGB());
//            }
//        }
        for (int row = 1; row < bi.getWidth() - 1; row++) {
            for (int col = 1; col < bi.getHeight() - 1; col++) {

                ArrayList<Integer> reds = new ArrayList<>();
                ArrayList<Integer> greens = new ArrayList<>();
                ArrayList<Integer> blues = new ArrayList<>();

                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        Color color = new Color(bi.getRGB(i, j));
                        reds.add((int) (color.getRed()));
                        greens.add((int) (color.getGreen()));
                        blues.add((int) (color.getBlue()));
                    }
                }

                Collections.sort(reds);
                Collections.sort(greens);
                Collections.sort(blues);
                Color colfinal = new Color(reds.get(4), greens.get(4), blues.get(4));
                cache.setRGB(row, col, colfinal.getRGB());
            }
        }
        showImageChanged(cache);
    }

    public void smoothFilter() {

        for (int x = 1; x < bi.getWidth() - 1; x++) {
            for (int y = 1; y < bi.getHeight() - 1; y++) {
                int red = 0;
                int green = 0;
                int blue = 0;
                /*
                    A1|A2|A3
                    --------
                    B1|B2|B3
                    --------
                    C1|C2|C3
                 */
                for (int i = x - 1; i <= x + 1; i++) {
                    for (int j = y - 1; j <= y + 1; j++) {
                        Color color = new Color(bi.getRGB(i, j));
                        red += color.getRed();
                        green += color.getGreen();
                        blue += color.getBlue();
                    }
                }
                Color colfinal = new Color(red / 9, green / 9, blue / 9);
                cache.setRGB(x, y, colfinal.getRGB());

            }
        }
        showImageChanged(cache);
    }
}
