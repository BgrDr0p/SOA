# SOA
Implémentation d'une archi SOA

# Mémo : 
La SOA définit les concepts qui permettent de mettre en place des SI articulés autour de services et communiquant de façon standardisée.
Un contrat WSDL est un document XML qui explique les fonctionnalités d’un service, comment l’appeler, où le trouver et quels types de réponses il renvoie.
UDDI est un serveur qui centralise tous les contrats des services.
Les services doivent communiquer via SOAP : un protocol XML standard.
En Java, librairies comme JAX-WS pour générer les documents WSDL et les messages SOAP ( protocole de communication) .

# Impératif :
Un service WEB doit être :
- couplage faible : ne pas communiquer/dépendre des autres services (communication uniquement en SOAP)
- abstrait :  minimum vital nécessaire à l’invocation de votre service
- réutilisable :  retournez autant que possible des données neutres
- autonome : dispose de ses propres ressources, libraries, containers, etc 
- stateless : aucune requête ne dépende de la réponse d’une autre.

Condensé en  service web IRA : I : Interesting R : Reusable A : Atomic

# Outils
Utilisation de Maven, JAVA EE, GlassFish 5.0.1 ( Uniquement fonctionnel sur Java 8)


# Méthodes pour construire un web service

Top-down :
 
La plus utilisée,  fichier WSDL (JAX-WS) qui décrit le service : les opérations possibles, les paramètres à passer et leurs types, etc.
Ensuite, on crée le code nécessaire.


Crée le WSLD ensuite commande :
wsimport -Xnocompile -d ./src/main/java -p generated.ageservice https://raw.githubusercontent.com/AdamSoufiane/age/master/age.wsdl


Bottom-Up :

On crée le code, puis on génére le fichier WSDL

1. Créez vos classes pour implémenter les fonctionnalités voulues comme vous le faites d'habitude.

2.Annotez la ou les classes que vous voulez exposer avec l'annotation @WebService.

3.Annotez les méthodes que vous voulez exposer grâce à l'annotation @WebMethod.

4.Packagez votre service au format war (faites les modifications au pom.xml si nécessaire).

5.Uploadez votre service dans le serveur.


Possibilité de faire tests fonctionnels avec SOAPUI avec le fichier WSDL génére par GlassFish (méthode Top-Down)


# Gestion des erreurs

Possibilité dans Bottom Up de gérer les erreurs en créeant une classe spécifique avec @WebFault(name="LeftLifeException")









