package Innlevering_2.server.program;

import Innlevering_2.server.io.Server_IO_Controller;

/**
 * Runtime for the server
 *
 * @author Jesper Dahl Ellingsen
 */
public class ServerRuntime implements Runnable
{
    private Server_IO_Controller io;

    /**
     * Created a serveruntime object
     *
     * @param conn Connection to the client
     */
    public ServerRuntime(ClientConnection conn)
    {
        io = new Server_IO_Controller(conn.getConnection());

    }

    /**
     * Runs the server, waits for a message from the server, if the response message is "Closed" the server will stop, otherwise it will send the respond message
     */
    public void run()
    {
        io.sendMessage("Hello and welcome to the server!\n" +
                       "If you don't know what to do, type \"Help\"\n" +
                       "To exit, type \"Exit\"\n");

        while(true)
        {
            String message = io.getMessage();

            if(message.equals("Closed"))
                break;

            io.sendMessage(message);
        }
    }
}
