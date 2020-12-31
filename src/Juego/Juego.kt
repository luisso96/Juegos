package Juego

class Juego {

    fun main(){
        //'V' = Vacio
        //'R' = Ficha roja
        //'A' = Ficha azul
        val columna = Array(6){'V'}
        var matriz = Array(7){columna}

        var esFinal = false
        var esTurnoAzul = true

        while (!esFinal){
            var columna = 0
            columna = when (esTurnoAzul){
                true->{
                    0
                }
                false->{
                    0
                }
            }
            matriz = anadirFicha(esTurnoAzul,matriz,columna)


        }
    }
    //Funcion encargada de actualizar la matriz con las fichas
    fun anadirFicha(esTurnoAzul: Boolean, matriz: Array<Array<Char>>, columna: Int):Array<Array<Char>>{
        for (i in matriz[columna].indices){
            if (matriz[columna][i] == 'V'){
                if (esTurnoAzul){
                    matriz[columna][i]='B'
                } else{
                    matriz[columna][i]='R'
                }
                break
            }
        }
        return matriz
    }
    //Funcion encargada de comprobar si se han realizado 4 en una linea
    fun comprobarVictoria(esTurnoAzul: Boolean,matriz: Array<Array<Char>>):Boolean{

        return false
    }
    //Comprueba si contiene 4 fichas seguidas verticales
    fun lineaVertical(esTurnoAzul: Boolean,matriz: Array<Array<Char>>):Boolean{
        var letra:Char
        if (esTurnoAzul){
            letra = 'A'
        }else{
            letra = 'R'
        }
        var fichasSeguidas = 0
        matriz.forEach { columna->
            columna.forEach { casilla->
                if (casilla == letra){
                    fichasSeguidas++
                    if (fichasSeguidas == 4){
                        return true
                    }
                }else{
                    fichasSeguidas = 0
                }
            }
        }
        return false
    }
    //Comprueba si tiene linea de 4 seguidos en horizontal
    fun lineaHorizontal(esTurnoAzul: Boolean,matriz: Array<Array<Char>>):Boolean{
        var letra:Char
        if (esTurnoAzul){
            letra = 'A'
        }else{
            letra = 'R'
        }
        var fichasSeguidas = 0
        for (i in matriz[0].indices){
            for (j in matriz.indices){
                if (matriz[i][j] == 'V'){
                    fichasSeguidas++
                    if (fichasSeguidas == 4){
                        return true
                    }
                }else{
                    fichasSeguidas = 0
                }
            }
        }
        return false
    }
    //Comprueba si tiene linea de 4 seguidos en diagonal izquierda
    fun diagonalIzquierda(esTurnoAzul: Boolean,matriz: Array<Array<Char>>):Boolean{
        var letra:Char
        if (esTurnoAzul){
            letra = 'A'
        }else{
            letra = 'R'
        }
        var fichasSeguidas = 0

        for ()

        return false
    }
}