/*
 * generated by Xtext 2.23.0
 */
package cuisine.recipe.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import cuisine.recipe.RecipeRuntimeModule;
import cuisine.recipe.RecipeStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class RecipeIdeSetup extends RecipeStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new RecipeRuntimeModule(), new RecipeIdeModule()));
	}
	
}
