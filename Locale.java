package me.imagemap.data;

public enum Locale {
    //Create Command
    CREATE_COMMAND_DESCRIPTION,
    NO_PERMISSION_FOR_COMMAND,
    BLACKLISTED_WORD_IN_LINK,
    IMG_NOT_FOUND,
    MAP_PURCHASE_SUCCESSFUL_MONEY,
    INSUFFICIENT_FUNDS,
    INVALID_ITEM_CONFIG,
    MAP_PURCHASE_SUCCESSFUL_ITEMS,
    INSUFFICIENT_ITEMS,
    MAP_CREATION_SUCCESSFUL,
    //Create Command - End

    //Help Command
    HELP_COMMAND_DESCRIPTION,
    //Help Command - End

    //Reload Command
    RELOAD_COMMAND_DESCRIPTION,
    RELOAD_SUCCESSFUL,
    RELOAD_FAILED,
    //Reload Command - End

    //Command Manager
    INVALID_COMMAND,
    HELP_SUGGESTION;
    //Command Manager - End

    public static String getLocale(Locale locale) {
        return locale.toString();
    }

    public static String getLocaleColor(Locale locale) {
        return locale.toString();
    }
}
