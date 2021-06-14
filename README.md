# ¿Qué es Invernadero?
Invernadero es una aplicación donde se simula una lista de plantas con ciertas características, tales como su clase, familia, género, entre otros. La finalidad de dicha aplicación es simplemente emplear aquellos métodos aprendidos para la programación orientada a objetos en Java.

# ¿Cómo utilizar Invernadero?
Simplemente basta con abrir y editar el archivo ```Main.java``` para darle uso a esta aplicación.

# Añadiendo plantas a Invernadero...
A continuación, se tiene un ejemplo de cómo se añade un elemento en el programa, se debe tener claro que todo esto debe ir dentro de ```public static void main(String[] args)```:
```
Planta p = new Planta();
p.setName("Cocos nucifera");
p.setQuantity(5);

plantas.add(p);
```
Este código se encargará de asignar el nombre ```Cocos nucifera``` y la cantidad ```5``` a la planta ```p```. Cabe destacar que estos datos están incompletos, dando así ```null``` en el orden, familia y género de la planta. A continuación se profundiza sobre la asignación y creación de plantas.

## ¿Cómo crear una planta?
Si bien vemos en el código ya mostrado para crear a la planta bastará con usar la siguiente línea
```Planta p = new Planta();```
Sin embargo, existen otras formas de crear una planta de formas más específicas, estas son:

* **Plantas con semillas:** Se autoasignará el grupo de la planta, para crearla se debe usar ```Planta p = new conSemilla();```
* **Plantas sin semillas:** Se autoasignará el grupo de la planta, para crearla se debe usar ```Planta p = new sinSemilla();```
* **Musgo:** Se autoasignará el grupo y clase de la planta, para crearla se debe usar ```Planta p = new Musgo();```
* **Helecho:** Se autoasignará el grupo y clase de la planta, para crearla se debe usar ```Planta p = new Helecho();```
* **Gimnosperma:** Se autoasignará el grupo y clase de la planta, para crearla se debe usar ```Planta p = new Gimnosperma();```
* **Angiosperma:** Se autoasignará el grupo y clase de la planta, para crearla se debe usar ```Planta p = new Angiosperma();```

_Es importante resaltar que ```p``` debe tener un nombre distinto por cada planta, se pueden nombrar ```p1```, ```p2```, ..., ```pn``` o con el nombre de deseo del usuario._

Si por alguna razón, no sabe cuál de las opciones de las ya mencionadas elegir, asegurese de usar ```Planta p = new Planta();```, donde los datos serán introducidos de forma manual y el grupo y clase de la planta serán saltados.

## ¿Qué datos pueden contener las plantas?

* **Nombre:** Se debe asignar manualmente el nombre de la planta de la siguiente forma: ```p.setName("Nombre a ingresar");```, de lo contrario el nombre será ```null```
* **Orden:** Se debe asignar manualmente el orden de la planta de la siguiente forma: ```p.setOrder("Orden a ingresar");```, de lo contrario el orden será ```null```
* **Familia:** Se debe asignar manualmente la familia de la planta de la siguiente forma: ```p.setFamily("Familia a ingresar");```, de lo contrario la familia será ```null```
* **Género:** Se debe asignar manualmente el género de la planta de la siguiente forma: ```p.setGenus("Género a ingresar");```, de lo contrario el género será ```null```
* **Cantidad:** Se debe asignar manualmente la cantidad de planta(s) de la siguiente forma: ```p.setQuantity(Cantidad a ingresar);```, de lo contrario la cantidad será ```0```
* **Clase:** Se asigna de forma automática, siempre y cuando no se use ```Planta()```, ```conSemilla()``` o ```sinSemilla()```  para la creación de la planta.
* **Grupo:** Se asigna de forma automática, siempre y cuando no se use ```Planta()``` para la creación de la planta.

_Es importante resaltar que ```p``` debe tener un nombre distinto por cada planta, se pueden nombrar ```p1```, ```p2```, ..., ```pn``` o con el nombre de deseo del usuario._
