/*
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class BromiumGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.hribol.bromium.dsl.Bromium.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cVersionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVersionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVersionSTRINGTerminalRuleCall_3_0 = (RuleCall)cVersionAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cFromKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cBaseVersionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cBaseVersionVersionParserRuleCall_4_1_0 = (RuleCall)cBaseVersionAssignment_4_1.eContents().get(0);
		private final Keyword cActionsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cActionsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cActionsApplicationActionParserRuleCall_7_0 = (RuleCall)cActionsAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Model:
		//	'name' name=STRING
		//	'version' version=STRING ('from' baseVersion=Version)?
		//	'actions' '{'
		//	actions+=ApplicationAction*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'name' name=STRING 'version' version=STRING ('from' baseVersion=Version)? 'actions' '{' actions+=ApplicationAction* '}'
		public Group getGroup() { return cGroup; }
		
		//'name'
		public Keyword getNameKeyword_0() { return cNameKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'version'
		public Keyword getVersionKeyword_2() { return cVersionKeyword_2; }
		
		//version=STRING
		public Assignment getVersionAssignment_3() { return cVersionAssignment_3; }
		
		//STRING
		public RuleCall getVersionSTRINGTerminalRuleCall_3_0() { return cVersionSTRINGTerminalRuleCall_3_0; }
		
		//('from' baseVersion=Version)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'from'
		public Keyword getFromKeyword_4_0() { return cFromKeyword_4_0; }
		
		//baseVersion=Version
		public Assignment getBaseVersionAssignment_4_1() { return cBaseVersionAssignment_4_1; }
		
		//Version
		public RuleCall getBaseVersionVersionParserRuleCall_4_1_0() { return cBaseVersionVersionParserRuleCall_4_1_0; }
		
		//'actions'
		public Keyword getActionsKeyword_5() { return cActionsKeyword_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//actions+=ApplicationAction*
		public Assignment getActionsAssignment_7() { return cActionsAssignment_7; }
		
		//ApplicationAction
		public RuleCall getActionsApplicationActionParserRuleCall_7_0() { return cActionsApplicationActionParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class ApplicationActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.hribol.bromium.dsl.Bromium.ApplicationAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cActionIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cActionIdSTRINGTerminalRuleCall_1_0 = (RuleCall)cActionIdAssignment_1.eContents().get(0);
		private final Assignment cPreconditionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPreconditionPreconditionParserRuleCall_2_0 = (RuleCall)cPreconditionAssignment_2.eContents().get(0);
		private final Assignment cWebDriverActionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWebDriverActionWebDriverActionParserRuleCall_3_0 = (RuleCall)cWebDriverActionAssignment_3.eContents().get(0);
		private final Assignment cPostconditionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPostconditionPostconditionParserRuleCall_4_0 = (RuleCall)cPostconditionAssignment_4.eContents().get(0);
		private final Assignment cExpectHttpRequestAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExpectHttpRequestExpectHttpRequestParserRuleCall_5_0 = (RuleCall)cExpectHttpRequestAssignment_5.eContents().get(0);
		
		//ApplicationAction:
		//	'action' actionId=STRING
		//	precondition=Precondition?
		//	webDriverAction=WebDriverAction
		//	postcondition=Postcondition?
		//	expectHttpRequest=ExpectHttpRequest;
		@Override public ParserRule getRule() { return rule; }
		
		//'action' actionId=STRING precondition=Precondition? webDriverAction=WebDriverAction postcondition=Postcondition?
		//expectHttpRequest=ExpectHttpRequest
		public Group getGroup() { return cGroup; }
		
		//'action'
		public Keyword getActionKeyword_0() { return cActionKeyword_0; }
		
		//actionId=STRING
		public Assignment getActionIdAssignment_1() { return cActionIdAssignment_1; }
		
		//STRING
		public RuleCall getActionIdSTRINGTerminalRuleCall_1_0() { return cActionIdSTRINGTerminalRuleCall_1_0; }
		
		//precondition=Precondition?
		public Assignment getPreconditionAssignment_2() { return cPreconditionAssignment_2; }
		
		//Precondition
		public RuleCall getPreconditionPreconditionParserRuleCall_2_0() { return cPreconditionPreconditionParserRuleCall_2_0; }
		
		//webDriverAction=WebDriverAction
		public Assignment getWebDriverActionAssignment_3() { return cWebDriverActionAssignment_3; }
		
		//WebDriverAction
		public RuleCall getWebDriverActionWebDriverActionParserRuleCall_3_0() { return cWebDriverActionWebDriverActionParserRuleCall_3_0; }
		
		//postcondition=Postcondition?
		public Assignment getPostconditionAssignment_4() { return cPostconditionAssignment_4; }
		
		//Postcondition
		public RuleCall getPostconditionPostconditionParserRuleCall_4_0() { return cPostconditionPostconditionParserRuleCall_4_0; }
		
		//expectHttpRequest=ExpectHttpRequest
		public Assignment getExpectHttpRequestAssignment_5() { return cExpectHttpRequestAssignment_5; }
		
		//ExpectHttpRequest
		public RuleCall getExpectHttpRequestExpectHttpRequestParserRuleCall_5_0() { return cExpectHttpRequestExpectHttpRequestParserRuleCall_5_0; }
	}
	public class WebDriverActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.hribol.bromium.dsl.Bromium.WebDriverAction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cElementWithIdIsPresentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cClickOnElementWithIdParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cPageLoadParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cTypeTextInElementFoundByCssSelectorParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//WebDriverAction:
		//	ElementWithIdIsPresent | ClickOnElementWithId | PageLoad | TypeTextInElementFoundByCssSelector;
		@Override public ParserRule getRule() { return rule; }
		
		//ElementWithIdIsPresent | ClickOnElementWithId | PageLoad | TypeTextInElementFoundByCssSelector
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ElementWithIdIsPresent
		public RuleCall getElementWithIdIsPresentParserRuleCall_0() { return cElementWithIdIsPresentParserRuleCall_0; }
		
		//ClickOnElementWithId
		public RuleCall getClickOnElementWithIdParserRuleCall_1() { return cClickOnElementWithIdParserRuleCall_1; }
		
		//PageLoad
		public RuleCall getPageLoadParserRuleCall_2() { return cPageLoadParserRuleCall_2; }
		
		//TypeTextInElementFoundByCssSelector
		public RuleCall getTypeTextInElementFoundByCssSelectorParserRuleCall_3() { return cTypeTextInElementFoundByCssSelectorParserRuleCall_3; }
	}
	public class PreconditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.hribol.bromium.dsl.Bromium.Precondition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWhenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cActionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cActionWebDriverActionParserRuleCall_1_0 = (RuleCall)cActionAssignment_1.eContents().get(0);
		
		//Precondition:
		//	'when' action=WebDriverAction;
		@Override public ParserRule getRule() { return rule; }
		
		//'when' action=WebDriverAction
		public Group getGroup() { return cGroup; }
		
		//'when'
		public Keyword getWhenKeyword_0() { return cWhenKeyword_0; }
		
		//action=WebDriverAction
		public Assignment getActionAssignment_1() { return cActionAssignment_1; }
		
		//WebDriverAction
		public RuleCall getActionWebDriverActionParserRuleCall_1_0() { return cActionWebDriverActionParserRuleCall_1_0; }
	}
	public class PostconditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.hribol.bromium.dsl.Bromium.Postcondition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cThenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cMakeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cSureKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPostconditionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPostconditionWebDriverActionParserRuleCall_3_0 = (RuleCall)cPostconditionAssignment_3.eContents().get(0);
		
		//Postcondition:
		//	'then' 'make' 'sure' postcondition=WebDriverAction;
		@Override public ParserRule getRule() { return rule; }
		
		//'then' 'make' 'sure' postcondition=WebDriverAction
		public Group getGroup() { return cGroup; }
		
		//'then'
		public Keyword getThenKeyword_0() { return cThenKeyword_0; }
		
		//'make'
		public Keyword getMakeKeyword_1() { return cMakeKeyword_1; }
		
		//'sure'
		public Keyword getSureKeyword_2() { return cSureKeyword_2; }
		
		//postcondition=WebDriverAction
		public Assignment getPostconditionAssignment_3() { return cPostconditionAssignment_3; }
		
		//WebDriverAction
		public RuleCall getPostconditionWebDriverActionParserRuleCall_3_0() { return cPostconditionWebDriverActionParserRuleCall_3_0; }
	}
	public class ExpectHttpRequestElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.hribol.bromium.dsl.Bromium.ExpectHttpRequest");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNotKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cExpectKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cHttpKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cRequestKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ExpectHttpRequest:
		//	'do' 'not'? 'expect' 'http' 'request';
		@Override public ParserRule getRule() { return rule; }
		
		//'do' 'not'? 'expect' 'http' 'request'
		public Group getGroup() { return cGroup; }
		
		//'do'
		public Keyword getDoKeyword_0() { return cDoKeyword_0; }
		
		//'not'?
		public Keyword getNotKeyword_1() { return cNotKeyword_1; }
		
		//'expect'
		public Keyword getExpectKeyword_2() { return cExpectKeyword_2; }
		
		//'http'
		public Keyword getHttpKeyword_3() { return cHttpKeyword_3; }
		
		//'request'
		public Keyword getRequestKeyword_4() { return cRequestKeyword_4; }
	}
	public class ElementWithIdIsPresentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.hribol.bromium.dsl.Bromium.ElementWithIdIsPresent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cWithKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cCssKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cSelectorKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cCssSelectorAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cCssSelectorSTRINGTerminalRuleCall_4_0 = (RuleCall)cCssSelectorAssignment_4.eContents().get(0);
		private final Keyword cIsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cClickableKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//// TODO: syntactic sugar for CSS selectors
		//ElementWithIdIsPresent:
		//	'element' 'with' 'css' 'selector' cssSelector=STRING 'is' 'clickable';
		@Override public ParserRule getRule() { return rule; }
		
		//'element' 'with' 'css' 'selector' cssSelector=STRING 'is' 'clickable'
		public Group getGroup() { return cGroup; }
		
		//'element'
		public Keyword getElementKeyword_0() { return cElementKeyword_0; }
		
		//'with'
		public Keyword getWithKeyword_1() { return cWithKeyword_1; }
		
		//'css'
		public Keyword getCssKeyword_2() { return cCssKeyword_2; }
		
		//'selector'
		public Keyword getSelectorKeyword_3() { return cSelectorKeyword_3; }
		
		//cssSelector=STRING
		public Assignment getCssSelectorAssignment_4() { return cCssSelectorAssignment_4; }
		
		//STRING
		public RuleCall getCssSelectorSTRINGTerminalRuleCall_4_0() { return cCssSelectorSTRINGTerminalRuleCall_4_0; }
		
		//'is'
		public Keyword getIsKeyword_5() { return cIsKeyword_5; }
		
		//'clickable'
		public Keyword getClickableKeyword_6() { return cClickableKeyword_6; }
	}
	public class ClickOnElementWithIdElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.hribol.bromium.dsl.Bromium.ClickOnElementWithId");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClickKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cOnKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cElementKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cWithKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cCssKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSelectorKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cCssSelectorAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cCssSelectorSTRINGTerminalRuleCall_6_0 = (RuleCall)cCssSelectorAssignment_6.eContents().get(0);
		
		//ClickOnElementWithId:
		//	'click' 'on' 'element' 'with' 'css' 'selector' cssSelector=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'click' 'on' 'element' 'with' 'css' 'selector' cssSelector=STRING
		public Group getGroup() { return cGroup; }
		
		//'click'
		public Keyword getClickKeyword_0() { return cClickKeyword_0; }
		
		//'on'
		public Keyword getOnKeyword_1() { return cOnKeyword_1; }
		
		//'element'
		public Keyword getElementKeyword_2() { return cElementKeyword_2; }
		
		//'with'
		public Keyword getWithKeyword_3() { return cWithKeyword_3; }
		
		//'css'
		public Keyword getCssKeyword_4() { return cCssKeyword_4; }
		
		//'selector'
		public Keyword getSelectorKeyword_5() { return cSelectorKeyword_5; }
		
		//cssSelector=STRING
		public Assignment getCssSelectorAssignment_6() { return cCssSelectorAssignment_6; }
		
		//STRING
		public RuleCall getCssSelectorSTRINGTerminalRuleCall_6_0() { return cCssSelectorSTRINGTerminalRuleCall_6_0; }
	}
	public class PageLoadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.hribol.bromium.dsl.Bromium.PageLoad");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLoadKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSubpathAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSubpathSTRINGTerminalRuleCall_2_0 = (RuleCall)cSubpathAssignment_2.eContents().get(0);
		
		//PageLoad:
		//	'load' 'page' subpath=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'load' 'page' subpath=STRING
		public Group getGroup() { return cGroup; }
		
		//'load'
		public Keyword getLoadKeyword_0() { return cLoadKeyword_0; }
		
		//'page'
		public Keyword getPageKeyword_1() { return cPageKeyword_1; }
		
		//subpath=STRING
		public Assignment getSubpathAssignment_2() { return cSubpathAssignment_2; }
		
		//STRING
		public RuleCall getSubpathSTRINGTerminalRuleCall_2_0() { return cSubpathSTRINGTerminalRuleCall_2_0; }
	}
	public class TypeTextInElementFoundByCssSelectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.hribol.bromium.dsl.Bromium.TypeTextInElementFoundByCssSelector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextSTRINGTerminalRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		private final Keyword cInKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cElementKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cWithKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cCssKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cSelectorKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cCssSelectorAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cCssSelectorSTRINGTerminalRuleCall_7_0 = (RuleCall)cCssSelectorAssignment_7.eContents().get(0);
		
		//TypeTextInElementFoundByCssSelector:
		//	'type' text=STRING 'in' 'element' 'with' 'css' 'selector'
		//	cssSelector=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'type' text=STRING 'in' 'element' 'with' 'css' 'selector' cssSelector=STRING
		public Group getGroup() { return cGroup; }
		
		//'type'
		public Keyword getTypeKeyword_0() { return cTypeKeyword_0; }
		
		//text=STRING
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_1_0() { return cTextSTRINGTerminalRuleCall_1_0; }
		
		//'in'
		public Keyword getInKeyword_2() { return cInKeyword_2; }
		
		//'element'
		public Keyword getElementKeyword_3() { return cElementKeyword_3; }
		
		//'with'
		public Keyword getWithKeyword_4() { return cWithKeyword_4; }
		
		//'css'
		public Keyword getCssKeyword_5() { return cCssKeyword_5; }
		
		//'selector'
		public Keyword getSelectorKeyword_6() { return cSelectorKeyword_6; }
		
		//cssSelector=STRING
		public Assignment getCssSelectorAssignment_7() { return cCssSelectorAssignment_7; }
		
		//STRING
		public RuleCall getCssSelectorSTRINGTerminalRuleCall_7_0() { return cCssSelectorSTRINGTerminalRuleCall_7_0; }
	}
	public class VersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.hribol.bromium.dsl.Bromium.Version");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// TODO: include ThreeDotted version as well
		//Version:
		//	STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class ThreeDottedVersionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.hribol.bromium.dsl.Bromium.ThreeDottedVersion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cBigAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cBigINTTerminalRuleCall_0_0 = (RuleCall)cBigAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMediumAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMediumINTTerminalRuleCall_2_0 = (RuleCall)cMediumAssignment_2.eContents().get(0);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSmallAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cSmallINTTerminalRuleCall_4_0 = (RuleCall)cSmallAssignment_4.eContents().get(0);
		
		//ThreeDottedVersion:
		//	big=INT '.' medium=INT '.' small=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//big=INT '.' medium=INT '.' small=INT
		public Group getGroup() { return cGroup; }
		
		//big=INT
		public Assignment getBigAssignment_0() { return cBigAssignment_0; }
		
		//INT
		public RuleCall getBigINTTerminalRuleCall_0_0() { return cBigINTTerminalRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//medium=INT
		public Assignment getMediumAssignment_2() { return cMediumAssignment_2; }
		
		//INT
		public RuleCall getMediumINTTerminalRuleCall_2_0() { return cMediumINTTerminalRuleCall_2_0; }
		
		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
		
		//small=INT
		public Assignment getSmallAssignment_4() { return cSmallAssignment_4; }
		
		//INT
		public RuleCall getSmallINTTerminalRuleCall_4_0() { return cSmallINTTerminalRuleCall_4_0; }
	}
	
	
	private final ModelElements pModel;
	private final ApplicationActionElements pApplicationAction;
	private final WebDriverActionElements pWebDriverAction;
	private final PreconditionElements pPrecondition;
	private final PostconditionElements pPostcondition;
	private final ExpectHttpRequestElements pExpectHttpRequest;
	private final ElementWithIdIsPresentElements pElementWithIdIsPresent;
	private final ClickOnElementWithIdElements pClickOnElementWithId;
	private final PageLoadElements pPageLoad;
	private final TypeTextInElementFoundByCssSelectorElements pTypeTextInElementFoundByCssSelector;
	private final VersionElements pVersion;
	private final ThreeDottedVersionElements pThreeDottedVersion;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BromiumGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pApplicationAction = new ApplicationActionElements();
		this.pWebDriverAction = new WebDriverActionElements();
		this.pPrecondition = new PreconditionElements();
		this.pPostcondition = new PostconditionElements();
		this.pExpectHttpRequest = new ExpectHttpRequestElements();
		this.pElementWithIdIsPresent = new ElementWithIdIsPresentElements();
		this.pClickOnElementWithId = new ClickOnElementWithIdElements();
		this.pPageLoad = new PageLoadElements();
		this.pTypeTextInElementFoundByCssSelector = new TypeTextInElementFoundByCssSelectorElements();
		this.pVersion = new VersionElements();
		this.pThreeDottedVersion = new ThreeDottedVersionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.hribol.bromium.dsl.Bromium".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	'name' name=STRING
	//	'version' version=STRING ('from' baseVersion=Version)?
	//	'actions' '{'
	//	actions+=ApplicationAction*
	//	'}';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//ApplicationAction:
	//	'action' actionId=STRING
	//	precondition=Precondition?
	//	webDriverAction=WebDriverAction
	//	postcondition=Postcondition?
	//	expectHttpRequest=ExpectHttpRequest;
	public ApplicationActionElements getApplicationActionAccess() {
		return pApplicationAction;
	}
	
	public ParserRule getApplicationActionRule() {
		return getApplicationActionAccess().getRule();
	}
	
	//WebDriverAction:
	//	ElementWithIdIsPresent | ClickOnElementWithId | PageLoad | TypeTextInElementFoundByCssSelector;
	public WebDriverActionElements getWebDriverActionAccess() {
		return pWebDriverAction;
	}
	
	public ParserRule getWebDriverActionRule() {
		return getWebDriverActionAccess().getRule();
	}
	
	//Precondition:
	//	'when' action=WebDriverAction;
	public PreconditionElements getPreconditionAccess() {
		return pPrecondition;
	}
	
	public ParserRule getPreconditionRule() {
		return getPreconditionAccess().getRule();
	}
	
	//Postcondition:
	//	'then' 'make' 'sure' postcondition=WebDriverAction;
	public PostconditionElements getPostconditionAccess() {
		return pPostcondition;
	}
	
	public ParserRule getPostconditionRule() {
		return getPostconditionAccess().getRule();
	}
	
	//ExpectHttpRequest:
	//	'do' 'not'? 'expect' 'http' 'request';
	public ExpectHttpRequestElements getExpectHttpRequestAccess() {
		return pExpectHttpRequest;
	}
	
	public ParserRule getExpectHttpRequestRule() {
		return getExpectHttpRequestAccess().getRule();
	}
	
	//// TODO: syntactic sugar for CSS selectors
	//ElementWithIdIsPresent:
	//	'element' 'with' 'css' 'selector' cssSelector=STRING 'is' 'clickable';
	public ElementWithIdIsPresentElements getElementWithIdIsPresentAccess() {
		return pElementWithIdIsPresent;
	}
	
	public ParserRule getElementWithIdIsPresentRule() {
		return getElementWithIdIsPresentAccess().getRule();
	}
	
	//ClickOnElementWithId:
	//	'click' 'on' 'element' 'with' 'css' 'selector' cssSelector=STRING;
	public ClickOnElementWithIdElements getClickOnElementWithIdAccess() {
		return pClickOnElementWithId;
	}
	
	public ParserRule getClickOnElementWithIdRule() {
		return getClickOnElementWithIdAccess().getRule();
	}
	
	//PageLoad:
	//	'load' 'page' subpath=STRING;
	public PageLoadElements getPageLoadAccess() {
		return pPageLoad;
	}
	
	public ParserRule getPageLoadRule() {
		return getPageLoadAccess().getRule();
	}
	
	//TypeTextInElementFoundByCssSelector:
	//	'type' text=STRING 'in' 'element' 'with' 'css' 'selector'
	//	cssSelector=STRING;
	public TypeTextInElementFoundByCssSelectorElements getTypeTextInElementFoundByCssSelectorAccess() {
		return pTypeTextInElementFoundByCssSelector;
	}
	
	public ParserRule getTypeTextInElementFoundByCssSelectorRule() {
		return getTypeTextInElementFoundByCssSelectorAccess().getRule();
	}
	
	//// TODO: include ThreeDotted version as well
	//Version:
	//	STRING;
	public VersionElements getVersionAccess() {
		return pVersion;
	}
	
	public ParserRule getVersionRule() {
		return getVersionAccess().getRule();
	}
	
	//ThreeDottedVersion:
	//	big=INT '.' medium=INT '.' small=INT;
	public ThreeDottedVersionElements getThreeDottedVersionAccess() {
		return pThreeDottedVersion;
	}
	
	public ParserRule getThreeDottedVersionRule() {
		return getThreeDottedVersionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
