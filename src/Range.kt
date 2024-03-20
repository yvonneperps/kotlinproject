fun main(args: Array<String>) {
    1..10
    1.rangeTo(10)
    val myvariables = 20..50
    for(variable in myvariables){
        println(variable)
    }

    val var2 = 11.rangeTo(51)
    for (varr in var2){
        println(varr)
    }

    val alpha = 'A'..'Z'
    for (a in alpha){
        println(a)
    }
    for (b in 'A'..'P'){
        println(b)
    }
    val var4 = 10.downTo(1)
    for (one in var4){
        println(one)
    }
    val alpha2 = 'z'.downTo('a')
    for (c in alpha2){
        println(c)
    }
    val marks = 1.rangeTo(10)
    marks.step(3)
    for (d in marks.step(3)){
        println(d)
    }
    for (e in marks.step(5)){
        println(e)
    }
    val varro = 200..500
    varro.step(10)
    for (g in varro.step(10)){
        println(g)
    }
}