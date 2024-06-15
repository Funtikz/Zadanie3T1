package org.example.zadanie3;


import org.example.zadanie3.service.BaseTo64Service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BaseTo64ServiceTest {

    private final BaseTo64Service baseTo64Service = new BaseTo64Service();

    @Test
    public void testConvertToBase64() {
        String email = "test@example.com";
        String code = "12345";
        String expected = "dGVzdEBleGFtcGxlLmNvbToxMjM0NQ==";

        String result = baseTo64Service.convertToBase64(email, code);

        assertEquals(expected, result);
    }
}
