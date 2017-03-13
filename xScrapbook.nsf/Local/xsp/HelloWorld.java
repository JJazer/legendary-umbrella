/*
 * Generated file. 
 * 
 * HelloWorld.java
 */
package xsp;

import com.ibm.xsp.page.compiled.AbstractCompiledPage;
import com.ibm.xsp.page.compiled.AbstractCompiledPageDispatcher;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import com.ibm.xsp.page.compiled.NoSuchComponentException;
import com.ibm.xsp.page.compiled.PageExpressionEvaluator;
import java.lang.String;
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.xp.XspSpan;
import com.ibm.xsp.component.UIPassThroughText;
import com.ibm.xsp.component.xp.XspLineBreak;
import com.ibm.xsp.component.xp.XspInputText;
import com.ibm.xsp.component.xp.XspCommandButton;
import com.ibm.xsp.component.xp.XspEventHandler;
import javax.faces.el.MethodBinding;
import com.ibm.xsp.component.xp.XspOutputText;
import java.lang.Object;
import javax.faces.el.ValueBinding;
import com.ibm.xsp.page.compiled.PageParam;

@SuppressWarnings("all")
public class HelloWorld extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public HelloWorld() {
        super("3.0");
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new HelloWorldPage();
    }
    
    public static class HelloWorldPage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_MARKUP, // 0 text
            new ComponentInfo(false, new int[]{0}), // 1 span
            ComponentInfo.EMPTY_NORMAL, // 2 br
            ComponentInfo.EMPTY_NORMAL, // 3 br2
            ComponentInfo.EMPTY_MARKUP, // 4 text2
            ComponentInfo.EMPTY_NORMAL, // 5 "myname"
            ComponentInfo.EMPTY_NORMAL, // 6 eventHandler
            new ComponentInfo(false, new int[]{6}), // 7 "button1"
            ComponentInfo.EMPTY_NORMAL, // 8 br3
            ComponentInfo.EMPTY_NORMAL, // 9 br4
            ComponentInfo.EMPTY_NORMAL, // 10 "computedfield1"
            new ComponentInfo(false, new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10}), // 11 view
        };
        private static final String[][] s_localeStrs = new String[][]{
            new String[]{ // ""
                "HelloWorld Java", // 0 /xp:view[1]/xp:span[1]/text()
                "My Name : \u00a0", // 1 /xp:view[1]/text()[4]
                "Say it !", // 2 button1/@value
            },
            new String[]{ // de
                "[de| HelloWorld Java ]", // 0 /xp:view[1]/xp:span[1]/text()
                "[de| My Name : \u00a0 ]", // 1 /xp:view[1]/text()[4]
                "[de| Say it ! ]", // 2 button1/@value
            },
            new String[]{ // pl
                "[pl| HelloWorld Java ]", // 0 /xp:view[1]/xp:span[1]/text()
                "[pl| My Name : \u00a0 ]", // 1 /xp:view[1]/text()[4]
                "[pl| Say it ! ]", // 2 button1/@value
            },
            new String[]{ // zh_CN
                "[zh_CN| HelloWorld Java ]", // 0 /xp:view[1]/xp:span[1]/text()
                "[zh_CN| My Name : \u00a0 ]", // 1 /xp:view[1]/text()[4]
                "[zh_CN| Say it ! ]", // 2 button1/@value
            },
        };
        private String[] _currentLocale;
        
        public HelloWorldPage() {
            super(11, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "myname".equals(id) )
                return 5;
            if( "button1".equals(id) )
                return 7;
            if( "computedfield1".equals(id) )
                return 10;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 11:
                return createView(context, parent, evaluator);
            case 1:
                return createSpan(context, parent, evaluator);
            case 0:
                return createText(context, parent, evaluator);
            case 2:
                return createBr(context, parent, evaluator);
            case 3:
                return createBr2(context, parent, evaluator);
            case 4:
                return createText2(context, parent, evaluator);
            case 5:
                return createMyname(context, parent, evaluator);
            case 7:
                return createButton1(context, parent, evaluator);
            case 6:
                return createEventHandler(context, parent, evaluator);
            case 8:
                return createBr3(context, parent, evaluator);
            case 9:
                return createBr4(context, parent, evaluator);
            case 10:
                return createComputedfield1(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        private UIComponent createView(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIViewRootEx2 result = new UIViewRootEx2();
            initViewRoot(result);
            return result;
        }

        private UIComponent createSpan(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspSpan result = new XspSpan();
            result.setStyle("font-style:italic");
            return result;
        }

        private UIComponent createText(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(_currentLocale[0]);
            return textComp;
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

        private UIComponent createText2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(_currentLocale[1]);
            return textComp;
        }

        private UIComponent createMyname(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            setId(result, "myName");
            return result;
        }

        private UIComponent createButton1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[2]);
            setId(result, "button1");
            return result;
        }

        private UIComponent createEventHandler(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "button1/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:var greetMe = new javaSample.helloWorld;\nvar myName = getComponent(\"myName\").getValue();\nvar result = greetMe.sayHello(myName);\nrequestScope.ourGreeting = result;\n}",
                    null,null, sourceId);
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createBr3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createBr4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createComputedfield1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "computedField1/@value";
            String valueExpr = "#{requestScope.ourGreeting}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setStyle("font-weight:bold");
            result.setEscape(true);
            setId(result, "computedField1");
            return result;
        }

        public void init(PageParam param) {
            super.init(param);
            _currentLocale = s_localeStrs[param.getLocalizedStringsIndex()];
        }

    }
}
