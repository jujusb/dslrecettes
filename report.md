# Cook Serve DSL

## Base idea

The goal of this DSL is to allow users to describe any recipe.

## Metamodel

To build the metamodel we started by conceiving a plausible syntax. We then tried to translate a real recipe into this prototype language. This allowed us to immediately improve and correct the language.
Then, we build the metamodel from this langage. The result is visible in the following picture.

![Cook Serve DSL metamodel](.\Metamodele.png)

This DSL represent a cookbook made of several recipes and cooking techniques used in these recipes such as *stirring something* or *zesting a citrus*. A recipe is describe by attributes like its name or its preparation time, and more particularly its lists of ingredients, utensils and instructions. The list of instructions corresponds to the actual recipe steps. As the ingredients are related to a quantities we need quantifiers. Ingredients and utensils are both elements used in instructions so they inherit from the same class.

## Grammar rules

A recipe written in **Cook Serve DSL** starts by a set of techniques definitions that will be used . The syntax is `define technique_name element [optional_element] {{descriptor}}`.

Then the rest of the recipe is described in a `recipe` block. Recipe attributes are written right after.

```
recipe {
	name : Gaufres
    time : 20min 2min
    nb_pers : 8
}
```

In an inner block, we add the ingredient list. Ingredients can be labeled with an `#` to regroup them. They can also be nicknamed with an `@` to simplify its use later on.
```
ingredients {
	Farine t55 : 200g #sec @farine
	Oeuf : 2 #liquide
}
```
Next, the utensil list.
```
utensils {
    Bol
    Gauffrier
}
```

And finally, the steps of the recipe. Each line uses a technique define earlier. Arrows (`->`) can be used to create a new ingredient.
```
intructions {
	mix #sec Bol -> pate
	incorporate Oeuf pate
}
```

## Test methods

In order to test **Cook Serve DSL** we retrieved recipes from online blogs or real cookbooks and translated them in our language to make sure it is perfectly parsed. This allowed us to detect plenty of edge cases.

## Limitations

**Cook Serve DSL** has a certain number of limitations. It is extremely complex to generate such recipes in natural language from this DSL. However, we can dream up of using this DSL to power some sort of cooking robot that would have several cooking techniques implemented.
The principle of defining cooking technique does not allow to more detailed explanation for more complex method. We can think of folding techniques used for braided brioche or ravioli.  Indeed, it is quite common to find entire explanation paragraphs of techniques in recipes. In our DSL we tried to solve this issue by allowing comments.

## DSL implementation in Eclipse

### The grammar is here (Julio + Corentin + Antonin):

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

### The unit tests that test the grammar (Corentin + Antonin):

`cuisine.recipe.tests/src/cuisine/recipe/tests/RecipeParsingTest.xtend`

### The customised outline (Julio):

`cuisine.recipe.ui/src/cuisine/recipe/ui/outline/RecipeOutlineTreeProvider.java`

### The quick-fix features (TODO):

`cuisine.recipe.ui/src/cuisine/recipe/ui/quickfix/RecipeQuickfixProvider.java`

### The content assist features (Julio):

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

### Setting the keywords color (TODO):

`cuisine.recipe.ui/src/cuisine/recipe/ui/RecipeUiModule.java`

`cuisine.recipe.ui/src/cuisine/recipe/ui/coloring/RecipeHighlightingConfiguration.java` (to create)

### Semantic highlighting (TODO):

`cuisine.recipe.ui/src/cuisine/recipe/ui/RecipeUiModule.java`

`cuisine.recipe.ui/src/cuisine/recipe/ui/coloring/RecipeSemanticHighlightingCalculator.java` (to create)

`cuisine.recipe.ui/src/cuisine/recipe/ui/coloring/RecipeHighlightingConfiguration.java`