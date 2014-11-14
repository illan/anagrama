
Anagrama como Bolsa
====================

https://commons.apache.org/proper/commons-collections/javadocs/api-2.1.1/org/apache/commons/collections/Bag.html

Lo empaquetamos como es.amagrama, junto con los tests

# mvn archetype:create  -DgroupId=es.anagrama  -DartifactId=es.anagrama

Implementacion del ejecutable 
==============================
Lo empaquetamo como es.poema.anagrama, 
usando ant para controlar los parametros y mostrar un mensaje de error

Subimos el codigo a github:
==========================

git remote add origin https://github.com/illan/anagrama
git push -u origin master

Invocacion
==========

run.sh