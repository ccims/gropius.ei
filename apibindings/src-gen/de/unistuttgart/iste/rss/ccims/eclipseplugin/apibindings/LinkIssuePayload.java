// Generated from graphql_java_gen gem

package de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.time.Instant;

import java.time.format.DateTimeFormatter;

import java.time.temporal.TemporalAccessor;

import java.util.Date;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LinkIssuePayload extends AbstractResponse<LinkIssuePayload> {
    public LinkIssuePayload() {
    }

    public LinkIssuePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "clientMutationID": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "linkedIssue": {
                    Issue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Issue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "linkedIssueEdge": {
                    IssueEdge optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueEdge(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "timelineEdge": {
                    IssueTimelineItemEdge optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueTimelineItemEdge(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "LinkIssuePayload";
    }

    public String getClientMutationId() {
        return (String) get("clientMutationID");
    }

    public LinkIssuePayload setClientMutationId(String arg) {
        optimisticData.put(getKey("clientMutationID"), arg);
        return this;
    }

    public Issue getLinkedIssue() {
        return (Issue) get("linkedIssue");
    }

    public LinkIssuePayload setLinkedIssue(Issue arg) {
        optimisticData.put(getKey("linkedIssue"), arg);
        return this;
    }

    public IssueEdge getLinkedIssueEdge() {
        return (IssueEdge) get("linkedIssueEdge");
    }

    public LinkIssuePayload setLinkedIssueEdge(IssueEdge arg) {
        optimisticData.put(getKey("linkedIssueEdge"), arg);
        return this;
    }

    public IssueTimelineItemEdge getTimelineEdge() {
        return (IssueTimelineItemEdge) get("timelineEdge");
    }

    public LinkIssuePayload setTimelineEdge(IssueTimelineItemEdge arg) {
        optimisticData.put(getKey("timelineEdge"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "clientMutationID": return false;

            case "linkedIssue": return true;

            case "linkedIssueEdge": return true;

            case "timelineEdge": return true;

            default: return false;
        }
    }
}
