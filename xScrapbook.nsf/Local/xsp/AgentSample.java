/*
 * Generated file. 
 * 
 * AgentSample.java
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
import javax.faces.el.MethodBinding;
import com.ibm.xsp.component.FacesPageProvider;
import com.ibm.xsp.model.domino.DominoDocumentData;
import com.ibm.xsp.component.FacesDataProvider;
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.xp.XspTable;
import com.ibm.xsp.component.xp.XspTableRow;
import com.ibm.xsp.component.xp.XspTableCell;
import com.ibm.xsp.component.xp.XspOutputLabel;
import com.ibm.xsp.component.xp.XspInputText;
import javax.faces.el.ValueBinding;
import com.ibm.xsp.component.xp.XspCommandButton;
import com.ibm.xsp.component.xp.XspEventHandler;
import com.ibm.xsp.actions.SaveAction;
import com.ibm.xsp.component.xp.XspLineBreak;
import com.ibm.xsp.component.xp.XspViewPanel;
import com.ibm.xsp.model.domino.DominoViewData;
import com.ibm.xsp.component.xp.XspViewColumn;
import com.ibm.xsp.component.xp.XspViewColumnHeader;
import com.ibm.xsp.component.xp.XspPager;
import com.ibm.xsp.page.compiled.PageParam;

@SuppressWarnings("all")
public class AgentSample extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public AgentSample() {
        super("3.0");
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new AgentSamplePage();
    }
    
    public static class AgentSamplePage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 "color_label1"
            new ComponentInfo(false, new int[]{0}), // 1 td
            ComponentInfo.EMPTY_NORMAL, // 2 "color1"
            new ComponentInfo(false, new int[]{2}), // 3 td2
            new ComponentInfo(false, new int[]{1, 3}), // 4 tr
            ComponentInfo.EMPTY_NORMAL, // 5 "shape_label1"
            new ComponentInfo(false, new int[]{5}), // 6 td3
            ComponentInfo.EMPTY_NORMAL, // 7 "shape1"
            new ComponentInfo(false, new int[]{7}), // 8 td4
            new ComponentInfo(false, new int[]{6, 8}), // 9 tr2
            new ComponentInfo(false, new int[]{4, 9}), // 10 table
            ComponentInfo.EMPTY_NORMAL, // 11 eventHandler
            new ComponentInfo(false, new int[]{11}), // 12 "button1"
            ComponentInfo.EMPTY_NORMAL, // 13 br
            ComponentInfo.EMPTY_NORMAL, // 14 br2
            ComponentInfo.EMPTY_NORMAL, // 15 "viewcolumnheader1"
            new ComponentInfo(false, new int[]{15}), // 16 "viewcolumn1"
            ComponentInfo.EMPTY_NORMAL, // 17 "viewcolumnheader2"
            new ComponentInfo(false, new int[]{17}), // 18 "viewcolumn2"
            ComponentInfo.EMPTY_NORMAL, // 19 "viewcolumnheader3"
            new ComponentInfo(false, null, // 20 "viewcolumn3"
              new Object[][]{
                new Object[]{"header", Integer.valueOf(19)},
              } ),
            ComponentInfo.EMPTY_NORMAL, // 21 "pager1"
            new ComponentInfo(false, new int[]{16, 18, 20}, // 22 "viewpanel1"
              new Object[][]{
                new Object[]{"headerPager", Integer.valueOf(21)},
              } ),
            new ComponentInfo(false, new int[]{10, 12, 13, 14, 22}), // 23 view
        };
        private static final String[][] s_localeStrs = new String[][]{
            new String[]{ // ""
                "Color:", // 0 Color_Label1/@value
                "Shape:", // 1 Shape_Label1/@value
                "Save this", // 2 button1/@value
                "Color", // 3 viewColumnHeader1/@value
                "Shape", // 4 viewColumnHeader2/@value
                "Statement", // 5 viewColumnHeader3/@value
            },
            new String[]{ // de
                "[de| Color: ]", // 0 Color_Label1/@value
                "[de| Shape: ]", // 1 Shape_Label1/@value
                "[de| Save this ]", // 2 button1/@value
                "[de| Color ]", // 3 viewColumnHeader1/@value
                "[de| Shape ]", // 4 viewColumnHeader2/@value
                "[de| Statement ]", // 5 viewColumnHeader3/@value
            },
            new String[]{ // pl
                "[pl| Color: ]", // 0 Color_Label1/@value
                "[pl| Shape: ]", // 1 Shape_Label1/@value
                "[pl| Save this ]", // 2 button1/@value
                "[pl| Color ]", // 3 viewColumnHeader1/@value
                "[pl| Shape ]", // 4 viewColumnHeader2/@value
                "[pl| Statement ]", // 5 viewColumnHeader3/@value
            },
            new String[]{ // zh_CN
                "[zh_CN| Color: ]", // 0 Color_Label1/@value
                "[zh_CN| Shape: ]", // 1 Shape_Label1/@value
                "[zh_CN| Save this ]", // 2 button1/@value
                "[zh_CN| Color ]", // 3 viewColumnHeader1/@value
                "[zh_CN| Shape ]", // 4 viewColumnHeader2/@value
                "[zh_CN| Statement ]", // 5 viewColumnHeader3/@value
            },
        };
        private String[] _currentLocale;
        
        public AgentSamplePage() {
            super(23, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "color_label1".equals(id) )
                return 0;
            if( "color1".equals(id) )
                return 2;
            if( "shape_label1".equals(id) )
                return 5;
            if( "shape1".equals(id) )
                return 7;
            if( "button1".equals(id) )
                return 12;
            if( "viewpanel1".equals(id) )
                return 22;
            if( "viewcolumn1".equals(id) )
                return 16;
            if( "viewcolumnheader1".equals(id) )
                return 15;
            if( "viewcolumn2".equals(id) )
                return 18;
            if( "viewcolumnheader2".equals(id) )
                return 17;
            if( "viewcolumn3".equals(id) )
                return 20;
            if( "viewcolumnheader3".equals(id) )
                return 19;
            if( "pager1".equals(id) )
                return 21;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 23:
                return createView(context, parent, evaluator);
            case 10:
                return createTable(context, parent, evaluator);
            case 4:
                return createTr(context, parent, evaluator);
            case 1:
                return createTd(context, parent, evaluator);
            case 0:
                return createColor_005f_label1(context, parent, evaluator);
            case 3:
                return createTd2(context, parent, evaluator);
            case 2:
                return createColor1(context, parent, evaluator);
            case 9:
                return createTr2(context, parent, evaluator);
            case 6:
                return createTd3(context, parent, evaluator);
            case 5:
                return createShape_005f_label1(context, parent, evaluator);
            case 8:
                return createTd4(context, parent, evaluator);
            case 7:
                return createShape1(context, parent, evaluator);
            case 12:
                return createButton1(context, parent, evaluator);
            case 11:
                return createEventHandler(context, parent, evaluator);
            case 13:
                return createBr(context, parent, evaluator);
            case 14:
                return createBr2(context, parent, evaluator);
            case 22:
                return createViewpanel1(context, parent, evaluator);
            case 16:
                return createViewcolumn1(context, parent, evaluator);
            case 15:
                return createViewcolumnheader1(context, parent, evaluator);
            case 18:
                return createViewcolumn2(context, parent, evaluator);
            case 17:
                return createViewcolumnheader2(context, parent, evaluator);
            case 20:
                return createViewcolumn3(context, parent, evaluator);
            case 19:
                return createViewcolumnheader3(context, parent, evaluator);
            case 21:
                return createPager1(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        protected void initIncluderAsRoot(FacesContext context,
                PageExpressionEvaluator evaluator, UIComponent root) {
            String sourceId = "/xp:view[1]/xp:this.beforePageLoad[1]/text()";
            MethodBinding beforePageLoad = evaluator.createMethodBinding(root,
                    "#{javascript:ag = database.getAgent(\"agFromXpage\");\nnoteid = document1.getDocument().getNoteID();\nag.run(noteid)}",
                    null,null, sourceId);
            FacesPageProvider asPageProvider = root instanceof FacesPageProvider ?
                    (FacesPageProvider) root : null;
            if( null != asPageProvider ){
                asPageProvider.setBeforePageLoad(beforePageLoad);
            }
            DominoDocumentData data = new DominoDocumentData();
            data.setComponent(root);
            data.setComputeWithForm("both");
            data.setVar("document1");
            String sourceId2 = "/xp:view[1]/xp:this.data[1]/xp:dominoDocument[1]/xp:this.postSaveDocument[1]/text()";
            MethodBinding postSaveDocument = evaluator.createMethodBinding(root,
                    "#{javascript:ag = database.getAgent(\"agFromXpage\");\nnoteid = document1.getDocument().getNoteID();\nag.run(noteid)}",
                    null,null, sourceId2);
            data.setPostSaveDocument(postSaveDocument);
            data.setFormName("agentDemo");
            FacesDataProvider asDataProvider = root instanceof FacesDataProvider ?
                    (FacesDataProvider) root : null;
            if( null != asDataProvider ){
                asDataProvider.addData(data);
            }
        }

        private UIComponent createView(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIViewRootEx2 result = new UIViewRootEx2();
            initViewRoot(result);
            String sourceId = "/xp:view[1]/xp:this.beforePageLoad[1]/text()";
            MethodBinding beforePageLoad = evaluator.createMethodBinding(result,
                    "#{javascript:ag = database.getAgent(\"agFromXpage\");\nnoteid = document1.getDocument().getNoteID();\nag.run(noteid)}",
                    null,null, sourceId);
            result.setBeforePageLoad(beforePageLoad);
            DominoDocumentData data = new DominoDocumentData();
            data.setComponent(result);
            data.setComputeWithForm("both");
            data.setVar("document1");
            String sourceId2 = "/xp:view[1]/xp:this.data[1]/xp:dominoDocument[1]/xp:this.postSaveDocument[1]/text()";
            MethodBinding postSaveDocument = evaluator.createMethodBinding(result,
                    "#{javascript:ag = database.getAgent(\"agFromXpage\");\nnoteid = document1.getDocument().getNoteID();\nag.run(noteid)}",
                    null,null, sourceId2);
            data.setPostSaveDocument(postSaveDocument);
            data.setFormName("agentDemo");
            result.addData(data);
            return result;
        }

        private UIComponent createTable(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTable result = new XspTable();
            return result;
        }

        private UIComponent createTr(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createColor_005f_label1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[0]);
            result.setFor("Color1");
            setId(result, "Color_Label1");
            return result;
        }

        private UIComponent createTd2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createColor1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            String sourceId = "Color1/@value";
            String valueExpr = "#{document1.Color}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "Color1");
            return result;
        }

        private UIComponent createTr2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createShape_005f_label1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[1]);
            result.setFor("Shape1");
            setId(result, "Shape_Label1");
            return result;
        }

        private UIComponent createTd4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createShape1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            String sourceId = "Shape1/@value";
            String valueExpr = "#{document1.Shape}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "Shape1");
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
            result.setImmediate(false);
            SaveAction action = new SaveAction();
            action.setComponent(result);
            action.setName("/agentSample.xsp");
            action.setSourceReferenceId("button1/xp:eventHandler[1]/xp:this.action[1]/xp:save[1]");
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setSave(false);
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

        private UIComponent createViewpanel1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewPanel result = new XspViewPanel();
            result.setRows(30);
            DominoViewData data = new DominoViewData();
            data.setComponent(result);
            data.setViewName("agentDemos");
            data.setVar("agentDemos");
            result.setData(data);
            setId(result, "viewPanel1");
            result.setViewStyle("width:100%");
            return result;
        }

        private UIComponent createViewcolumn1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumn result = new XspViewColumn();
            result.setColumnName("Color");
            result.setOpenDocAsReadonly(true);
            result.setDisplayAs("link");
            setId(result, "viewColumn1");
            return result;
        }

        private UIComponent createViewcolumnheader1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumnHeader result = new XspViewColumnHeader();
            result.setValue(_currentLocale[3]);
            setId(result, "viewColumnHeader1");
            return result;
        }

        private UIComponent createViewcolumn2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumn result = new XspViewColumn();
            result.setColumnName("Shape");
            setId(result, "viewColumn2");
            return result;
        }

        private UIComponent createViewcolumnheader2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumnHeader result = new XspViewColumnHeader();
            result.setValue(_currentLocale[4]);
            setId(result, "viewColumnHeader2");
            return result;
        }

        private UIComponent createViewcolumn3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumn result = new XspViewColumn();
            result.setColumnName("Statement");
            setId(result, "viewColumn3");
            return result;
        }

        private UIComponent createViewcolumnheader3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspViewColumnHeader result = new XspViewColumnHeader();
            result.setValue(_currentLocale[5]);
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
