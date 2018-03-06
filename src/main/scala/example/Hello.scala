package example
import com.abhi.JSONEntry
import java.io._

object Hello extends App {
  val jsonEntry = JSONEntry(10L, "foo")
  val target = new FileOutputStream(new File("foo.bin"))
  jsonEntry.writeTo(target)
  target.close()
}
