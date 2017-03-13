/*
 * Generated file. 
 * 
 * SerchResults.java
 */
package xsp;

import com.ibm.xsp.page.compiled.AbstractCompiledPage;
import com.ibm.xsp.page.compiled.AbstractCompiledPageDispatcher;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import com.ibm.xsp.page.compiled.NoSuchComponentException;
import com.ibm.xsp.page.compiled.PageExpressionEvaluator;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import com.ibm.xsp.resource.StyleSheetResource;
import com.ibm.xsp.component.FacesPageProvider;
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.xp.XspOutputText;
import javax.faces.el.ValueBinding;
import com.ibm.xsp.component.xp.XspLineBreak;
import com.ibm.xsp.component.xp.XspViewPanel;
import com.ibm.xsp.model.domino.DominoViewData;
import com.ibm.xsp.component.xp.XspViewColumn;
import com.ibm.xsp.component.xp.XspViewColumnHeader;
import com.ibm.xsp.component.xp.XspPager;
import com.ibm.xsp.page.compiled.PageParam;

@SuppressWarnings("all")
public class SerchResults extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public SerchResults() {
        super("3.0");
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new SerchResultsPage();
    }
    
    protected boolean isCustomControl() {
        return true;
    }

    public static class SerchResultsPage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 "resultscomputeredfield"
            ComponentInfo.EMPTY_NORMAL, // 1 br
            ComponentInfo.EMPTY_NORMAL, // 2 br2
            ComponentInfo.EMPTY_NORMAL, // 3 br3
            ComponentInfo.EMPTY_NORMAL, // 4 "viewcolumnheader1"
            new ComponentInfo(false, new int[]{4}), // 5 "viewcolumn1"
            ComponentInfo.EMPTY_NORMAL, // 6 "viewcolumnheader2"
            new ComponentInfo(false, new int[]{6}), // 7 "viewcolumn2"
            ComponentInfo.EMPTY_NORMAL, // 8 "viewcolumnheader3"
            new ComponentInfo(false, new int[]{8}), // 9 "viewcolumn3"
            ComponentInfo.EMPTY_NORMAL, // 10 "pager1"
            new ComponentInfo(false, new int[]{5, 7, 9}, // 11 "viewpanel1"
              new Object[][]{
                new Object[]{"headerPager", Integer.valueOf(10)},
              } ),
            new ComponentInfo(false, new int[]{0, 1, 2, 3, 11}), // 12 view
        };
        private static final String[][] s_localeStrs = new String[][]{
            new String[]{ // ""
                "FullName", // 0 viewColumnHeader1/@value
                "TimeZone", // 1 viewColumnHeader2/@value
                "Email", // 2 viewColumnHeader3/@value
            },
            new String[]{ // de
                "[de| FullName ]", // 0 viewColumnHeader1/@value
                "[de| TimeZone ]", // 1 viewColumnHeader2/@value
                "[de| Email ]", // 2 viewColumnHeader3/@value
            },
            new String[]{ // pl
                "[pl| FullName ]", // 0 viewColumnHeader1/@value
                "[pl| TimeZone ]", // 1 viewColumnHeader2/@value
                "[pl| Email ]", // 2 viewColumnHeader3/@value
            },
            new String[]{ // zh_CN
                "[zh_CN| FullName ]", // 0 viewColumnHeader1/@value
                "[zh_CN| TimeZone ]", // 1 viewColumnHeader2/@value
                "[zh_CN| Email ]", // 2 viewColumnHeader3/@value
            },
        };
        private String[] _currentLocale;
        
        public SerchResultsPage() {
            super(12, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "resultscomputeredfield".equals(id) )
                return 0;
            if( "viewpanel1".equals(id) )
                return 11;
            if( "viewcolumn1".equals(id) )
                return 5;
            if( "viewcolumnheader1".equals(id) )
                return 4;
            if( "viewcolumn2".equals(id) )
                return 7;
            if( "viewcolumnheader2".equals(id) )
                return 6;
            if( "viewcolumn3".equals(id) )
                return 9;
            if( "viewcolumnheader3".equals(id) )
                return 8;
            if( "pager1".equals(id) )
                return 10;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 12:
                return createView(context, parent, evaluator);
            case 0:
                return createResultscomputeredfield(context, parent, evaluator);
            case 1:
                return createBr(context, parent, evaluator);
            case 2:
                return createBr2(context, parent, evaluator);
            case 3:
                return createBr3(context, parent, evaluator);
            case 11:
                return createViewpanel1(context, parent, evaluator);
            case 5:
                return createViewcolumn1(context, parent, evaluator);
            case 4:
                return createViewcolumnheader1(context, parent, evaluator);
            case 7:
                return createViewcolumn2(context, parent, evaluator);
            case 6:
                return createViewcolumnheader2(context, parent, evaluator);
            case 9:
                return createViewcolumn3(context, parent, evaluator);
            case 8:
                return createViewcolumnheader3(context, parent, evaluator);
            case 10:
                return createPager1(context, parent, evaluator);
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

        private UIComponent createResultscomputeredfield(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "resultsComputeredField/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:var criteria = sessionScope.nameToSearch;\nvar title = \"Profile search results for: \";\nif(null != criteria && criteria != \"\"){\n title += criteria;\n}\nelse{\n title = \"No search criteria provided.\";\n}\nreturn title; }";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            result.setStyleClass("searchInfo");
            setId(result, "resultsComputeredField");
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

        private UIComponent createBr3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createViewpanel1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewPanel result = new XspViewPanel();
            result.setRows(10);
            DominoViewData data = new DominoViewData();
            data.setComponent(result);
            data.setViewName("profiles");
            String sourceId = "viewPanel1/xp:this.data[1]/xp:dominoView[1]/@keys";
            String keysExpr = "#{javascript:sessionScope.nameToSearch}";
            ValueBinding keys = evaluator.createValueBinding(result, keysExpr, sourceId,Object.class);
            data.setValueBinding("keys", keys);
            data.setVar("profiles");
            result.setData(data);
            setId(result, "viewPanel1");
            result.setViewStyle("width:100.0%");
            return result;
        }

        private UIComponent createViewcolumn1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumn result = new XspViewColumn();
            result.setColumnName("FullName");
            result.setOpenDocAsReadonly(true);
            result.setDisplayAs("link");
            setId(result, "viewColumn1");
            return result;
        }

        private UIComponent createViewcolumnheader1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumnHeader result = new XspViewColumnHeader();
            result.setValue(_currentLocale[0]);
            result.setStyle("width:auto");
            result.setSortable(true);
            setId(result, "viewColumnHeader1");
            return result;
        }

        private UIComponent createViewcolumn2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumn result = new XspViewColumn();
            result.setColumnName("TimeZone");
            setId(result, "viewColumn2");
            return result;
        }

        private UIComponent createViewcolumnheader2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumnHeader result = new XspViewColumnHeader();
            result.setValue(_currentLocale[1]);
            result.setStyle("width:auto");
            setId(result, "viewColumnHeader2");
            return result;
        }

        private UIComponent createViewcolumn3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumn result = new XspViewColumn();
            result.setColumnName("Email");
            setId(result, "viewColumn3");
            return result;
        }

        private UIComponent createViewcolumnheader3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumnHeader result = new XspViewColumnHeader();
            result.setValue(_currentLocale[2]);
            result.setStyle("width:auto");
            setId(result, "viewColumnHeader3");
            return result;
        }

        private UIComponent createPager1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspPager result = new XspPager();
            result.setPartialRefresh(true);
            result.setLayout("Previous Group Next");
            setId(result, "pager1");
            return result;
        }

        public void init(PageParam param) {
            super.init(param);
            _currentLocale = s_localeStrs[param.getLocalizedStringsIndex()];
        }

    }
}
