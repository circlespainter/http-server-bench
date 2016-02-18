import co.paralleluniverse.comsat.bench.http.server.UndertowLoadTargetBase;
import co.paralleluniverse.comsat.bench.http.server.handlers.utow.async.UtowHandlerAsyncSameThreadQueue;
import co.paralleluniverse.comsat.bench.http.server.standalone.Undertow;

public final class Main extends UndertowLoadTargetBase {
    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    @Override
    protected final int getDefaultPort() {
        return 8017;
    }

    @Override
    protected io.undertow.Undertow getUndertowServer(int port, int backlog, int maxIOP, int maxProcessingP) throws Exception {
        return Undertow.singleHandlerServer(port, backlog, maxIOP, maxProcessingP, new UtowHandlerAsyncSameThreadQueue());
    }
}
