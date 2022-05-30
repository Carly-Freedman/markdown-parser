import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.io.IOException;

public class MarkdownParseTest { 
    @Test 
    public void addition() { 
    assertEquals(2, 1 + 1); 
    } 
    @Test
    public void test1() throws IOException{
        assertEquals(List.of("url.com","`google.com", "google.com", "ucsd.edu"), 
        MarkdownParse.getLinks(Files.readString(Paths.get("test-file4.md"))));
    }
    @Test
    public void test2() throws IOException{
        assertEquals(List.of("b.com", "a.com(())", "example.com"), 
        MarkdownParse.getLinks(Files.readString(Paths.get("test-file5.md"))) );
    }
    @Test
    public void test3() throws IOException{
        assertEquals(List.of("https://www.twitter.com", 
        "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", "github.com", "https://cse.ucsd.edu/"), 
        MarkdownParse.getLinks(Files.readString(Paths.get("test-file6.md"))));
    }
} 
