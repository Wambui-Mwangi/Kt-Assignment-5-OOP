fun main(){
    val humanbeing = Human("Esther", 24, 58)

    humanbeing.eat(2)
    var newWeight = humanbeing.weight
    println(newWeight)

    humanbeing.speak("Dollars before Oxygen")

    humanbeing.birthday(1)
    var newAge = humanbeing.age
    println(newAge)

    val accountCreation = User("Esther", "Mwangi", "mwangiesther@gmail.com", "0701378907", "Yaaay#4")
    var mail = accountCreation.email
    println(mail)
    var number = accountCreation.phoneNumber
    println(number)

}
class Human(var name:String, var age:Int, var weight:Int){

    fun eat(foodWeight:Int){
        weight += foodWeight
        println("I am eating $foodWeight kgs of food")
    }

    fun speak(speech:String){
        println(speech)
    }

    fun birthday(ageInc:Int){
        age+= ageInc
    }

}
data class User(var firstName:String, var lastname:String, var email:String, var phoneNumber:String, var password:String)
