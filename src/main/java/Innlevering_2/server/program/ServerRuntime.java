package Innlevering_2.server.program;

import Innlevering_2.server.io.Server_IO_Controller;

public class ServerRuntime implements Runnable
{

    private Server_IO_Controller io;
    public ServerRuntime(ClientConnection conn)
    {
        io = new Server_IO_Controller(conn.getConnection());

    }

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
