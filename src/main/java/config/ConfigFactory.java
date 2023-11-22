package config;

public final class ConfigFactory
{
    private ConfigFactory() {};

    public static FrameWorkConfig getConfig()
    {
        return org.aeonbits.owner.ConfigFactory.create(FrameWorkConfig.class);
    }
}
