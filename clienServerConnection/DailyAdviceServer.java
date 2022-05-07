import java.io.*;
import java.net.*;

public class DailyAdviceServer {

    String[] adviceList = {"Take on the clothes", "Run a marathon", "No advices for today",
                            "Win smth somewhere", "Chat a lot", "Make a cake"};

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);

            while(true) {
            Socket sock = serverSock.accept();

            PrintWriter writer = new PrintWriter(sock.getOutputStream());
            String advice = getAdvice();
            writer.println(advice);
            writer.close();
            System.out.println(advice);
        }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        } 
    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
        }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}