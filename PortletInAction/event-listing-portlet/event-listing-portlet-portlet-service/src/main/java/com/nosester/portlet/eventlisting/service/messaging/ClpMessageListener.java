package com.nosester.portlet.eventlisting.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.nosester.portlet.eventlisting.service.ClpSerializer;
import com.nosester.portlet.eventlisting.service.EventLocalServiceUtil;
import com.nosester.portlet.eventlisting.service.EventServiceUtil;
import com.nosester.portlet.eventlisting.service.LocationLocalServiceUtil;
import com.nosester.portlet.eventlisting.service.LocationServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            EventLocalServiceUtil.clearService();

            EventServiceUtil.clearService();
            LocationLocalServiceUtil.clearService();

            LocationServiceUtil.clearService();
        }
    }
}
