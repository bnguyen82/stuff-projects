package com.nosester.portlet.eventlisting.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.nosester.portlet.eventlisting.model.Location;
import com.nosester.portlet.eventlisting.service.LocationLocalServiceUtil;

/**
 * The extended model base implementation for the Location service. Represents a row in the &quot;Event_Location&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LocationImpl}.
 * </p>
 *
 * @author Bao Nguyen
 * @see LocationImpl
 * @see com.nosester.portlet.eventlisting.model.Location
 * @generated
 */
public abstract class LocationBaseImpl extends LocationModelImpl
    implements Location {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a location model instance should use the {@link Location} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LocationLocalServiceUtil.addLocation(this);
        } else {
            LocationLocalServiceUtil.updateLocation(this);
        }
    }
}
