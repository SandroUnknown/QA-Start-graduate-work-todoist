package config.api;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/${env}.properties",
        "classpath:properties/${apiEnv}.properties",
        "classpath:properties/local.properties"
})
public interface ApiConfig extends Config {

    @Key("api_base_uri")
    String getBaseUri();
}