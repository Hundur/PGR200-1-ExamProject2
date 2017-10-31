package Innlevering_2.server;

import Innlevering_2.server.io.IO_Controller;

public class MainServer
{
    public static void main(String [] args)
    {
        Server server = new Server(3000);
        ClientConnection conn = new ClientConnection(server.getServer());
        IO_Controller io = new IO_Controller(conn.getConnection());
        io.sendMessage("1 -> Get table SUBJECT\n" +
                       "2 -> Get table TEACHER\n" +
                       "3 -> Get table ROOM\n" +
                       "4 -> Get SUBJECT PGR1100\n" +
                       "5 -> Get SUBJECT DB1100\n" +
                       "Write in your request...");

        io.sendMessage(io.getMessage());
    }
}
