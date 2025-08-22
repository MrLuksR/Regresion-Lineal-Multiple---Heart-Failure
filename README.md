El programa contiene un modelo que permite predecir la probabilidad que tiene
una persona de morir en base a su edad y su tiempo de seguimiento en días.

Como primera instancia se importan los datos que estan contenidos en un archivo csv.
Luego se procede a cambiar el nombre de algunas columnas que contienen un nombre
demasiado extenso, esto a fin de facilitar el trabajo a la hora de escribir y 
representar dichas columnas.
A continuación se crea una representación con gráficas de "pairsplot" a fin de
evaluar qué datos que podrían estar conectados entre sí o cuales serían la mejor
opción para entrenar el modelo. Este se volvió compliacado de leer, por ende 
se creó un mapa de calor para que facilite la compresión y muestre las conexiones
más acertadas entre los datos.

Manteniendo los días en 3 y aumentando la edad a partir de los 61 años la persona
tendrá una probabilidad de muerte mayor a 70%. En cambio si cambiamos días por
0 y la edad en donde se comenzará a cruzar el umbral de 70% es a partir de los
60 años.
