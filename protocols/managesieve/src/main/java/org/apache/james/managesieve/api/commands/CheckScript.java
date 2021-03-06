/*
 *   Licensed to the Apache Software Foundation (ASF) under one
 *   or more contributor license agreements.  See the NOTICE file
 *   distributed with this work for additional information
 *   regarding copyright ownership.  The ASF licenses this file
 *   to you under the Apache License, Version 2.0 (the
 *   "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */

package org.apache.james.managesieve.api.commands;

import java.util.List;

import org.apache.james.managesieve.api.AuthenticationRequiredException;
import org.apache.james.managesieve.api.SyntaxException;

/**
 * <code>CheckScript</code>
 * 
 *  @see <a href=http://tools.ietf.org/html/rfc5804#section-2.12>RFC 5804 CHECKSCRIPT Command</a>
 */
public interface CheckScript {
    
    abstract public List<String> checkScript(String content) throws AuthenticationRequiredException, SyntaxException;

}
