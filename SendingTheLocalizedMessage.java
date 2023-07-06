//Grabbing stuff
FileConfiguration lang = LanguageConfig.getLangConfig();
String prefix = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("prefix"));

//Sending a message to player
p.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', lang.getString(Locale.getLocale(Locale.NO_PERMISSION_FOR_COMMAND)));

//Sending a message to console
Bukkit.getConsoleSender().sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', lang.getString(Locale.getLocale(Locale.NO_PERMISSION_FOR_COMMAND))));
