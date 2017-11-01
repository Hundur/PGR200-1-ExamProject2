package Innlevering_2.server.io;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientInput
{
    private DataInputStream input;

    public ClientInput(Socket conn) throws IOException
    {
        input = new DataInputStream(conn.getInputStream());
    }

    public int getMessage() throws IOException
    {
        return input.readInt();
    }

    public void close() throws IOException
    {
        input.close();
    }
}
