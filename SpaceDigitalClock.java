import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class SpaceDigitalClock extends JFrame {

    JLabel timeLabel;
    JLabel dateLabel;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dateFormat;
    Timer timer;

    SpaceDigitalClock() {
        setTitle("Digital Clock developed by Monty");
        setSize(500, 250);
        setLayout(new GridLayout(2, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Space background
        getContentPane().setBackground(Color.BLACK);

        timeFormat = new SimpleDateFormat("HH:mm:ss");
        dateFormat = new SimpleDateFormat("dd MMMM yyyy");

        timeLabel = new JLabel();
        dateLabel = new JLabel();

        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        dateLabel.setHorizontalAlignment(JLabel.CENTER);

        timeLabel.setFont(new Font("Times New Roman", Font.BOLD, 60));
        dateLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));

        // Neon colors
        timeLabel.setForeground(new Color(0, 255, 255)); // Cyan
        dateLabel.setForeground(new Color(255, 0, 255)); // Pink

        add(timeLabel);
        add(dateLabel);

        timer = new Timer(1000, e -> updateClock());
        timer.start();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    void updateClock() {
        timeLabel.setText(timeFormat.format(new Date()));
        dateLabel.setText(dateFormat.format(new Date()));
    }

    public static void main(String[] args) {
        new SpaceDigitalClock();
    }
}
