/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.gsap.core;

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
