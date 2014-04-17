package com.ait.toolkit.gsap.core.client;

/**
 * Defines different animation easing functions
 */

// TODO : Finish enums
public enum Ease {

    BACK_EASE_IN("Back.easeIn"), BACK_EASE_OUT("Back.easeOut"), BACK_EASE_IN_OUT("Back.easeInOut"), BOUNCE_EASE_IN(
                    "Bounce.easeIn"), BOUNCE_EASE_OUT("Bounce.easeOut"), BOUNCE_EASE_IN_OUT("Bounce.easeInOut"), ELASTIC_IN(
                    "Elastic.easeIn"), ELASTIC_EASE_OUT("Elastic.easeOut"), ELASTIC_EASE_IN_OUT("Elastic.easeInOut");

    private Ease(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return this.value;
    }
}
