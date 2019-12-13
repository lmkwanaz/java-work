import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

    int portNumber = 44444;
    ServerSocket serverSocket = null;

    public void runServer(){
        try{
            serverSocket = new ServerSocket(portNumber);
        }catch(IOException e){
            System.out.print(e.getMessage());
        }


        while(true){
            try{
                Socket clientsocket = serverSocket.accept();
                MortgageRunnable m = new MortgageRunnable(clientsocket);
                new Thread(m).start();
            }catch(IOException e){

                System.out.println(e.getMessage());
            }
        }
    }
}
