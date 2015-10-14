mnombre={1:"Pepe",2:"Manuel"}
mnacionalidad={1:"Espanyol",2:"Cubano"}
mmarca={1:"Kawasaki",2:"Yamaha"}
mclasificacion={1:"Primero",2:"Cuarto"}
cnombrepiloto={1:"Jhon",2:"Michael"}
cnombrecopiloto={1:"Antonio",2:"Bryan"}
cnacionalidadpiloto={1:"EEUU",2:"Ingles"}
cnacionalidadcopiloto={1:"Espanyol",2:"Peruano"}
cmarca={1:"Nissan",2:"Volkswagen"}

opcion=int(raw_input("Introduzca la opcion(1:mostrar,2:aniadir,3:modificar posicion,4:abandono): "))
if(opcion==1):
    print "Motos: \n"
    print mnombre.items()
    print mnacionalidad.items()
    print mmarca.items()
    print mclasificacion.items()
    print "\nCoches: \n"
    print cnombrepiloto.items()
    print cnacionalidadpiloto.items()
    print cnombrecopiloto.items()
    print cnacionalidadcopiloto.items()
    print cmarca.items()
elif(opcion==2):
