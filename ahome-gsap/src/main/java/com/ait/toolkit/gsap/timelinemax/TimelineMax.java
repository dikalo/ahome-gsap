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

import com.ait.toolkit.gsap.core.SimpleTimeLine;
import com.ait.toolkit.gsap.timelinelite.TimelineLite;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.core.shared.GWT;

public class TimelineMax extends TimelineLite {

    private static final TimeLineMaxResources resources = GWT.create( TimeLineMaxResources.class );

    static {
        if( !isLoaded() ) {
            load();
        }
    }

    TimelineMax() {}

    public TimelineMax( TimelineMaxConfig config ) {
        jsObj = createNativePeer( config.getJsObj() );
    }

    private native JavaScriptObject createNativePeer( JavaScriptObject config )/*-{
		return new $wnd.TimelineMax(config);
    }-*/;

    public native <T extends SimpleTimeLine> T repeat( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.repeat(value);
		return this
    }-*/;

    private static void load() {
        ScriptInjector.fromString( resources.js().getText() ).setWindow( ScriptInjector.TOP_WINDOW ).inject();
    }

    private static native boolean isLoaded()/*-{
		if (typeof $wnd.TimelineMax === "undefined"
				|| $wnd.TimelineMax === null) {
			return false;
		}
		return true;
    }-*/;

}
