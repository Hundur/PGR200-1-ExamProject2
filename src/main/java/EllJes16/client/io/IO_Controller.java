package EllJes16.client.io;

import java.io.IOException;
import java.net.Socket;

public class IO_Controller
{
    private TerminalInput terminalInput;
    private ServerInput serverInput;
    private Output output;

    public IO_Controller(Socket conn)
    {
        try
        {
            terminalInput = new TerminalInput();
            serverInput = new ServerInput(conn);
            output = new Output(conn);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void sendMessage()
    {
        try
        {
            output.sendMessage(terminalInput.getTerminalInput());
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