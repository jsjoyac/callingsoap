
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
 *         &lt;element name="dIdentificacion" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="iTipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="iDep" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sPrograma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iOpc" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "iDep",
    "sPrograma",
    "iOpc"
})
@XmlRootElement(name = "Empresa")
public class Empresa {

    protected String sApl;
    protected double dIdentificacion;
    protected int iTipo;
    protected int iDep;
    protected String sPrograma;
    protected int iOpc;

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
     */
    public double getDIdentificacion() {
        return dIdentificacion;
    }

    /**
     * Sets the value of the dIdentificacion property.
     * 
     */
    public void setDIdentificacion(double value) {
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
     * Gets the value of the iDep property.
     * 
     */
    public int getIDep() {
        return iDep;
    }

    /**
     * Sets the value of the iDep property.
     * 
     */
    public void setIDep(int value) {
        this.iDep = value;
    }

    /**
     * Gets the value of the sPrograma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPrograma() {
        return sPrograma;
    }

    /**
     * Sets the value of the sPrograma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPrograma(String value) {
        this.sPrograma = value;
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

}
