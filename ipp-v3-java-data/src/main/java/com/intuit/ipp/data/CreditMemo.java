//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.28 at 10:35:45 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Financial transaction representing a refund (or
 * 				credit) of payment or part of a payment for goods or services that
 * 				have been sold.
 * 
 * <p>Java class for CreditMemo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditMemo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}SalesTransaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RemainingCredit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="CreditMemoEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditMemo", propOrder = {
    "remainingCredit",
    "invoiceRef",
    "creditMemoEx"
})
public class CreditMemo
    extends SalesTransaction
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RemainingCredit")
    protected BigDecimal remainingCredit;
    @XmlElement(name = "InvoiceRef")
    protected ReferenceType invoiceRef;
    @XmlElement(name = "CreditMemoEx")
    protected IntuitAnyType creditMemoEx;

    /**
     * Gets the value of the remainingCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingCredit() {
        return remainingCredit;
    }

    /**
     * Sets the value of the remainingCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingCredit(BigDecimal value) {
        this.remainingCredit = value;
    }

    /**
     * Gets the value of the invoiceRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getInvoiceRef() {
        return invoiceRef;
    }

    /**
     * Sets the value of the invoiceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setInvoiceRef(ReferenceType value) {
        this.invoiceRef = value;
    }

    /**
     * Gets the value of the creditMemoEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getCreditMemoEx() {
        return creditMemoEx;
    }

    /**
     * Sets the value of the creditMemoEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setCreditMemoEx(IntuitAnyType value) {
        this.creditMemoEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CreditMemo that = ((CreditMemo) object);
        {
            BigDecimal lhsRemainingCredit;
            lhsRemainingCredit = this.getRemainingCredit();
            BigDecimal rhsRemainingCredit;
            rhsRemainingCredit = that.getRemainingCredit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remainingCredit", lhsRemainingCredit), LocatorUtils.property(thatLocator, "remainingCredit", rhsRemainingCredit), lhsRemainingCredit, rhsRemainingCredit, (this.remainingCredit!= null), (that.remainingCredit!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsInvoiceRef;
            lhsInvoiceRef = this.getInvoiceRef();
            ReferenceType rhsInvoiceRef;
            rhsInvoiceRef = that.getInvoiceRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoiceRef", lhsInvoiceRef), LocatorUtils.property(thatLocator, "invoiceRef", rhsInvoiceRef), lhsInvoiceRef, rhsInvoiceRef, (this.invoiceRef!= null), (that.invoiceRef!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsCreditMemoEx;
            lhsCreditMemoEx = this.getCreditMemoEx();
            IntuitAnyType rhsCreditMemoEx;
            rhsCreditMemoEx = that.getCreditMemoEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditMemoEx", lhsCreditMemoEx), LocatorUtils.property(thatLocator, "creditMemoEx", rhsCreditMemoEx), lhsCreditMemoEx, rhsCreditMemoEx, (this.creditMemoEx!= null), (that.creditMemoEx!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            BigDecimal theRemainingCredit;
            theRemainingCredit = this.getRemainingCredit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remainingCredit", theRemainingCredit), currentHashCode, theRemainingCredit, (this.remainingCredit!= null));
        }
        {
            ReferenceType theInvoiceRef;
            theInvoiceRef = this.getInvoiceRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoiceRef", theInvoiceRef), currentHashCode, theInvoiceRef, (this.invoiceRef!= null));
        }
        {
            IntuitAnyType theCreditMemoEx;
            theCreditMemoEx = this.getCreditMemoEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditMemoEx", theCreditMemoEx), currentHashCode, theCreditMemoEx, (this.creditMemoEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
