# Conversor de Monedas <img src="https://github.com/Kpp94/ConversorDeMonedas/assets/157731004/2c249f5a-21cd-4e88-80e3-d9c084c04df6" width="30px">

Hola, hoy te presento el challenge de Alura latam que consiste en un conversor de Monedas.



## Caracteristicas 

- Lenguaje de programacion. Java
- API ExchangeRate-API
- Biblioteca Gson de google 


## Preparando el Ambiente <img src="https://cdn-icons-png.flaticon.com/512/2071/2071756.png" width="30px">

- Descargue el proyecto desde el repositorio.
- Ejecute el archivo el su IDE de preferencia.
- Importe la biblioteca Gson (https://search.maven.org/artifact/com.google.code.gson/gson/2.10.1/jar?eh=)
- Obtenga su API Key de ExchangeRate-API (https://www.exchangerate-api.com/).
- Ejecute el archivo Principal del proyecto.

## Funcionalidad

Al inicializar el programa te encontraras con el siguiente menu

<img src="https://github.com/Kpp94/ConversorDeMonedas/blob/main/img/Menu_Conversor.png">

Donde se muestran como opciones seis tipos de conversion de monedas, sin embargo se muestra una septima opción en la que podremos ingresar una conversion diferente a las seis mostradas.

Si ingresa una opcion fuera de las ocho mostradas en el menú se mostrara el siguiente texto.

<img src="https://github.com/Kpp94/ConversorDeMonedas/blob/main/img/Opc_Novalida_conversor.png">

Cuando escogemos una de las opciones validas se realizara la consulta en la API ExchangeRate y mediante la biblioteca Gson se devolvera los datos de la consulta como son:
La cantida a convertir, la moneda base, la moneda destino, el resultado de la conversion y factor de conversion de la moneda consultada.

<img src="https://github.com/Kpp94/ConversorDeMonedas/blob/main/img/Opciones_conversor.png">

Otra consulta.

<img src="https://github.com/Kpp94/ConversorDeMonedas/blob/main/img/Opc_3_conversor.png">

Cada que se haga una consulta se volvera al menú de inicio hasta que se seleccione salir del programa.

Al seleccionar la opción 7 se piden los siguientes datos.
- La cantidad a convertir.
- La moneda base a convertir.
- La moneda de destino.

Tal como se menciona en el programa las monedas base y destino deben ser ingresada con el codigo de 3 letras basado en el formato ISO-4217 (https://www.iso.org/iso-4217-currency-codes.html)

<img src="https://github.com/Kpp94/ConversorDeMonedas/blob/main/img/opc_7_conversor.png">

Una vez que hayamos realizado todas nuestras consultas selccionaremos la opción 8 de salida, esto nos retornara una despedida y un listado de las consultas realizadas en el programa.

<img src="https://github.com/Kpp94/ConversorDeMonedas/blob/main/img/salida_conversor.png">

<h5>Autor. Kevin Pérez Pérez</h5>
