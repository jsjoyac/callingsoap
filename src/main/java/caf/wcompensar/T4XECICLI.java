
package caf.wcompensar;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T4_XECICLI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="T4_XECICLI"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SO"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="VI"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="UL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "T4_XECICLI")
@XmlEnum
public enum T4XECICLI {

    SO,
    CA,
    VI,
    SE,
    UL;

    public String value() {
        return name();
    }

    public static T4XECICLI fromValue(String v) {
        return valueOf(v);
    }

}
