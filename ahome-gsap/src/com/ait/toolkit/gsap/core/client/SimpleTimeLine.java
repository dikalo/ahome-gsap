package com.ait.toolkit.gsap.core.client;

import java.util.Arrays;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * SimpleTimeLine is the base class for TimelineLite and <T extends
 * SimpleTimeLine> T, providing the most basic timeline functionality and it is
 * used for the root timelines in TweenLite but is only intended for internal
 * use in the GreenSock tweening platform. It is meant to be very fast and
 * lightweight.
 * 
 */
public class SimpleTimeLine extends Animation {

    protected SimpleTimeLine() {

    }

    protected SimpleTimeLine(JavaScriptObject obj) {
        jsObj = obj;
    }

    public native <T extends SimpleTimeLine> T add(Animation animation)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this
    }-*/;

    public <T extends SimpleTimeLine> T add(List<Animation> animations) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (Animation animation : animations) {
            peers.push(animation.getJsObj());
        }
        return _add(peers);
    }

    public <T extends SimpleTimeLine> T add(Animation... animations) {
        return add(Arrays.asList(animations));
    }

    public <T extends SimpleTimeLine> T add(String position, Animation... animations) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (Animation animation : animations) {
            peers.push(animation.getJsObj());
        }
        return _add(peers, position);
    }

    public native <T extends SimpleTimeLine> T add(Animation animation, String position)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(animation.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				position);
		return this
    }-*/;

    public <T extends SimpleTimeLine> T add(List<Animation> animations, String position, String align) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (Animation animation : animations) {
            peers.push(animation.getJsObj());
        }
        return _add(peers, position, align);
    }

    public <T extends SimpleTimeLine> T add(String position, String align, Animation... animations) {
        return add(Arrays.asList(animations), position, align);
    }

    public <T extends SimpleTimeLine> T add(String position, String align, double stagger, Animation... animations) {
        JsArray<JavaScriptObject> peers = JsArray.createArray().cast();
        for (Animation animation : animations) {
            peers.push(animation.getJsObj());
        }
        return _add(peers, position, align, stagger);
    }

    private native <T extends SimpleTimeLine> T _add(JavaScriptObject animations)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var array = new $wnd.Array();
		for ( var i = 0; i < animations.lenght; i++) {
			array.push(animations[i]);
		}
		peer.add(array, "+=0", "sequance", 2);
		return this
    }-*/;

    private native <T extends SimpleTimeLine> T _add(JavaScriptObject animations, String position)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var array = new $wnd.Array();
		for ( var i = 0; i < animations.lenght; i++) {
			array.push(animations[i]);
		}
		peer.add(array, position);
		return this
    }-*/;

    private native <T extends SimpleTimeLine> T _add(JavaScriptObject animations, String position, String align)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var array = new $wnd.Array();
		for ( var i = 0; i < animations.lenght; i++) {
			array.push(animations[i]);
		}
		peer.add(array, position, align);
		return this
    }-*/;

    private native <T extends SimpleTimeLine> T _add(JavaScriptObject animations, String position, String align,
                    double stagger)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var array = new $wnd.Array();
		for ( var i = 0; i < animations.lenght; i++) {
			array.push(animations[i]);
		}
		peer.add(array, position, stagger);
		return this;
    }-*/;

}
