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
package com.ait.toolkit.gsap.timelinemax;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gsap.timelinelite.TimelineLiteConfig;

public class TimelineMaxConfig extends TimelineLiteConfig {

    public TimelineMaxConfig() {
        jsObj = JsoHelper.createObject();
    }

    /**
    * Number - Number of times that the animation should repeat after its first iteration. For example, if repeat is 1, the animation will play a total of twice (the initial play plus 1 repeat). 
    * To repeat indefinitely, use -1. repeat should always be an integer.
    * @param value
     */
    public void setRepeat( int value ) {
        JsoHelper.setAttribute( jsObj, "repeat", value );
    }

    /**
     * Number - Number - Amount of time in seconds (or frames for frames-based tweens) between repeats. For example, if repeat is 2 and repeatDelay is 1, the animation will play initially, then wait for 1 second before it repeats, then play again, 
     * then wait 1 second again before doing its final repeat.
     */
    public void setRepeatDelay( int value ) {
        JsoHelper.setAttribute( jsObj, "repeatDelay", value );
    }

    /**
     *  Boolean - If true, every other repeat cycle will run in the opposite direction so that the tween appears to go back and forth (forward then backward). This has no affect on the "reversed" property though. So if repeat is 2 and yoyo isfalse, it will look like: start - 1 - 2 - 3 - 1 - 2 - 3 - 1 - 2 - 3 - end. 
     *  But if yoyo is true, it will look like: start - 1 - 2 - 3 - 3 - 2 - 1 - 1 - 2 - 3 - end.
     */
    public void setYoyo( boolean value ) {
        JsoHelper.setAttribute( jsObj, "yoyo", value );
    }

}
