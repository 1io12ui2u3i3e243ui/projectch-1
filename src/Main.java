import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    public Main() {
        setTitle("Химический калькулятор");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        showMenu();
        setVisible(true);
    }

    public void showMenu() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton start = new JButton("Калькулятор");
        JButton exit = new JButton("Выход");
        panel.add(start);
        panel.add(exit);

start.addActionListener(e-> showCalculator());
exit.addActionListener(e->System.exit(0));

    setContentPane(panel);

    revalidate();

    repaint();
}
    public void showCalculator() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Введите реакцию:");
        JTextField input = new JTextField(20);
        JButton back = new JButton("Назад");
        panel.add(label);
        panel.add(input);
        panel.add(back);
        back.addActionListener(e -> showMenu());
        setContentPane(panel);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }
}
