package com.nosester.portlet.eventlisting.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LocationService}.
 *
 * @author Bao Nguyen
 * @see LocationService
 * @generated
 */
public class LocationServiceWrapper implements LocationService,
    ServiceWrapper<LocationService> {
    private LocationService _locationService;

    public LocationServiceWrapper(LocationService locationService) {
        _locationService = locationService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _locationService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _locationService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _locationService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LocationService getWrappedLocationService() {
        return _locationService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLocationService(LocationService locationService) {
        _locationService = locationService;
    }

    @Override
    public LocationService getWrappedService() {
        return _locationService;
    }

    @Override
    public void setWrappedService(LocationService locationService) {
        _locationService = locationService;
    }
}
