/*
就是为了测试图片在Swing中的显示
 */

/**
 *
 * @author 91152
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Main {
    private void init(){
        try {
            //下面的4句是关键，有了下面的4句，这个ZPanel才能正常显示图片
            Image imm = ImageIO.read(new File("abc.png"));
            ZPanel zp = new ZPanel();
            zp.setImage(imm);
            zp.setPreferredSize(new Dimension(imm.getWidth(null),imm.getHeight(null)));
            
            JFrame jf = new JFrame("测试");
            jf.add(zp);
            jf.pack();
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setLocationRelativeTo(null);
            jf.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Main nw =new Main();
        nw.init();
    }
}
