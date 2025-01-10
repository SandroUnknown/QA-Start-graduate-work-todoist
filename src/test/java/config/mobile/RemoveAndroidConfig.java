package config.mobile;

import org.aeonbits.owner.Config;

@Config.Sources({
        //"classpath:properties/remove.properties"
        "classpath:properties/browserstack.properties"
})
public interface RemoveAndroidConfig extends Config {

    @Key("browserstack.user")
    String getBrowserstackUser();

    @Key("browserstack.key")
    String getBrowserstackKey();

    @Key("app")
    String getApp();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("device")
    String getDevice();

    @Key("os_version")
    String getOsVersion();

    //============

    /*@Key("browserstack.user")
    String getBrowserstackUser();

    @Key("browserstack.key")
    String getBrowserstackKey();

    @Key("android.app")
    String getApp();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("android.device")
    String getDevice();

    @Key("android.os_version")
    String getOsVersion();*/
}