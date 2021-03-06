/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.servicebus.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;
import java.util.Calendar;

public class ServiceBusQueue {
    private Calendar accessedAt;
    
    /**
    * Optional. The time the queue was last accessed.
    * @return The AccessedAt value.
    */
    public Calendar getAccessedAt() {
        return this.accessedAt;
    }
    
    /**
    * Optional. The time the queue was last accessed.
    * @param accessedAtValue The AccessedAt value.
    */
    public void setAccessedAt(final Calendar accessedAtValue) {
        this.accessedAt = accessedAtValue;
    }
    
    private ArrayList<ServiceBusSharedAccessAuthorizationRule> authorizationRules;
    
    /**
    * Optional. Gets the authorization rules for the description.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The AuthorizationRules value.
    */
    public ArrayList<ServiceBusSharedAccessAuthorizationRule> getAuthorizationRules() {
        return this.authorizationRules;
    }
    
    /**
    * Optional. Gets the authorization rules for the description.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param authorizationRulesValue The AuthorizationRules value.
    */
    public void setAuthorizationRules(final ArrayList<ServiceBusSharedAccessAuthorizationRule> authorizationRulesValue) {
        this.authorizationRules = authorizationRulesValue;
    }
    
    private String autoDeleteOnIdle;
    
    /**
    * Optional. Implemented.
    * @return The AutoDeleteOnIdle value.
    */
    public String getAutoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }
    
    /**
    * Optional. Implemented.
    * @param autoDeleteOnIdleValue The AutoDeleteOnIdle value.
    */
    public void setAutoDeleteOnIdle(final String autoDeleteOnIdleValue) {
        this.autoDeleteOnIdle = autoDeleteOnIdleValue;
    }
    
    private CountDetails countDetails;
    
    /**
    * Optional. Current queue statistics.
    * @return The CountDetails value.
    */
    public CountDetails getCountDetails() {
        return this.countDetails;
    }
    
    /**
    * Optional. Current queue statistics.
    * @param countDetailsValue The CountDetails value.
    */
    public void setCountDetails(final CountDetails countDetailsValue) {
        this.countDetails = countDetailsValue;
    }
    
    private Calendar createdAt;
    
    /**
    * Optional. The time the queue was created at.
    * @return The CreatedAt value.
    */
    public Calendar getCreatedAt() {
        return this.createdAt;
    }
    
    /**
    * Optional. The time the queue was created at.
    * @param createdAtValue The CreatedAt value.
    */
    public void setCreatedAt(final Calendar createdAtValue) {
        this.createdAt = createdAtValue;
    }
    
    private boolean deadLetteringOnMessageExpiration;
    
    /**
    * Optional. This field controls how the Service Bus handles a message whose
    * TTL has expired. If it is enabled and a message expires, the Service Bus
    * moves the message from the queue into the queue's dead-letter sub-queue.
    * If disabled, message will be permanently deleted from the queue.
    * Settable only at queue creation time.* Default: false  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The DeadLetteringOnMessageExpiration value.
    */
    public boolean isDeadLetteringOnMessageExpiration() {
        return this.deadLetteringOnMessageExpiration;
    }
    
    /**
    * Optional. This field controls how the Service Bus handles a message whose
    * TTL has expired. If it is enabled and a message expires, the Service Bus
    * moves the message from the queue into the queue's dead-letter sub-queue.
    * If disabled, message will be permanently deleted from the queue.
    * Settable only at queue creation time.* Default: false  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param deadLetteringOnMessageExpirationValue The
    * DeadLetteringOnMessageExpiration value.
    */
    public void setDeadLetteringOnMessageExpiration(final boolean deadLetteringOnMessageExpirationValue) {
        this.deadLetteringOnMessageExpiration = deadLetteringOnMessageExpirationValue;
    }
    
    private String defaultMessageTimeToLive;
    
    /**
    * Optional. Depending on whether DeadLettering is enabled, a message is
    * automatically moved to the DeadLetterQueue or deleted if it has been
    * stored in the queue for longer than the specified time. This value is
    * overwritten by a TTL specified on the message if and only if the message
    * TTL is smaller than the TTL set on the queue. This value is immutable
    * after the Queue has been created:* Range: 1 second - TimeSpan.MaxValue*
    * Default: TimeSpan.MaxValue  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The DefaultMessageTimeToLive value.
    */
    public String getDefaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }
    
    /**
    * Optional. Depending on whether DeadLettering is enabled, a message is
    * automatically moved to the DeadLetterQueue or deleted if it has been
    * stored in the queue for longer than the specified time. This value is
    * overwritten by a TTL specified on the message if and only if the message
    * TTL is smaller than the TTL set on the queue. This value is immutable
    * after the Queue has been created:* Range: 1 second - TimeSpan.MaxValue*
    * Default: TimeSpan.MaxValue  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param defaultMessageTimeToLiveValue The DefaultMessageTimeToLive value.
    */
    public void setDefaultMessageTimeToLive(final String defaultMessageTimeToLiveValue) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLiveValue;
    }
    
    private String duplicateDetectionHistoryTimeWindow;
    
    /**
    * Optional. Specifies the time span during which the Service Bus detects
    * message duplication:* Range: 1 second - 7 days* Default: 10 minutes
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx
    * for more information)
    * @return The DuplicateDetectionHistoryTimeWindow value.
    */
    public String getDuplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }
    
    /**
    * Optional. Specifies the time span during which the Service Bus detects
    * message duplication:* Range: 1 second - 7 days* Default: 10 minutes
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx
    * for more information)
    * @param duplicateDetectionHistoryTimeWindowValue The
    * DuplicateDetectionHistoryTimeWindow value.
    */
    public void setDuplicateDetectionHistoryTimeWindow(final String duplicateDetectionHistoryTimeWindowValue) {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindowValue;
    }
    
    private boolean enableBatchedOperations;
    
    /**
    * Optional. Enables or disables service side batching behavior when
    * performing operations for the specific queue. When enabled, service bus
    * will collect/batch multiple operations to the backend to be more
    * connection efficient. If user wants lower operation latency then they
    * can disable this feature.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The EnableBatchedOperations value.
    */
    public boolean isEnableBatchedOperations() {
        return this.enableBatchedOperations;
    }
    
    /**
    * Optional. Enables or disables service side batching behavior when
    * performing operations for the specific queue. When enabled, service bus
    * will collect/batch multiple operations to the backend to be more
    * connection efficient. If user wants lower operation latency then they
    * can disable this feature.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param enableBatchedOperationsValue The EnableBatchedOperations value.
    */
    public void setEnableBatchedOperations(final boolean enableBatchedOperationsValue) {
        this.enableBatchedOperations = enableBatchedOperationsValue;
    }
    
    private String entityAvailabilityStatus;
    
    /**
    * Optional. The current availability status of the queue.
    * @return The EntityAvailabilityStatus value.
    */
    public String getEntityAvailabilityStatus() {
        return this.entityAvailabilityStatus;
    }
    
    /**
    * Optional. The current availability status of the queue.
    * @param entityAvailabilityStatusValue The EntityAvailabilityStatus value.
    */
    public void setEntityAvailabilityStatus(final String entityAvailabilityStatusValue) {
        this.entityAvailabilityStatus = entityAvailabilityStatusValue;
    }
    
    private boolean isAnonymousAccessible;
    
    /**
    * Optional. Gets whether anonymous access is allowed.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The IsAnonymousAccessible value.
    */
    public boolean isAnonymousAccessible() {
        return this.isAnonymousAccessible;
    }
    
    /**
    * Optional. Gets whether anonymous access is allowed.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param isAnonymousAccessibleValue The IsAnonymousAccessible value.
    */
    public void setIsAnonymousAccessible(final boolean isAnonymousAccessibleValue) {
        this.isAnonymousAccessible = isAnonymousAccessibleValue;
    }
    
    private String lockDuration;
    
    /**
    * Optional. Determines the amount of time in seconds in which a message
    * should be locked for processing by a receiver. After this period, the
    * message is unlocked and available for consumption by the next receiver.
    * Settable only at queue creation time:* Range: 0 - 5 minutes. 0 means
    * that the message is not locked* Default: 30 seconds  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The LockDuration value.
    */
    public String getLockDuration() {
        return this.lockDuration;
    }
    
    /**
    * Optional. Determines the amount of time in seconds in which a message
    * should be locked for processing by a receiver. After this period, the
    * message is unlocked and available for consumption by the next receiver.
    * Settable only at queue creation time:* Range: 0 - 5 minutes. 0 means
    * that the message is not locked* Default: 30 seconds  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param lockDurationValue The LockDuration value.
    */
    public void setLockDuration(final String lockDurationValue) {
        this.lockDuration = lockDurationValue;
    }
    
    private int maxDeliveryCount;
    
    /**
    * Optional. The maximum number of times a message SB will try to deliver
    * before being dead lettered or discarded.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The MaxDeliveryCount value.
    */
    public int getMaxDeliveryCount() {
        return this.maxDeliveryCount;
    }
    
    /**
    * Optional. The maximum number of times a message SB will try to deliver
    * before being dead lettered or discarded.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param maxDeliveryCountValue The MaxDeliveryCount value.
    */
    public void setMaxDeliveryCount(final int maxDeliveryCountValue) {
        this.maxDeliveryCount = maxDeliveryCountValue;
    }
    
    private int maxSizeInMegabytes;
    
    /**
    * Optional. Specifies the maximum queue size in megabytes. Any attempt to
    * enqueue a message that will cause the queue to exceed this value will
    * fail. You can only set this parameter at queue creation time using the
    * following values: * Range: 1 - 1024 (valid values are 1024, 2048, 3072,
    * 4096, 5120) * Default: 1*1024 (valid values are 1024, 2048, 3072, 4096,
    * 5120)  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The MaxSizeInMegabytes value.
    */
    public int getMaxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }
    
    /**
    * Optional. Specifies the maximum queue size in megabytes. Any attempt to
    * enqueue a message that will cause the queue to exceed this value will
    * fail. You can only set this parameter at queue creation time using the
    * following values: * Range: 1 - 1024 (valid values are 1024, 2048, 3072,
    * 4096, 5120) * Default: 1*1024 (valid values are 1024, 2048, 3072, 4096,
    * 5120)  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param maxSizeInMegabytesValue The MaxSizeInMegabytes value.
    */
    public void setMaxSizeInMegabytes(final int maxSizeInMegabytesValue) {
        this.maxSizeInMegabytes = maxSizeInMegabytesValue;
    }
    
    private int messageCount;
    
    /**
    * Optional. Displays the number of messages currently in the queue.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The MessageCount value.
    */
    public int getMessageCount() {
        return this.messageCount;
    }
    
    /**
    * Optional. Displays the number of messages currently in the queue.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param messageCountValue The MessageCount value.
    */
    public void setMessageCount(final int messageCountValue) {
        this.messageCount = messageCountValue;
    }
    
    private String name;
    
    /**
    * Optional. The name of the queue.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. The name of the queue.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private boolean requiresDuplicateDetection;
    
    /**
    * Optional. Settable only at queue creation time.* Default for durable
    * queue: false  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The RequiresDuplicateDetection value.
    */
    public boolean isRequiresDuplicateDetection() {
        return this.requiresDuplicateDetection;
    }
    
    /**
    * Optional. Settable only at queue creation time.* Default for durable
    * queue: false  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param requiresDuplicateDetectionValue The RequiresDuplicateDetection
    * value.
    */
    public void setRequiresDuplicateDetection(final boolean requiresDuplicateDetectionValue) {
        this.requiresDuplicateDetection = requiresDuplicateDetectionValue;
    }
    
    private boolean requiresSession;
    
    /**
    * Optional. Settable only at queue creation time. If set to true, the queue
    * will be session-aware and only SessionReceiver will be supported.
    * Session-aware queues are not supported through REST.* Default for
    * durable queue: false  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The RequiresSession value.
    */
    public boolean isRequiresSession() {
        return this.requiresSession;
    }
    
    /**
    * Optional. Settable only at queue creation time. If set to true, the queue
    * will be session-aware and only SessionReceiver will be supported.
    * Session-aware queues are not supported through REST.* Default for
    * durable queue: false  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param requiresSessionValue The RequiresSession value.
    */
    public void setRequiresSession(final boolean requiresSessionValue) {
        this.requiresSession = requiresSessionValue;
    }
    
    private int sizeInBytes;
    
    /**
    * Optional. Reflects the actual bytes that messages in the queue currently
    * occupy toward the queue's quota.* Range: 0 -MaxTopicSizeinMegaBytes
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx
    * for more information)
    * @return The SizeInBytes value.
    */
    public int getSizeInBytes() {
        return this.sizeInBytes;
    }
    
    /**
    * Optional. Reflects the actual bytes that messages in the queue currently
    * occupy toward the queue's quota.* Range: 0 -MaxTopicSizeinMegaBytes
    * (see http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx
    * for more information)
    * @param sizeInBytesValue The SizeInBytes value.
    */
    public void setSizeInBytes(final int sizeInBytesValue) {
        this.sizeInBytes = sizeInBytesValue;
    }
    
    private String status;
    
    /**
    * Optional. Gets or sets the current status of the queue (enabled or
    * disabled). When a queue is disabled, that queue cannot send or receive
    * messages.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The Status value.
    */
    public String getStatus() {
        return this.status;
    }
    
    /**
    * Optional. Gets or sets the current status of the queue (enabled or
    * disabled). When a queue is disabled, that queue cannot send or receive
    * messages.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param statusValue The Status value.
    */
    public void setStatus(final String statusValue) {
        this.status = statusValue;
    }
    
    private boolean supportOrdering;
    
    /**
    * Optional. Gets or sets whether the queue supports ordering.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @return The SupportOrdering value.
    */
    public boolean isSupportOrdering() {
        return this.supportOrdering;
    }
    
    /**
    * Optional. Gets or sets whether the queue supports ordering.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/hh780773.aspx for
    * more information)
    * @param supportOrderingValue The SupportOrdering value.
    */
    public void setSupportOrdering(final boolean supportOrderingValue) {
        this.supportOrdering = supportOrderingValue;
    }
    
    private Calendar updatedAt;
    
    /**
    * Optional. The time the queue was last updated.
    * @return The UpdatedAt value.
    */
    public Calendar getUpdatedAt() {
        return this.updatedAt;
    }
    
    /**
    * Optional. The time the queue was last updated.
    * @param updatedAtValue The UpdatedAt value.
    */
    public void setUpdatedAt(final Calendar updatedAtValue) {
        this.updatedAt = updatedAtValue;
    }
    
    /**
    * Initializes a new instance of the ServiceBusQueue class.
    *
    */
    public ServiceBusQueue() {
        this.setAuthorizationRules(new LazyArrayList<ServiceBusSharedAccessAuthorizationRule>());
    }
}
