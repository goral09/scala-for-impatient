
object factoria {
	implicit class FactorialInt(val n: Int) extends AnyVal {
		def ! : BigInt = (BigInt(1) to n).product
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(146); val res$0 = 
	
	(40!)/((20!)*(20!));System.out.println("""res0: scala.math.BigInt = """ + $show(res$0))}
}
