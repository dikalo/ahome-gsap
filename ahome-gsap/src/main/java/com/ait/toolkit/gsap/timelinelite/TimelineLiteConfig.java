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
package com.ait.toolkit.gsap.timelinelite;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.gsap.core.Align;
import com.ait.toolkit.gsap.core.Animation;
import com.google.gwt.core.client.JavaScriptObject;

public class TimelineLiteConfig extends JsObject {

    public TimelineLiteConfig() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * Amount of delay in seconds (or frames for frames-based tweens) before the
     * tween should begin.
     * 
     * @param value
     */
    public void setDelay( double value ) {
        JsoHelper.setAttribute( jsObj, "delay", value );
    }

    /**
     * A function that should be called when the tween has completed
     * 
     * @param callback
     */
    public void setOnComplete( Function callback ) {
        JsoHelper.setAttribute( jsObj, "onComplete", fromFunction( callback ) );
    }

    /**
     * If useFrames is true, the tweens's timing will be based on frames instead
     * of seconds because it is intially added to the root frames-based
     * timeline. This causes both its duration and delay to be based on frames.
     * An animations's timing mode is always determined by its parent timeline.
     * 
     * @param value
     */
    public void setUseFrames( boolean value ) {
        JsoHelper.setAttribute( jsObj, "useFrames", value );
    }

    /**
     * To immediately insert several tweens into the timeline, 
     * use the tweens special property to pass in an Array of TweenLite/TweenMax/TimelineLite/TimelineMax instances.
     *  You can use this in conjunction with the align and stagger special properties to set up complex sequences with minimal code. 
     *  These values simply get passed to the add() method.
     */
    public void setTweens( Animation... animations ) {
        JavaScriptObject peers = JsoHelper.createJavaScriptArray();
        for( int i = 0; i < animations.length; i++ ) {
            JsoHelper.arraySet( peers, i, animations[i].getJsObj() );
        }
        JsoHelper.setAttribute( jsObj, "tweens", peers );
    }

    /**
    * Only used in conjunction with the tweens special property when multiple tweens are to be inserted immediately.
    * The align special property does not force all child tweens/timelines to maintain relative positioning, so for example, 
    * if you use "sequence" and then later change the duration of one of the nested tweens, 
    * it does not force all subsequent timelines to change their position. 
    * The align special property only affects the alignment of the tweens that are initially placed into the timeline through 
    * the tweens special property of the vars object.
     */
    public void setAlign( Align value ) {
        JsoHelper.setAttribute( jsObj, "align", value.name().toLowerCase() );
    }

    /**
      Only used in conjunction with the tweens special property when multiple tweens are to be inserted immediately.
      It staggers the tweens by a set amount of time in seconds (or in frames if useFrames is true).
      For example, if the stagger value is 0.5 and the "align" property is set to "start", 
      the second tween will start 0.5 seconds after the first one starts, then 0.5 seconds later the third one will start, etc. 
      If the align property is "sequence", there would be 0.5 seconds added between each tween. 
      This value simply gets passed to the add() method. Default is 0.
     */
    public void setStagger( double value ) {
        JsoHelper.setAttribute( jsObj, "stagger", value );
    }

    /**
     * A function that should be called when the tween begins (when its time
     * changes from 0 to some other value which can happen more than once if the
     * tween is restarted multiple times).
     */
    public void setOnStart( Function callback ) {
        JsoHelper.setAttribute( jsObj, "onStart", fromFunction( callback ) );
    }

    /**
     * A function that should be called every time the tween updates (on every
     * frame while the tween is active)
     */
    public void setOnUpdate( Function callback ) {
        JsoHelper.setAttribute( jsObj, "onUpdate", fromFunction( callback ) );
    }

    /**
     * A function that should be called when the tween has reached its beginning
     * again from the reverse direction. For example, if reverse() is called the
     * tween will move back towards its beginning and when its time reaches 0,
     * onReverseComplete will be called. This can also happen if the tween is
     * placed in a TimelineLite or TimelineMax instance that gets reversed and
     * plays the tween backwards to (or past) the beginning.
     */
    public void setOnReverseComplete( Function callback ) {
        JsoHelper.setAttribute( jsObj, "onReverseComplete",
            fromFunction( callback ) );
    }

    public void setAutoRemoveChildren( boolean value ) {
        JsoHelper.setAttribute( jsObj, "autoRemoveChildren", value );
    }

    public void setSmoothChildTiming( boolean value ) {
        JsoHelper.setAttribute( jsObj, "smoothChildTiming   ", value );
    }

    protected native JavaScriptObject fromFunction( Function fn )/*-{
		return function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		};
    }-*/;

}
