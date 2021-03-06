/*
 * Generated file. 
 * 
 * Profile.java
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
import com.ibm.xsp.component.UIIncludeComposite;
import com.ibm.xsp.binding.PropertyMap;

@SuppressWarnings("all")
public class Profile extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public Profile() {
        super("3.0");
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new ProfilePage();
    }
    
    public static class ProfilePage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 profileForm
            new ComponentInfo(false, null, // 1 container
              new Object[][]{
                new Object[]{"facet_1", Integer.valueOf(0)},
              } ),
            new ComponentInfo(false, new int[]{1}), // 2 view
        };
        
        public ProfilePage() {
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
                return createProfileForm(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        private UIComponent createView(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIViewRootEx2 result = new UIViewRootEx2();
            initViewRoot(result);
            return result;
        }

        private UIComponent createContainer(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String resultPage = "/container.xsp";
            UIIncludeComposite result = new UIIncludeComposite();
            result.setPageDriver(getPageParam().getPageDriver());
            result.setPageName(resultPage);
            PropertyMap propertyMap = result.getPropertyMap();
            propertyMap.setProperty("selectedTabId", "profileTab");
            return result;
        }

        private UIComponent createProfileForm(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String resultPage = "/profileForm.xsp";
            UIIncludeComposite result = new UIIncludeComposite();
            result.setPageDriver(getPageParam().getPageDriver());
            result.setPageName(resultPage);
            return result;
        }

    }
}
