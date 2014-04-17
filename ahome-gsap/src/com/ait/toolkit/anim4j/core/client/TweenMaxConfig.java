package com.ait.toolkit.anim4j.core.client;

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
	public void setRepeat(int value) {
		setProperty("repeat", value);
	}

	public void setRepeatDelay(int value) {
		setProperty("repeatDelay", value);
	}

	public void setYoyo(boolean value) {
		JsoHelper.setAttribute(jsObj, "yoyo", value);
	}

	public void setOnRepeat(Function callback) {
		JsoHelper.setAttribute(jsObj, "onRepeat", fromFunction(callback));
	}

	public void setStartAt(TweenLiteConfig obj) {
		JsoHelper.setAttribute(jsObj, "startAt", obj.getJsObj());
	}

}
