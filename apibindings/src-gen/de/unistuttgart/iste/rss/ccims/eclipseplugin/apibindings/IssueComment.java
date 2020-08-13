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

public class IssueComment extends AbstractResponse<IssueComment> implements Comment, IssueTimelineItem, Node {
    public IssueComment() {
    }

    public IssueComment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "issue": {
                    responseData.put(key, new Issue(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "createdBy": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "editedBy": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, Date.from(Instant.from(DateTimeFormatter.ISO_INSTANT.parse(jsonAsString(field.getValue(), key)))));

                    break;
                }

                case "editedAt": {
                    Date optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Date.from(Instant.from(DateTimeFormatter.ISO_INSTANT.parse(jsonAsString(field.getValue(), key))));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "body": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "bodyRendered": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reactions": {
                    ReactionGroupPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReactionGroupPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currentUserCanEdit": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

    public IssueComment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "IssueComment";
    }

    public ID getId() {
        return (ID) get("id");
    }

    public Issue getIssue() {
        return (Issue) get("issue");
    }

    public IssueComment setIssue(Issue arg) {
        optimisticData.put(getKey("issue"), arg);
        return this;
    }

    public User getCreatedBy() {
        return (User) get("createdBy");
    }

    public IssueComment setCreatedBy(User arg) {
        optimisticData.put(getKey("createdBy"), arg);
        return this;
    }

    public User getEditedBy() {
        return (User) get("editedBy");
    }

    public IssueComment setEditedBy(User arg) {
        optimisticData.put(getKey("editedBy"), arg);
        return this;
    }

    public Date getCreatedAt() {
        return (Date) get("createdAt");
    }

    public IssueComment setCreatedAt(Date arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    public Date getEditedAt() {
        return (Date) get("editedAt");
    }

    public IssueComment setEditedAt(Date arg) {
        optimisticData.put(getKey("editedAt"), arg);
        return this;
    }

    public String getBody() {
        return (String) get("body");
    }

    public IssueComment setBody(String arg) {
        optimisticData.put(getKey("body"), arg);
        return this;
    }

    public String getBodyRendered() {
        return (String) get("bodyRendered");
    }

    public IssueComment setBodyRendered(String arg) {
        optimisticData.put(getKey("bodyRendered"), arg);
        return this;
    }

    public ReactionGroupPage getReactions() {
        return (ReactionGroupPage) get("reactions");
    }

    public IssueComment setReactions(ReactionGroupPage arg) {
        optimisticData.put(getKey("reactions"), arg);
        return this;
    }

    public Boolean getCurrentUserCanEdit() {
        return (Boolean) get("currentUserCanEdit");
    }

    public IssueComment setCurrentUserCanEdit(Boolean arg) {
        optimisticData.put(getKey("currentUserCanEdit"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "issue": return true;

            case "createdBy": return true;

            case "editedBy": return true;

            case "createdAt": return false;

            case "editedAt": return false;

            case "body": return false;

            case "bodyRendered": return false;

            case "reactions": return true;

            case "currentUserCanEdit": return false;

            default: return false;
        }
    }
}
