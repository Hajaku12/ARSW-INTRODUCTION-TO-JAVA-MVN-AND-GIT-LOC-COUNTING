## INTRODUCCIÓN A JAVA, MVN Y GIT: CONTEO LOC
## 13 de junio del 2024

### Esfuerzo dedicado al proyecto y cálculo de productividad
El esfuerzo dedicado a este proyecto fue de 4 horas. En el caso del codigo hay un total de 85 lineas.

LOC = (85 lineas de código / 4 horas ) = 21 

### Prerrequisitos
Es necesario tener instalados los siguientes componentes:
* Descargar maven en  http://maven.apache.org/download.html
* Descargar git en https://git-scm.com/book/en/v2/Getting-Started-Installing-Git

### Ejecutando las pruebas
La estrucutra para la ejecución de archivos es la siguiente: 
```
java -cp "./target/classes" edu.escuelaing.arsw.ASE.app.PruebaContadorDeLineas loc ó phy "Ruta de la ubicación del archivo"
```
A continuación se muestran los resultados de las pruebas ejecutadas con la estructura mencionada:: 
* Cuando se ejecuta con el parámetro "loc", se obtiene el resultado esperado, que es contar únicamente las líneas que no son comentarios ni líneas en blanco, dando como resultado 36 líneas. Por otro lado, cuando se ejecuta con el parámetro "phy", se cuentan todas las líneas, incluyendo comentarios y líneas en blanco, dando como resultado 52 líneas.


Prueba:
* En esta prueba, se utiliza un código sencillo para verificar que las líneas en blanco no se cuentan cuando se ejecuta con "loc", pero sí se cuentan cuando se ejecuta con "phy"


## Diagrama de clase


En el diagrama de clase existen dos clases principales: PruebaContadorDeLineas y ContadorDeLineas. El método main esta en PruebaContadorDeLineas y en la clase ContadorDeLineas contine dos métodos: contarLineas, la cual realiza la validación del archivo y el conteo de líneas, y validarLineas, la cual confirma si está vacia o si es un comentario. 

## Licencia
Este proyecto esta autorizado bajo la licencia que se puede encontar en el archivo LICENSE.txt, en el se pueden encontrar los detalles

## Contribuidores
Hann Jang


