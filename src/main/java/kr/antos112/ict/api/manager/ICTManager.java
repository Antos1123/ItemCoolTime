package kr.antos112.ict.api.manager;

import kr.antos112.ict.api.ItemCoolTimeAPI;
import org.bukkit.entity.Item;

public interface ICTManager {
    void addItemCooltime(ItemCoolTimeAPI api);
    void removerItemCooltime(ItemCoolTimeAPI api);
    Item getItemCooltime(Item item);
    void loadMails();
}
