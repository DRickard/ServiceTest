package drickrad.service;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

public class LibCalProxyServiceImpl implements LibCalProxyService {

    LibCalProxyServiceImpl(final Vertx aVertx) {
    }

    @Override
    Future<JsonObject> getClientCredentials(final String aAppName) {
        return null;
    }

    @Override
    Future<JsonObject> getAccessToken(final String aClientID, final String aClientSecret) {
        return null;
    }

    @Override
    Future<JsonObject> getLibCalOutput(final String aOUathToken, final String aLibCalQuery) {
        return null;
    }
}
