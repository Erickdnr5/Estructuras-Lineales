package Lista;

public class Principal {
    public static void main(String[] args) {
        {
            ListaDoble miLista=new ListaDoble();
            miLista.agregandoAlFinal("1");
            miLista.agregandoAlFinal("34");
            miLista.agregandoAlFinal("56");
            miLista.agregandoAlFinal("75 av");
            miLista.agregandoAlFinal("97");
            miLista.mostrarLista();

            if(miLista.estaVacia())
            {
                System.out.println("La lista esta vacia");
            }
            else
            {
                System.out.println("La lista no esta vacia");
            }
                System.out.println("Cantidad de nodos en la lista:" + "   " + miLista.cantidadNodos());
        }

    }
}
