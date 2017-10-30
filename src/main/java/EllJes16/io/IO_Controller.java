package EllJes16.io;

import java.io.IOException;
import java.net.Socket;

public class IO_Controller
{
    private ServerInput serverInput;
    private Output output;

    public IO_Controller(Socket conn)
    {
        try
        {
            serverInput = new ServerInput(conn);
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
            return serverInput.getMessage();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
