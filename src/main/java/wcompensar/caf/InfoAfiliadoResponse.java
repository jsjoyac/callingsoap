
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
 *         &lt;element name="InfoAfiliadoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "infoAfiliadoResult"
})
@XmlRootElement(name = "InfoAfiliadoResponse")
public class InfoAfiliadoResponse {

    @XmlElement(name = "InfoAfiliadoResult")
    protected String infoAfiliadoResult;

    /**
     * Gets the value of the infoAfiliadoResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoAfiliadoResult() {
        return infoAfiliadoResult;
    }

    /**
     * Sets the value of the infoAfiliadoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoAfiliadoResult(String value) {
        this.infoAfiliadoResult = value;
    }

}
