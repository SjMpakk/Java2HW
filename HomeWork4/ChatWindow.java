package HomeWork4;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ChatWindow extends JFrame {
    private JTextField jtfMessage;
    private JTextArea jtaTextAreaMessage;


    public ChatWindow() {
        setBounds(600, 300, 600, 500);
        setTitle("Chat");
        setDefaultCloseOperation(ChatWindow.EXIT_ON_CLOSE);
        jtaTextAreaMessage = new JTextArea();
        jtaTextAreaMessage.setEditable(false);
        jtaTextAreaMessage.setLineWrap(true);
        JScrollPane jsp = new JScrollPane(jtaTextAreaMessage);
        add(jsp, BorderLayout.CENTER);
        JPanel bp = new JPanel(new BorderLayout());
        add(bp, BorderLayout.SOUTH);
        JButton jbSendMessage = new JButton("Send");
        bp.add(jbSendMessage, BorderLayout.EAST);
        jtfMessage = new JTextField("Enter your message: ");
        bp.add(jtfMessage, BorderLayout.CENTER);


        jbSendMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jtfMessage.getText().trim().isEmpty()) {
                    sendMsg();
                    jtfMessage.grabFocus();
                }
            }
        });
        jtfMessage.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfMessage.setText("");
            }
        });

        jtfMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jtfMessage.getText().trim().isEmpty()) {
                    sendMsg();
                    jtfMessage.setText("");
                }
            }
        });

        setVisible(true);
    }

    void sendMsg() {
        jtaTextAreaMessage.append(jtfMessage.getText() + "\n");
    }
}
