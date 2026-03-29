package kr.antos112.ict.api;

import kr.antos112.ict.api.type.ItemCoolTimeType;
import org.bukkit.entity.Item;

public class ItemCoolTimeAPI {
    private Item item;
    private ItemCoolTimeType type;
    private int cooltime;

    // 생성자
    public ItemCoolTimeAPI(Item item,int cooltime,ItemCoolTimeType type) {
        this.item = item;
        this.cooltime = cooltime;
        this.type = type;
    }

    // setter
    public void setItem(Item item) {
        this.item = item;
    }

    public void setCooltime(int cooltime) {
        this.cooltime = cooltime;
    }

    public void setType(ItemCoolTimeType type) {
        this.type = type;
    }

    // getter
    public Item getItem() {
        return this.item;
    }

    public int getCooltime() {
        return this.cooltime;
    }

    public ItemCoolTimeType getType() {
        return this.type;
    }
}
