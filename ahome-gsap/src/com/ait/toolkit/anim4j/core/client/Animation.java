package com.ait.toolkit.anim4j.core.client;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * Base class for all TweenLite, TweenMax, TimelineLite, and TimelineMax
 * classes, providing core methods/properties/functionality, but there is no
 * reason to create an instance of this class directly.
 * 
 */
public class Animation extends JsObject {

	protected Animation() {

	}

	protected Animation(JavaScriptObject obj) {
		jsObj = obj;
	}

	public void reverse(double from) {
		reverse(from, false);
	}

	/**
	 * 
	 * Sets the animation's initial delay which is the length of time in seconds
	 * (or frames for frames-based tweens) before the animation should begin. A
	 * tween's starting values are not recorded until after the delay has
	 * expired (except in from() tweens which render immediately by default
	 * unless immediateRender:false is set in the vars parameter). An
	 * animation's delay is unaffected by its timeScale, so if you were to
	 * change timeScale from 1 to 10, for example, it wouldn't cause the delay
	 * to grow tenfold.
	 */
	public native void setDelay(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.delay(value);
	}-*/;

	/**
	 * 
	 Sets the animation's duration, not including any repeats or repeatDelays
	 * (which are only available in TweenMax and TimelineMax). For example, if a
	 * TweenMax instance has a duration of 2 and a repeat of 3, its
	 * totalDuration would be 8 (one standard play plus 3 repeats equals 4 total
	 * cycles).
	 */
	public native void setDuration(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.duration(value);
	}-*/;

	/**
	 * 
	 Clears any initialization data (like starting/ending values in tweens)
	 * which can be useful if, for example, you want to restart a tween without
	 * reverting to any previously recorded starting values. When you
	 * invalidate() an animation, it will be re-initialized the next time it
	 * renders and its vars object will be re-parsed. The timing of the
	 * animation (duration, startTime, delay) will not be affected.
	 */
	public native void invalidate()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.invalidate();
	}-*/;

	/**
	 * 
	 Kills the animation entirely or in part depending on the parameters.
	 * Simply calling kill() (omitting the parameters) will immediately stop the
	 * animation and release it for garbage collection. To kill only particular
	 * tweening properties of the animation, use the first parameter which
	 * should be a generic object with enumerable properties corresponding to
	 * those that should be killed, like {x:true, y:true}. The second parameter
	 * allows you to define a target (or array of targets) to affect.
	 * 
	 * Note: the values assigned to each property of the vars parameter object
	 * don't matter - the sole purpose of the object is for iteration over the
	 * named properties. In other words, {x:true, y:true} would produce the same
	 * results as {x:false, y:false}.
	 */
	public native void kill()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.kill();
	}-*/;

	/**
	 * 
	 Kills the animation entirely or in part depending on the parameters.
	 * Simply calling kill() (omitting the parameters) will immediately stop the
	 * animation and release it for garbage collection. To kill only particular
	 * tweening properties of the animation, use the first parameter which
	 * should be a generic object with enumerable properties corresponding to
	 * those that should be killed, like {x:true, y:true}. The second parameter
	 * allows you to define a target (or array of targets) to affect.
	 * 
	 * Note: the values assigned to each property of the vars parameter object
	 * don't matter - the sole purpose of the object is for iteration over the
	 * named properties. In other words, {x:true, y:true} would produce the same
	 * results as {x:false, y:false}.
	 */
	public native void kill(TweenLiteConfig config)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.kill(config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native void kill(Element target)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.kill(null, target);
	}-*/;

	public void kiil(Widget widget) {
		kill(widget.getElement());
	}

	public native void kill(TweenLiteConfig config, Element target)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.kill(
						config.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						target);
	}-*/;

	public void kiil(TweenLiteConfig config, Widget widget) {
		kill(config, widget.getElement());
	}

	/**
	 * Pauses the instance, optionally jumping to a specific time.
	 * 
	 * If you define a time to jump to (the first parameter, which could also be
	 * a label for TimelineLite or TimelineMax instances), the playhead moves
	 * there immediately and if there are any events/callbacks inbetween where
	 * the playhead was and the new time, they will not be triggered because by
	 * default suppressEvents (the 2nd parameter) is true. Think of it like
	 * picking the needle up on a record player and moving it to a new position
	 * before placing it back on the record. If, however, you do not want the
	 * events/callbacks suppressed during that initial move, simply set the
	 * suppressEvents parameter to false.
	 */
	public native void pause()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.pause();
	}-*/;

	/**
	 * Pauses the instance, optionally jumping to a specific time.
	 * 
	 * If you define a time to jump to (the first parameter, which could also be
	 * a label for TimelineLite or TimelineMax instances), the playhead moves
	 * there immediately and if there are any events/callbacks inbetween where
	 * the playhead was and the new time, they will not be triggered because by
	 * default suppressEvents (the 2nd parameter) is true. Think of it like
	 * picking the needle up on a record player and moving it to a new position
	 * before placing it back on the record. If, however, you do not want the
	 * events/callbacks suppressed during that initial move, simply set the
	 * suppressEvents parameter to false.
	 */
	public native void pause(double time)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.pause(time);
	}-*/;

	/**
	 * Pauses the instance, optionally jumping to a specific time.
	 * 
	 * If you define a time to jump to (the first parameter, which could also be
	 * a label for TimelineLite or TimelineMax instances), the playhead moves
	 * there immediately and if there are any events/callbacks inbetween where
	 * the playhead was and the new time, they will not be triggered because by
	 * default suppressEvents (the 2nd parameter) is true. Think of it like
	 * picking the needle up on a record player and moving it to a new position
	 * before placing it back on the record. If, however, you do not want the
	 * events/callbacks suppressed during that initial move, simply set the
	 * suppressEvents parameter to false.
	 */
	public native void pause(String label)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.pause(label);
	}-*/;

	/**
	 * Pauses the instance, optionally jumping to a specific time.
	 * 
	 * If you define a time to jump to (the first parameter, which could also be
	 * a label for TimelineLite or TimelineMax instances), the playhead moves
	 * there immediately and if there are any events/callbacks inbetween where
	 * the playhead was and the new time, they will not be triggered because by
	 * default suppressEvents (the 2nd parameter) is true. Think of it like
	 * picking the needle up on a record player and moving it to a new position
	 * before placing it back on the record. If, however, you do not want the
	 * events/callbacks suppressed during that initial move, simply set the
	 * suppressEvents parameter to false.
	 */
	public native void pause(double time, boolean supressEvent)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.pause(time, suppressEvent);
	}-*/;

	/**
	 * Pauses the instance, optionally jumping to a specific time.
	 * 
	 * If you define a time to jump to (the first parameter, which could also be
	 * a label for TimelineLite or TimelineMax instances), the playhead moves
	 * there immediately and if there are any events/callbacks inbetween where
	 * the playhead was and the new time, they will not be triggered because by
	 * default suppressEvents (the 2nd parameter) is true. Think of it like
	 * picking the needle up on a record player and moving it to a new position
	 * before placing it back on the record. If, however, you do not want the
	 * events/callbacks suppressed during that initial move, simply set the
	 * suppressEvents parameter to false.
	 */
	public native void pause(String label, boolean supressEvent)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.pause(label, supressEvent);
	}-*/;

	/**
	 * Gets or sets the animation's paused state which indicates whether or not
	 * the animation is currently paused. This does not take doubleo account
	 * anscestor timelines. So for example, a tween that is not paused might
	 * appear paused if its parent timeline (or any ancenstor timeline) is
	 * paused. Pausing an animation doesn't remove it from its parent timeline,
	 * but it does cause it not to be factored doubleo the parent timeline's
	 * duration/totalDuration. When an animation completes, it does NOT alter
	 * its paused state.
	 * <p>
	 * In most cases, it is easiest to use the pause() method to pause the
	 * animation, and resume() to resume it. But to check the current state, you
	 * must use the isPaused() method. It can also be useful for toggling like
	 * myAnimation.setPaused( !myAnimation.isPaused() );
	 * 
	 * @return
	 */
	public native boolean isPaused()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.paused();
	}-*/;

	/**
	 * 
	 * Begins playing forward, optionally from a specific time (by default
	 * playback begins from wherever the playhead currently is). This also
	 * ensures that the instance is neither paused nor reversed.
	 * 
	 * If you define a "from" time (the first parameter, which could also be a
	 * label for TimelineLite or TimelineMax instances), the playhead moves
	 * there immediately and if there are any events/callbacks inbetween where
	 * the playhead was and the new time, they will not be triggered because by
	 * default suppressEvents (the 2nd parameter) is true. Think of it like
	 * picking the needle up on a record player and moving it to a new position
	 * before placing it back on the record. If, however, you do not want the
	 * events/callbacks suppressed during that initial move, simply set the
	 * suppressEvents parameter to false. @return
	 */
	public native void play()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.play();
	}-*/;

	public native void play(double from)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.play(from);
	}-*/;

	public native void play(double from, boolean supressEvent)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.play(from, supressEvent);
	}-*/;

	public native void play(String from)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.play(from);
	}-*/;

	public native void play(String from, boolean supressEvent)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.play(from, supressEvent);
	}-*/;

	public native void restart(boolean includeDelay, boolean supressEvent)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.restart(includeDelay, supressEvent);
	}-*/;

	public native void restart()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.restart();
	}-*/;

	public native void resume()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.resume();
	}-*/;

	public native void resume(double from)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.resume(from);
	}-*/;

	public native void resume(double from, boolean supressEvent)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.resume(from, supressEvent);
	}-*/;

	public native void resume(String from)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.resume(from);
	}-*/;

	public native void resume(String from, boolean supressEvent)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.resume(from, supressEvent);
	}-*/;

	public native void reverse(double from, boolean supprennEvent)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.reverse(from, supressEvent);
	}-*/;

	public native <T extends Animation> T reverse()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.reverse();
		return this;
	}-*/;

	public native void reverse(String from, boolean supprennEvent)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.reverse(from, supressEvent);
	}-*/;

	/**
	 * Gets the animation's reversed state which indicates whether or not the
	 * animation should be played backwards. This value is not affected by yoyo
	 * repeats (TweenMax and TimelineMax only) and it does not take doubleo
	 * account the reversed state of anscestor timelines. So for example, a
	 * tween that is not reversed might appear reversed if its parent timeline
	 * (or any ancenstor timeline) is reversed.
	 * 
	 * @param from
	 * @return
	 */
	public native boolean isReversed(String from)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.reversed();
	}-*/;

	public native void seek(double time, boolean supprennEvent)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.seek(time, supressEvent);
	}-*/;

	public void seek(double time) {
		seek(time, false);
	}

	/**
	 * Gets the time at which the animation begins on its parent timeline (after
	 * any delay that was defined). For example, if a tween starts at exactly 3
	 * seconds doubleo the timeline on which it is placed, the tween's startTime
	 * would be 3.
	 * <p>
	 * The startTime may be automatically adjusted to make the timing appear
	 * seamless if the parent timeline's smoothChildTiming property is true and
	 * a timing-dependent change is made on-the-fly, like reverse() is called or
	 * timeScale() is changed, etc. See the documentation for the
	 * smoothChildTiming property of timelines for more details.
	 */
	public native double getStartTime()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.startTime();
	}-*/;

	/**
	 * Sets the time at which the animation begins on its parent timeline (after
	 * any delay that was defined). For example, if a tween starts at exactly 3
	 * seconds doubleo the timeline on which it is placed, the tween's startTime
	 * would be 3.
	 * <p>
	 * The startTime may be automatically adjusted to make the timing appear
	 * seamless if the parent timeline's smoothChildTiming property is true and
	 * a timing-dependent change is made on-the-fly, like reverse() is called or
	 * timeScale() is changed, etc. See the documentation for the
	 * smoothChildTiming property of timelines for more details.
	 */
	public native void setStartTime(double time)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.startTime(time);
	}-*/;

	/**
	 * Sets the local position of the playhead (essentially the current time),
	 * described in seconds (or frames for frames-based animations) which will
	 * never be less than 0 or greater than the animation's duration. For
	 * example, if the duration is 10 and you were to watch the time during the
	 * course of the animation, you'd see it go from 0 at the beginning to 10 at
	 * the end. Setting time to 5 would cause the animation to jump to its
	 * midway podouble (because it's half of the duration).
	 */
	public native void setTime(double time)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.time(time);
	}-*/;

	/**
	 * Sets the local position of the playhead (essentially the current time),
	 * described in seconds (or frames for frames-based animations) which will
	 * never be less than 0 or greater than the animation's duration. For
	 * example, if the duration is 10 and you were to watch the time during the
	 * course of the animation, you'd see it go from 0 at the beginning to 10 at
	 * the end. Setting time to 5 would cause the animation to jump to its
	 * midway podouble (because it's half of the duration).
	 */
	public native void setTime(double time, boolean supressEvent)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.time(time, supressEvent);
	}-*/;

	/**
	 * Sets the local position of the playhead (essentially the current time),
	 * described in seconds (or frames for frames-based animations) which will
	 * never be less than 0 or greater than the animation's duration. For
	 * example, if the duration is 10 and you were to watch the time during the
	 * course of the animation, you'd see it go from 0 at the beginning to 10 at
	 * the end. Setting time to 5 would cause the animation to jump to its
	 * midway point (because it's half of the duration).
	 */
	public native double getTime()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.time();
	}-*/;

	/**
	 * Factor that's used to scale time in the animation where 1 = normal speed
	 * (the default), 0.5 = half speed, 2 = double speed, etc. For example, if
	 * an animation's duration is 2 but its timeScale is 0.5, it will take 4
	 * seconds to finish. If you nest that animation in a timeline whose
	 * timeScale is 0.5 as well, it would take 8 seconds to finish. You can even
	 * tween the timeScale to gradually slow it down or speed it up.
	 */
	public native void setTimeScale(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.timeScale(value);
	}-*/;

	/**
	 * Gets or sets the animation's total duration including any repeats or
	 * repeatDelays (which are only available in TweenMax and TimelineMax). For
	 * example, if a TweenMax instance has a duration of 2 and a repeat of 3,
	 * its totalDuration would be 8 (one standard play plus 3 repeats equals 4
	 * total cycles).
	 */
	public native void setTotalDuration(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.totalDuration(value);
	}-*/;

	/**
	 * Sets the position of the playhead according to the totalDuration which
	 * includes any repeats and repeatDelays (only available in TweenMax and
	 * TimelineMax). For example, if a TweenMax instance has a duration of 2 and
	 * a repeat of 3, totalTime will go from 0 to 8 during the course of the
	 * tween (plays once then repeats 3 times, making 4 total cycles) whereas
	 * time will go from 0 to 2 a total of 4 times. If you added a repeatDelay
	 * of 1, that would make the totalTime go from 0 to 11 over the course of
	 * the tween.
	 */
	public native void setTotalTime(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.totalTime(value);
	}-*/;

	/**
	 * Gets the position of the playhead according to the totalDuration which
	 * includes any repeats and repeatDelays (only available in TweenMax and
	 * TimelineMax). For example, if a TweenMax instance has a duration of 2 and
	 * a repeat of 3, totalTime will go from 0 to 8 during the course of the
	 * tween (plays once then repeats 3 times, making 4 total cycles) whereas
	 * time will go from 0 to 2 a total of 4 times. If you added a repeatDelay
	 * of 1, that would make the totalTime go from 0 to 11 over the course of
	 * the tween.
	 */
	public native double getTotalTime()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.totalTime();
	}-*/;

	/**
	 * If true, child tweens/timelines will be removed as soon as they complete.
	 * (false by default except on the root timeline(s))
	 */
	public native void setAutoRemoveChildren(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.autoRemoveChildren = value;
	}-*/;

	/**
	 * Controls whether or not child tweens/timelines are repositioned
	 * automatically (changing their startTime) in order to maintain smooth
	 * playback when properties are changed on-the-fly.
	 */
	public native void setSmoothChildTiming(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.smoothChildTiming = value;
	}-*/;
}
