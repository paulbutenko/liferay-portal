/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.security.pacl.permission;

import com.liferay.portal.kernel.security.pacl.PACLConstants;

import java.security.BasicPermission;
import java.security.Permission;

/**
 * @author Brian Wing Shun Chan
 */
public class PortalRuntimePermission extends BasicPermission {

	public static void checkExpandoBridge(String className) {
		SecurityManager securityManager = System.getSecurityManager();

		if (securityManager == null) {
			return;
		}

		Permission permission = new PortalRuntimePermission(
			PACLConstants.PORTAL_RUNTIME_PERMISSION_EXPANDO_BRIDGE, className);

		securityManager.checkPermission(permission);
	}

	public static void checkGetBeanProperty(Class<?> clazz) {
		checkGetBeanProperty(clazz, null);
	}

	public static void checkGetBeanProperty(Class<?> clazz, String property) {
		SecurityManager securityManager = System.getSecurityManager();

		if (securityManager == null) {
			return;
		}

		Permission permission = new PortalRuntimePermission(
			PACLConstants.PORTAL_RUNTIME_PERMISSION_GET_BEAN_PROPERTY, clazz,
			property);

		securityManager.checkPermission(permission);
	}

	public static void checkSearchEngine(String searchEngineId) {
		SecurityManager securityManager = System.getSecurityManager();

		if (securityManager == null) {
			return;
		}

		Permission permission = new PortalRuntimePermission(
			PACLConstants.PORTAL_RUNTIME_PERMISSION_SEARCH_ENGINE,
			searchEngineId);

		securityManager.checkPermission(permission);
	}

	public static void checkSetBeanProperty(Class<?> clazz) {
		checkSetBeanProperty(clazz, null);
	}

	public static void checkSetBeanProperty(Class<?> clazz, String property) {
		SecurityManager securityManager = System.getSecurityManager();

		if (securityManager == null) {
			return;
		}

		Permission permission = new PortalRuntimePermission(
			PACLConstants.PORTAL_RUNTIME_PERMISSION_SET_BEAN_PROPERTY, clazz,
			property);

		securityManager.checkPermission(permission);
	}

	public PortalRuntimePermission(String name, Object subject) {
		this(name, subject, null);
	}

	public PortalRuntimePermission(
		String name, Object subject, String property) {

		super(name);

		_property = property;
		_subject = subject;
	}

	public String getProperty() {
		return _property;
	}

	public Object getSubject() {
		return _subject;
	}

	private String _property;
	private Object _subject;

}