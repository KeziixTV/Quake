package com.Geekpower14.Quake.Stuff.Hoe;

import com.Geekpower14.Quake.Arena.APlayer;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class GoldHoe extends HoeBasic{

	public GoldHoe()
	{
		super("goldenhoe",
				ChatColor.GOLD + "GoldenGun",
                secondToTick(1.5),
				FireworkEffect.builder().withColor(Color.ORANGE).with(FireworkEffect.Type.BURST).build());
        //this.aim = 1.4;
	}

	public ItemStack getItem() {
		ItemStack coucou = setItemNameAndLore(new ItemStack(Material.GOLD_HOE), ChatColor.GOLD + "GoldenGun", new String[]{
			ChatColor.DARK_GRAY + "Recharge en " + ChatColor.GOLD +"1.5" + ChatColor.DARK_GRAY + " secondes."
		}, false);

		return coucou;
	}

	public void leftAction(APlayer p) {
		return;		
	}

	public void rightAction(APlayer ap) {
		basicShot(ap.getP());		
	}

}