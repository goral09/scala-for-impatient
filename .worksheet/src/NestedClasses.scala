import scala.collection.mutable.ArrayBuffer

object NestedClasses {
	class Network {
		self =>
			class Member(val name: String) {
			val contacts = new ArrayBuffer[Member]
			override def toString = s"${name} is nested inside " + self.getClass()
		}
		
		private val members = new ArrayBuffer[Member]
		def connectTo(m: String) = {
			var newMember = new Member(m)
			members += newMember
			newMember
		}
	};import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(438); 
	
	val chatter = new Network;System.out.println("""chatter  : NestedClasses.Network = """ + $show(chatter ));$skip(24); 
	val facb = new Network;System.out.println("""facb  : NestedClasses.Network = """ + $show(facb ));$skip(42); 
	
	val alice = chatter.connectTo("Alice");System.out.println("""alice  : NestedClasses.chatter.Member = """ + $show(alice ));$skip(40); 
	val brian = chatter.connectTo("Brian");System.out.println("""brian  : NestedClasses.chatter.Member = """ + $show(brian ));$skip(27); val res$0 = 
	
	alice.contacts += brian;System.out.println("""res0: NestedClasses.alice.contacts.type = """ + $show(res$0));$skip(41); 
	
	val barney = facb.connectTo("Barney");System.out.println("""barney  : NestedClasses.facb.Member = """ + $show(barney ))}
	
}
