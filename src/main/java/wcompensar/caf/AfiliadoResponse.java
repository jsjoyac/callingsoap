
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
 *         &lt;element name="AfiliadoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "afiliadoResult"
})
@XmlRootElement(name = "AfiliadoResponse")
public class AfiliadoResponse {

    @XmlElement(name = "AfiliadoResult")
    protected String afiliadoResult;

    /**
     * Gets the value of the afiliadoResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfiliadoResult() {
        return afiliadoResult;
    }

    /**
     * Sets the value of the afiliadoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfiliadoResult(String value) {
        this.afiliadoResult = value;
    }

}
