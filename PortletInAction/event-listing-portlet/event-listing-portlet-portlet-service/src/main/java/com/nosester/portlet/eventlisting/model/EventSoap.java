package com.nosester.portlet.eventlisting.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.nosester.portlet.eventlisting.service.http.EventServiceSoap}.
 *
 * @author Bao Nguyen
 * @see com.nosester.portlet.eventlisting.service.http.EventServiceSoap
 * @generated
 */
public class EventSoap implements Serializable {
    private long _eventId;
    private String _name;
    private String _description;
    private Date _date;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;
    private long _locationId;

    public EventSoap() {
    }

    public static EventSoap toSoapModel(Event model) {
        EventSoap soapModel = new EventSoap();

        soapModel.setEventId(model.getEventId());
        soapModel.setName(model.getName());
        soapModel.setDescription(model.getDescription());
        soapModel.setDate(model.getDate());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setLocationId(model.getLocationId());

        return soapModel;
    }

    public static EventSoap[] toSoapModels(Event[] models) {
        EventSoap[] soapModels = new EventSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EventSoap[][] toSoapModels(Event[][] models) {
        EventSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EventSoap[models.length][models[0].length];
        } else {
            soapModels = new EventSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EventSoap[] toSoapModels(List<Event> models) {
        List<EventSoap> soapModels = new ArrayList<EventSoap>(models.size());

        for (Event model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EventSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _eventId;
    }

    public void setPrimaryKey(long pk) {
        setEventId(pk);
    }

    public long getEventId() {
        return _eventId;
    }

    public void setEventId(long eventId) {
        _eventId = eventId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public Date getDate() {
        return _date;
    }

    public void setDate(Date date) {
        _date = date;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public long getLocationId() {
        return _locationId;
    }

    public void setLocationId(long locationId) {
        _locationId = locationId;
    }
}
