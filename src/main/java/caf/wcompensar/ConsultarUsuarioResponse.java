
package caf.wcompensar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Afiliado" minOccurs="0" form="unqualified"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Table" maxOccurs="unbounded" form="unqualified"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CODEPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="NIDECLI" type="{http://www.w3.org/2001/XMLSchema}long" form="unqualified"/&gt;
 *                             &lt;element name="TIDECLI" type="{http://www.w3.org/2001/XMLSchema}int" form="unqualified"/&gt;
 *                             &lt;element name="XPRIAPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XSEGAPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XNOMCLI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XRAZSEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="NTELCLI" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XNUIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XCIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="CESTVIN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="FVIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="FINIAFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="FFINAFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="FRET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XVIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="NIDECLIEMP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="TIDECLIEMP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="NTELCLIEMP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XCIUEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XDIREMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XCATVIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="NSUCCLI" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="FNACCLI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="VVIN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="NAUTCLI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XGENCLI" type="{http:/wcompensar.caf/}T4_XGENCLI" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XECICLI" type="{http:/wcompensar.caf/}T4_XECICLI" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="CCIU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XRAZSEGEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="PERCONALF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="CENTASO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XPRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="QVIN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="FULTNOV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="TELDOS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="NIDECLITR" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="TIDECLITR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="AFISSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="EPSANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="CPRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XPRIAPETR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XSEGAPETR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XNOMCLITR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                             &lt;element name="XRAZSEGTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Error" minOccurs="0" form="unqualified"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CODIGO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
 *                   &lt;element name="MENSAJE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "afiliado",
    "error"
})
@XmlRootElement(name = "ConsultarUsuarioResponse")
public class ConsultarUsuarioResponse {

    @XmlElement(name = "Afiliado")
    protected ConsultarUsuarioResponse.Afiliado afiliado;
    @XmlElement(name = "Error")
    protected ConsultarUsuarioResponse.Error error;

    /**
     * Gets the value of the afiliado property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarUsuarioResponse.Afiliado }
     *     
     */
    public ConsultarUsuarioResponse.Afiliado getAfiliado() {
        return afiliado;
    }

    /**
     * Sets the value of the afiliado property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarUsuarioResponse.Afiliado }
     *     
     */
    public void setAfiliado(ConsultarUsuarioResponse.Afiliado value) {
        this.afiliado = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarUsuarioResponse.Error }
     *     
     */
    public ConsultarUsuarioResponse.Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarUsuarioResponse.Error }
     *     
     */
    public void setError(ConsultarUsuarioResponse.Error value) {
        this.error = value;
    }


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
     *         &lt;element name="Table" maxOccurs="unbounded" form="unqualified"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CODEPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="NIDECLI" type="{http://www.w3.org/2001/XMLSchema}long" form="unqualified"/&gt;
     *                   &lt;element name="TIDECLI" type="{http://www.w3.org/2001/XMLSchema}int" form="unqualified"/&gt;
     *                   &lt;element name="XPRIAPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XSEGAPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XNOMCLI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XRAZSEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="NTELCLI" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XNUIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XCIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="CESTVIN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="FVIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="FINIAFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="FFINAFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="FRET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XVIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="NIDECLIEMP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="TIDECLIEMP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="NTELCLIEMP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XCIUEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XDIREMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XCATVIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="NSUCCLI" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="FNACCLI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="VVIN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="NAUTCLI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XGENCLI" type="{http:/wcompensar.caf/}T4_XGENCLI" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XECICLI" type="{http:/wcompensar.caf/}T4_XECICLI" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="CCIU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XRAZSEGEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="PERCONALF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="CENTASO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XPRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="QVIN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="FULTNOV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="TELDOS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="NIDECLITR" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="TIDECLITR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="AFISSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="EPSANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="CPRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XPRIAPETR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XSEGAPETR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XNOMCLITR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                   &lt;element name="XRAZSEGTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "table"
    })
    public static class Afiliado {

        @XmlElement(name = "Table", required = true)
        protected List<ConsultarUsuarioResponse.Afiliado.Table> table;

        /**
         * Gets the value of the table property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the table property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTable().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConsultarUsuarioResponse.Afiliado.Table }
         * 
         * 
         */
        public List<ConsultarUsuarioResponse.Afiliado.Table> getTable() {
            if (table == null) {
                table = new ArrayList<ConsultarUsuarioResponse.Afiliado.Table>();
            }
            return this.table;
        }


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
         *         &lt;element name="CODEPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="NIDECLI" type="{http://www.w3.org/2001/XMLSchema}long" form="unqualified"/&gt;
         *         &lt;element name="TIDECLI" type="{http://www.w3.org/2001/XMLSchema}int" form="unqualified"/&gt;
         *         &lt;element name="XPRIAPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XSEGAPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XNOMCLI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XRAZSEG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="NTELCLI" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XNUIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XCIU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XDIR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="CESTVIN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="FVIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="FINIAFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="FFINAFI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="FRET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XVIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="NIDECLIEMP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="TIDECLIEMP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="NTELCLIEMP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XCIUEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XDIREMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XCATVIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="NSUCCLI" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="FNACCLI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="VVIN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="NAUTCLI" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XGENCLI" type="{http:/wcompensar.caf/}T4_XGENCLI" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XECICLI" type="{http:/wcompensar.caf/}T4_XECICLI" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="CCIU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XRAZSEGEMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="PERCONALF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="CENTASO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XPRG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="QVIN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="FULTNOV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="TELDOS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="NIDECLITR" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="TIDECLITR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="AFISSS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="EPSANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="CPRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XPRIAPETR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XSEGAPETR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XNOMCLITR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
         *         &lt;element name="XRAZSEGTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
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
            "codeps",
            "nidecli",
            "tidecli",
            "xpriape",
            "xsegape",
            "xnomcli",
            "xrazseg",
            "ntelcli",
            "xnuip",
            "xciu",
            "xdir",
            "cestvin",
            "fvin",
            "finiafi",
            "ffinafi",
            "fret",
            "xvin",
            "nidecliemp",
            "tidecliemp",
            "ntelcliemp",
            "xciuemp",
            "xdiremp",
            "xcatvin",
            "nsuccli",
            "fnaccli",
            "vvin",
            "nautcli",
            "xgencli",
            "xecicli",
            "cciu",
            "xrazsegemp",
            "perconalf",
            "centaso",
            "xprg",
            "qvin",
            "fultnov",
            "teldos",
            "nideclitr",
            "tideclitr",
            "afisss",
            "epsant",
            "cprn",
            "xpriapetr",
            "xsegapetr",
            "xnomclitr",
            "xrazsegtr"
        })
        public static class Table {

            @XmlElement(name = "CODEPS")
            protected String codeps;
            @XmlElement(name = "NIDECLI")
            protected long nidecli;
            @XmlElement(name = "TIDECLI")
            protected int tidecli;
            @XmlElement(name = "XPRIAPE")
            protected String xpriape;
            @XmlElement(name = "XSEGAPE")
            protected String xsegape;
            @XmlElement(name = "XNOMCLI")
            protected String xnomcli;
            @XmlElement(name = "XRAZSEG")
            protected String xrazseg;
            @XmlElement(name = "NTELCLI")
            protected Long ntelcli;
            @XmlElement(name = "XNUIP")
            protected String xnuip;
            @XmlElement(name = "XCIU")
            protected String xciu;
            @XmlElement(name = "XDIR")
            protected String xdir;
            @XmlElement(name = "CESTVIN")
            protected Integer cestvin;
            @XmlElement(name = "FVIN")
            protected String fvin;
            @XmlElement(name = "FINIAFI")
            protected String finiafi;
            @XmlElement(name = "FFINAFI")
            protected String ffinafi;
            @XmlElement(name = "FRET")
            protected String fret;
            @XmlElement(name = "XVIN")
            protected String xvin;
            @XmlElement(name = "NIDECLIEMP")
            protected Long nidecliemp;
            @XmlElement(name = "TIDECLIEMP")
            protected Integer tidecliemp;
            @XmlElement(name = "NTELCLIEMP")
            protected Long ntelcliemp;
            @XmlElement(name = "XCIUEMP")
            protected String xciuemp;
            @XmlElement(name = "XDIREMP")
            protected String xdiremp;
            @XmlElement(name = "XCATVIN")
            protected String xcatvin;
            @XmlElement(name = "NSUCCLI")
            protected Integer nsuccli;
            @XmlElement(name = "FNACCLI")
            protected String fnaccli;
            @XmlElement(name = "VVIN")
            protected BigDecimal vvin;
            @XmlElement(name = "NAUTCLI")
            protected BigDecimal nautcli;
            @XmlElement(name = "XGENCLI")
            @XmlSchemaType(name = "string")
            protected T4XGENCLI xgencli;
            @XmlElement(name = "XECICLI")
            @XmlSchemaType(name = "string")
            protected T4XECICLI xecicli;
            @XmlElement(name = "CCIU")
            protected Integer cciu;
            @XmlElement(name = "XRAZSEGEMP")
            protected String xrazsegemp;
            @XmlElement(name = "PERCONALF")
            protected String perconalf;
            @XmlElement(name = "CENTASO")
            protected Integer centaso;
            @XmlElement(name = "XPRG")
            protected String xprg;
            @XmlElement(name = "QVIN")
            protected Integer qvin;
            @XmlElement(name = "FULTNOV")
            protected String fultnov;
            @XmlElement(name = "TELDOS")
            protected Long teldos;
            @XmlElement(name = "NIDECLITR")
            protected Long nideclitr;
            @XmlElement(name = "TIDECLITR")
            protected Integer tideclitr;
            @XmlElement(name = "AFISSS")
            protected String afisss;
            @XmlElement(name = "EPSANT")
            protected String epsant;
            @XmlElement(name = "CPRN")
            protected String cprn;
            @XmlElement(name = "XPRIAPETR")
            protected String xpriapetr;
            @XmlElement(name = "XSEGAPETR")
            protected String xsegapetr;
            @XmlElement(name = "XNOMCLITR")
            protected String xnomclitr;
            @XmlElement(name = "XRAZSEGTR")
            protected String xrazsegtr;

            /**
             * Gets the value of the codeps property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCODEPS() {
                return codeps;
            }

            /**
             * Sets the value of the codeps property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCODEPS(String value) {
                this.codeps = value;
            }

            /**
             * Gets the value of the nidecli property.
             * 
             */
            public long getNIDECLI() {
                return nidecli;
            }

            /**
             * Sets the value of the nidecli property.
             * 
             */
            public void setNIDECLI(long value) {
                this.nidecli = value;
            }

            /**
             * Gets the value of the tidecli property.
             * 
             */
            public int getTIDECLI() {
                return tidecli;
            }

            /**
             * Sets the value of the tidecli property.
             * 
             */
            public void setTIDECLI(int value) {
                this.tidecli = value;
            }

            /**
             * Gets the value of the xpriape property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXPRIAPE() {
                return xpriape;
            }

            /**
             * Sets the value of the xpriape property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXPRIAPE(String value) {
                this.xpriape = value;
            }

            /**
             * Gets the value of the xsegape property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXSEGAPE() {
                return xsegape;
            }

            /**
             * Sets the value of the xsegape property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXSEGAPE(String value) {
                this.xsegape = value;
            }

            /**
             * Gets the value of the xnomcli property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNOMCLI() {
                return xnomcli;
            }

            /**
             * Sets the value of the xnomcli property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNOMCLI(String value) {
                this.xnomcli = value;
            }

            /**
             * Gets the value of the xrazseg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXRAZSEG() {
                return xrazseg;
            }

            /**
             * Sets the value of the xrazseg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXRAZSEG(String value) {
                this.xrazseg = value;
            }

            /**
             * Gets the value of the ntelcli property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getNTELCLI() {
                return ntelcli;
            }

            /**
             * Sets the value of the ntelcli property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setNTELCLI(Long value) {
                this.ntelcli = value;
            }

            /**
             * Gets the value of the xnuip property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNUIP() {
                return xnuip;
            }

            /**
             * Sets the value of the xnuip property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNUIP(String value) {
                this.xnuip = value;
            }

            /**
             * Gets the value of the xciu property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXCIU() {
                return xciu;
            }

            /**
             * Sets the value of the xciu property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXCIU(String value) {
                this.xciu = value;
            }

            /**
             * Gets the value of the xdir property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXDIR() {
                return xdir;
            }

            /**
             * Sets the value of the xdir property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXDIR(String value) {
                this.xdir = value;
            }

            /**
             * Gets the value of the cestvin property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCESTVIN() {
                return cestvin;
            }

            /**
             * Sets the value of the cestvin property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCESTVIN(Integer value) {
                this.cestvin = value;
            }

            /**
             * Gets the value of the fvin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFVIN() {
                return fvin;
            }

            /**
             * Sets the value of the fvin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFVIN(String value) {
                this.fvin = value;
            }

            /**
             * Gets the value of the finiafi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFINIAFI() {
                return finiafi;
            }

            /**
             * Sets the value of the finiafi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFINIAFI(String value) {
                this.finiafi = value;
            }

            /**
             * Gets the value of the ffinafi property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFFINAFI() {
                return ffinafi;
            }

            /**
             * Sets the value of the ffinafi property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFFINAFI(String value) {
                this.ffinafi = value;
            }

            /**
             * Gets the value of the fret property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFRET() {
                return fret;
            }

            /**
             * Sets the value of the fret property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFRET(String value) {
                this.fret = value;
            }

            /**
             * Gets the value of the xvin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXVIN() {
                return xvin;
            }

            /**
             * Sets the value of the xvin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXVIN(String value) {
                this.xvin = value;
            }

            /**
             * Gets the value of the nidecliemp property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getNIDECLIEMP() {
                return nidecliemp;
            }

            /**
             * Sets the value of the nidecliemp property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setNIDECLIEMP(Long value) {
                this.nidecliemp = value;
            }

            /**
             * Gets the value of the tidecliemp property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTIDECLIEMP() {
                return tidecliemp;
            }

            /**
             * Sets the value of the tidecliemp property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTIDECLIEMP(Integer value) {
                this.tidecliemp = value;
            }

            /**
             * Gets the value of the ntelcliemp property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getNTELCLIEMP() {
                return ntelcliemp;
            }

            /**
             * Sets the value of the ntelcliemp property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setNTELCLIEMP(Long value) {
                this.ntelcliemp = value;
            }

            /**
             * Gets the value of the xciuemp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXCIUEMP() {
                return xciuemp;
            }

            /**
             * Sets the value of the xciuemp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXCIUEMP(String value) {
                this.xciuemp = value;
            }

            /**
             * Gets the value of the xdiremp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXDIREMP() {
                return xdiremp;
            }

            /**
             * Sets the value of the xdiremp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXDIREMP(String value) {
                this.xdiremp = value;
            }

            /**
             * Gets the value of the xcatvin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXCATVIN() {
                return xcatvin;
            }

            /**
             * Sets the value of the xcatvin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXCATVIN(String value) {
                this.xcatvin = value;
            }

            /**
             * Gets the value of the nsuccli property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNSUCCLI() {
                return nsuccli;
            }

            /**
             * Sets the value of the nsuccli property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNSUCCLI(Integer value) {
                this.nsuccli = value;
            }

            /**
             * Gets the value of the fnaccli property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFNACCLI() {
                return fnaccli;
            }

            /**
             * Sets the value of the fnaccli property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFNACCLI(String value) {
                this.fnaccli = value;
            }

            /**
             * Gets the value of the vvin property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVVIN() {
                return vvin;
            }

            /**
             * Sets the value of the vvin property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVVIN(BigDecimal value) {
                this.vvin = value;
            }

            /**
             * Gets the value of the nautcli property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNAUTCLI() {
                return nautcli;
            }

            /**
             * Sets the value of the nautcli property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNAUTCLI(BigDecimal value) {
                this.nautcli = value;
            }

            /**
             * Gets the value of the xgencli property.
             * 
             * @return
             *     possible object is
             *     {@link T4XGENCLI }
             *     
             */
            public T4XGENCLI getXGENCLI() {
                return xgencli;
            }

            /**
             * Sets the value of the xgencli property.
             * 
             * @param value
             *     allowed object is
             *     {@link T4XGENCLI }
             *     
             */
            public void setXGENCLI(T4XGENCLI value) {
                this.xgencli = value;
            }

            /**
             * Gets the value of the xecicli property.
             * 
             * @return
             *     possible object is
             *     {@link T4XECICLI }
             *     
             */
            public T4XECICLI getXECICLI() {
                return xecicli;
            }

            /**
             * Sets the value of the xecicli property.
             * 
             * @param value
             *     allowed object is
             *     {@link T4XECICLI }
             *     
             */
            public void setXECICLI(T4XECICLI value) {
                this.xecicli = value;
            }

            /**
             * Gets the value of the cciu property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCCIU() {
                return cciu;
            }

            /**
             * Sets the value of the cciu property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCCIU(Integer value) {
                this.cciu = value;
            }

            /**
             * Gets the value of the xrazsegemp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXRAZSEGEMP() {
                return xrazsegemp;
            }

            /**
             * Sets the value of the xrazsegemp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXRAZSEGEMP(String value) {
                this.xrazsegemp = value;
            }

            /**
             * Gets the value of the perconalf property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPERCONALF() {
                return perconalf;
            }

            /**
             * Sets the value of the perconalf property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPERCONALF(String value) {
                this.perconalf = value;
            }

            /**
             * Gets the value of the centaso property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCENTASO() {
                return centaso;
            }

            /**
             * Sets the value of the centaso property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCENTASO(Integer value) {
                this.centaso = value;
            }

            /**
             * Gets the value of the xprg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXPRG() {
                return xprg;
            }

            /**
             * Sets the value of the xprg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXPRG(String value) {
                this.xprg = value;
            }

            /**
             * Gets the value of the qvin property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getQVIN() {
                return qvin;
            }

            /**
             * Sets the value of the qvin property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setQVIN(Integer value) {
                this.qvin = value;
            }

            /**
             * Gets the value of the fultnov property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFULTNOV() {
                return fultnov;
            }

            /**
             * Sets the value of the fultnov property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFULTNOV(String value) {
                this.fultnov = value;
            }

            /**
             * Gets the value of the teldos property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getTELDOS() {
                return teldos;
            }

            /**
             * Sets the value of the teldos property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setTELDOS(Long value) {
                this.teldos = value;
            }

            /**
             * Gets the value of the nideclitr property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getNIDECLITR() {
                return nideclitr;
            }

            /**
             * Sets the value of the nideclitr property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setNIDECLITR(Long value) {
                this.nideclitr = value;
            }

            /**
             * Gets the value of the tideclitr property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTIDECLITR() {
                return tideclitr;
            }

            /**
             * Sets the value of the tideclitr property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTIDECLITR(Integer value) {
                this.tideclitr = value;
            }

            /**
             * Gets the value of the afisss property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAFISSS() {
                return afisss;
            }

            /**
             * Sets the value of the afisss property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAFISSS(String value) {
                this.afisss = value;
            }

            /**
             * Gets the value of the epsant property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEPSANT() {
                return epsant;
            }

            /**
             * Sets the value of the epsant property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEPSANT(String value) {
                this.epsant = value;
            }

            /**
             * Gets the value of the cprn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCPRN() {
                return cprn;
            }

            /**
             * Sets the value of the cprn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCPRN(String value) {
                this.cprn = value;
            }

            /**
             * Gets the value of the xpriapetr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXPRIAPETR() {
                return xpriapetr;
            }

            /**
             * Sets the value of the xpriapetr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXPRIAPETR(String value) {
                this.xpriapetr = value;
            }

            /**
             * Gets the value of the xsegapetr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXSEGAPETR() {
                return xsegapetr;
            }

            /**
             * Sets the value of the xsegapetr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXSEGAPETR(String value) {
                this.xsegapetr = value;
            }

            /**
             * Gets the value of the xnomclitr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXNOMCLITR() {
                return xnomclitr;
            }

            /**
             * Sets the value of the xnomclitr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXNOMCLITR(String value) {
                this.xnomclitr = value;
            }

            /**
             * Gets the value of the xrazsegtr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXRAZSEGTR() {
                return xrazsegtr;
            }

            /**
             * Sets the value of the xrazsegtr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXRAZSEGTR(String value) {
                this.xrazsegtr = value;
            }

        }

    }


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
     *         &lt;element name="CODIGO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
     *         &lt;element name="MENSAJE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
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
        "codigo",
        "mensaje"
    })
    public static class Error {

        @XmlElement(name = "CODIGO")
        protected Integer codigo;
        @XmlElement(name = "MENSAJE")
        protected String mensaje;

        /**
         * Gets the value of the codigo property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCODIGO() {
            return codigo;
        }

        /**
         * Sets the value of the codigo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCODIGO(Integer value) {
            this.codigo = value;
        }

        /**
         * Gets the value of the mensaje property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMENSAJE() {
            return mensaje;
        }

        /**
         * Sets the value of the mensaje property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMENSAJE(String value) {
            this.mensaje = value;
        }

    }

}
