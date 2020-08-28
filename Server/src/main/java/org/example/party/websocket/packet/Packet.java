package org.example.party.websocket.packet;

import org.json.JSONObject;

public interface Packet {
    public void read(JSONObject json);
    public JSONObject write();
}
