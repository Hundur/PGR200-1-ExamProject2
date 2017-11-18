package Innlevering_2.Tests;

import Innlevering_2.client.io.Client_IO_Controller;
import Innlevering_2.client.program.ClientInit;
import Innlevering_2.server.io.Server_IO_Controller;
import Innlevering_2.server.program.ClientConnection;
import Innlevering_2.server.program.ServerInit;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static Innlevering_2.TestSupplies.TestUtils.*;
import static org.junit.Assert.*;

public class ServerTests
{
    private Client_IO_Controller clientIO;
    private Server_IO_Controller serverIO;
    private ClientConnection conn;

    @Before
    public void setUp()
    {
        ServerInit server = new ServerInit(3000);
        ClientInit client = new ClientInit("localhost", 3000);
        conn = new ClientConnection(server.getServer());
        clientIO = new Client_IO_Controller(client.getConnection());
        serverIO = new Server_IO_Controller(conn.getConnection());
    }

    @Test
    public void inputTest()
    {
        // ARRANGE

        List<String> inputList = getInputList();
        List<String> outputList = getOutputList();

        // ACT / ASSERT

        for(int i = 0; i < outputList.size(); i++)
        {
            clientIO.sendMessage(inputList.get(i));
            assertEquals(outputList.get(i), serverIO.getMessage());
        }
    }
}
