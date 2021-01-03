import javax.swing.*;
import java.awt.*;

public class Menue {
    private int n;
    private Color color1;
    private double x;
    private double y;
    private double w;
    private double h;

    private String img;

    String[] list = new String[5];

    public Menue() {
        x = 100;
        y = 0;
        w = 396;
        h = 100;
        n = 5;
        color1 = Color.BLACK;
        img = "button.png";

        list[0] = "Новый игрок";
        list[1] = "Играть";
        list[2] = "Настройка";
        list[3] = "Правила";
        list[4] = "Выход";
    }

    public void update() {

    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < n; i++) {
            g.drawImage(new ImageIcon(img).getImage(), (int) x, (int) (y + 140) * i, null);

            g.setColor(color1);
            Font font = new Font("Arial", Font.ITALIC, 60);
            g.setFont(font);

            long length = (int) g.getFontMetrics().getStringBounds(list[i], g).getWidth();
            g.drawString(list[i], (int) (x + w / 2) - (int) (length / 2), (int) ((y + 140) * i + (h / 3) * 2));

        }
    }
}
