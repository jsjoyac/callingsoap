
package caf.wcompensar;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for T4_XGENCLI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="T4_XGENCLI"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "T4_XGENCLI")
@XmlEnum
public enum T4XGENCLI {

    F,
    M;

    public String value() {
        return name();
    }

    public static T4XGENCLI fromValue(String v) {
        return valueOf(v);
    }

}
