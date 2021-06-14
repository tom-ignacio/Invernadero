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

ArrayList <Planta> plantas = new ArrayList<>();

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
