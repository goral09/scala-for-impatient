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
	}
	
	val chatter = new Network                 //> chatter  : NestedClasses.Network = NestedClasses$Network@1551a94
	val facb = new Network                    //> facb  : NestedClasses.Network = NestedClasses$Network@843fce
	
	val alice = chatter.connectTo("Alice")    //> alice  : NestedClasses.chatter.Member = Alice is nested inside class NestedC
                                                  //| lasses$Network
	val brian = chatter.connectTo("Brian")    //> brian  : NestedClasses.chatter.Member = Brian is nested inside class NestedC
                                                  //| lasses$Network
	
	alice.contacts += brian                   //> res0: NestedClasses.alice.contacts.type = ArrayBuffer(Brian is nested inside
                                                  //|  class NestedClasses$Network)
	
	val barney = facb.connectTo("Barney")     //> barney  : NestedClasses.facb.Member = Barney is nested inside class NestedCl
                                                  //| asses$Network
	
}