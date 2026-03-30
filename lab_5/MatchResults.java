package lab_5;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MatchResults {

    private static int milanScore = 0;
    private static int madridScore = 0;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Результаты матчей");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setResizable(false); // Запрет изменения размера окна
        frame.setLayout(null);
        JButton milanButton = new JButton("AC Milan");
        milanButton.setBounds(30, 50, 100, 30);
        milanButton.setFocusable(false); // Отключаем фокус на кнопке
        JButton madridButton = new JButton("Real Madrid");
        madridButton.setBounds(150, 50, 100, 30);
        madridButton.setFocusable(false); // Отключаем фокус на кнопке
        JLabel resultLabel = new JLabel("Result: 0 X 0");
        resultLabel.setBounds(100, 100, 150, 30);
        JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
        lastScorerLabel.setBounds(90, 120, 200, 30);
        JLabel winnerLabel = new JLabel("Winner: DRAW");
        winnerLabel.setBounds(100, 140, 150, 30);
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels(resultLabel, lastScorerLabel, winnerLabel, "AC Milan");
            }
        });
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels(resultLabel, lastScorerLabel, winnerLabel, "Real Madrid");
            }
        });
        frame.add(milanButton);
        frame.add(madridButton);
        frame.add(resultLabel);
        frame.add(lastScorerLabel);
        frame.add(winnerLabel);
        // Запрет клавиш считывание с клавиатуры
        frame.setLocationRelativeTo(null);

        milanButton.setFocusable(false);
        madridButton.setFocusable(false);
        frame.setVisible(true);
    }
    private static void updateLabels(JLabel resultLabel, JLabel lastScorerLabel, JLabel winnerLabel, String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        // Обновление последнего забившего
        lastScorerLabel.setText("Last Scorer: " + lastScorer);
        // Определение победителя
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
}
