# The grammar is here (Julio + Corentin + Antonin):

`cuisine.recipe/src/cuisine/recipe/Recipe.xtext`

# The validator that checks the recipe are correct is here (Julio):

`cuisine.recipe/src/cuisine/recipe/validation/RecipeValidator.java`

- check if technique already define
- check if technique not define in instruction
- check if ustensil already define
- check if choices are define
- check for each instruction parameter if it's corresponding correctly to the technique :
-> check if the choice is well composed 
-> check if temperature, ingredients (group, tag, name), utensils (tag, name), time, quantity, preparation, choice can be placed

# The generator that writes in a latex file the recipes (Julio + Corentin) :

`cuisine.recipe/src/cuisine/recipe/generator/RecipeGenerator.xtend`

# The unit tests that test the grammar (Corentin + Antonin):

`cuisine.recipe.tests/src/cuisine/recipe/tests/RecipeParsingTest.xtend`

# The customised outline (Julio):

`cuisine.recipe.ui/src/cuisine/recipe/ui/outline/RecipeOutlineTreeProvider.java`

# The quick-fix features (TODO):

`cuisine.recipe.ui/src/cuisine/recipe/ui/quickfix/RecipeQuickfixProvider.java`

# The content assist features (Julio):

`cuisine.recipe.ui/src/cuisine/recipe/ui/contentassist/RecipeProposalProvider.java`

- autocomplete the technique definition, recipe, ingredientsList, utensilList, ingredient, utensil, instructionList with a template
- autocomplete the technique proposal with all TechParameterType possibles, with or without [] for facultatory 
- autocomplete the technique for facultatory proposal with all TechParameterType possibles
- autocomplete nb, time values of recipe with an integer
- autocomplete quantity of an ingredient with an integer or with the word "any"
- autocomplete quantifier of an ingredient with the list of quantifier possibles
- autocomplete the technique for the instruction with a list of all technique defined previously
- autocomplete all instruction parameter checking the technique and the parameter already displayed with the corrects possibles delimiters : 
-> displaying the list of ingredients name, tag, group and preparation possibles when a ingredient can be add checking the technique parameters
-> displaying the list of utensil name, tag possibles when a utensil can be add checking the technique parameters
-> displaying an integer list when a quantity, time, temperature can be add checking the technique parameters
-> autocomplete the quantity, time, temp with respectively the quantifier list, timequantifier list, tempquantifier list in an instruction
-> displaying the list of preparation possibles when a preparation can be add checking the technique parameters
-> displaying the list of generated combinaisons of choice possibles when a choice can be add checking the technique parameters

# The labeling features with images (Antonin):

`cuisine.recipe.ui/src/cuisine/recipe/ui/contentassist/RecipeProposalProvider.java`

# Setting the keywords colour (TODO):

`cuisine.recipe.ui/src/cuisine/recipe/ui/RecipeUiModule.java`

`cuisine.recipe.ui/src/cuisine/recipe/ui/coloring/RecipeHighlightingConfiguration.java` (to create)

# Semantic highlighting (TODO):

`cuisine.recipe.ui/src/cuisine/recipe/ui/RecipeUiModule.java`

`cuisine.recipe.ui/src/cuisine/recipe/ui/coloring/RecipeSemanticHighlightingCalculator.java` (to create)

`cuisine.recipe.ui/src/cuisine/recipe/ui/coloring/RecipeHighlightingConfiguration.java`