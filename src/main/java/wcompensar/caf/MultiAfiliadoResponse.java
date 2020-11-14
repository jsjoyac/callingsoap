
package wcompensar.caf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="MultiAfiliadoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "multiAfiliadoResult"
})
@XmlRootElement(name = "MultiAfiliadoResponse")
public class MultiAfiliadoResponse {

    @XmlElement(name = "MultiAfiliadoResult")
    protected String multiAfiliadoResult;

    /**
     * Gets the value of the multiAfiliadoResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiAfiliadoResult() {
        return multiAfiliadoResult;
    }

    /**
     * Sets the value of the multiAfiliadoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiAfiliadoResult(String value) {
        this.multiAfiliadoResult = value;
    }

}
