package org.openqa.selenium.devtools.database;

import org.openqa.selenium.Beta;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.Event;
import org.openqa.selenium.devtools.ConverterFunctions;
import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.json.JsonInput;

@Beta()
public class Database {

    /**
     * Disables database tracking, prevents database events from being sent to the client.
     */
    public static Command<Void> disable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Database.disable", params.build());
    }

    /**
     * Enables database tracking, database events will now be delivered to the client.
     */
    public static Command<Void> enable() {
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        return new Command<>("Database.enable", params.build());
    }

    public static class ExecuteSQLResponse {

        private final java.util.List<java.lang.String> columnNames;

        private final java.util.List<java.util.Map<String, Object>> values;

        private final org.openqa.selenium.devtools.database.model.Error sqlError;

        public ExecuteSQLResponse(java.util.List<java.lang.String> columnNames, java.util.List<java.util.Map<String, Object>> values, org.openqa.selenium.devtools.database.model.Error sqlError) {
            this.columnNames = java.util.Objects.requireNonNull(columnNames, "columnNames is required");
            this.values = java.util.Objects.requireNonNull(values, "values is required");
            this.sqlError = java.util.Objects.requireNonNull(sqlError, "sqlError is required");
        }

        public java.util.List<java.lang.String> getColumnNames() {
            return columnNames;
        }

        public java.util.List<java.util.Map<String, Object>> getValues() {
            return values;
        }

        public org.openqa.selenium.devtools.database.model.Error getSqlError() {
            return sqlError;
        }

        private static ExecuteSQLResponse fromJson(JsonInput input) {
            java.util.List<java.lang.String> columnNames = null;
            java.util.List<java.util.Map<String, Object>> values = null;
            org.openqa.selenium.devtools.database.model.Error sqlError = null;
            input.beginObject();
            while (input.hasNext()) {
                switch(input.nextName()) {
                    case "columnNames":
                        columnNames = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
                        }.getType());
                        break;
                    case "values":
                        values = input.read(new com.google.common.reflect.TypeToken<java.util.List<java.util.Map<String, Object>>>() {
                        }.getType());
                        break;
                    case "sqlError":
                        sqlError = input.read(org.openqa.selenium.devtools.database.model.Error.class);
                        break;
                    default:
                        input.skipValue();
                        break;
                }
            }
            input.endObject();
            return new ExecuteSQLResponse(columnNames, values, sqlError);
        }
    }

    public static Command<org.openqa.selenium.devtools.database.Database.ExecuteSQLResponse> executeSQL(org.openqa.selenium.devtools.database.model.DatabaseId databaseId, java.lang.String query) {
        java.util.Objects.requireNonNull(databaseId, "databaseId is required");
        java.util.Objects.requireNonNull(query, "query is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("databaseId", databaseId);
        params.put("query", query);
        return new Command<>("Database.executeSQL", params.build(), input -> input.read(org.openqa.selenium.devtools.database.Database.ExecuteSQLResponse.class));
    }

    public static Command<java.util.List<java.lang.String>> getDatabaseTableNames(org.openqa.selenium.devtools.database.model.DatabaseId databaseId) {
        java.util.Objects.requireNonNull(databaseId, "databaseId is required");
        ImmutableMap.Builder<String, Object> params = ImmutableMap.builder();
        params.put("databaseId", databaseId);
        return new Command<>("Database.getDatabaseTableNames", params.build(), ConverterFunctions.map("tableNames", new com.google.common.reflect.TypeToken<java.util.List<java.lang.String>>() {
        }.getType()));
    }

    public static Event<org.openqa.selenium.devtools.database.model.Database> addDatabase() {
        return new Event<>("Database.addDatabase", ConverterFunctions.map("database", org.openqa.selenium.devtools.database.model.Database.class));
    }
}
