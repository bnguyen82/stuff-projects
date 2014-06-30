package com.nosester.portlet.eventlisting.service.persistence;

public interface EventFinder {
    public java.util.List<com.nosester.portlet.eventlisting.model.Event> findByEventNameEventDescriptionLocationName(
        java.lang.String eventName, java.lang.String eventDescription,
        java.lang.String locationName, int begin, int end);
}
