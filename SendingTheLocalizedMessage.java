//Sending a message to player
p.sendMessage(ChatColor.translateAlternateColorCodes('&', LanguageConfig.getLangConfig().getString(Locale.getLocale(Locale.NO_PERMISSION_FOR_COMMAND))));

//Sending a message to console
Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', LanguageConfig.getLangConfig().getString(Locale.getLocale(Locale.NO_PERMISSION_FOR_COMMAND))));
