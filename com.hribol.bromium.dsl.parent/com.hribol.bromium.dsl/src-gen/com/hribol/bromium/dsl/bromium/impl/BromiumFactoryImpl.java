/**
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.bromium.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BromiumFactoryImpl extends EFactoryImpl implements BromiumFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BromiumFactory init()
  {
    try
    {
      BromiumFactory theBromiumFactory = (BromiumFactory)EPackage.Registry.INSTANCE.getEFactory(BromiumPackage.eNS_URI);
      if (theBromiumFactory != null)
      {
        return theBromiumFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BromiumFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BromiumFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BromiumPackage.MODEL: return createModel();
      case BromiumPackage.APPLICATION_ACTION: return createApplicationAction();
      case BromiumPackage.SYNTAX_DEFINITION: return createSyntaxDefinition();
      case BromiumPackage.WEB_DRIVER_ACTION_CONDITION: return createWebDriverActionCondition();
      case BromiumPackage.WEB_DRIVER_ACTION: return createWebDriverAction();
      case BromiumPackage.PRECONDITION: return createPrecondition();
      case BromiumPackage.POSTCONDITION: return createPostcondition();
      case BromiumPackage.EXPECT_HTTP_REQUEST: return createExpectHttpRequest();
      case BromiumPackage.ELEMENT_BY_CSS_TO_BE_PRESENT: return createElementByCssToBePresent();
      case BromiumPackage.CLICK_CSS_SELECTOR: return createClickCssSelector();
      case BromiumPackage.PAGE_LOAD: return createPageLoad();
      case BromiumPackage.TYPE_TEXT_IN_ELEMENT_FOUND_BY_CSS_SELECTOR: return createTypeTextInElementFoundByCssSelector();
      case BromiumPackage.TEXT_OF_ELEMENT_WITH_CSS_SELECTOR_TO_BE: return createTextOfElementWithCssSelectorToBe();
      case BromiumPackage.CLICK_CLASS_BY_TEXT: return createClickClassByText();
      case BromiumPackage.PARAMETER_VALUE: return createParameterValue();
      case BromiumPackage.EXPOSED_PARAMETER: return createExposedParameter();
      case BromiumPackage.THREE_DOTTED_VERSION: return createThreeDottedVersion();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationAction createApplicationAction()
  {
    ApplicationActionImpl applicationAction = new ApplicationActionImpl();
    return applicationAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SyntaxDefinition createSyntaxDefinition()
  {
    SyntaxDefinitionImpl syntaxDefinition = new SyntaxDefinitionImpl();
    return syntaxDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebDriverActionCondition createWebDriverActionCondition()
  {
    WebDriverActionConditionImpl webDriverActionCondition = new WebDriverActionConditionImpl();
    return webDriverActionCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebDriverAction createWebDriverAction()
  {
    WebDriverActionImpl webDriverAction = new WebDriverActionImpl();
    return webDriverAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Precondition createPrecondition()
  {
    PreconditionImpl precondition = new PreconditionImpl();
    return precondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Postcondition createPostcondition()
  {
    PostconditionImpl postcondition = new PostconditionImpl();
    return postcondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpectHttpRequest createExpectHttpRequest()
  {
    ExpectHttpRequestImpl expectHttpRequest = new ExpectHttpRequestImpl();
    return expectHttpRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementByCssToBePresent createElementByCssToBePresent()
  {
    ElementByCssToBePresentImpl elementByCssToBePresent = new ElementByCssToBePresentImpl();
    return elementByCssToBePresent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClickCssSelector createClickCssSelector()
  {
    ClickCssSelectorImpl clickCssSelector = new ClickCssSelectorImpl();
    return clickCssSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageLoad createPageLoad()
  {
    PageLoadImpl pageLoad = new PageLoadImpl();
    return pageLoad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeTextInElementFoundByCssSelector createTypeTextInElementFoundByCssSelector()
  {
    TypeTextInElementFoundByCssSelectorImpl typeTextInElementFoundByCssSelector = new TypeTextInElementFoundByCssSelectorImpl();
    return typeTextInElementFoundByCssSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextOfElementWithCssSelectorToBe createTextOfElementWithCssSelectorToBe()
  {
    TextOfElementWithCssSelectorToBeImpl textOfElementWithCssSelectorToBe = new TextOfElementWithCssSelectorToBeImpl();
    return textOfElementWithCssSelectorToBe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClickClassByText createClickClassByText()
  {
    ClickClassByTextImpl clickClassByText = new ClickClassByTextImpl();
    return clickClassByText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValue createParameterValue()
  {
    ParameterValueImpl parameterValue = new ParameterValueImpl();
    return parameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExposedParameter createExposedParameter()
  {
    ExposedParameterImpl exposedParameter = new ExposedParameterImpl();
    return exposedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThreeDottedVersion createThreeDottedVersion()
  {
    ThreeDottedVersionImpl threeDottedVersion = new ThreeDottedVersionImpl();
    return threeDottedVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BromiumPackage getBromiumPackage()
  {
    return (BromiumPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BromiumPackage getPackage()
  {
    return BromiumPackage.eINSTANCE;
  }

} //BromiumFactoryImpl
