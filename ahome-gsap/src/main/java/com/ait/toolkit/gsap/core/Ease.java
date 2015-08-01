/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.gsap.core;

/**
 * Defines different animation easing functions
 */

// TODO : Finish enums
public enum Ease {

    BACK_EASE_IN( "Back.easeIn" ),
    BACK_EASE_OUT( "Back.easeOut" ),
    BACK_EASE_IN_OUT( "Back.easeInOut" ),
    BOUNCE_EASE_IN( "Bounce.easeIn" ),
    BOUNCE_EASE_OUT( "Bounce.easeOut" ),
    BOUNCE_EASE_IN_OUT( "Bounce.easeInOut" ),
    ELASTIC_IN( "Elastic.easeIn" ),
    ELASTIC_EASE_OUT( "Elastic.easeOut" ),
    ELASTIC_EASE_IN_OUT( "Elastic.easeInOut" );

    private Ease( String value ) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return this.value;
    }
}
