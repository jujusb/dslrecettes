package cuisine.recipe.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import cuisine.recipe.services.RecipeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRecipeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ingredient'", "'ustensil'", "'preparation'", "'temperature'", "'tool'", "'g'", "'l'", "'k'", "'h'", "'da'", "'d'", "'c'", "'m'", "'define'", "'['", "']'", "'{'", "'}'", "','", "'recipe'", "'name'", "':'", "'time'", "'nb_pers'", "'ustensils'", "'ingredients'", "'#'", "'@'", "'c\\u00E0c'", "'c\\u00E0s'", "'instructions'"
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

    	public void setGrammarAccess(RecipeGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalRecipe.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalRecipe.g:54:1: ( ruleModel EOF )
            // InternalRecipe.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRecipe.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalRecipe.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalRecipe.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalRecipe.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalRecipe.g:69:3: ( rule__Model__Group__0 )
            // InternalRecipe.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTechnique"
    // InternalRecipe.g:78:1: entryRuleTechnique : ruleTechnique EOF ;
    public final void entryRuleTechnique() throws RecognitionException {
        try {
            // InternalRecipe.g:79:1: ( ruleTechnique EOF )
            // InternalRecipe.g:80:1: ruleTechnique EOF
            {
             before(grammarAccess.getTechniqueRule()); 
            pushFollow(FOLLOW_1);
            ruleTechnique();

            state._fsp--;

             after(grammarAccess.getTechniqueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTechnique"


    // $ANTLR start "ruleTechnique"
    // InternalRecipe.g:87:1: ruleTechnique : ( ( rule__Technique__Group__0 ) ) ;
    public final void ruleTechnique() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:91:2: ( ( ( rule__Technique__Group__0 ) ) )
            // InternalRecipe.g:92:2: ( ( rule__Technique__Group__0 ) )
            {
            // InternalRecipe.g:92:2: ( ( rule__Technique__Group__0 ) )
            // InternalRecipe.g:93:3: ( rule__Technique__Group__0 )
            {
             before(grammarAccess.getTechniqueAccess().getGroup()); 
            // InternalRecipe.g:94:3: ( rule__Technique__Group__0 )
            // InternalRecipe.g:94:4: rule__Technique__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Technique__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTechniqueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTechnique"


    // $ANTLR start "rulechoices"
    // InternalRecipe.g:104:1: rulechoices : ( ( rule__Choices__Alternatives ) ) ;
    public final void rulechoices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:108:2: ( ( ( rule__Choices__Alternatives ) ) )
            // InternalRecipe.g:109:2: ( ( rule__Choices__Alternatives ) )
            {
            // InternalRecipe.g:109:2: ( ( rule__Choices__Alternatives ) )
            // InternalRecipe.g:110:3: ( rule__Choices__Alternatives )
            {
             before(grammarAccess.getChoicesAccess().getAlternatives()); 
            // InternalRecipe.g:111:3: ( rule__Choices__Alternatives )
            // InternalRecipe.g:111:4: rule__Choices__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Choices__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChoicesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulechoices"


    // $ANTLR start "entryRuleIngrUslTech"
    // InternalRecipe.g:120:1: entryRuleIngrUslTech : ruleIngrUslTech EOF ;
    public final void entryRuleIngrUslTech() throws RecognitionException {
        try {
            // InternalRecipe.g:121:1: ( ruleIngrUslTech EOF )
            // InternalRecipe.g:122:1: ruleIngrUslTech EOF
            {
             before(grammarAccess.getIngrUslTechRule()); 
            pushFollow(FOLLOW_1);
            ruleIngrUslTech();

            state._fsp--;

             after(grammarAccess.getIngrUslTechRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngrUslTech"


    // $ANTLR start "ruleIngrUslTech"
    // InternalRecipe.g:129:1: ruleIngrUslTech : ( ( rule__IngrUslTech__Alternatives ) ) ;
    public final void ruleIngrUslTech() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:133:2: ( ( ( rule__IngrUslTech__Alternatives ) ) )
            // InternalRecipe.g:134:2: ( ( rule__IngrUslTech__Alternatives ) )
            {
            // InternalRecipe.g:134:2: ( ( rule__IngrUslTech__Alternatives ) )
            // InternalRecipe.g:135:3: ( rule__IngrUslTech__Alternatives )
            {
             before(grammarAccess.getIngrUslTechAccess().getAlternatives()); 
            // InternalRecipe.g:136:3: ( rule__IngrUslTech__Alternatives )
            // InternalRecipe.g:136:4: rule__IngrUslTech__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IngrUslTech__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIngrUslTechAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngrUslTech"


    // $ANTLR start "entryRuleRecipe"
    // InternalRecipe.g:145:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // InternalRecipe.g:146:1: ( ruleRecipe EOF )
            // InternalRecipe.g:147:1: ruleRecipe EOF
            {
             before(grammarAccess.getRecipeRule()); 
            pushFollow(FOLLOW_1);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // InternalRecipe.g:154:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:158:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // InternalRecipe.g:159:2: ( ( rule__Recipe__Group__0 ) )
            {
            // InternalRecipe.g:159:2: ( ( rule__Recipe__Group__0 ) )
            // InternalRecipe.g:160:3: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // InternalRecipe.g:161:3: ( rule__Recipe__Group__0 )
            // InternalRecipe.g:161:4: rule__Recipe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRuleUstensils"
    // InternalRecipe.g:170:1: entryRuleUstensils : ruleUstensils EOF ;
    public final void entryRuleUstensils() throws RecognitionException {
        try {
            // InternalRecipe.g:171:1: ( ruleUstensils EOF )
            // InternalRecipe.g:172:1: ruleUstensils EOF
            {
             before(grammarAccess.getUstensilsRule()); 
            pushFollow(FOLLOW_1);
            ruleUstensils();

            state._fsp--;

             after(grammarAccess.getUstensilsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUstensils"


    // $ANTLR start "ruleUstensils"
    // InternalRecipe.g:179:1: ruleUstensils : ( ( rule__Ustensils__Group__0 ) ) ;
    public final void ruleUstensils() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:183:2: ( ( ( rule__Ustensils__Group__0 ) ) )
            // InternalRecipe.g:184:2: ( ( rule__Ustensils__Group__0 ) )
            {
            // InternalRecipe.g:184:2: ( ( rule__Ustensils__Group__0 ) )
            // InternalRecipe.g:185:3: ( rule__Ustensils__Group__0 )
            {
             before(grammarAccess.getUstensilsAccess().getGroup()); 
            // InternalRecipe.g:186:3: ( rule__Ustensils__Group__0 )
            // InternalRecipe.g:186:4: rule__Ustensils__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ustensils__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUstensilsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUstensils"


    // $ANTLR start "entryRuleUstensil"
    // InternalRecipe.g:195:1: entryRuleUstensil : ruleUstensil EOF ;
    public final void entryRuleUstensil() throws RecognitionException {
        try {
            // InternalRecipe.g:196:1: ( ruleUstensil EOF )
            // InternalRecipe.g:197:1: ruleUstensil EOF
            {
             before(grammarAccess.getUstensilRule()); 
            pushFollow(FOLLOW_1);
            ruleUstensil();

            state._fsp--;

             after(grammarAccess.getUstensilRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUstensil"


    // $ANTLR start "ruleUstensil"
    // InternalRecipe.g:204:1: ruleUstensil : ( ( rule__Ustensil__NameAssignment ) ) ;
    public final void ruleUstensil() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:208:2: ( ( ( rule__Ustensil__NameAssignment ) ) )
            // InternalRecipe.g:209:2: ( ( rule__Ustensil__NameAssignment ) )
            {
            // InternalRecipe.g:209:2: ( ( rule__Ustensil__NameAssignment ) )
            // InternalRecipe.g:210:3: ( rule__Ustensil__NameAssignment )
            {
             before(grammarAccess.getUstensilAccess().getNameAssignment()); 
            // InternalRecipe.g:211:3: ( rule__Ustensil__NameAssignment )
            // InternalRecipe.g:211:4: rule__Ustensil__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Ustensil__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUstensilAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUstensil"


    // $ANTLR start "entryRuleIngredients"
    // InternalRecipe.g:220:1: entryRuleIngredients : ruleIngredients EOF ;
    public final void entryRuleIngredients() throws RecognitionException {
        try {
            // InternalRecipe.g:221:1: ( ruleIngredients EOF )
            // InternalRecipe.g:222:1: ruleIngredients EOF
            {
             before(grammarAccess.getIngredientsRule()); 
            pushFollow(FOLLOW_1);
            ruleIngredients();

            state._fsp--;

             after(grammarAccess.getIngredientsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngredients"


    // $ANTLR start "ruleIngredients"
    // InternalRecipe.g:229:1: ruleIngredients : ( ( rule__Ingredients__Group__0 ) ) ;
    public final void ruleIngredients() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:233:2: ( ( ( rule__Ingredients__Group__0 ) ) )
            // InternalRecipe.g:234:2: ( ( rule__Ingredients__Group__0 ) )
            {
            // InternalRecipe.g:234:2: ( ( rule__Ingredients__Group__0 ) )
            // InternalRecipe.g:235:3: ( rule__Ingredients__Group__0 )
            {
             before(grammarAccess.getIngredientsAccess().getGroup()); 
            // InternalRecipe.g:236:3: ( rule__Ingredients__Group__0 )
            // InternalRecipe.g:236:4: rule__Ingredients__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredients"


    // $ANTLR start "entryRuleIngredient"
    // InternalRecipe.g:245:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // InternalRecipe.g:246:1: ( ruleIngredient EOF )
            // InternalRecipe.g:247:1: ruleIngredient EOF
            {
             before(grammarAccess.getIngredientRule()); 
            pushFollow(FOLLOW_1);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // InternalRecipe.g:254:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:258:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // InternalRecipe.g:259:2: ( ( rule__Ingredient__Group__0 ) )
            {
            // InternalRecipe.g:259:2: ( ( rule__Ingredient__Group__0 ) )
            // InternalRecipe.g:260:3: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // InternalRecipe.g:261:3: ( rule__Ingredient__Group__0 )
            // InternalRecipe.g:261:4: rule__Ingredient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "entryRuleQuantificateurs"
    // InternalRecipe.g:270:1: entryRuleQuantificateurs : ruleQuantificateurs EOF ;
    public final void entryRuleQuantificateurs() throws RecognitionException {
        try {
            // InternalRecipe.g:271:1: ( ruleQuantificateurs EOF )
            // InternalRecipe.g:272:1: ruleQuantificateurs EOF
            {
             before(grammarAccess.getQuantificateursRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantificateurs();

            state._fsp--;

             after(grammarAccess.getQuantificateursRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuantificateurs"


    // $ANTLR start "ruleQuantificateurs"
    // InternalRecipe.g:279:1: ruleQuantificateurs : ( ( rule__Quantificateurs__Alternatives ) ) ;
    public final void ruleQuantificateurs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:283:2: ( ( ( rule__Quantificateurs__Alternatives ) ) )
            // InternalRecipe.g:284:2: ( ( rule__Quantificateurs__Alternatives ) )
            {
            // InternalRecipe.g:284:2: ( ( rule__Quantificateurs__Alternatives ) )
            // InternalRecipe.g:285:3: ( rule__Quantificateurs__Alternatives )
            {
             before(grammarAccess.getQuantificateursAccess().getAlternatives()); 
            // InternalRecipe.g:286:3: ( rule__Quantificateurs__Alternatives )
            // InternalRecipe.g:286:4: rule__Quantificateurs__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Quantificateurs__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuantificateursAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantificateurs"


    // $ANTLR start "entryRuleUnit"
    // InternalRecipe.g:295:1: entryRuleUnit : ruleUnit EOF ;
    public final void entryRuleUnit() throws RecognitionException {
        try {
            // InternalRecipe.g:296:1: ( ruleUnit EOF )
            // InternalRecipe.g:297:1: ruleUnit EOF
            {
             before(grammarAccess.getUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getUnitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // InternalRecipe.g:304:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:308:2: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalRecipe.g:309:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalRecipe.g:309:2: ( ( rule__Unit__Alternatives ) )
            // InternalRecipe.g:310:3: ( rule__Unit__Alternatives )
            {
             before(grammarAccess.getUnitAccess().getAlternatives()); 
            // InternalRecipe.g:311:3: ( rule__Unit__Alternatives )
            // InternalRecipe.g:311:4: rule__Unit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleInstructions"
    // InternalRecipe.g:320:1: entryRuleInstructions : ruleInstructions EOF ;
    public final void entryRuleInstructions() throws RecognitionException {
        try {
            // InternalRecipe.g:321:1: ( ruleInstructions EOF )
            // InternalRecipe.g:322:1: ruleInstructions EOF
            {
             before(grammarAccess.getInstructionsRule()); 
            pushFollow(FOLLOW_1);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getInstructionsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstructions"


    // $ANTLR start "ruleInstructions"
    // InternalRecipe.g:329:1: ruleInstructions : ( ( rule__Instructions__Group__0 ) ) ;
    public final void ruleInstructions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:333:2: ( ( ( rule__Instructions__Group__0 ) ) )
            // InternalRecipe.g:334:2: ( ( rule__Instructions__Group__0 ) )
            {
            // InternalRecipe.g:334:2: ( ( rule__Instructions__Group__0 ) )
            // InternalRecipe.g:335:3: ( rule__Instructions__Group__0 )
            {
             before(grammarAccess.getInstructionsAccess().getGroup()); 
            // InternalRecipe.g:336:3: ( rule__Instructions__Group__0 )
            // InternalRecipe.g:336:4: rule__Instructions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Instructions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstructions"


    // $ANTLR start "rule__Technique__Alternatives_2"
    // InternalRecipe.g:344:1: rule__Technique__Alternatives_2 : ( ( ( rule__Technique__Group_2_0__0 ) ) | ( ( rule__Technique__ObjectsAssignment_2_1 ) ) | ( ( rule__Technique__Group_2_2__0 ) ) );
    public final void rule__Technique__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:348:1: ( ( ( rule__Technique__Group_2_0__0 ) ) | ( ( rule__Technique__ObjectsAssignment_2_1 ) ) | ( ( rule__Technique__Group_2_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRecipe.g:349:2: ( ( rule__Technique__Group_2_0__0 ) )
                    {
                    // InternalRecipe.g:349:2: ( ( rule__Technique__Group_2_0__0 ) )
                    // InternalRecipe.g:350:3: ( rule__Technique__Group_2_0__0 )
                    {
                     before(grammarAccess.getTechniqueAccess().getGroup_2_0()); 
                    // InternalRecipe.g:351:3: ( rule__Technique__Group_2_0__0 )
                    // InternalRecipe.g:351:4: rule__Technique__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Technique__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechniqueAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipe.g:355:2: ( ( rule__Technique__ObjectsAssignment_2_1 ) )
                    {
                    // InternalRecipe.g:355:2: ( ( rule__Technique__ObjectsAssignment_2_1 ) )
                    // InternalRecipe.g:356:3: ( rule__Technique__ObjectsAssignment_2_1 )
                    {
                     before(grammarAccess.getTechniqueAccess().getObjectsAssignment_2_1()); 
                    // InternalRecipe.g:357:3: ( rule__Technique__ObjectsAssignment_2_1 )
                    // InternalRecipe.g:357:4: rule__Technique__ObjectsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Technique__ObjectsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechniqueAccess().getObjectsAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipe.g:361:2: ( ( rule__Technique__Group_2_2__0 ) )
                    {
                    // InternalRecipe.g:361:2: ( ( rule__Technique__Group_2_2__0 ) )
                    // InternalRecipe.g:362:3: ( rule__Technique__Group_2_2__0 )
                    {
                     before(grammarAccess.getTechniqueAccess().getGroup_2_2()); 
                    // InternalRecipe.g:363:3: ( rule__Technique__Group_2_2__0 )
                    // InternalRecipe.g:363:4: rule__Technique__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Technique__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechniqueAccess().getGroup_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Alternatives_2"


    // $ANTLR start "rule__Choices__Alternatives"
    // InternalRecipe.g:371:1: rule__Choices__Alternatives : ( ( ( rule__Choices__Group_0__0 ) ) | ( ( rule__Choices__Group_1__0 ) ) );
    public final void rule__Choices__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:375:1: ( ( ( rule__Choices__Group_0__0 ) ) | ( ( rule__Choices__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRecipe.g:376:2: ( ( rule__Choices__Group_0__0 ) )
                    {
                    // InternalRecipe.g:376:2: ( ( rule__Choices__Group_0__0 ) )
                    // InternalRecipe.g:377:3: ( rule__Choices__Group_0__0 )
                    {
                     before(grammarAccess.getChoicesAccess().getGroup_0()); 
                    // InternalRecipe.g:378:3: ( rule__Choices__Group_0__0 )
                    // InternalRecipe.g:378:4: rule__Choices__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choices__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChoicesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipe.g:382:2: ( ( rule__Choices__Group_1__0 ) )
                    {
                    // InternalRecipe.g:382:2: ( ( rule__Choices__Group_1__0 ) )
                    // InternalRecipe.g:383:3: ( rule__Choices__Group_1__0 )
                    {
                     before(grammarAccess.getChoicesAccess().getGroup_1()); 
                    // InternalRecipe.g:384:3: ( rule__Choices__Group_1__0 )
                    // InternalRecipe.g:384:4: rule__Choices__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Choices__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChoicesAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Alternatives"


    // $ANTLR start "rule__IngrUslTech__Alternatives"
    // InternalRecipe.g:392:1: rule__IngrUslTech__Alternatives : ( ( 'ingredient' ) | ( 'ustensil' ) | ( 'preparation' ) | ( 'temperature' ) | ( 'tool' ) );
    public final void rule__IngrUslTech__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:396:1: ( ( 'ingredient' ) | ( 'ustensil' ) | ( 'preparation' ) | ( 'temperature' ) | ( 'tool' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRecipe.g:397:2: ( 'ingredient' )
                    {
                    // InternalRecipe.g:397:2: ( 'ingredient' )
                    // InternalRecipe.g:398:3: 'ingredient'
                    {
                     before(grammarAccess.getIngrUslTechAccess().getIngredientKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getIngrUslTechAccess().getIngredientKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipe.g:403:2: ( 'ustensil' )
                    {
                    // InternalRecipe.g:403:2: ( 'ustensil' )
                    // InternalRecipe.g:404:3: 'ustensil'
                    {
                     before(grammarAccess.getIngrUslTechAccess().getUstensilKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getIngrUslTechAccess().getUstensilKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipe.g:409:2: ( 'preparation' )
                    {
                    // InternalRecipe.g:409:2: ( 'preparation' )
                    // InternalRecipe.g:410:3: 'preparation'
                    {
                     before(grammarAccess.getIngrUslTechAccess().getPreparationKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getIngrUslTechAccess().getPreparationKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipe.g:415:2: ( 'temperature' )
                    {
                    // InternalRecipe.g:415:2: ( 'temperature' )
                    // InternalRecipe.g:416:3: 'temperature'
                    {
                     before(grammarAccess.getIngrUslTechAccess().getTemperatureKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getIngrUslTechAccess().getTemperatureKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRecipe.g:421:2: ( 'tool' )
                    {
                    // InternalRecipe.g:421:2: ( 'tool' )
                    // InternalRecipe.g:422:3: 'tool'
                    {
                     before(grammarAccess.getIngrUslTechAccess().getToolKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getIngrUslTechAccess().getToolKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngrUslTech__Alternatives"


    // $ANTLR start "rule__Quantificateurs__Alternatives"
    // InternalRecipe.g:431:1: rule__Quantificateurs__Alternatives : ( ( ( rule__Quantificateurs__Group_0__0 ) ) | ( ( rule__Quantificateurs__Group_1__0 ) ) | ( ( rule__Quantificateurs__Group_2__0 ) ) );
    public final void rule__Quantificateurs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:435:1: ( ( ( rule__Quantificateurs__Group_0__0 ) ) | ( ( rule__Quantificateurs__Group_1__0 ) ) | ( ( rule__Quantificateurs__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRecipe.g:436:2: ( ( rule__Quantificateurs__Group_0__0 ) )
                    {
                    // InternalRecipe.g:436:2: ( ( rule__Quantificateurs__Group_0__0 ) )
                    // InternalRecipe.g:437:3: ( rule__Quantificateurs__Group_0__0 )
                    {
                     before(grammarAccess.getQuantificateursAccess().getGroup_0()); 
                    // InternalRecipe.g:438:3: ( rule__Quantificateurs__Group_0__0 )
                    // InternalRecipe.g:438:4: rule__Quantificateurs__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Quantificateurs__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuantificateursAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipe.g:442:2: ( ( rule__Quantificateurs__Group_1__0 ) )
                    {
                    // InternalRecipe.g:442:2: ( ( rule__Quantificateurs__Group_1__0 ) )
                    // InternalRecipe.g:443:3: ( rule__Quantificateurs__Group_1__0 )
                    {
                     before(grammarAccess.getQuantificateursAccess().getGroup_1()); 
                    // InternalRecipe.g:444:3: ( rule__Quantificateurs__Group_1__0 )
                    // InternalRecipe.g:444:4: rule__Quantificateurs__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Quantificateurs__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuantificateursAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipe.g:448:2: ( ( rule__Quantificateurs__Group_2__0 ) )
                    {
                    // InternalRecipe.g:448:2: ( ( rule__Quantificateurs__Group_2__0 ) )
                    // InternalRecipe.g:449:3: ( rule__Quantificateurs__Group_2__0 )
                    {
                     before(grammarAccess.getQuantificateursAccess().getGroup_2()); 
                    // InternalRecipe.g:450:3: ( rule__Quantificateurs__Group_2__0 )
                    // InternalRecipe.g:450:4: rule__Quantificateurs__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Quantificateurs__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuantificateursAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Alternatives"


    // $ANTLR start "rule__Quantificateurs__Alternatives_2_2"
    // InternalRecipe.g:458:1: rule__Quantificateurs__Alternatives_2_2 : ( ( 'g' ) | ( 'l' ) );
    public final void rule__Quantificateurs__Alternatives_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:462:1: ( ( 'g' ) | ( 'l' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRecipe.g:463:2: ( 'g' )
                    {
                    // InternalRecipe.g:463:2: ( 'g' )
                    // InternalRecipe.g:464:3: 'g'
                    {
                     before(grammarAccess.getQuantificateursAccess().getGKeyword_2_2_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getQuantificateursAccess().getGKeyword_2_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipe.g:469:2: ( 'l' )
                    {
                    // InternalRecipe.g:469:2: ( 'l' )
                    // InternalRecipe.g:470:3: 'l'
                    {
                     before(grammarAccess.getQuantificateursAccess().getLKeyword_2_2_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getQuantificateursAccess().getLKeyword_2_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Alternatives_2_2"


    // $ANTLR start "rule__Unit__Alternatives"
    // InternalRecipe.g:479:1: rule__Unit__Alternatives : ( ( 'k' ) | ( 'h' ) | ( 'da' ) | ( 'd' ) | ( 'c' ) | ( 'm' ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:483:1: ( ( 'k' ) | ( 'h' ) | ( 'da' ) | ( 'd' ) | ( 'c' ) | ( 'm' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 23:
                {
                alt6=5;
                }
                break;
            case 24:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRecipe.g:484:2: ( 'k' )
                    {
                    // InternalRecipe.g:484:2: ( 'k' )
                    // InternalRecipe.g:485:3: 'k'
                    {
                     before(grammarAccess.getUnitAccess().getKKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getKKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRecipe.g:490:2: ( 'h' )
                    {
                    // InternalRecipe.g:490:2: ( 'h' )
                    // InternalRecipe.g:491:3: 'h'
                    {
                     before(grammarAccess.getUnitAccess().getHKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getHKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRecipe.g:496:2: ( 'da' )
                    {
                    // InternalRecipe.g:496:2: ( 'da' )
                    // InternalRecipe.g:497:3: 'da'
                    {
                     before(grammarAccess.getUnitAccess().getDaKeyword_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getDaKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRecipe.g:502:2: ( 'd' )
                    {
                    // InternalRecipe.g:502:2: ( 'd' )
                    // InternalRecipe.g:503:3: 'd'
                    {
                     before(grammarAccess.getUnitAccess().getDKeyword_3()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getDKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRecipe.g:508:2: ( 'c' )
                    {
                    // InternalRecipe.g:508:2: ( 'c' )
                    // InternalRecipe.g:509:3: 'c'
                    {
                     before(grammarAccess.getUnitAccess().getCKeyword_4()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getCKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRecipe.g:514:2: ( 'm' )
                    {
                    // InternalRecipe.g:514:2: ( 'm' )
                    // InternalRecipe.g:515:3: 'm'
                    {
                     before(grammarAccess.getUnitAccess().getMKeyword_5()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getUnitAccess().getMKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalRecipe.g:524:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:528:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalRecipe.g:529:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalRecipe.g:536:1: rule__Model__Group__0__Impl : ( ( rule__Model__DefTechniquesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:540:1: ( ( ( rule__Model__DefTechniquesAssignment_0 )* ) )
            // InternalRecipe.g:541:1: ( ( rule__Model__DefTechniquesAssignment_0 )* )
            {
            // InternalRecipe.g:541:1: ( ( rule__Model__DefTechniquesAssignment_0 )* )
            // InternalRecipe.g:542:2: ( rule__Model__DefTechniquesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getDefTechniquesAssignment_0()); 
            // InternalRecipe.g:543:2: ( rule__Model__DefTechniquesAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRecipe.g:543:3: rule__Model__DefTechniquesAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__DefTechniquesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDefTechniquesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalRecipe.g:551:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:555:1: ( rule__Model__Group__1__Impl )
            // InternalRecipe.g:556:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalRecipe.g:562:1: rule__Model__Group__1__Impl : ( ( rule__Model__RecipesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:566:1: ( ( ( rule__Model__RecipesAssignment_1 )* ) )
            // InternalRecipe.g:567:1: ( ( rule__Model__RecipesAssignment_1 )* )
            {
            // InternalRecipe.g:567:1: ( ( rule__Model__RecipesAssignment_1 )* )
            // InternalRecipe.g:568:2: ( rule__Model__RecipesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getRecipesAssignment_1()); 
            // InternalRecipe.g:569:2: ( rule__Model__RecipesAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRecipe.g:569:3: rule__Model__RecipesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__RecipesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRecipesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Technique__Group__0"
    // InternalRecipe.g:578:1: rule__Technique__Group__0 : rule__Technique__Group__0__Impl rule__Technique__Group__1 ;
    public final void rule__Technique__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:582:1: ( rule__Technique__Group__0__Impl rule__Technique__Group__1 )
            // InternalRecipe.g:583:2: rule__Technique__Group__0__Impl rule__Technique__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Technique__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technique__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group__0"


    // $ANTLR start "rule__Technique__Group__0__Impl"
    // InternalRecipe.g:590:1: rule__Technique__Group__0__Impl : ( 'define' ) ;
    public final void rule__Technique__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:594:1: ( ( 'define' ) )
            // InternalRecipe.g:595:1: ( 'define' )
            {
            // InternalRecipe.g:595:1: ( 'define' )
            // InternalRecipe.g:596:2: 'define'
            {
             before(grammarAccess.getTechniqueAccess().getDefineKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTechniqueAccess().getDefineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group__0__Impl"


    // $ANTLR start "rule__Technique__Group__1"
    // InternalRecipe.g:605:1: rule__Technique__Group__1 : rule__Technique__Group__1__Impl rule__Technique__Group__2 ;
    public final void rule__Technique__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:609:1: ( rule__Technique__Group__1__Impl rule__Technique__Group__2 )
            // InternalRecipe.g:610:2: rule__Technique__Group__1__Impl rule__Technique__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Technique__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technique__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group__1"


    // $ANTLR start "rule__Technique__Group__1__Impl"
    // InternalRecipe.g:617:1: rule__Technique__Group__1__Impl : ( ( rule__Technique__NameAssignment_1 ) ) ;
    public final void rule__Technique__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:621:1: ( ( ( rule__Technique__NameAssignment_1 ) ) )
            // InternalRecipe.g:622:1: ( ( rule__Technique__NameAssignment_1 ) )
            {
            // InternalRecipe.g:622:1: ( ( rule__Technique__NameAssignment_1 ) )
            // InternalRecipe.g:623:2: ( rule__Technique__NameAssignment_1 )
            {
             before(grammarAccess.getTechniqueAccess().getNameAssignment_1()); 
            // InternalRecipe.g:624:2: ( rule__Technique__NameAssignment_1 )
            // InternalRecipe.g:624:3: rule__Technique__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Technique__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTechniqueAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group__1__Impl"


    // $ANTLR start "rule__Technique__Group__2"
    // InternalRecipe.g:632:1: rule__Technique__Group__2 : rule__Technique__Group__2__Impl ;
    public final void rule__Technique__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:636:1: ( rule__Technique__Group__2__Impl )
            // InternalRecipe.g:637:2: rule__Technique__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technique__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group__2"


    // $ANTLR start "rule__Technique__Group__2__Impl"
    // InternalRecipe.g:643:1: rule__Technique__Group__2__Impl : ( ( ( rule__Technique__Alternatives_2 ) ) ( ( rule__Technique__Alternatives_2 )* ) ) ;
    public final void rule__Technique__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:647:1: ( ( ( ( rule__Technique__Alternatives_2 ) ) ( ( rule__Technique__Alternatives_2 )* ) ) )
            // InternalRecipe.g:648:1: ( ( ( rule__Technique__Alternatives_2 ) ) ( ( rule__Technique__Alternatives_2 )* ) )
            {
            // InternalRecipe.g:648:1: ( ( ( rule__Technique__Alternatives_2 ) ) ( ( rule__Technique__Alternatives_2 )* ) )
            // InternalRecipe.g:649:2: ( ( rule__Technique__Alternatives_2 ) ) ( ( rule__Technique__Alternatives_2 )* )
            {
            // InternalRecipe.g:649:2: ( ( rule__Technique__Alternatives_2 ) )
            // InternalRecipe.g:650:3: ( rule__Technique__Alternatives_2 )
            {
             before(grammarAccess.getTechniqueAccess().getAlternatives_2()); 
            // InternalRecipe.g:651:3: ( rule__Technique__Alternatives_2 )
            // InternalRecipe.g:651:4: rule__Technique__Alternatives_2
            {
            pushFollow(FOLLOW_8);
            rule__Technique__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTechniqueAccess().getAlternatives_2()); 

            }

            // InternalRecipe.g:654:2: ( ( rule__Technique__Alternatives_2 )* )
            // InternalRecipe.g:655:3: ( rule__Technique__Alternatives_2 )*
            {
             before(grammarAccess.getTechniqueAccess().getAlternatives_2()); 
            // InternalRecipe.g:656:3: ( rule__Technique__Alternatives_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=12 && LA9_0<=16)||LA9_0==26||LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRecipe.g:656:4: rule__Technique__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Technique__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTechniqueAccess().getAlternatives_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group__2__Impl"


    // $ANTLR start "rule__Technique__Group_2_0__0"
    // InternalRecipe.g:666:1: rule__Technique__Group_2_0__0 : rule__Technique__Group_2_0__0__Impl rule__Technique__Group_2_0__1 ;
    public final void rule__Technique__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:670:1: ( rule__Technique__Group_2_0__0__Impl rule__Technique__Group_2_0__1 )
            // InternalRecipe.g:671:2: rule__Technique__Group_2_0__0__Impl rule__Technique__Group_2_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Technique__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technique__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group_2_0__0"


    // $ANTLR start "rule__Technique__Group_2_0__0__Impl"
    // InternalRecipe.g:678:1: rule__Technique__Group_2_0__0__Impl : ( '[' ) ;
    public final void rule__Technique__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:682:1: ( ( '[' ) )
            // InternalRecipe.g:683:1: ( '[' )
            {
            // InternalRecipe.g:683:1: ( '[' )
            // InternalRecipe.g:684:2: '['
            {
             before(grammarAccess.getTechniqueAccess().getLeftSquareBracketKeyword_2_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTechniqueAccess().getLeftSquareBracketKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group_2_0__0__Impl"


    // $ANTLR start "rule__Technique__Group_2_0__1"
    // InternalRecipe.g:693:1: rule__Technique__Group_2_0__1 : rule__Technique__Group_2_0__1__Impl rule__Technique__Group_2_0__2 ;
    public final void rule__Technique__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:697:1: ( rule__Technique__Group_2_0__1__Impl rule__Technique__Group_2_0__2 )
            // InternalRecipe.g:698:2: rule__Technique__Group_2_0__1__Impl rule__Technique__Group_2_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Technique__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technique__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group_2_0__1"


    // $ANTLR start "rule__Technique__Group_2_0__1__Impl"
    // InternalRecipe.g:705:1: rule__Technique__Group_2_0__1__Impl : ( ( rule__Technique__ObjectsFacAssignment_2_0_1 ) ) ;
    public final void rule__Technique__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:709:1: ( ( ( rule__Technique__ObjectsFacAssignment_2_0_1 ) ) )
            // InternalRecipe.g:710:1: ( ( rule__Technique__ObjectsFacAssignment_2_0_1 ) )
            {
            // InternalRecipe.g:710:1: ( ( rule__Technique__ObjectsFacAssignment_2_0_1 ) )
            // InternalRecipe.g:711:2: ( rule__Technique__ObjectsFacAssignment_2_0_1 )
            {
             before(grammarAccess.getTechniqueAccess().getObjectsFacAssignment_2_0_1()); 
            // InternalRecipe.g:712:2: ( rule__Technique__ObjectsFacAssignment_2_0_1 )
            // InternalRecipe.g:712:3: rule__Technique__ObjectsFacAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Technique__ObjectsFacAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTechniqueAccess().getObjectsFacAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group_2_0__1__Impl"


    // $ANTLR start "rule__Technique__Group_2_0__2"
    // InternalRecipe.g:720:1: rule__Technique__Group_2_0__2 : rule__Technique__Group_2_0__2__Impl ;
    public final void rule__Technique__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:724:1: ( rule__Technique__Group_2_0__2__Impl )
            // InternalRecipe.g:725:2: rule__Technique__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technique__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group_2_0__2"


    // $ANTLR start "rule__Technique__Group_2_0__2__Impl"
    // InternalRecipe.g:731:1: rule__Technique__Group_2_0__2__Impl : ( ']' ) ;
    public final void rule__Technique__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:735:1: ( ( ']' ) )
            // InternalRecipe.g:736:1: ( ']' )
            {
            // InternalRecipe.g:736:1: ( ']' )
            // InternalRecipe.g:737:2: ']'
            {
             before(grammarAccess.getTechniqueAccess().getRightSquareBracketKeyword_2_0_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTechniqueAccess().getRightSquareBracketKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group_2_0__2__Impl"


    // $ANTLR start "rule__Technique__Group_2_2__0"
    // InternalRecipe.g:747:1: rule__Technique__Group_2_2__0 : rule__Technique__Group_2_2__0__Impl rule__Technique__Group_2_2__1 ;
    public final void rule__Technique__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:751:1: ( rule__Technique__Group_2_2__0__Impl rule__Technique__Group_2_2__1 )
            // InternalRecipe.g:752:2: rule__Technique__Group_2_2__0__Impl rule__Technique__Group_2_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Technique__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technique__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group_2_2__0"


    // $ANTLR start "rule__Technique__Group_2_2__0__Impl"
    // InternalRecipe.g:759:1: rule__Technique__Group_2_2__0__Impl : ( '{' ) ;
    public final void rule__Technique__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:763:1: ( ( '{' ) )
            // InternalRecipe.g:764:1: ( '{' )
            {
            // InternalRecipe.g:764:1: ( '{' )
            // InternalRecipe.g:765:2: '{'
            {
             before(grammarAccess.getTechniqueAccess().getLeftCurlyBracketKeyword_2_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTechniqueAccess().getLeftCurlyBracketKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group_2_2__0__Impl"


    // $ANTLR start "rule__Technique__Group_2_2__1"
    // InternalRecipe.g:774:1: rule__Technique__Group_2_2__1 : rule__Technique__Group_2_2__1__Impl rule__Technique__Group_2_2__2 ;
    public final void rule__Technique__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:778:1: ( rule__Technique__Group_2_2__1__Impl rule__Technique__Group_2_2__2 )
            // InternalRecipe.g:779:2: rule__Technique__Group_2_2__1__Impl rule__Technique__Group_2_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Technique__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Technique__Group_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group_2_2__1"


    // $ANTLR start "rule__Technique__Group_2_2__1__Impl"
    // InternalRecipe.g:786:1: rule__Technique__Group_2_2__1__Impl : ( rulechoices ) ;
    public final void rule__Technique__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:790:1: ( ( rulechoices ) )
            // InternalRecipe.g:791:1: ( rulechoices )
            {
            // InternalRecipe.g:791:1: ( rulechoices )
            // InternalRecipe.g:792:2: rulechoices
            {
             before(grammarAccess.getTechniqueAccess().getChoicesParserRuleCall_2_2_1()); 
            pushFollow(FOLLOW_2);
            rulechoices();

            state._fsp--;

             after(grammarAccess.getTechniqueAccess().getChoicesParserRuleCall_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group_2_2__1__Impl"


    // $ANTLR start "rule__Technique__Group_2_2__2"
    // InternalRecipe.g:801:1: rule__Technique__Group_2_2__2 : rule__Technique__Group_2_2__2__Impl ;
    public final void rule__Technique__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:805:1: ( rule__Technique__Group_2_2__2__Impl )
            // InternalRecipe.g:806:2: rule__Technique__Group_2_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Technique__Group_2_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group_2_2__2"


    // $ANTLR start "rule__Technique__Group_2_2__2__Impl"
    // InternalRecipe.g:812:1: rule__Technique__Group_2_2__2__Impl : ( '}' ) ;
    public final void rule__Technique__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:816:1: ( ( '}' ) )
            // InternalRecipe.g:817:1: ( '}' )
            {
            // InternalRecipe.g:817:1: ( '}' )
            // InternalRecipe.g:818:2: '}'
            {
             before(grammarAccess.getTechniqueAccess().getRightCurlyBracketKeyword_2_2_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTechniqueAccess().getRightCurlyBracketKeyword_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__Group_2_2__2__Impl"


    // $ANTLR start "rule__Choices__Group_0__0"
    // InternalRecipe.g:828:1: rule__Choices__Group_0__0 : rule__Choices__Group_0__0__Impl rule__Choices__Group_0__1 ;
    public final void rule__Choices__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:832:1: ( rule__Choices__Group_0__0__Impl rule__Choices__Group_0__1 )
            // InternalRecipe.g:833:2: rule__Choices__Group_0__0__Impl rule__Choices__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Choices__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choices__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_0__0"


    // $ANTLR start "rule__Choices__Group_0__0__Impl"
    // InternalRecipe.g:840:1: rule__Choices__Group_0__0__Impl : ( ( rule__Choices__ChoixAssignment_0_0 ) ) ;
    public final void rule__Choices__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:844:1: ( ( ( rule__Choices__ChoixAssignment_0_0 ) ) )
            // InternalRecipe.g:845:1: ( ( rule__Choices__ChoixAssignment_0_0 ) )
            {
            // InternalRecipe.g:845:1: ( ( rule__Choices__ChoixAssignment_0_0 ) )
            // InternalRecipe.g:846:2: ( rule__Choices__ChoixAssignment_0_0 )
            {
             before(grammarAccess.getChoicesAccess().getChoixAssignment_0_0()); 
            // InternalRecipe.g:847:2: ( rule__Choices__ChoixAssignment_0_0 )
            // InternalRecipe.g:847:3: rule__Choices__ChoixAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Choices__ChoixAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getChoicesAccess().getChoixAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_0__0__Impl"


    // $ANTLR start "rule__Choices__Group_0__1"
    // InternalRecipe.g:855:1: rule__Choices__Group_0__1 : rule__Choices__Group_0__1__Impl ;
    public final void rule__Choices__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:859:1: ( rule__Choices__Group_0__1__Impl )
            // InternalRecipe.g:860:2: rule__Choices__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choices__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_0__1"


    // $ANTLR start "rule__Choices__Group_0__1__Impl"
    // InternalRecipe.g:866:1: rule__Choices__Group_0__1__Impl : ( ( rule__Choices__Group_0_1__0 )* ) ;
    public final void rule__Choices__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:870:1: ( ( ( rule__Choices__Group_0_1__0 )* ) )
            // InternalRecipe.g:871:1: ( ( rule__Choices__Group_0_1__0 )* )
            {
            // InternalRecipe.g:871:1: ( ( rule__Choices__Group_0_1__0 )* )
            // InternalRecipe.g:872:2: ( rule__Choices__Group_0_1__0 )*
            {
             before(grammarAccess.getChoicesAccess().getGroup_0_1()); 
            // InternalRecipe.g:873:2: ( rule__Choices__Group_0_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRecipe.g:873:3: rule__Choices__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Choices__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getChoicesAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_0__1__Impl"


    // $ANTLR start "rule__Choices__Group_0_1__0"
    // InternalRecipe.g:882:1: rule__Choices__Group_0_1__0 : rule__Choices__Group_0_1__0__Impl rule__Choices__Group_0_1__1 ;
    public final void rule__Choices__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:886:1: ( rule__Choices__Group_0_1__0__Impl rule__Choices__Group_0_1__1 )
            // InternalRecipe.g:887:2: rule__Choices__Group_0_1__0__Impl rule__Choices__Group_0_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Choices__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choices__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_0_1__0"


    // $ANTLR start "rule__Choices__Group_0_1__0__Impl"
    // InternalRecipe.g:894:1: rule__Choices__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__Choices__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:898:1: ( ( ',' ) )
            // InternalRecipe.g:899:1: ( ',' )
            {
            // InternalRecipe.g:899:1: ( ',' )
            // InternalRecipe.g:900:2: ','
            {
             before(grammarAccess.getChoicesAccess().getCommaKeyword_0_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getChoicesAccess().getCommaKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_0_1__0__Impl"


    // $ANTLR start "rule__Choices__Group_0_1__1"
    // InternalRecipe.g:909:1: rule__Choices__Group_0_1__1 : rule__Choices__Group_0_1__1__Impl ;
    public final void rule__Choices__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:913:1: ( rule__Choices__Group_0_1__1__Impl )
            // InternalRecipe.g:914:2: rule__Choices__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choices__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_0_1__1"


    // $ANTLR start "rule__Choices__Group_0_1__1__Impl"
    // InternalRecipe.g:920:1: rule__Choices__Group_0_1__1__Impl : ( ( rule__Choices__ChoixAssignment_0_1_1 ) ) ;
    public final void rule__Choices__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:924:1: ( ( ( rule__Choices__ChoixAssignment_0_1_1 ) ) )
            // InternalRecipe.g:925:1: ( ( rule__Choices__ChoixAssignment_0_1_1 ) )
            {
            // InternalRecipe.g:925:1: ( ( rule__Choices__ChoixAssignment_0_1_1 ) )
            // InternalRecipe.g:926:2: ( rule__Choices__ChoixAssignment_0_1_1 )
            {
             before(grammarAccess.getChoicesAccess().getChoixAssignment_0_1_1()); 
            // InternalRecipe.g:927:2: ( rule__Choices__ChoixAssignment_0_1_1 )
            // InternalRecipe.g:927:3: rule__Choices__ChoixAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Choices__ChoixAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getChoicesAccess().getChoixAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_0_1__1__Impl"


    // $ANTLR start "rule__Choices__Group_1__0"
    // InternalRecipe.g:936:1: rule__Choices__Group_1__0 : rule__Choices__Group_1__0__Impl rule__Choices__Group_1__1 ;
    public final void rule__Choices__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:940:1: ( rule__Choices__Group_1__0__Impl rule__Choices__Group_1__1 )
            // InternalRecipe.g:941:2: rule__Choices__Group_1__0__Impl rule__Choices__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Choices__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choices__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1__0"


    // $ANTLR start "rule__Choices__Group_1__0__Impl"
    // InternalRecipe.g:948:1: rule__Choices__Group_1__0__Impl : ( '{' ) ;
    public final void rule__Choices__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:952:1: ( ( '{' ) )
            // InternalRecipe.g:953:1: ( '{' )
            {
            // InternalRecipe.g:953:1: ( '{' )
            // InternalRecipe.g:954:2: '{'
            {
             before(grammarAccess.getChoicesAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getChoicesAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1__0__Impl"


    // $ANTLR start "rule__Choices__Group_1__1"
    // InternalRecipe.g:963:1: rule__Choices__Group_1__1 : rule__Choices__Group_1__1__Impl rule__Choices__Group_1__2 ;
    public final void rule__Choices__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:967:1: ( rule__Choices__Group_1__1__Impl rule__Choices__Group_1__2 )
            // InternalRecipe.g:968:2: rule__Choices__Group_1__1__Impl rule__Choices__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Choices__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choices__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1__1"


    // $ANTLR start "rule__Choices__Group_1__1__Impl"
    // InternalRecipe.g:975:1: rule__Choices__Group_1__1__Impl : ( rulechoices ) ;
    public final void rule__Choices__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:979:1: ( ( rulechoices ) )
            // InternalRecipe.g:980:1: ( rulechoices )
            {
            // InternalRecipe.g:980:1: ( rulechoices )
            // InternalRecipe.g:981:2: rulechoices
            {
             before(grammarAccess.getChoicesAccess().getChoicesParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            rulechoices();

            state._fsp--;

             after(grammarAccess.getChoicesAccess().getChoicesParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1__1__Impl"


    // $ANTLR start "rule__Choices__Group_1__2"
    // InternalRecipe.g:990:1: rule__Choices__Group_1__2 : rule__Choices__Group_1__2__Impl rule__Choices__Group_1__3 ;
    public final void rule__Choices__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:994:1: ( rule__Choices__Group_1__2__Impl rule__Choices__Group_1__3 )
            // InternalRecipe.g:995:2: rule__Choices__Group_1__2__Impl rule__Choices__Group_1__3
            {
            pushFollow(FOLLOW_13);
            rule__Choices__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choices__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1__2"


    // $ANTLR start "rule__Choices__Group_1__2__Impl"
    // InternalRecipe.g:1002:1: rule__Choices__Group_1__2__Impl : ( '}' ) ;
    public final void rule__Choices__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1006:1: ( ( '}' ) )
            // InternalRecipe.g:1007:1: ( '}' )
            {
            // InternalRecipe.g:1007:1: ( '}' )
            // InternalRecipe.g:1008:2: '}'
            {
             before(grammarAccess.getChoicesAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getChoicesAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1__2__Impl"


    // $ANTLR start "rule__Choices__Group_1__3"
    // InternalRecipe.g:1017:1: rule__Choices__Group_1__3 : rule__Choices__Group_1__3__Impl ;
    public final void rule__Choices__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1021:1: ( rule__Choices__Group_1__3__Impl )
            // InternalRecipe.g:1022:2: rule__Choices__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choices__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1__3"


    // $ANTLR start "rule__Choices__Group_1__3__Impl"
    // InternalRecipe.g:1028:1: rule__Choices__Group_1__3__Impl : ( ( rule__Choices__Group_1_3__0 )* ) ;
    public final void rule__Choices__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1032:1: ( ( ( rule__Choices__Group_1_3__0 )* ) )
            // InternalRecipe.g:1033:1: ( ( rule__Choices__Group_1_3__0 )* )
            {
            // InternalRecipe.g:1033:1: ( ( rule__Choices__Group_1_3__0 )* )
            // InternalRecipe.g:1034:2: ( rule__Choices__Group_1_3__0 )*
            {
             before(grammarAccess.getChoicesAccess().getGroup_1_3()); 
            // InternalRecipe.g:1035:2: ( rule__Choices__Group_1_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRecipe.g:1035:3: rule__Choices__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Choices__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getChoicesAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1__3__Impl"


    // $ANTLR start "rule__Choices__Group_1_3__0"
    // InternalRecipe.g:1044:1: rule__Choices__Group_1_3__0 : rule__Choices__Group_1_3__0__Impl rule__Choices__Group_1_3__1 ;
    public final void rule__Choices__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1048:1: ( rule__Choices__Group_1_3__0__Impl rule__Choices__Group_1_3__1 )
            // InternalRecipe.g:1049:2: rule__Choices__Group_1_3__0__Impl rule__Choices__Group_1_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Choices__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choices__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1_3__0"


    // $ANTLR start "rule__Choices__Group_1_3__0__Impl"
    // InternalRecipe.g:1056:1: rule__Choices__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Choices__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1060:1: ( ( ',' ) )
            // InternalRecipe.g:1061:1: ( ',' )
            {
            // InternalRecipe.g:1061:1: ( ',' )
            // InternalRecipe.g:1062:2: ','
            {
             before(grammarAccess.getChoicesAccess().getCommaKeyword_1_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getChoicesAccess().getCommaKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1_3__0__Impl"


    // $ANTLR start "rule__Choices__Group_1_3__1"
    // InternalRecipe.g:1071:1: rule__Choices__Group_1_3__1 : rule__Choices__Group_1_3__1__Impl rule__Choices__Group_1_3__2 ;
    public final void rule__Choices__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1075:1: ( rule__Choices__Group_1_3__1__Impl rule__Choices__Group_1_3__2 )
            // InternalRecipe.g:1076:2: rule__Choices__Group_1_3__1__Impl rule__Choices__Group_1_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Choices__Group_1_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choices__Group_1_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1_3__1"


    // $ANTLR start "rule__Choices__Group_1_3__1__Impl"
    // InternalRecipe.g:1083:1: rule__Choices__Group_1_3__1__Impl : ( '{' ) ;
    public final void rule__Choices__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1087:1: ( ( '{' ) )
            // InternalRecipe.g:1088:1: ( '{' )
            {
            // InternalRecipe.g:1088:1: ( '{' )
            // InternalRecipe.g:1089:2: '{'
            {
             before(grammarAccess.getChoicesAccess().getLeftCurlyBracketKeyword_1_3_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getChoicesAccess().getLeftCurlyBracketKeyword_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1_3__1__Impl"


    // $ANTLR start "rule__Choices__Group_1_3__2"
    // InternalRecipe.g:1098:1: rule__Choices__Group_1_3__2 : rule__Choices__Group_1_3__2__Impl rule__Choices__Group_1_3__3 ;
    public final void rule__Choices__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1102:1: ( rule__Choices__Group_1_3__2__Impl rule__Choices__Group_1_3__3 )
            // InternalRecipe.g:1103:2: rule__Choices__Group_1_3__2__Impl rule__Choices__Group_1_3__3
            {
            pushFollow(FOLLOW_12);
            rule__Choices__Group_1_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choices__Group_1_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1_3__2"


    // $ANTLR start "rule__Choices__Group_1_3__2__Impl"
    // InternalRecipe.g:1110:1: rule__Choices__Group_1_3__2__Impl : ( rulechoices ) ;
    public final void rule__Choices__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1114:1: ( ( rulechoices ) )
            // InternalRecipe.g:1115:1: ( rulechoices )
            {
            // InternalRecipe.g:1115:1: ( rulechoices )
            // InternalRecipe.g:1116:2: rulechoices
            {
             before(grammarAccess.getChoicesAccess().getChoicesParserRuleCall_1_3_2()); 
            pushFollow(FOLLOW_2);
            rulechoices();

            state._fsp--;

             after(grammarAccess.getChoicesAccess().getChoicesParserRuleCall_1_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1_3__2__Impl"


    // $ANTLR start "rule__Choices__Group_1_3__3"
    // InternalRecipe.g:1125:1: rule__Choices__Group_1_3__3 : rule__Choices__Group_1_3__3__Impl ;
    public final void rule__Choices__Group_1_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1129:1: ( rule__Choices__Group_1_3__3__Impl )
            // InternalRecipe.g:1130:2: rule__Choices__Group_1_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choices__Group_1_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1_3__3"


    // $ANTLR start "rule__Choices__Group_1_3__3__Impl"
    // InternalRecipe.g:1136:1: rule__Choices__Group_1_3__3__Impl : ( '}' ) ;
    public final void rule__Choices__Group_1_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1140:1: ( ( '}' ) )
            // InternalRecipe.g:1141:1: ( '}' )
            {
            // InternalRecipe.g:1141:1: ( '}' )
            // InternalRecipe.g:1142:2: '}'
            {
             before(grammarAccess.getChoicesAccess().getRightCurlyBracketKeyword_1_3_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getChoicesAccess().getRightCurlyBracketKeyword_1_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__Group_1_3__3__Impl"


    // $ANTLR start "rule__Recipe__Group__0"
    // InternalRecipe.g:1152:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1156:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // InternalRecipe.g:1157:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Recipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__0"


    // $ANTLR start "rule__Recipe__Group__0__Impl"
    // InternalRecipe.g:1164:1: rule__Recipe__Group__0__Impl : ( 'recipe' ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1168:1: ( ( 'recipe' ) )
            // InternalRecipe.g:1169:1: ( 'recipe' )
            {
            // InternalRecipe.g:1169:1: ( 'recipe' )
            // InternalRecipe.g:1170:2: 'recipe'
            {
             before(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRecipeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__0__Impl"


    // $ANTLR start "rule__Recipe__Group__1"
    // InternalRecipe.g:1179:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1183:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // InternalRecipe.g:1184:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Recipe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__1"


    // $ANTLR start "rule__Recipe__Group__1__Impl"
    // InternalRecipe.g:1191:1: rule__Recipe__Group__1__Impl : ( '{' ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1195:1: ( ( '{' ) )
            // InternalRecipe.g:1196:1: ( '{' )
            {
            // InternalRecipe.g:1196:1: ( '{' )
            // InternalRecipe.g:1197:2: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__1__Impl"


    // $ANTLR start "rule__Recipe__Group__2"
    // InternalRecipe.g:1206:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1210:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // InternalRecipe.g:1211:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Recipe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__2"


    // $ANTLR start "rule__Recipe__Group__2__Impl"
    // InternalRecipe.g:1218:1: rule__Recipe__Group__2__Impl : ( 'name' ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1222:1: ( ( 'name' ) )
            // InternalRecipe.g:1223:1: ( 'name' )
            {
            // InternalRecipe.g:1223:1: ( 'name' )
            // InternalRecipe.g:1224:2: 'name'
            {
             before(grammarAccess.getRecipeAccess().getNameKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__2__Impl"


    // $ANTLR start "rule__Recipe__Group__3"
    // InternalRecipe.g:1233:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1237:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // InternalRecipe.g:1238:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Recipe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__3"


    // $ANTLR start "rule__Recipe__Group__3__Impl"
    // InternalRecipe.g:1245:1: rule__Recipe__Group__3__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1249:1: ( ( ':' ) )
            // InternalRecipe.g:1250:1: ( ':' )
            {
            // InternalRecipe.g:1250:1: ( ':' )
            // InternalRecipe.g:1251:2: ':'
            {
             before(grammarAccess.getRecipeAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__3__Impl"


    // $ANTLR start "rule__Recipe__Group__4"
    // InternalRecipe.g:1260:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1264:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // InternalRecipe.g:1265:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Recipe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__4"


    // $ANTLR start "rule__Recipe__Group__4__Impl"
    // InternalRecipe.g:1272:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__NameAssignment_4 ) ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1276:1: ( ( ( rule__Recipe__NameAssignment_4 ) ) )
            // InternalRecipe.g:1277:1: ( ( rule__Recipe__NameAssignment_4 ) )
            {
            // InternalRecipe.g:1277:1: ( ( rule__Recipe__NameAssignment_4 ) )
            // InternalRecipe.g:1278:2: ( rule__Recipe__NameAssignment_4 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_4()); 
            // InternalRecipe.g:1279:2: ( rule__Recipe__NameAssignment_4 )
            // InternalRecipe.g:1279:3: rule__Recipe__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__4__Impl"


    // $ANTLR start "rule__Recipe__Group__5"
    // InternalRecipe.g:1287:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1291:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // InternalRecipe.g:1292:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Recipe__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__5"


    // $ANTLR start "rule__Recipe__Group__5__Impl"
    // InternalRecipe.g:1299:1: rule__Recipe__Group__5__Impl : ( ( rule__Recipe__SuitenameAssignment_5 )* ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1303:1: ( ( ( rule__Recipe__SuitenameAssignment_5 )* ) )
            // InternalRecipe.g:1304:1: ( ( rule__Recipe__SuitenameAssignment_5 )* )
            {
            // InternalRecipe.g:1304:1: ( ( rule__Recipe__SuitenameAssignment_5 )* )
            // InternalRecipe.g:1305:2: ( rule__Recipe__SuitenameAssignment_5 )*
            {
             before(grammarAccess.getRecipeAccess().getSuitenameAssignment_5()); 
            // InternalRecipe.g:1306:2: ( rule__Recipe__SuitenameAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRecipe.g:1306:3: rule__Recipe__SuitenameAssignment_5
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Recipe__SuitenameAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getSuitenameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__5__Impl"


    // $ANTLR start "rule__Recipe__Group__6"
    // InternalRecipe.g:1314:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1318:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // InternalRecipe.g:1319:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Recipe__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__6"


    // $ANTLR start "rule__Recipe__Group__6__Impl"
    // InternalRecipe.g:1326:1: rule__Recipe__Group__6__Impl : ( 'time' ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1330:1: ( ( 'time' ) )
            // InternalRecipe.g:1331:1: ( 'time' )
            {
            // InternalRecipe.g:1331:1: ( 'time' )
            // InternalRecipe.g:1332:2: 'time'
            {
             before(grammarAccess.getRecipeAccess().getTimeKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getTimeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__6__Impl"


    // $ANTLR start "rule__Recipe__Group__7"
    // InternalRecipe.g:1341:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl rule__Recipe__Group__8 ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1345:1: ( rule__Recipe__Group__7__Impl rule__Recipe__Group__8 )
            // InternalRecipe.g:1346:2: rule__Recipe__Group__7__Impl rule__Recipe__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Recipe__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__7"


    // $ANTLR start "rule__Recipe__Group__7__Impl"
    // InternalRecipe.g:1353:1: rule__Recipe__Group__7__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1357:1: ( ( ':' ) )
            // InternalRecipe.g:1358:1: ( ':' )
            {
            // InternalRecipe.g:1358:1: ( ':' )
            // InternalRecipe.g:1359:2: ':'
            {
             before(grammarAccess.getRecipeAccess().getColonKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__7__Impl"


    // $ANTLR start "rule__Recipe__Group__8"
    // InternalRecipe.g:1368:1: rule__Recipe__Group__8 : rule__Recipe__Group__8__Impl rule__Recipe__Group__9 ;
    public final void rule__Recipe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1372:1: ( rule__Recipe__Group__8__Impl rule__Recipe__Group__9 )
            // InternalRecipe.g:1373:2: rule__Recipe__Group__8__Impl rule__Recipe__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Recipe__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__8"


    // $ANTLR start "rule__Recipe__Group__8__Impl"
    // InternalRecipe.g:1380:1: rule__Recipe__Group__8__Impl : ( ( rule__Recipe__TimeAssignment_8 ) ) ;
    public final void rule__Recipe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1384:1: ( ( ( rule__Recipe__TimeAssignment_8 ) ) )
            // InternalRecipe.g:1385:1: ( ( rule__Recipe__TimeAssignment_8 ) )
            {
            // InternalRecipe.g:1385:1: ( ( rule__Recipe__TimeAssignment_8 ) )
            // InternalRecipe.g:1386:2: ( rule__Recipe__TimeAssignment_8 )
            {
             before(grammarAccess.getRecipeAccess().getTimeAssignment_8()); 
            // InternalRecipe.g:1387:2: ( rule__Recipe__TimeAssignment_8 )
            // InternalRecipe.g:1387:3: rule__Recipe__TimeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__TimeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getTimeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__8__Impl"


    // $ANTLR start "rule__Recipe__Group__9"
    // InternalRecipe.g:1395:1: rule__Recipe__Group__9 : rule__Recipe__Group__9__Impl rule__Recipe__Group__10 ;
    public final void rule__Recipe__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1399:1: ( rule__Recipe__Group__9__Impl rule__Recipe__Group__10 )
            // InternalRecipe.g:1400:2: rule__Recipe__Group__9__Impl rule__Recipe__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__Recipe__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__9"


    // $ANTLR start "rule__Recipe__Group__9__Impl"
    // InternalRecipe.g:1407:1: rule__Recipe__Group__9__Impl : ( 'nb_pers' ) ;
    public final void rule__Recipe__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1411:1: ( ( 'nb_pers' ) )
            // InternalRecipe.g:1412:1: ( 'nb_pers' )
            {
            // InternalRecipe.g:1412:1: ( 'nb_pers' )
            // InternalRecipe.g:1413:2: 'nb_pers'
            {
             before(grammarAccess.getRecipeAccess().getNb_persKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getNb_persKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__9__Impl"


    // $ANTLR start "rule__Recipe__Group__10"
    // InternalRecipe.g:1422:1: rule__Recipe__Group__10 : rule__Recipe__Group__10__Impl rule__Recipe__Group__11 ;
    public final void rule__Recipe__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1426:1: ( rule__Recipe__Group__10__Impl rule__Recipe__Group__11 )
            // InternalRecipe.g:1427:2: rule__Recipe__Group__10__Impl rule__Recipe__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__Recipe__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__10"


    // $ANTLR start "rule__Recipe__Group__10__Impl"
    // InternalRecipe.g:1434:1: rule__Recipe__Group__10__Impl : ( ':' ) ;
    public final void rule__Recipe__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1438:1: ( ( ':' ) )
            // InternalRecipe.g:1439:1: ( ':' )
            {
            // InternalRecipe.g:1439:1: ( ':' )
            // InternalRecipe.g:1440:2: ':'
            {
             before(grammarAccess.getRecipeAccess().getColonKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__10__Impl"


    // $ANTLR start "rule__Recipe__Group__11"
    // InternalRecipe.g:1449:1: rule__Recipe__Group__11 : rule__Recipe__Group__11__Impl rule__Recipe__Group__12 ;
    public final void rule__Recipe__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1453:1: ( rule__Recipe__Group__11__Impl rule__Recipe__Group__12 )
            // InternalRecipe.g:1454:2: rule__Recipe__Group__11__Impl rule__Recipe__Group__12
            {
            pushFollow(FOLLOW_22);
            rule__Recipe__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__11"


    // $ANTLR start "rule__Recipe__Group__11__Impl"
    // InternalRecipe.g:1461:1: rule__Recipe__Group__11__Impl : ( ( rule__Recipe__NbAssignment_11 ) ) ;
    public final void rule__Recipe__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1465:1: ( ( ( rule__Recipe__NbAssignment_11 ) ) )
            // InternalRecipe.g:1466:1: ( ( rule__Recipe__NbAssignment_11 ) )
            {
            // InternalRecipe.g:1466:1: ( ( rule__Recipe__NbAssignment_11 ) )
            // InternalRecipe.g:1467:2: ( rule__Recipe__NbAssignment_11 )
            {
             before(grammarAccess.getRecipeAccess().getNbAssignment_11()); 
            // InternalRecipe.g:1468:2: ( rule__Recipe__NbAssignment_11 )
            // InternalRecipe.g:1468:3: rule__Recipe__NbAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__NbAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getNbAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__11__Impl"


    // $ANTLR start "rule__Recipe__Group__12"
    // InternalRecipe.g:1476:1: rule__Recipe__Group__12 : rule__Recipe__Group__12__Impl rule__Recipe__Group__13 ;
    public final void rule__Recipe__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1480:1: ( rule__Recipe__Group__12__Impl rule__Recipe__Group__13 )
            // InternalRecipe.g:1481:2: rule__Recipe__Group__12__Impl rule__Recipe__Group__13
            {
            pushFollow(FOLLOW_23);
            rule__Recipe__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__12"


    // $ANTLR start "rule__Recipe__Group__12__Impl"
    // InternalRecipe.g:1488:1: rule__Recipe__Group__12__Impl : ( ( rule__Recipe__IngredientsAssignment_12 ) ) ;
    public final void rule__Recipe__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1492:1: ( ( ( rule__Recipe__IngredientsAssignment_12 ) ) )
            // InternalRecipe.g:1493:1: ( ( rule__Recipe__IngredientsAssignment_12 ) )
            {
            // InternalRecipe.g:1493:1: ( ( rule__Recipe__IngredientsAssignment_12 ) )
            // InternalRecipe.g:1494:2: ( rule__Recipe__IngredientsAssignment_12 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_12()); 
            // InternalRecipe.g:1495:2: ( rule__Recipe__IngredientsAssignment_12 )
            // InternalRecipe.g:1495:3: rule__Recipe__IngredientsAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__IngredientsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientsAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__12__Impl"


    // $ANTLR start "rule__Recipe__Group__13"
    // InternalRecipe.g:1503:1: rule__Recipe__Group__13 : rule__Recipe__Group__13__Impl rule__Recipe__Group__14 ;
    public final void rule__Recipe__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1507:1: ( rule__Recipe__Group__13__Impl rule__Recipe__Group__14 )
            // InternalRecipe.g:1508:2: rule__Recipe__Group__13__Impl rule__Recipe__Group__14
            {
            pushFollow(FOLLOW_24);
            rule__Recipe__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__13"


    // $ANTLR start "rule__Recipe__Group__13__Impl"
    // InternalRecipe.g:1515:1: rule__Recipe__Group__13__Impl : ( ( rule__Recipe__UstensilsAssignment_13 ) ) ;
    public final void rule__Recipe__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1519:1: ( ( ( rule__Recipe__UstensilsAssignment_13 ) ) )
            // InternalRecipe.g:1520:1: ( ( rule__Recipe__UstensilsAssignment_13 ) )
            {
            // InternalRecipe.g:1520:1: ( ( rule__Recipe__UstensilsAssignment_13 ) )
            // InternalRecipe.g:1521:2: ( rule__Recipe__UstensilsAssignment_13 )
            {
             before(grammarAccess.getRecipeAccess().getUstensilsAssignment_13()); 
            // InternalRecipe.g:1522:2: ( rule__Recipe__UstensilsAssignment_13 )
            // InternalRecipe.g:1522:3: rule__Recipe__UstensilsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__UstensilsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getUstensilsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__13__Impl"


    // $ANTLR start "rule__Recipe__Group__14"
    // InternalRecipe.g:1530:1: rule__Recipe__Group__14 : rule__Recipe__Group__14__Impl rule__Recipe__Group__15 ;
    public final void rule__Recipe__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1534:1: ( rule__Recipe__Group__14__Impl rule__Recipe__Group__15 )
            // InternalRecipe.g:1535:2: rule__Recipe__Group__14__Impl rule__Recipe__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Recipe__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recipe__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__14"


    // $ANTLR start "rule__Recipe__Group__14__Impl"
    // InternalRecipe.g:1542:1: rule__Recipe__Group__14__Impl : ( ( rule__Recipe__InstructionsAssignment_14 ) ) ;
    public final void rule__Recipe__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1546:1: ( ( ( rule__Recipe__InstructionsAssignment_14 ) ) )
            // InternalRecipe.g:1547:1: ( ( rule__Recipe__InstructionsAssignment_14 ) )
            {
            // InternalRecipe.g:1547:1: ( ( rule__Recipe__InstructionsAssignment_14 ) )
            // InternalRecipe.g:1548:2: ( rule__Recipe__InstructionsAssignment_14 )
            {
             before(grammarAccess.getRecipeAccess().getInstructionsAssignment_14()); 
            // InternalRecipe.g:1549:2: ( rule__Recipe__InstructionsAssignment_14 )
            // InternalRecipe.g:1549:3: rule__Recipe__InstructionsAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__InstructionsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getInstructionsAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__14__Impl"


    // $ANTLR start "rule__Recipe__Group__15"
    // InternalRecipe.g:1557:1: rule__Recipe__Group__15 : rule__Recipe__Group__15__Impl ;
    public final void rule__Recipe__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1561:1: ( rule__Recipe__Group__15__Impl )
            // InternalRecipe.g:1562:2: rule__Recipe__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recipe__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__15"


    // $ANTLR start "rule__Recipe__Group__15__Impl"
    // InternalRecipe.g:1568:1: rule__Recipe__Group__15__Impl : ( '}' ) ;
    public final void rule__Recipe__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1572:1: ( ( '}' ) )
            // InternalRecipe.g:1573:1: ( '}' )
            {
            // InternalRecipe.g:1573:1: ( '}' )
            // InternalRecipe.g:1574:2: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_15()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__15__Impl"


    // $ANTLR start "rule__Ustensils__Group__0"
    // InternalRecipe.g:1584:1: rule__Ustensils__Group__0 : rule__Ustensils__Group__0__Impl rule__Ustensils__Group__1 ;
    public final void rule__Ustensils__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1588:1: ( rule__Ustensils__Group__0__Impl rule__Ustensils__Group__1 )
            // InternalRecipe.g:1589:2: rule__Ustensils__Group__0__Impl rule__Ustensils__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Ustensils__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ustensils__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__Group__0"


    // $ANTLR start "rule__Ustensils__Group__0__Impl"
    // InternalRecipe.g:1596:1: rule__Ustensils__Group__0__Impl : ( () ) ;
    public final void rule__Ustensils__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1600:1: ( ( () ) )
            // InternalRecipe.g:1601:1: ( () )
            {
            // InternalRecipe.g:1601:1: ( () )
            // InternalRecipe.g:1602:2: ()
            {
             before(grammarAccess.getUstensilsAccess().getUstensilsAction_0()); 
            // InternalRecipe.g:1603:2: ()
            // InternalRecipe.g:1603:3: 
            {
            }

             after(grammarAccess.getUstensilsAccess().getUstensilsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__Group__0__Impl"


    // $ANTLR start "rule__Ustensils__Group__1"
    // InternalRecipe.g:1611:1: rule__Ustensils__Group__1 : rule__Ustensils__Group__1__Impl rule__Ustensils__Group__2 ;
    public final void rule__Ustensils__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1615:1: ( rule__Ustensils__Group__1__Impl rule__Ustensils__Group__2 )
            // InternalRecipe.g:1616:2: rule__Ustensils__Group__1__Impl rule__Ustensils__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Ustensils__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ustensils__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__Group__1"


    // $ANTLR start "rule__Ustensils__Group__1__Impl"
    // InternalRecipe.g:1623:1: rule__Ustensils__Group__1__Impl : ( 'ustensils' ) ;
    public final void rule__Ustensils__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1627:1: ( ( 'ustensils' ) )
            // InternalRecipe.g:1628:1: ( 'ustensils' )
            {
            // InternalRecipe.g:1628:1: ( 'ustensils' )
            // InternalRecipe.g:1629:2: 'ustensils'
            {
             before(grammarAccess.getUstensilsAccess().getUstensilsKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getUstensilsAccess().getUstensilsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__Group__1__Impl"


    // $ANTLR start "rule__Ustensils__Group__2"
    // InternalRecipe.g:1638:1: rule__Ustensils__Group__2 : rule__Ustensils__Group__2__Impl rule__Ustensils__Group__3 ;
    public final void rule__Ustensils__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1642:1: ( rule__Ustensils__Group__2__Impl rule__Ustensils__Group__3 )
            // InternalRecipe.g:1643:2: rule__Ustensils__Group__2__Impl rule__Ustensils__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Ustensils__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ustensils__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__Group__2"


    // $ANTLR start "rule__Ustensils__Group__2__Impl"
    // InternalRecipe.g:1650:1: rule__Ustensils__Group__2__Impl : ( ':' ) ;
    public final void rule__Ustensils__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1654:1: ( ( ':' ) )
            // InternalRecipe.g:1655:1: ( ':' )
            {
            // InternalRecipe.g:1655:1: ( ':' )
            // InternalRecipe.g:1656:2: ':'
            {
             before(grammarAccess.getUstensilsAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUstensilsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__Group__2__Impl"


    // $ANTLR start "rule__Ustensils__Group__3"
    // InternalRecipe.g:1665:1: rule__Ustensils__Group__3 : rule__Ustensils__Group__3__Impl rule__Ustensils__Group__4 ;
    public final void rule__Ustensils__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1669:1: ( rule__Ustensils__Group__3__Impl rule__Ustensils__Group__4 )
            // InternalRecipe.g:1670:2: rule__Ustensils__Group__3__Impl rule__Ustensils__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Ustensils__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ustensils__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__Group__3"


    // $ANTLR start "rule__Ustensils__Group__3__Impl"
    // InternalRecipe.g:1677:1: rule__Ustensils__Group__3__Impl : ( '{' ) ;
    public final void rule__Ustensils__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1681:1: ( ( '{' ) )
            // InternalRecipe.g:1682:1: ( '{' )
            {
            // InternalRecipe.g:1682:1: ( '{' )
            // InternalRecipe.g:1683:2: '{'
            {
             before(grammarAccess.getUstensilsAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUstensilsAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__Group__3__Impl"


    // $ANTLR start "rule__Ustensils__Group__4"
    // InternalRecipe.g:1692:1: rule__Ustensils__Group__4 : rule__Ustensils__Group__4__Impl rule__Ustensils__Group__5 ;
    public final void rule__Ustensils__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1696:1: ( rule__Ustensils__Group__4__Impl rule__Ustensils__Group__5 )
            // InternalRecipe.g:1697:2: rule__Ustensils__Group__4__Impl rule__Ustensils__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Ustensils__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ustensils__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__Group__4"


    // $ANTLR start "rule__Ustensils__Group__4__Impl"
    // InternalRecipe.g:1704:1: rule__Ustensils__Group__4__Impl : ( ( rule__Ustensils__UstrAssignment_4 )* ) ;
    public final void rule__Ustensils__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1708:1: ( ( ( rule__Ustensils__UstrAssignment_4 )* ) )
            // InternalRecipe.g:1709:1: ( ( rule__Ustensils__UstrAssignment_4 )* )
            {
            // InternalRecipe.g:1709:1: ( ( rule__Ustensils__UstrAssignment_4 )* )
            // InternalRecipe.g:1710:2: ( rule__Ustensils__UstrAssignment_4 )*
            {
             before(grammarAccess.getUstensilsAccess().getUstrAssignment_4()); 
            // InternalRecipe.g:1711:2: ( rule__Ustensils__UstrAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRecipe.g:1711:3: rule__Ustensils__UstrAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Ustensils__UstrAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getUstensilsAccess().getUstrAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__Group__4__Impl"


    // $ANTLR start "rule__Ustensils__Group__5"
    // InternalRecipe.g:1719:1: rule__Ustensils__Group__5 : rule__Ustensils__Group__5__Impl ;
    public final void rule__Ustensils__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1723:1: ( rule__Ustensils__Group__5__Impl )
            // InternalRecipe.g:1724:2: rule__Ustensils__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ustensils__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__Group__5"


    // $ANTLR start "rule__Ustensils__Group__5__Impl"
    // InternalRecipe.g:1730:1: rule__Ustensils__Group__5__Impl : ( '}' ) ;
    public final void rule__Ustensils__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1734:1: ( ( '}' ) )
            // InternalRecipe.g:1735:1: ( '}' )
            {
            // InternalRecipe.g:1735:1: ( '}' )
            // InternalRecipe.g:1736:2: '}'
            {
             before(grammarAccess.getUstensilsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getUstensilsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__Group__5__Impl"


    // $ANTLR start "rule__Ingredients__Group__0"
    // InternalRecipe.g:1746:1: rule__Ingredients__Group__0 : rule__Ingredients__Group__0__Impl rule__Ingredients__Group__1 ;
    public final void rule__Ingredients__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1750:1: ( rule__Ingredients__Group__0__Impl rule__Ingredients__Group__1 )
            // InternalRecipe.g:1751:2: rule__Ingredients__Group__0__Impl rule__Ingredients__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Ingredients__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__0"


    // $ANTLR start "rule__Ingredients__Group__0__Impl"
    // InternalRecipe.g:1758:1: rule__Ingredients__Group__0__Impl : ( () ) ;
    public final void rule__Ingredients__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1762:1: ( ( () ) )
            // InternalRecipe.g:1763:1: ( () )
            {
            // InternalRecipe.g:1763:1: ( () )
            // InternalRecipe.g:1764:2: ()
            {
             before(grammarAccess.getIngredientsAccess().getIngredientsAction_0()); 
            // InternalRecipe.g:1765:2: ()
            // InternalRecipe.g:1765:3: 
            {
            }

             after(grammarAccess.getIngredientsAccess().getIngredientsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__0__Impl"


    // $ANTLR start "rule__Ingredients__Group__1"
    // InternalRecipe.g:1773:1: rule__Ingredients__Group__1 : rule__Ingredients__Group__1__Impl rule__Ingredients__Group__2 ;
    public final void rule__Ingredients__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1777:1: ( rule__Ingredients__Group__1__Impl rule__Ingredients__Group__2 )
            // InternalRecipe.g:1778:2: rule__Ingredients__Group__1__Impl rule__Ingredients__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Ingredients__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__1"


    // $ANTLR start "rule__Ingredients__Group__1__Impl"
    // InternalRecipe.g:1785:1: rule__Ingredients__Group__1__Impl : ( 'ingredients' ) ;
    public final void rule__Ingredients__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1789:1: ( ( 'ingredients' ) )
            // InternalRecipe.g:1790:1: ( 'ingredients' )
            {
            // InternalRecipe.g:1790:1: ( 'ingredients' )
            // InternalRecipe.g:1791:2: 'ingredients'
            {
             before(grammarAccess.getIngredientsAccess().getIngredientsKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getIngredientsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__1__Impl"


    // $ANTLR start "rule__Ingredients__Group__2"
    // InternalRecipe.g:1800:1: rule__Ingredients__Group__2 : rule__Ingredients__Group__2__Impl rule__Ingredients__Group__3 ;
    public final void rule__Ingredients__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1804:1: ( rule__Ingredients__Group__2__Impl rule__Ingredients__Group__3 )
            // InternalRecipe.g:1805:2: rule__Ingredients__Group__2__Impl rule__Ingredients__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Ingredients__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__2"


    // $ANTLR start "rule__Ingredients__Group__2__Impl"
    // InternalRecipe.g:1812:1: rule__Ingredients__Group__2__Impl : ( ':' ) ;
    public final void rule__Ingredients__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1816:1: ( ( ':' ) )
            // InternalRecipe.g:1817:1: ( ':' )
            {
            // InternalRecipe.g:1817:1: ( ':' )
            // InternalRecipe.g:1818:2: ':'
            {
             before(grammarAccess.getIngredientsAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__2__Impl"


    // $ANTLR start "rule__Ingredients__Group__3"
    // InternalRecipe.g:1827:1: rule__Ingredients__Group__3 : rule__Ingredients__Group__3__Impl rule__Ingredients__Group__4 ;
    public final void rule__Ingredients__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1831:1: ( rule__Ingredients__Group__3__Impl rule__Ingredients__Group__4 )
            // InternalRecipe.g:1832:2: rule__Ingredients__Group__3__Impl rule__Ingredients__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Ingredients__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__3"


    // $ANTLR start "rule__Ingredients__Group__3__Impl"
    // InternalRecipe.g:1839:1: rule__Ingredients__Group__3__Impl : ( '{' ) ;
    public final void rule__Ingredients__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1843:1: ( ( '{' ) )
            // InternalRecipe.g:1844:1: ( '{' )
            {
            // InternalRecipe.g:1844:1: ( '{' )
            // InternalRecipe.g:1845:2: '{'
            {
             before(grammarAccess.getIngredientsAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__3__Impl"


    // $ANTLR start "rule__Ingredients__Group__4"
    // InternalRecipe.g:1854:1: rule__Ingredients__Group__4 : rule__Ingredients__Group__4__Impl rule__Ingredients__Group__5 ;
    public final void rule__Ingredients__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1858:1: ( rule__Ingredients__Group__4__Impl rule__Ingredients__Group__5 )
            // InternalRecipe.g:1859:2: rule__Ingredients__Group__4__Impl rule__Ingredients__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Ingredients__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__4"


    // $ANTLR start "rule__Ingredients__Group__4__Impl"
    // InternalRecipe.g:1866:1: rule__Ingredients__Group__4__Impl : ( ( rule__Ingredients__IngrAssignment_4 )* ) ;
    public final void rule__Ingredients__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1870:1: ( ( ( rule__Ingredients__IngrAssignment_4 )* ) )
            // InternalRecipe.g:1871:1: ( ( rule__Ingredients__IngrAssignment_4 )* )
            {
            // InternalRecipe.g:1871:1: ( ( rule__Ingredients__IngrAssignment_4 )* )
            // InternalRecipe.g:1872:2: ( rule__Ingredients__IngrAssignment_4 )*
            {
             before(grammarAccess.getIngredientsAccess().getIngrAssignment_4()); 
            // InternalRecipe.g:1873:2: ( rule__Ingredients__IngrAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRecipe.g:1873:3: rule__Ingredients__IngrAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Ingredients__IngrAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getIngredientsAccess().getIngrAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__4__Impl"


    // $ANTLR start "rule__Ingredients__Group__5"
    // InternalRecipe.g:1881:1: rule__Ingredients__Group__5 : rule__Ingredients__Group__5__Impl ;
    public final void rule__Ingredients__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1885:1: ( rule__Ingredients__Group__5__Impl )
            // InternalRecipe.g:1886:2: rule__Ingredients__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredients__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__5"


    // $ANTLR start "rule__Ingredients__Group__5__Impl"
    // InternalRecipe.g:1892:1: rule__Ingredients__Group__5__Impl : ( '}' ) ;
    public final void rule__Ingredients__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1896:1: ( ( '}' ) )
            // InternalRecipe.g:1897:1: ( '}' )
            {
            // InternalRecipe.g:1897:1: ( '}' )
            // InternalRecipe.g:1898:2: '}'
            {
             before(grammarAccess.getIngredientsAccess().getRightCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIngredientsAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__Group__5__Impl"


    // $ANTLR start "rule__Ingredient__Group__0"
    // InternalRecipe.g:1908:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1912:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // InternalRecipe.g:1913:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Ingredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0"


    // $ANTLR start "rule__Ingredient__Group__0__Impl"
    // InternalRecipe.g:1920:1: rule__Ingredient__Group__0__Impl : ( ( rule__Ingredient__NameAssignment_0 ) ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1924:1: ( ( ( rule__Ingredient__NameAssignment_0 ) ) )
            // InternalRecipe.g:1925:1: ( ( rule__Ingredient__NameAssignment_0 ) )
            {
            // InternalRecipe.g:1925:1: ( ( rule__Ingredient__NameAssignment_0 ) )
            // InternalRecipe.g:1926:2: ( rule__Ingredient__NameAssignment_0 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_0()); 
            // InternalRecipe.g:1927:2: ( rule__Ingredient__NameAssignment_0 )
            // InternalRecipe.g:1927:3: rule__Ingredient__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0__Impl"


    // $ANTLR start "rule__Ingredient__Group__1"
    // InternalRecipe.g:1935:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1939:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // InternalRecipe.g:1940:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Ingredient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__1"


    // $ANTLR start "rule__Ingredient__Group__1__Impl"
    // InternalRecipe.g:1947:1: rule__Ingredient__Group__1__Impl : ( ( rule__Ingredient__SuitenameIngredientAssignment_1 )* ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1951:1: ( ( ( rule__Ingredient__SuitenameIngredientAssignment_1 )* ) )
            // InternalRecipe.g:1952:1: ( ( rule__Ingredient__SuitenameIngredientAssignment_1 )* )
            {
            // InternalRecipe.g:1952:1: ( ( rule__Ingredient__SuitenameIngredientAssignment_1 )* )
            // InternalRecipe.g:1953:2: ( rule__Ingredient__SuitenameIngredientAssignment_1 )*
            {
             before(grammarAccess.getIngredientAccess().getSuitenameIngredientAssignment_1()); 
            // InternalRecipe.g:1954:2: ( rule__Ingredient__SuitenameIngredientAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRecipe.g:1954:3: rule__Ingredient__SuitenameIngredientAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Ingredient__SuitenameIngredientAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getIngredientAccess().getSuitenameIngredientAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__1__Impl"


    // $ANTLR start "rule__Ingredient__Group__2"
    // InternalRecipe.g:1962:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1966:1: ( rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 )
            // InternalRecipe.g:1967:2: rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Ingredient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__2"


    // $ANTLR start "rule__Ingredient__Group__2__Impl"
    // InternalRecipe.g:1974:1: rule__Ingredient__Group__2__Impl : ( ':' ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1978:1: ( ( ':' ) )
            // InternalRecipe.g:1979:1: ( ':' )
            {
            // InternalRecipe.g:1979:1: ( ':' )
            // InternalRecipe.g:1980:2: ':'
            {
             before(grammarAccess.getIngredientAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__2__Impl"


    // $ANTLR start "rule__Ingredient__Group__3"
    // InternalRecipe.g:1989:1: rule__Ingredient__Group__3 : rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4 ;
    public final void rule__Ingredient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:1993:1: ( rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4 )
            // InternalRecipe.g:1994:2: rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Ingredient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__3"


    // $ANTLR start "rule__Ingredient__Group__3__Impl"
    // InternalRecipe.g:2001:1: rule__Ingredient__Group__3__Impl : ( ( rule__Ingredient__QteAssignment_3 ) ) ;
    public final void rule__Ingredient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2005:1: ( ( ( rule__Ingredient__QteAssignment_3 ) ) )
            // InternalRecipe.g:2006:1: ( ( rule__Ingredient__QteAssignment_3 ) )
            {
            // InternalRecipe.g:2006:1: ( ( rule__Ingredient__QteAssignment_3 ) )
            // InternalRecipe.g:2007:2: ( rule__Ingredient__QteAssignment_3 )
            {
             before(grammarAccess.getIngredientAccess().getQteAssignment_3()); 
            // InternalRecipe.g:2008:2: ( rule__Ingredient__QteAssignment_3 )
            // InternalRecipe.g:2008:3: rule__Ingredient__QteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__QteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getQteAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__3__Impl"


    // $ANTLR start "rule__Ingredient__Group__4"
    // InternalRecipe.g:2016:1: rule__Ingredient__Group__4 : rule__Ingredient__Group__4__Impl rule__Ingredient__Group__5 ;
    public final void rule__Ingredient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2020:1: ( rule__Ingredient__Group__4__Impl rule__Ingredient__Group__5 )
            // InternalRecipe.g:2021:2: rule__Ingredient__Group__4__Impl rule__Ingredient__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Ingredient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__4"


    // $ANTLR start "rule__Ingredient__Group__4__Impl"
    // InternalRecipe.g:2028:1: rule__Ingredient__Group__4__Impl : ( ( rule__Ingredient__QuantificateurAssignment_4 ) ) ;
    public final void rule__Ingredient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2032:1: ( ( ( rule__Ingredient__QuantificateurAssignment_4 ) ) )
            // InternalRecipe.g:2033:1: ( ( rule__Ingredient__QuantificateurAssignment_4 ) )
            {
            // InternalRecipe.g:2033:1: ( ( rule__Ingredient__QuantificateurAssignment_4 ) )
            // InternalRecipe.g:2034:2: ( rule__Ingredient__QuantificateurAssignment_4 )
            {
             before(grammarAccess.getIngredientAccess().getQuantificateurAssignment_4()); 
            // InternalRecipe.g:2035:2: ( rule__Ingredient__QuantificateurAssignment_4 )
            // InternalRecipe.g:2035:3: rule__Ingredient__QuantificateurAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__QuantificateurAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getQuantificateurAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__4__Impl"


    // $ANTLR start "rule__Ingredient__Group__5"
    // InternalRecipe.g:2043:1: rule__Ingredient__Group__5 : rule__Ingredient__Group__5__Impl rule__Ingredient__Group__6 ;
    public final void rule__Ingredient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2047:1: ( rule__Ingredient__Group__5__Impl rule__Ingredient__Group__6 )
            // InternalRecipe.g:2048:2: rule__Ingredient__Group__5__Impl rule__Ingredient__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Ingredient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__5"


    // $ANTLR start "rule__Ingredient__Group__5__Impl"
    // InternalRecipe.g:2055:1: rule__Ingredient__Group__5__Impl : ( ( rule__Ingredient__Group_5__0 )? ) ;
    public final void rule__Ingredient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2059:1: ( ( ( rule__Ingredient__Group_5__0 )? ) )
            // InternalRecipe.g:2060:1: ( ( rule__Ingredient__Group_5__0 )? )
            {
            // InternalRecipe.g:2060:1: ( ( rule__Ingredient__Group_5__0 )? )
            // InternalRecipe.g:2061:2: ( rule__Ingredient__Group_5__0 )?
            {
             before(grammarAccess.getIngredientAccess().getGroup_5()); 
            // InternalRecipe.g:2062:2: ( rule__Ingredient__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRecipe.g:2062:3: rule__Ingredient__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredient__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredientAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__5__Impl"


    // $ANTLR start "rule__Ingredient__Group__6"
    // InternalRecipe.g:2070:1: rule__Ingredient__Group__6 : rule__Ingredient__Group__6__Impl ;
    public final void rule__Ingredient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2074:1: ( rule__Ingredient__Group__6__Impl )
            // InternalRecipe.g:2075:2: rule__Ingredient__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__6"


    // $ANTLR start "rule__Ingredient__Group__6__Impl"
    // InternalRecipe.g:2081:1: rule__Ingredient__Group__6__Impl : ( ( rule__Ingredient__Group_6__0 )? ) ;
    public final void rule__Ingredient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2085:1: ( ( ( rule__Ingredient__Group_6__0 )? ) )
            // InternalRecipe.g:2086:1: ( ( rule__Ingredient__Group_6__0 )? )
            {
            // InternalRecipe.g:2086:1: ( ( rule__Ingredient__Group_6__0 )? )
            // InternalRecipe.g:2087:2: ( rule__Ingredient__Group_6__0 )?
            {
             before(grammarAccess.getIngredientAccess().getGroup_6()); 
            // InternalRecipe.g:2088:2: ( rule__Ingredient__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRecipe.g:2088:3: rule__Ingredient__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingredient__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredientAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__6__Impl"


    // $ANTLR start "rule__Ingredient__Group_5__0"
    // InternalRecipe.g:2097:1: rule__Ingredient__Group_5__0 : rule__Ingredient__Group_5__0__Impl rule__Ingredient__Group_5__1 ;
    public final void rule__Ingredient__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2101:1: ( rule__Ingredient__Group_5__0__Impl rule__Ingredient__Group_5__1 )
            // InternalRecipe.g:2102:2: rule__Ingredient__Group_5__0__Impl rule__Ingredient__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Ingredient__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_5__0"


    // $ANTLR start "rule__Ingredient__Group_5__0__Impl"
    // InternalRecipe.g:2109:1: rule__Ingredient__Group_5__0__Impl : ( '#' ) ;
    public final void rule__Ingredient__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2113:1: ( ( '#' ) )
            // InternalRecipe.g:2114:1: ( '#' )
            {
            // InternalRecipe.g:2114:1: ( '#' )
            // InternalRecipe.g:2115:2: '#'
            {
             before(grammarAccess.getIngredientAccess().getNumberSignKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNumberSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_5__0__Impl"


    // $ANTLR start "rule__Ingredient__Group_5__1"
    // InternalRecipe.g:2124:1: rule__Ingredient__Group_5__1 : rule__Ingredient__Group_5__1__Impl ;
    public final void rule__Ingredient__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2128:1: ( rule__Ingredient__Group_5__1__Impl )
            // InternalRecipe.g:2129:2: rule__Ingredient__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_5__1"


    // $ANTLR start "rule__Ingredient__Group_5__1__Impl"
    // InternalRecipe.g:2135:1: rule__Ingredient__Group_5__1__Impl : ( ( rule__Ingredient__GroupAssignment_5_1 ) ) ;
    public final void rule__Ingredient__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2139:1: ( ( ( rule__Ingredient__GroupAssignment_5_1 ) ) )
            // InternalRecipe.g:2140:1: ( ( rule__Ingredient__GroupAssignment_5_1 ) )
            {
            // InternalRecipe.g:2140:1: ( ( rule__Ingredient__GroupAssignment_5_1 ) )
            // InternalRecipe.g:2141:2: ( rule__Ingredient__GroupAssignment_5_1 )
            {
             before(grammarAccess.getIngredientAccess().getGroupAssignment_5_1()); 
            // InternalRecipe.g:2142:2: ( rule__Ingredient__GroupAssignment_5_1 )
            // InternalRecipe.g:2142:3: rule__Ingredient__GroupAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__GroupAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getGroupAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_5__1__Impl"


    // $ANTLR start "rule__Ingredient__Group_6__0"
    // InternalRecipe.g:2151:1: rule__Ingredient__Group_6__0 : rule__Ingredient__Group_6__0__Impl rule__Ingredient__Group_6__1 ;
    public final void rule__Ingredient__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2155:1: ( rule__Ingredient__Group_6__0__Impl rule__Ingredient__Group_6__1 )
            // InternalRecipe.g:2156:2: rule__Ingredient__Group_6__0__Impl rule__Ingredient__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__Ingredient__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_6__0"


    // $ANTLR start "rule__Ingredient__Group_6__0__Impl"
    // InternalRecipe.g:2163:1: rule__Ingredient__Group_6__0__Impl : ( '@' ) ;
    public final void rule__Ingredient__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2167:1: ( ( '@' ) )
            // InternalRecipe.g:2168:1: ( '@' )
            {
            // InternalRecipe.g:2168:1: ( '@' )
            // InternalRecipe.g:2169:2: '@'
            {
             before(grammarAccess.getIngredientAccess().getCommercialAtKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getCommercialAtKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_6__0__Impl"


    // $ANTLR start "rule__Ingredient__Group_6__1"
    // InternalRecipe.g:2178:1: rule__Ingredient__Group_6__1 : rule__Ingredient__Group_6__1__Impl ;
    public final void rule__Ingredient__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2182:1: ( rule__Ingredient__Group_6__1__Impl )
            // InternalRecipe.g:2183:2: rule__Ingredient__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_6__1"


    // $ANTLR start "rule__Ingredient__Group_6__1__Impl"
    // InternalRecipe.g:2189:1: rule__Ingredient__Group_6__1__Impl : ( ( rule__Ingredient__TagAssignment_6_1 ) ) ;
    public final void rule__Ingredient__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2193:1: ( ( ( rule__Ingredient__TagAssignment_6_1 ) ) )
            // InternalRecipe.g:2194:1: ( ( rule__Ingredient__TagAssignment_6_1 ) )
            {
            // InternalRecipe.g:2194:1: ( ( rule__Ingredient__TagAssignment_6_1 ) )
            // InternalRecipe.g:2195:2: ( rule__Ingredient__TagAssignment_6_1 )
            {
             before(grammarAccess.getIngredientAccess().getTagAssignment_6_1()); 
            // InternalRecipe.g:2196:2: ( rule__Ingredient__TagAssignment_6_1 )
            // InternalRecipe.g:2196:3: rule__Ingredient__TagAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingredient__TagAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getTagAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_6__1__Impl"


    // $ANTLR start "rule__Quantificateurs__Group_0__0"
    // InternalRecipe.g:2205:1: rule__Quantificateurs__Group_0__0 : rule__Quantificateurs__Group_0__0__Impl rule__Quantificateurs__Group_0__1 ;
    public final void rule__Quantificateurs__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2209:1: ( rule__Quantificateurs__Group_0__0__Impl rule__Quantificateurs__Group_0__1 )
            // InternalRecipe.g:2210:2: rule__Quantificateurs__Group_0__0__Impl rule__Quantificateurs__Group_0__1
            {
            pushFollow(FOLLOW_29);
            rule__Quantificateurs__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantificateurs__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_0__0"


    // $ANTLR start "rule__Quantificateurs__Group_0__0__Impl"
    // InternalRecipe.g:2217:1: rule__Quantificateurs__Group_0__0__Impl : ( () ) ;
    public final void rule__Quantificateurs__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2221:1: ( ( () ) )
            // InternalRecipe.g:2222:1: ( () )
            {
            // InternalRecipe.g:2222:1: ( () )
            // InternalRecipe.g:2223:2: ()
            {
             before(grammarAccess.getQuantificateursAccess().getQuantificateursAction_0_0()); 
            // InternalRecipe.g:2224:2: ()
            // InternalRecipe.g:2224:3: 
            {
            }

             after(grammarAccess.getQuantificateursAccess().getQuantificateursAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_0__0__Impl"


    // $ANTLR start "rule__Quantificateurs__Group_0__1"
    // InternalRecipe.g:2232:1: rule__Quantificateurs__Group_0__1 : rule__Quantificateurs__Group_0__1__Impl ;
    public final void rule__Quantificateurs__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2236:1: ( rule__Quantificateurs__Group_0__1__Impl )
            // InternalRecipe.g:2237:2: rule__Quantificateurs__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quantificateurs__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_0__1"


    // $ANTLR start "rule__Quantificateurs__Group_0__1__Impl"
    // InternalRecipe.g:2243:1: rule__Quantificateurs__Group_0__1__Impl : ( 'c\\u00E0c' ) ;
    public final void rule__Quantificateurs__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2247:1: ( ( 'c\\u00E0c' ) )
            // InternalRecipe.g:2248:1: ( 'c\\u00E0c' )
            {
            // InternalRecipe.g:2248:1: ( 'c\\u00E0c' )
            // InternalRecipe.g:2249:2: 'c\\u00E0c'
            {
             before(grammarAccess.getQuantificateursAccess().getCCKeyword_0_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getQuantificateursAccess().getCCKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_0__1__Impl"


    // $ANTLR start "rule__Quantificateurs__Group_1__0"
    // InternalRecipe.g:2259:1: rule__Quantificateurs__Group_1__0 : rule__Quantificateurs__Group_1__0__Impl rule__Quantificateurs__Group_1__1 ;
    public final void rule__Quantificateurs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2263:1: ( rule__Quantificateurs__Group_1__0__Impl rule__Quantificateurs__Group_1__1 )
            // InternalRecipe.g:2264:2: rule__Quantificateurs__Group_1__0__Impl rule__Quantificateurs__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Quantificateurs__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantificateurs__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_1__0"


    // $ANTLR start "rule__Quantificateurs__Group_1__0__Impl"
    // InternalRecipe.g:2271:1: rule__Quantificateurs__Group_1__0__Impl : ( () ) ;
    public final void rule__Quantificateurs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2275:1: ( ( () ) )
            // InternalRecipe.g:2276:1: ( () )
            {
            // InternalRecipe.g:2276:1: ( () )
            // InternalRecipe.g:2277:2: ()
            {
             before(grammarAccess.getQuantificateursAccess().getQuantificateursAction_1_0()); 
            // InternalRecipe.g:2278:2: ()
            // InternalRecipe.g:2278:3: 
            {
            }

             after(grammarAccess.getQuantificateursAccess().getQuantificateursAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_1__0__Impl"


    // $ANTLR start "rule__Quantificateurs__Group_1__1"
    // InternalRecipe.g:2286:1: rule__Quantificateurs__Group_1__1 : rule__Quantificateurs__Group_1__1__Impl ;
    public final void rule__Quantificateurs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2290:1: ( rule__Quantificateurs__Group_1__1__Impl )
            // InternalRecipe.g:2291:2: rule__Quantificateurs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quantificateurs__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_1__1"


    // $ANTLR start "rule__Quantificateurs__Group_1__1__Impl"
    // InternalRecipe.g:2297:1: rule__Quantificateurs__Group_1__1__Impl : ( 'c\\u00E0s' ) ;
    public final void rule__Quantificateurs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2301:1: ( ( 'c\\u00E0s' ) )
            // InternalRecipe.g:2302:1: ( 'c\\u00E0s' )
            {
            // InternalRecipe.g:2302:1: ( 'c\\u00E0s' )
            // InternalRecipe.g:2303:2: 'c\\u00E0s'
            {
             before(grammarAccess.getQuantificateursAccess().getCSKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getQuantificateursAccess().getCSKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_1__1__Impl"


    // $ANTLR start "rule__Quantificateurs__Group_2__0"
    // InternalRecipe.g:2313:1: rule__Quantificateurs__Group_2__0 : rule__Quantificateurs__Group_2__0__Impl rule__Quantificateurs__Group_2__1 ;
    public final void rule__Quantificateurs__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2317:1: ( rule__Quantificateurs__Group_2__0__Impl rule__Quantificateurs__Group_2__1 )
            // InternalRecipe.g:2318:2: rule__Quantificateurs__Group_2__0__Impl rule__Quantificateurs__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Quantificateurs__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantificateurs__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_2__0"


    // $ANTLR start "rule__Quantificateurs__Group_2__0__Impl"
    // InternalRecipe.g:2325:1: rule__Quantificateurs__Group_2__0__Impl : ( () ) ;
    public final void rule__Quantificateurs__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2329:1: ( ( () ) )
            // InternalRecipe.g:2330:1: ( () )
            {
            // InternalRecipe.g:2330:1: ( () )
            // InternalRecipe.g:2331:2: ()
            {
             before(grammarAccess.getQuantificateursAccess().getQuantificateursAction_2_0()); 
            // InternalRecipe.g:2332:2: ()
            // InternalRecipe.g:2332:3: 
            {
            }

             after(grammarAccess.getQuantificateursAccess().getQuantificateursAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_2__0__Impl"


    // $ANTLR start "rule__Quantificateurs__Group_2__1"
    // InternalRecipe.g:2340:1: rule__Quantificateurs__Group_2__1 : rule__Quantificateurs__Group_2__1__Impl rule__Quantificateurs__Group_2__2 ;
    public final void rule__Quantificateurs__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2344:1: ( rule__Quantificateurs__Group_2__1__Impl rule__Quantificateurs__Group_2__2 )
            // InternalRecipe.g:2345:2: rule__Quantificateurs__Group_2__1__Impl rule__Quantificateurs__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__Quantificateurs__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantificateurs__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_2__1"


    // $ANTLR start "rule__Quantificateurs__Group_2__1__Impl"
    // InternalRecipe.g:2352:1: rule__Quantificateurs__Group_2__1__Impl : ( ( rule__Quantificateurs__UnitAssignment_2_1 )? ) ;
    public final void rule__Quantificateurs__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2356:1: ( ( ( rule__Quantificateurs__UnitAssignment_2_1 )? ) )
            // InternalRecipe.g:2357:1: ( ( rule__Quantificateurs__UnitAssignment_2_1 )? )
            {
            // InternalRecipe.g:2357:1: ( ( rule__Quantificateurs__UnitAssignment_2_1 )? )
            // InternalRecipe.g:2358:2: ( rule__Quantificateurs__UnitAssignment_2_1 )?
            {
             before(grammarAccess.getQuantificateursAccess().getUnitAssignment_2_1()); 
            // InternalRecipe.g:2359:2: ( rule__Quantificateurs__UnitAssignment_2_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=19 && LA18_0<=24)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRecipe.g:2359:3: rule__Quantificateurs__UnitAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Quantificateurs__UnitAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuantificateursAccess().getUnitAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_2__1__Impl"


    // $ANTLR start "rule__Quantificateurs__Group_2__2"
    // InternalRecipe.g:2367:1: rule__Quantificateurs__Group_2__2 : rule__Quantificateurs__Group_2__2__Impl ;
    public final void rule__Quantificateurs__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2371:1: ( rule__Quantificateurs__Group_2__2__Impl )
            // InternalRecipe.g:2372:2: rule__Quantificateurs__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quantificateurs__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_2__2"


    // $ANTLR start "rule__Quantificateurs__Group_2__2__Impl"
    // InternalRecipe.g:2378:1: rule__Quantificateurs__Group_2__2__Impl : ( ( rule__Quantificateurs__Alternatives_2_2 ) ) ;
    public final void rule__Quantificateurs__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2382:1: ( ( ( rule__Quantificateurs__Alternatives_2_2 ) ) )
            // InternalRecipe.g:2383:1: ( ( rule__Quantificateurs__Alternatives_2_2 ) )
            {
            // InternalRecipe.g:2383:1: ( ( rule__Quantificateurs__Alternatives_2_2 ) )
            // InternalRecipe.g:2384:2: ( rule__Quantificateurs__Alternatives_2_2 )
            {
             before(grammarAccess.getQuantificateursAccess().getAlternatives_2_2()); 
            // InternalRecipe.g:2385:2: ( rule__Quantificateurs__Alternatives_2_2 )
            // InternalRecipe.g:2385:3: rule__Quantificateurs__Alternatives_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Quantificateurs__Alternatives_2_2();

            state._fsp--;


            }

             after(grammarAccess.getQuantificateursAccess().getAlternatives_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__Group_2__2__Impl"


    // $ANTLR start "rule__Instructions__Group__0"
    // InternalRecipe.g:2394:1: rule__Instructions__Group__0 : rule__Instructions__Group__0__Impl rule__Instructions__Group__1 ;
    public final void rule__Instructions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2398:1: ( rule__Instructions__Group__0__Impl rule__Instructions__Group__1 )
            // InternalRecipe.g:2399:2: rule__Instructions__Group__0__Impl rule__Instructions__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Instructions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instructions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__0"


    // $ANTLR start "rule__Instructions__Group__0__Impl"
    // InternalRecipe.g:2406:1: rule__Instructions__Group__0__Impl : ( () ) ;
    public final void rule__Instructions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2410:1: ( ( () ) )
            // InternalRecipe.g:2411:1: ( () )
            {
            // InternalRecipe.g:2411:1: ( () )
            // InternalRecipe.g:2412:2: ()
            {
             before(grammarAccess.getInstructionsAccess().getInstructionsAction_0()); 
            // InternalRecipe.g:2413:2: ()
            // InternalRecipe.g:2413:3: 
            {
            }

             after(grammarAccess.getInstructionsAccess().getInstructionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__0__Impl"


    // $ANTLR start "rule__Instructions__Group__1"
    // InternalRecipe.g:2421:1: rule__Instructions__Group__1 : rule__Instructions__Group__1__Impl rule__Instructions__Group__2 ;
    public final void rule__Instructions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2425:1: ( rule__Instructions__Group__1__Impl rule__Instructions__Group__2 )
            // InternalRecipe.g:2426:2: rule__Instructions__Group__1__Impl rule__Instructions__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Instructions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instructions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__1"


    // $ANTLR start "rule__Instructions__Group__1__Impl"
    // InternalRecipe.g:2433:1: rule__Instructions__Group__1__Impl : ( 'instructions' ) ;
    public final void rule__Instructions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2437:1: ( ( 'instructions' ) )
            // InternalRecipe.g:2438:1: ( 'instructions' )
            {
            // InternalRecipe.g:2438:1: ( 'instructions' )
            // InternalRecipe.g:2439:2: 'instructions'
            {
             before(grammarAccess.getInstructionsAccess().getInstructionsKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInstructionsAccess().getInstructionsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__1__Impl"


    // $ANTLR start "rule__Instructions__Group__2"
    // InternalRecipe.g:2448:1: rule__Instructions__Group__2 : rule__Instructions__Group__2__Impl rule__Instructions__Group__3 ;
    public final void rule__Instructions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2452:1: ( rule__Instructions__Group__2__Impl rule__Instructions__Group__3 )
            // InternalRecipe.g:2453:2: rule__Instructions__Group__2__Impl rule__Instructions__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Instructions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instructions__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__2"


    // $ANTLR start "rule__Instructions__Group__2__Impl"
    // InternalRecipe.g:2460:1: rule__Instructions__Group__2__Impl : ( ':' ) ;
    public final void rule__Instructions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2464:1: ( ( ':' ) )
            // InternalRecipe.g:2465:1: ( ':' )
            {
            // InternalRecipe.g:2465:1: ( ':' )
            // InternalRecipe.g:2466:2: ':'
            {
             before(grammarAccess.getInstructionsAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInstructionsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__2__Impl"


    // $ANTLR start "rule__Instructions__Group__3"
    // InternalRecipe.g:2475:1: rule__Instructions__Group__3 : rule__Instructions__Group__3__Impl rule__Instructions__Group__4 ;
    public final void rule__Instructions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2479:1: ( rule__Instructions__Group__3__Impl rule__Instructions__Group__4 )
            // InternalRecipe.g:2480:2: rule__Instructions__Group__3__Impl rule__Instructions__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Instructions__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instructions__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__3"


    // $ANTLR start "rule__Instructions__Group__3__Impl"
    // InternalRecipe.g:2487:1: rule__Instructions__Group__3__Impl : ( '{' ) ;
    public final void rule__Instructions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2491:1: ( ( '{' ) )
            // InternalRecipe.g:2492:1: ( '{' )
            {
            // InternalRecipe.g:2492:1: ( '{' )
            // InternalRecipe.g:2493:2: '{'
            {
             before(grammarAccess.getInstructionsAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInstructionsAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__3__Impl"


    // $ANTLR start "rule__Instructions__Group__4"
    // InternalRecipe.g:2502:1: rule__Instructions__Group__4 : rule__Instructions__Group__4__Impl ;
    public final void rule__Instructions__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2506:1: ( rule__Instructions__Group__4__Impl )
            // InternalRecipe.g:2507:2: rule__Instructions__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instructions__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__4"


    // $ANTLR start "rule__Instructions__Group__4__Impl"
    // InternalRecipe.g:2513:1: rule__Instructions__Group__4__Impl : ( '}' ) ;
    public final void rule__Instructions__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2517:1: ( ( '}' ) )
            // InternalRecipe.g:2518:1: ( '}' )
            {
            // InternalRecipe.g:2518:1: ( '}' )
            // InternalRecipe.g:2519:2: '}'
            {
             before(grammarAccess.getInstructionsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInstructionsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instructions__Group__4__Impl"


    // $ANTLR start "rule__Model__DefTechniquesAssignment_0"
    // InternalRecipe.g:2529:1: rule__Model__DefTechniquesAssignment_0 : ( ruleTechnique ) ;
    public final void rule__Model__DefTechniquesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2533:1: ( ( ruleTechnique ) )
            // InternalRecipe.g:2534:2: ( ruleTechnique )
            {
            // InternalRecipe.g:2534:2: ( ruleTechnique )
            // InternalRecipe.g:2535:3: ruleTechnique
            {
             before(grammarAccess.getModelAccess().getDefTechniquesTechniqueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTechnique();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDefTechniquesTechniqueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DefTechniquesAssignment_0"


    // $ANTLR start "rule__Model__RecipesAssignment_1"
    // InternalRecipe.g:2544:1: rule__Model__RecipesAssignment_1 : ( ruleRecipe ) ;
    public final void rule__Model__RecipesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2548:1: ( ( ruleRecipe ) )
            // InternalRecipe.g:2549:2: ( ruleRecipe )
            {
            // InternalRecipe.g:2549:2: ( ruleRecipe )
            // InternalRecipe.g:2550:3: ruleRecipe
            {
             before(grammarAccess.getModelAccess().getRecipesRecipeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRecipesRecipeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RecipesAssignment_1"


    // $ANTLR start "rule__Technique__NameAssignment_1"
    // InternalRecipe.g:2559:1: rule__Technique__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Technique__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2563:1: ( ( RULE_ID ) )
            // InternalRecipe.g:2564:2: ( RULE_ID )
            {
            // InternalRecipe.g:2564:2: ( RULE_ID )
            // InternalRecipe.g:2565:3: RULE_ID
            {
             before(grammarAccess.getTechniqueAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTechniqueAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__NameAssignment_1"


    // $ANTLR start "rule__Technique__ObjectsFacAssignment_2_0_1"
    // InternalRecipe.g:2574:1: rule__Technique__ObjectsFacAssignment_2_0_1 : ( ruleIngrUslTech ) ;
    public final void rule__Technique__ObjectsFacAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2578:1: ( ( ruleIngrUslTech ) )
            // InternalRecipe.g:2579:2: ( ruleIngrUslTech )
            {
            // InternalRecipe.g:2579:2: ( ruleIngrUslTech )
            // InternalRecipe.g:2580:3: ruleIngrUslTech
            {
             before(grammarAccess.getTechniqueAccess().getObjectsFacIngrUslTechParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIngrUslTech();

            state._fsp--;

             after(grammarAccess.getTechniqueAccess().getObjectsFacIngrUslTechParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__ObjectsFacAssignment_2_0_1"


    // $ANTLR start "rule__Technique__ObjectsAssignment_2_1"
    // InternalRecipe.g:2589:1: rule__Technique__ObjectsAssignment_2_1 : ( ruleIngrUslTech ) ;
    public final void rule__Technique__ObjectsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2593:1: ( ( ruleIngrUslTech ) )
            // InternalRecipe.g:2594:2: ( ruleIngrUslTech )
            {
            // InternalRecipe.g:2594:2: ( ruleIngrUslTech )
            // InternalRecipe.g:2595:3: ruleIngrUslTech
            {
             before(grammarAccess.getTechniqueAccess().getObjectsIngrUslTechParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIngrUslTech();

            state._fsp--;

             after(grammarAccess.getTechniqueAccess().getObjectsIngrUslTechParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Technique__ObjectsAssignment_2_1"


    // $ANTLR start "rule__Choices__ChoixAssignment_0_0"
    // InternalRecipe.g:2604:1: rule__Choices__ChoixAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Choices__ChoixAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2608:1: ( ( RULE_ID ) )
            // InternalRecipe.g:2609:2: ( RULE_ID )
            {
            // InternalRecipe.g:2609:2: ( RULE_ID )
            // InternalRecipe.g:2610:3: RULE_ID
            {
             before(grammarAccess.getChoicesAccess().getChoixIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoicesAccess().getChoixIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__ChoixAssignment_0_0"


    // $ANTLR start "rule__Choices__ChoixAssignment_0_1_1"
    // InternalRecipe.g:2619:1: rule__Choices__ChoixAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__Choices__ChoixAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2623:1: ( ( RULE_ID ) )
            // InternalRecipe.g:2624:2: ( RULE_ID )
            {
            // InternalRecipe.g:2624:2: ( RULE_ID )
            // InternalRecipe.g:2625:3: RULE_ID
            {
             before(grammarAccess.getChoicesAccess().getChoixIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChoicesAccess().getChoixIDTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choices__ChoixAssignment_0_1_1"


    // $ANTLR start "rule__Recipe__NameAssignment_4"
    // InternalRecipe.g:2634:1: rule__Recipe__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Recipe__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2638:1: ( ( RULE_ID ) )
            // InternalRecipe.g:2639:2: ( RULE_ID )
            {
            // InternalRecipe.g:2639:2: ( RULE_ID )
            // InternalRecipe.g:2640:3: RULE_ID
            {
             before(grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__NameAssignment_4"


    // $ANTLR start "rule__Recipe__SuitenameAssignment_5"
    // InternalRecipe.g:2649:1: rule__Recipe__SuitenameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Recipe__SuitenameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2653:1: ( ( RULE_ID ) )
            // InternalRecipe.g:2654:2: ( RULE_ID )
            {
            // InternalRecipe.g:2654:2: ( RULE_ID )
            // InternalRecipe.g:2655:3: RULE_ID
            {
             before(grammarAccess.getRecipeAccess().getSuitenameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getSuitenameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__SuitenameAssignment_5"


    // $ANTLR start "rule__Recipe__TimeAssignment_8"
    // InternalRecipe.g:2664:1: rule__Recipe__TimeAssignment_8 : ( RULE_DOUBLE ) ;
    public final void rule__Recipe__TimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2668:1: ( ( RULE_DOUBLE ) )
            // InternalRecipe.g:2669:2: ( RULE_DOUBLE )
            {
            // InternalRecipe.g:2669:2: ( RULE_DOUBLE )
            // InternalRecipe.g:2670:3: RULE_DOUBLE
            {
             before(grammarAccess.getRecipeAccess().getTimeDOUBLETerminalRuleCall_8_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getTimeDOUBLETerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__TimeAssignment_8"


    // $ANTLR start "rule__Recipe__NbAssignment_11"
    // InternalRecipe.g:2679:1: rule__Recipe__NbAssignment_11 : ( RULE_DOUBLE ) ;
    public final void rule__Recipe__NbAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2683:1: ( ( RULE_DOUBLE ) )
            // InternalRecipe.g:2684:2: ( RULE_DOUBLE )
            {
            // InternalRecipe.g:2684:2: ( RULE_DOUBLE )
            // InternalRecipe.g:2685:3: RULE_DOUBLE
            {
             before(grammarAccess.getRecipeAccess().getNbDOUBLETerminalRuleCall_11_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getRecipeAccess().getNbDOUBLETerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__NbAssignment_11"


    // $ANTLR start "rule__Recipe__IngredientsAssignment_12"
    // InternalRecipe.g:2694:1: rule__Recipe__IngredientsAssignment_12 : ( ruleIngredients ) ;
    public final void rule__Recipe__IngredientsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2698:1: ( ( ruleIngredients ) )
            // InternalRecipe.g:2699:2: ( ruleIngredients )
            {
            // InternalRecipe.g:2699:2: ( ruleIngredients )
            // InternalRecipe.g:2700:3: ruleIngredients
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientsParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredients();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientsIngredientsParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientsAssignment_12"


    // $ANTLR start "rule__Recipe__UstensilsAssignment_13"
    // InternalRecipe.g:2709:1: rule__Recipe__UstensilsAssignment_13 : ( ruleUstensils ) ;
    public final void rule__Recipe__UstensilsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2713:1: ( ( ruleUstensils ) )
            // InternalRecipe.g:2714:2: ( ruleUstensils )
            {
            // InternalRecipe.g:2714:2: ( ruleUstensils )
            // InternalRecipe.g:2715:3: ruleUstensils
            {
             before(grammarAccess.getRecipeAccess().getUstensilsUstensilsParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleUstensils();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getUstensilsUstensilsParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__UstensilsAssignment_13"


    // $ANTLR start "rule__Recipe__InstructionsAssignment_14"
    // InternalRecipe.g:2724:1: rule__Recipe__InstructionsAssignment_14 : ( ruleInstructions ) ;
    public final void rule__Recipe__InstructionsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2728:1: ( ( ruleInstructions ) )
            // InternalRecipe.g:2729:2: ( ruleInstructions )
            {
            // InternalRecipe.g:2729:2: ( ruleInstructions )
            // InternalRecipe.g:2730:3: ruleInstructions
            {
             before(grammarAccess.getRecipeAccess().getInstructionsInstructionsParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleInstructions();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getInstructionsInstructionsParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__InstructionsAssignment_14"


    // $ANTLR start "rule__Ustensils__UstrAssignment_4"
    // InternalRecipe.g:2739:1: rule__Ustensils__UstrAssignment_4 : ( ruleUstensil ) ;
    public final void rule__Ustensils__UstrAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2743:1: ( ( ruleUstensil ) )
            // InternalRecipe.g:2744:2: ( ruleUstensil )
            {
            // InternalRecipe.g:2744:2: ( ruleUstensil )
            // InternalRecipe.g:2745:3: ruleUstensil
            {
             before(grammarAccess.getUstensilsAccess().getUstrUstensilParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUstensil();

            state._fsp--;

             after(grammarAccess.getUstensilsAccess().getUstrUstensilParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensils__UstrAssignment_4"


    // $ANTLR start "rule__Ustensil__NameAssignment"
    // InternalRecipe.g:2754:1: rule__Ustensil__NameAssignment : ( RULE_ID ) ;
    public final void rule__Ustensil__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2758:1: ( ( RULE_ID ) )
            // InternalRecipe.g:2759:2: ( RULE_ID )
            {
            // InternalRecipe.g:2759:2: ( RULE_ID )
            // InternalRecipe.g:2760:3: RULE_ID
            {
             before(grammarAccess.getUstensilAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUstensilAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ustensil__NameAssignment"


    // $ANTLR start "rule__Ingredients__IngrAssignment_4"
    // InternalRecipe.g:2769:1: rule__Ingredients__IngrAssignment_4 : ( ruleIngredient ) ;
    public final void rule__Ingredients__IngrAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2773:1: ( ( ruleIngredient ) )
            // InternalRecipe.g:2774:2: ( ruleIngredient )
            {
            // InternalRecipe.g:2774:2: ( ruleIngredient )
            // InternalRecipe.g:2775:3: ruleIngredient
            {
             before(grammarAccess.getIngredientsAccess().getIngrIngredientParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientsAccess().getIngrIngredientParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredients__IngrAssignment_4"


    // $ANTLR start "rule__Ingredient__NameAssignment_0"
    // InternalRecipe.g:2784:1: rule__Ingredient__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Ingredient__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2788:1: ( ( RULE_ID ) )
            // InternalRecipe.g:2789:2: ( RULE_ID )
            {
            // InternalRecipe.g:2789:2: ( RULE_ID )
            // InternalRecipe.g:2790:3: RULE_ID
            {
             before(grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__NameAssignment_0"


    // $ANTLR start "rule__Ingredient__SuitenameIngredientAssignment_1"
    // InternalRecipe.g:2799:1: rule__Ingredient__SuitenameIngredientAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ingredient__SuitenameIngredientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2803:1: ( ( RULE_ID ) )
            // InternalRecipe.g:2804:2: ( RULE_ID )
            {
            // InternalRecipe.g:2804:2: ( RULE_ID )
            // InternalRecipe.g:2805:3: RULE_ID
            {
             before(grammarAccess.getIngredientAccess().getSuitenameIngredientIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getSuitenameIngredientIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__SuitenameIngredientAssignment_1"


    // $ANTLR start "rule__Ingredient__QteAssignment_3"
    // InternalRecipe.g:2814:1: rule__Ingredient__QteAssignment_3 : ( RULE_DOUBLE ) ;
    public final void rule__Ingredient__QteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2818:1: ( ( RULE_DOUBLE ) )
            // InternalRecipe.g:2819:2: ( RULE_DOUBLE )
            {
            // InternalRecipe.g:2819:2: ( RULE_DOUBLE )
            // InternalRecipe.g:2820:3: RULE_DOUBLE
            {
             before(grammarAccess.getIngredientAccess().getQteDOUBLETerminalRuleCall_3_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getQteDOUBLETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__QteAssignment_3"


    // $ANTLR start "rule__Ingredient__QuantificateurAssignment_4"
    // InternalRecipe.g:2829:1: rule__Ingredient__QuantificateurAssignment_4 : ( ruleQuantificateurs ) ;
    public final void rule__Ingredient__QuantificateurAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2833:1: ( ( ruleQuantificateurs ) )
            // InternalRecipe.g:2834:2: ( ruleQuantificateurs )
            {
            // InternalRecipe.g:2834:2: ( ruleQuantificateurs )
            // InternalRecipe.g:2835:3: ruleQuantificateurs
            {
             before(grammarAccess.getIngredientAccess().getQuantificateurQuantificateursParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantificateurs();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getQuantificateurQuantificateursParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__QuantificateurAssignment_4"


    // $ANTLR start "rule__Ingredient__GroupAssignment_5_1"
    // InternalRecipe.g:2844:1: rule__Ingredient__GroupAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Ingredient__GroupAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2848:1: ( ( RULE_ID ) )
            // InternalRecipe.g:2849:2: ( RULE_ID )
            {
            // InternalRecipe.g:2849:2: ( RULE_ID )
            // InternalRecipe.g:2850:3: RULE_ID
            {
             before(grammarAccess.getIngredientAccess().getGroupIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getGroupIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__GroupAssignment_5_1"


    // $ANTLR start "rule__Ingredient__TagAssignment_6_1"
    // InternalRecipe.g:2859:1: rule__Ingredient__TagAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__Ingredient__TagAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2863:1: ( ( RULE_ID ) )
            // InternalRecipe.g:2864:2: ( RULE_ID )
            {
            // InternalRecipe.g:2864:2: ( RULE_ID )
            // InternalRecipe.g:2865:3: RULE_ID
            {
             before(grammarAccess.getIngredientAccess().getTagIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIngredientAccess().getTagIDTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__TagAssignment_6_1"


    // $ANTLR start "rule__Quantificateurs__UnitAssignment_2_1"
    // InternalRecipe.g:2874:1: rule__Quantificateurs__UnitAssignment_2_1 : ( ruleUnit ) ;
    public final void rule__Quantificateurs__UnitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRecipe.g:2878:1: ( ( ruleUnit ) )
            // InternalRecipe.g:2879:2: ( ruleUnit )
            {
            // InternalRecipe.g:2879:2: ( ruleUnit )
            // InternalRecipe.g:2880:3: ruleUnit
            {
             before(grammarAccess.getQuantificateursAccess().getUnitUnitParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getQuantificateursAccess().getUnitUnitParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quantificateurs__UnitAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001401F000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001401F002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000030001FE0000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});

}