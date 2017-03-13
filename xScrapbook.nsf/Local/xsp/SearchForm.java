/*
 * Generated file. 
 * 
 * SearchForm.java
 */
package xsp;

import com.ibm.xsp.page.compiled.AbstractCompiledPage;
import com.ibm.xsp.page.compiled.AbstractCompiledPageDispatcher;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import com.ibm.xsp.page.compiled.NoSuchComponentException;
import com.ibm.xsp.page.compiled.PageExpressionEvaluator;
import java.lang.String;
import com.ibm.xsp.resource.StyleSheetResource;
import com.ibm.xsp.component.FacesPageProvider;
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.xp.XspCommandButton;
import com.ibm.xsp.component.xp.XspEventHandler;
import com.ibm.xsp.actions.OpenPageAction;
import com.ibm.xsp.component.xp.XspLineBreak;
import com.ibm.xsp.component.xp.XspOutputLabel;
import com.ibm.xsp.component.xp.XspInputText;
import com.ibm.xsp.validator.LengthValidatorEx;
import java.lang.Object;
import javax.faces.el.ValueBinding;
import com.ibm.xsp.component.xp.XspTypeAhead;
import com.ibm.xsp.component.UIPassThroughText;
import com.ibm.xsp.actions.ActionGroup;
import com.ibm.xsp.actions.ExecuteScriptAction;
import javax.faces.el.MethodBinding;
import com.ibm.xsp.page.compiled.PageParam;

@SuppressWarnings("all")
public class SearchForm extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public SearchForm() {
        super("3.0");
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new SearchFormPage();
    }
    
    protected boolean isCustomControl() {
        return true;
    }

    public static class SearchFormPage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 eventHandler
            new ComponentInfo(false, new int[]{0}), // 1 "button1"
            ComponentInfo.EMPTY_NORMAL, // 2 br
            ComponentInfo.EMPTY_NORMAL, // 3 br2
            ComponentInfo.EMPTY_NORMAL, // 4 "label1"
            ComponentInfo.EMPTY_NORMAL, // 5 br3
            ComponentInfo.EMPTY_NORMAL, // 6 "label2"
            ComponentInfo.EMPTY_NORMAL, // 7 br4
            ComponentInfo.EMPTY_NORMAL, // 8 typeAhead
            new ComponentInfo(false, new int[]{8}), // 9 "searchbox"
            ComponentInfo.EMPTY_MARKUP, // 10 text
            ComponentInfo.EMPTY_NORMAL, // 11 eventHandler2
            new ComponentInfo(false, new int[]{11}), // 12 "button2"
            new ComponentInfo(false, new int[]{1, 2, 3, 4, 5, 6, 7, 9, 10, 12}), // 13 view
        };
        private static final String[][] s_localeStrs = new String[][]{
            new String[]{ // ""
                "New profile", // 0 button1/@value
                "Profile Search", // 1 label1/@value
                "Enter the search criteria", // 2 label2/@value
                "You need to enter more than 3 and less than 40 characters", // 3 searchBox/xp:this.validators[1]/xp:validateLength[1]/@message
                "\u00a0", // 4 /xp:view[1]/text()[10]
                "Search", // 5 button2/@value
            },
            new String[]{ // de
                "[de| New profile ]", // 0 button1/@value
                "[de| Profile Search ]", // 1 label1/@value
                "[de| Enter the search criteria ]", // 2 label2/@value
                "[de| You need to enter more than 3 and less than 40 characters ]", // 3 searchBox/xp:this.validators[1]/xp:validateLength[1]/@message
                "[de| \u00a0 ]", // 4 /xp:view[1]/text()[10]
                "[de| Search ]", // 5 button2/@value
            },
            new String[]{ // pl
                "[pl| New profile ]", // 0 button1/@value
                "[pl| Profile Search ]", // 1 label1/@value
                "[pl| Enter the search criteria ]", // 2 label2/@value
                "[pl| You need to enter more than 3 and less than 40 characters ]", // 3 searchBox/xp:this.validators[1]/xp:validateLength[1]/@message
                "[pl| \u00a0 ]", // 4 /xp:view[1]/text()[10]
                "[pl| Search ]", // 5 button2/@value
            },
            new String[]{ // zh_CN
                "[zh_CN| New profile ]", // 0 button1/@value
                "[zh_CN| Profile Search ]", // 1 label1/@value
                "[zh_CN| Enter the search criteria ]", // 2 label2/@value
                "[zh_CN| You need to enter more than 3 and less than 40 characters ]", // 3 searchBox/xp:this.validators[1]/xp:validateLength[1]/@message
                "[zh_CN| \u00a0 ]", // 4 /xp:view[1]/text()[10]
                "[zh_CN| Search ]", // 5 button2/@value
            },
        };
        private String[] _currentLocale;
        
        public SearchFormPage() {
            super(13, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "button1".equals(id) )
                return 1;
            if( "label1".equals(id) )
                return 4;
            if( "label2".equals(id) )
                return 6;
            if( "searchbox".equals(id) )
                return 9;
            if( "button2".equals(id) )
                return 12;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 13:
                return createView(context, parent, evaluator);
            case 1:
                return createButton1(context, parent, evaluator);
            case 0:
                return createEventHandler(context, parent, evaluator);
            case 2:
                return createBr(context, parent, evaluator);
            case 3:
                return createBr2(context, parent, evaluator);
            case 4:
                return createLabel1(context, parent, evaluator);
            case 5:
                return createBr3(context, parent, evaluator);
            case 6:
                return createLabel2(context, parent, evaluator);
            case 7:
                return createBr4(context, parent, evaluator);
            case 9:
                return createSearchbox(context, parent, evaluator);
            case 8:
                return createTypeAhead(context, parent, evaluator);
            case 10:
                return createText(context, parent, evaluator);
            case 12:
                return createButton2(context, parent, evaluator);
            case 11:
                return createEventHandler2(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        protected void initIncluderAsRoot(FacesContext context,
                PageExpressionEvaluator evaluator, UIComponent root) {
            StyleSheetResource resources = new StyleSheetResource();
            resources.setComponent(root);
            resources.setHref("/styles.css");
            FacesPageProvider asPageProvider = root instanceof FacesPageProvider ?
                    (FacesPageProvider) root : null;
            if( null != asPageProvider ){
                asPageProvider.addResource(resources);
            }
        }

        private UIComponent createView(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIViewRootEx2 result = new UIViewRootEx2();
            initViewRoot(result);
            StyleSheetResource resources = new StyleSheetResource();
            resources.setComponent(result);
            resources.setHref("/styles.css");
            result.addResource(resources);
            return result;
        }

        private UIComponent createButton1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[0]);
            result.setStyleClass("profilesButtonCommand");
            setId(result, "button1");
            return result;
        }

        private UIComponent createEventHandler(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            OpenPageAction action = new OpenPageAction();
            action.setComponent(result);
            action.setTarget("newDocument");
            action.setName("/profile.xsp");
            action.setSourceReferenceId("button1/xp:eventHandler[1]/xp:this.action[1]/xp:openPage[1]");
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createBr(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createBr2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createLabel1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[1]);
            result.setStyle("font-weight:bold;font-size:11pt");
            setId(result, "label1");
            return result;
        }

        private UIComponent createBr3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createLabel2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[2]);
            setId(result, "label2");
            return result;
        }

        private UIComponent createBr4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createSearchbox(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            LengthValidatorEx validators = new LengthValidatorEx();
            validators.setComponent(result);
            validators.setMaximum(40);
            validators.setMessage(_currentLocale[3]);
            validators.setMinimum(3);
            result.addValidator(validators);
            String sourceId = "searchBox/@value";
            String valueExpr = "#{requestScope.nameToSearch}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setStyle("width:250.0px");
            setId(result, "searchBox");
            return result;
        }

        private UIComponent createTypeAhead(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTypeAhead result = new XspTypeAhead();
            result.setIgnoreCase(true);
            result.setMode("partial");
            result.setMinChars(1);
            String sourceId = "searchBox/xp:typeAhead[1]/xp:this.valueList[1]/text()";
            String valueListExpr = "#{javascript:@DbColumn(@DbName(), \"profiles\", 0) }";
            ValueBinding valueList = evaluator.createValueBinding(result, valueListExpr, sourceId,Object.class);
            result.setValueBinding("valueList", valueList);
            return result;
        }

        private UIComponent createText(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(_currentLocale[4]);
            return textComp;
        }

        private UIComponent createButton2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[5]);
            result.setStyleClass("profilesButtonCommand");
            setId(result, "button2");
            return result;
        }

        private UIComponent createEventHandler2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            ActionGroup action = new ActionGroup();
            action.setComponent(result);
            ExecuteScriptAction actions = new ExecuteScriptAction();
            actions.setComponent(result);
            String sourceId = "button2/xp:eventHandler[1]/xp:this.action[1]/xp:actionGroup[1]/xp:executeScript[1]/@script";
            MethodBinding script = evaluator.createMethodBinding(result,
                    "#{javascript:sessionScope.nameToSearch = requestScope.nameToSearch}",
                    null,null, sourceId);
            actions.setScript(script);
            actions.setSourceReferenceId("button2/xp:eventHandler[1]/xp:this.action[1]/xp:actionGroup[1]/xp:executeScript[1]");
            action.addAction(actions);
            OpenPageAction actions2 = new OpenPageAction();
            actions2.setComponent(result);
            actions2.setName("/results.xsp");
            actions2.setSourceReferenceId("button2/xp:eventHandler[1]/xp:this.action[1]/xp:actionGroup[1]/xp:openPage[1]");
            action.addAction(actions2);
            action.setSourceReferenceId("button2/xp:eventHandler[1]/xp:this.action[1]/xp:actionGroup[1]");
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("complete");
            return result;
        }

        public void init(PageParam param) {
            super.init(param);
            _currentLocale = s_localeStrs[param.getLocalizedStringsIndex()];
        }

    }
}
