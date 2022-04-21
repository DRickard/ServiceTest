package drickard.service;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

public class LibCalProxyServiceImpl implements LibCalProxyService {

    LibCalProxyServiceImpl(final Vertx aVertx) {
    }

    @Override
    public Future<JsonObject> getClientCredentials(final String aAppName) {
	final JsonObject credentials = new JsonObject();
        credentials.put("client_id", myVertx.getOrCreateContext().config().getString("client.id.".concat(aAppName)));
        credentials.put("client_secret", myVertx.getOrCreateContext().config().getString("client.secret.".concat(aAppName)));
        return Future.succeededFuture(credentials);
    }

    @Override
    public Future<JsonObject> getAccessToken(final String aClientID, final String aClientSecret) {
        return null;
    }

    @Override
    public Future<JsonObject> getLibCalOutput(final String aOUathToken, final String aLibCalQuery) {
        return null;
    }
}
