
package wcompensar.caf;

import javax.xml.ws.WebFault;
import com.compensar.verticalsalud_sap.consultar.GenericFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "GenericFault", targetNamespace = "http://www.compensar.com/verticalsalud.sap/consultar.usuario/")
public class FaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private GenericFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public FaultMessage(String message, GenericFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public FaultMessage(String message, GenericFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.compensar.verticalsalud_sap.consultar.GenericFault
     */
    public GenericFault getFaultInfo() {
        return faultInfo;
    }

}
