package Innlevering_2.server.io;

import Innlevering_1.io.IO_Controller;
import Innlevering_1.utils.MessageAnalyzer;

import java.io.IOException;
import java.net.Socket;
import java.sql.SQLException;

/**
 * IOController for the server
 *
 * @author Jesper Dahl Ellingsen
 */
public class Server_IO_Controller
{
    private ClientInput clientInput;
    private MessageAnalyzer msgAnalyzer;
    private Output output;

    /**
     * Creates the IOController
     *
     * @param conn Connection to the client
     */
    public Server_IO_Controller(Socket conn)
    {
        try
        {
            clientInput = new ClientInput(conn);
            msgAnalyzer = new MessageAnalyzer();
            output = new Output(conn);
            new IO_Controller("db.properties");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Sends a message to the client
     *
     * @param message Message to be sent
     */
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

    /**
     * Retrieves the message from the client
     *
     * @return The respond message to the client
     */
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

            return msgAnalyzer.analyzeMessage(message);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
