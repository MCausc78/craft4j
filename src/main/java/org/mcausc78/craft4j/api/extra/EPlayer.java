package org.mcausc78.craft4j.api.extra;

import java.util.List;
import org.bukkit.entity.Player;
public class EPlayer {
    Player player;
    public EPlayer(Player player) {
        this.player = player;
    }
    public void sendMessage(List<String> messages) {
        messages.forEach(this.player::sendMessage);
    }
    public EPlayer getInstance() {
        return this;
    }
}
