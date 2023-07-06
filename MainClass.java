@Override
public void onEnable() {
  ....
  initializeLang();
}

....

private void initializeLang() {
        LanguageConfig.setupLang();

        //Lang defaults T-T
        //LanguageConfig.getLangConfig().addDefault("example", "Hello this is en_US");

        for (Locale localeMessage : Locale.values()) {
            LanguageConfig.getLangConfig().addDefault(localeMessage.toString(), getConfig().getString(String.valueOf(localeMessage)));
        }
        //Lang defaults - End

        LanguageConfig.getLangConfig().options().copyDefaults(true);
        LanguageConfig.saveLangConfig();
}
