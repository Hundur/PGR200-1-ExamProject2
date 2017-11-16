package Innlevering_2.client.program;

import Innlevering_2.client.io.Client_IO_Controller;
import Innlevering_2.client.io.TerminalInput;

public class ClientRuntime
{
    public ClientRuntime(ClientInit client)
    {
        Client_IO_Controller io = new Client_IO_Controller(client.getConnection());
        TerminalInput terminalInput = new TerminalInput();

        System.out.println(io.getMessage());

        while(true)
        {
            String answer = terminalInput.getTerminalInput();
            if(io.sendMessage(answer) == false)
            {
                terminalInput.close();
                break;
            }

            System.out.println(io.getMessage());
        }
    }
}