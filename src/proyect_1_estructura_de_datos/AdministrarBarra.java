package proyect_1_estructura_de_datos;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jordi
 */
public class AdministrarBarra extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    protected double tiempo;
    public JLabel label;
    public String orden;
     public AdministrarBarra() {
    }

    public AdministrarBarra(JProgressBar barra, double tiempo, JLabel label,String orden) {
        this.barra = barra;
        avanzar = true;
        vive = true;
        this.tiempo=tiempo;
        this.label = label;
        this.orden = orden;
    }

    public double getHora() {
        return tiempo;
    }

    public void setHora(double tiempo) {
        this.tiempo = tiempo;
    }
    
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
   
    @Override
    public void run(){
        while (vive){
            if (avanzar) {
                barra.setValue(barra.getValue()+1);
                if (barra.getValue()==tiempo) {
                    vive=false;
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                
            }
            
        }
        
        barra.setValue(0);
        label.setText("Inactivo");
        JOptionPane.showMessageDialog(null, "Orden #"+orden+" finalizada");
}
}
