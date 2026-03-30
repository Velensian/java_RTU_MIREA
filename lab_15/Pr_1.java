package lab_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 2
public class Pr_1 extends JFrame {
    private JComboBox<String> countryComboBox;
    private JTextArea infoTextArea;

    public Pr_1() {
        setTitle("Страны");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] countries = {"Австралия", "Китай", "Англия", "Россия"};

        countryComboBox = new JComboBox<>(countries);
        countryComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                displayCountryInfo(selectedCountry);
            }
        });

        infoTextArea = new JTextArea(5, 30);
        infoTextArea.setEditable(false);
        infoTextArea.setLineWrap(true); // Автоматический перенос строк
        infoTextArea.setWrapStyleWord(true); // Переносить по словам

        add(countryComboBox);
        add(infoTextArea);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void displayCountryInfo(String country) {
        String info = "";

        switch (country) {
            case "Австралия":
                info = "Австралия: Страна и континент, омываемые Индийским и Тихим океанами.";
                break;
            case "Китай":
                info = "Китай: Самая густонаселенная страна в мире, известная своей богатой историей и культурой.";
                break;
            case "Англия":
                info = "Англия: Страна, входящая в состав Соединенного Королевства, известная своими историческими достопримечательностями.";
                break;
            case "Россия":
                info = "Россия: самая большая страна в мире, охватывающая Восточную Европу и Северную Азию.";
                break;
        }

        infoTextArea.setText(info);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Pr_1::new);
    }
}
