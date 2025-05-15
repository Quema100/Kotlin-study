fun main() {
//    val n: Any = 1 // Int는 Any의 하위 타입이라 val 말고 var로 했을때
                     // n 변수 값을 String 으로 바꿔도 error 안뜸. Any is G.O.A.T
//    println(n) // 1

//   Int Type 잘 안쓸거 같긴한데..
//    val n10 = 1234 // 기본적으로 10진수 쓸 때
//    val n = 34_567_123 // 이러면 가독성 올라간다 함, 근데 굳이 이렇게 쓸 필요 없어 보임
//    println("$n10 $n") //123 34567123 _는 사라지나 봄 근데 굳이 쓸 필요 없어 보임

//    val one: Byte = 1 
//    val short: Short = 100_000 // Kotlin: Initializer type mismatch: expected 'kotlin.Short', actual 'kotlin.Int'.
                                 // short 인데 너무 길어서 오류 뜸 
//    val mill = 1_000_000 // int로 인식
//    val int: Int = 10_000_000_000 // Kotlin: Initializer type mismatch: expected 'kotlin.Int', actual 'kotlin.Long'.
                                    // int 인데 long 값이라 오류
//    val tenBill = 10_000_000_000 // long 으로 인식
//    val long =  10_000_000_000_000_000_000 // Kotlin: Value out of range.
                                             // 너무 길어서 오류
//    println("$one $short $mill $int $tenBill $long") // 1 error 1000000 error 10000000000 error

//    val long = 100L // 'L'을 활용해서 long 값으로 변환
//    val int: Int = 100L // Kotlin: Initializer type mismatch: expected 'kotlin.Int', actual 'kotlin.Long'.
                        // int 인데 long 값으로 변환해서 오류
//    println("$long $int") 100 error

//    val bin = 0b10101 // 2진수
//    val hex = 0xF9 // 16진수
//
//    println("$bin $hex") // 21 249

//    val zero = 0
//    val zeroOne = 01 // Kotlin: Syntax error: Unexpected tokens (use ';' to separate expressions on the same line).
//    println("$zero $zeroOne") // 0 error

//    val neg = -10 // 10진법 음수 출력
//    val negHex = -0xFF // 16진법 음수 출력
//    println("$neg $negHex") // -10 -255

//    println("${Short.MIN_VALUE} ${Short.MAX_VALUE} ${Int.MAX_VALUE + 1}") // -32768 32767 -2147483648(정수 오버플로 발생)

//    val pi = 3.14
//    val one = 1.0
//
//    println("$pi $one") // 3.14 1.0

//    val qua = .25
//    val one = 1. // Kotlin: Syntax error: Qualified expression without selector.
//                 // 소수점 뒷 부분 0은 생략 불가함
//    val two = 2 // 이거는 float이 아니라 int 임
//
//    println("$qua $one $two") // 0.25 error 2
    
    
      // E1는 10임, E3은 10**3임 E-2는 10**-2임
//    val pi  = 0.314E1
//    val pi100 = 0.00314E3
//    val piOv100 = 314E-2
//    val tho = 1E3
//
//    println("$pi $pi100 $piOv100 $tho") //3.14 3.14 3.14 1000.0

//    val pi = 3.14f
//    val one = 1f
//
//    println("$pi $one") // 3.14 1.0

//    val pi: Double = 3.14f // Kotlin: Initializer type mismatch: expected 'kotlin.Double', actual 'kotlin.Float'.
//                           // Double < Float 임
//    println(pi)

//    println("${Float.MAX_VALUE}" + // 3.4028235E38 1.4E-45 1.7976931348623157E308 4.9E-324Infinity-Infinity-0.0-Infinity NaN
//            "${Float.MIN_VALUE}" + // 1.4E-45
//            "${Double.MAX_VALUE}" + // 1.7976931348623157E308
//            "${Double.MIN_VALUE}" + // 4.9E-324
//            "${Double.POSITIVE_INFINITY}" + // Infinity
//            "${Double.NEGATIVE_INFINITY}" + // -Infinity
//            "${1.0 / Double.NEGATIVE_INFINITY}" + // -0.0
//            "${2 - Double.POSITIVE_INFINITY}" + // -Infinity
//            " ${3 * Float.NaN}" // NaN
//    )

//    println(
//        "${7.floorDiv(4)}" + // 7 % 4 = 1.74...에서 내려서 출력함. Q.E.D. 1
//        "${(-7).floorDiv(4)}" + // -7 % 4 = -1.74...에서 내려서 출력함. Q.E.D. -2
//        "${7.floorDiv(-4)}" + // 7 % -4 = -1.74..에서 내려서 출력함. Q.E.D. -2
//        "${(-7).floorDiv(-4)}" + // -7 % -4 = 1.74...에서 내려서 출력함. Q.E.D. 1
//        "${7.mod(4)}" + // 7 % 4 = 1.74...에서 내린 후 mod() 안에 있는 값인 4를 곱함 그 이후 앞에 있는 값인 7과 차이를 출력함. Q.E.D. 3
//        "${(-7).mod(4)}" + // -7 % 4 = -1.74...에서 내린 후 mod() 안에 있는 값인 4를 곱함 그 이후 앞에 있는 값인 -7과 차이를 출력함. Q.E.D. 1
//        "${7.mod(-4)}" + // 7 % -4 = -1.74...에서 내린 후 mod() 안에 있는 값인 -4를 곱함 그 이후 앞에 있는 값인 7과 차이를 출력함. Q.E.D. -1
//        "${(-7).mod(-4)}" // -7 % -4 = 1.74...에서 내린 후 mod() 안에 있는 값인 -4를 곱함 그 이후 앞에 있는 값인 -7과 차이를 출력함. Q.E.D. -3
//    )

//    val byte: Byte = 1 // int
//    val int = 1 // int
//    val long = 1L // long
//    val float = 1.5f // float
//    val double = 1.5 // double
//
//    println("${-byte} ${-int} ${-long} ${-float} ${-double}") // -1 : Int -1 : Int -1 : Long -1.5 : Float  -1.5 : Double
//    println("${byte + byte} ${int + byte} ${int + int} ${int + long} ${long + double} ${float + double} ${float + int} ${long + double}") // 2 : Byte  2 : Int 2 : Int 2 : Long 2.5 : Double 3.0 : Double 2.5 : Float 2.5 : Double

//    Char Type 중요한 부분임

//    val z = 'z'
//    val alpha = 'a'
//
//    println("$z $alpha") // z a

//    val quo = '\'' // 문자 esc
//    val newL = '\n' // 줄 변환 python, javascript 하고 다를게 없음
//    val pi = '\u03C0' // 유니 코드 문자
//
//    println("$quo $newL $pi") // ' 줄 바꿈 π

//    var를 쓰는 이유는 ++/-- 때문에 씀
//    var a = 'a'
//    var h = 'h'
//    /*'a' 보다 뒤에 있는 5번째 글자*/ println(a + 5) // f
//    /*'a' 보다 앞에 있는 5번째 글자*/ println(a - 5) // \
//    /*'a' 와 'h' 사이에 있는 글자*/ println(h - a) // 7
//    /*'h' 바로 앞에 있는 글자*/ println(--h) // g
//    /*'a' 바로 뒤에 있는 글자*/ println(++a) // b

//    val n = 100
//    val l: Long = n // Kotlin: Initializer type mismatch: expected 'kotlin.Long', actual 'kotlin.Int'.
//    println(l)
//    println(l == n) // 오류 발생함

//    val n = 945
//    println(n.toByte()) // -79
//    println(n.toShort()) // 945
//    println(n.toChar()) // a
//    println(n.toLong()) // 945

//    println(2.5.toInt()) // 소수점 부분 제거 후 정수로 변환. Q.E.D. 2
//    println((-2.5).toInt()) // 소수점 부분 제거 후 정수로 변환. Q.E.D. -2
//    println(1_000_000_000_000.toFloat().toLong()) // 999999995904

//    세미콜론 있으면 좋음
//    val hasError = false;
//    val testPass = true;
//
//    println("$hasError $testPass") // false true

//    할 필요 없지만 그냥 해봄
//    val a = 1
//    val b = 2
//
//    println(a == 1 || b != 1) //true
//    println(a >= 1 && b < 3) // true
//    println(a < 1 || b < 1) // false
//    println(a > b) // false

//    val a = 1
//    val b = 2L

//    println(a == b) // Kotlin: Operator '==' cannot be applied to 'kotlin.Int' and 'kotlin.Long'.
//                    // int 와 long 이므로 비교할 수 없음
//    println(a.toLong() == b) // a를 long 으로 바꾸면서 비교 가능 그러나 False

//    NaN은 다른 NaN과 같을 수 없다고 함. 신기하네..
//    println(Double.NaN) // NaN
//    println(Double.NaN == Double.NaN)              // false
//    println(Double.NaN != Double.NaN)              // true
//    println(Double.NaN <= Double.NaN)              // false
//    println(Double.NaN < Double.POSITIVE_INFINITY) // false
//    println(Double.NaN > Double.NEGATIVE_INFINITY) // false

//    val set = sortedSetOf(Double.NaN, Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, 0.0)
//    println(set) // [-Infinity, 0.0, Infinity, NaN] 순서 대로 정렬 됨. 뭔가 신기함 이 맛에 새로운 언어 배우나 봄.
}