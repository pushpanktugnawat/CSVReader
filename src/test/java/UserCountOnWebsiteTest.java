import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class UserCountOnWebsiteTest {

    @Test
    void should_countNoOfUsers() throws IOException {
        assertEquals(2,UserCountOnWebsite.countNoOfUsers(
            new File("src/test/resources/test.csv"),
            ","));
    }
}