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

package com.liferay.portalweb.permissions.organizations.organization.vieworganization.orgrole;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class RemoveOrgRoleOrganizationsManageUsersTest extends BaseTestCase {
	public void testRemoveOrgRoleOrganizationsManageUsers()
		throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		assertEquals(RuntimeVariables.replace("Go to"),
			selenium.getText("//li[@id='_145_mySites']/a/span"));
		selenium.mouseOver("//li[@id='_145_mySites']/a/span");
		selenium.waitForVisible("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Roles", RuntimeVariables.replace("Roles"));
		selenium.waitForPageToLoad("30000");
		selenium.type("//input[@name='_128_keywords']",
			RuntimeVariables.replace("Orgrole"));
		selenium.clickAt("//input[@value='Search']",
			RuntimeVariables.replace("Search"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Actions"),
			selenium.getText("//span[@title='Actions']/ul/li/strong/a/span"));
		selenium.clickAt("//span[@title='Actions']/ul/li/strong/a/span",
			RuntimeVariables.replace("Actions"));
		selenium.waitForVisible(
			"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Define Permissions')]");
		assertEquals(RuntimeVariables.replace("Define Permissions"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Define Permissions')]"));
		selenium.clickAt("//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Define Permissions')]",
			RuntimeVariables.replace("Define Permissions"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Roles Orgrole Name"),
			selenium.getText(
				"//section[@id='portlet_128']/div/div/div/div[2]/h1/span"));
		selenium.select("//select[@id='_128_add-permissions']",
			RuntimeVariables.replace("Organization Administration"));
		selenium.waitForVisible("//form[@id='_128_fm']/h3");
		assertEquals(RuntimeVariables.replace("Organization"),
			selenium.getText("//form[@id='_128_fm']/h3"));
		assertTrue(selenium.isChecked(
				"//input[@value='com.liferay.portal.model.OrganizationMANAGE_USERS']"));
		selenium.uncheck(
			"//input[@value='com.liferay.portal.model.OrganizationMANAGE_USERS']");
		assertFalse(selenium.isChecked(
				"//input[@value='com.liferay.portal.model.OrganizationMANAGE_USERS']"));
		selenium.clickAt("//input[@value='Save']", RuntimeVariables.replace(""));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace(
				"The role permissions were updated."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		assertEquals(RuntimeVariables.replace(
				"This role does not have any permissions."),
			selenium.getText("//div[@class='portlet-msg-info']"));
	}
}