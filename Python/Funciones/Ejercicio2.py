#-*-coding:utf-8-*-
__author__ = 'AlumnoT'
'''Crear una funci�n  a la que fijamos como par�metro un valor concreto  y muestre en
pantalla el per�metro y la superficie de un  cuadrado que tenga como lado el n�mero
que se ha indicado como par�metro'''

def ap(lado):
    perimetro=lado*4
    area=lado*lado
    return area,perimetro
lado=int(raw_input("Introduce el lado: "))
area,perimetro=ap(lado)
print "El area es: ",area," el perimetro es: ",perimetro