
package wcompensar.caf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sParametros" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sParametros"
})
@XmlRootElement(name = "Consultas")
public class Consultas {

    protected String sParametros;

    /**
     * Gets the value of the sParametros property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSParametros() {
        return sParametros;
    }

    /**
     * Sets the value of the sParametros property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSParametros(String value) {
        this.sParametros = value;
    }

}
