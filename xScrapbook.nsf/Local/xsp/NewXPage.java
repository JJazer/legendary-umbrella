/*
 * Generated file. 
 * 
 * NewXPage.java
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
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.xp.XspViewPanel;
import com.ibm.xsp.model.domino.DominoViewData;
import com.ibm.xsp.component.xp.XspViewColumn;
import com.ibm.xsp.component.xp.XspViewColumnHeader;
import com.ibm.xsp.component.xp.XspPager;
import com.ibm.xsp.page.compiled.PageParam;

@SuppressWarnings("all")
public class NewXPage extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public NewXPage() {
        super("3.0");
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new NewXPagePage();
    }
    
    public static class NewXPagePage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 "viewcolumnheader1"
            new ComponentInfo(false, new int[]{0}), // 1 "viewcolumn1"
            ComponentInfo.EMPTY_NORMAL, // 2 "viewcolumnheader2"
            new ComponentInfo(false, new int[]{2}), // 3 "viewcolumn2"
            ComponentInfo.EMPTY_NORMAL, // 4 "viewcolumnheader3"
            new ComponentInfo(false, new int[]{4}), // 5 "viewcolumn3"
            ComponentInfo.EMPTY_NORMAL, // 6 "pager1"
            new ComponentInfo(false, new int[]{1, 3, 5}, // 7 "viewpanelprofiles"
              new Object[][]{
                new Object[]{"headerPager", Integer.valueOf(6)},
              } ),
            new ComponentInfo(false, new int[]{7}), // 8 view
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
        
        public NewXPagePage() {
            super(8, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "viewpanelprofiles".equals(id) )
                return 7;
            if( "viewcolumn1".equals(id) )
                return 1;
            if( "viewcolumnheader1".equals(id) )
                return 0;
            if( "viewcolumn2".equals(id) )
                return 3;
            if( "viewcolumnheader2".equals(id) )
                return 2;
            if( "viewcolumn3".equals(id) )
                return 5;
            if( "viewcolumnheader3".equals(id) )
                return 4;
            if( "pager1".equals(id) )
                return 6;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 8:
                return createView(context, parent, evaluator);
            case 7:
                return createViewpanelprofiles(context, parent, evaluator);
            case 1:
                return createViewcolumn1(context, parent, evaluator);
            case 0:
                return createViewcolumnheader1(context, parent, evaluator);
            case 3:
                return createViewcolumn2(context, parent, evaluator);
            case 2:
                return createViewcolumnheader2(context, parent, evaluator);
            case 5:
                return createViewcolumn3(context, parent, evaluator);
            case 4:
                return createViewcolumnheader3(context, parent, evaluator);
            case 6:
                return createPager1(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        private UIComponent createView(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIViewRootEx2 result = new UIViewRootEx2();
            initViewRoot(result);
            return result;
        }

        private UIComponent createViewpanelprofiles(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewPanel result = new XspViewPanel();
            result.setRows(30);
            DominoViewData data = new DominoViewData();
            data.setComponent(result);
            data.setViewName("profiles");
            data.setVar("profiles");
            result.setData(data);
            setId(result, "viewPanelprofiles");
            result.setViewStyle("width:100%");
            return result;
        }

        private UIComponent createViewcolumn1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumn result = new XspViewColumn();
            result.setColumnName("FullName");
            setId(result, "viewColumn1");
            return result;
        }

        private UIComponent createViewcolumnheader1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumnHeader result = new XspViewColumnHeader();
            result.setValue(_currentLocale[0]);
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
            setId(result, "viewColumnHeader3");
            return result;
        }

        private UIComponent createPager1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspPager result = new XspPager();
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
