/*
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class BromiumProposalProvider extends AbstractBromiumProposalProvider {
    
    override void complete_Postcondition(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    	acceptor.accept(createCompletionProposal("then make sure", context));
    	super.complete_Precondition(model, ruleCall, context, acceptor);
    }
    
    override void complete_WebDriverAction(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("click on element with css selector", context));
		acceptor.accept(createCompletionProposal("type 'text' in element with css selector 'selector'", context));
		acceptor.accept(createCompletionProposal("load page 'subpath'", context));
		acceptor.accept(createCompletionProposal("click on element with class 'class' and text 'text'", context));
		super.complete_WebDriverAction(model, ruleCall, context, acceptor);
	}
	
	override void complete_WebDriverActionCondition(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("element with css selector 'selector' is present", context));
		acceptor.accept(createCompletionProposal("text of element with css selector 'cssSelector' is 'text'", context));
		super.complete_WebDriverActionCondition(model, ruleCall, context, acceptor);
	}
	
	override void complete_ExpectHttpRequest(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("do not expect http request", context));
		acceptor.accept(createCompletionProposal("do expect http request", context));
		super.complete_ExpectHttpRequest(model, ruleCall, context, acceptor);
	}
	
}
