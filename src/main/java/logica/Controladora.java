package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(Usuario u){
        controlPersis.crearUsuario(u);
    }
    
    public List<Usuario> traerUsuarios(){
        return controlPersis.traerUsuarios();
    } 

}
