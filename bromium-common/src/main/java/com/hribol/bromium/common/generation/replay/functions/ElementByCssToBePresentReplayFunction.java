package com.hribol.bromium.common.generation.replay.functions;

import com.hribol.bromium.common.builder.JsCollector;

import static com.hribol.bromium.common.builder.JsFunctionNames.ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT;

/**
 * Created by hvrigazov on 30.10.17.
 */
public class ElementByCssToBePresentReplayFunction extends ElementArrivedReplayFunction {
    public ElementByCssToBePresentReplayFunction(JsCollector jsCollector, ElementArrivedInvocationProvider invocationProvider) {
        super(ELEMENT_BY_CSS_SELECTOR_TO_BE_PRESENT, jsCollector, invocationProvider);
    }
}
