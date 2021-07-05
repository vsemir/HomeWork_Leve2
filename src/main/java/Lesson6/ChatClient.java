package Lesson6;

import java.io.IOException;
import java.net.Socket;

public class ChatClient {
    private final String SERVER_IP = "localhost";
    private final int SERVER_PORT = 8189;

    public ChatClient() {
        try {
            Socket sock = new Socket(SERVER_IP, SERVER_PORT);
            new Server(sock, "Клиент");
            while (true) {
                if (sock.isClosed()) {
                    break;
                }
            }
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChatClient();
    }
}
