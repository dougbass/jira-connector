/**
 * Mule Jira Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.jira;

public class JiraConnectorException extends RuntimeException {

    private static final long serialVersionUID = -2109364149460283327L;

    public JiraConnectorException(Throwable cause) {
        super(cause);
    }

    public JiraConnectorException(String message, Throwable cause) {
        super(message, cause);
    }

    public JiraConnectorException(String s) {
        super(s);
    }
}