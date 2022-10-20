import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.*;

public class DocSearchTest {

    @Test
    public void DocSearchTest() throws URISyntaxException, IOException {
        Handler x = new Handler("/Users/pramodyarajapakse/Desktop/CSE-15L/Lab4/");
        URI url = new URI("http://localhost:4000/");
        String result = x.handleRequest(url);
        assertEquals("Server was started", result);
    }

}
