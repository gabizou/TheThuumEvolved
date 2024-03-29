package com.reilaos.bukkit.TheThuum;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.reilaos.bukkit.TheThuum.shouts.ShoutType;

public class shoutCommandExecuter implements CommandExecutor
{
	Plugin plugin;
	
	public shoutCommandExecuter(Plugin p)
	{
		plugin = p;
	}
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) 
	{
    	Player player = null;
    	if(sender instanceof Player){
    		player = (Player)sender;
    	}
    	else
    	{
    		plugin.log.info("This command may not be used through console.");
    		return false;
    	}
    	if(player != null)
    	{
    			if(command.getName().equalsIgnoreCase("fus"))
    			{
    				if(args.length == 2)
    				{
    					if(args[0].equalsIgnoreCase("Ro") && args[1].equalsIgnoreCase("Dah"))
    					{
    						shout(player, ShoutType.FUSRODAH, 3);
    						return true;
    					}
    				}
    				else if(args.length == 1)
    				{
    					if(args[0].equalsIgnoreCase("Ro"))
    					{
    						shout(player, ShoutType.FUSRODAH, 2);
    						return true;
    					}
    				}
    				else if(args.length == 0)
    				{
    					shout(player, ShoutType.FUSRODAH, 1);
    					return true;
    				}
    				else
    				{
    					//probably more arguments then actually exist
    					player.sendMessage(ChatColor.RED + "You shouted too many words.");
    					return true;
    				}
    			}
    			else if(command.getName().equalsIgnoreCase("feim"))
    			{
    				if(args.length == 2)
    				{
    					if(args[0].equalsIgnoreCase("Zii") && args[1].equalsIgnoreCase("Gron"))
    					{
    						shout(player, ShoutType.FEIMZIIGRON, 3);
    						return true;
    					}
    				}
    				else if(args.length == 1)
    				{
    					if(args[0].equalsIgnoreCase("Zii"))
    					{
    						shout(player, ShoutType.FEIMZIIGRON, 2);
    						return true;
    					}
    				}
    				else if(args.length == 0)
    				{
    					shout(player, ShoutType.FEIMZIIGRON, 1);
    					return true;
    				}
    				else
    				{
    					//probably more arguments then actually exist
    					player.sendMessage(ChatColor.RED + "You shouted too many words.");
    					return true;
    				}
    			}
    			else if(command.getName().equalsIgnoreCase("kaan"))
    			{
    				if(args.length == 2)
    				{
    					if(args[0].equalsIgnoreCase("Drem") && args[1].equalsIgnoreCase("Ov"))
    					{
    						shout(player, ShoutType.KAANDREMOV, 3);
    						return true;
    					}
    				}
    				else if(args.length == 1)
    				{
    					if(args[0].equalsIgnoreCase("Drem"))
    					{
    						shout(player, ShoutType.KAANDREMOV, 2);
    						return true;
    					}
    				}
    				else if(args.length == 0)
    				{
    					shout(player, ShoutType.KAANDREMOV, 1);
    					return true;
    				}
    				else
    				{
    					//probably more arguments then actually exist
    					player.sendMessage(ChatColor.RED + "You shouted too many words.");
    					return true;
    				}
    			}
    			else if(command.getName().equalsIgnoreCase("laas"))
    			{
    				if(args.length == 2)
    				{
    					if(args[0].equalsIgnoreCase("Yah") && args[1].equalsIgnoreCase("Nir"))
    					{
    						shout(player, ShoutType.LAASYAHNIR, 3);
    						return true;
    					}
    				}
    				else if(args.length == 1)
    				{
    					if(args[0].equalsIgnoreCase("Yah"))
    					{
    						shout(player, ShoutType.LAASYAHNIR, 2);
    						return true;
    					}
    				}
    				else if(args.length == 0)
    				{
    					shout(player, ShoutType.LAASYAHNIR, 1);
    					return true;
    				}
    				else
    				{
    					//probably more arguments then actually exist
    					player.sendMessage(ChatColor.RED + "You shouted too many words.");
    					return true;
    				}
    			}
    			else if(command.getName().equalsIgnoreCase("lok"))
    			{
    				if(args.length == 2)
    				{
    					if(args[0].equalsIgnoreCase("Vah") && args[1].equalsIgnoreCase("Koor"))
    					{
    						shout(player, ShoutType.LOKVAHKOOR, 3);
    						return true;
    					}
    				}
    				else if(args.length == 1)
    				{
    					if(args[0].equalsIgnoreCase("Vah"))
    					{
    						shout(player, ShoutType.LOKVAHKOOR, 2);
    						return true;
    					}
    				}
    				else if(args.length == 0)
    				{
    					shout(player, ShoutType.LOKVAHKOOR, 1);
    					return true;
    				}
    				else
    				{
    					//probably more arguments then actually exist
    					player.sendMessage(ChatColor.RED + "You shouted too many words.");
    					return true;
    				}
    			}
    			else if(command.getName().equalsIgnoreCase("wuld"))
    			{
    				if(args.length == 2)
    				{
    					if(args[0].equalsIgnoreCase("Nah") && args[1].equalsIgnoreCase("Kest"))
    					{
    						shout(player, ShoutType.WULDNAHKEST, 3);
    						return true;
    					}
    				}
    				else if(args.length == 1)
    				{
    					if(args[0].equalsIgnoreCase("Nah"))
    					{
    						shout(player, ShoutType.WULDNAHKEST, 2);
    						return true;
    					}
    				}
    				else if(args.length == 0)
    				{
    					shout(player, ShoutType.WULDNAHKEST, 1);
    					return true;
    				}
    				else
    				{
    					//probably more arguments then actually exist
    					player.sendMessage(ChatColor.RED + "You shouted too many words or gibberish.");
    					return true;
    				}
    			}
    			else if(command.getName().equalsIgnoreCase("yol"))
    			{
    				if(args.length == 2)
    				{
    					if(args[0].equalsIgnoreCase("Toor") && args[1].equalsIgnoreCase("Shul"))
    					{
    						shout(player, ShoutType.YOLTOORSHUL, 3);
    						return true;
    					}
    				}
    				else if(args.length == 1)
    				{
    					if(args[0].equalsIgnoreCase("Toor"))
    					{
    						shout(player, ShoutType.YOLTOORSHUL, 2);
    						return true;
    					}
    				}
    				else if(args.length == 0)
    				{
    					shout(player, ShoutType.YOLTOORSHUL, 1);
    					return true;
    				}
    				else
    				{
    					//probably more arguments then actually exist
    					player.sendMessage(ChatColor.RED + "You shouted too many words.");
    					return true;
    				}
    			}
    		}
    	
    	return false;
	}
	
	// Checks permissions, cooldown, performs shout if this checks out.
		public static void shout(Player dragonBorn, ShoutType word, int level){
			if (level > 3 || level < 0) return;
			
			if (!Shared.cascadePermission(dragonBorn,"thuum.shout." + word.toString().toLowerCase() + "." + level)) return;
			
			if (!Shared.cascadePermission(dragonBorn, "thuum.ignorecooldown." + word.toString().toLowerCase() + "." + level)) {
				if (!Plugin.thisOne.arngeir.putOnCooldown(dragonBorn, word, level)) {
					dragonBorn.sendMessage(Plugin.thisOne.getConfig().getString("cooldown.alert message"));
					return;
				}
			}
			word.shout.shout(dragonBorn, level);
		}
}
