package config;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/resources/config/config.properties")
public interface FrameWorkConfig extends Config
{
    long timeout();
    String url();
    String browser();
    String runmode();
    String remoteurl();


}
