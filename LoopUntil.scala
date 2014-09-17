object LoopUntil {

    def main(args: Array[String]) {
        var i = 0
        loop_until (i > 9) {
            if ( (i % 2) == 0 )
                println(i)
            i += 1
        }
    }    
}

