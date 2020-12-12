package pila;

public class pilas {
    int vectorpila[];
    int cima;
    public pilas (int tamaño){
        vectorpila=new int [tamaño];
        cima=0;
    }
    //metodo insertar 
    public void insertar(int dato){
        vectorpila[cima]=dato;
        cima++;
    }
    //
    public int eliminar(){
        int eliminar=0;
        if(cima==0){
            System.out.println("la pila esta vacia");
        }else{
            eliminar=vectorpila[cima];
            cima--;
        }
        return eliminar;
        
        
    }
    public boolean vacio(){
        if (cima==0){
            return true;
        }else{
            return false;
        }
    }
    public int tamaño(){
        return vectorpila.length -1;
        
    }
}
