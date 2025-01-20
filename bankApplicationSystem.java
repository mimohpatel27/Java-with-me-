import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
    public class Banking{
    public static class Bankings implements ActionListener {
    private JFrame mainFrame;
    private JTextField inputField;
    private JLabel balanceLabel;
    private int balance =0;

    public Bankings(){
        mainFrame =new JFrame ("SBI Bank Application");
        mainFrame.setVisible(true);
        mainFrame.setSize(400,400);
        mainFrame.setFont(new Font ("Times New Roman",Font.BOLD,18));
        mainFrame.setLayout(new FlowLayout());

        inputField=new JTextField(10);
        balanceLabel =new JLabel("Current Balance" + balance);
        JButton depositeButton = new JButton("Deposite");
        JButton withdrawButton = new JButton("Withdraw");

        mainFrame.add(inputField);
        mainFrame.add(depositeButton);
        mainFrame.add(withdrawButton);
        mainFrame.add(balanceLabel);

        depositeButton.addActionListener(this);
        withdrawButton.addActionListener(this);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override

    public void actionPerformed(ActionEvent e){
        int amount =Integer.parseInt(inputField.getText());
        if(e.getActionCommand().equals("Deposite")){
            balance+=amount;
        } else{
            balance-=amount;
        }
        balanceLabel.setText("Current Balance"+balance);
        inputField.setText("");
    }
    public static void main(String[] args) {
        new Bankings();
    }
}
}
