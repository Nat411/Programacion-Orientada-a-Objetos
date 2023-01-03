
class Asiento:
    def __init__(self, color, precio, registro):
        self.color = color
        self.precio = precio
        self.registro = registro
    
    def cambiarColor(self, color):
        colores = ["rojo", "verde", "amarillo", "negro", "blanco"]
        if color in colores:
            self.color = color

class Auto:
    cantidadCreados= 0
    def __init__(self, modelo, precio, asientos, marca, motor, registro):
        self.modelo = modelo
        self.precio = precio
        self.asientos = asientos
        self.marca = marca
        self.motor = motor
        self.registro=registro

    def cantidadAsientos(self):
        contador = 0
        for i in range(len(self.asientos)):
            if isinstance(self.asientos[i], Asiento):
                contador +=1
        return contador

    def verificarIntegridad(self):
        resultado = "Auto original"
        if self.registro != self.motor.registro:
            resultado = "Las piezas no son originales"
        else:
            for i in range(len(self.asientos)):
                if self.asientos[i] == None:
                    continue
                elif self.registro != self.asientos[i].registro:
                    resultado = "Las piezas no son originales"
        return resultado

class Motor:
    def __init__(self, numeroCilindros, tipo, registro) :
        self.numeroCilindros = numeroCilindros
        self.tipo = tipo
        self.registro = registro

    def cambiarRegistro(self, registro):
        self.registro = registro
    
    def asignarTipo(self, tipo):
        if tipo == "electrico" or tipo == "gasolina":
            self.tipo = tipo

