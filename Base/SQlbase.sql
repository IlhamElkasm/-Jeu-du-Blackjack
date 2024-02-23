use balckjack;
create table Joueur(
					id_joueur integer auto_increment,
                    username_joueur varchar(20),
                     solde_joueur integer , 
                      id_main integer,
                     primary key (id_joueur),
					foreign key (id_main) references main (id_main));

drop table joueur; 
    
INSERT INTO Joueur (username_joueur, solde_joueur)
VALUES ('joueur', 23);

create table Croupier( 
					 id_croupier integer auto_increment,
                     valeurtotalLimit integer,
                     id_main integer,
                     primary key (id_croupier),
					 foreign key (id_main) references main (id_main));   
                     
drop table croupier;                     
INSERT INTO Croupier (valeurtotalLimit)
VALUES (17);                     
     
create table Main(
                     id_main integer auto_increment,
                     valeurtotal_main integer,
                     nbCarte_main integer,
                     primary key (id_main));  
drop table main;                     
INSERT INTO Main (valeurtotal_main,nbCarte_main)
VALUES (18, 2);   
                     
create table PaquetCarte(
                     id_paquetCarte integer auto_increment,
                     taille_paquetCartes integer,
                     primary key (id_paquetCarte));  
drop table PaquetCarte;                     
INSERT INTO PaquetCarte (id_paquetCarte, taille_paquetCartes)
VALUES (3, 7);   

create table Carte(
                     id_carte integer auto_increment  primary key,
                     type_carte varchar(50),
                     couleur_carte varchar(50),
                     valeur_carte varchar(50));  

drop table carte;
insert into carte (type_carte , couleur_carte, valeur_carte) values
    ("A","pique",1),("deux","pique",2),("trois","pique",3),
    ("quatre","pique",4),("cinq","pique",5),("six","pique",6),
     ("sept","pique",7),    ("huit","pique",8),    ("neuf","pique",9),
       ("dix","pique",10),    ("J","pique",10),("Q","pique",10),("K","pique",10),
    
    ("A","carreau",1),("deux","carreau",2),("trois","carreau",3),
    ("quatre","carreau",4),("cinq","carreau",5),("six","carreau",6),
     ("sept","carreau",7),("huit","carreau",8),("neuf","carreau",9),
       ("dix","carreau",10),("J","carreau",10),("Q","carreau",10),("K","carreau",10),
    
     ("A","trefle",1),("deux","trefle",2),("trois","trefle",3),
    ("quatre","trefle",4),("cinq","trefle",5),("six","trefle",6),
     ("sept","trefle",7),("huit","trefle",8),("neuf","trefle",9),
       ("dix","trefle",10),("J","trefle",10),    ("Q","trefle",10),("K","trefle",10),
    
      ("A","coeur",1),("deux","coeur",2),("trois","coeur",3),
    ("quatre","coeur",4),("cinq","coeur",5),("six","coeur",6),
     ("sept","coeur",7),    ("huit","coeur",8),    ("neuf","coeur",9),
       ("dix","coeur",10),    ("J","coeur",10),("Q","coeur",10),("K","coeur",10);
       