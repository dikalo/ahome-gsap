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
package com.ait.toolkit.gsap.utils.draggable;

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
