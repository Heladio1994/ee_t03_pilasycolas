public class PilaLigada
{
    private Nodo tope;

    public PilaLigada(){
        tope= null;
    }

    public boolean estaVacia(){
        return tope==null;
    }

    public boolean push(Object dato){
        Nodo aux= new Nodo(dato,tope);
        if(aux == null){
            return false;
        }
        tope = aux;
        return true;
    }

    public Object pop(){
        if(estaVacia()){
            return null;
        }
        Object o= tope.getDato();
        tope= tope.getSiguiente();
        return o;
    }

    public Object verTope(){
        if(!estaVacia()){
            return tope.getDato();
        }
        return null;
    }
}
