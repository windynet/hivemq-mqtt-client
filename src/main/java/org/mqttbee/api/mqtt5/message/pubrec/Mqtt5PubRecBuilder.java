package org.mqttbee.api.mqtt5.message.pubrec;

import org.mqttbee.annotations.NotNull;
import org.mqttbee.api.mqtt5.message.Mqtt5UserProperties;

/**
 * @author Silvio Giebl
 */
public interface Mqtt5PubRecBuilder {

    Mqtt5PubRecBuilder withUserProperties(@NotNull Mqtt5UserProperties userProperties);

}
