package de.xenau.giantitems.commands;

import de.xenau.giantitems.GiantItems;
import de.xenau.giantitems.utils.SpawnGianItem;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player player = (Player) sender;

            if(player.hasPermission("items.spawn")) {

                if(args.length == 0) {

                    if(new ItemStack(player.getItemInHand()) != null) {

                        SpawnGianItem.spawnGiantItem(player.getLocation().clone().subtract(0, 7, 0), new ItemStack(player.getItemInHand()));

                    }else {

                        player.sendMessage(GiantItems.prefix + "Bitte halte ein Item in der Hand!");

                    }

                }else {

                    player.sendMessage(GiantItems.prefix + "Bitte nutze §e/items");

                }

            }else {

                player.sendMessage(GiantItems.prefix + "§cDazu bist du nicht berechtigt!");

            }

        }else {

            sender.sendMessage("Du bist kein Spieler!");

        }

        return false;
    }
}
