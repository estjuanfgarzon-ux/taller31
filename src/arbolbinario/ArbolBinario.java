
package arbolbinario;

public class ArbolBinario {


    // Clase Nodo
    static class Nodo {
        int valor;
        Nodo izquierdo;
        Nodo derecho;

        public Nodo(int valor) {
            this.valor = valor;
            this.izquierdo = null;
            this.derecho = null;
        }
    }

    Nodo raiz;

    // Insertar (tipo árbol binario de búsqueda)
    public Nodo insertar(Nodo raiz, int valor) {
        if (raiz == null) {
            return new Nodo(valor);
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertar(raiz.izquierdo, valor);
        } else {
            raiz.derecho = insertar(raiz.derecho, valor);
        }

        return raiz;
    }

    // Recorrido Inorden (izq - raiz - der)
    public void inorden(Nodo raiz) {
        if (raiz != null) {
            inorden(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            inorden(raiz.derecho);
        }
    }

    // Método principal
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        arbol.raiz = arbol.insertar(arbol.raiz, 8);
        arbol.raiz = arbol.insertar(arbol.raiz, 3);
        arbol.raiz = arbol.insertar(arbol.raiz, 10);
        arbol.raiz = arbol.insertar(arbol.raiz, 1);
        arbol.raiz = arbol.insertar(arbol.raiz, 6);

        System.out.println("Recorrido Inorden:");
        arbol.inorden(arbol.raiz);
    }
}
    

