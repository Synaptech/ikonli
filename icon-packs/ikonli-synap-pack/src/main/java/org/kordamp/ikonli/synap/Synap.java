/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2015-2020 Andres Almiray
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
 */
package org.kordamp.ikonli.synap;
import org.kordamp.ikonli.Ikon;

/**
 * @author Polly Kummerfeldt aka honestPolly
 */
public enum Synap implements Ikon {
    BATTLESHIP("icon-battleship", '\ue900'),
    SATELLITE("icon-satellite", '\ue901'),
    BATTLESHIP_ON_WATER("icon-battleshiponwater", '\ue902');

    public static Synap findByDescription(String description) {
        for (Synap font : values()) {
            if (font.getDescription().equals(description)) {
                return font;
            }
        }
        throw new IllegalArgumentException("Icon description '" + description + "' is invalid!");
    }

    private String description;
    private char code;

    Synap(String description, char code) {
        this.description = description;
        this.code = code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public char getCode() {
        return code;
    }
}
