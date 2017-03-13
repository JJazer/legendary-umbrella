/*
 * Generated file. 
 * 
 * TwDemo.java
 */
package xsp;

import com.ibm.xsp.page.compiled.AbstractCompiledPage;
import com.ibm.xsp.page.compiled.AbstractCompiledPageDispatcher;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import com.ibm.xsp.page.compiled.NoSuchComponentException;
import com.ibm.xsp.page.compiled.PageExpressionEvaluator;
import java.lang.String;
import com.ibm.xsp.resource.ScriptResource;
import com.ibm.xsp.component.FacesPageProvider;
import com.ibm.xsp.model.domino.DominoDocumentData;
import com.ibm.xsp.component.FacesDataProvider;
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.xp.XspOutputLabel;
import com.ibm.xsp.component.UIPassThroughText;
import com.ibm.xsp.component.xp.XspInputText;
import java.lang.Object;
import javax.faces.el.ValueBinding;
import com.ibm.xsp.component.xp.XspLineBreak;
import com.ibm.xsp.component.xp.XspTable;
import com.ibm.xsp.component.xp.XspTableRow;
import com.ibm.xsp.component.xp.XspTableCell;
import com.ibm.xsp.component.xp.XspDataIterator;
import com.ibm.xsp.component.xp.XspCommandButton;
import com.ibm.xsp.component.xp.XspEventHandler;
import javax.faces.el.MethodBinding;
import com.ibm.xsp.page.compiled.PageParam;

@SuppressWarnings("all")
public class TwDemo extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public TwDemo() {
        super("3.0");
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new TwDemoPage();
    }
    
    public static class TwDemoPage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 "label1"
            ComponentInfo.EMPTY_MARKUP, // 1 text
            ComponentInfo.EMPTY_NORMAL, // 2 "subject"
            ComponentInfo.EMPTY_NORMAL, // 3 br
            ComponentInfo.EMPTY_NORMAL, // 4 td
            ComponentInfo.EMPTY_NORMAL, // 5 "label2"
            new ComponentInfo(false, new int[]{5}), // 6 td2
            ComponentInfo.EMPTY_NORMAL, // 7 "label3"
            new ComponentInfo(false, new int[]{7}), // 8 td3
            ComponentInfo.EMPTY_NORMAL, // 9 "label4"
            new ComponentInfo(false, new int[]{9}), // 10 td4
            ComponentInfo.EMPTY_NORMAL, // 11 td5
            new ComponentInfo(false, new int[]{4, 6, 8, 10, 11}), // 12 tr
            ComponentInfo.EMPTY_NORMAL, // 13 eventHandler
            new ComponentInfo(false, new int[]{13}), // 14 "addrowabove"
            ComponentInfo.EMPTY_NORMAL, // 15 eventHandler2
            new ComponentInfo(false, new int[]{15}), // 16 "addrowbelow"
            new ComponentInfo(false, new int[]{14, 16}), // 17 td6
            ComponentInfo.EMPTY_NORMAL, // 18 "color"
            new ComponentInfo(false, new int[]{18}), // 19 td7
            ComponentInfo.EMPTY_NORMAL, // 20 "shape"
            new ComponentInfo(false, new int[]{20}), // 21 td8
            ComponentInfo.EMPTY_NORMAL, // 22 "taste"
            new ComponentInfo(false, new int[]{22}), // 23 td9
            ComponentInfo.EMPTY_NORMAL, // 24 eventHandler3
            new ComponentInfo(false, new int[]{24}), // 25 "deletebutton"
            new ComponentInfo(false, new int[]{25}), // 26 td10
            new ComponentInfo(false, new int[]{17, 19, 21, 23, 26}), // 27 tr2
            new ComponentInfo(false, new int[]{27}), // 28 "fieldgroup"
            ComponentInfo.EMPTY_NORMAL, // 29 eventHandler4
            new ComponentInfo(false, new int[]{29}), // 30 "addbtn"
            ComponentInfo.EMPTY_MARKUP, // 31 text2
            ComponentInfo.EMPTY_NORMAL, // 32 eventHandler5
            new ComponentInfo(false, new int[]{32}), // 33 "savebtn"
            new ComponentInfo(false, new int[]{30, 31, 33}), // 34 td11
            new ComponentInfo(false, new int[]{34}), // 35 tr3
            new ComponentInfo(false, new int[]{12, 28, 35}), // 36 "repeattable"
            ComponentInfo.EMPTY_NORMAL, // 37 br2
            new ComponentInfo(false, new int[]{0, 1, 2, 3, 36, 37}), // 38 view
        };
        private static final String[][] s_localeStrs = new String[][]{
            new String[]{ // ""
                "Subject:", // 0 label1/@value
                "\u00a0", // 1 /xp:view[1]/text()[4]
                "color", // 2 label2/@value
                "Shape", // 3 label3/@value
                "Taste", // 4 label4/@value
                "Add", // 5 addBtn/@value
                "\u00a0\u00a0", // 6 repeatTable/xp:tr[2]/xp:td[1]/text()[2]
                "Save", // 7 saveBtn/@value
            },
            new String[]{ // de
                "[de| Subject: ]", // 0 label1/@value
                "[de| \u00a0 ]", // 1 /xp:view[1]/text()[4]
                "[de| color ]", // 2 label2/@value
                "[de| Shape ]", // 3 label3/@value
                "[de| Taste ]", // 4 label4/@value
                "[de| Add ]", // 5 addBtn/@value
                "[de| \u00a0\u00a0 ]", // 6 repeatTable/xp:tr[2]/xp:td[1]/text()[2]
                "[de| Save ]", // 7 saveBtn/@value
            },
            new String[]{ // pl
                "[pl| Subject: ]", // 0 label1/@value
                "[pl| \u00a0 ]", // 1 /xp:view[1]/text()[4]
                "[pl| color ]", // 2 label2/@value
                "[pl| Shape ]", // 3 label3/@value
                "[pl| Taste ]", // 4 label4/@value
                "[pl| Add ]", // 5 addBtn/@value
                "[pl| \u00a0\u00a0 ]", // 6 repeatTable/xp:tr[2]/xp:td[1]/text()[2]
                "[pl| Save ]", // 7 saveBtn/@value
            },
            new String[]{ // zh_CN
                "[zh_CN| Subject: ]", // 0 label1/@value
                "[zh_CN| \u00a0 ]", // 1 /xp:view[1]/text()[4]
                "[zh_CN| color ]", // 2 label2/@value
                "[zh_CN| Shape ]", // 3 label3/@value
                "[zh_CN| Taste ]", // 4 label4/@value
                "[zh_CN| Add ]", // 5 addBtn/@value
                "[zh_CN| \u00a0\u00a0 ]", // 6 repeatTable/xp:tr[2]/xp:td[1]/text()[2]
                "[zh_CN| Save ]", // 7 saveBtn/@value
            },
        };
        private String[] _currentLocale;
        
        public TwDemoPage() {
            super(38, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "label1".equals(id) )
                return 0;
            if( "subject".equals(id) )
                return 2;
            if( "repeattable".equals(id) )
                return 36;
            if( "label2".equals(id) )
                return 5;
            if( "label3".equals(id) )
                return 7;
            if( "label4".equals(id) )
                return 9;
            if( "fieldgroup".equals(id) )
                return 28;
            if( "addrowabove".equals(id) )
                return 14;
            if( "addrowbelow".equals(id) )
                return 16;
            if( "color".equals(id) )
                return 18;
            if( "shape".equals(id) )
                return 20;
            if( "taste".equals(id) )
                return 22;
            if( "deletebutton".equals(id) )
                return 25;
            if( "addbtn".equals(id) )
                return 30;
            if( "savebtn".equals(id) )
                return 33;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 38:
                return createView(context, parent, evaluator);
            case 0:
                return createLabel1(context, parent, evaluator);
            case 1:
                return createText(context, parent, evaluator);
            case 2:
                return createSubject(context, parent, evaluator);
            case 3:
                return createBr(context, parent, evaluator);
            case 36:
                return createRepeattable(context, parent, evaluator);
            case 12:
                return createTr(context, parent, evaluator);
            case 4:
                return createTd(context, parent, evaluator);
            case 6:
                return createTd2(context, parent, evaluator);
            case 5:
                return createLabel2(context, parent, evaluator);
            case 8:
                return createTd3(context, parent, evaluator);
            case 7:
                return createLabel3(context, parent, evaluator);
            case 10:
                return createTd4(context, parent, evaluator);
            case 9:
                return createLabel4(context, parent, evaluator);
            case 11:
                return createTd5(context, parent, evaluator);
            case 28:
                return createFieldgroup(context, parent, evaluator);
            case 27:
                return createTr2(context, parent, evaluator);
            case 17:
                return createTd6(context, parent, evaluator);
            case 14:
                return createAddrowabove(context, parent, evaluator);
            case 13:
                return createEventHandler(context, parent, evaluator);
            case 16:
                return createAddrowbelow(context, parent, evaluator);
            case 15:
                return createEventHandler2(context, parent, evaluator);
            case 19:
                return createTd7(context, parent, evaluator);
            case 18:
                return createColor(context, parent, evaluator);
            case 21:
                return createTd8(context, parent, evaluator);
            case 20:
                return createShape(context, parent, evaluator);
            case 23:
                return createTd9(context, parent, evaluator);
            case 22:
                return createTaste(context, parent, evaluator);
            case 26:
                return createTd10(context, parent, evaluator);
            case 25:
                return createDeletebutton(context, parent, evaluator);
            case 24:
                return createEventHandler3(context, parent, evaluator);
            case 35:
                return createTr3(context, parent, evaluator);
            case 34:
                return createTd11(context, parent, evaluator);
            case 30:
                return createAddbtn(context, parent, evaluator);
            case 29:
                return createEventHandler4(context, parent, evaluator);
            case 31:
                return createText2(context, parent, evaluator);
            case 33:
                return createSavebtn(context, parent, evaluator);
            case 32:
                return createEventHandler5(context, parent, evaluator);
            case 37:
                return createBr2(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        protected void initIncluderAsRoot(FacesContext context,
                PageExpressionEvaluator evaluator, UIComponent root) {
            ScriptResource resources = new ScriptResource();
            resources.setComponent(root);
            resources.setClientSide(false);
            resources.setSrc("/TableWalker.jss");
            FacesPageProvider asPageProvider = root instanceof FacesPageProvider ?
                    (FacesPageProvider) root : null;
            if( null != asPageProvider ){
                asPageProvider.addResource(resources);
            }
            DominoDocumentData data = new DominoDocumentData();
            data.setComponent(root);
            data.setVar("multiDoc");
            data.setFormName("MultiValueSource");
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
            ScriptResource resources = new ScriptResource();
            resources.setComponent(result);
            resources.setClientSide(false);
            resources.setSrc("/TableWalker.jss");
            result.addResource(resources);
            DominoDocumentData data = new DominoDocumentData();
            data.setComponent(result);
            data.setVar("multiDoc");
            data.setFormName("MultiValueSource");
            result.addData(data);
            return result;
        }

        private UIComponent createLabel1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[0]);
            setId(result, "label1");
            return result;
        }

        private UIComponent createText(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(_currentLocale[1]);
            return textComp;
        }

        private UIComponent createSubject(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            String sourceId = "subject/@value";
            String valueExpr = "#{multiDoc.subject}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "subject");
            return result;
        }

        private UIComponent createBr(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createRepeattable(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTable result = new XspTable();
            setId(result, "repeatTable");
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

        private UIComponent createTd2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createLabel2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[2]);
            setId(result, "label2");
            return result;
        }

        private UIComponent createTd3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createLabel3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[3]);
            setId(result, "label3");
            return result;
        }

        private UIComponent createTd4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createLabel4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[4]);
            setId(result, "label4");
            return result;
        }

        private UIComponent createTd5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createFieldgroup(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "fieldGroup/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:var scopeVariableName = \"group\";\nvar fieldNames = \"colors,taste,shape\";\ntableWalker.getDataSource(scopeVariableName,multiDoc,fieldNames)}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setIndexVar("rowIndex");
            result.setVar("fieldGroup");
            result.setRows(30);
            setId(result, "fieldGroup");
            return result;
        }

        private UIComponent createTr2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createAddrowabove(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setStyle("width:25.0px;height:25.0px");
            String sourceId = "addRowAbove/xp:this.icon[1]/text()";
            String iconExpr = "#{javascript:\"/.ibmxspres/domino/icons/actn097.gif\"}";
            ValueBinding icon = evaluator.createValueBinding(result, iconExpr, sourceId,String.class);
            result.setValueBinding("icon", icon);
            setId(result, "addRowAbove");
            return result;
        }

        private UIComponent createEventHandler(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "addRowAbove/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:tableWalker.addRow(\"group\", rowIndex)}",
                    null,null, sourceId);
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createAddrowbelow(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setStyle("height:25.0px;width:25.0px");
            String sourceId = "addRowBelow/xp:this.icon[1]/text()";
            String iconExpr = "#{javascript:\"/.ibmxspres/domino/icons/actn096.gif\"}";
            ValueBinding icon = evaluator.createValueBinding(result, iconExpr, sourceId,String.class);
            result.setValueBinding("icon", icon);
            setId(result, "addRowBelow");
            return result;
        }

        private UIComponent createEventHandler2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "addRowBelow/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:tableWalker.addRow(\"group\", rowIndex+1)}",
                    null,null, sourceId);
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createTd7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createColor(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            String sourceId = "color/xp:this.value[1]/text()";
            String valueExpr = "#{fieldGroup[0]}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "color");
            return result;
        }

        private UIComponent createTd8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createShape(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            String sourceId = "shape/xp:this.value[1]/text()";
            String valueExpr = "#{fieldGroup[1]}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "shape");
            return result;
        }

        private UIComponent createTd9(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createTaste(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            String sourceId = "taste/xp:this.value[1]/text()";
            String valueExpr = "#{fieldGroup[2]}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "taste");
            return result;
        }

        private UIComponent createTd10(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createDeletebutton(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setStyle("width:25.0px;height:25.0px");
            String sourceId = "deleteButton/xp:this.icon[1]/text()";
            String iconExpr = "#{javascript:\"/.ibmxspres/domino/icons/vwicn038.gif\"}";
            ValueBinding icon = evaluator.createValueBinding(result, iconExpr, sourceId,String.class);
            result.setValueBinding("icon", icon);
            setId(result, "deleteButton");
            return result;
        }

        private UIComponent createEventHandler3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "deleteButton/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:tableWalker.removeRow(\"group\", rowIndex)}",
                    null,null, sourceId);
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createTr3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd11(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            result.setAlign("center");
            result.setColspan(5);
            return result;
        }

        private UIComponent createAddbtn(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[5]);
            setId(result, "addBtn");
            return result;
        }

        private UIComponent createEventHandler4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "addBtn/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:tableWalker.addRow(\"group\")}",
                    null,null, sourceId);
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createText2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(_currentLocale[6]);
            return textComp;
        }

        private UIComponent createSavebtn(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[7]);
            setId(result, "saveBtn");
            return result;
        }

        private UIComponent createEventHandler5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "saveBtn/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:tableWalker.updateDocument(\"group\", multiDoc)\nmultiDoc.save()}",
                    null,null, sourceId);
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createBr2(FacesContext context, 
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
