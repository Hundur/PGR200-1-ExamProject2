package Innlevering_2.client;

import Innlevering_2.client.io.IO_Controller;

public class ClientRuntime
{
    public ClientRuntime(Client client)
    {
        IO_Controller io = new IO_Controller(client.getConnection());

        System.out.println(io.getMessage());

        while(true)
        {
            if(io.sendMessage() == false)
                break;

            System.out.println(io.getMessage());
        }
    }
}