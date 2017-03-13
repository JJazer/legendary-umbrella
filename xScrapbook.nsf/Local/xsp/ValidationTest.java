/*
 * Generated file. 
 * 
 * ValidationTest.java
 */
package xsp;

import com.ibm.xsp.page.compiled.AbstractCompiledPage;
import com.ibm.xsp.page.compiled.AbstractCompiledPageDispatcher;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import com.ibm.xsp.page.compiled.NoSuchComponentException;
import com.ibm.xsp.page.compiled.PageExpressionEvaluator;
import java.lang.String;
import com.ibm.xsp.resource.ScriptResource;
import com.ibm.xsp.component.FacesPageProvider;
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.xp.XspInputText;
import com.ibm.xsp.validator.RequiredValidator;
import com.ibm.xsp.component.xp.XspMessage;
import com.ibm.xsp.component.xp.XspLineBreak;
import com.ibm.xsp.validator.LengthValidatorEx;
import com.ibm.xsp.component.xp.XspOutputLabel;
import com.ibm.xsp.component.xp.XspSelectOneMenu;
import com.ibm.xsp.component.UISelectItemEx;
import com.ibm.xsp.component.xp.XspInputCheckbox;
import com.ibm.xsp.convert.NumberConverter;
import com.ibm.xsp.validator.ConstraintValidator;
import com.ibm.xsp.validator.ExpressionValidator;
import javax.faces.el.ValueBinding;
import com.ibm.xsp.component.xp.XspMessages;
import com.ibm.xsp.component.xp.XspCommandButton;
import com.ibm.xsp.component.xp.XspEventHandler;
import com.ibm.xsp.actions.ExecuteScriptAction;
import javax.faces.el.MethodBinding;
import com.ibm.xsp.actions.client.ExecuteScriptClientAction;
import com.ibm.xsp.page.compiled.PageParam;

@SuppressWarnings("all")
public class ValidationTest extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public ValidationTest() {
        super("8.5.1"); // version of xp:eventHandler script
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new ValidationTestPage();
    }
    
    public static class ValidationTestPage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 "name"
            ComponentInfo.EMPTY_NORMAL, // 1 "message1"
            ComponentInfo.EMPTY_NORMAL, // 2 br
            ComponentInfo.EMPTY_NORMAL, // 3 "tagline"
            ComponentInfo.EMPTY_NORMAL, // 4 "taglabel"
            ComponentInfo.EMPTY_NORMAL, // 5 br2
            ComponentInfo.EMPTY_NORMAL, // 6 selectItem
            ComponentInfo.EMPTY_NORMAL, // 7 selectItem2
            ComponentInfo.EMPTY_NORMAL, // 8 selectItem3
            new ComponentInfo(false, new int[]{6, 7, 8}), // 9 "color"
            ComponentInfo.EMPTY_NORMAL, // 10 br3
            ComponentInfo.EMPTY_NORMAL, // 11 "checkbox1"
            ComponentInfo.EMPTY_NORMAL, // 12 br4
            ComponentInfo.EMPTY_NORMAL, // 13 "inputtext3"
            ComponentInfo.EMPTY_NORMAL, // 14 br5
            ComponentInfo.EMPTY_NORMAL, // 15 "label1"
            ComponentInfo.EMPTY_NORMAL, // 16 "email"
            ComponentInfo.EMPTY_NORMAL, // 17 br6
            ComponentInfo.EMPTY_NORMAL, // 18 "label2"
            ComponentInfo.EMPTY_NORMAL, // 19 "test1"
            ComponentInfo.EMPTY_NORMAL, // 20 br7
            ComponentInfo.EMPTY_NORMAL, // 21 "label3"
            ComponentInfo.EMPTY_NORMAL, // 22 "test2"
            ComponentInfo.EMPTY_NORMAL, // 23 br8
            ComponentInfo.EMPTY_NORMAL, // 24 "messages1"
            ComponentInfo.EMPTY_NORMAL, // 25 br9
            ComponentInfo.EMPTY_NORMAL, // 26 eventHandler
            new ComponentInfo(false, new int[]{26}), // 27 "button1"
            new ComponentInfo(false, new int[]{0, 1, 2, 3, 4, 5, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 27}), // 28 view
        };
        private static final String[][] s_localeStrs = new String[][]{
            new String[]{ // ""
                "You must fill this field in.", // 0 name/xp:this.validators[1]/xp:validateRequired[1]/@message
                "Wi\u0119cej liter ni\u017c 4 mniej ni\u017c 40", // 1 TagLine/xp:this.validators[1]/xp:validateLength[1]/@message
                "Pole wymagane", // 2 TagLine/xp:this.validators[1]/xp:validateRequired[1]/@message
                "red", // 3 color/xp:selectItem[1]/@itemLabel
                "green", // 4 color/xp:selectItem[2]/@itemLabel
                "Untitled", // 5 color/xp:selectItem[3]/@itemLabel
                "Label", // 6 checkBox1/@text
                "eMail", // 7 label1/@value
                "This doesn\'t seem to be an eMail", // 8 eMail/xp:this.validators[1]/xp:validateConstraint[1]/@message
                "test1", // 9 label2/@value
                "test2", // 10 label3/@value
                "Expression not match", // 11 test2/xp:this.validators[1]/xp:validateExpression[1]/@message
                "Submit", // 12 button1/@value
            },
            new String[]{ // de
                "[de| You must fill this field in. ]", // 0 name/xp:this.validators[1]/xp:validateRequired[1]/@message
                "[de| Wi\u0119cej liter ni\u017c 4 mniej ni\u017c 40 ]", // 1 TagLine/xp:this.validators[1]/xp:validateLength[1]/@message
                "[de| Pole wymagane ]", // 2 TagLine/xp:this.validators[1]/xp:validateRequired[1]/@message
                "[de| red ]", // 3 color/xp:selectItem[1]/@itemLabel
                "[de| green ]", // 4 color/xp:selectItem[2]/@itemLabel
                "[de| Untitled ]", // 5 color/xp:selectItem[3]/@itemLabel
                "[de| Label ]", // 6 checkBox1/@text
                "[de| eMail ]", // 7 label1/@value
                "[de| This doesn\'t seem to be an eMail ]", // 8 eMail/xp:this.validators[1]/xp:validateConstraint[1]/@message
                "[de| test1 ]", // 9 label2/@value
                "[de| test2 ]", // 10 label3/@value
                "[de| Expression not match ]", // 11 test2/xp:this.validators[1]/xp:validateExpression[1]/@message
                "[de| Submit ]", // 12 button1/@value
            },
            new String[]{ // pl
                "[pl| You must fill this field in. ]", // 0 name/xp:this.validators[1]/xp:validateRequired[1]/@message
                "[pl| Wi\u0119cej liter ni\u017c 4 mniej ni\u017c 40 ]", // 1 TagLine/xp:this.validators[1]/xp:validateLength[1]/@message
                "[pl| Pole wymagane ]", // 2 TagLine/xp:this.validators[1]/xp:validateRequired[1]/@message
                "[pl| red ]", // 3 color/xp:selectItem[1]/@itemLabel
                "[pl| green ]", // 4 color/xp:selectItem[2]/@itemLabel
                "[pl| Untitled ]", // 5 color/xp:selectItem[3]/@itemLabel
                "[pl| Label ]", // 6 checkBox1/@text
                "[pl| eMail ]", // 7 label1/@value
                "[pl| This doesn\'t seem to be an eMail ]", // 8 eMail/xp:this.validators[1]/xp:validateConstraint[1]/@message
                "[pl| test1 ]", // 9 label2/@value
                "[pl| test2 ]", // 10 label3/@value
                "[pl| Expression not match ]", // 11 test2/xp:this.validators[1]/xp:validateExpression[1]/@message
                "[pl| Submit ]", // 12 button1/@value
            },
            new String[]{ // zh_CN
                "[zh_CN| You must fill this field in. ]", // 0 name/xp:this.validators[1]/xp:validateRequired[1]/@message
                "[zh_CN| Wi\u0119cej liter ni\u017c 4 mniej ni\u017c 40 ]", // 1 TagLine/xp:this.validators[1]/xp:validateLength[1]/@message
                "[zh_CN| Pole wymagane ]", // 2 TagLine/xp:this.validators[1]/xp:validateRequired[1]/@message
                "[zh_CN| red ]", // 3 color/xp:selectItem[1]/@itemLabel
                "[zh_CN| green ]", // 4 color/xp:selectItem[2]/@itemLabel
                "[zh_CN| Untitled ]", // 5 color/xp:selectItem[3]/@itemLabel
                "[zh_CN| Label ]", // 6 checkBox1/@text
                "[zh_CN| eMail ]", // 7 label1/@value
                "[zh_CN| This doesn\'t seem to be an eMail ]", // 8 eMail/xp:this.validators[1]/xp:validateConstraint[1]/@message
                "[zh_CN| test1 ]", // 9 label2/@value
                "[zh_CN| test2 ]", // 10 label3/@value
                "[zh_CN| Expression not match ]", // 11 test2/xp:this.validators[1]/xp:validateExpression[1]/@message
                "[zh_CN| Submit ]", // 12 button1/@value
            },
        };
        private String[] _currentLocale;
        
        public ValidationTestPage() {
            super(28, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "name".equals(id) )
                return 0;
            if( "message1".equals(id) )
                return 1;
            if( "tagline".equals(id) )
                return 3;
            if( "taglabel".equals(id) )
                return 4;
            if( "color".equals(id) )
                return 9;
            if( "checkbox1".equals(id) )
                return 11;
            if( "inputtext3".equals(id) )
                return 13;
            if( "label1".equals(id) )
                return 15;
            if( "email".equals(id) )
                return 16;
            if( "label2".equals(id) )
                return 18;
            if( "test1".equals(id) )
                return 19;
            if( "label3".equals(id) )
                return 21;
            if( "test2".equals(id) )
                return 22;
            if( "messages1".equals(id) )
                return 24;
            if( "button1".equals(id) )
                return 27;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 28:
                return createView(context, parent, evaluator);
            case 0:
                return createName(context, parent, evaluator);
            case 1:
                return createMessage1(context, parent, evaluator);
            case 2:
                return createBr(context, parent, evaluator);
            case 3:
                return createTagline(context, parent, evaluator);
            case 4:
                return createTaglabel(context, parent, evaluator);
            case 5:
                return createBr2(context, parent, evaluator);
            case 9:
                return createColor(context, parent, evaluator);
            case 6:
                return createSelectItem(context, parent, evaluator);
            case 7:
                return createSelectItem2(context, parent, evaluator);
            case 8:
                return createSelectItem3(context, parent, evaluator);
            case 10:
                return createBr3(context, parent, evaluator);
            case 11:
                return createCheckbox1(context, parent, evaluator);
            case 12:
                return createBr4(context, parent, evaluator);
            case 13:
                return createInputtext3(context, parent, evaluator);
            case 14:
                return createBr5(context, parent, evaluator);
            case 15:
                return createLabel1(context, parent, evaluator);
            case 16:
                return createEmail(context, parent, evaluator);
            case 17:
                return createBr6(context, parent, evaluator);
            case 18:
                return createLabel2(context, parent, evaluator);
            case 19:
                return createTest1(context, parent, evaluator);
            case 20:
                return createBr7(context, parent, evaluator);
            case 21:
                return createLabel3(context, parent, evaluator);
            case 22:
                return createTest2(context, parent, evaluator);
            case 23:
                return createBr8(context, parent, evaluator);
            case 24:
                return createMessages1(context, parent, evaluator);
            case 25:
                return createBr9(context, parent, evaluator);
            case 27:
                return createButton1(context, parent, evaluator);
            case 26:
                return createEventHandler(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        protected void initIncluderAsRoot(FacesContext context,
                PageExpressionEvaluator evaluator, UIComponent root) {
            ScriptResource resources = new ScriptResource();
            resources.setComponent(root);
            resources.setClientSide(true);
            resources.setSrc("/ClientCideValidation.js");
            FacesPageProvider asPageProvider = root instanceof FacesPageProvider ?
                    (FacesPageProvider) root : null;
            if( null != asPageProvider ){
                asPageProvider.addResource(resources);
            }
            ScriptResource resources2 = new ScriptResource();
            resources2.setComponent(root);
            resources2.setClientSide(false);
            resources2.setSrc("/ServerSideValidattion.jss");
            if( null != asPageProvider ){
                asPageProvider.addResource(resources2);
            }
        }

        private UIComponent createView(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIViewRootEx2 result = new UIViewRootEx2();
            initViewRoot(result);
            ScriptResource resources = new ScriptResource();
            resources.setComponent(result);
            resources.setClientSide(true);
            resources.setSrc("/ClientCideValidation.js");
            result.addResource(resources);
            ScriptResource resources2 = new ScriptResource();
            resources2.setComponent(result);
            resources2.setClientSide(false);
            resources2.setSrc("/ServerSideValidattion.jss");
            result.addResource(resources2);
            return result;
        }

        private UIComponent createName(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            RequiredValidator validators = new RequiredValidator();
            validators.setComponent(result);
            validators.setMessage(_currentLocale[0]);
            result.addValidator(validators);
            result.setDisableClientSideValidation(true);
            setId(result, "name");
            result.setRequired(true);
            return result;
        }

        private UIComponent createMessage1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspMessage result = new XspMessage();
            result.setFor("name");
            setId(result, "message1");
            return result;
        }

        private UIComponent createBr(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createTagline(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            LengthValidatorEx validators = new LengthValidatorEx();
            validators.setComponent(result);
            validators.setMaximum(40);
            validators.setMessage(_currentLocale[1]);
            validators.setMinimum(4);
            result.addValidator(validators);
            RequiredValidator validators2 = new RequiredValidator();
            validators2.setComponent(result);
            validators2.setMessage(_currentLocale[2]);
            result.addValidator(validators2);
            result.setDisableClientSideValidation(true);
            setId(result, "TagLine");
            result.setRequired(true);
            return result;
        }

        private UIComponent createTaglabel(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            setId(result, "TagLabel");
            return result;
        }

        private UIComponent createBr2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createColor(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspSelectOneMenu result = new XspSelectOneMenu();
            setId(result, "color");
            return result;
        }

        private UIComponent createSelectItem(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UISelectItemEx result = new UISelectItemEx();
            result.setItemLabel(_currentLocale[3]);
            return result;
        }

        private UIComponent createSelectItem2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UISelectItemEx result = new UISelectItemEx();
            result.setItemLabel(_currentLocale[4]);
            return result;
        }

        private UIComponent createSelectItem3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UISelectItemEx result = new UISelectItemEx();
            result.setItemLabel(_currentLocale[5]);
            return result;
        }

        private UIComponent createBr3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createCheckbox1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputCheckbox result = new XspInputCheckbox();
            setId(result, "checkBox1");
            result.setText(_currentLocale[6]);
            return result;
        }

        private UIComponent createBr4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createInputtext3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            NumberConverter converter = new NumberConverter();
            result.setConverter(converter);
            setId(result, "inputText3");
            return result;
        }

        private UIComponent createBr5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createLabel1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[7]);
            setId(result, "label1");
            return result;
        }

        private UIComponent createEmail(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            ConstraintValidator validators = new ConstraintValidator();
            validators.setComponent(result);
            validators.setRegex("[\\w-]+@([\\w-]+\\.)+[\\w-]+");
            validators.setMessage(_currentLocale[8]);
            result.addValidator(validators);
            setId(result, "eMail");
            return result;
        }

        private UIComponent createBr6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createLabel2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[9]);
            setId(result, "label2");
            return result;
        }

        private UIComponent createTest1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            setId(result, "test1");
            return result;
        }

        private UIComponent createBr7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createLabel3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[10]);
            setId(result, "label3");
            return result;
        }

        private UIComponent createTest2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            ExpressionValidator validators = new ExpressionValidator();
            validators.setComponent(result);
            validators.setMessage(_currentLocale[11]);
            String sourceId = "test2/xp:this.validators[1]/xp:validateExpression[1]/xp:this.expression[1]/text()";
            String expressionExpr = "#{javascript:var v1 = getComponent(\"test1\").getValue(); \nvar v2 = this.getSubmittedValue(); \nreturn v1==v2 \n}";
            ValueBinding expression = evaluator.createValueBinding(result, expressionExpr, sourceId,boolean.class);
            validators.setValueBinding("expression", expression);
            result.addValidator(validators);
            setId(result, "test2");
            return result;
        }

        private UIComponent createBr8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createMessages1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspMessages result = new XspMessages();
            setId(result, "messages1");
            return result;
        }

        private UIComponent createBr9(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createButton1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[12]);
            setId(result, "button1");
            return result;
        }

        private UIComponent createEventHandler(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(false);
            ExecuteScriptAction action = new ExecuteScriptAction();
            action.setComponent(result);
            String sourceId = "button1/xp:eventHandler[1]/xp:this.action[1]/xp:executeScript[1]/xp:this.script[1]/text()";
            MethodBinding script = evaluator.createMethodBinding(result,
                    "#{javascript:requiredFieldCheck(\ngetComponent(\"TagLine\"),\ngetComponent(\"TagLabel\"),\n\"Please provide a tag line!\");}",
                    null,null, sourceId);
            action.setScript(script);
            action.setSourceReferenceId("button1/xp:eventHandler[1]/xp:this.action[1]/xp:executeScript[1]");
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            ExecuteScriptClientAction script2 = new ExecuteScriptClientAction();
            script2.setComponent(result);
            String sourceId2 = "button1/xp:eventHandler[1]/xp:this.script[1]/xp:executeClientScript[1]/xp:this.script[1]/text()";
            String scriptExpr = "var element = dojo.byId(\"#{id:TagLine}\");\n      checkSearchField(element, 4, \"We need a tag line\");";
            ValueBinding script3 = evaluator.createValueBinding(result, scriptExpr, sourceId2,String.class);
            script2.setValueBinding("script", script3);
            script2.setSourceReferenceId("button1/xp:eventHandler[1]/xp:this.script[1]/xp:executeClientScript[1]");
            result.setScript(script2);
            result.setSave(true);
            result.setRefreshMode("complete");
            return result;
        }

        public void init(PageParam param) {
            super.init(param);
            _currentLocale = s_localeStrs[param.getLocalizedStringsIndex()];
        }

    }
}
