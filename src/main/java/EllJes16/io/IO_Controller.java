package EllJes16.io;

import java.io.IOException;
import java.net.Socket;

import static EllJes16.MessageAnalyzer.analyzeMessage;

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
            System.out.println("Fetching message...");
            int message = clientInput.getMessage();
            return analyzeMessage(message);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
