import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;

public class ClientGUI extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;
    private PrintWriter out;

    public ClientGUI(String username) {
        setTitle("Chat App - " + username);
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        inputField = new JTextField();

        add(new JScrollPane(chatArea), BorderLayout.CENTER);
        add(inputField, BorderLayout.SOUTH);

        connect(username);

        inputField.addActionListener(e -> {
            out.println(username + ": " + inputField.getText());
            inputField.setText("");
        });
    }

    private void connect(String username) {
        try {
            Socket socket = new Socket("localhost", 5000);
            out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        chatArea.append(msg + "\n");
                    }
                } catch (IOException ignored) {}
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Enter your name:");
        new ClientGUI(username).setVisible(true);
    }
}
