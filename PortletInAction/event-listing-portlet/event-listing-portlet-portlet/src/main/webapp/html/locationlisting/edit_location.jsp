<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%@ page import="com.nosester.portlet.eventlisting.model.Location"%>
<%@ page import="com.nosester.portlet.eventlisting.service.LocationLocalServiceUtil"%>

<%
    Location location = null;

    long locationId = ParamUtil.getLong(request, "locationId");

    if (locationId > 0) {
        location = LocationLocalServiceUtil.getLocation(locationId);
    }

    String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= location %>" model="<%= Location.class %>" />
<portlet:renderURL var="viewLocationURL" />
<portlet:actionURL name='<%= location == null ? "addLocation" : "updateLocation" %>' var="editLocationURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewLocationURL %>"
    title='<%= (location != null) ? location.getName() : "New Location" %>'
/>

<aui:form action="<%= editLocationURL %>" method="POST" name="fm">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />

        <aui:input name="locationId" type="hidden" value='<%= location == null ? "" : location.getLocationId() %>'/>

        <aui:input name="name" />

        <aui:input name="description" />

        <aui:input name="streetAddress" />

        <aui:input name="city" />

        <aui:input name="stateOrProvince" />

        <aui:input name="country" />

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />

        <aui:button onClick="<%= viewLocationURL %>"  type="cancel" />
    </aui:button-row>
</aui:form>