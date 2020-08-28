package org.example.party.websocket.packet;

import org.json.JSONObject;
import java.util.Random;


public class HostGamePacket implements Packet{
    int id;
    String host;

    @Override
    public void read(JSONObject json) {
        JSONObject data = json.getJSONObject("data");
        this.id = data.getInt("id");
        this.host = data.getString("name");
    }

    @Override
    public JSONObject write() {
        Random r = new Random();
        this.id = r.nextInt(10000);
        JSONObject json = new JSONObject().put("id", 1)
                .put("data", new JSONObject()
                        .put("id", id));
        return json;
    }
}
