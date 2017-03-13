/*
 * Generated file. 
 * 
 * Container.java
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
import com.ibm.xsp.component.UIPanelEx;
import com.ibm.xsp.component.xp.XspOutputLabel;
import com.ibm.xsp.component.xp.XspTabbedPanel;
import javax.faces.el.ValueBinding;
import com.ibm.xsp.component.xp.XspTabPanel;
import com.ibm.xsp.component.xp.XspEventHandler;
import com.ibm.xsp.actions.ActionGroup;
import com.ibm.xsp.actions.OpenPageAction;
import com.ibm.xsp.actions.ExecuteScriptAction;
import javax.faces.el.MethodBinding;
import com.ibm.xsp.component.xp.XspCallback;
import com.ibm.xsp.page.compiled.PageParam;

@SuppressWarnings("all")
public class Container extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public Container() {
        super("3.0");
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new ContainerPage();
    }
    
    protected boolean isCustomControl() {
        return true;
    }

    public static class ContainerPage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 "label1"
            new ComponentInfo(false, new int[]{0}), // 1 "headerinner"
            new ComponentInfo(false, new int[]{1}), // 2 "header"
            new ComponentInfo(false, new int[]{2}), // 3 "frame"
            ComponentInfo.EMPTY_NORMAL, // 4 eventHandler
            new ComponentInfo(false, new int[]{4}), // 5 "hometab"
            ComponentInfo.EMPTY_NORMAL, // 6 eventHandler2
            new ComponentInfo(false, new int[]{6}), // 7 "resultstab"
            ComponentInfo.EMPTY_NORMAL, // 8 eventHandler3
            new ComponentInfo(false, new int[]{8}), // 9 "profiletab"
            new ComponentInfo(false, new int[]{5, 7, 9}), // 10 "tabbedpanel1"
            new ComponentInfo(false, new int[]{10}), // 11 "tabbar"
            ComponentInfo.EMPTY_NORMAL, // 12 "callback1"
            new ComponentInfo(false, new int[]{12}), // 13 "content"
            new ComponentInfo(false, new int[]{11, 13}), // 14 "main"
            new ComponentInfo(false, new int[]{3, 14}), // 15 view
        };
        private static final String[][] s_localeStrs = new String[][]{
            new String[]{ // ""
                "Label of Scrapbook", // 0 label1/@value
                "Home", // 1 homeTab/@label
                "Results", // 2 resultsTab/@label
                "Profile", // 3 profileTab/@label
            },
            new String[]{ // de
                "[de| Label of Scrapbook ]", // 0 label1/@value
                "[de| Home ]", // 1 homeTab/@label
                "[de| Results ]", // 2 resultsTab/@label
                "[de| Profile ]", // 3 profileTab/@label
            },
            new String[]{ // pl
                "[pl| Label of Scrapbook ]", // 0 label1/@value
                "[pl| Home ]", // 1 homeTab/@label
                "[pl| Results ]", // 2 resultsTab/@label
                "[pl| Profile ]", // 3 profileTab/@label
            },
            new String[]{ // zh_CN
                "[zh_CN| Label of Scrapbook ]", // 0 label1/@value
                "[zh_CN| Home ]", // 1 homeTab/@label
                "[zh_CN| Results ]", // 2 resultsTab/@label
                "[zh_CN| Profile ]", // 3 profileTab/@label
            },
        };
        private String[] _currentLocale;
        
        public ContainerPage() {
            super(15, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "frame".equals(id) )
                return 3;
            if( "header".equals(id) )
                return 2;
            if( "headerinner".equals(id) )
                return 1;
            if( "label1".equals(id) )
                return 0;
            if( "main".equals(id) )
                return 14;
            if( "tabbar".equals(id) )
                return 11;
            if( "tabbedpanel1".equals(id) )
                return 10;
            if( "hometab".equals(id) )
                return 5;
            if( "resultstab".equals(id) )
                return 7;
            if( "profiletab".equals(id) )
                return 9;
            if( "content".equals(id) )
                return 13;
            if( "callback1".equals(id) )
                return 12;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 15:
                return createView(context, parent, evaluator);
            case 3:
                return createFrame(context, parent, evaluator);
            case 2:
                return createHeader(context, parent, evaluator);
            case 1:
                return createHeaderinner(context, parent, evaluator);
            case 0:
                return createLabel1(context, parent, evaluator);
            case 14:
                return createMain(context, parent, evaluator);
            case 11:
                return createTabbar(context, parent, evaluator);
            case 10:
                return createTabbedpanel1(context, parent, evaluator);
            case 5:
                return createHometab(context, parent, evaluator);
            case 4:
                return createEventHandler(context, parent, evaluator);
            case 7:
                return createResultstab(context, parent, evaluator);
            case 6:
                return createEventHandler2(context, parent, evaluator);
            case 9:
                return createProfiletab(context, parent, evaluator);
            case 8:
                return createEventHandler3(context, parent, evaluator);
            case 13:
                return createContent(context, parent, evaluator);
            case 12:
                return createCallback1(context, parent, evaluator);
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

        private UIComponent createFrame(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPanelEx result = new UIPanelEx();
            result.setStyleClass("frame");
            setId(result, "Frame");
            return result;
        }

        private UIComponent createHeader(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPanelEx result = new UIPanelEx();
            result.setStyleClass("header");
            setId(result, "header");
            return result;
        }

        private UIComponent createHeaderinner(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPanelEx result = new UIPanelEx();
            result.setStyleClass("headerInner");
            setId(result, "headerInner");
            return result;
        }

        private UIComponent createLabel1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[0]);
            result.setStyleClass("headerInnerTitle");
            setId(result, "label1");
            return result;
        }

        private UIComponent createMain(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPanelEx result = new UIPanelEx();
            result.setStyleClass("main");
            setId(result, "main");
            return result;
        }

        private UIComponent createTabbar(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPanelEx result = new UIPanelEx();
            result.setStyleClass("tabBar");
            setId(result, "tabBar");
            return result;
        }

        private UIComponent createTabbedpanel1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTabbedPanel result = new XspTabbedPanel();
            String sourceId = "tabbedPanel1/@selectedTab";
            String selectedTabExpr = "#{javascript:compositeData.selectedTabId}";
            ValueBinding selectedTab = evaluator.createValueBinding(result, selectedTabExpr, sourceId,String.class);
            result.setValueBinding("selectedTab", selectedTab);
            setId(result, "tabbedPanel1");
            return result;
        }

        private UIComponent createHometab(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTabPanel result = new XspTabPanel();
            result.setLabel(_currentLocale[1]);
            setId(result, "homeTab");
            return result;
        }

        private UIComponent createEventHandler(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            ActionGroup action = new ActionGroup();
            action.setComponent(result);
            OpenPageAction actions = new OpenPageAction();
            actions.setComponent(result);
            actions.setName("/home.xsp");
            actions.setSourceReferenceId("homeTab/xp:eventHandler[1]/xp:this.action[1]/xp:actionGroup[1]/xp:openPage[1]");
            action.addAction(actions);
            action.setSourceReferenceId("homeTab/xp:eventHandler[1]/xp:this.action[1]/xp:actionGroup[1]");
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createResultstab(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTabPanel result = new XspTabPanel();
            result.setLabel(_currentLocale[2]);
            setId(result, "resultsTab");
            return result;
        }

        private UIComponent createEventHandler2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            ActionGroup action = new ActionGroup();
            action.setComponent(result);
            ExecuteScriptAction actions = new ExecuteScriptAction();
            actions.setComponent(result);
            String sourceId = "resultsTab/xp:eventHandler[1]/xp:this.action[1]/xp:actionGroup[1]/xp:executeScript[1]/@script";
            MethodBinding script = evaluator.createMethodBinding(result,
                    "#{javascript:sessionScope.nameToSearch = null}",
                    null,null, sourceId);
            actions.setScript(script);
            actions.setSourceReferenceId("resultsTab/xp:eventHandler[1]/xp:this.action[1]/xp:actionGroup[1]/xp:executeScript[1]");
            action.addAction(actions);
            OpenPageAction actions2 = new OpenPageAction();
            actions2.setComponent(result);
            actions2.setName("/results.xsp");
            actions2.setSourceReferenceId("resultsTab/xp:eventHandler[1]/xp:this.action[1]/xp:actionGroup[1]/xp:openPage[1]");
            action.addAction(actions2);
            action.setSourceReferenceId("resultsTab/xp:eventHandler[1]/xp:this.action[1]/xp:actionGroup[1]");
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createProfiletab(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTabPanel result = new XspTabPanel();
            result.setLabel(_currentLocale[3]);
            setId(result, "profileTab");
            return result;
        }

        private UIComponent createEventHandler3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            ActionGroup action = new ActionGroup();
            action.setComponent(result);
            OpenPageAction actions = new OpenPageAction();
            actions.setComponent(result);
            actions.setName("/profile.xsp");
            actions.setSourceReferenceId("profileTab/xp:eventHandler[1]/xp:this.action[1]/xp:actionGroup[1]/xp:openPage[1]");
            action.addAction(actions);
            action.setSourceReferenceId("profileTab/xp:eventHandler[1]/xp:this.action[1]/xp:actionGroup[1]");
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createContent(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPanelEx result = new UIPanelEx();
            result.setStyleClass("content");
            setId(result, "content");
            return result;
        }

        private UIComponent createCallback1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCallback result = new XspCallback();
            result.setFacetName("facet_1");
            setId(result, "callback1");
            return result;
        }

        public void init(PageParam param) {
            super.init(param);
            _currentLocale = s_localeStrs[param.getLocalizedStringsIndex()];
        }

    }
}
