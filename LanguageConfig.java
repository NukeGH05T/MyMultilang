package me.imagemap.utils;

import me.imagemap.ImageMap;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class LanguageConfig {
  //Totally didn't steal your code from custom config tutorial XD

    private static File langFile;
    private static FileConfiguration langConfig;
    static String langFileName = ImageMap.plugin.getConfig().getString("lang-file");

    public static void setupLang() {
        //Call it in onEnable()
        //System.out.println("Path: " + ImageMap.plugin.getDataFolder() + "\\language");
        langFile = new File(ImageMap.plugin.getDataFolder() + "\\language", langFileName);

        if (!langFile.exists()) {
            try {
                langFile.createNewFile();
            } catch (IOException e) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "[ImageMapPlus] Please ignore the following warning if it starts with " + ChatColor.GREEN + "The system cannot find the path specified");
                Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "[ImageMapPlus] The language file does not exist and is being created.");
                e.printStackTrace();
            }
        }

        langConfig = YamlConfiguration.loadConfiguration(langFile);
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[ImageMapPlus] Successfully loaded " + ChatColor.DARK_AQUA + langFileName);
    }

    public static FileConfiguration getLangConfig() {
        return langConfig;
    }
    
    public static void saveLangConfig() {
        try {
            langConfig.save(langFile);
        } catch (IOException e) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Something went wrong while saving the file!");
            e.printStackTrace();
        }
    }

    public static void reloadLangConfig() {
        langConfig = YamlConfiguration.loadConfiguration(langFile);
        //Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + langConfig.getString("example"));
    }

}
