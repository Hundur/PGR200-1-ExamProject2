package Innlevering_2.client.io;

import java.io.IOException;
import java.net.Socket;

public class Client_IO_Controller
{
    private ServerInput serverInput;
    private Output output;

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