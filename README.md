Pour travailler avec git, quand une version est r�cup�r�e:
- cuisine.recipe -> create a new folder 'src-gen' -> Clean all projects
- Project -> Clean
- cuisine.recipe -> src -> cuisine.recipe -> GenerateRecipe.mwe2 -> Run as

Les tests doivent fonctionner

# Mod�le : 

D�claration de techniques

{
Nom recette

Optionnel : Description

Optionnel : Temps de pr�paration, cuisson

R�f�rence Nombre de personnes

Ingr�dients
- Maybe : ajouter groupes
- [qte] nom_de_l'ingr�dient #group

Ustensiles (r�cipients, outils, appareil (=bout de la pr�paration), etc.): 
- nom_ustensile1
- nom_ustensile2
- ...

Instructions : 
- [nom] verbe [ingredient(s)] ustensile [condition]
- ou : [nom] instruction1, instruction2, instruction3... (qui font r�f�rence au(x) m�me ingr�dient(s))
}

Unit�s (https://en.wikipedia.org/wiki/Cooking_weights_and_measures)
- g
- L
- c�c / tsp
- cas / tbsp
- pots de yaourt
- verre
- livres
- pas d'unit�
- Du
- ...

# Exemple de Recette : 

## Gaufres Trotro (lardons, Cheddar et petits oignons)

Matos : un fouet et un gaufrier

Timing : le temps de cuire les lardons et les gaufres

Ingr�dients (pour une petite dizaine)
- 100g de lardons fum�s
- 140g de farine t55
- 1/2 cc de bicarbonate (1/4 tsp)
- 1 petite cc de levure chimique (1/2 tsp)
- 1 cc de sel marin (3/4 tsp)
- 1 cs de sucre (1 tbsp)
- 1 petite cc de paprika fum� piquant (ou paprika fum� doux + une pointe de poivre de cayenne)
- 1 1/2 oeuf � temp�rature ambiante (voir note)
- 240g de buttermilk, lait ferment�, lait ribot (ou d'un m�lange maison, voir note), � temp�rature ambiante
- 15g de beurre fondu
- 1 cs de graisse des lardons cuits
- 100g de Cheddar rap�
- 4 petits oignons �minc�s
- Un oeuf frit
- Du sirop d'�rable
Pcq #YOLO

Notes :
1. Pour compter un oeuf et demi, casse 1 oeuf dans un bol pos� sur une balance, bats-le l�g�rement pour m�langer blanc et jaune et garde 30g d'oeuf. Ou double la recette!
2. Pour une version vg, tu peux remplacer les lardons par 2 cc de paprika fum� (et la graisse de lardons par 15g de beurre suppl�mentaire).
3. Tu peux remplacer le Cheddar par un fromage � pate dure, si possible un avec du go�t (�vite l'emmental).
4. Les P'tits oignons sont pour moi ici indispensables, pour leur croustillant et surtout le contraste et le peps qu'ils apportent. Tu peux essayer de les remplacer par un petit oignon rouge tr�s finement �minc� (je n'ai pas test�) ou des cornichons.
5. Pour le buttermilk, tu peux simplement faire un m�lange moiti� lait entier moiti� yaourt entier, avec 1 cuill�re � soupe de jus de citron, en laissant reposer 10 minutes. Ou utiliser du k�fir.
Krrrrrrrrrkrr

## Transformation
    1.Fais griller les lardons dans une grande po�le jusqu'� ce qu'ils soient bien dor�s et croustillants.
    griller [poele] ingr�dient(s) => condition
    
    Coupe-les en petits morceaux.
    couper ingredient(s) petits
    
    R�serve 1 cs de graisse de lardons � ajouter aux ingr�dients liquides.
    r�server ingr�dients(s) (�tape | commentaire)
    
    Fais chauffer ton gaufrier.
    Chauffer ustensile
    
    2. Dans un petit bol, m�lange tous les ingr�dients secs � l'aide d'un fouet.
    M�langer [outil] ingr�dients [r�cipient]
    
    3. Dans un grand bol, m�lange les ingr�dients liquides.
    M�langer [outil] ingr�dients [r�cipient]
    
    4. Verse les ingr�dients secs dans les ingr�dients liquides
    Verser ingr�dients [qt�] [outil] (ingr�dients | pr�paration | ustensile avec conditions dessus)
    
    m�lange au fouet, en t'arr�tant d�s qu'il n'y a plus de traces de farine. 
    pate = M�langer [outil] ingr�dients [r�cipient] => condition
    
    R�partis lardons, Cheddar et oignons dans la pate.
    pate = R�partir ingr�dients (ingr�dient | pr�paration|ustensile)
    
    5. Verse une petite louche de pate dans chaque cavit� de ton gaufrier tr�s chaud et graiss� (attention que les lardons ne restent pas au fond du bol). 
    Verser ingr�dients [qt�] [outil] (ingr�dients | pr�paration|ustensile avec conditions desus)
    
    Cuits jusqu'� obtenir des gaufres dor�es et fondantes.
    Cuire ingr�dients condition
    
    R�serve au four pr�chauff� � 100 degr�s, le temps de tout cuire, ou sers imm�diatement.
    Choix:
    - Mettre_au_four temp�rature condition
    - servir
    
    Surmont� d'un oeuf frit oui, 
    
    d�goulinant de sirop d'�rable, hell yeah.
    
    See you soon, little spoon!

## EXEMPLE avec m�tamod�le
    // D�claration de techniques
define grill [ustensil] ingredient
define grease [ustensil]
define cut [tool] ingredient {{small, medium, large}, {cubes, slices, bits}}
define reserve ingredient
define heat ustensil [temperature]
define mix [ustensil] ingredient [preparation]
define pour ingredient [ustensil] [preparation]
define distribute ingredient preparation
define cook ingredient [ustensil]
define put_in ingredient [ustensil]

recipe {
	name : Gaufres Trotro (lardons Cheddar et petits oignons)
    
    time : 15
    
    nb_pers : 9.5
        
    ingredients : {
    	Lardons Fum�s : 100g @lardons,
        Farine t55 : 140g #sec @farine,
        Bicarbonate : 0.5cc #sec,
        Levure chimique : 0.8cc #sec @levure,
        Sel marin : 1c�c #sec @sel,
        Sucre : 1cs #sec,
        prika fum� piquant : 1cc #sec @paprika,
        Oeuf : 1.5 #liquide,
        Buttermilk du cul : 240g #liquide @lait,
        Beurre fondu : 15g #liquide @beurre,
        Graisse des lardons cuits : 1cc #liquide @graisseLC,
        Cheddar rap� : 100g @cheddar,
        Petits oignons �minc�es : 4 @oignons,
        Oeuf frit : 1 #aled,
        Sirop d'�rable : any #aled
	}
        
    ustensils : {
        Poele,
        Gauffrier,
        fouet,
        Grand bol,
        Petit bol,
        Louche,
    	Four
    }
        
    instructions: {
    	grill Poele, Lardons Fum�s "Biens dor�s et croustillants";
        cut Lardons Fum�s, small bits -> lardons;
        reserve Graisse des lardons cuits, 1cs "A ajouter aux ingr�dients liquides";
        heat Gaufrier -> Gaufrier chaud;
        mix Fouet, #sec, Petit bol;
        mix #liquide, Grand bol;
        pour #sec, #liquide -> pate;
        mix fouet, pate "Plus de trace de farine";
        distribute lardons, @cheddar, Petits oignons �minc�es, pate;
        grease Gaufrier chaud -> Gaufrier chaud et graiss�;
        pour pate, Louche, Gaufrier chaud et graiss� -> Gaufre;
        cook Gaufre "Dor�es et fondantes"
    }
}
# M�tamod�le 

![image](./Metamodele.png)
