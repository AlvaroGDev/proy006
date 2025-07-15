package es.cic._5.proy006;

import org.springframework.stereotype.Service;

@Service
public class AppTareaService {

    private long contador = 0;

    public Tarea create(Tarea miTarea){

        miTarea.setId(++contador);
        miTarea.setNombreTarea("Fregar los utensilios de la comida");
        miTarea.setDescTaera("Fregar platos, vasos, cubiertos, y todo lo que se haya utilizado en la comida");
        miTarea.setPersonaTarea("Antonio");
       
        return miTarea;
    }

}
