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

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsoHelper;

/**
 * Configuration object for tween max animations
 */
public class TweenMaxConfig extends TweenLiteConfig {

    public TweenMaxConfig() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Number of times that the tween should repeat after its first iteration.
     * For example, if repeat is 1, the tween will play a total of twice (the
     * initial play plus 1 repeat). To repeat indefinitely, use -1. repeat
     * should always be an integer.
     */
    public void setRepeat( int value ) {
        setProperty( "repeat", value );
    }

    public void setRepeatDelay( int value ) {
        setProperty( "repeatDelay", value );
    }

    public void setYoyo( boolean value ) {
        JsoHelper.setAttribute( jsObj, "yoyo", value );
    }

    public void setOnRepeat( Function callback ) {
        JsoHelper.setAttribute( jsObj, "onRepeat", fromFunction( callback ) );
    }

    public void setStartAt( TweenLiteConfig obj ) {
        JsoHelper.setAttribute( jsObj, "startAt", obj.getJsObj() );
    }

}
