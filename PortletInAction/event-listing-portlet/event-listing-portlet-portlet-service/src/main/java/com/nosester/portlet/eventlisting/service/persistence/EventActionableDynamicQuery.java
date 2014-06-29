package com.nosester.portlet.eventlisting.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.nosester.portlet.eventlisting.model.Event;
import com.nosester.portlet.eventlisting.service.EventLocalServiceUtil;

/**
 * @author Bao Nguyen
 * @generated
 */
public abstract class EventActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EventActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EventLocalServiceUtil.getService());
        setClass(Event.class);

        setClassLoader(com.nosester.portlet.eventlisting.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("eventId");
    }
}
