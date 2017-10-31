package Innlevering_2.server.io;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Output
{
    private DataOutputStream output;

    public Output(Socket conn) throws IOException
    {
        output = new DataOutputStream(conn.getOutputStream());
        output.flush();
    }

    public void sendMessage(String message) throws IOException
    {
        output.writeUTF(message);
        output.flush();
    }
}