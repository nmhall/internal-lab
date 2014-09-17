object RepeatUntil {
    
    def main(args: Array[String]) {
        var i = 0
        repeat  {
            if ( (i % 2) == 0 )
                println(i)
            i += 1
        } until(i > 9)        
    }    
}

