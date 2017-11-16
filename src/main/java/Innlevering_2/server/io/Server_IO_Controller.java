package Innlevering_2.server.io;

import java.io.IOException;
import java.net.Socket;

import static Innlevering_2.server.io.utils.MessageAnalyzer.analyzeMessage;

public class Server_IO_Controller
{
    private ClientInput clientInput;
    private Output output;

    public Server_IO_Controller(Socket conn)
    {
        try
        {
            clientInput = new ClientInput(conn);
            output = new Output(conn);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message)
    {
        try
        {
            System.out.println("Sending message...");
            output.sendMessage(message);
            System.out.println("Message sent!\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public String getMessage()
    {
        try
        {
            String message;

            System.out.println("Fetching message...");
            message = clientInput.getMessage().toUpperCase();

            if(message.equals("EXIT"))
            {
                clientInput.close();
                output.close();
                System.out.println("ClientInit closed connection\n");

                return "Closed";
            }

            return analyzeMessage(message);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
