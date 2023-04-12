/*
 * Copyright 2023 TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.newasr.server;
import org.topicquests.newasr.impl.ASRBaseEnvironment;

/**
 * 
 */

/**
 * @author jackpark
 *
 */
public class ASRServerEnvironment extends ASRBaseEnvironment {

	/**
	 * 
	 */
	public ASRServerEnvironment() {
		super("asr-server-convig.xml");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shutDown() {
		// TODO Auto-generated method stub

	}

}
