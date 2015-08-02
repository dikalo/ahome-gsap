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

import com.ait.toolkit.gsap.core.SimpleTimeLine;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

public class TimelineLite extends SimpleTimeLine {

    private static final TimeLineLiteResources resources = GWT.create( TimeLineLiteResources.class );

    static {
        if( !isLoaded() ) {
            load();
        }
    }

    protected TimelineLite() {

    }

    public TimelineLite( TimelineLiteConfig config ) {
        jsObj = createNativePeer( config.getJsObj() );
    }

    TimelineLite( JavaScriptObject peer ) {
        jsObj = peer;
    }

    private native JavaScriptObject createNativePeer( JavaScriptObject config )/*-{
		return new $wnd.TimelineLite(config);
    }-*/;

    /**
     * Adds a label to the timeline, making it easy to mark important positions/times.
     * @param label
     * @return
     */
    public native <T extends SimpleTimeLine> T addLabel( String label )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addLabel(label);
		return this
    }-*/;

    /**
     * Adds a label to the timeline, making it easy to mark important positions/times.
     * @param label
     * @param position
     * @return
     */
    public native <T extends SimpleTimeLine> T addLabel( String label, Object position )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.addLabel(label, position);
		return this
    }-*/;

    public native <T extends SimpleTimeLine> T reverseTimeLine()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.reverse();
		return this
    }-*/;

    /**
     * Method for creating a TimelineLite instance that animates to the specified destination values (from the current values).
     * 
     * @param target
     *            , Target object whose properties this tween affects.
     * @param duration
     *            ,Duration in seconds
     * @param config
     *            , An object defining the end value for each property that should be tweened as well as any special properties like onComplete, ease, etc.
     * @return self (makes chaining easier)
     */
    public TimelineLite to( Widget target, double duration, TimelineLiteConfig config ) {
        return to( target.getElement(), duration, config );
    }

    /**
     * Method for creating a TimelineLite instance that animates to the specified destination values (from the current values).
     * 
     * @param target
     *            , Target object whose properties this tween affects.
     * @param duration
     *            ,Duration in seconds
     * @param config
     *            , An object defining the end value for each property that should be tweened as well as any special properties like onComplete, ease, etc.
     * @return self (makes chaining easier)
     */
    public native TimelineLite to( Element target, double duration, TimelineLiteConfig config )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.to(target, duration,
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.timelinelite.TimelineLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public TimelineLite to( TimelineLiteConfig config, double duration, Widget... targets ) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for( Widget el : targets ) {
            elements.push( el.getElement() );
        }
        return _to( elements, duration, config );
    }

    public TimelineLite to( TimelineLiteConfig config, double duration, Element... targets ) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for( Element el : targets ) {
            elements.push( el );
        }
        return _to( elements, duration, config );
    }

    private native TimelineLite _to( JavaScriptObject target, double duration, TimelineLiteConfig config )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.to(target, duration,
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.timelinelite.TimelineLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Method for creating a TimelineLite instance that animates to the specified destination values (from the current values).
     * 
     * @param target
     *            , id of Target object whose properties this tween affects.
     * @param duration
     *            ,Duration in seconds
     * @param config
     *            , An object defining the end value for each property that should be tweened as well as any special properties like onComplete, ease, etc.
     * @return self (makes chaining easier)
     */
    public native TimelineLite to( String target, double duration, TimelineLiteConfig config )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.to(target, duration,
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.timelinelite.TimelineLite::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    private static void load() {
        ScriptInjector.fromString( resources.js().getText() ).setWindow( ScriptInjector.TOP_WINDOW ).inject();
    }

    private static native boolean isLoaded()/*-{
		if (typeof $wnd.TimelineLite === "undefined"
				|| $wnd.TimelineLite === null) {
			return false;
		}
		return true;
    }-*/;

}
