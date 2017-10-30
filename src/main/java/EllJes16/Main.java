package EllJes16;

import EllJes16.io.IO_Controller;

public class Main
{
    public static void main(String [] args)
    {
        Server server = new Server(3000);
        ClientConnection conn = new ClientConnection(server.getServer());
        IO_Controller io = new IO_Controller(conn.getConnection());

        System.out.println(io.getMessage());
        io.sendMessage("Hello to you too!\n");
    }
}
