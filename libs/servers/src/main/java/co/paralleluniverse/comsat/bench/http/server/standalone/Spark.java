package co.paralleluniverse.comsat.bench.http.server.standalone;

import co.paralleluniverse.comsat.bench.http.server.handlers.HandlerUtils;
import spark.Route;

public final class Spark {
    public static void startGet(int port, int maxProcessingP, Route r) {
        spark.Spark.port(port);
        spark.Spark.threadPool(maxProcessingP);
        spark.Spark.get(HandlerUtils.URL, r);
        spark.Spark.awaitInitialization();
    }

    private Spark() {}
}
