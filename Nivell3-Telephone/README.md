# IT-Academy-S1.06-Generics-Nivel3

### Exercisi: Telephone

Per fer aquest exercici necessites una interfície anomenada Telefon i tres classes: Smartphone, Generica i la Principal.

La interfície Telefon ha de tenir un mètode anomenat trucar(). La classe Smartphone ha d’implementar Telefon, i a més del mètode trucar(), també ha de tenir el mètode ferFotos().

La classe Generica ha de tenir dos mètodes genèrics, el primer ha de rebre un tipus d’argument limitat per la interfície Telefon i el segon ha de rebre un argument limitat per la classe Smartphone. Des d’aquests dos mètodes crida els mètodes pertinents de Telefon i Smartphone. En el main() de la classe Principal, passa un objecte de la classe Smartphone als dos mètodes genèrics de la classe Generica.

El mètode limitat per la interfície Telefon, de la classe Generica, pot cridar al mètode ferFotos()?

### Tecnologies Utilitzades

Java

### Requisits

Java 23.0

### Instal·lació

Clona aquest repositori: -> git clone  
Accedeix al directori del projecte:   cd Nivell3-Telephone

### Contribucions

Les contribucions són benvingudes! Per favor, segueix els següents passos per a contribuir:

Fes un fork del repositori  
Crea una nova branca:  git checkout -b feature/NovaFuncionalitat  
Fes els teus canvis i commiteja'ls: git commit -m 'Afegeix Nova Funcionalitat'  
Puja els canvis a la teva branca: git push origin feature/NovaFuncionalitat  
Fes un pull request

### Notes Exercisi 1
El mètode limitat per la interfície Telefon, de la classe Generica, pot cridar al mètode ferFotos()?
No es pot, perquè aquest mètode pertany a la classe Smartphone i el mètode només coneix Telephone encara que li passem un Smartphone.