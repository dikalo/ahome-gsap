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
package com.ait.toolkit.gsap.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

/**
 * Configuration object for the scrollTo Plugin. The ScrollConfig module must be
 * inheritered if using TweenLite
 */
public class ScrollToConfig extends JsObject {

    public ScrollToConfig() {
        jsObj = JsoHelper.createObject();
    }

    public void setX( double value ) {
        JsoHelper.setAttribute( jsObj, "x", value );
    }

    public void setX( String value ) {
        JsoHelper.setAttribute( jsObj, "x", value );
    }

    public void setY( double value ) {
        JsoHelper.setAttribute( jsObj, "y", value );
    }

    public void setY( String value ) {
        JsoHelper.setAttribute( jsObj, "y", value );
    }

}
