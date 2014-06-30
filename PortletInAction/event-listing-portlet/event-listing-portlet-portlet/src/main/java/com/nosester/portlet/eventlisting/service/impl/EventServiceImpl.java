package com.nosester.portlet.eventlisting.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.nosester.portlet.eventlisting.model.Event;
import com.nosester.portlet.eventlisting.service.EventLocalServiceUtil;
import com.nosester.portlet.eventlisting.service.base.EventServiceBaseImpl;

/**
 * The implementation of the event remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.nosester.portlet.eventlisting.service.EventService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Bao Nguyen
 * @see com.nosester.portlet.eventlisting.service.base.EventServiceBaseImpl
 * @see com.nosester.portlet.eventlisting.service.EventServiceUtil
 */
public class EventServiceImpl extends EventServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.nosester.portlet.eventlisting.service.EventServiceUtil} to access the event remote service.
     */
//	public Event addEvent(
//		       long groupId, String name, String description,
//		       int month, int day, int year, int hour, int minute, long locationId,
//		       ServiceContext serviceContext)
//		    throws PortalException, SystemException {
//
//		    EventListingPermission.check(
//		       getPermissionChecker(), groupId, EventListingActionKeys.ADD_EVENT);
//
//		    return EventLocalServiceUtil.addEvent(
//		       getUserId(), groupId, name, description, month, day, year, hour,
//		       minute, locationId, serviceContext);
//		}
//
//	public Event deleteEvent(long eventId)
//	    throws PortalException, SystemException {
//
//	    EventPermission.check(getPermissionChecker(), eventId,
//	       EventListingActionKeys.DELETE_EVENT);
//
//	    return eventLocalService.deleteEvent(eventId);
//	}
//
//	public Event getEvent(long eventId)
//	    throws PortalException, SystemException {
//
//	    EventPermission.check(getPermissionChecker(), eventId,
//	       EventListingActionKeys.VIEW);
//
//	    return EventLocalServiceUtil.getEvent(eventId);
//	}
//
//	public Event updateEvent(
//	       long userId, long eventId, String name, String description,
//	       int month, int day, int year, int hour, int minute, long locationId,
//	       ServiceContext serviceContext)
//	    throws PortalException, SystemException {
//
//	    EventPermission.check(getPermissionChecker(), eventId,
//	       EventListingActionKeys.UPDATE_EVENT);
//
//	    return EventLocalServiceUtil.updateEvent(
//	       userId, eventId, name, description, month, day, year, hour, minute,
//	       locationId, serviceContext);
//	}	
}
