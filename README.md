
### _Proyecto Prueba UPAX_


## Pre-Requisitos


* Java 11 (Instalado y Configurado)

* IDE para compilar proyectos Java (Instalado y Configurado en este caso use IntelliJ IDEA)

* lombok instalado en el IDE

* Maven para repositorio de dependencias (Instalado y Configurado)

## Instalación

_Copiar y ejecutar el siguiente comando en una terminal git_

```
git clone https://github.com/jhonatanMD/prueba-upax.git

```

_Dirigirse al IDE y importar el archivo_

_En la ruta del proyecto ejecutar el siguiente comando para bajar las dependencias y luego dar un Build_

```
mvn clean install
mvn package 
```

## Ejecución

* Dentro del IDE buscar el main que se encuentra en la clase WsPruebaApplication.java darle click derecho y hacer correr programa (Run) 

* Despues de Eso ir a postman y consumir los servicios : http://localhost:8080/....

## Documentación

* Para la documentación ir a la ruta : http://localhost:8080/swagger-ui.html
* Se podra ver los endpoint de la api y su funcionalidad
![image](https://user-images.githubusercontent.com/48395505/209391296-0b610160-827f-48f3-8391-3fe617250ba1.png)

