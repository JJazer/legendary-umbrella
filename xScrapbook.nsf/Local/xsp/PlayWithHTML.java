/*
 * Generated file. 
 * 
 * PlayWithHTML.java
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
import com.ibm.xsp.component.UIPassThroughTag;
import com.ibm.xsp.component.UIPassThroughText;
import com.ibm.xsp.component.xp.XspOutputText;
import java.lang.Object;
import javax.faces.el.ValueBinding;
import com.ibm.xsp.component.xp.XspLineBreak;
import com.ibm.xsp.component.xp.XspOutputLabel;
import com.ibm.xsp.page.compiled.PageParam;

@SuppressWarnings("all")
public class PlayWithHTML extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public PlayWithHTML() {
        super("3.0");
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new PlayWithHTMLPage();
    }
    
    public static class PlayWithHTMLPage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_MARKUP, // 0 text
            new ComponentInfo(true, new int[]{0}), // 1 script
            ComponentInfo.EMPTY_NORMAL, // 2 "computedfield1"
            ComponentInfo.EMPTY_MARKUP, // 3 text2
            new ComponentInfo(true, new int[]{3}), // 4 h1
            ComponentInfo.EMPTY_MARKUP, // 5 text3
            ComponentInfo.EMPTY_NORMAL, // 6 br
            ComponentInfo.EMPTY_NORMAL, // 7 "urlescaped"
            ComponentInfo.EMPTY_NORMAL, // 8 br2
            ComponentInfo.EMPTY_NORMAL, // 9 "urlnonescaped"
            ComponentInfo.EMPTY_NORMAL, // 10 br3
            ComponentInfo.EMPTY_NORMAL, // 11 br4
            ComponentInfo.EMPTY_NORMAL, // 12 br5
            ComponentInfo.EMPTY_NORMAL, // 13 br6
            ComponentInfo.EMPTY_NORMAL, // 14 "fancylabel"
            ComponentInfo.EMPTY_NORMAL, // 15 br7
            new ComponentInfo(false, new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}), // 16 view
        };
        private static final String[][] s_localeStrs = new String[][]{
            new String[]{ // ""
                "XSP.addOnLoad(function () {\n\tinitLocal(); } );", // 0 /xp:view[1]/script[1]/text()
                "This is a HTML headline", // 1 /xp:view[1]/h1[1]/text()
                "amazing isn\'t it ?", // 2 /xp:view[1]/text()[4]
                "Label", // 3 FancyLabel/@value
            },
            new String[]{ // de
                "[de| XSP.addOnLoad(function () {\n\tinitLocal(); } ); ]", // 0 /xp:view[1]/script[1]/text()
                "[de| This is a HTML headline ]", // 1 /xp:view[1]/h1[1]/text()
                "[de| amazing isn\'t it ? ]", // 2 /xp:view[1]/text()[4]
                "[de| Label ]", // 3 FancyLabel/@value
            },
            new String[]{ // pl
                "[pl| XSP.addOnLoad(function () {\n\tinitLocal(); } ); ]", // 0 /xp:view[1]/script[1]/text()
                "[pl| This is a HTML headline ]", // 1 /xp:view[1]/h1[1]/text()
                "[pl| amazing isn\'t it ? ]", // 2 /xp:view[1]/text()[4]
                "[pl| Label ]", // 3 FancyLabel/@value
            },
            new String[]{ // zh_CN
                "[zh_CN| XSP.addOnLoad(function () {\n\tinitLocal(); } ); ]", // 0 /xp:view[1]/script[1]/text()
                "[zh_CN| This is a HTML headline ]", // 1 /xp:view[1]/h1[1]/text()
                "[zh_CN| amazing isn\'t it ? ]", // 2 /xp:view[1]/text()[4]
                "[zh_CN| Label ]", // 3 FancyLabel/@value
            },
        };
        private String[] _currentLocale;
        
        public PlayWithHTMLPage() {
            super(16, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "computedfield1".equals(id) )
                return 2;
            if( "urlescaped".equals(id) )
                return 7;
            if( "urlnonescaped".equals(id) )
                return 9;
            if( "fancylabel".equals(id) )
                return 14;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 16:
                return createView(context, parent, evaluator);
            case 1:
                return createScript(context, parent, evaluator);
            case 0:
                return createText(context, parent, evaluator);
            case 2:
                return createComputedfield1(context, parent, evaluator);
            case 4:
                return createH1(context, parent, evaluator);
            case 3:
                return createText2(context, parent, evaluator);
            case 5:
                return createText3(context, parent, evaluator);
            case 6:
                return createBr(context, parent, evaluator);
            case 7:
                return createUrlescaped(context, parent, evaluator);
            case 8:
                return createBr2(context, parent, evaluator);
            case 9:
                return createUrlnonescaped(context, parent, evaluator);
            case 10:
                return createBr3(context, parent, evaluator);
            case 11:
                return createBr4(context, parent, evaluator);
            case 12:
                return createBr5(context, parent, evaluator);
            case 13:
                return createBr6(context, parent, evaluator);
            case 14:
                return createFancylabel(context, parent, evaluator);
            case 15:
                return createBr7(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        private UIComponent createView(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIViewRootEx2 result = new UIViewRootEx2();
            initViewRoot(result);
            return result;
        }

        private UIComponent createScript(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("script");
            component.addAttribute("language", "Javascript");
            return component;
        }

        private UIComponent createText(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(_currentLocale[0]);
            return textComp;
        }

        private UIComponent createComputedfield1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "computedField1/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:var out = \'<script type=\"text/javascript\">\\n\';\n\tout += \'function initLocal() {\\n\';\n\tout += \'var flName = \"\'+getClientId(\"FancyLabel\")+\'\";\\n\';\n\tout += \'alert(\"anytime you are ready to mess with \" + flName);\\n\';\n\tout += \'var fl = dojo.byId(flName);\\n\';\n\tout += \'fl.innerHTML = \"Hello World\";\\n\';\n\tout += \'}\\n</script>\\n\';\n\tout}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(false);
            setId(result, "computedField1");
            return result;
        }

        private UIComponent createH1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughTag component = new UIPassThroughTag();
            component.setTag("h1");
            return component;
        }

        private UIComponent createText2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(_currentLocale[1]);
            return textComp;
        }

        private UIComponent createText3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(_currentLocale[2]);
            return textComp;
        }

        private UIComponent createBr(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createUrlescaped(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            result.setValue("<a href=\"http://www.ibm.com\">IBM</a>");
            result.setEscape(true);
            setId(result, "URLEscaped");
            return result;
        }

        private UIComponent createBr2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createUrlnonescaped(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            result.setValue("<a href=\"http://www.ibm.com\">IBM</a>");
            result.setEscape(false);
            setId(result, "URLNonEscaped");
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

        private UIComponent createBr5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createBr6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createFancylabel(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[3]);
            setId(result, "FancyLabel");
            return result;
        }

        private UIComponent createBr7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        public void init(PageParam param) {
            super.init(param);
            _currentLocale = s_localeStrs[param.getLocalizedStringsIndex()];
        }

    }
}
