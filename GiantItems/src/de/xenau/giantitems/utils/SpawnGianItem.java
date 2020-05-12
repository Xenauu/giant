package de.xenau.giantitems.utils;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Giant;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpawnGianItem {

    public static void spawnGiantItem(Location location, ItemStack itemStack) {

        Giant giant = location.getWorld().spawn(location, Giant.class);
        giant.getEquipment().setItemInHand(itemStack);
        giant.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 999));

        ArmorStand armorStand = location.getWorld().spawn(location, ArmorStand.class);
        armorStand.setGravity(false);
        armorStand.setVisible(false);

        armorStand.setPassenger(giant);

    }

}
