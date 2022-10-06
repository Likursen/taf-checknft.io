package io.checknft.api.utils.interfaces;

import org.aeonbits.owner.Config;

public interface Property extends Config {
    @Key("token")
    String token();
}