/*
 * Generated file. 
 * 
 * Page.java
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
import com.ibm.xsp.component.xp.XspCommandButton;
import com.ibm.xsp.component.xp.XspEventHandler;
import javax.faces.el.MethodBinding;
import com.ibm.xsp.component.xp.XspLineBreak;
import com.ibm.xsp.page.compiled.PageParam;

@SuppressWarnings("all")
public class Page extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public Page() {
        super("8.5.1"); // version of xp:eventHandler script
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new PagePage();
    }
    
    public static class PagePage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 eventHandler
            new ComponentInfo(false, new int[]{0}), // 1 "button1"
            ComponentInfo.EMPTY_NORMAL, // 2 br
            ComponentInfo.EMPTY_NORMAL, // 3 eventHandler2
            new ComponentInfo(false, new int[]{3}), // 4 "button2"
            ComponentInfo.EMPTY_NORMAL, // 5 br2
            ComponentInfo.EMPTY_NORMAL, // 6 eventHandler3
            new ComponentInfo(false, new int[]{6}), // 7 "button3"
            new ComponentInfo(false, new int[]{1, 2, 4, 5, 7}), // 8 view
        };
        private static final String[][] s_localeStrs = new String[][]{
            new String[]{ // ""
                "Test1", // 0 button1/@value
                "Test2", // 1 button2/@value
                "Test3", // 2 button3/@value
            },
            new String[]{ // de
                "[de| Test1 ]", // 0 button1/@value
                "[de| Test2 ]", // 1 button2/@value
                "[de| Test3 ]", // 2 button3/@value
            },
            new String[]{ // pl
                "[pl| Test1 ]", // 0 button1/@value
                "[pl| Test2 ]", // 1 button2/@value
                "[pl| Test3 ]", // 2 button3/@value
            },
            new String[]{ // zh_CN
                "[zh_CN| Test1 ]", // 0 button1/@value
                "[zh_CN| Test2 ]", // 1 button2/@value
                "[zh_CN| Test3 ]", // 2 button3/@value
            },
        };
        private String[] _currentLocale;
        
        public PagePage() {
            super(8, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "button1".equals(id) )
                return 1;
            if( "button2".equals(id) )
                return 4;
            if( "button3".equals(id) )
                return 7;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 8:
                return createView(context, parent, evaluator);
            case 1:
                return createButton1(context, parent, evaluator);
            case 0:
                return createEventHandler(context, parent, evaluator);
            case 2:
                return createBr(context, parent, evaluator);
            case 4:
                return createButton2(context, parent, evaluator);
            case 3:
                return createEventHandler2(context, parent, evaluator);
            case 5:
                return createBr2(context, parent, evaluator);
            case 7:
                return createButton3(context, parent, evaluator);
            case 6:
                return createEventHandler3(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        private UIComponent createView(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIViewRootEx2 result = new UIViewRootEx2();
            initViewRoot(result);
            return result;
        }

        private UIComponent createButton1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[0]);
            setId(result, "button1");
            return result;
        }

        private UIComponent createEventHandler(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "button1/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:sessionScope.myVariable = \"Test\" }",
                    null,null, sourceId);
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

        private UIComponent createButton2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[1]);
            setId(result, "button2");
            return result;
        }

        private UIComponent createEventHandler2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setSubmit(false);
            result.setEvent("onclick");
            String sourceId = "button2/xp:eventHandler[1]/xp:this.script[1]/text()";
            MethodBinding script = evaluator.createMethodBinding(result,
                    "tmp = \"#{javascript:@DbName()}\"; alert(tmp)",
                    null,null, sourceId);
            result.setScript(script);
            return result;
        }

        private UIComponent createBr2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createButton3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[2]);
            setId(result, "button3");
            return result;
        }

        private UIComponent createEventHandler3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setSubmit(false);
            result.setEvent("onclick");
            String sourceId = "button3/xp:eventHandler[1]/xp:this.script[1]/text()";
            MethodBinding script = evaluator.createMethodBinding(result,
                    "tmp = \"#{sessionScope.myVariable}\"; alert(tmp)",
                    null,null, sourceId);
            result.setScript(script);
            return result;
        }

        public void init(PageParam param) {
            super.init(param);
            _currentLocale = s_localeStrs[param.getLocalizedStringsIndex()];
        }

    }
}
