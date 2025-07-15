package es.cic._5.proy006;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tareas")

public class AppTareaController {

    @Autowired
    private AppTareaService tareaService;

    List<Tarea> listadoTareas = new ArrayList<>();
    

    @PostMapping
    public long create(@RequestBody Tarea miTareaCreada) {
        return tareaService.create(miTareaCreada);

    }

    @GetMapping()
    public List<Tarea> get() {

        Tarea tarea1 = new Tarea();
        tarea1.setId(tareaService.create(tarea1));
        tarea1.setNombreTarea("Fregar los utensilios de la comida");
        tarea1.setDescTaera("Fregar platos, vasos, cubiertos, y todo lo que se haya utilizado en la comida");
        tarea1.setPersonaTarea("Antonio");
        listadoTareas.add(tarea1);
        return listadoTareas;
    }

    @GetMapping("/{id}")
    public Tarea get(@PathVariable long id) {
        Tarea tarea1 = new Tarea();
        tarea1.setId(tareaService.create(tarea1));
        tarea1.setNombreTarea("Hacer la compra");
        tarea1.setDescTaera("Coger la lista y el dinero de la mesa del salón e ir a hacer la compra.");
        tarea1.setPersonaTarea("Francisco");

        return tarea1;
    }

}
