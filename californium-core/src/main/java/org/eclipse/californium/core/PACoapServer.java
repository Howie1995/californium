package org.eclipse.californium.core;

import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.network.EndpointManager;
import org.eclipse.californium.core.network.config.NetworkConfig;
import org.eclipse.californium.core.server.resources.CoapExchange;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class PACoapServer extends CoapServer {

    private static final int COAP_PORT = NetworkConfig.getStandard().getInt(NetworkConfig.Keys.COAP_PORT);

    public PACoapServer() throws SocketException {
        add(new CoapResource("hello") {

            @Override
            public void handleGET(CoapExchange exchange) {
                exchange.respond(CoAP.ResponseCode.CONTENT, "Hello CoAP!");
            }

            @Override
            public void handlePOST(CoapExchange exchange) {
                exchange.respond(CoAP.ResponseCode.CHANGED, "");
            }

        });
    }

    public void addDtlsEndpoints() {
        NetworkConfig config = NetworkConfig.getStandard();
        for (InetAddress addr : EndpointManager.getEndpointManager().getNetworkInterfaces()) {
            InetSocketAddress bindToAddress = new InetSocketAddress(addr, COAP_PORT);
            //CoapEndpoint.Builder builder = new ad

            //addEndpoint();
        }
    }

}
