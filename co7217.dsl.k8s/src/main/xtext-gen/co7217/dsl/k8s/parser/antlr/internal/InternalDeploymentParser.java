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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'memory'", "'cpu'", "'container'", "'{'", "'name'", "','", "'image'", "'}'", "'---'", "'deployment'", "'namespace'", "'label'", "'replicas'", "'hpa'", "'target'", "'minimum'", "'maximum'", "'metrices'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

                if ( (LA1_0==20) ) {
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
    // InternalDeployment.g:107:1: ruleHeader returns [EObject current=null] : (this_Hpa_0= ruleHpa | this_Dep_1= ruleDep ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        EObject this_Hpa_0 = null;

        EObject this_Dep_1 = null;



        	enterRule();

        try {
            // InternalDeployment.g:113:2: ( (this_Hpa_0= ruleHpa | this_Dep_1= ruleDep ) )
            // InternalDeployment.g:114:2: (this_Hpa_0= ruleHpa | this_Dep_1= ruleDep )
            {
            // InternalDeployment.g:114:2: (this_Hpa_0= ruleHpa | this_Dep_1= ruleDep )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==21) ) {
                    alt2=2;
                }
                else if ( (LA2_1==25) ) {
                    alt2=1;
                }
                else {
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
    // InternalDeployment.g:136:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalDeployment.g:136:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalDeployment.g:137:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalDeployment.g:143:1: ruleLabel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDeployment.g:149:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalDeployment.g:150:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalDeployment.g:150:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalDeployment.g:151:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalDeployment.g:151:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDeployment.g:152:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDeployment.g:152:4: (lv_name_0_0= RULE_ID )
            // InternalDeployment.g:153:5: lv_name_0_0= RULE_ID
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
            		
            // InternalDeployment.g:173:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalDeployment.g:174:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalDeployment.g:174:4: (lv_value_2_0= RULE_STRING )
            // InternalDeployment.g:175:5: lv_value_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleMetrice"
    // InternalDeployment.g:195:1: entryRuleMetrice returns [EObject current=null] : iv_ruleMetrice= ruleMetrice EOF ;
    public final EObject entryRuleMetrice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetrice = null;


        try {
            // InternalDeployment.g:195:48: (iv_ruleMetrice= ruleMetrice EOF )
            // InternalDeployment.g:196:2: iv_ruleMetrice= ruleMetrice EOF
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
    // InternalDeployment.g:202:1: ruleMetrice returns [EObject current=null] : ( ( (lv_resource_0_0= ruleResource ) ) otherlv_1= '=' ( (lv_limit_2_0= RULE_INT ) ) ) ;
    public final EObject ruleMetrice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_limit_2_0=null;
        AntlrDatatypeRuleToken lv_resource_0_0 = null;



        	enterRule();

        try {
            // InternalDeployment.g:208:2: ( ( ( (lv_resource_0_0= ruleResource ) ) otherlv_1= '=' ( (lv_limit_2_0= RULE_INT ) ) ) )
            // InternalDeployment.g:209:2: ( ( (lv_resource_0_0= ruleResource ) ) otherlv_1= '=' ( (lv_limit_2_0= RULE_INT ) ) )
            {
            // InternalDeployment.g:209:2: ( ( (lv_resource_0_0= ruleResource ) ) otherlv_1= '=' ( (lv_limit_2_0= RULE_INT ) ) )
            // InternalDeployment.g:210:3: ( (lv_resource_0_0= ruleResource ) ) otherlv_1= '=' ( (lv_limit_2_0= RULE_INT ) )
            {
            // InternalDeployment.g:210:3: ( (lv_resource_0_0= ruleResource ) )
            // InternalDeployment.g:211:4: (lv_resource_0_0= ruleResource )
            {
            // InternalDeployment.g:211:4: (lv_resource_0_0= ruleResource )
            // InternalDeployment.g:212:5: lv_resource_0_0= ruleResource
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

            otherlv_1=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMetriceAccess().getEqualsSignKeyword_1());
            		
            // InternalDeployment.g:233:3: ( (lv_limit_2_0= RULE_INT ) )
            // InternalDeployment.g:234:4: (lv_limit_2_0= RULE_INT )
            {
            // InternalDeployment.g:234:4: (lv_limit_2_0= RULE_INT )
            // InternalDeployment.g:235:5: lv_limit_2_0= RULE_INT
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
    // InternalDeployment.g:255:1: entryRuleResource returns [String current=null] : iv_ruleResource= ruleResource EOF ;
    public final String entryRuleResource() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResource = null;


        try {
            // InternalDeployment.g:255:48: (iv_ruleResource= ruleResource EOF )
            // InternalDeployment.g:256:2: iv_ruleResource= ruleResource EOF
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
    // InternalDeployment.g:262:1: ruleResource returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'memory' | kw= 'cpu' ) ;
    public final AntlrDatatypeRuleToken ruleResource() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDeployment.g:268:2: ( (kw= 'memory' | kw= 'cpu' ) )
            // InternalDeployment.g:269:2: (kw= 'memory' | kw= 'cpu' )
            {
            // InternalDeployment.g:269:2: (kw= 'memory' | kw= 'cpu' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDeployment.g:270:3: kw= 'memory'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getResourceAccess().getMemoryKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDeployment.g:276:3: kw= 'cpu'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleContainer"
    // InternalDeployment.g:285:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalDeployment.g:285:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalDeployment.g:286:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalDeployment.g:292:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'image' otherlv_7= '=' ( (lv_Image_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
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
            // InternalDeployment.g:298:2: ( (otherlv_0= 'container' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'image' otherlv_7= '=' ( (lv_Image_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalDeployment.g:299:2: (otherlv_0= 'container' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'image' otherlv_7= '=' ( (lv_Image_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalDeployment.g:299:2: (otherlv_0= 'container' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'image' otherlv_7= '=' ( (lv_Image_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // InternalDeployment.g:300:3: otherlv_0= 'container' otherlv_1= '{' otherlv_2= 'name' otherlv_3= '=' ( (lv_Name_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'image' otherlv_7= '=' ( (lv_Image_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getEqualsSignKeyword_3());
            		
            // InternalDeployment.g:316:3: ( (lv_Name_4_0= RULE_STRING ) )
            // InternalDeployment.g:317:4: (lv_Name_4_0= RULE_STRING )
            {
            // InternalDeployment.g:317:4: (lv_Name_4_0= RULE_STRING )
            // InternalDeployment.g:318:5: lv_Name_4_0= RULE_STRING
            {
            lv_Name_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_5=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getContainerAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getImageKeyword_6());
            		
            otherlv_7=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getContainerAccess().getEqualsSignKeyword_7());
            		
            // InternalDeployment.g:346:3: ( (lv_Image_8_0= RULE_STRING ) )
            // InternalDeployment.g:347:4: (lv_Image_8_0= RULE_STRING )
            {
            // InternalDeployment.g:347:4: (lv_Image_8_0= RULE_STRING )
            // InternalDeployment.g:348:5: lv_Image_8_0= RULE_STRING
            {
            lv_Image_8_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

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

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDep"
    // InternalDeployment.g:372:1: entryRuleDep returns [EObject current=null] : iv_ruleDep= ruleDep EOF ;
    public final EObject entryRuleDep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDep = null;


        try {
            // InternalDeployment.g:372:44: (iv_ruleDep= ruleDep EOF )
            // InternalDeployment.g:373:2: iv_ruleDep= ruleDep EOF
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
    // InternalDeployment.g:379:1: ruleDep returns [EObject current=null] : (otherlv_0= '---' otherlv_1= 'deployment' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'replicas' otherlv_20= '=' ( (lv_Replicas_21_0= RULE_INT ) ) otherlv_22= ',' ( (lv_Containers_23_0= ruleContainer ) ) (otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) ) )* otherlv_26= '}' ) ;
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
            // InternalDeployment.g:385:2: ( (otherlv_0= '---' otherlv_1= 'deployment' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'replicas' otherlv_20= '=' ( (lv_Replicas_21_0= RULE_INT ) ) otherlv_22= ',' ( (lv_Containers_23_0= ruleContainer ) ) (otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) ) )* otherlv_26= '}' ) )
            // InternalDeployment.g:386:2: (otherlv_0= '---' otherlv_1= 'deployment' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'replicas' otherlv_20= '=' ( (lv_Replicas_21_0= RULE_INT ) ) otherlv_22= ',' ( (lv_Containers_23_0= ruleContainer ) ) (otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) ) )* otherlv_26= '}' )
            {
            // InternalDeployment.g:386:2: (otherlv_0= '---' otherlv_1= 'deployment' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'replicas' otherlv_20= '=' ( (lv_Replicas_21_0= RULE_INT ) ) otherlv_22= ',' ( (lv_Containers_23_0= ruleContainer ) ) (otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) ) )* otherlv_26= '}' )
            // InternalDeployment.g:387:3: otherlv_0= '---' otherlv_1= 'deployment' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'replicas' otherlv_20= '=' ( (lv_Replicas_21_0= RULE_INT ) ) otherlv_22= ',' ( (lv_Containers_23_0= ruleContainer ) ) (otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) ) )* otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDepAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDepAccess().getDeploymentKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDepAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDepAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDepAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getDepAccess().getEqualsSignKeyword_5());
            		
            // InternalDeployment.g:411:3: ( (lv_Name_6_0= RULE_STRING ) )
            // InternalDeployment.g:412:4: (lv_Name_6_0= RULE_STRING )
            {
            // InternalDeployment.g:412:4: (lv_Name_6_0= RULE_STRING )
            // InternalDeployment.g:413:5: lv_Name_6_0= RULE_STRING
            {
            lv_Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_7=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getDepAccess().getCommaKeyword_7());
            		
            // InternalDeployment.g:433:3: (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDeployment.g:434:4: otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ','
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getDepAccess().getNamespaceKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getDepAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalDeployment.g:442:4: ( (lv_Namespace_10_0= RULE_STRING ) )
                    // InternalDeployment.g:443:5: (lv_Namespace_10_0= RULE_STRING )
                    {
                    // InternalDeployment.g:443:5: (lv_Namespace_10_0= RULE_STRING )
                    // InternalDeployment.g:444:6: lv_Namespace_10_0= RULE_STRING
                    {
                    lv_Namespace_10_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

                    otherlv_11=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getDepAccess().getCommaKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getDepAccess().getLabelKeyword_9());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_13, grammarAccess.getDepAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalDeployment.g:473:3: ( (lv_Labels_14_0= ruleLabel ) )
            // InternalDeployment.g:474:4: (lv_Labels_14_0= ruleLabel )
            {
            // InternalDeployment.g:474:4: (lv_Labels_14_0= ruleLabel )
            // InternalDeployment.g:475:5: lv_Labels_14_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getDepAccess().getLabelsLabelParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalDeployment.g:492:3: (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDeployment.g:493:4: otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) )
            	    {
            	    otherlv_15=(Token)match(input,17,FOLLOW_16); 

            	    				newLeafNode(otherlv_15, grammarAccess.getDepAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalDeployment.g:497:4: ( (lv_Labels_16_0= ruleLabel ) )
            	    // InternalDeployment.g:498:5: (lv_Labels_16_0= ruleLabel )
            	    {
            	    // InternalDeployment.g:498:5: (lv_Labels_16_0= ruleLabel )
            	    // InternalDeployment.g:499:6: lv_Labels_16_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getDepAccess().getLabelsLabelParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop5;
                }
            } while (true);

            otherlv_17=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_17, grammarAccess.getDepAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_18=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_18, grammarAccess.getDepAccess().getCommaKeyword_14());
            		
            otherlv_19=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getDepAccess().getReplicasKeyword_15());
            		
            otherlv_20=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_20, grammarAccess.getDepAccess().getEqualsSignKeyword_16());
            		
            // InternalDeployment.g:533:3: ( (lv_Replicas_21_0= RULE_INT ) )
            // InternalDeployment.g:534:4: (lv_Replicas_21_0= RULE_INT )
            {
            // InternalDeployment.g:534:4: (lv_Replicas_21_0= RULE_INT )
            // InternalDeployment.g:535:5: lv_Replicas_21_0= RULE_INT
            {
            lv_Replicas_21_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_22=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_22, grammarAccess.getDepAccess().getCommaKeyword_18());
            		
            // InternalDeployment.g:555:3: ( (lv_Containers_23_0= ruleContainer ) )
            // InternalDeployment.g:556:4: (lv_Containers_23_0= ruleContainer )
            {
            // InternalDeployment.g:556:4: (lv_Containers_23_0= ruleContainer )
            // InternalDeployment.g:557:5: lv_Containers_23_0= ruleContainer
            {

            					newCompositeNode(grammarAccess.getDepAccess().getContainersContainerParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalDeployment.g:574:3: (otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDeployment.g:575:4: otherlv_24= ',' ( (lv_Containers_25_0= ruleContainer ) )
            	    {
            	    otherlv_24=(Token)match(input,17,FOLLOW_19); 

            	    				newLeafNode(otherlv_24, grammarAccess.getDepAccess().getCommaKeyword_20_0());
            	    			
            	    // InternalDeployment.g:579:4: ( (lv_Containers_25_0= ruleContainer ) )
            	    // InternalDeployment.g:580:5: (lv_Containers_25_0= ruleContainer )
            	    {
            	    // InternalDeployment.g:580:5: (lv_Containers_25_0= ruleContainer )
            	    // InternalDeployment.g:581:6: lv_Containers_25_0= ruleContainer
            	    {

            	    						newCompositeNode(grammarAccess.getDepAccess().getContainersContainerParserRuleCall_20_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop6;
                }
            } while (true);

            otherlv_26=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDeployment.g:607:1: entryRuleHpa returns [EObject current=null] : iv_ruleHpa= ruleHpa EOF ;
    public final EObject entryRuleHpa() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHpa = null;


        try {
            // InternalDeployment.g:607:44: (iv_ruleHpa= ruleHpa EOF )
            // InternalDeployment.g:608:2: iv_ruleHpa= ruleHpa EOF
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
    // InternalDeployment.g:614:1: ruleHpa returns [EObject current=null] : (otherlv_0= '---' otherlv_1= 'hpa' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'target' otherlv_20= '=' ( (lv_Target_21_0= RULE_STRING ) ) otherlv_22= ',' otherlv_23= 'minimum' otherlv_24= '=' ( (lv_Minimum_25_0= RULE_INT ) ) otherlv_26= ',' otherlv_27= 'maximum' otherlv_28= '=' ( (lv_Maximum_29_0= RULE_INT ) ) otherlv_30= ',' otherlv_31= 'metrices' otherlv_32= '{' ( (lv_Metrices_33_0= ruleMetrice ) ) (otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) ) )? otherlv_36= '}' otherlv_37= '}' ) ;
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
            // InternalDeployment.g:620:2: ( (otherlv_0= '---' otherlv_1= 'hpa' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'target' otherlv_20= '=' ( (lv_Target_21_0= RULE_STRING ) ) otherlv_22= ',' otherlv_23= 'minimum' otherlv_24= '=' ( (lv_Minimum_25_0= RULE_INT ) ) otherlv_26= ',' otherlv_27= 'maximum' otherlv_28= '=' ( (lv_Maximum_29_0= RULE_INT ) ) otherlv_30= ',' otherlv_31= 'metrices' otherlv_32= '{' ( (lv_Metrices_33_0= ruleMetrice ) ) (otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) ) )? otherlv_36= '}' otherlv_37= '}' ) )
            // InternalDeployment.g:621:2: (otherlv_0= '---' otherlv_1= 'hpa' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'target' otherlv_20= '=' ( (lv_Target_21_0= RULE_STRING ) ) otherlv_22= ',' otherlv_23= 'minimum' otherlv_24= '=' ( (lv_Minimum_25_0= RULE_INT ) ) otherlv_26= ',' otherlv_27= 'maximum' otherlv_28= '=' ( (lv_Maximum_29_0= RULE_INT ) ) otherlv_30= ',' otherlv_31= 'metrices' otherlv_32= '{' ( (lv_Metrices_33_0= ruleMetrice ) ) (otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) ) )? otherlv_36= '}' otherlv_37= '}' )
            {
            // InternalDeployment.g:621:2: (otherlv_0= '---' otherlv_1= 'hpa' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'target' otherlv_20= '=' ( (lv_Target_21_0= RULE_STRING ) ) otherlv_22= ',' otherlv_23= 'minimum' otherlv_24= '=' ( (lv_Minimum_25_0= RULE_INT ) ) otherlv_26= ',' otherlv_27= 'maximum' otherlv_28= '=' ( (lv_Maximum_29_0= RULE_INT ) ) otherlv_30= ',' otherlv_31= 'metrices' otherlv_32= '{' ( (lv_Metrices_33_0= ruleMetrice ) ) (otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) ) )? otherlv_36= '}' otherlv_37= '}' )
            // InternalDeployment.g:622:3: otherlv_0= '---' otherlv_1= 'hpa' otherlv_2= '---' otherlv_3= '{' otherlv_4= 'name' otherlv_5= '=' ( (lv_Name_6_0= RULE_STRING ) ) otherlv_7= ',' (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )? otherlv_12= 'label' otherlv_13= '{' ( (lv_Labels_14_0= ruleLabel ) ) (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )* otherlv_17= '}' otherlv_18= ',' otherlv_19= 'target' otherlv_20= '=' ( (lv_Target_21_0= RULE_STRING ) ) otherlv_22= ',' otherlv_23= 'minimum' otherlv_24= '=' ( (lv_Minimum_25_0= RULE_INT ) ) otherlv_26= ',' otherlv_27= 'maximum' otherlv_28= '=' ( (lv_Maximum_29_0= RULE_INT ) ) otherlv_30= ',' otherlv_31= 'metrices' otherlv_32= '{' ( (lv_Metrices_33_0= ruleMetrice ) ) (otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) ) )? otherlv_36= '}' otherlv_37= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getHpaAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getHpaAccess().getHpaKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getHpaAccess().getHyphenMinusHyphenMinusHyphenMinusKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getHpaAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getHpaAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getHpaAccess().getEqualsSignKeyword_5());
            		
            // InternalDeployment.g:646:3: ( (lv_Name_6_0= RULE_STRING ) )
            // InternalDeployment.g:647:4: (lv_Name_6_0= RULE_STRING )
            {
            // InternalDeployment.g:647:4: (lv_Name_6_0= RULE_STRING )
            // InternalDeployment.g:648:5: lv_Name_6_0= RULE_STRING
            {
            lv_Name_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_7=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getHpaAccess().getCommaKeyword_7());
            		
            // InternalDeployment.g:668:3: (otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDeployment.g:669:4: otherlv_8= 'namespace' otherlv_9= '=' ( (lv_Namespace_10_0= RULE_STRING ) ) otherlv_11= ','
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getHpaAccess().getNamespaceKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getHpaAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalDeployment.g:677:4: ( (lv_Namespace_10_0= RULE_STRING ) )
                    // InternalDeployment.g:678:5: (lv_Namespace_10_0= RULE_STRING )
                    {
                    // InternalDeployment.g:678:5: (lv_Namespace_10_0= RULE_STRING )
                    // InternalDeployment.g:679:6: lv_Namespace_10_0= RULE_STRING
                    {
                    lv_Namespace_10_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

                    otherlv_11=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getHpaAccess().getCommaKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getHpaAccess().getLabelKeyword_9());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_13, grammarAccess.getHpaAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalDeployment.g:708:3: ( (lv_Labels_14_0= ruleLabel ) )
            // InternalDeployment.g:709:4: (lv_Labels_14_0= ruleLabel )
            {
            // InternalDeployment.g:709:4: (lv_Labels_14_0= ruleLabel )
            // InternalDeployment.g:710:5: lv_Labels_14_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getHpaAccess().getLabelsLabelParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalDeployment.g:727:3: (otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDeployment.g:728:4: otherlv_15= ',' ( (lv_Labels_16_0= ruleLabel ) )
            	    {
            	    otherlv_15=(Token)match(input,17,FOLLOW_16); 

            	    				newLeafNode(otherlv_15, grammarAccess.getHpaAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalDeployment.g:732:4: ( (lv_Labels_16_0= ruleLabel ) )
            	    // InternalDeployment.g:733:5: (lv_Labels_16_0= ruleLabel )
            	    {
            	    // InternalDeployment.g:733:5: (lv_Labels_16_0= ruleLabel )
            	    // InternalDeployment.g:734:6: lv_Labels_16_0= ruleLabel
            	    {

            	    						newCompositeNode(grammarAccess.getHpaAccess().getLabelsLabelParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop8;
                }
            } while (true);

            otherlv_17=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_17, grammarAccess.getHpaAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_18=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_18, grammarAccess.getHpaAccess().getCommaKeyword_14());
            		
            otherlv_19=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getHpaAccess().getTargetKeyword_15());
            		
            otherlv_20=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_20, grammarAccess.getHpaAccess().getEqualsSignKeyword_16());
            		
            // InternalDeployment.g:768:3: ( (lv_Target_21_0= RULE_STRING ) )
            // InternalDeployment.g:769:4: (lv_Target_21_0= RULE_STRING )
            {
            // InternalDeployment.g:769:4: (lv_Target_21_0= RULE_STRING )
            // InternalDeployment.g:770:5: lv_Target_21_0= RULE_STRING
            {
            lv_Target_21_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

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

            otherlv_22=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_22, grammarAccess.getHpaAccess().getCommaKeyword_18());
            		
            otherlv_23=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_23, grammarAccess.getHpaAccess().getMinimumKeyword_19());
            		
            otherlv_24=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_24, grammarAccess.getHpaAccess().getEqualsSignKeyword_20());
            		
            // InternalDeployment.g:798:3: ( (lv_Minimum_25_0= RULE_INT ) )
            // InternalDeployment.g:799:4: (lv_Minimum_25_0= RULE_INT )
            {
            // InternalDeployment.g:799:4: (lv_Minimum_25_0= RULE_INT )
            // InternalDeployment.g:800:5: lv_Minimum_25_0= RULE_INT
            {
            lv_Minimum_25_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_26=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_26, grammarAccess.getHpaAccess().getCommaKeyword_22());
            		
            otherlv_27=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_27, grammarAccess.getHpaAccess().getMaximumKeyword_23());
            		
            otherlv_28=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_28, grammarAccess.getHpaAccess().getEqualsSignKeyword_24());
            		
            // InternalDeployment.g:828:3: ( (lv_Maximum_29_0= RULE_INT ) )
            // InternalDeployment.g:829:4: (lv_Maximum_29_0= RULE_INT )
            {
            // InternalDeployment.g:829:4: (lv_Maximum_29_0= RULE_INT )
            // InternalDeployment.g:830:5: lv_Maximum_29_0= RULE_INT
            {
            lv_Maximum_29_0=(Token)match(input,RULE_INT,FOLLOW_9); 

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

            otherlv_30=(Token)match(input,17,FOLLOW_24); 

            			newLeafNode(otherlv_30, grammarAccess.getHpaAccess().getCommaKeyword_26());
            		
            otherlv_31=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_31, grammarAccess.getHpaAccess().getMetricesKeyword_27());
            		
            otherlv_32=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_32, grammarAccess.getHpaAccess().getLeftCurlyBracketKeyword_28());
            		
            // InternalDeployment.g:858:3: ( (lv_Metrices_33_0= ruleMetrice ) )
            // InternalDeployment.g:859:4: (lv_Metrices_33_0= ruleMetrice )
            {
            // InternalDeployment.g:859:4: (lv_Metrices_33_0= ruleMetrice )
            // InternalDeployment.g:860:5: lv_Metrices_33_0= ruleMetrice
            {

            					newCompositeNode(grammarAccess.getHpaAccess().getMetricesMetriceParserRuleCall_29_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalDeployment.g:877:3: (otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDeployment.g:878:4: otherlv_34= ',' ( (lv_Metrices_35_0= ruleMetrice ) )
                    {
                    otherlv_34=(Token)match(input,17,FOLLOW_25); 

                    				newLeafNode(otherlv_34, grammarAccess.getHpaAccess().getCommaKeyword_30_0());
                    			
                    // InternalDeployment.g:882:4: ( (lv_Metrices_35_0= ruleMetrice ) )
                    // InternalDeployment.g:883:5: (lv_Metrices_35_0= ruleMetrice )
                    {
                    // InternalDeployment.g:883:5: (lv_Metrices_35_0= ruleMetrice )
                    // InternalDeployment.g:884:6: lv_Metrices_35_0= ruleMetrice
                    {

                    						newCompositeNode(grammarAccess.getHpaAccess().getMetricesMetriceParserRuleCall_30_1_0());
                    					
                    pushFollow(FOLLOW_11);
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

            otherlv_36=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_36, grammarAccess.getHpaAccess().getRightCurlyBracketKeyword_31());
            		
            otherlv_37=(Token)match(input,19,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000003000L});

}