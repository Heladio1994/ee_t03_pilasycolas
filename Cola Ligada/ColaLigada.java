public class ColaLigada
{
    private Nodo frente;
    private Nodo fin;
    
    public ColaLigada(){
        frente= fin= null;
    }
    
    public boolean estaVacia(){
        return frente == null;
    }
    
    public boolean agregar(Object dato){
        Nodo aux= new Nodo(dato,null);
        if(aux == null){
            return false;
        }
        
        if(estaVacia()){
            frente= fin= aux;
            return true;
        }
        
        fin.setSiguiente(aux);
        fin= aux;
        return true;
    }
    
    public Object eliminar(){
        if(estaVacia()){
            return null;
        }
        
        Object o= frente.getDato();
        frente= frente.getSiguiente();
        return o;
    }
    
    public Object verFrente(){
        if(!estaVacia()){
            return frente.getDato();
        }
        return null;
    }
}
