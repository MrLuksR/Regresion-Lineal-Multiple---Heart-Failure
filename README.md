# Explicación del Código
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
más acertadas entre los datos. A continuación, se tomaron dos columnas como
variables independientes y otra para ser dependiente, en base estos tres datos
se entrenó el modelo. Finalmente se crearon 2 variables: una representando la edad
y otra representando el tiempo de tratamiento en días con las cuales se realizó
el análisis.

## Análisis
Para edad 63 y tiempo 6 la probabilidad dió como resultado: 70.38 %

Para edad 64 y tiempo 6 la probabilidad dió como resultado: 70.94 %

Para edad 68 y tiempo 6 la probabilidad dió como resultado: 73.19 %

Para edad 64 y tiempo 3 la probabilidad dió como resultado: 71.84 %
