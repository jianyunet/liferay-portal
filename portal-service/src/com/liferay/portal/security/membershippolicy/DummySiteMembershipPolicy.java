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

package com.liferay.portal.security.membershippolicy;

import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.model.Group;
import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.model.AssetTag;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

/**
 * @author Roberto Díaz
 * @author Sergio González
 */
public class DummySiteMembershipPolicy extends BaseSiteMembershipPolicy {

	public void checkMembership(
		long[] userIds, long[] addGroupIds, long[] removeGroupIds) {
	}

	@Override
	public boolean isMembershipAllowed(long userId, long groupId) {
		return true;
	}

	@Override
	public boolean isMembershipRequired(long userId, long groupId) {
		return false;
	}

	@Override
	public boolean isRoleAllowed(long userId, long groupId, long roleId) {
		return true;
	}

	@Override
	public boolean isRoleRequired(long userId, long groupId, long roleId) {
		return false;
	}

	public void propagateMembership(
		long[] userIds, long[] addGroupIds, long[] removeGroupIds) {
	}

	@Override
	public void verifyPolicy(Group group) {
	}

	public void verifyPolicy(
		Group group, Group oldGroup, List<AssetCategory> oldAssetCategories,
		List<AssetTag> oldAssetTags,
		Map<String, Serializable> oldExpandoAttributes,
		UnicodeProperties oldTypeSettingsProperties) {
	}

}