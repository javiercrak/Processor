package code.uniandes.cupi2.biblioteca.mundo.implementacion1;


/** 
 * Clase usada para indexar los libros.
 */
public class NodoIndice implements java.lang.Comparable<code.uniandes.cupi2.biblioteca.mundo.implementacion1.NodoIndice> {
    /** 
     * Llave del nodo.
     */
    private java.lang.String llave;
    
    /** 
     * Lista de libros que est�n identificados con la llave del nodo.
     */
    private uniandes.cupi2.collections.lista.Lista<code.uniandes.cupi2.biblioteca.mundo.ILibro>  libros;
    
    /** 
     * Constructor del nodo.
     * @param nLlave Llave del nodo.
     */
    public NodoIndice(java.lang.String nLlave) {
        llave = nLlave;
        libros = new uniandes.cupi2.collections.lista.Lista<code.uniandes.cupi2.biblioteca.mundo.ILibro> ();
    }
    
    /** 
     * Retorna la llave del nodo.
     * @return la llave del nodo.
     */
    public java.lang.String darLlave() {
        return llave;
    }
    
    /** 
     * M�todo donde se comparan las llaves de los nodos.
     * @param nodo Nodo con la llave que se quiere comparar.
     */
    public int compareTo(code.uniandes.cupi2.biblioteca.mundo.implementacion1.NodoIndice nodo) {
        java.lang.String llave = ((code.uniandes.cupi2.biblioteca.mundo.implementacion1.NodoIndice)(nodo)).darLlave();
        return this.llave.compareTo(((java.lang.String)(llave)));
    }
    
    /** 
     * Agrega un libro al nodo.
     * @param libro Libro que se va a agregar al nodo - libro != null.
     */
    public void agregarLibro(code.uniandes.cupi2.biblioteca.mundo.ILibro libro) {
        libros.agregar(libro);
    }
    
    /** 
     * Retorna los libros del nodo.
     * @return Los libros del nodo.
     */
    public uniandes.cupi2.collections.iterador.Iterador<code.uniandes.cupi2.biblioteca.mundo.ILibro>  darLibros() {
        return libros.darIterador();
    }
    
}

