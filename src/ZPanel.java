/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91152
 */
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class ZPanel extends JPanel {
    private Image im;

    public void setImage(Image im){
        this.im =im;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics gg = g;
        gg.drawImage(im, 0, 0, this);
    }
    
}
