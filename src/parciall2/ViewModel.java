/*
 Autor: María José Corredor Garzón
*/
package Parciall2;
public class ViewModel {
    private Model model;
    
    public  ViewModel(Model model){
        this.model = model;
    }
    
    public boolean VerDispo(String producto){
        return model.VerDispo(producto);
    }
    
    public void AgProduct(String nuevoProducto){
        model.AgProduct(nuevoProducto);
    }
    
}
