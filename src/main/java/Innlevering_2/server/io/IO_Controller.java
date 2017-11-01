package Innlevering_2.server.io;

import java.io.IOException;
import java.net.Socket;

import static Innlevering_2.server.io.utils.MessageAnalyzer.analyzeMessage;

public class IO_Controller
{
    private ClientInput clientInput;
    private Output output;

    public IO_Controller(Socket conn)
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
            int message;

            System.out.println("Fetching message...");
            message = clientInput.getMessage();

            if(message == 0)
            {
                clientInput.close();
                output.close();
                System.out.println("Client closed connection\n");

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
