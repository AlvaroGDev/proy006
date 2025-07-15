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
        Tarea resultadoId = tareaController.get(5);
        assertTrue(resultadoId.getId()>0);
    }
    /*
     En este caso, como nuestro create() devuelve una instancia completa de 'Tarea',
     tenemos que usar el getter para ver si le está generando el id
     */
}
