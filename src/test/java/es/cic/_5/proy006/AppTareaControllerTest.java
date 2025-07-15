package es.cic._5.proy006;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppTareaControllerTest {

    @Autowired
    private AppTareaController tareaController;

    @Test
    public void testCreate(){
        long resultadoId = tareaController.create(null);
        assertTrue(resultadoId > 0);
    }
}
