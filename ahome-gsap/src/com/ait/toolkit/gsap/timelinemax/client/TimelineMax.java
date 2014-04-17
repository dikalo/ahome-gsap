package com.ait.toolkit.gsap.timelinemax.client;

import com.ait.toolkit.gsap.core.client.SimpleTimeLine;
import com.google.gwt.core.client.JavaScriptObject;

public class TimelineMax extends SimpleTimeLine {

    public TimelineMax() {
        jsObj = createNativePeer();
    }

    private native JavaScriptObject createNativePeer()/*-{
		return new $wnd.TimelineMax();
    }-*/;

    public native <T extends SimpleTimeLine> T reverseTimeLine()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.reverse();
		return this
    }-*/;

}
