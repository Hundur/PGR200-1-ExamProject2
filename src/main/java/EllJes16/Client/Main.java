package EllJes16;

import EllJes16.io.IO_Controller;

public class Main
{
    public static void main(String [] args)
    {
        Client client = new Client("10.32.11.32", 3000);
        IO_Controller io = new IO_Controller(client.getConnection());

        System.out.println(io.getMessage());
        io.sendMessage();
        System.out.println(io.getMessage());
    }
}
