package org.example.party.websocket.packet;

import org.json.JSONObject;


public class JoinGamePacket implements Packet{
    int joinId;
    String name;
    @Override
    public void read(JSONObject json) {
        JSONObject data = json.getJSONObject("data");
        this.joinId = data.getInt("joinId");
        this.name = data.getString("name");
    }

    @Override
    public JSONObject write() {
        JSONObject json = new JSONObject();
        json.put("id", 2).put("data", new JSONObject().put("joinId", this.joinId));
        return json;
    }
}
