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

package com.liferay.portalweb.portlet.breadcrumb.portlet.viewportletbreadcrumb;

import com.liferay.portalweb.portal.BaseTestSuite;
import com.liferay.portalweb.portal.util.TearDownPageTest;
import com.liferay.portalweb.portlet.breadcrumb.portlet.addportletbreadcrumb.AddPageBreadcrumbTest;
import com.liferay.portalweb.portlet.breadcrumb.portlet.addportletbreadcrumb.AddPortletBreadcrumbTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Brian Wing Shun Chan
 */
public class ViewPortletBreadcrumbTests extends BaseTestSuite {
	public static Test suite() {
		TestSuite testSuite = new TestSuite();
		testSuite.addTestSuite(AddPageBreadcrumbTest.class);
		testSuite.addTestSuite(AddPortletBreadcrumbTest.class);
		testSuite.addTestSuite(AddChildPageBreadcrumbTest.class);
		testSuite.addTestSuite(AddPortletBreadcrumbChildPageTest.class);
		testSuite.addTestSuite(ViewPortletBreadcrumbTest.class);
		testSuite.addTestSuite(TearDownPageTest.class);

		return testSuite;
	}
}