
package mx.com.donajuana.dao;

import java.util.List;
import mx.com.donajuana.datos.Producto;

/**
 *
 * @author rodrigo
 */
public interface CRUD {
    
    public List<Producto> list();
    
    public void create(Producto usuario);
    
    public void update(Producto usuario);
    
    public void delete(Integer id);
    
}
