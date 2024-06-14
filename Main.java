import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextField weightField;
    private JTextField heightField;
    private JLabel resultLabel;

    public Main() {
        //  Configs window
        setTitle("IMC Helper");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        //  Components
        JLabel weightLabel = new JLabel("Weight (kg): ");
        weightLabel.setBounds(10, 10, 80, 25);
        add(weightLabel);

        weightField = new JTextField();
        weightField.setBounds(100, 10, 165,25);
        add(weightField);

        JLabel heightLabel = new JLabel("Height (cm): ");
        heightLabel.setBounds(10, 40, 80, 25);
        add(heightLabel);

        heightField = new JTextField();
        heightField.setBounds(100, 40, 165, 25);
        add(heightField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10, 80, 100, 25);
        add(calculateButton);

        resultLabel = new JLabel("IMC: ");
        resultLabel.setBounds(10, 110, 200, 25);
        add(resultLabel);

        //  Add action to button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateIMC();
            }
        });
    }

    private void calculateIMC() {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText()) / 100;
            double imc = weight / (height * height);
            String interpretation = interpretateIMC(imc);
            resultLabel.setText(String.format("IMC: %.2f - %s", imc, interpretation));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please, input correct number values");
        }
    }

    private String interpretateIMC(double imc) {
        if (imc < 18.5) {
            return "Under weight";
        } else if (imc < 24.9) {
            return "Normal weight";
        } else if (imc < 29.9) {
            return "Over weight";
        } else {
            return "Obesity";
        }
    }

    public static void main (String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}
