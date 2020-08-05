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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RemoveAssigneePayloadQuery extends Query<RemoveAssigneePayloadQuery> {
    RemoveAssigneePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public RemoveAssigneePayloadQuery clientMutationId() {
        startField("clientMutationID");

        return this;
    }

    public RemoveAssigneePayloadQuery issue(IssueQueryDefinition queryDef) {
        startField("issue");

        _queryBuilder.append('{');
        queryDef.define(new IssueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public RemoveAssigneePayloadQuery unassignedUser(UserQueryDefinition queryDef) {
        startField("unassignedUser");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public RemoveAssigneePayloadQuery event(UnassignedEventQueryDefinition queryDef) {
        startField("event");

        _queryBuilder.append('{');
        queryDef.define(new UnassignedEventQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public RemoveAssigneePayloadQuery timelineEdge(IssueTimelineItemEdgeQueryDefinition queryDef) {
        startField("timelineEdge");

        _queryBuilder.append('{');
        queryDef.define(new IssueTimelineItemEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
