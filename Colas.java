package colasprioridad;

import java.util.ArrayList;

public class Colas<T> {

    private ArrayList<T> elements;

    public Colas() {
        this.elements = new ArrayList<>();
    }

    public boolean is_empty() {
return this.elements.isEmpty();
    }
    public void enqueue(T valor){
     this.elements.add(valor);
    }
    public T dequeue(){
        if(is_empty()){
            return (T) "LA COLA ESTA BACIA!!!";
        }else{
            T aux=elements.get(0);
           elements.remove(0);
            return aux;
        }
    }
    public int tamaño(){
        return elements.size();
    }

    @Override
    public String toString() {
        for (int i=0;i<elements.size();i++){
            System.out.println  ("["+elements.get(i)+"]");
        }
        return "";
    }
    

}
