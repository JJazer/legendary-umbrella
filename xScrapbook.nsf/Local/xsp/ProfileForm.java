/*
 * Generated file. 
 * 
 * ProfileForm.java
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
import com.ibm.xsp.model.domino.DominoDocumentData;
import com.ibm.xsp.component.FacesDataProvider;
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.xp.XspOutputLabel;
import com.ibm.xsp.component.UIPassThroughText;
import com.ibm.xsp.component.xp.XspTable;
import com.ibm.xsp.component.xp.XspTableRow;
import com.ibm.xsp.component.xp.XspTableCell;
import com.ibm.xsp.component.xp.XspInputText;
import com.ibm.xsp.validator.RequiredValidator;
import java.lang.Object;
import javax.faces.el.ValueBinding;
import com.ibm.xsp.component.xp.XspSelectOneMenu;
import com.ibm.xsp.component.UISelectItemEx;
import com.ibm.xsp.component.xp.XspTypeAhead;
import com.ibm.xsp.component.UISelectItemsEx;
import com.ibm.xsp.convert.DateTimeConverter;
import com.ibm.xsp.component.xp.XspInputRichText;
import com.ibm.xsp.component.xp.XspCommandButton;
import com.ibm.xsp.component.xp.XspEventHandler;
import com.ibm.xsp.actions.OpenPageAction;
import com.ibm.xsp.actions.client.ExecuteScriptClientAction;
import com.ibm.xsp.actions.DeleteDocumentAction;
import com.ibm.xsp.actions.ChangeDocumentModeAction;
import com.ibm.xsp.component.xp.XspLineBreak;
import com.ibm.xsp.actions.ExecuteScriptAction;
import javax.faces.el.MethodBinding;
import com.ibm.xsp.component.UIPanelEx;
import com.ibm.xsp.component.xp.XspDataIterator;
import com.ibm.xsp.component.xp.XspOutputText;
import com.ibm.xsp.component.xp.XspOutputLink;
import com.ibm.xsp.page.compiled.PageParam;

@SuppressWarnings("all")
public class ProfileForm extends AbstractCompiledPageDispatcher{

    private static final String[][] s_pageDetails = new String[][]{
        {"", "", "", "de", "pl", "zh_CN"}, // page0
    };
    
    public ProfileForm() {
        super("8.5.1"); // version of xp:eventHandler script
        setPageDetails(s_pageDetails);
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new ProfileFormPage();
    }
    
    protected boolean isCustomControl() {
        return true;
    }

    public static class ProfileFormPage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 "label1"
            ComponentInfo.EMPTY_MARKUP, // 1 text
            ComponentInfo.EMPTY_NORMAL, // 2 "firstname_label1"
            new ComponentInfo(false, new int[]{2}), // 3 td
            ComponentInfo.EMPTY_NORMAL, // 4 "firstname1"
            new ComponentInfo(false, new int[]{4}), // 5 td2
            new ComponentInfo(false, new int[]{3, 5}), // 6 tr
            ComponentInfo.EMPTY_NORMAL, // 7 "lastname_label1"
            new ComponentInfo(false, new int[]{7}), // 8 td3
            ComponentInfo.EMPTY_NORMAL, // 9 "lastname1"
            new ComponentInfo(false, new int[]{9}), // 10 td4
            new ComponentInfo(false, new int[]{8, 10}), // 11 tr2
            ComponentInfo.EMPTY_NORMAL, // 12 "email_label1"
            new ComponentInfo(false, new int[]{12}), // 13 td5
            ComponentInfo.EMPTY_NORMAL, // 14 "email1"
            new ComponentInfo(false, new int[]{14}), // 15 td6
            new ComponentInfo(false, new int[]{13, 15}), // 16 tr3
            ComponentInfo.EMPTY_NORMAL, // 17 "gender_label1"
            new ComponentInfo(false, new int[]{17}), // 18 td7
            ComponentInfo.EMPTY_NORMAL, // 19 "selectitem1"
            ComponentInfo.EMPTY_NORMAL, // 20 "selectitem2"
            new ComponentInfo(false, new int[]{19, 20}), // 21 "gender1"
            new ComponentInfo(false, new int[]{21}), // 22 td8
            new ComponentInfo(false, new int[]{18, 22}), // 23 tr4
            ComponentInfo.EMPTY_NORMAL, // 24 "country_label2"
            new ComponentInfo(false, new int[]{24}), // 25 td9
            ComponentInfo.EMPTY_NORMAL, // 26 "typeahead1"
            new ComponentInfo(false, new int[]{26}), // 27 "country1"
            new ComponentInfo(false, new int[]{27}), // 28 td10
            new ComponentInfo(false, new int[]{25, 28}), // 29 tr5
            ComponentInfo.EMPTY_NORMAL, // 30 "timezone_label1"
            new ComponentInfo(false, new int[]{30}), // 31 td11
            ComponentInfo.EMPTY_NORMAL, // 32 "selectitems1"
            new ComponentInfo(false, new int[]{32}), // 33 "timezone1"
            new ComponentInfo(false, new int[]{33}), // 34 td12
            new ComponentInfo(false, new int[]{31, 34}), // 35 tr6
            ComponentInfo.EMPTY_NORMAL, // 36 "label2"
            new ComponentInfo(false, new int[]{36}), // 37 td13
            ComponentInfo.EMPTY_NORMAL, // 38 "inputtext1"
            new ComponentInfo(false, new int[]{38}), // 39 td14
            new ComponentInfo(false, new int[]{37, 39}), // 40 tr7
            ComponentInfo.EMPTY_NORMAL, // 41 "aboutme_label1"
            new ComponentInfo(false, new int[]{41}), // 42 td15
            ComponentInfo.EMPTY_NORMAL, // 43 "aboutme1"
            new ComponentInfo(false, new int[]{43}), // 44 td16
            new ComponentInfo(false, new int[]{42, 44}), // 45 tr8
            ComponentInfo.EMPTY_NORMAL, // 46 td17
            ComponentInfo.EMPTY_NORMAL, // 47 "eventhandler1"
            new ComponentInfo(false, new int[]{47}), // 48 "button1"
            ComponentInfo.EMPTY_NORMAL, // 49 "eventhandler2"
            new ComponentInfo(false, new int[]{49}), // 50 "button2"
            ComponentInfo.EMPTY_NORMAL, // 51 "eventhandler3"
            new ComponentInfo(false, new int[]{51}), // 52 "button3"
            ComponentInfo.EMPTY_NORMAL, // 53 "eventhandler4"
            new ComponentInfo(false, new int[]{53}), // 54 "button4"
            new ComponentInfo(false, new int[]{48, 50, 52, 54}), // 55 td18
            new ComponentInfo(false, new int[]{46, 55}), // 56 tr9
            new ComponentInfo(false, new int[]{6, 11, 16, 23, 29, 35, 40, 45, 56}), // 57 table
            ComponentInfo.EMPTY_NORMAL, // 58 br
            ComponentInfo.EMPTY_NORMAL, // 59 "friendstable"
            new ComponentInfo(false, new int[]{59}), // 60 td19
            new ComponentInfo(false, new int[]{60}), // 61 tr10
            ComponentInfo.EMPTY_NORMAL, // 62 "label3"
            new ComponentInfo(false, new int[]{62}), // 63 td20
            ComponentInfo.EMPTY_NORMAL, // 64 typeAhead
            ComponentInfo.EMPTY_NORMAL, // 65 eventHandler
            new ComponentInfo(false, new int[]{64, 65}), // 66 "friendname"
            new ComponentInfo(false, new int[]{66}), // 67 td21
            new ComponentInfo(false, new int[]{63, 67}), // 68 tr11
            ComponentInfo.EMPTY_NORMAL, // 69 "label4"
            new ComponentInfo(false, new int[]{69}), // 70 td22
            ComponentInfo.EMPTY_NORMAL, // 71 "friendemail"
            new ComponentInfo(false, new int[]{71}), // 72 td23
            new ComponentInfo(false, new int[]{70, 72}), // 73 tr12
            ComponentInfo.EMPTY_NORMAL, // 74 td24
            ComponentInfo.EMPTY_NORMAL, // 75 eventHandler5
            new ComponentInfo(false, new int[]{75}), // 76 "cmdfriendsbutton"
            new ComponentInfo(false, new int[]{76}), // 77 td25
            new ComponentInfo(false, new int[]{74, 77}), // 78 tr13
            ComponentInfo.EMPTY_NORMAL, // 79 td26
            ComponentInfo.EMPTY_NORMAL, // 80 "computedfield1"
            ComponentInfo.EMPTY_NORMAL, // 81 eventHandler6
            new ComponentInfo(false, new int[]{81}), // 82 "link1"
            ComponentInfo.EMPTY_NORMAL, // 83 br2
            ComponentInfo.EMPTY_NORMAL, // 84 "computedfield2"
            new ComponentInfo(false, new int[]{80, 82, 83, 84}), // 85 "friendspanel"
            new ComponentInfo(false, new int[]{85}), // 86 "friendsrepeat"
            new ComponentInfo(false, new int[]{86}), // 87 "friendscontainer"
            new ComponentInfo(false, new int[]{87}), // 88 td27
            new ComponentInfo(false, new int[]{79, 88}), // 89 tr14
            new ComponentInfo(false, new int[]{61, 68, 73, 78, 89}), // 90 table2
            new ComponentInfo(false, new int[]{0, 1, 57, 58, 90}), // 91 view
        };
        private static final String[][] s_localeStrs = new String[][]{
            new String[]{ // ""
                "profileForm", // 0 label1/@value
                "1", // 1 /xp:view[1]/text()[4]
                "First name:", // 2 firstName_Label1/@value
                "Pole First name wymagane", // 3 firstName1/xp:this.validators[1]/xp:validateRequired[1]/@message
                "Last name:", // 4 lastName_Label1/@value
                "Pole Last name wymagane", // 5 lastName1/xp:this.validators[1]/xp:validateRequired[1]/@message
                "Email:", // 6 email_Label1/@value
                "Gender:", // 7 gender_Label1/@value
                "Male", // 8 selectItem1/@itemLabel
                "Female", // 9 selectItem2/@itemLabel
                "Country:", // 10 country_Label2/@value
                "Time zone:", // 11 timeZone_Label1/@value
                "Date of Birth", // 12 label2/@value
                "About me:", // 13 aboutMe_Label1/@value
                "Save", // 14 button1/@value
                "Delete", // 15 button2/@value
                "Document deleted", // 16 eventHandler2/xp:this.action[1]/xp:deleteDocument[1]/@message
                "Cancle", // 17 button3/@value
                "Edit", // 18 button4/@value
                "Your Frends", // 19 friendsTable/@value
                "FriendName", // 20 label3/@value
                "Friend eMail", // 21 label4/@value
                "Add as Friend", // 22 cmdfriendsButton/@value
                "(Remove)", // 23 link1/@text
            },
            new String[]{ // de
                "[de| profileForm ]", // 0 label1/@value
                "[de| 1 ]", // 1 /xp:view[1]/text()[4]
                "[de| First name: ]", // 2 firstName_Label1/@value
                "[de| Pole First name wymagane ]", // 3 firstName1/xp:this.validators[1]/xp:validateRequired[1]/@message
                "[de| Last name: ]", // 4 lastName_Label1/@value
                "[de| Pole Last name wymagane ]", // 5 lastName1/xp:this.validators[1]/xp:validateRequired[1]/@message
                "[de| Email: ]", // 6 email_Label1/@value
                "[de| Gender: ]", // 7 gender_Label1/@value
                "[de| Male ]", // 8 selectItem1/@itemLabel
                "[de| Female ]", // 9 selectItem2/@itemLabel
                "[de| Country: ]", // 10 country_Label2/@value
                "[de| Time zone: ]", // 11 timeZone_Label1/@value
                "[de| Date of Birth ]", // 12 label2/@value
                "[de| About me: ]", // 13 aboutMe_Label1/@value
                "[de| Save ]", // 14 button1/@value
                "[de| Delete ]", // 15 button2/@value
                "[de| Document deleted ]", // 16 eventHandler2/xp:this.action[1]/xp:deleteDocument[1]/@message
                "[de| Cancle ]", // 17 button3/@value
                "[de| Edit ]", // 18 button4/@value
                "[de| Your Frends ]", // 19 friendsTable/@value
                "[de| FriendName ]", // 20 label3/@value
                "[de| Friend eMail ]", // 21 label4/@value
                "[de| Add as Friend ]", // 22 cmdfriendsButton/@value
                "[de| (Remove) ]", // 23 link1/@text
            },
            new String[]{ // pl
                "[pl| profileForm ]", // 0 label1/@value
                "[pl| 1 ]", // 1 /xp:view[1]/text()[4]
                "[pl| First name: ]", // 2 firstName_Label1/@value
                "[pl| Pole First name wymagane ]", // 3 firstName1/xp:this.validators[1]/xp:validateRequired[1]/@message
                "[pl| Last name: ]", // 4 lastName_Label1/@value
                "[pl| Pole Last name wymagane ]", // 5 lastName1/xp:this.validators[1]/xp:validateRequired[1]/@message
                "[pl| Email: ]", // 6 email_Label1/@value
                "[pl| Gender: ]", // 7 gender_Label1/@value
                "[pl| Male ]", // 8 selectItem1/@itemLabel
                "[pl| Female ]", // 9 selectItem2/@itemLabel
                "[pl| Country: ]", // 10 country_Label2/@value
                "[pl| Time zone: ]", // 11 timeZone_Label1/@value
                "[pl| Date of Birth ]", // 12 label2/@value
                "[pl| About me: ]", // 13 aboutMe_Label1/@value
                "[pl| Save ]", // 14 button1/@value
                "[pl| Delete ]", // 15 button2/@value
                "[pl| Document deleted ]", // 16 eventHandler2/xp:this.action[1]/xp:deleteDocument[1]/@message
                "[pl| Cancle ]", // 17 button3/@value
                "[pl| Edit ]", // 18 button4/@value
                "[pl| Your Frends ]", // 19 friendsTable/@value
                "[pl| FriendName ]", // 20 label3/@value
                "[pl| Friend eMail ]", // 21 label4/@value
                "[pl| Add as Friend ]", // 22 cmdfriendsButton/@value
                "[pl| (Remove) ]", // 23 link1/@text
            },
            new String[]{ // zh_CN
                "[zh_CN| profileForm ]", // 0 label1/@value
                "[zh_CN| 1 ]", // 1 /xp:view[1]/text()[4]
                "[zh_CN| First name: ]", // 2 firstName_Label1/@value
                "[zh_CN| Pole First name wymagane ]", // 3 firstName1/xp:this.validators[1]/xp:validateRequired[1]/@message
                "[zh_CN| Last name: ]", // 4 lastName_Label1/@value
                "[zh_CN| Pole Last name wymagane ]", // 5 lastName1/xp:this.validators[1]/xp:validateRequired[1]/@message
                "[zh_CN| Email: ]", // 6 email_Label1/@value
                "[zh_CN| Gender: ]", // 7 gender_Label1/@value
                "[zh_CN| Male ]", // 8 selectItem1/@itemLabel
                "[zh_CN| Female ]", // 9 selectItem2/@itemLabel
                "[zh_CN| Country: ]", // 10 country_Label2/@value
                "[zh_CN| Time zone: ]", // 11 timeZone_Label1/@value
                "[zh_CN| Date of Birth ]", // 12 label2/@value
                "[zh_CN| About me: ]", // 13 aboutMe_Label1/@value
                "[zh_CN| Save ]", // 14 button1/@value
                "[zh_CN| Delete ]", // 15 button2/@value
                "[zh_CN| Document deleted ]", // 16 eventHandler2/xp:this.action[1]/xp:deleteDocument[1]/@message
                "[zh_CN| Cancle ]", // 17 button3/@value
                "[zh_CN| Edit ]", // 18 button4/@value
                "[zh_CN| Your Frends ]", // 19 friendsTable/@value
                "[zh_CN| FriendName ]", // 20 label3/@value
                "[zh_CN| Friend eMail ]", // 21 label4/@value
                "[zh_CN| Add as Friend ]", // 22 cmdfriendsButton/@value
                "[zh_CN| (Remove) ]", // 23 link1/@text
            },
        };
        private String[] _currentLocale;
        
        public ProfileFormPage() {
            super(91, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "label1".equals(id) )
                return 0;
            if( "firstname_label1".equals(id) )
                return 2;
            if( "firstname1".equals(id) )
                return 4;
            if( "lastname_label1".equals(id) )
                return 7;
            if( "lastname1".equals(id) )
                return 9;
            if( "email_label1".equals(id) )
                return 12;
            if( "email1".equals(id) )
                return 14;
            if( "gender_label1".equals(id) )
                return 17;
            if( "gender1".equals(id) )
                return 21;
            if( "selectitem1".equals(id) )
                return 19;
            if( "selectitem2".equals(id) )
                return 20;
            if( "country_label2".equals(id) )
                return 24;
            if( "country1".equals(id) )
                return 27;
            if( "typeahead1".equals(id) )
                return 26;
            if( "timezone_label1".equals(id) )
                return 30;
            if( "timezone1".equals(id) )
                return 33;
            if( "selectitems1".equals(id) )
                return 32;
            if( "label2".equals(id) )
                return 36;
            if( "inputtext1".equals(id) )
                return 38;
            if( "aboutme_label1".equals(id) )
                return 41;
            if( "aboutme1".equals(id) )
                return 43;
            if( "button1".equals(id) )
                return 48;
            if( "eventhandler1".equals(id) )
                return 47;
            if( "button2".equals(id) )
                return 50;
            if( "eventhandler2".equals(id) )
                return 49;
            if( "button3".equals(id) )
                return 52;
            if( "eventhandler3".equals(id) )
                return 51;
            if( "button4".equals(id) )
                return 54;
            if( "eventhandler4".equals(id) )
                return 53;
            if( "friendstable".equals(id) )
                return 59;
            if( "label3".equals(id) )
                return 62;
            if( "friendname".equals(id) )
                return 66;
            if( "label4".equals(id) )
                return 69;
            if( "friendemail".equals(id) )
                return 71;
            if( "cmdfriendsbutton".equals(id) )
                return 76;
            if( "friendscontainer".equals(id) )
                return 87;
            if( "friendsrepeat".equals(id) )
                return 86;
            if( "friendspanel".equals(id) )
                return 85;
            if( "computedfield1".equals(id) )
                return 80;
            if( "link1".equals(id) )
                return 82;
            if( "computedfield2".equals(id) )
                return 84;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 91:
                return createView(context, parent, evaluator);
            case 0:
                return createLabel1(context, parent, evaluator);
            case 1:
                return createText(context, parent, evaluator);
            case 57:
                return createTable(context, parent, evaluator);
            case 6:
                return createTr(context, parent, evaluator);
            case 3:
                return createTd(context, parent, evaluator);
            case 2:
                return createFirstname_005f_label1(context, parent, evaluator);
            case 5:
                return createTd2(context, parent, evaluator);
            case 4:
                return createFirstname1(context, parent, evaluator);
            case 11:
                return createTr2(context, parent, evaluator);
            case 8:
                return createTd3(context, parent, evaluator);
            case 7:
                return createLastname_005f_label1(context, parent, evaluator);
            case 10:
                return createTd4(context, parent, evaluator);
            case 9:
                return createLastname1(context, parent, evaluator);
            case 16:
                return createTr3(context, parent, evaluator);
            case 13:
                return createTd5(context, parent, evaluator);
            case 12:
                return createEmail_005f_label1(context, parent, evaluator);
            case 15:
                return createTd6(context, parent, evaluator);
            case 14:
                return createEmail1(context, parent, evaluator);
            case 23:
                return createTr4(context, parent, evaluator);
            case 18:
                return createTd7(context, parent, evaluator);
            case 17:
                return createGender_005f_label1(context, parent, evaluator);
            case 22:
                return createTd8(context, parent, evaluator);
            case 21:
                return createGender1(context, parent, evaluator);
            case 19:
                return createSelectitem1(context, parent, evaluator);
            case 20:
                return createSelectitem2(context, parent, evaluator);
            case 29:
                return createTr5(context, parent, evaluator);
            case 25:
                return createTd9(context, parent, evaluator);
            case 24:
                return createCountry_005f_label2(context, parent, evaluator);
            case 28:
                return createTd10(context, parent, evaluator);
            case 27:
                return createCountry1(context, parent, evaluator);
            case 26:
                return createTypeahead1(context, parent, evaluator);
            case 35:
                return createTr6(context, parent, evaluator);
            case 31:
                return createTd11(context, parent, evaluator);
            case 30:
                return createTimezone_005f_label1(context, parent, evaluator);
            case 34:
                return createTd12(context, parent, evaluator);
            case 33:
                return createTimezone1(context, parent, evaluator);
            case 32:
                return createSelectitems1(context, parent, evaluator);
            case 40:
                return createTr7(context, parent, evaluator);
            case 37:
                return createTd13(context, parent, evaluator);
            case 36:
                return createLabel2(context, parent, evaluator);
            case 39:
                return createTd14(context, parent, evaluator);
            case 38:
                return createInputtext1(context, parent, evaluator);
            case 45:
                return createTr8(context, parent, evaluator);
            case 42:
                return createTd15(context, parent, evaluator);
            case 41:
                return createAboutme_005f_label1(context, parent, evaluator);
            case 44:
                return createTd16(context, parent, evaluator);
            case 43:
                return createAboutme1(context, parent, evaluator);
            case 56:
                return createTr9(context, parent, evaluator);
            case 46:
                return createTd17(context, parent, evaluator);
            case 55:
                return createTd18(context, parent, evaluator);
            case 48:
                return createButton1(context, parent, evaluator);
            case 47:
                return createEventhandler1(context, parent, evaluator);
            case 50:
                return createButton2(context, parent, evaluator);
            case 49:
                return createEventhandler2(context, parent, evaluator);
            case 52:
                return createButton3(context, parent, evaluator);
            case 51:
                return createEventhandler3(context, parent, evaluator);
            case 54:
                return createButton4(context, parent, evaluator);
            case 53:
                return createEventhandler4(context, parent, evaluator);
            case 58:
                return createBr(context, parent, evaluator);
            case 90:
                return createTable2(context, parent, evaluator);
            case 61:
                return createTr10(context, parent, evaluator);
            case 60:
                return createTd19(context, parent, evaluator);
            case 59:
                return createFriendstable(context, parent, evaluator);
            case 68:
                return createTr11(context, parent, evaluator);
            case 63:
                return createTd20(context, parent, evaluator);
            case 62:
                return createLabel3(context, parent, evaluator);
            case 67:
                return createTd21(context, parent, evaluator);
            case 66:
                return createFriendname(context, parent, evaluator);
            case 64:
                return createTypeAhead(context, parent, evaluator);
            case 65:
                return createEventHandler(context, parent, evaluator);
            case 73:
                return createTr12(context, parent, evaluator);
            case 70:
                return createTd22(context, parent, evaluator);
            case 69:
                return createLabel4(context, parent, evaluator);
            case 72:
                return createTd23(context, parent, evaluator);
            case 71:
                return createFriendemail(context, parent, evaluator);
            case 78:
                return createTr13(context, parent, evaluator);
            case 74:
                return createTd24(context, parent, evaluator);
            case 77:
                return createTd25(context, parent, evaluator);
            case 76:
                return createCmdfriendsbutton(context, parent, evaluator);
            case 75:
                return createEventHandler5(context, parent, evaluator);
            case 89:
                return createTr14(context, parent, evaluator);
            case 79:
                return createTd26(context, parent, evaluator);
            case 88:
                return createTd27(context, parent, evaluator);
            case 87:
                return createFriendscontainer(context, parent, evaluator);
            case 86:
                return createFriendsrepeat(context, parent, evaluator);
            case 85:
                return createFriendspanel(context, parent, evaluator);
            case 80:
                return createComputedfield1(context, parent, evaluator);
            case 82:
                return createLink1(context, parent, evaluator);
            case 81:
                return createEventHandler6(context, parent, evaluator);
            case 83:
                return createBr2(context, parent, evaluator);
            case 84:
                return createComputedfield2(context, parent, evaluator);
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
            DominoDocumentData data = new DominoDocumentData();
            data.setComponent(root);
            data.setComputeWithForm("onsave");
            data.setVar("document1");
            data.setFormName("profile");
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
            StyleSheetResource resources = new StyleSheetResource();
            resources.setComponent(result);
            resources.setHref("/styles.css");
            result.addResource(resources);
            DominoDocumentData data = new DominoDocumentData();
            data.setComponent(result);
            data.setComputeWithForm("onsave");
            data.setVar("document1");
            data.setFormName("profile");
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

        private UIComponent createFirstname_005f_label1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[2]);
            result.setFor("firstName1");
            setId(result, "firstName_Label1");
            return result;
        }

        private UIComponent createTd2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createFirstname1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            RequiredValidator validators = new RequiredValidator();
            validators.setComponent(result);
            validators.setMessage(_currentLocale[3]);
            result.addValidator(validators);
            String sourceId = "firstName1/@value";
            String valueExpr = "#{document1.FirstName}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "firstName1");
            result.setRequired(true);
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

        private UIComponent createLastname_005f_label1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[4]);
            result.setFor("lastName1");
            setId(result, "lastName_Label1");
            return result;
        }

        private UIComponent createTd4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createLastname1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            RequiredValidator validators = new RequiredValidator();
            validators.setComponent(result);
            validators.setMessage(_currentLocale[5]);
            result.addValidator(validators);
            String sourceId = "lastName1/@value";
            String valueExpr = "#{document1.LastName}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "lastName1");
            result.setRequired(true);
            return result;
        }

        private UIComponent createTr3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createEmail_005f_label1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[6]);
            result.setFor("email1");
            setId(result, "email_Label1");
            return result;
        }

        private UIComponent createTd6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createEmail1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            String sourceId = "email1/@value";
            String valueExpr = "#{document1.Email}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "email1");
            return result;
        }

        private UIComponent createTr4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createGender_005f_label1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[7]);
            result.setFor("gender1");
            setId(result, "gender_Label1");
            return result;
        }

        private UIComponent createTd8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createGender1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspSelectOneMenu result = new XspSelectOneMenu();
            String sourceId = "gender1/@value";
            String valueExpr = "#{document1.Gender}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "gender1");
            return result;
        }

        private UIComponent createSelectitem1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UISelectItemEx result = new UISelectItemEx();
            result.setItemLabel(_currentLocale[8]);
            setId(result, "selectItem1");
            result.setItemValue("1");
            return result;
        }

        private UIComponent createSelectitem2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UISelectItemEx result = new UISelectItemEx();
            result.setItemLabel(_currentLocale[9]);
            setId(result, "selectItem2");
            result.setItemValue("2");
            return result;
        }

        private UIComponent createTr5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd9(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createCountry_005f_label2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[10]);
            result.setFor("country1");
            setId(result, "country_Label2");
            return result;
        }

        private UIComponent createTd10(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createCountry1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            String sourceId = "country1/@value";
            String valueExpr = "#{document1.Country}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "country1");
            return result;
        }

        private UIComponent createTypeahead1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTypeAhead result = new XspTypeAhead();
            result.setIgnoreCase(true);
            result.setMode("partial");
            result.setMinChars(1);
            setId(result, "typeAhead1");
            String sourceId = "typeAhead1/xp:this.valueList[1]/text()";
            String valueListExpr = "#{javascript:@DbLookup(@DbName(), \"keywordLookup\", \"Countries\", \"Values\")}";
            ValueBinding valueList = evaluator.createValueBinding(result, valueListExpr, sourceId,Object.class);
            result.setValueBinding("valueList", valueList);
            return result;
        }

        private UIComponent createTr6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd11(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createTimezone_005f_label1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[11]);
            result.setFor("timeZone1");
            setId(result, "timeZone_Label1");
            return result;
        }

        private UIComponent createTd12(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createTimezone1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspSelectOneMenu result = new XspSelectOneMenu();
            String sourceId = "timeZone1/@value";
            String valueExpr = "#{document1.TimeZone}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "timeZone1");
            return result;
        }

        private UIComponent createSelectitems1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UISelectItemsEx result = new UISelectItemsEx();
            String sourceId = "selectItems1/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:@DbLookup(@DbName(), \"keywordLookup\", \"TimeZones\", \"Values\")}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "selectItems1");
            return result;
        }

        private UIComponent createTr7(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd13(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createLabel2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[12]);
            setId(result, "label2");
            return result;
        }

        private UIComponent createTd14(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createInputtext1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            DateTimeConverter converter = new DateTimeConverter();
            converter.setDateStyle("short");
            converter.setType("date");
            result.setConverter(converter);
            String sourceId = "inputText1/@value";
            String valueExpr = "#{document1.DOB}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "inputText1");
            return result;
        }

        private UIComponent createTr8(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd15(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createAboutme_005f_label1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[13]);
            result.setFor("aboutMe1");
            setId(result, "aboutMe_Label1");
            return result;
        }

        private UIComponent createTd16(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createAboutme1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputRichText result = new XspInputRichText();
            String sourceId = "aboutMe1/@value";
            String valueExpr = "#{document1.AboutMe}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            setId(result, "aboutMe1");
            return result;
        }

        private UIComponent createTr9(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd17(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createTd18(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createButton1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[14]);
            result.setStyleClass("profilesButtonSubmit");
            setId(result, "button1");
            return result;
        }

        private UIComponent createEventhandler1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            OpenPageAction action = new OpenPageAction();
            action.setComponent(result);
            action.setName("/home.xsp");
            action.setSourceReferenceId("eventHandler1/xp:this.action[1]/xp:openPage[1]");
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            ExecuteScriptClientAction script = new ExecuteScriptClientAction();
            script.setComponent(result);
            String sourceId = "eventHandler1/xp:this.script[1]/xp:executeClientScript[1]/xp:this.script[1]/text()";
            String scriptExpr = "var firstName = dojo.byId(\"#{id:firstName1}\");\nvar lastName = dojo.byId(\"#{id:lastName1}\");\nif (firstName.value == lastName.value){\nalert(\"Pola Last name i First name musz\u0105 by\u0107 inne\");\nreturn false;\n}else{\n return true;\n}";
            ValueBinding script2 = evaluator.createValueBinding(result, scriptExpr, sourceId,String.class);
            script.setValueBinding("script", script2);
            script.setSourceReferenceId("eventHandler1/xp:this.script[1]/xp:executeClientScript[1]");
            result.setScript(script);
            setId(result, "eventHandler1");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createButton2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[15]);
            String sourceId = "button2/@rendered";
            String renderedExpr = "#{javascript:!document1.isNewNote()}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("profilesButtonCommand");
            setId(result, "button2");
            return result;
        }

        private UIComponent createEventhandler2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            DeleteDocumentAction action = new DeleteDocumentAction();
            action.setComponent(result);
            action.setMessage(_currentLocale[16]);
            action.setName("/home.xsp");
            action.setSourceReferenceId("eventHandler2/xp:this.action[1]/xp:deleteDocument[1]");
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            setId(result, "eventHandler2");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createButton3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[17]);
            result.setStyleClass("profilesButtonCancel");
            setId(result, "button3");
            return result;
        }

        private UIComponent createEventhandler3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(true);
            OpenPageAction action = new OpenPageAction();
            action.setComponent(result);
            action.setName("/home.xsp");
            action.setSourceReferenceId("eventHandler3/xp:this.action[1]/xp:openPage[1]");
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            setId(result, "eventHandler3");
            result.setSave(false);
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createButton4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[18]);
            String sourceId = "button4/@rendered";
            String renderedExpr = "#{javascript:!currentDocument.isEditable()}";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            result.setStyleClass("profilesButtonSubmit");
            setId(result, "button4");
            return result;
        }

        private UIComponent createEventhandler4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            result.setImmediate(false);
            ChangeDocumentModeAction action = new ChangeDocumentModeAction();
            action.setComponent(result);
            action.setMode("edit");
            action.setSourceReferenceId("eventHandler4/xp:this.action[1]/xp:changeDocumentMode[1]");
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            setId(result, "eventHandler4");
            result.setSave(true);
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createBr(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createTable2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTable result = new XspTable();
            result.setStyle("width:778.0px");
            String sourceId = "/xp:view[1]/xp:table[2]/@rendered";
            String renderedExpr = "#{javascript:!document1.isNewNote() }";
            ValueBinding rendered = evaluator.createValueBinding(result, renderedExpr, sourceId,boolean.class);
            result.setValueBinding("rendered", rendered);
            return result;
        }

        private UIComponent createTr10(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd19(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            result.setAlign("center");
            result.setColspan(2);
            return result;
        }

        private UIComponent createFriendstable(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[19]);
            setId(result, "friendsTable");
            return result;
        }

        private UIComponent createTr11(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd20(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createLabel3(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[20]);
            setId(result, "label3");
            return result;
        }

        private UIComponent createTd21(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            result.setStyle("width:690.0px");
            return result;
        }

        private UIComponent createFriendname(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            setId(result, "friendName");
            return result;
        }

        private UIComponent createTypeAhead(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTypeAhead result = new XspTypeAhead();
            result.setIgnoreCase(true);
            result.setMode("full");
            result.setMinChars(1);
            String sourceId = "friendName/xp:typeAhead[1]/xp:this.valueList[1]/text()";
            String valueListExpr = "#{javascript:@DbColumn(@DbName(), \"profiles\", 0) }";
            ValueBinding valueList = evaluator.createValueBinding(result, valueListExpr, sourceId,Object.class);
            result.setValueBinding("valueList", valueList);
            return result;
        }

        private UIComponent createEventHandler(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            ExecuteScriptAction action = new ExecuteScriptAction();
            action.setComponent(result);
            String sourceId = "friendName/xp:eventHandler[1]/xp:this.action[1]/xp:executeScript[1]/xp:this.script[1]/text()";
            MethodBinding script = evaluator.createMethodBinding(result,
                    "#{javascript:var value = @DbLookup(@DbName(), \"Profiles\", getComponent                (\"friendName\").getValue(), \"email\"); \n       var email = getComponent(\"friendEmail\"); \n       if(null != value){ \n               email.setValue(value); \n       } }",
                    null,null, sourceId);
            action.setScript(script);
            action.setSourceReferenceId("friendName/xp:eventHandler[1]/xp:this.action[1]/xp:executeScript[1]");
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onblur");
            result.setRefreshMode("complete");
            return result;
        }

        private UIComponent createTr12(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd22(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createLabel4(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue(_currentLocale[21]);
            setId(result, "label4");
            return result;
        }

        private UIComponent createTd23(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            result.setStyle("width:690.0px");
            return result;
        }

        private UIComponent createFriendemail(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspInputText result = new XspInputText();
            setId(result, "friendEmail");
            return result;
        }

        private UIComponent createTr13(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd24(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createTd25(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            result.setStyle("width:690.0px");
            return result;
        }

        private UIComponent createCmdfriendsbutton(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue(_currentLocale[22]);
            setId(result, "cmdfriendsButton");
            return result;
        }

        private UIComponent createEventHandler5(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            ExecuteScriptAction action = new ExecuteScriptAction();
            action.setComponent(result);
            String sourceId = "cmdfriendsButton/xp:eventHandler[1]/xp:this.action[1]/xp:executeScript[1]/xp:this.script[1]/text()";
            MethodBinding script = evaluator.createMethodBinding(result,
                    "#{javascript:var newFriendDoc = database.createDocument(); \nnewFriendDoc.appendItemValue(\"Form\", \"friend\"); \nnewFriendDoc.appendItemValue(\"FriendID\", document1.getNoteID()); \nnewFriendDoc.appendItemValue(\"Name\", getComponent(\"friendName\").getValue()); \nnewFriendDoc.appendItemValue(\"Email\", getComponent(\"friendEmail\").getValue()); \nnewFriendDoc.save(); \n\ngetComponent(\"friendName\").setValue(\"\"); \ngetComponent(\"friendEmail\").setValue(\"\");}",
                    null,null, sourceId);
            action.setScript(script);
            action.setSourceReferenceId("cmdfriendsButton/xp:eventHandler[1]/xp:this.action[1]/xp:executeScript[1]");
            result.setAction(action);
            result.setRefreshId("friendsTable");
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createTr14(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableRow result = new XspTableRow();
            return result;
        }

        private UIComponent createTd26(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            return result;
        }

        private UIComponent createTd27(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspTableCell result = new XspTableCell();
            result.setStyle("width:690.0px");
            return result;
        }

        private UIComponent createFriendscontainer(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPanelEx result = new UIPanelEx();
            setId(result, "friendsContainer");
            return result;
        }

        private UIComponent createFriendsrepeat(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDataIterator result = new XspDataIterator();
            String sourceId = "friendsRepeat/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:if(!document1.isNewNote()){ \n       var friendsView = database.getView(\"friends\"); \n       friendsView.refresh(); \n       return friendsView.getAllDocumentsByKey(document1.getNoteID        ()); \n       } }";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setVar("friend");
            result.setRows(30);
            setId(result, "friendsRepeat");
            return result;
        }

        private UIComponent createFriendspanel(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIPanelEx result = new UIPanelEx();
            setId(result, "friendsPanel");
            return result;
        }

        private UIComponent createComputedfield1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "computedField1/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:friend.getItemValueString(\"Name\")}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            setId(result, "computedField1");
            return result;
        }

        private UIComponent createLink1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLink result = new XspOutputLink();
            result.setEscape(true);
            setId(result, "link1");
            result.setText(_currentLocale[23]);
            return result;
        }

        private UIComponent createEventHandler6(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "link1/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:friendDocument.getDocument().removePermanently(true) }",
                    null,null, sourceId);
            result.setAction(action);
            result.setRefreshId("friendsTable");
            result.setSubmit(true);
            result.setEvent("onclick");
            MethodBinding script = evaluator.createMethodBinding(result,
                    "if (confirm(\u201cAre you sure to remove that friend?\\n(You always can talk about it)\u201d)) {\nreturn true;\n} else {\nreturn false\n} ",
                    null,null, null);
            result.setScript(script);
            result.setRefreshMode("partial");
            return result;
        }

        private UIComponent createBr2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createComputedfield2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputText result = new XspOutputText();
            String sourceId = "computedField2/xp:this.value[1]/text()";
            String valueExpr = "#{javascript:friend.getItemValueString(\"Email\")}";
            ValueBinding value = evaluator.createValueBinding(result, valueExpr, sourceId,Object.class);
            result.setValueBinding("value", value);
            result.setEscape(true);
            setId(result, "computedField2");
            return result;
        }

        public void init(PageParam param) {
            super.init(param);
            _currentLocale = s_localeStrs[param.getLocalizedStringsIndex()];
        }

    }
}
