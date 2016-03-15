package code.uniandes.cupi2.biblioteca.mundo.implementacion1;


/** 
 * Clase que representa al usuario.
 */
@code.Feature(featureName = "ServicioUsuario", mandatory = true)
public class Usuario implements code.uniandes.cupi2.biblioteca.mundo.IUsuario , java.io.Serializable {
    /** 
     * Constante de serialización.
     */
    private static final long serialVersionUID = -7920037289310482998L;
    
    /** 
     * Nombre del usuario.
     */
    private java.lang.String nombre;
    
    /** 
     * Clave del usuario.
     */
    private java.lang.String clave;
    
    /** 
     * Login del usuario.
     */
    private java.lang.String login;
    
    /** 
     * Libros alquilados por el usuario.
     */
    @code.OptionFeature(featureName = "LibrosAlquilados", mandatory = true)
    private uniandes.cupi2.collections.lista.Lista<code.uniandes.cupi2.biblioteca.mundo.ILibro>  librosAlquilados;
    
    /** 
     * Construye un nuevo usuario.
     * @param login Login del usuario - login != null.
     * @param clave Clave del usuario - clave != null.
     * @param nombre Nombre del usuario - nombre != null.
     */
    public Usuario(java.lang.String login ,java.lang.String clave ,java.lang.String nombre) {
        this.nombre = nombre;
        this.clave = clave;
        this.login = login;
        librosAlquilados = new uniandes.cupi2.collections.lista.Lista<code.uniandes.cupi2.biblioteca.mundo.ILibro> ();
    }
    
    @code.OptionFeature(featureName = "AlquilarLibro", mandatory = true)
    public void alquilar(code.uniandes.cupi2.biblioteca.mundo.ILibro libro) {
        librosAlquilados.agregar(libro);
    }
    
    public void devolver(code.uniandes.cupi2.biblioteca.mundo.ILibro libro) {
        librosAlquilados.eliminar(libro);
    }
    
    public java.lang.String darNombre() {
        return nombre;
    }
    
    public java.lang.String darLogin() {
        return login;
    }
    
    public java.lang.String darClave() {
        return clave;
    }
    
    public uniandes.cupi2.collections.iterador.Iterador<code.uniandes.cupi2.biblioteca.mundo.ILibro>  darLibrosAlquilados() {
        return librosAlquilados.darIterador();
    }
    
    public void asignarLibrosAlquilados(uniandes.cupi2.collections.lista.Lista<code.uniandes.cupi2.biblioteca.mundo.ILibro>  nLibrosAlquilados) {
        librosAlquilados = nLibrosAlquilados;
    }
    
}

