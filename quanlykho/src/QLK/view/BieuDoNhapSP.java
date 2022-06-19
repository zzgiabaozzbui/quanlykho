/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLK.view;

import QLK.model.ChiTietNhapDao;
import QLK.model.SP;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author ADMIN
 */
public class BieuDoNhapSP extends javax.swing.JPanel {

    /**
     * Creates new form BieuDoNhapSP
     */
    public BieuDoNhapSP() {
        initComponents();
        JFreeChart pieChart = createChart(createDataset());
        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new Dimension(this.getWidth(), 321));
        this.removeAll();
        this.setLayout(new CardLayout());
        this.add(chartPanel);
        this.validate();
        this.repaint();
    }
    
     private static JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Nhập sản phẩm", dataset, true, true, true);
        return chart;
    }
    private static PieDataset createDataset() {
        ChiTietNhapDao ddvd=new ChiTietNhapDao();
       
        List<SP> list=new ArrayList<SP>();
        list=ddvd.getChart();
        
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (SP sp : list) {
            dataset.setValue("Sản phẩm:"+sp.getMaSP(), sp.getsLNhap());
        }
           
        return dataset;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
