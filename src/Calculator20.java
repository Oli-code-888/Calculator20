import javax.swing.*;




public class Calculator20 {
    private JPanel Calculator20;
    private JButton button1;
    private JButton button3;
    private JButton ACButton;
    private JButton xButton;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;


    double a;
    String op;
    public JTextField txtDisplay;

    public Calculator20() {
        ACButton.addActionListener(e -> txtDisplay.setText(""));
        a7Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a7Button.getText()));
        a8Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a8Button.getText()));
        a9Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a9Button.getText()));
        a4Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a4Button.getText()));
        a5Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a5Button.getText()));
        a6Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a6Button.getText()));
        a1Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a1Button.getText()));
        a2Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a2Button.getText()));
        a3Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a3Button.getText()));
        a0Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a0Button.getText()));
        a00Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a00Button.getText()));
        button11.addActionListener(e -> {
            if(txtDisplay.getText().contains("."))
            {
                double pm = Double.parseDouble(txtDisplay.getText());
                pm = pm*-1;
                txtDisplay.setText(String.valueOf(pm));
            }else
            {
                long PM = Long.parseLong(txtDisplay.getText());
                PM = PM*-1;
                txtDisplay.setText(String.valueOf(PM));

            }

        });
        button20.addActionListener(e -> {
            if(!txtDisplay.getText().contains("."))
            {
                txtDisplay.setText(txtDisplay.getText() + button20.getText());

            }
        });
        button16.addActionListener(e -> {
            a = Double.parseDouble(txtDisplay.getText());
            op = "+";
            txtDisplay.setText("");

        });
        button1.addActionListener(e -> {
            a = Double.parseDouble(txtDisplay.getText());
            op = "-";
            txtDisplay.setText("");
        });
        xButton.addActionListener(e -> {
            a = Double.parseDouble(txtDisplay.getText());
            op = "*";
            txtDisplay.setText("");
        });
        button3.addActionListener(e -> {
            a = Double.parseDouble(txtDisplay.getText());
            op = "/";
            txtDisplay.setText("");
        });
        button6.addActionListener(e -> {
            String backspace;

            if(txtDisplay.getText().length() > 0)
            {
             StringBuilder strB = new StringBuilder(txtDisplay.getText());
             strB.deleteCharAt(txtDisplay.getText().length() - 1);
             backspace = String.valueOf(strB);
             txtDisplay.setText(backspace);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator20");
        frame.setContentPane(new Calculator20().Calculator20);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
