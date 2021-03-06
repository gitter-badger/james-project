/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.james.mpt.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Runs MPT scripts
 * @goal run
 */
public class MailProtocolTestMojo extends AbstractMojo{

	/**
	 * The Mail Protocol Tests (MPT) to run
	 * 
	 * @parameter
	 * @required
	 * @since 0.1
	 */
    private MailProtocolTest[] mailProtocolTests;

	public void execute() throws MojoExecutionException, MojoFailureException {
		for (int i = 0; i < mailProtocolTests.length; i++) {
			MailProtocolTest test = mailProtocolTests[i];
			test.execute();
		}
	}
    
    
    
}
