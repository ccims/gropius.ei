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

public class LinkIssuePayloadQuery extends Query<LinkIssuePayloadQuery> {
    LinkIssuePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public LinkIssuePayloadQuery clientMutationId() {
        startField("clientMutationID");

        return this;
    }

    public LinkIssuePayloadQuery linkedIssue(IssueQueryDefinition queryDef) {
        startField("linkedIssue");

        _queryBuilder.append('{');
        queryDef.define(new IssueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public LinkIssuePayloadQuery linkedIssueEdge(IssueEdgeQueryDefinition queryDef) {
        startField("linkedIssueEdge");

        _queryBuilder.append('{');
        queryDef.define(new IssueEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public LinkIssuePayloadQuery timelineEdge(IssueTimelineItemEdgeQueryDefinition queryDef) {
        startField("timelineEdge");

        _queryBuilder.append('{');
        queryDef.define(new IssueTimelineItemEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
