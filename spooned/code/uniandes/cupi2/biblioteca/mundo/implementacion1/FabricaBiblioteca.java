package code.uniandes.cupi2.biblioteca.mundo.implementacion1;


/** 
 * Fabrica que construye bibliotecas.
 */
public class FabricaBiblioteca implements code.uniandes.cupi2.biblioteca.mundo.IFabricaBiblioteca {
    public code.uniandes.cupi2.biblioteca.mundo.AbstractBiblioteca darBiblioteca(java.lang.String archivoSerializacionLibros, java.lang.String archivoSerializacionUsuarios) {
        return new code.uniandes.cupi2.biblioteca.mundo.implementacion1.Biblioteca(archivoSerializacionLibros , archivoSerializacionUsuarios);
    }
    
}

