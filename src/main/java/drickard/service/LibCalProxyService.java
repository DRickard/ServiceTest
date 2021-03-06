package drickard.service;

import io.vertx.codegen.annotations.ProxyClose;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.serviceproxy.ServiceProxyBuilder;

@ProxyGen
@VertxGen
public interface LibCalProxyService {

    String ADDRESS = LibCalProxyService.class.getName();

    static LibCalProxyService create(Vertx aVertx) {
        return new LibCalProxyServiceImpl(aVertx);
    }

    static LibCalProxyService createProxy(Vertx aVertx) {
        return new ServiceProxyBuilder(aVertx).setAddress(ADDRESS).build(LibCalProxyService.class);
    }

    Future<JsonObject> getClientCredentials(final String aAppName);

    Future<JsonObject> getAccessToken(final String aClientID, final String aClientSecret);

    Future<JsonObject> getLibCalOutput(final String aOUathToken, final String aLibCalQuery);

}
