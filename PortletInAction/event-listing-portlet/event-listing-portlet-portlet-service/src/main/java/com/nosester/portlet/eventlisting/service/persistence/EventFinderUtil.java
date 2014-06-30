package com.nosester.portlet.eventlisting.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class EventFinderUtil {
    private static EventFinder _finder;

    public static java.util.List<com.nosester.portlet.eventlisting.model.Event> findByEventNameEventDescriptionLocationName(
        java.lang.String eventName, java.lang.String eventDescription,
        java.lang.String locationName, int begin, int end) {
        return getFinder()
                   .findByEventNameEventDescriptionLocationName(eventName,
            eventDescription, locationName, begin, end);
    }

    public static EventFinder getFinder() {
        if (_finder == null) {
            _finder = (EventFinder) PortletBeanLocatorUtil.locate(com.nosester.portlet.eventlisting.service.ClpSerializer.getServletContextName(),
                    EventFinder.class.getName());

            ReferenceRegistry.registerReference(EventFinderUtil.class, "_finder");
        }

        return _finder;
    }

    public void setFinder(EventFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(EventFinderUtil.class, "_finder");
    }
}
