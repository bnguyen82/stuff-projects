package com.nosester.portlet.eventlisting.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.nosester.portlet.eventlisting.model.Location;
import com.nosester.portlet.eventlisting.service.LocationLocalServiceUtil;

/**
 * @author Bao Nguyen
 * @generated
 */
public abstract class LocationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LocationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LocationLocalServiceUtil.getService());
        setClass(Location.class);

        setClassLoader(com.nosester.portlet.eventlisting.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("locationId");
    }
}
