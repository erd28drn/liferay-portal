/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.sharing.internal.configuration;

import aQute.bnd.annotation.ProviderType;
import aQute.bnd.annotation.metatype.Meta;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

/**
 * @author Adolfo Pérez
 */
@ExtendedObjectClassDefinition(category = "sharing")
@Meta.OCD(
	id = "com.liferay.sharing.internal.configuration.SharingConfiguration",
	localization = "content/Language", name = "sharing-configuration-name"
)
@ProviderType
public interface SharingConfiguration {

	/**
	 * Set the interval in minutes on how often
	 * DeleteExpiredSharingEntriesMessageListener will run to check for expired
	 * sharing entries.
	 *
	 * @review
	 */
	@Meta.AD(
		deflt = "60",
		description = "expired-sharing-entries-check-interval-key-description",
		name = "expired-sharing-entries-check-interval", required = false
	)
	public int expiredSharingEntriesCheckInterval();

}