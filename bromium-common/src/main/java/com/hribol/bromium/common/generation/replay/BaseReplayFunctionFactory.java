package com.hribol.bromium.common.generation.replay;

import com.hribol.bromium.common.builder.JsCollector;
import com.hribol.bromium.common.generation.common.FunctionFactoryBase;
import com.hribol.bromium.common.generation.helper.StepAndWebDriverActionConfiguration;
import com.hribol.bromium.common.generation.replay.functions.ClickClassByTextReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.ClickCssSelectorReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.ElementByCssToBePresentReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.TextOfElementFoundByCssSelectorToBeReplayFunction;
import com.hribol.bromium.common.generation.replay.functions.TypeTextInElementFoundByCssSelectorReplayFunction;
import com.hribol.bromium.common.generation.replay.invocations.ClickClassByTextReplayInvocation;
import com.hribol.bromium.common.generation.replay.invocations.ClickCssSelectorReplayInvocation;
import com.hribol.bromium.common.generation.replay.invocations.ElementByCssToBePresentReplayInvocation;
import com.hribol.bromium.common.generation.replay.invocations.ReplayFunctionInvocation;
import com.hribol.bromium.common.generation.replay.invocations.TextOfElementFoundByCssSelectorToBeInvocation;
import com.hribol.bromium.common.generation.replay.invocations.TypeTextInElementFoundByCssSelectorReplayInvocation;
import com.hribol.bromium.core.config.WebDriverActionConfiguration;
import com.hribol.bromium.core.generation.GeneratedFunction;

import java.util.function.Supplier;

import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CLASS_BY_TEXT;
import static com.hribol.bromium.core.utils.WebDriverActions.CLICK_CSS_SELECTOR;
import static com.hribol.bromium.core.utils.WebDriverActions.ELEMENT_BY_CSS_TO_BE_PRESENT;
import static com.hribol.bromium.core.utils.WebDriverActions.TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE;
import static com.hribol.bromium.core.utils.WebDriverActions.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR;

/**
 * Represents a base factory for creating replay functions which can be extended through the
 * {@link #addCustom()} method.
 */
public abstract class BaseReplayFunctionFactory extends
        FunctionFactoryBase<
                GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>,
                WebDriverActionConfiguration>  {


    public BaseReplayFunctionFactory(Supplier<GeneratedFunction<StepAndWebDriverActionConfiguration, ReplayFunctionInvocation>> emptyGeneratedFunctionSupplier,
                                     JsCollector jsCollector) {
        super(emptyGeneratedFunctionSupplier, jsCollector);
    }

    @Override
    protected void addPredefined() {
        add(CLICK_CSS_SELECTOR, new ClickCssSelectorReplayFunction(jsCollector, ClickCssSelectorReplayInvocation::new));
        add(CLICK_CLASS_BY_TEXT, new ClickClassByTextReplayFunction(jsCollector, ClickClassByTextReplayInvocation::new));
        add(TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR,
                new TypeTextInElementFoundByCssSelectorReplayFunction(jsCollector, TypeTextInElementFoundByCssSelectorReplayInvocation::new));
        add(ELEMENT_BY_CSS_TO_BE_PRESENT, new ElementByCssToBePresentReplayFunction(jsCollector, ElementByCssToBePresentReplayInvocation::new));
        add(TEXT_OF_ELEMENT_FOUND_BY_CSS_SELECTOR_TO_BE,
                new TextOfElementFoundByCssSelectorToBeReplayFunction(jsCollector, TextOfElementFoundByCssSelectorToBeInvocation::new));
    }
}
