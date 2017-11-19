package Innlevering_2.client.io;

import java.io.IOException;
import java.net.Socket;

/**
 * The IO Controller for the client
 *
 * @Author Jesper Dahl Ellingsen
 */
public class Client_IO_Controller
{
    private ServerInput serverInput;
    private Output output;

    /**
     * Creates the IO controller
     *
     * @param conn The connection to the server
     */
    public Client_IO_Controller(Socket conn)
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

    /**
     * Sends a message to the server, if the message is "exit" the output and input will close
     *
     * @param answer Users message
     * @return False if user writes exit, or the message was not sent
     */
    public boolean sendMessage(String answer)
    {
        try
        {
            output.sendMessage(answer);
            answer = answer.toLowerCase();

            if(answer.equals("exit"))
            {
                serverInput.close();
                output.close();

                System.out.println("Closing connection to server...\n" +
                                   "See you next time!");

                return false;
            }

            System.out.println("\nMessage sent!\n");
            return true;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Retrieves a message from the server
     *
     * @return The message in form of a String or null if the message could not be retrieved
     */
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