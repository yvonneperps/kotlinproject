fun main(args: Array<String>) {
    val arr1 = arrayOf(13,"Students",12.4, 'd')
    val arr2 = arrayOf<Int>(45,27,978,356,678)
    val arr3 = arrayOf<String>("Mark","Alex","John")

    println(arr1[1])
    println(arr2[3])
    println(arr3[0])
    println(arr1[3])
//modifying an array using an index
    arr1[0] = 28
    println(arr1[0])
    arr3[0] = "Steve"
    println(arr3[0])
//modifying using a set function
    val fruits = arrayOf("Apple","Melon","Peas","Mango")
    println(fruits[1])
    fruits.set(1, "Pineapple")
    println(fruits[1])
    println(fruits[2])
    fruits.set(2,"Orange")
    println(fruits[2])
//get function to fetch
    val cars = arrayOf("Benz","Honda","Range Rover","Jeep")
    println(cars[1])
    println(cars.get(1))

    val employees = arrayOf("Felix","Perpetual","Jeff","Sharon","Dylan")
    println(employees[3])
    employees.set(3, "David")
    println(employees[3])
    println(employees[0])
    println(employees.get(0))
}