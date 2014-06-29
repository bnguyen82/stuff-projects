package com.nosester.portlet.eventlisting.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.nosester.portlet.eventlisting.model.Location;
import com.nosester.portlet.eventlisting.service.LocationService;
import com.nosester.portlet.eventlisting.service.persistence.EventPersistence;
import com.nosester.portlet.eventlisting.service.persistence.LocationPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the location remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nosester.portlet.eventlisting.service.impl.LocationServiceImpl}.
 * </p>
 *
 * @author Bao Nguyen
 * @see com.nosester.portlet.eventlisting.service.impl.LocationServiceImpl
 * @see com.nosester.portlet.eventlisting.service.LocationServiceUtil
 * @generated
 */
public abstract class LocationServiceBaseImpl extends BaseServiceImpl
    implements LocationService, IdentifiableBean {
    @BeanReference(type = com.nosester.portlet.eventlisting.service.EventLocalService.class)
    protected com.nosester.portlet.eventlisting.service.EventLocalService eventLocalService;
    @BeanReference(type = com.nosester.portlet.eventlisting.service.EventService.class)
    protected com.nosester.portlet.eventlisting.service.EventService eventService;
    @BeanReference(type = EventPersistence.class)
    protected EventPersistence eventPersistence;
    @BeanReference(type = com.nosester.portlet.eventlisting.service.LocationLocalService.class)
    protected com.nosester.portlet.eventlisting.service.LocationLocalService locationLocalService;
    @BeanReference(type = com.nosester.portlet.eventlisting.service.LocationService.class)
    protected com.nosester.portlet.eventlisting.service.LocationService locationService;
    @BeanReference(type = LocationPersistence.class)
    protected LocationPersistence locationPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private LocationServiceClpInvoker _clpInvoker = new LocationServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.nosester.portlet.eventlisting.service.LocationServiceUtil} to access the location remote service.
     */

    /**
     * Returns the event local service.
     *
     * @return the event local service
     */
    public com.nosester.portlet.eventlisting.service.EventLocalService getEventLocalService() {
        return eventLocalService;
    }

    /**
     * Sets the event local service.
     *
     * @param eventLocalService the event local service
     */
    public void setEventLocalService(
        com.nosester.portlet.eventlisting.service.EventLocalService eventLocalService) {
        this.eventLocalService = eventLocalService;
    }

    /**
     * Returns the event remote service.
     *
     * @return the event remote service
     */
    public com.nosester.portlet.eventlisting.service.EventService getEventService() {
        return eventService;
    }

    /**
     * Sets the event remote service.
     *
     * @param eventService the event remote service
     */
    public void setEventService(
        com.nosester.portlet.eventlisting.service.EventService eventService) {
        this.eventService = eventService;
    }

    /**
     * Returns the event persistence.
     *
     * @return the event persistence
     */
    public EventPersistence getEventPersistence() {
        return eventPersistence;
    }

    /**
     * Sets the event persistence.
     *
     * @param eventPersistence the event persistence
     */
    public void setEventPersistence(EventPersistence eventPersistence) {
        this.eventPersistence = eventPersistence;
    }

    /**
     * Returns the location local service.
     *
     * @return the location local service
     */
    public com.nosester.portlet.eventlisting.service.LocationLocalService getLocationLocalService() {
        return locationLocalService;
    }

    /**
     * Sets the location local service.
     *
     * @param locationLocalService the location local service
     */
    public void setLocationLocalService(
        com.nosester.portlet.eventlisting.service.LocationLocalService locationLocalService) {
        this.locationLocalService = locationLocalService;
    }

    /**
     * Returns the location remote service.
     *
     * @return the location remote service
     */
    public com.nosester.portlet.eventlisting.service.LocationService getLocationService() {
        return locationService;
    }

    /**
     * Sets the location remote service.
     *
     * @param locationService the location remote service
     */
    public void setLocationService(
        com.nosester.portlet.eventlisting.service.LocationService locationService) {
        this.locationService = locationService;
    }

    /**
     * Returns the location persistence.
     *
     * @return the location persistence
     */
    public LocationPersistence getLocationPersistence() {
        return locationPersistence;
    }

    /**
     * Sets the location persistence.
     *
     * @param locationPersistence the location persistence
     */
    public void setLocationPersistence(LocationPersistence locationPersistence) {
        this.locationPersistence = locationPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Location.class;
    }

    protected String getModelClassName() {
        return Location.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = locationPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
