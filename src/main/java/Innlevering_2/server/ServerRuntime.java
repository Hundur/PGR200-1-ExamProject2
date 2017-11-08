package Innlevering_2.server;

import Innlevering_2.server.io.IO_Controller;

public class ServerRuntime implements Runnable
{

    private IO_Controller io;
    public ServerRuntime(ClientConnection conn)
    {
        io = new IO_Controller(conn.getConnection());

    }

    public void run()
    {
        io.sendMessage("0 -> End connection\n" +
                "1 -> Get table SUBJECT\n" +
                "2 -> Get table TEACHER\n" +
                "3 -> Get table ROOM\n" +
                "4 -> Get SUBJECT PGR1100\n" +
                "5 -> Get SUBJECT DB1100\n" +
                "Write in your request...\n");

        while(true)
        {
            String message = io.getMessage();

            if(message.equals("Closed"))
                break;

            io.sendMessage(message);
        }
    }
}
