package com.ait.toolkit.anim4j.utils.draggable.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * Provides a surprisingly simple way to make virtually any DOM element
 * draggable, spinnable, tossable, and even flick-scrollable using mouse and/or
 * touch events, plus Draggable integrates beautifully (and optionally) with
 * ThrowPropsPlugin so that the user can flick and have the motion decelerate
 * smoothly based on its momentum.
 */
public class Draggable {

    private Draggable() {

    }

    public static void create(Widget target) {
        create(target.getElement());
    }

    public static native void create(Element target)/*-{
		$wnd.Draggable.create(target);
    }-*/;

}
