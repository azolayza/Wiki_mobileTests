package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/androidEmulator.properties"})
public interface AndroidEmulatorConfig extends Config {

    @Key("hubUrl")
    String hubUrl();

    @Key("deviceName")
    String deviceName();

    @Key("version")
    String version();

    @Key("platformName")
    String platformName();

    @Key("locale")
    String locale();

    @Key("language")
    String language();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();

    @Key("app")
    String app();
}
