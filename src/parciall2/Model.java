/*
Autor: María José Corredor Garzón
 */
package Parciall2;
import java.util.TreeMap;
public class Model{
    private TreeMap<Integer, String> treeMap;
    
    public Model(){
        treeMap= new TreeMap<>();
        treeMap.put(1, "Camiseta");
        treeMap.put(2, "Camisa");
        treeMap.put(3, "Chaqueta");
        treeMap.put(4, "Pantalon");
        treeMap.put(5, "Vestido");
        treeMap.put(6, "Medias");
        treeMap.put(7, "Zapatos");
        treeMap.put(8, "Short");
    }
    
    public TreeMap<Integer, String> getMenu(){
        return treeMap;
    }
    
    public boolean VerDispo(String producto){
        return treeMap.containsValue(producto);
    }
    
    public void AgProduct(String nuevoProducto){
        int nuevoP = treeMap.lastKey() + 1;
        treeMap.put(nuevoP, nuevoProducto);
    }
}

