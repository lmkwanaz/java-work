import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MortgageClient {

    public static void main(String[] args){

        String hostname = "127.0.0.1";
        int portNumber = 44444;
        Socket clientSocket;
        PrintWriter out;
        BufferedReader in;
        InputStreamReader ir;

        try{

            System.out.println("client");
            clientSocket = new Socket(hostname, portNumber);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            ir = new InputStreamReader(clientSocket.getInputStream());
            in = new BufferedReader(ir);
            out.println("initcalculation");
            System.out.println("Server says: "+in.readLine());
        }catch (UnknownHostException e){
            System.exit(1);
        }catch (IOException e){
            System.exit(1);
        }
    }
}
