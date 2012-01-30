// vim: set ts=4 sw=4 et:
import org.apache.hadoop._
object WordCount {
    def main(args: Array[String]) {
        val (h, remainingArgs) = Hadoop.fromArgs(args, new Path("output"))
        val words= for ( (offset, line) <- h.loadLines(remainingArgs);
                          word <- line.split(" \n\r\t\f"))
                          yield(word,1)
                          val sums = words.hreduce { (word, iter) => 
                              (word, iter.reduceLeft(_+_))
                              }
                              sums.elements foreach println
                          }
                      }
                  

