package EllJes16.io;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Input
{
    private DataInputStream input;

    public Input(Socket conn) throws IOException
    {
        input = new DataInputStream(conn.getInputStream());
    }

    public String getMessage() throws IOException
    {
        return input.readUTF();
    }
}
