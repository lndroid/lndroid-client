package org.lndroid.framework.usecases;

import java.io.IOException;
import java.lang.reflect.Type;

import org.lndroid.framework.WalletData;
import org.lndroid.framework.client.IPluginClient;
import org.lndroid.framework.defaults.DefaultPlugins;
import org.lndroid.framework.common.IPluginData;

public class ActionConnectPeer extends ActionUseCaseBase<WalletData.ConnectPeerRequest, WalletData.Peer> {
    public ActionConnectPeer(IPluginClient client) {
        super(DefaultPlugins.CONNECT_PEER, client, "ActionConnectPeer");
    }

    @Override
    protected WalletData.Peer getData(IPluginData in) {
        in.assignDataType(WalletData.Peer.class);
        try {
            return in.getData();
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    protected Type getRequestType() {
        return WalletData.ConnectPeerRequest.class;
    }
}

