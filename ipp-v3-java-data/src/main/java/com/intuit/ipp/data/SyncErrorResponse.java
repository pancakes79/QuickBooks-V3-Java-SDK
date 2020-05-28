//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.28 at 10:35:45 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 *                 Product: QBW
 *                 Description: Provides a wrapper for SyncError for Conflict API Response
 *                 Consists of list of SyncError objects
 *              
 * 
 * <p>Java class for SyncErrorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncErrorResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SyncError" type="{http://schema.intuit.com/finance/v3}SyncError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="latestUploadTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="startPosition" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncErrorResponse", propOrder = {
    "syncError"
})
public class SyncErrorResponse implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SyncError")
    protected List<SyncError> syncError;
    @XmlAttribute(name = "latestUploadTime")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date latestUploadTime;
    @XmlAttribute(name = "startPosition")
    protected Integer startPosition;
    @XmlAttribute(name = "maxResults")
    protected Integer maxResults;
    @XmlAttribute(name = "totalCount")
    protected Integer totalCount;

    /**
     * Gets the value of the syncError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the syncError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSyncError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SyncError }
     * 
     * 
     */
    public List<SyncError> getSyncError() {
        if (syncError == null) {
            syncError = new ArrayList<SyncError>();
        }
        return this.syncError;
    }

    /**
     * Gets the value of the latestUploadTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLatestUploadTime() {
        return latestUploadTime;
    }

    /**
     * Sets the value of the latestUploadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestUploadTime(Date value) {
        this.latestUploadTime = value;
    }

    /**
     * Gets the value of the startPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartPosition(Integer value) {
        this.startPosition = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

    /**
     * Sets the value of the syncError property.
     * 
     * @param syncError
     *     allowed object is
     *     {@link SyncError }
     *     
     */
    public void setSyncError(List<SyncError> syncError) {
        this.syncError = syncError;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SyncErrorResponse that = ((SyncErrorResponse) object);
        {
            List<SyncError> lhsSyncError;
            lhsSyncError = (((this.syncError!= null)&&(!this.syncError.isEmpty()))?this.getSyncError():null);
            List<SyncError> rhsSyncError;
            rhsSyncError = (((that.syncError!= null)&&(!that.syncError.isEmpty()))?that.getSyncError():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "syncError", lhsSyncError), LocatorUtils.property(thatLocator, "syncError", rhsSyncError), lhsSyncError, rhsSyncError, ((this.syncError!= null)&&(!this.syncError.isEmpty())), ((that.syncError!= null)&&(!that.syncError.isEmpty())))) {
                return false;
            }
        }
        {
            Date lhsLatestUploadTime;
            lhsLatestUploadTime = this.getLatestUploadTime();
            Date rhsLatestUploadTime;
            rhsLatestUploadTime = that.getLatestUploadTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latestUploadTime", lhsLatestUploadTime), LocatorUtils.property(thatLocator, "latestUploadTime", rhsLatestUploadTime), lhsLatestUploadTime, rhsLatestUploadTime, (this.latestUploadTime!= null), (that.latestUploadTime!= null))) {
                return false;
            }
        }
        {
            Integer lhsStartPosition;
            lhsStartPosition = this.getStartPosition();
            Integer rhsStartPosition;
            rhsStartPosition = that.getStartPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startPosition", lhsStartPosition), LocatorUtils.property(thatLocator, "startPosition", rhsStartPosition), lhsStartPosition, rhsStartPosition, (this.startPosition!= null), (that.startPosition!= null))) {
                return false;
            }
        }
        {
            Integer lhsMaxResults;
            lhsMaxResults = this.getMaxResults();
            Integer rhsMaxResults;
            rhsMaxResults = that.getMaxResults();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxResults", lhsMaxResults), LocatorUtils.property(thatLocator, "maxResults", rhsMaxResults), lhsMaxResults, rhsMaxResults, (this.maxResults!= null), (that.maxResults!= null))) {
                return false;
            }
        }
        {
            Integer lhsTotalCount;
            lhsTotalCount = this.getTotalCount();
            Integer rhsTotalCount;
            rhsTotalCount = that.getTotalCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalCount", lhsTotalCount), LocatorUtils.property(thatLocator, "totalCount", rhsTotalCount), lhsTotalCount, rhsTotalCount, (this.totalCount!= null), (that.totalCount!= null))) {
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
        int currentHashCode = 1;
        {
            List<SyncError> theSyncError;
            theSyncError = (((this.syncError!= null)&&(!this.syncError.isEmpty()))?this.getSyncError():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "syncError", theSyncError), currentHashCode, theSyncError, ((this.syncError!= null)&&(!this.syncError.isEmpty())));
        }
        {
            Date theLatestUploadTime;
            theLatestUploadTime = this.getLatestUploadTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latestUploadTime", theLatestUploadTime), currentHashCode, theLatestUploadTime, (this.latestUploadTime!= null));
        }
        {
            Integer theStartPosition;
            theStartPosition = this.getStartPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startPosition", theStartPosition), currentHashCode, theStartPosition, (this.startPosition!= null));
        }
        {
            Integer theMaxResults;
            theMaxResults = this.getMaxResults();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxResults", theMaxResults), currentHashCode, theMaxResults, (this.maxResults!= null));
        }
        {
            Integer theTotalCount;
            theTotalCount = this.getTotalCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalCount", theTotalCount), currentHashCode, theTotalCount, (this.totalCount!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
