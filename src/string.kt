//import java.util.Date // java.time 쓰는게 바람직하다 함. 기본적으로 import된 모듈을 좀 알아 봐야겠음

fun main() {
//    val hello = "hello, world!" // string은 "로 감싸야 됨 ' 로 감싸면 안됨
//    println(hello) // hello, world!
//
//    val text = "Hello world!\nThis is \"multiline\" string" // esc 문자 사용
//    println(text) /*Hello world!
//                    This is "multiline" string*/

//    val name = readLine() // John 입력하라고 함
//    println("Hello $name \nToday is \"${Date()}\"") /* Hello John
//                                                       Today is "Fri May 16 22:53:18 KST 2025" */

//    val msg =  """
//        Hello, $name!
//        Today is ${Date()}
//    """.trimIndent() // 이렇게 하면 esc 문자 안써도 되나봄. 그리고 trimIndent()는 들여쓰기 제거해주는 코틀린 함수라고 함
//
//    println(msg) /* Hello John
//                    Today is "Fri May 16 22:53:18 KST 2025" */

//    val msg = """
//        This is triple quote: '${"\"\"\""}'
//    """.trimIndent() // 특수 문자 사용할때 쓴다고 함. 근데 굳이 이렇게 비효율적으로 쓰는것 같다는 생각함.
//
//    println(msg) // This is triple quote: '"""'

//    println("${"hello".length} ${"hello".lastIndex}") // 5 4
//                                                      // length 쓰는거는 다 비슷한거 같음 lastIndex도 글자만 다를 뿐 비슷함

//    val char = "Hello"
//
//    println("""
//        ${char[0]}
//        ${char[1]}
//        ${char[2]}
//        ${char[3]}
//        ${char[4]}
//    """.trimIndent())
//
//    /* H
//       e
//       l
//       l
//       o */
//    val sum = 3
//    val char = "This sum is: " + sum // 이렇게 쓰지말고 "This sum is: + $sum" 추천함
//
//    println(char) // This sum is: 3

//    val char1 = "Hello!" // 출력하면 Hello!임
//    val char2 = "Hel" + "lo!" // 출력하면 Hello!임
//    println(char1 == char2) // true. 무조건 true일 수 밖에 없음

//    println("""
//        ${"abc"<"cba"}
//        ${"123">"34"}
//    """.trimIndent())
//
//    /*true
//      false */
//
//    // 문자끼리 비교가 되나봄. 이런건 안해봐서 신기함
}