import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGuiForm  extends JFrame{
    private JButton thisIsMyButtonButton;
    private JTextArea myTextArea;
    private JPanel rootPanel;

    public MyGuiForm()
    {
      //this uses the form designer
        add(rootPanel);
        setTitle("This is my Title");
        setSize(400,500);

        thisIsMyButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "HelloWorld");
            }
        });
    }
}
