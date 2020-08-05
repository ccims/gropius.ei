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

public class ReactionGroupPage extends AbstractResponse<ReactionGroupPage> {
    public ReactionGroupPage() {
    }

    public ReactionGroupPage(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "nodes": {
                    List<ReactionGroup> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ReactionGroup> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ReactionGroup optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ReactionGroup(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "edges": {
                    List<ReactionGroupEdge> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<ReactionGroupEdge> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            ReactionGroupEdge optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new ReactionGroupEdge(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pageInfo": {
                    responseData.put(key, new PageInfo(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

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
        return "ReactionGroupPage";
    }

    public List<ReactionGroup> getNodes() {
        return (List<ReactionGroup>) get("nodes");
    }

    public ReactionGroupPage setNodes(List<ReactionGroup> arg) {
        optimisticData.put(getKey("nodes"), arg);
        return this;
    }

    public List<ReactionGroupEdge> getEdges() {
        return (List<ReactionGroupEdge>) get("edges");
    }

    public ReactionGroupPage setEdges(List<ReactionGroupEdge> arg) {
        optimisticData.put(getKey("edges"), arg);
        return this;
    }

    public PageInfo getPageInfo() {
        return (PageInfo) get("pageInfo");
    }

    public ReactionGroupPage setPageInfo(PageInfo arg) {
        optimisticData.put(getKey("pageInfo"), arg);
        return this;
    }

    public Integer getTotalCount() {
        return (Integer) get("totalCount");
    }

    public ReactionGroupPage setTotalCount(Integer arg) {
        optimisticData.put(getKey("totalCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "nodes": return true;

            case "edges": return true;

            case "pageInfo": return true;

            case "totalCount": return false;

            default: return false;
        }
    }
}

