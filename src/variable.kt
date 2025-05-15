fun main() {
//    val a = readLine()!!.toInt() // 2
//    val b = readLine()!!.toInt() // 3
//    println(a + b) // 5

//    val text = "Hello" // text는 String 으로 지정됨
//    println(text) // Hello

//    val n: Int = "Hello" // int로 타입 지정 후 변수 값 정함, 그런데 지정한 값이 String임, 오류 발생할 수 밖에 없음
//    println(n) // Kotlin: Initializer type mismatch: expected 'kotlin.Int', actual 'kotlin.String'.

//    val n:Int = 100 // int로 타입 지정 후 변수 값 정함, like typescript
//    val text: String = "hello world!" // String 으로 타입 지정 후 변수 값 정함, like typescript
//    println("$n $text")

//    val text: String
//    text = "Hello"
//    println(text) // Hello

//    val n: Int
//    println( n + 1 ) // Kotlin: Variable 'n' must be initialized.


//    사용하는거 비추
//    val `fun` = 1 // fun 같은 하드 키워드는 `` 필요
//    val `name with spaces` = 2 // spaces 있는 것도 `` 필요
//    println("$`fun` $`name with spaces`") // 1 2

//    var sum = 1 // var은 가변 변수 초기에 int 값으로 지정하면 int만 사용가능
//    sum = sum + 2
//    sum = sum + 3
//    println(sum) // 6

//    (ex) sum을 1로 지정 후 String 값으로 변수 값 변경
//    var sum = 1
//    sum = "Hello"
//    println(sum) // Kotlin: Assignment type mismatch: actual type is 'kotlin.String', but 'kotlin.Int' was expected.

//    var num = 3
//    num *= 10 // num * 10
//    num += 6 // num + 6
//    println(num) // 36

//    var a = 1 // 이런식으로 하면 할단된 값이 한번도 안 읽힘
//    println(a++) // 1 출력 후 a에 1 더함, 즉 a는 2
//    println(++a) // a에 1을 더한 후 3 출력, 즉 a가 3이 된 후 출력
//    println(--a) // a에 -1을 뺀 후 2를 출력, 즉 a가 2가 된 후 출력
//    println(a--) // 2 출력 후 a에 1을 뺌, 즉 a는 1

}
