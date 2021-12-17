package co7217.dsl.k8s.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co7217.dsl.k8s.services.DeploymentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDeploymentParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'container'", "'{'", "'name'", "','", "'image'", "'}'", "'memory'", "'cpu'", "'port'", "'protocol'", "'inport'", "'targetport'", "'TCP'", "'UDP'", "'HTTP'", "'HTTPS'", "'LoadBalancer'", "'NodePort'", "'ClusterIP'", "'---'", "'deployment'", "'namespace'", "'label'", "'replicas'", "'hpa'", "'target'", "'minimum'", "'maximum'", "'metrices'", "'service'", "'targetLabel'", "'targetName'", "'type'", "'IP'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDeploymentParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDeploymentParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDeploymentParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDeployment.g"; }



     	private DeploymentGrammarAccess grammarAccess;

        public InternalDeploymentParser(TokenStream input, DeploymentGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DeploymentGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDeployment.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDeployment.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDeployment.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDeployment.g:71:1: ruleModel returns [EObject current=null] : ( (lv_Headers_0_0= ruleHeader ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_Headers_0_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:77:2: ( ( (lv_Headers_0_0= ruleHeader ) )* )
            // InternalDeployment.g:78:2: ( (lv_Headers_0_0= ruleHeader ) )*
            {
            // InternalDeployment.g:78:2: ( (lv_Headers_0_0= ruleHeader ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDeployment.g:79:3: (lv_Headers_0_0= ruleHeader )
            	    {
            	    // InternalDeployment.g:79:3: (lv_Headers_0_0= ruleHeader )
            	    // InternalDeployment.g:80:4: lv_Headers_0_0= ruleHeader
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getHeadersHeaderParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_Headers_0_0=ruleHeader();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"Headers",
            	    					lv_Headers_0_0,
            	    					"co7217.dsl.k8s.Deployment.Header");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleHeader"
    // InternalDeployment.g:100:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalDeployment.g:100:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalDeployment.g:101:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalDeployment.g:107:1: ruleHeader returns [EObject current=null] : (this_Hpa_0= ruleHpa | this_Dep_1= ruleDep | this_Svc_2= ruleSvc ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        EObject this_Hpa_0 = null;

        EObject this_Dep_1 = null;

        EObject this_Svc_2 = null;



        	enterRule();

        try {
            // InternalDeployment.g:113:2: ( (this_Hpa_0= ruleHpa | this_Dep_1= ruleDep | this_Svc_2= ruleSvc ) )
            // InternalDeployment.g:114:2: (this_Hpa_0= ruleHpa | this_Dep_1= ruleDep | this_Svc_2= ruleSvc )
            {
            // InternalDeployment.g:114:2: (this_Hpa_0= ruleHpa | this_Dep_1= ruleDep | this_Svc_2= ruleSvc )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    alt2=1;
                    }
                    break;
                case 32:
                    {
                    alt2=2;
                    }
                    break;
                case 41:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDeployment.g:115:3: this_Hpa_0= ruleHpa
                    {

                    			newCompositeNode(grammarAccess.getHeaderAccess().getHpaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Hpa_0=ruleHpa();

                    state._fsp--;


                    			current = this_Hpa_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployment.g:124:3: this_Dep_1= ruleDep
                    {

                    			newCompositeNode(grammarAccess.getHeaderAccess().getDepParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dep_1=ruleDep();

                    state._fsp--;


                    			current = this_Dep_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDeployment.g:133:3: this_Svc_2= ruleSvc
                    {

                    			newCompositeNode(grammarAccess.getHeaderAccess().getSvcParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Svc_2=ruleSvc();

                    state._fsp--;


                    			current = this_Svc_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleLabel"
    // InternalDeployment.g:145:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalDeployment.g:145:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalDeployment.g:146:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalDeployment.g:152:1: ruleLabel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDeployment.g:158:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalDeployment.g:159:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalDeployment.g:159:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalDeployment.g:160:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalDeployment.g:160:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDeployment.g:161:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDeployment.g:161:4: (lv_name_0_0= RULE_ID )
            // InternalDeployment.g:162:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getEqualsSignKeyword_1());
            		
            // InternalDeployment.g:182:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalDeployment.g:183:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalDeployment.g:183:4: (lv_value_2_0= RULE_STRING )
            // InternalDeployment.g:184:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleContainer"
    // InternalDeployment.g:204:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalDeployment.g:204:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalDeployment.g:205:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalDeployment.g:211:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'image' otherlv_7= '=' ( (lv_Image_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_Name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_Image_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalDeployment.g:217:2: ( (otherlv_0= 'container' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'image' otherlv_7= '=' ( (lv_Image_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalDeployment.g:218:2: (otherlv_0= 'container' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'image' otherlv_7= '=' ( (lv_Image_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalDeployment.g:218:2: (otherlv_0= 'container' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'image' otherlv_7= '=' ( (lv_Image_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // InternalDeployment.g:219:3: otherlv_0= 'container' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'image' otherlv_7= '=' ( (lv_Image_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getEqualsSignKeyword_3());
            		
            // InternalDeployment.g:235:3: ( (lv_Name_4_0= RULE_STRING ) )
            // InternalDeployment.g:236:4: (lv_Name_4_0= RULE_STRING )
            {
            // InternalDeployment.g:236:4: (lv_Name_4_0= RULE_STRING )
            // InternalDeployment.g:237:5: lv_Name_4_0= RULE_STRING
            {
            lv_Name_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_Name_4_0, grammarAccess.getContainerAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getImageKeyword_6());
            		
            otherlv_7=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getContainerAccess().getEqualsSignKeyword_7());
            		
            // InternalDeployment.g:265:3: ( (lv_Image_8_0= RULE_STRING ) )
            // InternalDeployment.g:266:4: (lv_Image_8_0= RULE_STRING )
            {
            // InternalDeployment.g:266:4: (lv_Image_8_0= RULE_STRING )
            // InternalDeployment.g:267:5: lv_Image_8_0= RULE_STRING
            {
            lv_Image_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_Image_8_0, grammarAccess.getContainerAccess().getImageSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Image",
            						lv_Image_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleMetrice"
    // InternalDeployment.g:291:1: entryRuleMetrice returns [EObject current=null] : iv_ruleMetrice= ruleMetrice EOF ;
    public final EObject entryRuleMetrice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetrice = null;


        try {
            // InternalDeployment.g:291:48: (iv_ruleMetrice= ruleMetrice EOF )
            // InternalDeployment.g:292:2: iv_ruleMetrice= ruleMetrice EOF
            {
             newCompositeNode(grammarAccess.getMetriceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetrice=ruleMetrice();

            state._fsp--;

             current =iv_ruleMetrice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetrice"


    // $ANTLR start "ruleMetrice"
    // InternalDeployment.g:298:1: ruleMetrice returns [EObject current=null] : ( ( (lv_resource_0_0= ruleResource ) ) otherlv_1= '=' ( (lv_limit_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMetrice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_limit_2_0=null;
        AntlrDatatypeRuleToken lv_resource_0_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:304:2: ( ( ( (lv_resource_0_0= ruleResource ) ) otherlv_1= '=' ( (lv_limit_2_0= RULE_INT ) ) ) )
            // InternalDeployment.g:305:2: ( ( (lv_resource_0_0= ruleResource ) ) otherlv_1= '=' ( (lv_limit_2_0= RULE_INT ) ) )
            {
            // InternalDeployment.g:305:2: ( ( (lv_resource_0_0= ruleResource ) ) otherlv_1= '=' ( (lv_limit_2_0= RULE_INT ) ) )
            // InternalDeployment.g:306:3: ( (lv_resource_0_0= ruleResource ) ) otherlv_1= '=' ( (lv_limit_2_0= RULE_INT ) )
            {
            // InternalDeployment.g:306:3: ( (lv_resource_0_0= ruleResource ) )
            // InternalDeployment.g:307:4: (lv_resource_0_0= ruleResource )
            {
            // InternalDeployment.g:307:4: (lv_resource_0_0= ruleResource )
            // InternalDeployment.g:308:5: lv_resource_0_0= ruleResource
            {

            					newCompositeNode(grammarAccess.getMetriceAccess().getResourceResourceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_resource_0_0=ruleResource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetriceRule());
            					}
            					set(
            						current,
            						"resource",
            						lv_resource_0_0,
            						"co7217.dsl.k8s.Deployment.Resource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMetriceAccess().getEqualsSignKeyword_1());
            		
            // InternalDeployment.g:329:3: ( (lv_limit_2_0= RULE_INT ) )
            // InternalDeployment.g:330:4: (lv_limit_2_0= RULE_INT )
            {
            // InternalDeployment.g:330:4: (lv_limit_2_0= RULE_INT )
            // InternalDeployment.g:331:5: lv_limit_2_0= RULE_INT
            {
            lv_limit_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_limit_2_0, grammarAccess.getMetriceAccess().getLimitINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetriceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"limit",
            						lv_limit_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetrice"


    // $ANTLR start "entryRuleResource"
    // InternalDeployment.g:351:1: entryRuleResource returns [String current=null] : iv_ruleResource= ruleResource EOF ;
    public final String entryRuleResource() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResource = null;


        try {
            // InternalDeployment.g:351:48: (iv_ruleResource= ruleResource EOF )
            // InternalDeployment.g:352:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalDeployment.g:358:1: ruleResource returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'memory' | kw= 'cpu' ) ;
    public final AntlrDatatypeRuleToken ruleResource() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDeployment.g:364:2: ( (kw= 'memory' | kw= 'cpu' ) )
            // InternalDeployment.g:365:2: (kw= 'memory' | kw= 'cpu' )
            {
            // InternalDeployment.g:365:2: (kw= 'memory' | kw= 'cpu' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDeployment.g:366:3: kw= 'memory'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getResourceAccess().getMemoryKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployment.g:372:3: kw= 'cpu'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getResourceAccess().getCpuKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRulePort"
    // InternalDeployment.g:381:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalDeployment.g:381:45: (iv_rulePort= rulePort EOF )
            // InternalDeployment.g:382:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalDeployment.g:388:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'protocol' otherlv_7= '=' ( (lv_Protocol_8_0= ruleProtocol ) ) otherlv_9= ',' otherlv_10= 'inport' otherlv_11= '=' ( (lv_inport_12_0= RULE_INT ) ) otherlv_13= ',' otherlv_14= 'targetport' otherlv_15= '=' ( (lv_targetport_16_0= RULE_INT ) ) otherlv_17= '}' ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_Name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_inport_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_targetport_16_0=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_Protocol_8_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:394:2: ( (otherlv_0= 'port' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'protocol' otherlv_7= '=' ( (lv_Protocol_8_0= ruleProtocol ) ) otherlv_9= ',' otherlv_10= 'inport' otherlv_11= '=' ( (lv_inport_12_0= RULE_INT ) ) otherlv_13= ',' otherlv_14= 'targetport' otherlv_15= '=' ( (lv_targetport_16_0= RULE_INT ) ) otherlv_17= '}' ) )
            // InternalDeployment.g:395:2: (otherlv_0= 'port' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'protocol' otherlv_7= '=' ( (lv_Protocol_8_0= ruleProtocol ) ) otherlv_9= ',' otherlv_10= 'inport' otherlv_11= '=' ( (lv_inport_12_0= RULE_INT ) ) otherlv_13= ',' otherlv_14= 'targetport' otherlv_15= '=' ( (lv_targetport_16_0= RULE_INT ) ) otherlv_17= '}' )
            {
            // InternalDeployment.g:395:2: (otherlv_0= 'port' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'protocol' otherlv_7= '=' ( (lv_Protocol_8_0= ruleProtocol ) ) otherlv_9= ',' otherlv_10= 'inport' otherlv_11= '=' ( (lv_inport_12_0= RULE_INT ) ) otherlv_13= ',' otherlv_14= 'targetport' otherlv_15= '=' ( (lv_targetport_16_0= RULE_INT ) ) otherlv_17= '}' )
            // InternalDeployment.g:396:3: otherlv_0= 'port' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'protocol' otherlv_7= '=' ( (lv_Protocol_8_0= ruleProtocol ) ) otherlv_9= ',' otherlv_10= 'inport' otherlv_11= '=' ( (lv_inport_12_0= RULE_INT ) ) otherlv_13= ',' otherlv_14= 'targetport' otherlv_15= '=' ( (lv_targetport_16_0= RULE_INT ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPortAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPortAccess().getEqualsSignKeyword_3());
            		
            // InternalDeployment.g:412:3: ( (lv_Name_4_0= RULE_STRING ) )
            // InternalDeployment.g:413:4: (lv_Name_4_0= RULE_STRING )
            {
            // InternalDeployment.g:413:4: (lv_Name_4_0= RULE_STRING )
            // InternalDeployment.g:414:5: lv_Name_4_0= RULE_STRING
            {
            lv_Name_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_Name_4_0, grammarAccess.getPortAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getPortAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getPortAccess().getProtocolKeyword_6());
            		
            otherlv_7=(Token)match(input,11,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getPortAccess().getEqualsSignKeyword_7());
            		
            // InternalDeployment.g:442:3: ( (lv_Protocol_8_0= ruleProtocol ) )
            // InternalDeployment.g:443:4: (lv_Protocol_8_0= ruleProtocol )
            {
            // InternalDeployment.g:443:4: (lv_Protocol_8_0= ruleProtocol )
            // InternalDeployment.g:444:5: lv_Protocol_8_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getPortAccess().getProtocolProtocolParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_8);
            lv_Protocol_8_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"Protocol",
            						lv_Protocol_8_0,
            						"co7217.dsl.k8s.Deployment.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getPortAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getPortAccess().getInportKeyword_10());
            		
            otherlv_11=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getPortAccess().getEqualsSignKeyword_11());
            		
            // InternalDeployment.g:473:3: ( (lv_inport_12_0= RULE_INT ) )
            // InternalDeployment.g:474:4: (lv_inport_12_0= RULE_INT )
            {
            // InternalDeployment.g:474:4: (lv_inport_12_0= RULE_INT )
            // InternalDeployment.g:475:5: lv_inport_12_0= RULE_INT
            {
            lv_inport_12_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_inport_12_0, grammarAccess.getPortAccess().getInportINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inport",
            						lv_inport_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_13, grammarAccess.getPortAccess().getCommaKeyword_13());
            		
            otherlv_14=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getPortAccess().getTargetportKeyword_14());
            		
            otherlv_15=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getPortAccess().getEqualsSignKeyword_15());
            		
            // InternalDeployment.g:503:3: ( (lv_targetport_16_0= RULE_INT ) )
            // InternalDeployment.g:504:4: (lv_targetport_16_0= RULE_INT )
            {
            // InternalDeployment.g:504:4: (lv_targetport_16_0= RULE_INT )
            // InternalDeployment.g:505:5: lv_targetport_16_0= RULE_INT
            {
            lv_targetport_16_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_targetport_16_0, grammarAccess.getPortAccess().getTargetportINTTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"targetport",
            						lv_targetport_16_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getPortAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleProtocol"
    // InternalDeployment.g:529:1: entryRuleProtocol returns [String current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final String entryRuleProtocol() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProtocol = null;


        try {
            // InternalDeployment.g:529:48: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalDeployment.g:530:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalDeployment.g:536:1: ruleProtocol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TCP' | kw= 'UDP' | kw= 'HTTP' | kw= 'HTTPS' ) ;
    public final AntlrDatatypeRuleToken ruleProtocol() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDeployment.g:542:2: ( (kw= 'TCP' | kw= 'UDP' | kw= 'HTTP' | kw= 'HTTPS' ) )
            // InternalDeployment.g:543:2: (kw= 'TCP' | kw= 'UDP' | kw= 'HTTP' | kw= 'HTTPS' )
            {
            // InternalDeployment.g:543:2: (kw= 'TCP' | kw= 'UDP' | kw= 'HTTP' | kw= 'HTTPS' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 27:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDeployment.g:544:3: kw= 'TCP'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getProtocolAccess().getTCPKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployment.g:550:3: kw= 'UDP'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getProtocolAccess().getUDPKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDeployment.g:556:3: kw= 'HTTP'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getProtocolAccess().getHTTPKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDeployment.g:562:3: kw= 'HTTPS'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getProtocolAccess().getHTTPSKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleType"
    // InternalDeployment.g:571:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalDeployment.g:571:44: (iv_ruleType= ruleType EOF )
            // InternalDeployment.g:572:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDeployment.g:578:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'LoadBalancer' | kw= 'NodePort' | kw= 'ClusterIP' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDeployment.g:584:2: ( (kw= 'LoadBalancer' | kw= 'NodePort' | kw= 'ClusterIP' ) )
            // InternalDeployment.g:585:2: (kw= 'LoadBalancer' | kw= 'NodePort' | kw= 'ClusterIP' )
            {
            // InternalDeployment.g:585:2: (kw= 'LoadBalancer' | kw= 'NodePort' | kw= 'ClusterIP' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 30:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDeployment.g:586:3: kw= 'LoadBalancer'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getLoadBalancerKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployment.g:592:3: kw= 'NodePort'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getNodePortKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDeployment.g:598:3: kw= 'ClusterIP'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getClusterIPKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDep"
    // InternalDeployment.g:607:1: entryRuleDep returns [EObject current=null] : iv_ruleDep= ruleDep EOF ;
    public final EObject entryRuleDep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDep = null;


        try {
            // InternalDeployment.g:607:44: (iv_ruleDep= ruleDep EOF )
            // InternalDeployment.g:608:2: iv_ruleDep= ruleDep EOF
            {
             newCompositeNode(grammarAccess.getDepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDep=ruleDep();

            state._fsp--;

             current =iv_ruleDep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDep"


    // $ANTLR start "ruleDep"
    // InternalDeployment.g:614:1: ruleDep returns [EObject current=null] : (otherlv_0= '---' otherlv_1= 'deployment' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'replicas' otherlv_20= '=' ( (lv_Replicas_21_0= RULE_INT ) ) otherlv_22= ',' ( (lv_Containers_23_0= ruleContainer ) ) (otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) ) )* otherlv_26= '}' ) ;
    public final EObject ruleDep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_Name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_Namespace_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_Replicas_21_0=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        EObject lv_Labels_14_0 = null;

        EObject lv_Labels_16_0 = null;

        EObject lv_Containers_23_0 = null;

        EObject lv_Containers_25_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:620:2: ( (otherlv_0= '---' otherlv_1= 'deployment' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'replicas' otherlv_20= '=' ( (lv_Replicas_21_0= RULE_INT ) ) otherlv_22= ',' ( (lv_Containers_23_0= ruleContainer ) ) (otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) ) )* otherlv_26= '}' ) )
            // InternalDeployment.g:621:2: (otherlv_0= '---' otherlv_1= 'deployment' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'replicas' otherlv_20= '=' ( (lv_Replicas_21_0= RULE_INT ) ) otherlv_22= ',' ( (lv_Containers_23_0= ruleContainer ) ) (otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) ) )* otherlv_26= '}' )
            {
            // InternalDeployment.g:621:2: (otherlv_0= '---' otherlv_1= 'deployment' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'replicas' otherlv_20= '=' ( (lv_Replicas_21_0= RULE_INT ) ) otherlv_22= ',' ( (lv_Containers_23_0= ruleContainer ) ) (otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) ) )* otherlv_26= '}' )
            // InternalDeployment.g:622:3: otherlv_0= '---' otherlv_1= 'deployment' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'replicas' otherlv_20= '=' ( (lv_Replicas_21_0= RULE_INT ) ) otherlv_22= ',' ( (lv_Containers_23_0= ruleContainer ) ) (otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) ) )* otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDepAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDepAccess().getDeploymentKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDepAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDepAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getDepAccess().getEqualsSignKeyword_5());
            		
            // InternalDeployment.g:646:3: ( (lv_Name_6_0= RULE_STRING ) )
            // InternalDeployment.g:647:4: (lv_Name_6_0= RULE_STRING )
            {
            // InternalDeployment.g:647:4: (lv_Name_6_0= RULE_STRING )
            // InternalDeployment.g:648:5: lv_Name_6_0= RULE_STRING
            {
            lv_Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_Name_6_0, grammarAccess.getDepAccess().getNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getDepAccess().getCommaKeyword_7());
            		
            // InternalDeployment.g:668:3: (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDeployment.g:669:4: otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ','
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getDepAccess().getNamespaceKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getDepAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalDeployment.g:677:4: ( (lv_Namespace_10_0= RULE_STRING ) )
                    // InternalDeployment.g:678:5: (lv_Namespace_10_0= RULE_STRING )
                    {
                    // InternalDeployment.g:678:5: (lv_Namespace_10_0= RULE_STRING )
                    // InternalDeployment.g:679:6: lv_Namespace_10_0= RULE_STRING
                    {
                    lv_Namespace_10_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_Namespace_10_0, grammarAccess.getDepAccess().getNamespaceSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDepRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Namespace",
                    							lv_Namespace_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getDepAccess().getCommaKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getDepAccess().getLabelKeyword_9());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_13, grammarAccess.getDepAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalDeployment.g:708:3: ( (lv_Labels_14_0= ruleLabel ) )
            // InternalDeployment.g:709:4: (lv_Labels_14_0= ruleLabel )
            {
            // InternalDeployment.g:709:4: (lv_Labels_14_0= ruleLabel )
            // InternalDeployment.g:710:5: lv_Labels_14_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getDepAccess().getLabelsLabelParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_21);
            lv_Labels_14_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDepRule());
            					}
            					add(
            						current,
            						"Labels",
            						lv_Labels_14_0,
            						"co7217.dsl.k8s.Deployment.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployment.g:727:3: (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDeployment.g:728:4: otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) )
            	    {
            	    otherlv_15=(Token)match(input,15,FOLLOW_20); 

            	    				newLeafNode(otherlv_15, grammarAccess.getDepAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalDeployment.g:732:4: ( (lv_Labels_16_0= ruleLabel ) )
            	    // InternalDeployment.g:733:5: (lv_Labels_16_0= ruleLabel )
            	    {
            	    // InternalDeployment.g:733:5: (lv_Labels_16_0= ruleLabel )
            	    // InternalDeployment.g:734:6: lv_Labels_16_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getDepAccess().getLabelsLabelParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_Labels_16_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Labels",
            	    							lv_Labels_16_0,
            	    							"co7217.dsl.k8s.Deployment.Label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_17=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_17, grammarAccess.getDepAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_18=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_18, grammarAccess.getDepAccess().getCommaKeyword_14());
            		
            otherlv_19=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getDepAccess().getReplicasKeyword_15());
            		
            otherlv_20=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_20, grammarAccess.getDepAccess().getEqualsSignKeyword_16());
            		
            // InternalDeployment.g:768:3: ( (lv_Replicas_21_0= RULE_INT ) )
            // InternalDeployment.g:769:4: (lv_Replicas_21_0= RULE_INT )
            {
            // InternalDeployment.g:769:4: (lv_Replicas_21_0= RULE_INT )
            // InternalDeployment.g:770:5: lv_Replicas_21_0= RULE_INT
            {
            lv_Replicas_21_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_Replicas_21_0, grammarAccess.getDepAccess().getReplicasINTTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Replicas",
            						lv_Replicas_21_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_22=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_22, grammarAccess.getDepAccess().getCommaKeyword_18());
            		
            // InternalDeployment.g:790:3: ( (lv_Containers_23_0= ruleContainer ) )
            // InternalDeployment.g:791:4: (lv_Containers_23_0= ruleContainer )
            {
            // InternalDeployment.g:791:4: (lv_Containers_23_0= ruleContainer )
            // InternalDeployment.g:792:5: lv_Containers_23_0= ruleContainer
            {

            					newCompositeNode(grammarAccess.getDepAccess().getContainersContainerParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_21);
            lv_Containers_23_0=ruleContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDepRule());
            					}
            					add(
            						current,
            						"Containers",
            						lv_Containers_23_0,
            						"co7217.dsl.k8s.Deployment.Container");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployment.g:809:3: (otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDeployment.g:810:4: otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) )
            	    {
            	    otherlv_24=(Token)match(input,15,FOLLOW_23); 

            	    				newLeafNode(otherlv_24, grammarAccess.getDepAccess().getCommaKeyword_20_0());
            	    			
            	    // InternalDeployment.g:814:4: ( (lv_Containers_25_0= ruleContainer ) )
            	    // InternalDeployment.g:815:5: (lv_Containers_25_0= ruleContainer )
            	    {
            	    // InternalDeployment.g:815:5: (lv_Containers_25_0= ruleContainer )
            	    // InternalDeployment.g:816:6: lv_Containers_25_0= ruleContainer
            	    {

            	    						newCompositeNode(grammarAccess.getDepAccess().getContainersContainerParserRuleCall_20_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_Containers_25_0=ruleContainer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDepRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Containers",
            	    							lv_Containers_25_0,
            	    							"co7217.dsl.k8s.Deployment.Container");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_26=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getDepAccess().getRightCurlyBracketKeyword_21());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDep"


    // $ANTLR start "entryRuleHpa"
    // InternalDeployment.g:842:1: entryRuleHpa returns [EObject current=null] : iv_ruleHpa= ruleHpa EOF ;
    public final EObject entryRuleHpa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHpa = null;


        try {
            // InternalDeployment.g:842:44: (iv_ruleHpa= ruleHpa EOF )
            // InternalDeployment.g:843:2: iv_ruleHpa= ruleHpa EOF
            {
             newCompositeNode(grammarAccess.getHpaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHpa=ruleHpa();

            state._fsp--;

             current =iv_ruleHpa; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHpa"


    // $ANTLR start "ruleHpa"
    // InternalDeployment.g:849:1: ruleHpa returns [EObject current=null] : (otherlv_0= '---' otherlv_1= 'hpa' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'target' otherlv_20= '=' ( (lv_Target_21_0= RULE_STRING ) ) otherlv_22= ',' otherlv_23= 'minimum' otherlv_24= '=' ( (lv_Minimum_25_0= RULE_INT ) ) otherlv_26= ',' otherlv_27= 'maximum' otherlv_28= '=' ( (lv_Maximum_29_0= RULE_INT ) ) otherlv_30= ',' otherlv_31= 'metrices' otherlv_32= '{' ( (lv_Metrices_33_0= ruleMetrice ) ) (otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) ) )? otherlv_36= '}' otherlv_37= '}' ) ;
    public final EObject ruleHpa() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_Name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_Namespace_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_Target_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_Minimum_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_Maximum_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        EObject lv_Labels_14_0 = null;

        EObject lv_Labels_16_0 = null;

        EObject lv_Metrices_33_0 = null;

        EObject lv_Metrices_35_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:855:2: ( (otherlv_0= '---' otherlv_1= 'hpa' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'target' otherlv_20= '=' ( (lv_Target_21_0= RULE_STRING ) ) otherlv_22= ',' otherlv_23= 'minimum' otherlv_24= '=' ( (lv_Minimum_25_0= RULE_INT ) ) otherlv_26= ',' otherlv_27= 'maximum' otherlv_28= '=' ( (lv_Maximum_29_0= RULE_INT ) ) otherlv_30= ',' otherlv_31= 'metrices' otherlv_32= '{' ( (lv_Metrices_33_0= ruleMetrice ) ) (otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) ) )? otherlv_36= '}' otherlv_37= '}' ) )
            // InternalDeployment.g:856:2: (otherlv_0= '---' otherlv_1= 'hpa' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'target' otherlv_20= '=' ( (lv_Target_21_0= RULE_STRING ) ) otherlv_22= ',' otherlv_23= 'minimum' otherlv_24= '=' ( (lv_Minimum_25_0= RULE_INT ) ) otherlv_26= ',' otherlv_27= 'maximum' otherlv_28= '=' ( (lv_Maximum_29_0= RULE_INT ) ) otherlv_30= ',' otherlv_31= 'metrices' otherlv_32= '{' ( (lv_Metrices_33_0= ruleMetrice ) ) (otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) ) )? otherlv_36= '}' otherlv_37= '}' )
            {
            // InternalDeployment.g:856:2: (otherlv_0= '---' otherlv_1= 'hpa' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'target' otherlv_20= '=' ( (lv_Target_21_0= RULE_STRING ) ) otherlv_22= ',' otherlv_23= 'minimum' otherlv_24= '=' ( (lv_Minimum_25_0= RULE_INT ) ) otherlv_26= ',' otherlv_27= 'maximum' otherlv_28= '=' ( (lv_Maximum_29_0= RULE_INT ) ) otherlv_30= ',' otherlv_31= 'metrices' otherlv_32= '{' ( (lv_Metrices_33_0= ruleMetrice ) ) (otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) ) )? otherlv_36= '}' otherlv_37= '}' )
            // InternalDeployment.g:857:3: otherlv_0= '---' otherlv_1= 'hpa' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'target' otherlv_20= '=' ( (lv_Target_21_0= RULE_STRING ) ) otherlv_22= ',' otherlv_23= 'minimum' otherlv_24= '=' ( (lv_Minimum_25_0= RULE_INT ) ) otherlv_26= ',' otherlv_27= 'maximum' otherlv_28= '=' ( (lv_Maximum_29_0= RULE_INT ) ) otherlv_30= ',' otherlv_31= 'metrices' otherlv_32= '{' ( (lv_Metrices_33_0= ruleMetrice ) ) (otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) ) )? otherlv_36= '}' otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getHpaAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getHpaAccess().getHpaKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getHpaAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getHpaAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getHpaAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getHpaAccess().getEqualsSignKeyword_5());
            		
            // InternalDeployment.g:881:3: ( (lv_Name_6_0= RULE_STRING ) )
            // InternalDeployment.g:882:4: (lv_Name_6_0= RULE_STRING )
            {
            // InternalDeployment.g:882:4: (lv_Name_6_0= RULE_STRING )
            // InternalDeployment.g:883:5: lv_Name_6_0= RULE_STRING
            {
            lv_Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_Name_6_0, grammarAccess.getHpaAccess().getNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHpaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getHpaAccess().getCommaKeyword_7());
            		
            // InternalDeployment.g:903:3: (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeployment.g:904:4: otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ','
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getHpaAccess().getNamespaceKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getHpaAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalDeployment.g:912:4: ( (lv_Namespace_10_0= RULE_STRING ) )
                    // InternalDeployment.g:913:5: (lv_Namespace_10_0= RULE_STRING )
                    {
                    // InternalDeployment.g:913:5: (lv_Namespace_10_0= RULE_STRING )
                    // InternalDeployment.g:914:6: lv_Namespace_10_0= RULE_STRING
                    {
                    lv_Namespace_10_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_Namespace_10_0, grammarAccess.getHpaAccess().getNamespaceSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHpaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Namespace",
                    							lv_Namespace_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getHpaAccess().getCommaKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getHpaAccess().getLabelKeyword_9());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_13, grammarAccess.getHpaAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalDeployment.g:943:3: ( (lv_Labels_14_0= ruleLabel ) )
            // InternalDeployment.g:944:4: (lv_Labels_14_0= ruleLabel )
            {
            // InternalDeployment.g:944:4: (lv_Labels_14_0= ruleLabel )
            // InternalDeployment.g:945:5: lv_Labels_14_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getHpaAccess().getLabelsLabelParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_21);
            lv_Labels_14_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHpaRule());
            					}
            					add(
            						current,
            						"Labels",
            						lv_Labels_14_0,
            						"co7217.dsl.k8s.Deployment.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployment.g:962:3: (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDeployment.g:963:4: otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) )
            	    {
            	    otherlv_15=(Token)match(input,15,FOLLOW_20); 

            	    				newLeafNode(otherlv_15, grammarAccess.getHpaAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalDeployment.g:967:4: ( (lv_Labels_16_0= ruleLabel ) )
            	    // InternalDeployment.g:968:5: (lv_Labels_16_0= ruleLabel )
            	    {
            	    // InternalDeployment.g:968:5: (lv_Labels_16_0= ruleLabel )
            	    // InternalDeployment.g:969:6: lv_Labels_16_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getHpaAccess().getLabelsLabelParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_Labels_16_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHpaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Labels",
            	    							lv_Labels_16_0,
            	    							"co7217.dsl.k8s.Deployment.Label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_17=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_17, grammarAccess.getHpaAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_18=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_18, grammarAccess.getHpaAccess().getCommaKeyword_14());
            		
            otherlv_19=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getHpaAccess().getTargetKeyword_15());
            		
            otherlv_20=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_20, grammarAccess.getHpaAccess().getEqualsSignKeyword_16());
            		
            // InternalDeployment.g:1003:3: ( (lv_Target_21_0= RULE_STRING ) )
            // InternalDeployment.g:1004:4: (lv_Target_21_0= RULE_STRING )
            {
            // InternalDeployment.g:1004:4: (lv_Target_21_0= RULE_STRING )
            // InternalDeployment.g:1005:5: lv_Target_21_0= RULE_STRING
            {
            lv_Target_21_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_Target_21_0, grammarAccess.getHpaAccess().getTargetSTRINGTerminalRuleCall_17_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHpaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Target",
            						lv_Target_21_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_22=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_22, grammarAccess.getHpaAccess().getCommaKeyword_18());
            		
            otherlv_23=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_23, grammarAccess.getHpaAccess().getMinimumKeyword_19());
            		
            otherlv_24=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_24, grammarAccess.getHpaAccess().getEqualsSignKeyword_20());
            		
            // InternalDeployment.g:1033:3: ( (lv_Minimum_25_0= RULE_INT ) )
            // InternalDeployment.g:1034:4: (lv_Minimum_25_0= RULE_INT )
            {
            // InternalDeployment.g:1034:4: (lv_Minimum_25_0= RULE_INT )
            // InternalDeployment.g:1035:5: lv_Minimum_25_0= RULE_INT
            {
            lv_Minimum_25_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_Minimum_25_0, grammarAccess.getHpaAccess().getMinimumINTTerminalRuleCall_21_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHpaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Minimum",
            						lv_Minimum_25_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_26=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_26, grammarAccess.getHpaAccess().getCommaKeyword_22());
            		
            otherlv_27=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_27, grammarAccess.getHpaAccess().getMaximumKeyword_23());
            		
            otherlv_28=(Token)match(input,11,FOLLOW_11); 

            			newLeafNode(otherlv_28, grammarAccess.getHpaAccess().getEqualsSignKeyword_24());
            		
            // InternalDeployment.g:1063:3: ( (lv_Maximum_29_0= RULE_INT ) )
            // InternalDeployment.g:1064:4: (lv_Maximum_29_0= RULE_INT )
            {
            // InternalDeployment.g:1064:4: (lv_Maximum_29_0= RULE_INT )
            // InternalDeployment.g:1065:5: lv_Maximum_29_0= RULE_INT
            {
            lv_Maximum_29_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_Maximum_29_0, grammarAccess.getHpaAccess().getMaximumINTTerminalRuleCall_25_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHpaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Maximum",
            						lv_Maximum_29_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_30=(Token)match(input,15,FOLLOW_28); 

            			newLeafNode(otherlv_30, grammarAccess.getHpaAccess().getCommaKeyword_26());
            		
            otherlv_31=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_31, grammarAccess.getHpaAccess().getMetricesKeyword_27());
            		
            otherlv_32=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_32, grammarAccess.getHpaAccess().getLeftCurlyBracketKeyword_28());
            		
            // InternalDeployment.g:1093:3: ( (lv_Metrices_33_0= ruleMetrice ) )
            // InternalDeployment.g:1094:4: (lv_Metrices_33_0= ruleMetrice )
            {
            // InternalDeployment.g:1094:4: (lv_Metrices_33_0= ruleMetrice )
            // InternalDeployment.g:1095:5: lv_Metrices_33_0= ruleMetrice
            {

            					newCompositeNode(grammarAccess.getHpaAccess().getMetricesMetriceParserRuleCall_29_0());
            				
            pushFollow(FOLLOW_21);
            lv_Metrices_33_0=ruleMetrice();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHpaRule());
            					}
            					add(
            						current,
            						"Metrices",
            						lv_Metrices_33_0,
            						"co7217.dsl.k8s.Deployment.Metrice");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployment.g:1112:3: (otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDeployment.g:1113:4: otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) )
                    {
                    otherlv_34=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_34, grammarAccess.getHpaAccess().getCommaKeyword_30_0());
                    			
                    // InternalDeployment.g:1117:4: ( (lv_Metrices_35_0= ruleMetrice ) )
                    // InternalDeployment.g:1118:5: (lv_Metrices_35_0= ruleMetrice )
                    {
                    // InternalDeployment.g:1118:5: (lv_Metrices_35_0= ruleMetrice )
                    // InternalDeployment.g:1119:6: lv_Metrices_35_0= ruleMetrice
                    {

                    						newCompositeNode(grammarAccess.getHpaAccess().getMetricesMetriceParserRuleCall_30_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_Metrices_35_0=ruleMetrice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHpaRule());
                    						}
                    						add(
                    							current,
                    							"Metrices",
                    							lv_Metrices_35_0,
                    							"co7217.dsl.k8s.Deployment.Metrice");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_36=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_36, grammarAccess.getHpaAccess().getRightCurlyBracketKeyword_31());
            		
            otherlv_37=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getHpaAccess().getRightCurlyBracketKeyword_32());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHpa"


    // $ANTLR start "entryRuleSvc"
    // InternalDeployment.g:1149:1: entryRuleSvc returns [EObject current=null] : iv_ruleSvc= ruleSvc EOF ;
    public final EObject entryRuleSvc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSvc = null;


        try {
            // InternalDeployment.g:1149:44: (iv_ruleSvc= ruleSvc EOF )
            // InternalDeployment.g:1150:2: iv_ruleSvc= ruleSvc EOF
            {
             newCompositeNode(grammarAccess.getSvcRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSvc=ruleSvc();

            state._fsp--;

             current =iv_ruleSvc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSvc"


    // $ANTLR start "ruleSvc"
    // InternalDeployment.g:1156:1: ruleSvc returns [EObject current=null] : (otherlv_0= '---' otherlv_1= 'service' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' ( ( (lv_Ports_19_0= rulePort ) ) otherlv_20= ',' )+ otherlv_21= 'targetLabel' otherlv_22= '=' ( (lv_TargetLabel_23_0= RULE_STRING ) ) otherlv_24= ',' otherlv_25= 'targetName' otherlv_26= '=' ( (lv_TargetName_27_0= RULE_STRING ) ) otherlv_28= ',' otherlv_29= 'type' otherlv_30= '=' ( (lv_Type_31_0= ruleType ) ) (otherlv_32= ',' otherlv_33= 'IP' otherlv_34= '=' ( (lv_IP_35_0= RULE_STRING ) ) )? otherlv_36= '}' ) ;
    public final EObject ruleSvc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_Name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_Namespace_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_TargetLabel_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_TargetName_27_0=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token lv_IP_35_0=null;
        Token otherlv_36=null;
        EObject lv_Labels_14_0 = null;

        EObject lv_Labels_16_0 = null;

        EObject lv_Ports_19_0 = null;

        AntlrDatatypeRuleToken lv_Type_31_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:1162:2: ( (otherlv_0= '---' otherlv_1= 'service' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' ( ( (lv_Ports_19_0= rulePort ) ) otherlv_20= ',' )+ otherlv_21= 'targetLabel' otherlv_22= '=' ( (lv_TargetLabel_23_0= RULE_STRING ) ) otherlv_24= ',' otherlv_25= 'targetName' otherlv_26= '=' ( (lv_TargetName_27_0= RULE_STRING ) ) otherlv_28= ',' otherlv_29= 'type' otherlv_30= '=' ( (lv_Type_31_0= ruleType ) ) (otherlv_32= ',' otherlv_33= 'IP' otherlv_34= '=' ( (lv_IP_35_0= RULE_STRING ) ) )? otherlv_36= '}' ) )
            // InternalDeployment.g:1163:2: (otherlv_0= '---' otherlv_1= 'service' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' ( ( (lv_Ports_19_0= rulePort ) ) otherlv_20= ',' )+ otherlv_21= 'targetLabel' otherlv_22= '=' ( (lv_TargetLabel_23_0= RULE_STRING ) ) otherlv_24= ',' otherlv_25= 'targetName' otherlv_26= '=' ( (lv_TargetName_27_0= RULE_STRING ) ) otherlv_28= ',' otherlv_29= 'type' otherlv_30= '=' ( (lv_Type_31_0= ruleType ) ) (otherlv_32= ',' otherlv_33= 'IP' otherlv_34= '=' ( (lv_IP_35_0= RULE_STRING ) ) )? otherlv_36= '}' )
            {
            // InternalDeployment.g:1163:2: (otherlv_0= '---' otherlv_1= 'service' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' ( ( (lv_Ports_19_0= rulePort ) ) otherlv_20= ',' )+ otherlv_21= 'targetLabel' otherlv_22= '=' ( (lv_TargetLabel_23_0= RULE_STRING ) ) otherlv_24= ',' otherlv_25= 'targetName' otherlv_26= '=' ( (lv_TargetName_27_0= RULE_STRING ) ) otherlv_28= ',' otherlv_29= 'type' otherlv_30= '=' ( (lv_Type_31_0= ruleType ) ) (otherlv_32= ',' otherlv_33= 'IP' otherlv_34= '=' ( (lv_IP_35_0= RULE_STRING ) ) )? otherlv_36= '}' )
            // InternalDeployment.g:1164:3: otherlv_0= '---' otherlv_1= 'service' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' ( ( (lv_Ports_19_0= rulePort ) ) otherlv_20= ',' )+ otherlv_21= 'targetLabel' otherlv_22= '=' ( (lv_TargetLabel_23_0= RULE_STRING ) ) otherlv_24= ',' otherlv_25= 'targetName' otherlv_26= '=' ( (lv_TargetName_27_0= RULE_STRING ) ) otherlv_28= ',' otherlv_29= 'type' otherlv_30= '=' ( (lv_Type_31_0= ruleType ) ) (otherlv_32= ',' otherlv_33= 'IP' otherlv_34= '=' ( (lv_IP_35_0= RULE_STRING ) ) )? otherlv_36= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getSvcAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSvcAccess().getServiceKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSvcAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSvcAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getSvcAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSvcAccess().getEqualsSignKeyword_5());
            		
            // InternalDeployment.g:1188:3: ( (lv_Name_6_0= RULE_STRING ) )
            // InternalDeployment.g:1189:4: (lv_Name_6_0= RULE_STRING )
            {
            // InternalDeployment.g:1189:4: (lv_Name_6_0= RULE_STRING )
            // InternalDeployment.g:1190:5: lv_Name_6_0= RULE_STRING
            {
            lv_Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_Name_6_0, grammarAccess.getSvcAccess().getNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSvcRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Name",
            						lv_Name_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getSvcAccess().getCommaKeyword_7());
            		
            // InternalDeployment.g:1210:3: (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDeployment.g:1211:4: otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ','
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getSvcAccess().getNamespaceKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getSvcAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalDeployment.g:1219:4: ( (lv_Namespace_10_0= RULE_STRING ) )
                    // InternalDeployment.g:1220:5: (lv_Namespace_10_0= RULE_STRING )
                    {
                    // InternalDeployment.g:1220:5: (lv_Namespace_10_0= RULE_STRING )
                    // InternalDeployment.g:1221:6: lv_Namespace_10_0= RULE_STRING
                    {
                    lv_Namespace_10_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_Namespace_10_0, grammarAccess.getSvcAccess().getNamespaceSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSvcRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Namespace",
                    							lv_Namespace_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getSvcAccess().getCommaKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getSvcAccess().getLabelKeyword_9());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_13, grammarAccess.getSvcAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalDeployment.g:1250:3: ( (lv_Labels_14_0= ruleLabel ) )
            // InternalDeployment.g:1251:4: (lv_Labels_14_0= ruleLabel )
            {
            // InternalDeployment.g:1251:4: (lv_Labels_14_0= ruleLabel )
            // InternalDeployment.g:1252:5: lv_Labels_14_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getSvcAccess().getLabelsLabelParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_21);
            lv_Labels_14_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSvcRule());
            					}
            					add(
            						current,
            						"Labels",
            						lv_Labels_14_0,
            						"co7217.dsl.k8s.Deployment.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployment.g:1269:3: (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDeployment.g:1270:4: otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) )
            	    {
            	    otherlv_15=(Token)match(input,15,FOLLOW_20); 

            	    				newLeafNode(otherlv_15, grammarAccess.getSvcAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalDeployment.g:1274:4: ( (lv_Labels_16_0= ruleLabel ) )
            	    // InternalDeployment.g:1275:5: (lv_Labels_16_0= ruleLabel )
            	    {
            	    // InternalDeployment.g:1275:5: (lv_Labels_16_0= ruleLabel )
            	    // InternalDeployment.g:1276:6: lv_Labels_16_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getSvcAccess().getLabelsLabelParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_Labels_16_0=ruleLabel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSvcRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Labels",
            	    							lv_Labels_16_0,
            	    							"co7217.dsl.k8s.Deployment.Label");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_17=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_17, grammarAccess.getSvcAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_18=(Token)match(input,15,FOLLOW_31); 

            			newLeafNode(otherlv_18, grammarAccess.getSvcAccess().getCommaKeyword_14());
            		
            // InternalDeployment.g:1302:3: ( ( (lv_Ports_19_0= rulePort ) ) otherlv_20= ',' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDeployment.g:1303:4: ( (lv_Ports_19_0= rulePort ) ) otherlv_20= ','
            	    {
            	    // InternalDeployment.g:1303:4: ( (lv_Ports_19_0= rulePort ) )
            	    // InternalDeployment.g:1304:5: (lv_Ports_19_0= rulePort )
            	    {
            	    // InternalDeployment.g:1304:5: (lv_Ports_19_0= rulePort )
            	    // InternalDeployment.g:1305:6: lv_Ports_19_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getSvcAccess().getPortsPortParserRuleCall_15_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_Ports_19_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSvcRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Ports",
            	    							lv_Ports_19_0,
            	    							"co7217.dsl.k8s.Deployment.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_20=(Token)match(input,15,FOLLOW_32); 

            	    				newLeafNode(otherlv_20, grammarAccess.getSvcAccess().getCommaKeyword_15_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_21=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_21, grammarAccess.getSvcAccess().getTargetLabelKeyword_16());
            		
            otherlv_22=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_22, grammarAccess.getSvcAccess().getEqualsSignKeyword_17());
            		
            // InternalDeployment.g:1335:3: ( (lv_TargetLabel_23_0= RULE_STRING ) )
            // InternalDeployment.g:1336:4: (lv_TargetLabel_23_0= RULE_STRING )
            {
            // InternalDeployment.g:1336:4: (lv_TargetLabel_23_0= RULE_STRING )
            // InternalDeployment.g:1337:5: lv_TargetLabel_23_0= RULE_STRING
            {
            lv_TargetLabel_23_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_TargetLabel_23_0, grammarAccess.getSvcAccess().getTargetLabelSTRINGTerminalRuleCall_18_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSvcRule());
            					}
            					setWithLastConsumed(
            						current,
            						"TargetLabel",
            						lv_TargetLabel_23_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_24=(Token)match(input,15,FOLLOW_33); 

            			newLeafNode(otherlv_24, grammarAccess.getSvcAccess().getCommaKeyword_19());
            		
            otherlv_25=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_25, grammarAccess.getSvcAccess().getTargetNameKeyword_20());
            		
            otherlv_26=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_26, grammarAccess.getSvcAccess().getEqualsSignKeyword_21());
            		
            // InternalDeployment.g:1365:3: ( (lv_TargetName_27_0= RULE_STRING ) )
            // InternalDeployment.g:1366:4: (lv_TargetName_27_0= RULE_STRING )
            {
            // InternalDeployment.g:1366:4: (lv_TargetName_27_0= RULE_STRING )
            // InternalDeployment.g:1367:5: lv_TargetName_27_0= RULE_STRING
            {
            lv_TargetName_27_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_TargetName_27_0, grammarAccess.getSvcAccess().getTargetNameSTRINGTerminalRuleCall_22_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSvcRule());
            					}
            					setWithLastConsumed(
            						current,
            						"TargetName",
            						lv_TargetName_27_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_28=(Token)match(input,15,FOLLOW_34); 

            			newLeafNode(otherlv_28, grammarAccess.getSvcAccess().getCommaKeyword_23());
            		
            otherlv_29=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_29, grammarAccess.getSvcAccess().getTypeKeyword_24());
            		
            otherlv_30=(Token)match(input,11,FOLLOW_35); 

            			newLeafNode(otherlv_30, grammarAccess.getSvcAccess().getEqualsSignKeyword_25());
            		
            // InternalDeployment.g:1395:3: ( (lv_Type_31_0= ruleType ) )
            // InternalDeployment.g:1396:4: (lv_Type_31_0= ruleType )
            {
            // InternalDeployment.g:1396:4: (lv_Type_31_0= ruleType )
            // InternalDeployment.g:1397:5: lv_Type_31_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSvcAccess().getTypeTypeParserRuleCall_26_0());
            				
            pushFollow(FOLLOW_21);
            lv_Type_31_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSvcRule());
            					}
            					set(
            						current,
            						"Type",
            						lv_Type_31_0,
            						"co7217.dsl.k8s.Deployment.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDeployment.g:1414:3: (otherlv_32= ',' otherlv_33= 'IP' otherlv_34= '=' ( (lv_IP_35_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDeployment.g:1415:4: otherlv_32= ',' otherlv_33= 'IP' otherlv_34= '=' ( (lv_IP_35_0= RULE_STRING ) )
                    {
                    otherlv_32=(Token)match(input,15,FOLLOW_36); 

                    				newLeafNode(otherlv_32, grammarAccess.getSvcAccess().getCommaKeyword_27_0());
                    			
                    otherlv_33=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_33, grammarAccess.getSvcAccess().getIPKeyword_27_1());
                    			
                    otherlv_34=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_34, grammarAccess.getSvcAccess().getEqualsSignKeyword_27_2());
                    			
                    // InternalDeployment.g:1427:4: ( (lv_IP_35_0= RULE_STRING ) )
                    // InternalDeployment.g:1428:5: (lv_IP_35_0= RULE_STRING )
                    {
                    // InternalDeployment.g:1428:5: (lv_IP_35_0= RULE_STRING )
                    // InternalDeployment.g:1429:6: lv_IP_35_0= RULE_STRING
                    {
                    lv_IP_35_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_IP_35_0, grammarAccess.getSvcAccess().getIPSTRINGTerminalRuleCall_27_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSvcRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"IP",
                    							lv_IP_35_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_36=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_36, grammarAccess.getSvcAccess().getRightCurlyBracketKeyword_28());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSvc"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});

}