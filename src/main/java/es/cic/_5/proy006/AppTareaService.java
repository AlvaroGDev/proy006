package es.cic._5.proy006;

import org.springframework.stereotype.Service;

@Service
public class AppTareaService {

    private long contador = 0;

    public long create(Tarea miTarea){
        return ++contador;
    }


}

    
   
