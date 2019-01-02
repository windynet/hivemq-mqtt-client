/*
 * Copyright 2018 The MQTT Bee project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.mqttbee.internal.mqtt.message.publish.pubrel.mqtt3;

import org.jetbrains.annotations.NotNull;
import org.mqttbee.annotations.Immutable;
import org.mqttbee.internal.mqtt.datatypes.MqttUserPropertiesImpl;
import org.mqttbee.internal.mqtt.message.publish.pubrel.MqttPubRel;
import org.mqttbee.mqtt.mqtt3.message.publish.pubrel.Mqtt3PubRel;
import org.mqttbee.mqtt.mqtt5.message.publish.pubrel.Mqtt5PubRelReasonCode;

/**
 * @author Silvio Giebl
 */
@Immutable
public class Mqtt3PubRelView implements Mqtt3PubRel {

    public static final @NotNull Mqtt3PubRelView INSTANCE = new Mqtt3PubRelView();

    public static @NotNull MqttPubRel delegate(final int packetIdentifier) {
        return new MqttPubRel(packetIdentifier, Mqtt5PubRelReasonCode.SUCCESS, null,
                MqttUserPropertiesImpl.NO_USER_PROPERTIES);
    }

    private Mqtt3PubRelView() {}
}