//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.28 at 10:35:45 AM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APCreditCardOperationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="APCreditCardOperationEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Charge"/&gt;
 *     &lt;enumeration value="Credit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "APCreditCardOperationEnum")
@XmlEnum
public enum APCreditCardOperationEnum {

    @XmlEnumValue("Charge")
    CHARGE("Charge"),
    @XmlEnumValue("Credit")
    CREDIT("Credit");
    private final String value;

    APCreditCardOperationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static APCreditCardOperationEnum fromValue(String v) {
        for (APCreditCardOperationEnum c: APCreditCardOperationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
