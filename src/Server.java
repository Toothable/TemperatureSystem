import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.DateTimeException;
import java.time.LocalDate;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
            bufferedWriter.write("Server Connected, please enter command:\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            // e.printStackTrace();
        }
    }

    private static String parse(String str) {
        String message = null;
        return message;
    }
}
