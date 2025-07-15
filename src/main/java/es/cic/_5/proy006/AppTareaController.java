package es.cic._5.proy006;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tareas")

public class AppTareaController {

    @Autowired
    private AppTareaService tareaService;

    List<Tarea> listadoTareas = new ArrayList<>();
    // Creamos el listado de tareas

    @GetMapping()
    public List<Tarea> get() {

        Tarea tarea1 = new Tarea();   // Primero creo la tarea
      
        tarea1 = tareaService.create(tarea1); 
        /*
        Utilizo el método create de TareaService, que recibe una tarea y la devuelve con los campos rellenos
         */ 
        listadoTareas.add(tarea1); // Añado la tarea rellena a la lista

        return listadoTareas; // Y por último devuelvo la tarea
      
    }

    @GetMapping("/{id}")
    public Tarea get(@PathVariable long id) {
        Tarea tarea1 = new Tarea();
        tarea1.setId(1);
        tarea1.setNombreTarea("Hacer la compra");
        tarea1.setDescTaera("Coger la lista y el dinero de la mesa del salón e ir a hacer la compra.");
        tarea1.setPersonaTarea("Francisco");

        return tarea1;
    }
     /*
       Esta es la forma de recibir unos datos mediante un parámetro (en este caso id) que nos pasan como argumento
       en este caso, nos envíen el id que nos envíen y mientras sea un número entero, 
       siempre se creará e inicializará la misma tarea, y por último la devolverá
     */

}
