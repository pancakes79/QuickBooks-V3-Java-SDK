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
 * <p>Java class for TaxFormTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxFormTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Form C"/&gt;
 *     &lt;enumeration value="Form F"/&gt;
 *     &lt;enumeration value="Form I"/&gt;
 *     &lt;enumeration value="Form H"/&gt;
 *     &lt;enumeration value="Form E1"/&gt;
 *     &lt;enumeration value="Form E2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxFormTypeEnum")
@XmlEnum
public enum TaxFormTypeEnum {

    @XmlEnumValue("Form C")
    FORM_C("Form C"),
    @XmlEnumValue("Form F")
    FORM_F("Form F"),
    @XmlEnumValue("Form I")
    FORM_I("Form I"),
    @XmlEnumValue("Form H")
    FORM_H("Form H"),
    @XmlEnumValue("Form E1")
    FORM_E_1("Form E1"),
    @XmlEnumValue("Form E2")
    FORM_E_2("Form E2");
    private final String value;

    TaxFormTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxFormTypeEnum fromValue(String v) {
        for (TaxFormTypeEnum c: TaxFormTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
