# Controle--Spring-boot&Swagger

### I Introduction :

  Spring Boot est un projet de Spring Framework qui vise à simplifier le processus de configuration et de déploiement des applications basées sur Spring. Il fournit un ensemble d'outils et de conventions permettant de démarrer rapidement des applications basées sur Spring avec un minimum de configuration manuelle. Spring Boot facilite également le développement en offrant des fonctionnalités telles que l'auto-configuration, qui permet à l'application de configurer automatiquement des composants en fonction des dépendances ajoutées.
 
### II Technologies Utilisées :


Java: Java est un langage de programmation polyvalent et orienté objet largement utilisé pour développer diverses applications allant des applications de bureau aux applications Web en passant par les applications mobiles. Il est apprécié pour sa portabilité, sa robustesse, sa sécurité et sa facilité d'utilisation.

MySQL : MySQL est un système de gestion de base de données relationnelle open source populaire. Il est largement utilisé pour stocker, organiser et gérer de grandes quantités de données de manière efficace et fiable. Il offre une grande stabilité, une bonne performance et une large gamme de fonctionnalités, en faisant un choix populaire pour de nombreux types d'applications.

Hibernate : Hibernate est un framework de mapping objet-relationnel (ORM) en Java qui simplifie considérablement la communication entre une application Java et une base de données relationnelle. Il permet aux développeurs de travailler avec des objets Java au lieu de requêtes SQL directes, ce qui rend le processus de persistance des données plus simple et plus flexible.

  Spring Boot : Spring Boot  est un projet de Spring Framework qui vise à simplifier le processus de configuration et de déploiement des applications basées sur Spring. Il fournit un ensemble d'outils et de conventions permettant de démarrer rapidement des applications basées sur Spring avec un minimum de configuration manuelle. Spring Boot facilite également le développement en offrant des fonctionnalités telles que l'auto-configuration, qui permet à l'application de configurer automatiquement des composants en fonction des dépendances ajoutées.

JPA : JPA (Java Persistence API) est une spécification Java qui décrit une interface de programmation pour gérer la persistance des données dans des applications Java. Elle fournit un moyen standard pour les développeurs d'écrire des applications Java qui peuvent gérer des données relationnelles de manière persistante. JPA simplifie l'interaction avec les bases de données relationnelles en fournissant une interface de programmation orientée objet pour effectuer des opérations de base de données. 

Swagger :Swagger est un ensemble d'outils open source qui aide les développeurs à concevoir, créer, documenter et consommer des services web RESTful. Il fournit des outils pour générer automatiquement la documentation de l'API, ce qui facilite la compréhension et l'utilisation des services web par d'autres développeurs. Swagger permet de décrire la structure et les fonctionnalités des API REST de manière claire et concise.

 ### III Fonctionnalités du projet :

 Opérations CRUD (Create , Delete ,update) pour Article:

   1_L'utilisateur dispose de plusieurs fonctionnalités pour gérer les articles dans le système. Tout d'abord, il peut ajouter une nouvelle article en spécifiant des détails tels que nom , dateProduction ,  et l'utilisateur peut supprimer définitivement une article spécifique, ce qui entraînera la suppression complète et permanente de toutes les données associées à cette article dans le système , et en fin il peut modifié les deférentes champs de l'article.

  2_Opérations CRUD (Create , Delete ,update) pour Categorie:

   L'utilisateur dispose de plusieurs fonctionnalités pour gérer les roles dans le système. Tout d'abord, il peut ajouter un nouvelle role en spécifiant des détails tels que le nom de role  et l'utilisateur peut supprimer définitivement un role spécifique, ce qui entraînera la suppression complète et permanente de toutes les données associées à ce role dans le système , et en fin il peut modifié les deférentes champs de role.




   3_D'autre fonctionalité:
  
Affichez les articles d'un categorie.

Afiches les saus gategorie d'un categorie.

Trouvé un article entre deux date.


###  Base de donnes et Digrammme de classe :

1  Digramme de classe :

![diagramme_de_classe](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/e09d9bd4-d596-485a-b8b6-9b1943bf3e88)

2 Chéma base de donnés :

![base_de_donnes](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/102d7714-77ad-4422-9221-f000ff767f6b)


### Categorie :

![Article](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/e1dc70e5-ff6e-45f9-8550-ff4237ba0fb7)


###  1_Afficher :

![AfficherCategorie](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/f7d33869-2397-4b79-8786-712cb3e4c3a6)

![AfficherCategorie2](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/5b8d9d2f-7717-4cb9-8187-ff82aa513327)

###  2_Ajouter :


###  3_Supprimé :


![CATSUPP](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/b0a2eabc-99c9-459e-b1bc-705657eb15d1)

###  4_Modifié :

###  5-Affichez-By-id:

![AfficherCategorieid1](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/6bd828df-1a1c-4606-bf76-39e009ad0ba2)

![AfficherCategorieid3](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/d746133d-04a7-4509-9d24-076d65cee29d)





###  Article :

![Categorie](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/efd937d9-0145-4d62-9471-d4ccc156ef2e)




###  1_Afficher :

![AfficherArticle](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/6c84a6c6-b4c1-41d8-a815-8f3c36ab21b8)

![AfficherArticle2](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/d62b68f6-4b6d-4382-9c5b-2e7ce978945f)


###  2_Ajouter :



###  3-Modifié :



###  4_Supprimé :


![SUPARTICLE](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/d452ba9b-2428-4cc3-b79b-821bba7a0100)

###  5_Affiches_by_id:

![AfficherArticleid1](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/457a128d-e209-437c-8b18-1fa6bca4d809)

![AfficherArticleid3](https://github.com/ELMOUWAHID-AYOUB/Tp-Spring-boot-Swagger/assets/130571009/ab99844f-9ba6-455c-990b-68a2d1acae0c)


###  comment exécuter le projet 

Etape1:

utiliser la commande suivante si Git est installé : git clone <lien-du-projet>.
Sinon, vous pouvez télécharger l'archive du projet et extraire son contenu sur votre ordinateur.
Ouvrez le projet  dans votre environnement de développement.

Etape2:

Creé une base de donnes elmouwahidctrl1 .

Exécutez la projet.

Etape3:

Une fois que l'application  est lancée, vous devriez tapez localhost:8088/swagger-ui/index.htm  et voir une page web de swagger convenable avec des fonctionnalités pour manipulez les défferents champs de article et categorie.
Utilisez les fonctionnalités appropriées pour gérer les entites  en fonction de vos besoins.

###  Conclusion :

 ce projet de gestion article ,categorie , souscategorie , développé en utilisant Hibernate, Java MySQL ,spring-boot , vise à faciliter la procédure de réservation des ressources. Son page web swagger conviviale, pour améliorer l'efficacité des opérations.

