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
package com.ait.toolkit.gsap.tweenmax.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.gsap.core.client.Animation;
import com.ait.toolkit.gsap.core.client.TweenMaxConfig;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * TweenMax extends TweenMax, adding many useful (but non-essential) features
 * like timeScale(), repeat(), repeatDelay(), yoyo(), updateTo(), and more. It
 * also activates many extra plugins by default, making it extremely
 * full-featured. Any of the plugins can work with TweenMax too, but TweenMax
 * saves you the step of activating the common ones like CSSPlugin,
 * RoundPropsPlugin, and BezierPlugin. Since TweenMax extends TweenMax, it can
 * do ANYTHING TweenMax can do plus more. The syntax is identical. You can mix
 * and match TweenMax and TweenMax in your project as you please, but if file
 * size is a concern it is best to stick with TweenMax unless you need a
 * particular TweenMax-only feature.
 * 
 */
public class TweenMax extends Animation {

    private static TweenMax INSTANCE;

    protected TweenMax(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static TweenMax get() {
        if (INSTANCE == null) {
            INSTANCE = new TweenMax();
        }
        return INSTANCE;
    }

    /**
     * Method for creating a TweenMax instance that animates to the specified
     * destination values (from the current values).
     * 
     * @param target
     *            , Target object whose properties this tween affects.
     * @param duration
     *            ,Duration in seconds
     * @param config
     *            , An object defining the end value for each property that
     *            should be tweened as well as any special properties like
     *            onComplete, ease, etc.
     * @return self (makes chaining easier)
     */
    public TweenMax to(Widget target, double duration, TweenMaxConfig config) {
        return to(target.getElement(), duration, config);
    }

    /**
     * Method for creating a TweenMax instance that animates to the specified
     * destination values (from the current values).
     * 
     * @param target
     *            , Target object whose properties this tween affects.
     * @param duration
     *            ,Duration in seconds
     * @param config
     *            , An object defining the end value for each property that
     *            should be tweened as well as any special properties like
     *            onComplete, ease, etc.
     * @return self (makes chaining easier)
     */
    public native TweenMax to(Element target, double duration, TweenMaxConfig config)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.to(target, duration,
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.tweenmax.client.TweenMax::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native TweenMax to(JavaScriptObject target, double duration, TweenMaxConfig config)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.to(target, duration,
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.tweenmax.client.TweenMax::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Method for creating a TweenMax instance that animates to the specified
     * destination values (from the current values).
     * 
     * @param target
     *            , id of Target object whose properties this tween affects.
     * @param duration
     *            ,Duration in seconds
     * @param config
     *            , An object defining the end value for each property that
     *            should be tweened as well as any special properties like
     *            onComplete, ease, etc.
     * @return self (makes chaining easier)
     */
    public native TweenMax to(String target, double duration, TweenMaxConfig config)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.to(target, duration,
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.tweenmax.client.TweenMax::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		;
    }-*/;

    public TweenMax to(TweenMaxConfig config, double duration, Widget... targets) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for (Widget el : targets) {
            elements.push(el.getElement());
        }
        return _to(elements, duration, config);
    }

    public TweenMax to(TweenMaxConfig config, double duration, Element... targets) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for (Element el : targets) {
            elements.push(el);
        }
        return _to(elements, duration, config);
    }

    private native TweenMax _to(JavaScriptObject target, double duration, TweenMaxConfig config)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.to(target, duration,
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.tweenmax.client.TweenMax::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides An easy way to change the default overwrite mode.
     */
    public static native void setDefaultOverwrite(String value)/*-{
		$wnd.TweenMax.defaultOverwrite = value;
    }-*/;

    /**
     * Provides a simple way to call a function after a set amount of time (or
     * frames).
     */
    public native TweenMax delayCall(double delay, Function callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.to(delay, function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
		return @com.ait.toolkit.gsap.tweenmax.client.TweenMax::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Provides a simple way to call a function after a set amount of time (or
     * frames).
     */
    public native TweenMax delayCall(double delay, Function callback, boolean useFrames)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.to(delay, function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		}, null, null, useFrames);
		return @com.ait.toolkit.gsap.tweenmax.client.TweenMax::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Method for creating a TweenMax instance that tweens backwards - you
     * define the BEGINNING values and the current values are used as the
     * destination values which is great for doing things like animating objects
     * onto the screen because you can set them up initially the way you want
     * them to look at the end of the tween and then animate in from elsewhere.
     */
    public TweenMax from(Widget target, double duration, TweenMaxConfig config) {
        return from(target.getElement(), duration, config);
    }

    /**
     * Method for creating a TweenMax instance that tweens backwards - you
     * define the BEGINNING values and the current values are used as the
     * destination values which is great for doing things like animating objects
     * onto the screen because you can set them up initially the way you want
     * them to look at the end of the tween and then animate in from elsewhere.
     */
    public native TweenMax from(Element target, double duration, TweenMaxConfig config)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.from(target, duration,
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.tweenmax.client.TweenMax::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Method for creating a TweenMax instance that tweens backwards - you
     * define the BEGINNING values and the current values are used as the
     * destination values which is great for doing things like animating objects
     * onto the screen because you can set them up initially the way you want
     * them to look at the end of the tween and then animate in from elsewhere.
     */
    public native TweenMax from(String target, double duration, TweenMaxConfig config)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.from(target, duration,
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.tweenmax.client.TweenMax::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		;
    }-*/;

    public TweenMax from(TweenMaxConfig config, double duration, Widget... targets) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for (Widget el : targets) {
            elements.push(el.getElement());
        }
        return _from(elements, duration, config);
    }

    public TweenMax from(TweenMaxConfig config, double duration, Element... targets) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for (Element el : targets) {
            elements.push(el);
        }
        return _from(elements, duration, config);
    }

    private native TweenMax _from(JavaScriptObject target, double duration, TweenMaxConfig config)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.from(target, duration,
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.tweenmax.client.TweenMax::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Method for creating a TweenMax instance that allows you to define both
     * the starting and ending values (as opposed to to() and from() tweens
     * which are based on the target's current values at one end or the other).
     */
    public native TweenMax fromTo(String target, double duration, TweenMaxConfig fromConfig, TweenMaxConfig toConfig)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.fromTo(target, duration,
				fromConfig.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				toConfig.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.tweenmax.client.TweenMax::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Method for creating a TweenMax instance that allows you to define both
     * the starting and ending values (as opposed to to() and from() tweens
     * which are based on the target's current values at one end or the other).
     */
    public native TweenMax fromTo(Element target, double duration, TweenMaxConfig fromConfig, TweenMaxConfig toConfig)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.fromTo(target, duration,
				fromConfig.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				toConfig.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.tweenmax.client.TweenMax::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Method for creating a TweenMax instance that allows you to define both
     * the starting and ending values (as opposed to to() and from() tweens
     * which are based on the target's current values at one end or the other).
     */
    public TweenMax fromTo(Widget target, double duration, TweenMaxConfig fromConfig, TweenMaxConfig toConfig) {
        return fromTo(target.getElement(), duration, fromConfig, toConfig);

    }

    private native TweenMax _fromTo(JavaScriptObject target, double duration, TweenMaxConfig fromConfig,
                    TweenMaxConfig toConfig)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.fromTo(target, duration,
				fromConfig.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				toConfig.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.gsap.tweenmax.client.TweenMax::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public TweenMax fromTo(TweenMaxConfig fromConfig, TweenMaxConfig endConfig, double duration, Widget... targets) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for (Widget el : targets) {
            elements.push(el.getElement());
        }
        return _fromTo(elements, duration, fromConfig, endConfig);
    }

    public TweenMax fromTo(TweenMaxConfig fromConfig, TweenMaxConfig toConfig, double duration, Element... targets) {
        JsArray<JavaScriptObject> elements = JsArray.createArray().cast();
        for (Element el : targets) {
            elements.push(el);
        }
        return _fromTo(elements, duration, fromConfig, toConfig);
    }

    public native void killDelayedCallsTo(Function callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.killDelayedCallsTo(function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
    }-*/;

    public native void killTweensOf(String target)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.killTweensOf(target);
    }-*/;

    public native void killTweensOf(String target, TweenMaxConfig config)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.killTweensOf(target,
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void killTweensOf(Element target)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.killTweensOf(target);
    }-*/;

    public native void killTweensOf(Element target, TweenMaxConfig config)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.killTweensOf(target,
				config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public void killTweensOf(Widget target) {
        this.killTweensOf(target.getElement());
    }

    public void killTweensOf(Widget target, TweenMaxConfig config) {
        this.killTweensOf(target.getElement(), config);
    }

    private TweenMax() {
        jsObj = createNativePeer();
    }

    private native JavaScriptObject createNativePeer()/*-{
		return $wnd.TweenMax;
    }-*/;

}
