
package caf.wcompensar;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the caf.wcompensar package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: caf.wcompensar
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarUsuarioResponse }
     * 
     */
    public ConsultarUsuarioResponse createConsultarUsuarioResponse() {
        return new ConsultarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ConsultarUsuarioResponse.Afiliado }
     * 
     */
    public ConsultarUsuarioResponse.Afiliado createConsultarUsuarioResponseAfiliado() {
        return new ConsultarUsuarioResponse.Afiliado();
    }

    /**
     * Create an instance of {@link ConsultarUsuarioRequest }
     * 
     */
    public ConsultarUsuarioRequest createConsultarUsuarioRequest() {
        return new ConsultarUsuarioRequest();
    }

    /**
     * Create an instance of {@link ConsultarUsuarioResponse.Error }
     * 
     */
    public ConsultarUsuarioResponse.Error createConsultarUsuarioResponseError() {
        return new ConsultarUsuarioResponse.Error();
    }

    /**
     * Create an instance of {@link ConsultarUsuarioResponse.Afiliado.Table }
     * 
     */
    public ConsultarUsuarioResponse.Afiliado.Table createConsultarUsuarioResponseAfiliadoTable() {
        return new ConsultarUsuarioResponse.Afiliado.Table();
    }

}
