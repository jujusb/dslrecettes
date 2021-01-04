package cuisine.recipe.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cuisine.recipe.services.RecipeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecipeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'define'", "'['", "']'", "'{'", "'}'", "','", "'ingredient'", "'ustensil'", "'preparation'", "'temperature'", "'tool'", "'recipe'", "'name'", "':'", "'time'", "'nb_pers'", "'ustensils'", "'ingredients'", "'#'", "'@'", "'c\\u00E0c'", "'c\\u00E0s'", "'g'", "'l'", "'k'", "'h'", "'da'", "'d'", "'c'", "'m'", "'instructions'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=5;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRecipeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRecipeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRecipeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRecipe.g"; }



     	private RecipeGrammarAccess grammarAccess;

        public InternalRecipeParser(TokenStream input, RecipeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RecipeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRecipe.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRecipe.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRecipe.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalRecipe.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_defTechniques_0_0= ruleTechnique ) )* ( (lv_recipes_1_0= ruleRecipe ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_defTechniques_0_0 = null;

        EObject lv_recipes_1_0 = null;



        	enterRule();

        try {
            // InternalRecipe.g:77:2: ( ( ( (lv_defTechniques_0_0= ruleTechnique ) )* ( (lv_recipes_1_0= ruleRecipe ) )* ) )
            // InternalRecipe.g:78:2: ( ( (lv_defTechniques_0_0= ruleTechnique ) )* ( (lv_recipes_1_0= ruleRecipe ) )* )
            {
            // InternalRecipe.g:78:2: ( ( (lv_defTechniques_0_0= ruleTechnique ) )* ( (lv_recipes_1_0= ruleRecipe ) )* )
            // InternalRecipe.g:79:3: ( (lv_defTechniques_0_0= ruleTechnique ) )* ( (lv_recipes_1_0= ruleRecipe ) )*
            {
            // InternalRecipe.g:79:3: ( (lv_defTechniques_0_0= ruleTechnique ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRecipe.g:80:4: (lv_defTechniques_0_0= ruleTechnique )
            	    {
            	    // InternalRecipe.g:80:4: (lv_defTechniques_0_0= ruleTechnique )
            	    // InternalRecipe.g:81:5: lv_defTechniques_0_0= ruleTechnique
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDefTechniquesTechniqueParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_defTechniques_0_0=ruleTechnique();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"defTechniques",
            	    						lv_defTechniques_0_0,
            	    						"cuisine.recipe.Recipe.Technique");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalRecipe.g:98:3: ( (lv_recipes_1_0= ruleRecipe ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRecipe.g:99:4: (lv_recipes_1_0= ruleRecipe )
            	    {
            	    // InternalRecipe.g:99:4: (lv_recipes_1_0= ruleRecipe )
            	    // InternalRecipe.g:100:5: lv_recipes_1_0= ruleRecipe
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getRecipesRecipeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_recipes_1_0=ruleRecipe();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"recipes",
            	    						lv_recipes_1_0,
            	    						"cuisine.recipe.Recipe.Recipe");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTechnique"
    // InternalRecipe.g:121:1: entryRuleTechnique returns [EObject current=null] : iv_ruleTechnique= ruleTechnique EOF ;
    public final EObject entryRuleTechnique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnique = null;


        try {
            // InternalRecipe.g:121:50: (iv_ruleTechnique= ruleTechnique EOF )
            // InternalRecipe.g:122:2: iv_ruleTechnique= ruleTechnique EOF
            {
             newCompositeNode(grammarAccess.getTechniqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTechnique=ruleTechnique();

            state._fsp--;

             current =iv_ruleTechnique; 
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
    // $ANTLR end "entryRuleTechnique"


    // $ANTLR start "ruleTechnique"
    // InternalRecipe.g:128:1: ruleTechnique returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' ( (lv_objectsFac_3_0= ruleIngrUslTech ) ) otherlv_4= ']' ) | ( (lv_objects_5_0= ruleIngrUslTech ) ) | (otherlv_6= '{' this_choices_7= rulechoices[$current] otherlv_8= '}' ) )+ ) ;
    public final EObject ruleTechnique() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_objectsFac_3_0 = null;

        AntlrDatatypeRuleToken lv_objects_5_0 = null;

        EObject this_choices_7 = null;



        	enterRule();

        try {
            // InternalRecipe.g:134:2: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' ( (lv_objectsFac_3_0= ruleIngrUslTech ) ) otherlv_4= ']' ) | ( (lv_objects_5_0= ruleIngrUslTech ) ) | (otherlv_6= '{' this_choices_7= rulechoices[$current] otherlv_8= '}' ) )+ ) )
            // InternalRecipe.g:135:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' ( (lv_objectsFac_3_0= ruleIngrUslTech ) ) otherlv_4= ']' ) | ( (lv_objects_5_0= ruleIngrUslTech ) ) | (otherlv_6= '{' this_choices_7= rulechoices[$current] otherlv_8= '}' ) )+ )
            {
            // InternalRecipe.g:135:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' ( (lv_objectsFac_3_0= ruleIngrUslTech ) ) otherlv_4= ']' ) | ( (lv_objects_5_0= ruleIngrUslTech ) ) | (otherlv_6= '{' this_choices_7= rulechoices[$current] otherlv_8= '}' ) )+ )
            // InternalRecipe.g:136:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '[' ( (lv_objectsFac_3_0= ruleIngrUslTech ) ) otherlv_4= ']' ) | ( (lv_objects_5_0= ruleIngrUslTech ) ) | (otherlv_6= '{' this_choices_7= rulechoices[$current] otherlv_8= '}' ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTechniqueAccess().getDefineKeyword_0());
            		
            // InternalRecipe.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRecipe.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRecipe.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalRecipe.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTechniqueAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTechniqueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRecipe.g:158:3: ( (otherlv_2= '[' ( (lv_objectsFac_3_0= ruleIngrUslTech ) ) otherlv_4= ']' ) | ( (lv_objects_5_0= ruleIngrUslTech ) ) | (otherlv_6= '{' this_choices_7= rulechoices[$current] otherlv_8= '}' ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt3=1;
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    {
                    alt3=2;
                    }
                    break;
                case 15:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalRecipe.g:159:4: (otherlv_2= '[' ( (lv_objectsFac_3_0= ruleIngrUslTech ) ) otherlv_4= ']' )
            	    {
            	    // InternalRecipe.g:159:4: (otherlv_2= '[' ( (lv_objectsFac_3_0= ruleIngrUslTech ) ) otherlv_4= ']' )
            	    // InternalRecipe.g:160:5: otherlv_2= '[' ( (lv_objectsFac_3_0= ruleIngrUslTech ) ) otherlv_4= ']'
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_7); 

            	    					newLeafNode(otherlv_2, grammarAccess.getTechniqueAccess().getLeftSquareBracketKeyword_2_0_0());
            	    				
            	    // InternalRecipe.g:164:5: ( (lv_objectsFac_3_0= ruleIngrUslTech ) )
            	    // InternalRecipe.g:165:6: (lv_objectsFac_3_0= ruleIngrUslTech )
            	    {
            	    // InternalRecipe.g:165:6: (lv_objectsFac_3_0= ruleIngrUslTech )
            	    // InternalRecipe.g:166:7: lv_objectsFac_3_0= ruleIngrUslTech
            	    {

            	    							newCompositeNode(grammarAccess.getTechniqueAccess().getObjectsFacIngrUslTechParserRuleCall_2_0_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_objectsFac_3_0=ruleIngrUslTech();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getTechniqueRule());
            	    							}
            	    							add(
            	    								current,
            	    								"objectsFac",
            	    								lv_objectsFac_3_0,
            	    								"cuisine.recipe.Recipe.IngrUslTech");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_4=(Token)match(input,14,FOLLOW_9); 

            	    					newLeafNode(otherlv_4, grammarAccess.getTechniqueAccess().getRightSquareBracketKeyword_2_0_2());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRecipe.g:189:4: ( (lv_objects_5_0= ruleIngrUslTech ) )
            	    {
            	    // InternalRecipe.g:189:4: ( (lv_objects_5_0= ruleIngrUslTech ) )
            	    // InternalRecipe.g:190:5: (lv_objects_5_0= ruleIngrUslTech )
            	    {
            	    // InternalRecipe.g:190:5: (lv_objects_5_0= ruleIngrUslTech )
            	    // InternalRecipe.g:191:6: lv_objects_5_0= ruleIngrUslTech
            	    {

            	    						newCompositeNode(grammarAccess.getTechniqueAccess().getObjectsIngrUslTechParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_objects_5_0=ruleIngrUslTech();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTechniqueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"objects",
            	    							lv_objects_5_0,
            	    							"cuisine.recipe.Recipe.IngrUslTech");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRecipe.g:209:4: (otherlv_6= '{' this_choices_7= rulechoices[$current] otherlv_8= '}' )
            	    {
            	    // InternalRecipe.g:209:4: (otherlv_6= '{' this_choices_7= rulechoices[$current] otherlv_8= '}' )
            	    // InternalRecipe.g:210:5: otherlv_6= '{' this_choices_7= rulechoices[$current] otherlv_8= '}'
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_10); 

            	    					newLeafNode(otherlv_6, grammarAccess.getTechniqueAccess().getLeftCurlyBracketKeyword_2_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTechniqueRule());
            	    					}
            	    					newCompositeNode(grammarAccess.getTechniqueAccess().getChoicesParserRuleCall_2_2_1());
            	    				
            	    pushFollow(FOLLOW_11);
            	    this_choices_7=rulechoices(current);

            	    state._fsp--;


            	    					current = this_choices_7;
            	    					afterParserOrEnumRuleCall();
            	    				
            	    otherlv_8=(Token)match(input,16,FOLLOW_9); 

            	    					newLeafNode(otherlv_8, grammarAccess.getTechniqueAccess().getRightCurlyBracketKeyword_2_2_2());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


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
    // $ANTLR end "ruleTechnique"


    // $ANTLR start "rulechoices"
    // InternalRecipe.g:236:1: rulechoices[EObject in_current] returns [EObject current=in_current] : ( ( ( (lv_choix_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_choix_2_0= RULE_ID ) ) )* ) | (otherlv_3= '{' this_choices_4= rulechoices[$current] otherlv_5= '}' (otherlv_6= ',' otherlv_7= '{' this_choices_8= rulechoices[$current] otherlv_9= '}' )* ) ) ;
    public final EObject rulechoices(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_choix_0_0=null;
        Token otherlv_1=null;
        Token lv_choix_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_choices_4 = null;

        EObject this_choices_8 = null;



        	enterRule();

        try {
            // InternalRecipe.g:242:2: ( ( ( ( (lv_choix_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_choix_2_0= RULE_ID ) ) )* ) | (otherlv_3= '{' this_choices_4= rulechoices[$current] otherlv_5= '}' (otherlv_6= ',' otherlv_7= '{' this_choices_8= rulechoices[$current] otherlv_9= '}' )* ) ) )
            // InternalRecipe.g:243:2: ( ( ( (lv_choix_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_choix_2_0= RULE_ID ) ) )* ) | (otherlv_3= '{' this_choices_4= rulechoices[$current] otherlv_5= '}' (otherlv_6= ',' otherlv_7= '{' this_choices_8= rulechoices[$current] otherlv_9= '}' )* ) )
            {
            // InternalRecipe.g:243:2: ( ( ( (lv_choix_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_choix_2_0= RULE_ID ) ) )* ) | (otherlv_3= '{' this_choices_4= rulechoices[$current] otherlv_5= '}' (otherlv_6= ',' otherlv_7= '{' this_choices_8= rulechoices[$current] otherlv_9= '}' )* ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRecipe.g:244:3: ( ( (lv_choix_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_choix_2_0= RULE_ID ) ) )* )
                    {
                    // InternalRecipe.g:244:3: ( ( (lv_choix_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_choix_2_0= RULE_ID ) ) )* )
                    // InternalRecipe.g:245:4: ( (lv_choix_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_choix_2_0= RULE_ID ) ) )*
                    {
                    // InternalRecipe.g:245:4: ( (lv_choix_0_0= RULE_ID ) )
                    // InternalRecipe.g:246:5: (lv_choix_0_0= RULE_ID )
                    {
                    // InternalRecipe.g:246:5: (lv_choix_0_0= RULE_ID )
                    // InternalRecipe.g:247:6: lv_choix_0_0= RULE_ID
                    {
                    lv_choix_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(lv_choix_0_0, grammarAccess.getChoicesAccess().getChoixIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChoicesRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"choix",
                    							lv_choix_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalRecipe.g:263:4: (otherlv_1= ',' ( (lv_choix_2_0= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRecipe.g:264:5: otherlv_1= ',' ( (lv_choix_2_0= RULE_ID ) )
                    	    {
                    	    otherlv_1=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getChoicesAccess().getCommaKeyword_0_1_0());
                    	    				
                    	    // InternalRecipe.g:268:5: ( (lv_choix_2_0= RULE_ID ) )
                    	    // InternalRecipe.g:269:6: (lv_choix_2_0= RULE_ID )
                    	    {
                    	    // InternalRecipe.g:269:6: (lv_choix_2_0= RULE_ID )
                    	    // InternalRecipe.g:270:7: lv_choix_2_0= RULE_ID
                    	    {
                    	    lv_choix_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    	    							newLeafNode(lv_choix_2_0, grammarAccess.getChoicesAccess().getChoixIDTerminalRuleCall_0_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getChoicesRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"choix",
                    	    								lv_choix_2_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalRecipe.g:289:3: (otherlv_3= '{' this_choices_4= rulechoices[$current] otherlv_5= '}' (otherlv_6= ',' otherlv_7= '{' this_choices_8= rulechoices[$current] otherlv_9= '}' )* )
                    {
                    // InternalRecipe.g:289:3: (otherlv_3= '{' this_choices_4= rulechoices[$current] otherlv_5= '}' (otherlv_6= ',' otherlv_7= '{' this_choices_8= rulechoices[$current] otherlv_9= '}' )* )
                    // InternalRecipe.g:290:4: otherlv_3= '{' this_choices_4= rulechoices[$current] otherlv_5= '}' (otherlv_6= ',' otherlv_7= '{' this_choices_8= rulechoices[$current] otherlv_9= '}' )*
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getChoicesAccess().getLeftCurlyBracketKeyword_1_0());
                    			

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getChoicesRule());
                    				}
                    				newCompositeNode(grammarAccess.getChoicesAccess().getChoicesParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_choices_4=rulechoices(current);

                    state._fsp--;


                    				current = this_choices_4;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_5=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getChoicesAccess().getRightCurlyBracketKeyword_1_2());
                    			
                    // InternalRecipe.g:309:4: (otherlv_6= ',' otherlv_7= '{' this_choices_8= rulechoices[$current] otherlv_9= '}' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRecipe.g:310:5: otherlv_6= ',' otherlv_7= '{' this_choices_8= rulechoices[$current] otherlv_9= '}'
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_13); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getChoicesAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    otherlv_7=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getChoicesAccess().getLeftCurlyBracketKeyword_1_3_1());
                    	    				

                    	    					if (current==null) {
                    	    						current = createModelElement(grammarAccess.getChoicesRule());
                    	    					}
                    	    					newCompositeNode(grammarAccess.getChoicesAccess().getChoicesParserRuleCall_1_3_2());
                    	    				
                    	    pushFollow(FOLLOW_11);
                    	    this_choices_8=rulechoices(current);

                    	    state._fsp--;


                    	    					current = this_choices_8;
                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    otherlv_9=(Token)match(input,16,FOLLOW_12); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getChoicesAccess().getRightCurlyBracketKeyword_1_3_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


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
    // $ANTLR end "rulechoices"


    // $ANTLR start "entryRuleIngrUslTech"
    // InternalRecipe.g:339:1: entryRuleIngrUslTech returns [String current=null] : iv_ruleIngrUslTech= ruleIngrUslTech EOF ;
    public final String entryRuleIngrUslTech() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIngrUslTech = null;


        try {
            // InternalRecipe.g:339:51: (iv_ruleIngrUslTech= ruleIngrUslTech EOF )
            // InternalRecipe.g:340:2: iv_ruleIngrUslTech= ruleIngrUslTech EOF
            {
             newCompositeNode(grammarAccess.getIngrUslTechRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngrUslTech=ruleIngrUslTech();

            state._fsp--;

             current =iv_ruleIngrUslTech.getText(); 
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
    // $ANTLR end "entryRuleIngrUslTech"


    // $ANTLR start "ruleIngrUslTech"
    // InternalRecipe.g:346:1: ruleIngrUslTech returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ingredient' | kw= 'ustensil' | kw= 'preparation' | kw= 'temperature' | kw= 'tool' ) ;
    public final AntlrDatatypeRuleToken ruleIngrUslTech() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRecipe.g:352:2: ( (kw= 'ingredient' | kw= 'ustensil' | kw= 'preparation' | kw= 'temperature' | kw= 'tool' ) )
            // InternalRecipe.g:353:2: (kw= 'ingredient' | kw= 'ustensil' | kw= 'preparation' | kw= 'temperature' | kw= 'tool' )
            {
            // InternalRecipe.g:353:2: (kw= 'ingredient' | kw= 'ustensil' | kw= 'preparation' | kw= 'temperature' | kw= 'tool' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            case 22:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRecipe.g:354:3: kw= 'ingredient'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIngrUslTechAccess().getIngredientKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRecipe.g:360:3: kw= 'ustensil'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIngrUslTechAccess().getUstensilKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRecipe.g:366:3: kw= 'preparation'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIngrUslTechAccess().getPreparationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRecipe.g:372:3: kw= 'temperature'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIngrUslTechAccess().getTemperatureKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRecipe.g:378:3: kw= 'tool'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getIngrUslTechAccess().getToolKeyword_4());
                    		

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
    // $ANTLR end "ruleIngrUslTech"


    // $ANTLR start "entryRuleRecipe"
    // InternalRecipe.g:387:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // InternalRecipe.g:387:47: (iv_ruleRecipe= ruleRecipe EOF )
            // InternalRecipe.g:388:2: iv_ruleRecipe= ruleRecipe EOF
            {
             newCompositeNode(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecipe=ruleRecipe();

            state._fsp--;

             current =iv_ruleRecipe; 
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
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // InternalRecipe.g:394:1: ruleRecipe returns [EObject current=null] : (otherlv_0= 'recipe' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ( (lv_suitename_5_0= RULE_ID ) )* otherlv_6= 'time' otherlv_7= ':' ( (lv_time_8_0= RULE_DOUBLE ) ) otherlv_9= 'nb_pers' otherlv_10= ':' ( (lv_nb_11_0= RULE_DOUBLE ) ) ( (lv_ingredients_12_0= ruleIngredients ) ) ( (lv_ustensils_13_0= ruleUstensils ) ) ( (lv_instructions_14_0= ruleInstructions ) ) otherlv_15= '}' ) ;
    public final EObject ruleRecipe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_suitename_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_time_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_nb_11_0=null;
        Token otherlv_15=null;
        EObject lv_ingredients_12_0 = null;

        EObject lv_ustensils_13_0 = null;

        EObject lv_instructions_14_0 = null;



        	enterRule();

        try {
            // InternalRecipe.g:400:2: ( (otherlv_0= 'recipe' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ( (lv_suitename_5_0= RULE_ID ) )* otherlv_6= 'time' otherlv_7= ':' ( (lv_time_8_0= RULE_DOUBLE ) ) otherlv_9= 'nb_pers' otherlv_10= ':' ( (lv_nb_11_0= RULE_DOUBLE ) ) ( (lv_ingredients_12_0= ruleIngredients ) ) ( (lv_ustensils_13_0= ruleUstensils ) ) ( (lv_instructions_14_0= ruleInstructions ) ) otherlv_15= '}' ) )
            // InternalRecipe.g:401:2: (otherlv_0= 'recipe' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ( (lv_suitename_5_0= RULE_ID ) )* otherlv_6= 'time' otherlv_7= ':' ( (lv_time_8_0= RULE_DOUBLE ) ) otherlv_9= 'nb_pers' otherlv_10= ':' ( (lv_nb_11_0= RULE_DOUBLE ) ) ( (lv_ingredients_12_0= ruleIngredients ) ) ( (lv_ustensils_13_0= ruleUstensils ) ) ( (lv_instructions_14_0= ruleInstructions ) ) otherlv_15= '}' )
            {
            // InternalRecipe.g:401:2: (otherlv_0= 'recipe' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ( (lv_suitename_5_0= RULE_ID ) )* otherlv_6= 'time' otherlv_7= ':' ( (lv_time_8_0= RULE_DOUBLE ) ) otherlv_9= 'nb_pers' otherlv_10= ':' ( (lv_nb_11_0= RULE_DOUBLE ) ) ( (lv_ingredients_12_0= ruleIngredients ) ) ( (lv_ustensils_13_0= ruleUstensils ) ) ( (lv_instructions_14_0= ruleInstructions ) ) otherlv_15= '}' )
            // InternalRecipe.g:402:3: otherlv_0= 'recipe' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= RULE_ID ) ) ( (lv_suitename_5_0= RULE_ID ) )* otherlv_6= 'time' otherlv_7= ':' ( (lv_time_8_0= RULE_DOUBLE ) ) otherlv_9= 'nb_pers' otherlv_10= ':' ( (lv_nb_11_0= RULE_DOUBLE ) ) ( (lv_ingredients_12_0= ruleIngredients ) ) ( (lv_ustensils_13_0= ruleUstensils ) ) ( (lv_instructions_14_0= ruleInstructions ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRecipeAccess().getRecipeKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getRecipeAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRecipeAccess().getColonKeyword_3());
            		
            // InternalRecipe.g:418:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalRecipe.g:419:4: (lv_name_4_0= RULE_ID )
            {
            // InternalRecipe.g:419:4: (lv_name_4_0= RULE_ID )
            // InternalRecipe.g:420:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_4_0, grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRecipe.g:436:3: ( (lv_suitename_5_0= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRecipe.g:437:4: (lv_suitename_5_0= RULE_ID )
            	    {
            	    // InternalRecipe.g:437:4: (lv_suitename_5_0= RULE_ID )
            	    // InternalRecipe.g:438:5: lv_suitename_5_0= RULE_ID
            	    {
            	    lv_suitename_5_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    					newLeafNode(lv_suitename_5_0, grammarAccess.getRecipeAccess().getSuitenameIDTerminalRuleCall_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getRecipeRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"suitename",
            	    						lv_suitename_5_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getRecipeAccess().getTimeKeyword_6());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getColonKeyword_7());
            		
            // InternalRecipe.g:462:3: ( (lv_time_8_0= RULE_DOUBLE ) )
            // InternalRecipe.g:463:4: (lv_time_8_0= RULE_DOUBLE )
            {
            // InternalRecipe.g:463:4: (lv_time_8_0= RULE_DOUBLE )
            // InternalRecipe.g:464:5: lv_time_8_0= RULE_DOUBLE
            {
            lv_time_8_0=(Token)match(input,RULE_DOUBLE,FOLLOW_18); 

            					newLeafNode(lv_time_8_0, grammarAccess.getRecipeAccess().getTimeDOUBLETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_8_0,
            						"cuisine.recipe.Recipe.DOUBLE");
            				

            }


            }

            otherlv_9=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getRecipeAccess().getNb_persKeyword_9());
            		
            otherlv_10=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getRecipeAccess().getColonKeyword_10());
            		
            // InternalRecipe.g:488:3: ( (lv_nb_11_0= RULE_DOUBLE ) )
            // InternalRecipe.g:489:4: (lv_nb_11_0= RULE_DOUBLE )
            {
            // InternalRecipe.g:489:4: (lv_nb_11_0= RULE_DOUBLE )
            // InternalRecipe.g:490:5: lv_nb_11_0= RULE_DOUBLE
            {
            lv_nb_11_0=(Token)match(input,RULE_DOUBLE,FOLLOW_19); 

            					newLeafNode(lv_nb_11_0, grammarAccess.getRecipeAccess().getNbDOUBLETerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecipeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nb",
            						lv_nb_11_0,
            						"cuisine.recipe.Recipe.DOUBLE");
            				

            }


            }

            // InternalRecipe.g:506:3: ( (lv_ingredients_12_0= ruleIngredients ) )
            // InternalRecipe.g:507:4: (lv_ingredients_12_0= ruleIngredients )
            {
            // InternalRecipe.g:507:4: (lv_ingredients_12_0= ruleIngredients )
            // InternalRecipe.g:508:5: lv_ingredients_12_0= ruleIngredients
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngredientsParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_20);
            lv_ingredients_12_0=ruleIngredients();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"ingredients",
            						lv_ingredients_12_0,
            						"cuisine.recipe.Recipe.Ingredients");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipe.g:525:3: ( (lv_ustensils_13_0= ruleUstensils ) )
            // InternalRecipe.g:526:4: (lv_ustensils_13_0= ruleUstensils )
            {
            // InternalRecipe.g:526:4: (lv_ustensils_13_0= ruleUstensils )
            // InternalRecipe.g:527:5: lv_ustensils_13_0= ruleUstensils
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getUstensilsUstensilsParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_21);
            lv_ustensils_13_0=ruleUstensils();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"ustensils",
            						lv_ustensils_13_0,
            						"cuisine.recipe.Recipe.Ustensils");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipe.g:544:3: ( (lv_instructions_14_0= ruleInstructions ) )
            // InternalRecipe.g:545:4: (lv_instructions_14_0= ruleInstructions )
            {
            // InternalRecipe.g:545:4: (lv_instructions_14_0= ruleInstructions )
            // InternalRecipe.g:546:5: lv_instructions_14_0= ruleInstructions
            {

            					newCompositeNode(grammarAccess.getRecipeAccess().getInstructionsInstructionsParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_11);
            lv_instructions_14_0=ruleInstructions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecipeRule());
            					}
            					set(
            						current,
            						"instructions",
            						lv_instructions_14_0,
            						"cuisine.recipe.Recipe.Instructions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRuleUstensils"
    // InternalRecipe.g:571:1: entryRuleUstensils returns [EObject current=null] : iv_ruleUstensils= ruleUstensils EOF ;
    public final EObject entryRuleUstensils() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUstensils = null;


        try {
            // InternalRecipe.g:571:50: (iv_ruleUstensils= ruleUstensils EOF )
            // InternalRecipe.g:572:2: iv_ruleUstensils= ruleUstensils EOF
            {
             newCompositeNode(grammarAccess.getUstensilsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUstensils=ruleUstensils();

            state._fsp--;

             current =iv_ruleUstensils; 
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
    // $ANTLR end "entryRuleUstensils"


    // $ANTLR start "ruleUstensils"
    // InternalRecipe.g:578:1: ruleUstensils returns [EObject current=null] : ( () otherlv_1= 'ustensils' otherlv_2= ':' otherlv_3= '{' ( (lv_ustr_4_0= ruleUstensil ) )* otherlv_5= '}' ) ;
    public final EObject ruleUstensils() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ustr_4_0 = null;



        	enterRule();

        try {
            // InternalRecipe.g:584:2: ( ( () otherlv_1= 'ustensils' otherlv_2= ':' otherlv_3= '{' ( (lv_ustr_4_0= ruleUstensil ) )* otherlv_5= '}' ) )
            // InternalRecipe.g:585:2: ( () otherlv_1= 'ustensils' otherlv_2= ':' otherlv_3= '{' ( (lv_ustr_4_0= ruleUstensil ) )* otherlv_5= '}' )
            {
            // InternalRecipe.g:585:2: ( () otherlv_1= 'ustensils' otherlv_2= ':' otherlv_3= '{' ( (lv_ustr_4_0= ruleUstensil ) )* otherlv_5= '}' )
            // InternalRecipe.g:586:3: () otherlv_1= 'ustensils' otherlv_2= ':' otherlv_3= '{' ( (lv_ustr_4_0= ruleUstensil ) )* otherlv_5= '}'
            {
            // InternalRecipe.g:586:3: ()
            // InternalRecipe.g:587:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUstensilsAccess().getUstensilsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getUstensilsAccess().getUstensilsKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getUstensilsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getUstensilsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRecipe.g:605:3: ( (lv_ustr_4_0= ruleUstensil ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRecipe.g:606:4: (lv_ustr_4_0= ruleUstensil )
            	    {
            	    // InternalRecipe.g:606:4: (lv_ustr_4_0= ruleUstensil )
            	    // InternalRecipe.g:607:5: lv_ustr_4_0= ruleUstensil
            	    {

            	    					newCompositeNode(grammarAccess.getUstensilsAccess().getUstrUstensilParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_ustr_4_0=ruleUstensil();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUstensilsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ustr",
            	    						lv_ustr_4_0,
            	    						"cuisine.recipe.Recipe.Ustensil");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUstensilsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleUstensils"


    // $ANTLR start "entryRuleUstensil"
    // InternalRecipe.g:632:1: entryRuleUstensil returns [EObject current=null] : iv_ruleUstensil= ruleUstensil EOF ;
    public final EObject entryRuleUstensil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUstensil = null;


        try {
            // InternalRecipe.g:632:49: (iv_ruleUstensil= ruleUstensil EOF )
            // InternalRecipe.g:633:2: iv_ruleUstensil= ruleUstensil EOF
            {
             newCompositeNode(grammarAccess.getUstensilRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUstensil=ruleUstensil();

            state._fsp--;

             current =iv_ruleUstensil; 
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
    // $ANTLR end "entryRuleUstensil"


    // $ANTLR start "ruleUstensil"
    // InternalRecipe.g:639:1: ruleUstensil returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUstensil() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRecipe.g:645:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRecipe.g:646:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRecipe.g:646:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRecipe.g:647:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRecipe.g:647:3: (lv_name_0_0= RULE_ID )
            // InternalRecipe.g:648:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUstensilAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUstensilRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleUstensil"


    // $ANTLR start "entryRuleIngredients"
    // InternalRecipe.g:667:1: entryRuleIngredients returns [EObject current=null] : iv_ruleIngredients= ruleIngredients EOF ;
    public final EObject entryRuleIngredients() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredients = null;


        try {
            // InternalRecipe.g:667:52: (iv_ruleIngredients= ruleIngredients EOF )
            // InternalRecipe.g:668:2: iv_ruleIngredients= ruleIngredients EOF
            {
             newCompositeNode(grammarAccess.getIngredientsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredients=ruleIngredients();

            state._fsp--;

             current =iv_ruleIngredients; 
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
    // $ANTLR end "entryRuleIngredients"


    // $ANTLR start "ruleIngredients"
    // InternalRecipe.g:674:1: ruleIngredients returns [EObject current=null] : ( () otherlv_1= 'ingredients' otherlv_2= ':' otherlv_3= '{' ( (lv_ingr_4_0= ruleIngredient ) )* otherlv_5= '}' ) ;
    public final EObject ruleIngredients() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ingr_4_0 = null;



        	enterRule();

        try {
            // InternalRecipe.g:680:2: ( ( () otherlv_1= 'ingredients' otherlv_2= ':' otherlv_3= '{' ( (lv_ingr_4_0= ruleIngredient ) )* otherlv_5= '}' ) )
            // InternalRecipe.g:681:2: ( () otherlv_1= 'ingredients' otherlv_2= ':' otherlv_3= '{' ( (lv_ingr_4_0= ruleIngredient ) )* otherlv_5= '}' )
            {
            // InternalRecipe.g:681:2: ( () otherlv_1= 'ingredients' otherlv_2= ':' otherlv_3= '{' ( (lv_ingr_4_0= ruleIngredient ) )* otherlv_5= '}' )
            // InternalRecipe.g:682:3: () otherlv_1= 'ingredients' otherlv_2= ':' otherlv_3= '{' ( (lv_ingr_4_0= ruleIngredient ) )* otherlv_5= '}'
            {
            // InternalRecipe.g:682:3: ()
            // InternalRecipe.g:683:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIngredientsAccess().getIngredientsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getIngredientsAccess().getIngredientsKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getIngredientsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getIngredientsAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRecipe.g:701:3: ( (lv_ingr_4_0= ruleIngredient ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRecipe.g:702:4: (lv_ingr_4_0= ruleIngredient )
            	    {
            	    // InternalRecipe.g:702:4: (lv_ingr_4_0= ruleIngredient )
            	    // InternalRecipe.g:703:5: lv_ingr_4_0= ruleIngredient
            	    {

            	    					newCompositeNode(grammarAccess.getIngredientsAccess().getIngrIngredientParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_ingr_4_0=ruleIngredient();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIngredientsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ingr",
            	    						lv_ingr_4_0,
            	    						"cuisine.recipe.Recipe.Ingredient");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIngredientsAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleIngredients"


    // $ANTLR start "entryRuleIngredient"
    // InternalRecipe.g:728:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // InternalRecipe.g:728:51: (iv_ruleIngredient= ruleIngredient EOF )
            // InternalRecipe.g:729:2: iv_ruleIngredient= ruleIngredient EOF
            {
             newCompositeNode(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngredient=ruleIngredient();

            state._fsp--;

             current =iv_ruleIngredient; 
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
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalRecipe.g:735:1: ruleIngredient returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_suitenameIngredient_1_0= RULE_ID ) )* otherlv_2= ':' ( (lv_qte_3_0= RULE_DOUBLE ) ) ( (lv_quantificateur_4_0= ruleQuantificateurs ) ) (otherlv_5= '#' ( (lv_group_6_0= RULE_ID ) ) )? (otherlv_7= '@' ( (lv_tag_8_0= RULE_ID ) ) )? ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_suitenameIngredient_1_0=null;
        Token otherlv_2=null;
        Token lv_qte_3_0=null;
        Token otherlv_5=null;
        Token lv_group_6_0=null;
        Token otherlv_7=null;
        Token lv_tag_8_0=null;
        EObject lv_quantificateur_4_0 = null;



        	enterRule();

        try {
            // InternalRecipe.g:741:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_suitenameIngredient_1_0= RULE_ID ) )* otherlv_2= ':' ( (lv_qte_3_0= RULE_DOUBLE ) ) ( (lv_quantificateur_4_0= ruleQuantificateurs ) ) (otherlv_5= '#' ( (lv_group_6_0= RULE_ID ) ) )? (otherlv_7= '@' ( (lv_tag_8_0= RULE_ID ) ) )? ) )
            // InternalRecipe.g:742:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_suitenameIngredient_1_0= RULE_ID ) )* otherlv_2= ':' ( (lv_qte_3_0= RULE_DOUBLE ) ) ( (lv_quantificateur_4_0= ruleQuantificateurs ) ) (otherlv_5= '#' ( (lv_group_6_0= RULE_ID ) ) )? (otherlv_7= '@' ( (lv_tag_8_0= RULE_ID ) ) )? )
            {
            // InternalRecipe.g:742:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_suitenameIngredient_1_0= RULE_ID ) )* otherlv_2= ':' ( (lv_qte_3_0= RULE_DOUBLE ) ) ( (lv_quantificateur_4_0= ruleQuantificateurs ) ) (otherlv_5= '#' ( (lv_group_6_0= RULE_ID ) ) )? (otherlv_7= '@' ( (lv_tag_8_0= RULE_ID ) ) )? )
            // InternalRecipe.g:743:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_suitenameIngredient_1_0= RULE_ID ) )* otherlv_2= ':' ( (lv_qte_3_0= RULE_DOUBLE ) ) ( (lv_quantificateur_4_0= ruleQuantificateurs ) ) (otherlv_5= '#' ( (lv_group_6_0= RULE_ID ) ) )? (otherlv_7= '@' ( (lv_tag_8_0= RULE_ID ) ) )?
            {
            // InternalRecipe.g:743:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRecipe.g:744:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRecipe.g:744:4: (lv_name_0_0= RULE_ID )
            // InternalRecipe.g:745:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_0_0, grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRecipe.g:761:3: ( (lv_suitenameIngredient_1_0= RULE_ID ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRecipe.g:762:4: (lv_suitenameIngredient_1_0= RULE_ID )
            	    {
            	    // InternalRecipe.g:762:4: (lv_suitenameIngredient_1_0= RULE_ID )
            	    // InternalRecipe.g:763:5: lv_suitenameIngredient_1_0= RULE_ID
            	    {
            	    lv_suitenameIngredient_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    					newLeafNode(lv_suitenameIngredient_1_0, grammarAccess.getIngredientAccess().getSuitenameIngredientIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getIngredientRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"suitenameIngredient",
            	    						lv_suitenameIngredient_1_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getIngredientAccess().getColonKeyword_2());
            		
            // InternalRecipe.g:783:3: ( (lv_qte_3_0= RULE_DOUBLE ) )
            // InternalRecipe.g:784:4: (lv_qte_3_0= RULE_DOUBLE )
            {
            // InternalRecipe.g:784:4: (lv_qte_3_0= RULE_DOUBLE )
            // InternalRecipe.g:785:5: lv_qte_3_0= RULE_DOUBLE
            {
            lv_qte_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_24); 

            					newLeafNode(lv_qte_3_0, grammarAccess.getIngredientAccess().getQteDOUBLETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qte",
            						lv_qte_3_0,
            						"cuisine.recipe.Recipe.DOUBLE");
            				

            }


            }

            // InternalRecipe.g:801:3: ( (lv_quantificateur_4_0= ruleQuantificateurs ) )
            // InternalRecipe.g:802:4: (lv_quantificateur_4_0= ruleQuantificateurs )
            {
            // InternalRecipe.g:802:4: (lv_quantificateur_4_0= ruleQuantificateurs )
            // InternalRecipe.g:803:5: lv_quantificateur_4_0= ruleQuantificateurs
            {

            					newCompositeNode(grammarAccess.getIngredientAccess().getQuantificateurQuantificateursParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_quantificateur_4_0=ruleQuantificateurs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngredientRule());
            					}
            					set(
            						current,
            						"quantificateur",
            						lv_quantificateur_4_0,
            						"cuisine.recipe.Recipe.Quantificateurs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRecipe.g:820:3: (otherlv_5= '#' ( (lv_group_6_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRecipe.g:821:4: otherlv_5= '#' ( (lv_group_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getIngredientAccess().getNumberSignKeyword_5_0());
                    			
                    // InternalRecipe.g:825:4: ( (lv_group_6_0= RULE_ID ) )
                    // InternalRecipe.g:826:5: (lv_group_6_0= RULE_ID )
                    {
                    // InternalRecipe.g:826:5: (lv_group_6_0= RULE_ID )
                    // InternalRecipe.g:827:6: lv_group_6_0= RULE_ID
                    {
                    lv_group_6_0=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(lv_group_6_0, grammarAccess.getIngredientAccess().getGroupIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngredientRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"group",
                    							lv_group_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRecipe.g:844:3: (otherlv_7= '@' ( (lv_tag_8_0= RULE_ID ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRecipe.g:845:4: otherlv_7= '@' ( (lv_tag_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getIngredientAccess().getCommercialAtKeyword_6_0());
                    			
                    // InternalRecipe.g:849:4: ( (lv_tag_8_0= RULE_ID ) )
                    // InternalRecipe.g:850:5: (lv_tag_8_0= RULE_ID )
                    {
                    // InternalRecipe.g:850:5: (lv_tag_8_0= RULE_ID )
                    // InternalRecipe.g:851:6: lv_tag_8_0= RULE_ID
                    {
                    lv_tag_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_tag_8_0, grammarAccess.getIngredientAccess().getTagIDTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngredientRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tag",
                    							lv_tag_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleQuantificateurs"
    // InternalRecipe.g:872:1: entryRuleQuantificateurs returns [EObject current=null] : iv_ruleQuantificateurs= ruleQuantificateurs EOF ;
    public final EObject entryRuleQuantificateurs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantificateurs = null;


        try {
            // InternalRecipe.g:872:56: (iv_ruleQuantificateurs= ruleQuantificateurs EOF )
            // InternalRecipe.g:873:2: iv_ruleQuantificateurs= ruleQuantificateurs EOF
            {
             newCompositeNode(grammarAccess.getQuantificateursRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantificateurs=ruleQuantificateurs();

            state._fsp--;

             current =iv_ruleQuantificateurs; 
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
    // $ANTLR end "entryRuleQuantificateurs"


    // $ANTLR start "ruleQuantificateurs"
    // InternalRecipe.g:879:1: ruleQuantificateurs returns [EObject current=null] : ( ( () otherlv_1= 'c\\u00E0c' ) | ( () otherlv_3= 'c\\u00E0s' ) | ( () ( (lv_unit_5_0= ruleUnit ) )? (otherlv_6= 'g' | otherlv_7= 'l' ) ) ) ;
    public final EObject ruleQuantificateurs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_unit_5_0 = null;



        	enterRule();

        try {
            // InternalRecipe.g:885:2: ( ( ( () otherlv_1= 'c\\u00E0c' ) | ( () otherlv_3= 'c\\u00E0s' ) | ( () ( (lv_unit_5_0= ruleUnit ) )? (otherlv_6= 'g' | otherlv_7= 'l' ) ) ) )
            // InternalRecipe.g:886:2: ( ( () otherlv_1= 'c\\u00E0c' ) | ( () otherlv_3= 'c\\u00E0s' ) | ( () ( (lv_unit_5_0= ruleUnit ) )? (otherlv_6= 'g' | otherlv_7= 'l' ) ) )
            {
            // InternalRecipe.g:886:2: ( ( () otherlv_1= 'c\\u00E0c' ) | ( () otherlv_3= 'c\\u00E0s' ) | ( () ( (lv_unit_5_0= ruleUnit ) )? (otherlv_6= 'g' | otherlv_7= 'l' ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRecipe.g:887:3: ( () otherlv_1= 'c\\u00E0c' )
                    {
                    // InternalRecipe.g:887:3: ( () otherlv_1= 'c\\u00E0c' )
                    // InternalRecipe.g:888:4: () otherlv_1= 'c\\u00E0c'
                    {
                    // InternalRecipe.g:888:4: ()
                    // InternalRecipe.g:889:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getQuantificateursAccess().getQuantificateursAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getQuantificateursAccess().getCCKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipe.g:901:3: ( () otherlv_3= 'c\\u00E0s' )
                    {
                    // InternalRecipe.g:901:3: ( () otherlv_3= 'c\\u00E0s' )
                    // InternalRecipe.g:902:4: () otherlv_3= 'c\\u00E0s'
                    {
                    // InternalRecipe.g:902:4: ()
                    // InternalRecipe.g:903:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getQuantificateursAccess().getQuantificateursAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuantificateursAccess().getCSKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipe.g:915:3: ( () ( (lv_unit_5_0= ruleUnit ) )? (otherlv_6= 'g' | otherlv_7= 'l' ) )
                    {
                    // InternalRecipe.g:915:3: ( () ( (lv_unit_5_0= ruleUnit ) )? (otherlv_6= 'g' | otherlv_7= 'l' ) )
                    // InternalRecipe.g:916:4: () ( (lv_unit_5_0= ruleUnit ) )? (otherlv_6= 'g' | otherlv_7= 'l' )
                    {
                    // InternalRecipe.g:916:4: ()
                    // InternalRecipe.g:917:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getQuantificateursAccess().getQuantificateursAction_2_0(),
                    						current);
                    				

                    }

                    // InternalRecipe.g:923:4: ( (lv_unit_5_0= ruleUnit ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=36 && LA14_0<=41)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalRecipe.g:924:5: (lv_unit_5_0= ruleUnit )
                            {
                            // InternalRecipe.g:924:5: (lv_unit_5_0= ruleUnit )
                            // InternalRecipe.g:925:6: lv_unit_5_0= ruleUnit
                            {

                            						newCompositeNode(grammarAccess.getQuantificateursAccess().getUnitUnitParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_27);
                            lv_unit_5_0=ruleUnit();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getQuantificateursRule());
                            						}
                            						set(
                            							current,
                            							"unit",
                            							lv_unit_5_0,
                            							"cuisine.recipe.Recipe.Unit");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalRecipe.g:942:4: (otherlv_6= 'g' | otherlv_7= 'l' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==34) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==35) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalRecipe.g:943:5: otherlv_6= 'g'
                            {
                            otherlv_6=(Token)match(input,34,FOLLOW_2); 

                            					newLeafNode(otherlv_6, grammarAccess.getQuantificateursAccess().getGKeyword_2_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRecipe.g:948:5: otherlv_7= 'l'
                            {
                            otherlv_7=(Token)match(input,35,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getQuantificateursAccess().getLKeyword_2_2_1());
                            				

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleQuantificateurs"


    // $ANTLR start "entryRuleUnit"
    // InternalRecipe.g:958:1: entryRuleUnit returns [String current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final String entryRuleUnit() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnit = null;


        try {
            // InternalRecipe.g:958:44: (iv_ruleUnit= ruleUnit EOF )
            // InternalRecipe.g:959:2: iv_ruleUnit= ruleUnit EOF
            {
             newCompositeNode(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnit=ruleUnit();

            state._fsp--;

             current =iv_ruleUnit.getText(); 
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
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalRecipe.g:965:1: ruleUnit returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'k' | kw= 'h' | kw= 'da' | kw= 'd' | kw= 'c' | kw= 'm' ) ;
    public final AntlrDatatypeRuleToken ruleUnit() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRecipe.g:971:2: ( (kw= 'k' | kw= 'h' | kw= 'da' | kw= 'd' | kw= 'c' | kw= 'm' ) )
            // InternalRecipe.g:972:2: (kw= 'k' | kw= 'h' | kw= 'da' | kw= 'd' | kw= 'c' | kw= 'm' )
            {
            // InternalRecipe.g:972:2: (kw= 'k' | kw= 'h' | kw= 'da' | kw= 'd' | kw= 'c' | kw= 'm' )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt17=1;
                }
                break;
            case 37:
                {
                alt17=2;
                }
                break;
            case 38:
                {
                alt17=3;
                }
                break;
            case 39:
                {
                alt17=4;
                }
                break;
            case 40:
                {
                alt17=5;
                }
                break;
            case 41:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalRecipe.g:973:3: kw= 'k'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getKKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRecipe.g:979:3: kw= 'h'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getHKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRecipe.g:985:3: kw= 'da'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getDaKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRecipe.g:991:3: kw= 'd'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getDKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRecipe.g:997:3: kw= 'c'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getCKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRecipe.g:1003:3: kw= 'm'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnitAccess().getMKeyword_5());
                    		

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
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleInstructions"
    // InternalRecipe.g:1012:1: entryRuleInstructions returns [EObject current=null] : iv_ruleInstructions= ruleInstructions EOF ;
    public final EObject entryRuleInstructions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstructions = null;


        try {
            // InternalRecipe.g:1012:53: (iv_ruleInstructions= ruleInstructions EOF )
            // InternalRecipe.g:1013:2: iv_ruleInstructions= ruleInstructions EOF
            {
             newCompositeNode(grammarAccess.getInstructionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstructions=ruleInstructions();

            state._fsp--;

             current =iv_ruleInstructions; 
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
    // $ANTLR end "entryRuleInstructions"


    // $ANTLR start "ruleInstructions"
    // InternalRecipe.g:1019:1: ruleInstructions returns [EObject current=null] : ( () otherlv_1= 'instructions' otherlv_2= ':' otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleInstructions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRecipe.g:1025:2: ( ( () otherlv_1= 'instructions' otherlv_2= ':' otherlv_3= '{' otherlv_4= '}' ) )
            // InternalRecipe.g:1026:2: ( () otherlv_1= 'instructions' otherlv_2= ':' otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalRecipe.g:1026:2: ( () otherlv_1= 'instructions' otherlv_2= ':' otherlv_3= '{' otherlv_4= '}' )
            // InternalRecipe.g:1027:3: () otherlv_1= 'instructions' otherlv_2= ':' otherlv_3= '{' otherlv_4= '}'
            {
            // InternalRecipe.g:1027:3: ()
            // InternalRecipe.g:1028:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstructionsAccess().getInstructionsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getInstructionsAccess().getInstructionsKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getInstructionsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getInstructionsAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInstructionsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInstructions"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000801002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007CA000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000007CA002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000003FF00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000000L});

}