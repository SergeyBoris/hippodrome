import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Disabled
    @Test
    @Timeout(value = 22)
    @DisplayName("Time to run < 22 sek")
    void main() throws Exception {


        Main.main(new String[]{});


    }
}