
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
 *         &lt;element name="sApl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iTipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iOpc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sPrimerNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSegundoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sPrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "sApl",
    "dIdentificacion",
    "iTipo",
    "iOpc",
    "sPrimerNombre",
    "sSegundoNombre",
    "sPrimerApellido",
    "sSegundoApellido"
})
@XmlRootElement(name = "InfoAfiliado")
public class InfoAfiliado {

    protected String sApl;
    protected String dIdentificacion;
    protected int iTipo;
    protected int iOpc;
    protected String sPrimerNombre;
    protected String sSegundoNombre;
    protected String sPrimerApellido;
    protected String sSegundoApellido;

    /**
     * Gets the value of the sApl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSApl() {
        return sApl;
    }

    /**
     * Sets the value of the sApl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSApl(String value) {
        this.sApl = value;
    }

    /**
     * Gets the value of the dIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIdentificacion() {
        return dIdentificacion;
    }

    /**
     * Sets the value of the dIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIdentificacion(String value) {
        this.dIdentificacion = value;
    }

    /**
     * Gets the value of the iTipo property.
     * 
     */
    public int getITipo() {
        return iTipo;
    }

    /**
     * Sets the value of the iTipo property.
     * 
     */
    public void setITipo(int value) {
        this.iTipo = value;
    }

    /**
     * Gets the value of the iOpc property.
     * 
     */
    public int getIOpc() {
        return iOpc;
    }

    /**
     * Sets the value of the iOpc property.
     * 
     */
    public void setIOpc(int value) {
        this.iOpc = value;
    }

    /**
     * Gets the value of the sPrimerNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPrimerNombre() {
        return sPrimerNombre;
    }

    /**
     * Sets the value of the sPrimerNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPrimerNombre(String value) {
        this.sPrimerNombre = value;
    }

    /**
     * Gets the value of the sSegundoNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSegundoNombre() {
        return sSegundoNombre;
    }

    /**
     * Sets the value of the sSegundoNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSegundoNombre(String value) {
        this.sSegundoNombre = value;
    }

    /**
     * Gets the value of the sPrimerApellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPrimerApellido() {
        return sPrimerApellido;
    }

    /**
     * Sets the value of the sPrimerApellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPrimerApellido(String value) {
        this.sPrimerApellido = value;
    }

    /**
     * Gets the value of the sSegundoApellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSegundoApellido() {
        return sSegundoApellido;
    }

    /**
     * Sets the value of the sSegundoApellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSegundoApellido(String value) {
        this.sSegundoApellido = value;
    }

}
