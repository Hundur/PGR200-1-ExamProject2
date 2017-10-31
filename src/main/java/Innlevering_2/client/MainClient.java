package Innlevering_2.client;

import Innlevering_2.client.io.IO_Controller;

public class MainClient
{
    public static void main(String [] args)
    {
        Client client = new Client("192.168.38.103", 3000);
        IO_Controller io = new IO_Controller(client.getConnection());

        System.out.println(io.getMessage());
        io.sendMessage();
        System.out.println(io.getMessage());
    }
}
