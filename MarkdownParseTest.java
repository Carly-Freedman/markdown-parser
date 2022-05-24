import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.io.IOException;

public class MarkdownParseTest { 
  //  @Test 
  //  public void addition() { 
  //  assertEquals(2, 1 + 1); 
  //  } 
    @Test
    public void test1() throws IOException
    {
        assertEquals(List.of("https://something.com"), MarkdownParse.getLinks(Files.readString(Paths.get("test-file1.md"))));
    }

} 
