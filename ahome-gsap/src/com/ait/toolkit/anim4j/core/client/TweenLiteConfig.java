package com.ait.toolkit.anim4j.core.client;

import com.ait.toolkit.core.client.Color;
import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Configuration object for tween lite animations
 */
public class TweenLiteConfig extends JsObject {

	public TweenLiteConfig() {
		jsObj = JsoHelper.createObject();
	}

	/**
	 * Amount of delay in seconds (or frames for frames-based tweens) before the
	 * tween should begin.
	 * 
	 * @param value
	 */
	public void setDelay(double value) {
		setProperty("delay", value);
	}

	/**
	 * You can choose from various eases to control the rate of change during
	 * the animation, giving it a specific "feel". For example, Elastic.easeOut
	 * or Strong.easeInOut. For best performance, use one of the GreenSock eases
	 * (Linear, Power0, Power1, Power2, Power3, Power4, Quad, Cubic, Quart,
	 * Quint, and Strong, each with their .easeIn, .easeOut, and .easeInOut
	 * variants are included in the TweenLite, and you can load EasePack to get
	 * extras like Elastic, Back, Bounce, SlowMo, SteppedEase, Circ, Expo, and
	 * Sine). For linear animation, use the GreenSock Linear.easeNone ease. You
	 * can also define an ease by name (string) like "Strong.easeOut" or reverse
	 * style (like jQuery uses) "easeOutStrong". The default is Quad.easeOut.
	 * 
	 * @param value
	 */
	public void setEase(Ease ease) {
		setEase(ease.getValue());
	}

	/**
	 * You can choose from various eases to control the rate of change during
	 * the animation, giving it a specific "feel". For example, Elastic.easeOut
	 * or Strong.easeInOut. For best performance, use one of the GreenSock eases
	 * (Linear, Power0, Power1, Power2, Power3, Power4, Quad, Cubic, Quart,
	 * Quint, and Strong, each with their .easeIn, .easeOut, and .easeInOut
	 * variants are included in the TweenLite, and you can load EasePack to get
	 * extras like Elastic, Back, Bounce, SlowMo, SteppedEase, Circ, Expo, and
	 * Sine). For linear animation, use the GreenSock Linear.easeNone ease. You
	 * can also define an ease by name (string) like "Strong.easeOut" or reverse
	 * style (like jQuery uses) "easeOutStrong". The default is Quad.easeOut.
	 * 
	 * @param value
	 */
	public void setEase(String value) {
		setProperty("ease", value);
	}

	public void setProperty(String propertyName, double value) {
		JsoHelper.setAttribute(jsObj, propertyName, value);
	}

	public void setProperty(String propertyName, String value) {
		JsoHelper.setAttribute(jsObj, propertyName, value);
	}

	/**
	 * A function that should be called when the tween has completed
	 * 
	 * @param callback
	 */
	public void setOnComplete(Function callback) {
		JsoHelper.setAttribute(jsObj, "onComplete", fromFunction(callback));
	}

	/**
	 * If useFrames is true, the tweens's timing will be based on frames instead
	 * of seconds because it is intially added to the root frames-based
	 * timeline. This causes both its duration and delay to be based on frames.
	 * An animations's timing mode is always determined by its parent timeline.
	 * 
	 * @param value
	 */
	public void setUseFrames(boolean value) {
		JsoHelper.setAttribute(jsObj, "useFrames", value);
	}

	/**
	 * Normally when you create a tween, it begins rendering on the very next
	 * frame (update cycle) unless you specify a delay. However, if you prefer
	 * to force the tween to render immediately when it is created, set
	 * immediateRender to true. Or to prevent a from() from rendering
	 * immediately, set immediateRender to false. By default, from() tweens set
	 * immediateRender to true.
	 */
	public void setImmediateRenderer(boolean value) {
		JsoHelper.setAttribute(jsObj, "immediateRenderer", value);
	}

	/**
	 * A function that should be called when the tween begins (when its time
	 * changes from 0 to some other value which can happen more than once if the
	 * tween is restarted multiple times).
	 */
	public void setOnStart(Function callback) {
		JsoHelper.setAttribute(jsObj, "onStart", fromFunction(callback));
	}

	/**
	 * A function that should be called every time the tween updates (on every
	 * frame while the tween is active)
	 */
	public void setOnUpdate(Function callback) {
		JsoHelper.setAttribute(jsObj, "onUpdate", fromFunction(callback));
	}

	/**
	 * A function that should be called when the tween has reached its beginning
	 * again from the reverse direction. For example, if reverse() is called the
	 * tween will move back towards its beginning and when its time reaches 0,
	 * onReverseComplete will be called. This can also happen if the tween is
	 * placed in a TimelineLite or TimelineMax instance that gets reversed and
	 * plays the tween backwards to (or past) the beginning.
	 */
	public void setOnReverseComplete(Function callback) {
		JsoHelper.setAttribute(jsObj, "onReverseComplete",
				fromFunction(callback));
	}

	/**
	 * If true, the tween will pause itself immediately upon creation.
	 */
	public void setPaused(boolean value) {
		JsoHelper.setAttribute(jsObj, "paused", value);
	}

	/**
	 * Controls how (and if) other tweens of the same target are overwritten.
	 * There are several modes to choose from, but "auto" is the default
	 * (although you can change the default mode using the
	 * TweenLite.defaultOverwrite property)
	 */
	public void setOverwrite(String value) {
		JsoHelper.setAttribute(jsObj, "overwrite", value);
	}

	/**
	 * Controls how (and if) other tweens of the same target are overwritten.
	 * There are several modes to choose from, but "auto" is the default
	 * (although you can change the default mode using the
	 * TweenLite.defaultOverwrite property)
	 */
	public void setOverwrite(int value) {
		JsoHelper.setAttribute(jsObj, "overwrite", value);
	}

	// CSS properties

	public void setBackground(String value) {
		setProperty("background", value);
	}

	public void setBackgroundAttachement(String value) {
		setProperty("backgroundAttachement", value);
	}

	public void setBackgroundColor(String value) {
		setProperty("backgroundColor", value);
	}

	public void setBackgroundColor(Color color) {
		setBackgroundColor(color.getValue());
	}

	public void setBackgroundImage(String value) {
		setProperty("backgroundImage", value);
	}

	public void setBackgroundPosition(String value) {
		setProperty("backgroundPosition", value);
	}

	public void setBackgroundRepeat(String value) {
		setProperty("backgroundRepeat", value);
	}

	public void setBorder(String value) {
		setProperty("border", value);
	}

	public void setBorderBottom(String value) {
		setProperty("borderBottom", value);
	}

	public void setBorderBottomColor(String value) {
		setProperty("borderBottomColor", value);
	}

	public void setBorderBottomColor(Color value) {
		setProperty("borderBottomColor", value.getValue());
	}

	public void setBorderBottomStyle(String value) {
		setProperty("borderBottomStyle", value);
	}

	public void setBorderBottomWidth(String value) {
		setProperty("borderBottomWidth", value);
	}

	public void setBorderColor(String value) {
		setProperty("borderColor", value);
	}

	public void setBorderColor(Color value) {
		setProperty("borderColor", value.getValue());
	}

	public void setBorderLeft(String value) {
		setProperty("borderLeft", value);
	}

	public void setBorderLeftColor(String value) {
		setProperty("borderLeftColor", value);
	}

	public void setBorderLeftColor(Color value) {
		setProperty("borderLeftColor", value.getValue());
	}

	public void setBorderLeftStyle(String value) {
		setProperty("borderLeftStyle", value);
	}

	public void setBorderLeftWidth(String value) {
		setProperty("borderLeftWidth", value);
	}

	public void setBorderRight(String value) {
		setProperty("borderRight", value);
	}

	public void setBorderRightColor(String value) {
		setProperty("borderRightColor", value);
	}

	public void setBorderRightColor(Color value) {
		setProperty("borderRightColor", value.getValue());
	}

	public void setBorderRightStyle(String value) {
		setProperty("borderRightStyle", value);
	}

	public void setBorderRightWidth(String value) {
		setProperty("borderRightWidth", value);
	}

	public void setBorderStyle(String value) {
		setProperty("borderStyle", value);
	}

	public void setBorderTop(String value) {
		setProperty("borderTop", value);
	}

	public void setBorderTopColor(String value) {
		setProperty("borderTopColor", value);
	}

	public void setBorderTopColor(Color value) {
		setProperty("borderTopColor", value.getValue());
	}

	public void setBorderTopStyle(String value) {
		setProperty("borderTopStyle", value);
	}

	public void setBorderTopWidth(String value) {
		setProperty("borderTopWidth", value);
	}

	public void setOutline(String value) {
		setProperty("outline", value);
	}

	public void setOutlineColor(String value) {
		setProperty("outlineColor", value);
	}

	public void setOutlineColor(Color color) {
		setOutlineColor(color.getValue());
	}

	public void setOutlineStyle(String value) {
		setProperty("outlineStyle", value);
	}

	public void setOutlineWidth(String value) {
		setProperty("outlineWidth", value);
	}

	public void setListStyle(String value) {
		setProperty("listStyle", value);
	}

	public void setListImage(String value) {
		setProperty("listStyleImage", value);
	}

	public void setListStylePosition(String value) {
		setProperty("listStylePosition", value);
	}

	public void setListStyleType(String value) {
		setProperty("listStyleType", value);
	}

	public void setMargin(String value) {
		setProperty("margin", value);
	}

	public void setMargin(double value) {
		setProperty("margin", value);
	}

	public void setMarginBottom(String value) {
		setProperty("marginBottom", value);
	}

	public void setMarginBottom(double value) {
		setProperty("marginBottom", value);
	}

	public void setMarginLeft(String value) {
		setProperty("marginLeft", value);
	}

	public void setMarginLeft(double value) {
		setProperty("marginLeft", value);
	}

	public void setMarginRight(String value) {
		setProperty("marginRight", value);
	}

	public void setMarginRight(double value) {
		setProperty("marginRight", value);
	}

	public void setMarginTop(String value) {
		setProperty("marginTop", value);
	}

	public void setMarginTop(double value) {
		setProperty("marginTop", value);
	}

	public void setPadding(String value) {
		setProperty("padding", value);
	}

	public void setPadding(double value) {
		setProperty("padding", value);
	}

	public void setPaddingBottom(String value) {
		setProperty("paddingBottom", value);
	}

	public void setPaddingBottom(double value) {
		setProperty("paddingBottom", value);
	}

	public void setPaddingLeft(String value) {
		setProperty("paddingLeft", value);
	}

	public void setPaddingLeft(double value) {
		setProperty("paddingLeft", value);
	}

	public void setPaddingRight(String value) {
		setProperty("paddingRight", value);
	}

	public void setPaddingRight(double value) {
		setProperty("paddingRight", value);
	}

	public void setPaddingTop(String value) {
		setProperty("paddingTop", value);
	}

	public void setPaddingTop(double value) {
		setProperty("paddingTop", value);
	}

	public void setBottom(double value) {
		setProperty("bottom", value);
	}

	public void setBottom(String value) {
		setProperty("bottom", value);
	}

	public void setClear(String value) {
		setProperty("clear", value);
	}

	public void setClip(String value) {
		setProperty("clip", value);
	}

	public void setCssFloat(String value) {
		setProperty("cssFloat", value);
	}

	public void setCursor(String value) {
		setProperty("cursor", value);
	}

	public void setDisplay(String value) {
		setProperty("display", value);
	}

	public void setColor(String value) {
		setProperty("color", value);
	}

	public void setColor(Color color) {
		setColor(color.getValue());
	}

	public void setWidth(double value) {
		setProperty("width", value);
	}

	public void setWidth(String value) {
		setProperty("width", value);
	}

	public void setHeight(double value) {
		setProperty("height", value);
	}

	public void setHeight(String value) {
		setProperty("height", value);
	}

	public void setLeft(double value) {
		setProperty("left", value);
	}

	public void setLeft(String value) {
		setProperty("left", value);
	}

	public void setMaxHeight(double value) {
		setProperty("maxHeight", value);
	}

	public void setMaxHeight(String value) {
		setProperty("maxHeight", value);
	}

	public void setMaxWidth(double value) {
		setProperty("maxWidth", value);
	}

	public void setMaxWidth(String value) {
		setProperty("maxWidth", value);
	}

	public void setMinHeight(double value) {
		setProperty("minHeight", value);
	}

	public void setMinHeight(String value) {
		setProperty("minHeight", value);
	}

	public void setMinWidth(double value) {
		setProperty("minWidth", value);
	}

	public void setMinWidth(String value) {
		setProperty("minWidth", value);
	}

	public void setPosition(String value) {
		setProperty("position", value);
	}

	public void setTop(String value) {
		setProperty("top", value);
	}

	public void setTop(double value) {
		setProperty("top", value);
	}

	public void setVerticalAlign(String value) {
		setProperty("verticalAlign", value);
	}

	public void setVisibility(String value) {
		setProperty("visibility", value);
	}

	public void setZIndex(int value) {
		setProperty("zIndex", value);
	}

	public void setOpacity(double value) {
		setProperty("opacity", value);
	}

	public void setBoxShadow(String value) {
		setProperty("boxShadow", value);
	}

	public void setAutoAlpha(double value) {
		setProperty("autoAlpha", value);
	}

	public void setPerspective(double value) {
		setProperty("perspective", value);
	}

	public void setTransformPerspective(double value) {
		setProperty("transformPerspective", value);
	}

	public void setScrollTo(ScrollToConfig scrollTo) {
		JsoHelper.setAttribute(jsObj, "scrollTo", scrollTo.getJsObj());
	}

	public void setOpacity(String value) {
		setProperty("opacity", value);
	}

	public void setDirection(String value) {
		setProperty("direction", value);
	}

	public void setClassName(String value) {
		setProperty("className", value);
	}

	public void setFont(String value) {
		setProperty("font", value);
	}

	public void sePaused(boolean value) {
		JsoHelper.setAttribute(jsObj, "paused", value);
	}

	public void setFontFamily(String value) {
		setProperty("fontFamily", value);
	}

	public void setFontSize(String value) {
		setProperty("fontSize", value);
	}

	public void setFontSize(double value) {
		setProperty("fontSize", value);
	}

	public void setFontSizeAdjust(String value) {
		setProperty("fontSizeAdjust", value);
	}

	public void setFontStyle(String value) {
		setProperty("fontStyle", value);
	}

	public void setFontVarient(String value) {
		setProperty("fontVarient", value);
	}

	public void setLetterSpacing(String value) {
		setProperty("letterSpacing", value);
	}

	public void setLineHeight(String value) {
		setProperty("lineHeight", value);
	}

	public void setQuotes(String value) {
		setProperty("quotes", value);
	}

	public void setBorderCollapse(String value) {
		setProperty("borderCollapse", value);
	}

	public void setBorderSpacing(String value) {
		setProperty("borderSpacing", value);
	}

	public void setBorderSpacing(double value) {
		setProperty("borderSpacing", value);
	}

	public void setCaptionSide(String value) {
		setProperty("captionSide", value);
	}

	public void setEmptyCells(String value) {
		setProperty("emptyCells", value);
	}

	public void setTableLayout(String value) {
		setProperty("tableLayout", value);
	}

	public void setTextAlign(String value) {
		setProperty("textAlign", value);
	}

	public void setTextDecoration(String value) {
		setProperty("textDecoration", value);
	}

	public void setTextIndent(String value) {
		setProperty("textIndent", value);
	}

	public void setTextShadow(String value) {
		setProperty("textShadow", value);
	}

	public void setWhiteSpace(String value) {
		setProperty("whiteSpace", value);
	}

	public void setWordSpacing(String value) {
		setProperty("wordSpacing", value);
	}

	public void setRotation(double value) {
		setProperty("rotation", value);
	}

	public void setRotation(String value) {
		setProperty("rotation", value);
	}

	public void setTranslateX(double value) {
		setProperty("translateX", value);
	}

	public void setTranslateX(String value) {
		setProperty("translateX", value);
	}

	public void setTranslateY(double value) {
		setProperty("translateY", value);
	}

	public void setTranslateY(String value) {
		setProperty("translateY", value);
	}

	public void setTranslate(double translateX, double translateY) {
		setTranslateX(translateX);
		setTranslateY(translateY);
	}

	public void setTranslate(String translateX, String translateY) {
		setTranslateX(translateX);
		setTranslateY(translateY);
	}

	public void setScaleX(double value) {
		setProperty("scaleX", value);
	}

	public void setScaleX(String value) {
		setProperty("scaleX", value);
	}

	public void setScaleY(double value) {
		setProperty("scaleY", value);
	}

	public void setScaleY(String value) {
		setProperty("scaleY", value);
	}

	public void setScale(String value) {
		setProperty("scale", value);
	}

	public void setScale(double value) {
		setProperty("scale", value);
	}

	public void setScale(double scaleX, double scaleY) {
		setScaleX(scaleX);
		setScaleY(scaleY);
	}

	public void setSkewX(double value) {
		setProperty("skewX", value);
	}

	public void setSkewX(String value) {
		setProperty("skewX", value);
	}

	public void setSkewY(double value) {
		setProperty("skewY", value);
	}

	public void setSkewY(String value) {
		setProperty("skewY", value);
	}

	public void setSkew(String skewX, String skewY) {
		this.setSkewX(skewX);
		this.setSkewY(skewY);
	}

	public void setSkew(double scaleX, double scaleY) {
		setScaleX(scaleX);
		setScaleY(scaleY);
	}

	public void setX(double value) {
		setProperty("x", value);
	}

	public void setX(String value) {
		setProperty("x", value);
	}

	public void setY(double value) {
		setProperty("y", value);
	}

	public void setY(String value) {
		setProperty("y", value);
	}

	public void setZ(double value) {
		setProperty("z", value);
	}

	public void setZ(String value) {
		setProperty("z", value);
	}

	public void setXY(double x, double y) {
		setX(x);
		setY(y);
	}

	public void setXY(String x, String y) {
		setX(x);
		setY(y);
	}

	public void setTransformOrigin(String value) {
		setProperty("transformOrigin", value);
	}

	protected native JavaScriptObject fromFunction(Function fn)/*-{
		return function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		};
	}-*/;

}
