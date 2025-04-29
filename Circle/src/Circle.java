import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Circle extends JPanel implements ActionListener {
    private final int BOARD_WIDTH = 10;
    private final int BOARD_HEIGHT = 20;
    private Timer timer;

    public Circle() {
        setPreferredSize(new Dimension(300, 600));
        setBackground(Color.BLACK);
        timer = new Timer(500, this); // 게임 속도
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
    }

    private void drawBoard(Graphics g) {
        // 보드 그리기 예제
        g.setColor(Color.GRAY);
        for (int x = 0; x < BOARD_WIDTH; x++) {
            for (int y = 0; y < BOARD_HEIGHT; y++) {
                g.drawRect(x * 30, y * 30, 30, 30); // 블록 크기
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 타이머 이벤트 (게임 로직 업데이트)
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tetris");
        Circle game = new Circle();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
