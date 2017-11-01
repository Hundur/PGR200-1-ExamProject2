package Innlevering_2.server;

import Innlevering_2.server.io.IO_Controller;

public class ServerRuntime
{
    public ServerRuntime(ClientConnection conn)
    {
        IO_Controller io = new IO_Controller(conn.getConnection());
        io.sendMessage("0 -> End connection\n" +
                       "1 -> Get table SUBJECT\n" +
                       "2 -> Get table TEACHER\n" +
                       "3 -> Get table ROOM\n" +
                       "4 -> Get SUBJECT PGR1100\n" +
                       "5 -> Get SUBJECT DB1100\n" +
                       "Write in your request...\n");

        while(true)
        {
            io.sendMessage(io.getMessage());
        }
    }
}
