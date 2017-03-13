/*
 * Generated file. 
 * 
 * Home.java
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
import java.util.Map;
import com.ibm.xsp.component.FacesPageProvider;
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.UIIncludeComposite;
import com.ibm.xsp.binding.PropertyMap;

@SuppressWarnings("all")
public class Home extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public Home() {
        super("8.5.2"); // version of xp:view pageManifest
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new HomePage();
    }
    
    public static class HomePage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 searchForm
            new ComponentInfo(false, null, // 1 container
              new Object[][]{
                new Object[]{"facet_1", Integer.valueOf(0)},
              } ),
            new ComponentInfo(false, new int[]{1}), // 2 view
        };
        
        public HomePage() {
            super(2, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 2:
                return createView(context, parent, evaluator);
            case 1:
                return createContainer(context, parent, evaluator);
            case 0:
                return createSearchForm(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        protected void initIncluderAsRoot(FacesContext context,
                PageExpressionEvaluator evaluator, UIComponent root) {
            Map<String,Object> attrs = getAttributes(root);
            attrs.put("pageIcon", "favicon.ico");
            FacesPageProvider asPageProvider = root instanceof FacesPageProvider ?
                    (FacesPageProvider) root : null;
            if( null != asPageProvider ){
                asPageProvider.setPageManifest("Profiles Home Page");
            }
        }

        private UIComponent createView(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIViewRootEx2 result = new UIViewRootEx2();
            initViewRoot(result);
            result.setPageIcon("favicon.ico");
            result.setPageManifest("Profiles Home Page");
            return result;
        }

        private UIComponent createContainer(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String resultPage = "/container.xsp";
            UIIncludeComposite result = new UIIncludeComposite();
            result.setPageDriver(getPageParam().getPageDriver());
            result.setPageName(resultPage);
            PropertyMap propertyMap = result.getPropertyMap();
            propertyMap.setProperty("selectedTabId", "homeTab");
            return result;
        }

        private UIComponent createSearchForm(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String resultPage = "/searchForm.xsp";
            UIIncludeComposite result = new UIIncludeComposite();
            result.setPageDriver(getPageParam().getPageDriver());
            result.setPageName(resultPage);
            return result;
        }

    }
}
