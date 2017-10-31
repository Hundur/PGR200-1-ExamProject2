package EllJes16.Server;

import EllJes16.Server.io.IO_Controller;

public class Main
{
    public static void main(String [] args)
    {
        Server server = new Server(3000);
        ClientConnection conn = new ClientConnection(server.getServer());
        IO_Controller io = new IO_Controller(conn.getConnection());
        io.sendMessage("Get table SUBJECT -> 1\n" +
                       "Get table TEACHER -> 2\n" +
                       "Get table ROOM -> 3\n" +
                       "Get SUBJECT PGR1100 -> 4\n" +
                       "Get SUBJECT DB1100 -> 5\n" +
                       "Write in your request...");

        io.sendMessage(io.getMessage());
    }
}
