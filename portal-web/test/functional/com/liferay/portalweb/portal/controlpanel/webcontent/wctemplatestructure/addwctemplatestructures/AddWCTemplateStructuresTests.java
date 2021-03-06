/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.portalweb.portal.controlpanel.webcontent.wctemplatestructure.addwctemplatestructures;

import com.liferay.portalweb.portal.BaseTestSuite;
import com.liferay.portalweb.portal.controlpanel.webcontent.wcstructure.addwcstructure.AddWCStructure1Test;
import com.liferay.portalweb.portal.controlpanel.webcontent.wcstructure.addwcstructure.AddWCStructure2Test;
import com.liferay.portalweb.portal.controlpanel.webcontent.wcstructure.addwcstructure.AddWCStructure3Test;
import com.liferay.portalweb.portal.controlpanel.webcontent.wcstructure.addwcstructure.TearDownWCStructureTest;
import com.liferay.portalweb.portal.controlpanel.webcontent.wctemplatestructure.addwctemplatestructure.AddWCTemplateStructure1Test;
import com.liferay.portalweb.portal.controlpanel.webcontent.wctemplatestructure.addwctemplatestructure.AddWCTemplateStructure2Test;
import com.liferay.portalweb.portal.controlpanel.webcontent.wctemplatestructure.addwctemplatestructure.AddWCTemplateStructure3Test;
import com.liferay.portalweb.portal.controlpanel.webcontent.wctemplatestructure.addwctemplatestructure.TearDownWCTemplateStructureTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Brian Wing Shun Chan
 */
public class AddWCTemplateStructuresTests extends BaseTestSuite {
	public static Test suite() {
		TestSuite testSuite = new TestSuite();
		testSuite.addTestSuite(AddWCStructure1Test.class);
		testSuite.addTestSuite(AddWCStructure2Test.class);
		testSuite.addTestSuite(AddWCStructure3Test.class);
		testSuite.addTestSuite(AddWCTemplateStructure1Test.class);
		testSuite.addTestSuite(AddWCTemplateStructure2Test.class);
		testSuite.addTestSuite(AddWCTemplateStructure3Test.class);
		testSuite.addTestSuite(ViewWCTemplateStructuresTest.class);
		testSuite.addTestSuite(TearDownWCTemplateStructureTest.class);
		testSuite.addTestSuite(TearDownWCStructureTest.class);

		return testSuite;
	}
}