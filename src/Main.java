import javax.swing.*;
import java.awt.*;


public class Main {
    static JFrame frame;
    public static void main(String[] args) {
        frame = new JFrame("гра Міста");

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        frame.setBounds(dimension.width/2-200, dimension.height/2-150, 400, 300);
        Image image = toolkit.getImage("icon.png");

        frame.setVisible(true);
        frame.setIconImage(image);

        //  JButton next = new JButton("Зарахувати");
        //frame.add(next);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}