fun main(){
    School()
    var x=getremainder(20,3)
    println(x)
    var a=nameandAge("Esther",20)
    println(a)
    length()




}



fun School(){
    var name="codeHive"
    var names=name[4].toString()+name[5]+name[6]+name[7]
    println(names)
    }
fun getremainder(num1:Int,num2:Int):Int{
    var division=num1%num2
    return division

}
fun nameandAge(name:String,age:Int):String{
    var name="Hi,my name is $name and i'm"
    var age ="$age years old"
    var statement=(name+" "+age)
    return statement

}
fun length(){
    var name="marie"
    println (name.length)
}

well done nalenyifeature1