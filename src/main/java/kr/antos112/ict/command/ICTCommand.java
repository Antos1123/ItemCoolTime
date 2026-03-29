package kr.antos112.ict.command;

import kr.antos112.ict.ItemCoolTime;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ICTCommand implements TabExecutor {
    Plugin plugin = ItemCoolTime.getInstance();

    public ICTCommand() {
        PluginCommand command = plugin.getServer().getPluginCommand("쿨타임");
        if (command != null) {
            command.setExecutor(this);
        }
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage("");
                player.sendMessage("§e§m                                                    ");
                player.sendMessage("");
                player.sendMessage("  §2[] §f= 선택 인자");
                player.sendMessage("  §6<> §f= 필수 인자");
                player.sendMessage("");
                player.sendMessage(" /" + label + " 설정 §6<부여항목> §6<초> §7- 해당 아이템의 쿨타임을 설정합니다");
                player.sendMessage(" /" + label + " 제거 §6<부여항목> §7- 해당 아이템의 쿨타임을 제거합니다");
                player.sendMessage(" /" + label + " 초기화 §2[all] §7- 해당 아이템의 쿨타임을 초기화합니다");
                player.sendMessage("");
                player.sendMessage("§e§m                                                    ");
                player.sendMessage("");
            } else if (args[0].equals("설정")) {
                if (player.getInventory().getItemInMainHand() != null) {
                    if (args.length == 1) {
                        player.sendMessage("§c쿨타임을 부여할 항목을 입력해주세요!");
                    } else if (args.length == 2) {
                        player.sendMessage("§c부여할 쿨타임(초 단위)을 입력해주세요!");
                    } else {

                    }
                } else {
                    player.sendMessage("§c오른손에 아이템을 들고있어야합니다!");
                }
            }
        } else {
            sender.sendMessage("§c해당 명령어는 플레이어만 입력가능합니다.");
        }
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String @NotNull [] args) {
        return List.of();
    }
}
