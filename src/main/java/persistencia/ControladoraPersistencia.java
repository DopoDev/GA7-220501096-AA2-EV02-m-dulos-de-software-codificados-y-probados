
package persistencia;

import java.util.List;
import logica.Usuario;

public class ControladoraPersistencia {
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    
    //Operación create
    public void crearUsuario(Usuario u){
        usuarioJpa.create(u);
    }
    
    //Operación Read
    public List<Usuario> traerUsuarios(){
        return usuarioJpa.findUsuarioEntities();
    }
    
    
    
}
