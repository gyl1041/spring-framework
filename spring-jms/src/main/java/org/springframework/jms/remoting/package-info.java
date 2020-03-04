/**
 * Remoting classes for transparent Java-to-Java remoting via a JMS provider.
 *
 * <p>Allows the target com.service to be load-balanced across a number of queue
 * receivers, and provides a level of indirection between the client and the
 * com.service: They only need to agree on a queue name and a com.service interface.
 */
@NonNullApi
@NonNullFields
package org.springframework.jms.remoting;

import org.springframework.lang.NonNullApi;
import org.springframework.lang.NonNullFields;
