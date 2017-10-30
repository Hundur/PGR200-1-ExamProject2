package EllJes16.io;

import java.io.IOException;
import java.net.Socket;

public class IO_Controller
{
    private Input input;
    private Output output;

    public IO_Controller(Socket conn)
    {
        try
        {
            input = new Input(conn);
            output = new Output(conn);
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
            return input.getMessage();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
